/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String fInput = request.getParameter("fNum");
        String sInput = request.getParameter("sNum");
        
        request.setAttribute("fNum", fInput);
        request.setAttribute("sNum", sInput);
        
        request.setAttribute("message", "---");
        
        if (fInput == null && sInput == null || fInput.equals("") && sInput.equals("")){ 
             request.setAttribute("message", "---");
             
             getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);

        } else if (fInput == null || fInput.equals("") || sInput == null || sInput.equals("")) {
            request.setAttribute("message", "invalid");
            
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        } else {
            request.setAttribute("message", "Banan");
        }
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
