package web.java.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import web.java.classe.TurmaBean;
import web.java.dao.TurmaDAO;
import web.java.mapping.DataFormatter;

/**
 *
 * @author Marcio Augusto Schlosser
 */
@WebServlet(urlPatterns = "/registroTurma")

public class ValidaTurma extends HttpServlet {
    private static PrintWriter out;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        out = response.getWriter();
        
        DataFormatter df = new DataFormatter();
        
        try {
            TurmaBean turma = new TurmaBean();

            int nomeProfessor = Integer.parseInt(request.getParameter("turmaProfessor")),
                nomeCurso = Integer.parseInt(request.getParameter("turmaCurso"));
            String nomeTurma = request.getParameter("turmaNome"),
                dataInicio = df.dataParaEN(request.getParameter("turmaDataInicio")),
                dataFinal = df.dataParaEN(request.getParameter("turmaDataFinal"));
            short cargaHorario = Short.parseShort(request.getParameter("turmaCargaHora"));
            
            turma.setProfessorId(nomeProfessor);
            turma.setCursoId(nomeCurso);
            turma.setTurma(nomeTurma);
            turma.setDataInicio(dataInicio);
            turma.setDataFinal(dataFinal);
            turma.setCargaHoraria(cargaHorario);
            
            if (TurmaDAO.insereTurma(turma)) {
               response.sendRedirect("/inf/success.jsp");
            } else {
                out.print("<h2 style=\"color:8b0000;\">Cadastro falhou! Tente novamente ou contacte o Administrador</h2>");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
