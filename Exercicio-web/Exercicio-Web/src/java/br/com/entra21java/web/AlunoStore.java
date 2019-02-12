/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.entra21java.web;

import br.com.entra21java.bean.AlunosBean;
import br.com.entra21java.dao.AlunosDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alunos
 */
@WebServlet(urlPatterns = "/alunos/store")
public class AlunoStore extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        AlunosBean aluno = new AlunosBean();
        aluno.setCodigo_matricula(req.getParameter("codigo_matricula"));
        aluno.setNome(req.getParameter("nome"));
        aluno.setNota1(Float.parseFloat(req.getParameter("nota1")));
        aluno.setNota2(Float.parseFloat(req.getParameter("nota2")));
        aluno.setNota3(Float.parseFloat(req.getParameter("nota3")));
        aluno.setFrequencia(Byte.parseByte(req.getParameter("frequencia")));
        int codigo = new AlunosDAO().adicionar(aluno);
        
        if(codigo >0){
            resp.sendRedirect("/Exercicio-Web/alunos");
        }
        
    }

}
