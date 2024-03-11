<!DOCTYPE html>
<%@ page import="java.text.DecimalFormat" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="./css/style.css">
</head>
<body>
    <div class="container">

        <%
            DecimalFormat dc = new DecimalFormat("0.0");
            double imc = (double)request.getAttribute("calc");
        %>
        <h2>Seu IMC: <% out.print( dc.format(imc) ); %> </h2>

    </div>
</body>
</html>