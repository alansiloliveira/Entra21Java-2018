<%@page import="java.io.FilenameFilter"%>
<%@page import="java.util.Properties"%>
<%@page import="java.net.URL"%>
<%@page import="java.io.File"%>
<%@page import="java.nio.file.Paths"%>
<%@page import="java.nio.file.Path"%>
<%@page import="web.java.directory.DirFolderAccess"%>
<%@page import="web.java.conexao.Banco"%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>SchoolShare Login</title>
        <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
        <link rel="stylesheet" href="/css/form-login-ident.css">
        <script src="js/jquery/jquery-3.3.1.min.js" type="text/javascript"></script>
        <script src="js/form-login-validation.js" type="text/javascript"></script>
        <script>
            window.onload = function () {
                $('#campoCredLogin').focus();
            };
        </script>

        <%
            String message = "", asteriscs = "", valida = "";

            valida = (String) request.getParameter("valida");

            if (valida != null) {
                if (valida.equals("false")) {
                    message += "<span id=\"errormessage\" class=\"msg-span\">";
                    message += "<b>Usu�rio</b> ou <b>Senha</b> est� incorreto";
                    message += "</span>";
                } else if (valida.equals("null")) {
                    message += "<span id=\"errormessage\" class=\"msg-span\">";
                    message += "<b>Por favor, preencha com suas credenciais</b>";
                    message += "</span>";
                }
                asteriscs = "<label style=\"color:#ff3333;\">&nbsp;*</label>";
            } else {
                message = "";
                asteriscs = "";
            }
        %>
    </head>
    <body>
        <div class="global-login-wrapper">
            <div class="login-status">
                <div class="col-md-16">
                    <form action="/validaLogin" method="POST" class="form-login" id="login-authenticate">
                        <div class="form-control-login">
                            <header class="wrapper-login-top">
                                <nav class="nav-login-logo">
                                    <label>Bem-vindo ao </label><b>School</b>&nbsp;Share
                                </nav>
                                <b>Portal Administrador</b>
                            </header>

                            <div class="wrapper-login-center">
                                <%=message%>

                                <div class="center-components">
                                    <label for="campoCredLogin">Usu�rio<%=asteriscs%></label>
                                    <input type="text" class="form-control" id="campoCredLogin" name="fl-cred-login">
                                </div>

                                <div class="center-components">
                                    <label for="campoCredSenha">Senha<%=asteriscs%></label>
                                    <input type="password" class="form-control" id="campoCredSenha" name="fl-cred-password">
                                </div>

                                <div class="center-components">
                                    <button name="submitButtonLogin" id="goSubmitLogin">Conectar</button>
                                </div>

                                <div class="login-footer">
                                    <strong>Entrar como&nbsp;<a href="/loginProfessor">Professor</a></strong>
                                    <strong>&nbsp;|&nbsp;&nbsp;Entrar como&nbsp;<a href="/loginAluno">Aluno</a></strong>
                                </div>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>

        <footer class="wrapper-login-footer">
            <div class="wrapper-version">
                <b>Vers�o Beta</b> 1.0.0
            </div>

            <b>2018 SchoolShare.</b>&nbsp;<strong>Conhe�a nosso <a href="#popup-login-msg">Github</a></strong>

            <div id="popup-login-msg" class="overlay">
                <div class="popup">
                    <h2>School&nbsp;<b>Share</b></h2>
                    <a class="close" href="#">&times;</a>
                    <div class="content">
                        � um sistema totalmente on-line para pequenas entidades
                        de ensino, cujo objetivo fornece um ambiente web para 
                        armazenamento e compartilhamento de arquivos de materiais 
                        institucionais entre professores e alunos.
                        <div class="content-info">
                            <b>GitHub</b>
                            <label>alansiloliveira </label>
                            <label>DaianaBarbettaM </label>
                            <label>MarcioAugustoInkster </label>
                            <label>Borbari </label>
                        </div>
                    </div>
                </div>
            </div>
        </footer>
    </body>
</html>
