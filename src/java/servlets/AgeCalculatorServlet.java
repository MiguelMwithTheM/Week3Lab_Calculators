package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String aInput = request.getParameter("aNum");
        
        request.setAttribute("aNum", aInput);
           
        if (aInput == null || aInput.equals("")){
            request.setAttribute("message", "You must enter a number.");
            
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            
            //return;
        } else {
           int aNum = Integer.parseInt(aInput);
           
           aNum += 1;
           
           request.setAttribute("message", "Your age next birthday will be " + aNum);
           getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response); 
        }
        
        //getServletContext().getRequestDispatcher("/WEB-INF/showNextBD.jsp").forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
