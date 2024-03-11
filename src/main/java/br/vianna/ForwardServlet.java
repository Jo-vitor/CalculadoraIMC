package br.vianna;

import br.vianna.model.CalculadoraIMC;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/forward")
public class ForwardServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resposta(req, resp);
    }

    private void resposta(HttpServletRequest req, HttpServletResponse resp) {
        String altura = req.getParameter("altura");
        String peso = req.getParameter("peso");

        CalculadoraIMC cIMC = new CalculadoraIMC();
        cIMC.setAltura(Integer.parseInt(altura));
        cIMC.setPeso(Integer.parseInt(peso));

        RequestDispatcher rd = req.getRequestDispatcher("resposta.jsp");
        req.setAttribute("calc", cIMC.calcularIMC());

        try {
            rd.forward(req, resp);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resposta(req, resp);
    }
}
