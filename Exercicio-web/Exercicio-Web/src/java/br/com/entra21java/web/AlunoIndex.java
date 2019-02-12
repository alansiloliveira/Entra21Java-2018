/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.entra21java.web;

import br.com.entra21java.bean.AlunosBean;
import br.com.entra21java.dao.AlunosDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alunos
 */
@WebServlet(urlPatterns = "/alunos")
public class AlunoIndex extends HttpServlet {

    private PrintWriter out;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<AlunosBean> alunos = new AlunosDAO().obterTodos();
        out = resp.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Tabela de Notas</title>");
        out.println("<link rel='stylesheet' type='text/css' " + "href='bootstrap/css/bootstrap.css'>");
        out.println("<link rel='stylesheet' href='https://use.fontawesome.com/releases/v5.2.0/css/all.css' integrity='sha384-hWVjflwFxL6sNzntih27bfxkr27PmbbK/iSvJ+a4+0owXq79v+lsFkW54bOGbiDQ' crossorigin='anonymous'>");
        
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='container-fluid'>");
        out.println("<div class='row'>");
        out.println("<div class='col-md-12'>");
        out.println("<h3 class='text-center'>Lista de Alunos</h3>");
        out.println("</div></div>");
        out.println("<div class='row'>");
        out.println("<div class='col-md-12 offset-md-10'></div>");
        out.println("<a href='/Exercicio-Web/alunos/cadastro' class='btn btn-primary float-right'><i class='fa fa-user'></i>Novo Aluno</a>");
        out.println("</div>");
        out.println("</div>");
        gerarTabela(alunos);
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");

    }

    private void gerarTabela(List<AlunosBean> aluno) {

        out.println("<div class='row mt-3'>");
        out.println("<div class='col-md-8 offset-md-2'>");
        out.println("<table class='table table-striped table-hover'>");
        out.println("<thead>");
        out.println("<tr>");
        out.println("<th>Código de Matricula</th>");
        out.println("<th>Nome</th>");
        out.println("<th>1º trimestre</th>");
        out.println("<th>2º trimestre</th>");
        out.println("<th>3º trimestre</th>");
        out.println("<th>Frequência</th>");
        out.println("<th>Situação</th>");
        out.println("<th>Ação</th>");
        out.println("</tr>");
        out.println("<tbody>");

        for (AlunosBean alunos : aluno) {
            out.println("<tr>");
            out.println("<td>" + alunos.getCodigo_matricula() + "</td>");
            out.println("<td>" + alunos.getNome() + "</td>");
            out.println("<td>" + alunos.getNota1() + "</td>");
            out.println("<td>" + alunos.getNota2() + "</td>");
            out.println("<td>" + alunos.getNota3() + "</td>");
            out.println("<td>" + alunos.getFrequencia() + "</td>");
            out.println("<td></td>");
        }
        out.println("</thead>");
        out.println("</tbody>");
        out.println("<tfoot>");
        out.println("<tr>");
        out.println("<th>Código de matricula</th>");
        out.println("<th>Nome</th>");
        out.println("<th>1º trimestre</th>");
        out.println("<th>2º trimestre</th>");
        out.println("<th>3º trimestre</th>");
        out.println("<th>Frequência</th>");
        out.println("<th>Situação</th>");
        out.println("<th>Ação</th>");
        out.println("</tr>");
        out.println("</tfoot>");
        out.println("</table>");
        out.println("</div>");
        out.println("</div>");
    }

}
