package control;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import model.Application;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class MyServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {

        String vueFinale = "index.jsp";

        // TODO: a future doAction() method will be call from here to choose which JSP
        // page to display
        doAction(request);
        request.getRequestDispatcher(vueFinale).forward(request, response);

    }

    private String doAction(HttpServletRequest request) {

        String vueFinale = "index.jsp";

        return vueFinale;
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }
}
