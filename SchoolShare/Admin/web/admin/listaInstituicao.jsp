<%@page import="java.util.List"%>
<%@page import="web.java.classe.InstituicaoBean"%>
<%@page import="web.java.dao.InstituicaoDAO"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="/master/master.jsp" %>

<section class="content-header">
    <h1>Lista de Instituições <small>Tabela</small></h1>
    <ol class="breadcrumb">
        <li><a href="/index.jsp"><i class="fa fa-home"></i> Home</a></li>
        <li><a href="/admin/instituicaoIndex.jsp"><i class="fa fa-home"></i> Instituições</a></li>
        <li class="active">Ver Lista</li>
    </ol>
</section>

<section class="content">
    <div class="box">
        <div class="box-header">
            <h3 class="box-title">Lista de Instituições Registradas</h3>
        </div>
        <div class="box-body">
            <%
                List<InstituicaoBean> instituicao = new InstituicaoDAO().listaInstituicao();
            %>
            <table id="tabelaInstituicao" class="table table-bordered table-hover">
                <thead>
                    <tr>
                        <th>#</th>
                        <th>Instituição</th>
                        <th>Endereço</th>
                        <th>CEP</th>
                        <th>Bairro</th>
                        <th>Cidade - Estado</th>
                        <th><i class="fa fa-gear"></i></th>
                    </tr>
                </thead>
                <tbody>
                    <%
                    int counter = 1;

                    for (InstituicaoBean listagem : instituicao) {
                    %>
                    <tr>
                        <td><%=counter++%></td>
                        <td><%=listagem.getInstituicao()%></td>
                        <td><%=listagem.getEndereco()%>&nbsp;-&nbsp;<%=listagem.getNumero()%></td>
                        <td><%=listagem.getCep()%></td>
                        <td><%=listagem.getBairro()%></td>
                        <td><%=listagem.getCidade()%> - <%=listagem.getEstado()%></td>
                        <td><a class="btn-custom btn-app-custom" href="/admin/editaInstituicao.jsp?id=<%=listagem.getId()%>">
                            <i class="fa fa-edit">
                            </i> Editar</a>
                        </td>
                    </tr>
                    <% } %>
                    </tbody>
            </table>
        </div>
    </div>
</section>

<%@include file="/master/rodape.jsp" %>
