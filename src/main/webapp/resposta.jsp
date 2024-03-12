<!DOCTYPE html>
<%@ page import="java.text.DecimalFormat" %>
<%@ page import="java.util.Locale" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="./css/style.css">
    <link rel="stylesheet" href="./css/resposta.css">
</head>
<body>
    <div class="container">

        <%
            Locale.setDefault(Locale.US);
            DecimalFormat dc = new DecimalFormat("0.0");
            double imc = (double)request.getAttribute("calc");
        %>
        <h2 id="imc">Seu IMC: <% out.print( dc.format(imc) ); %> </h2>
        
        <table>
            <tr class="cor-azul">
                <td>IMC</td>
                <td>Classificação</td>
            </tr>
            <tr>
                <td>menor que 18,5</td>
                <td>magreza</td>
            </tr>
            <tr>
                <td>entre 18,5 e 24,9</td>
                <td>saudável</td>
            </tr>
            <tr>
                <td>entre 25,0 e 29,9</td>
                <td>sobrepeso</td>
            </tr>
            <tr>
                <td>entre 30,0 e 39,9</td>
                <td>obesidade</td>
            </tr>
            <tr>
                <td>maior que 40,0</td>
                <td>obesidade grave</td>
            </tr>
        </table>
    </div>
    <script src="./js/script.js"></script>
</body>
</html>