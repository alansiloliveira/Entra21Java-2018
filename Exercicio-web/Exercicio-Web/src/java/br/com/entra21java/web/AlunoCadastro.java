package br.com.entra21java.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alunos
 */
@WebServlet(urlPatterns = "/alunos/cadastro")
public class AlunoCadastro extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Alunos - Cadastros</title>");
        out.println("<link rel='stylesheet' type='text/css' href='/Exercicio-Web/bootstrap/css/bootstrap.css'>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='container'>");
        out.println("<form action='/Exercicio-Web/alunos/store' method='post'> ");
        out.println("<div id='div-campo-codigo' class='form-group'>");
        out.println("<label for='campo-codigo'>Código de matricula<span class='text-danger font-weigh-bold'>*</label>");
        out.println("<input type='text' class='form-control' id='campo-codigo' name='codigo_matricula' required='required'>");
        out.println("</div>");
        out.println("<div id='div-campo-nome' class='form-group'>");
        out.println("<label for='campo-nome'>Nome<span class='text-danger font-weigh-bold'>*</label>");
        out.println("<input type='text' class='form-control' id='campo-nome' name='nome' required='required'>");
        out.println("</div>");
        out.println("<div id='div-campo-nota1' class='form-group'>");
        out.println("<label for='campo-nota1'>Nota 1</label>");
        out.println("<input type='text' class='form-control' id='campo-nota1' name='nota1'>");
        out.println("</div>");
        out.println("<div id='div-campo-nota2' class='form-group'>");
        out.println("<label for='campo-nota2'>Nota 2</label>");
        out.println("<input type='text' class='form-control' id='campo-nota2' name='nota2'>");
        out.println("</div>");
        out.println("<div id='div-campo-nota3' class='form-group'>");
        out.println("<label for='campo-nota3'>Nota 3</label>");
        out.println("<input type='text' class='form-control' id='campo-nota3' name='nota3'>");
        out.println("</div>");
        out.println("<div id='div-campo-frequencia' class='form-group'>");
        out.println("<label for='campo-frequecia'>Frequencia<span class='text-danger font-wheigh-bold'>*</label>");
        out.println("<input type='text' class='form-control' id='campo-frequencia' name='frequencia' required='required'>");
        out.println("</div>");
        out.println("<input class='btn btn-success' type='submit' value='Cadastrar'>");
        out.println("</form>");
        out.println("</div>	");
        out.println("</body>");
        out.println("</html>");
    }

}
