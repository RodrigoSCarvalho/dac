/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author viter
 */
@WebServlet("/alomundo")
public class HelloServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet HelloServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet HelloServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String msg = "";

        String lang = request.getParameter("lang");
        if (lang == null) {
            lang = "pt";
        }
        switch (lang) {
            case "pt":
                msg = "Alô, ";
                break;
            case "en":
                msg = "Hello, ";
                break;
            case "fr":
                msg = "Bonjour, ";
                break;
        }

        String nome = request.getParameter("nome");

        if (nome == null) {
            nome = "Fulano";
        }

        msg = msg + nome + "!";

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet HelloServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet HelloServlet</h1>");
            out.println("<p>" + msg + "</p>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        request.setCharacterEncoding("UTF-8");
        
        
        String msg = "";

        int time = Integer.parseInt(request.getParameter("time"));
        String lang = request.getParameter("lang");
        String tratamento = request.getParameter("tratamento");

        if (lang == null) {
            lang = "pt";
        }
        switch (lang) {
            case "pt":
                if ("sr".equals(tratamento)) {
                    if (time >= 05 && time < 12) {
                        msg = "Bom dia, Sr. ";
                    } else if (time >= 12 && time < 18) {
                        msg = "Boa tarde, Sr. ";
                    } else {
                        msg = "Boa noite, Sr. ";
                    }
                } else if ("sra".equals(tratamento)) {
                    if (time >= 05 && time < 12) {
                        msg = "Bom dia, Sra. ";
                    } else if (time >= 12 && time < 18) {
                        msg = "Boa tarde, Sra. ";
                    } else {
                        msg = "Boa noite, Sra. ";
                    }
                } else {
                    if (time >= 05 && time < 12) {
                        msg = "Bom dia, ";
                    } else if (time >= 12 && time < 18) {
                        msg = "Boa tarde, ";
                    } else {
                        msg = "Boa noite, ";
                    }
                }
                break;
            case "en":
                if ("sr".equals(tratamento)) {
                    if (time >= 05 && time < 12) {
                        msg = "Good morning, Mr. ";
                    } else if (time >= 12 && time < 18) {
                        msg = "Good afternoon, Mr. ";
                    } else {
                        msg = "Good evening, Mr. ";
                    }
                } else if ("sra".equals(tratamento)) {
                    if (time >= 05 && time < 12) {
                        msg = "Good morning, Mrs. ";
                    } else if (time >= 12 && time < 18) {
                        msg = "Good afternoon, Mrs. ";
                    } else {
                        msg = "Good evening, Mrs. ";
                    }
                } else {
                    if (time >= 05 && time < 12) {
                        msg = "Good morning, ";
                    } else if (time >= 12 && time < 18) {
                        msg = "Good afternoon, ";
                    } else {
                        msg = "Good evening, ";
                    }
                }
                break;

            case "fr":
                if ("sr".equals(tratamento)) {
                    if (time >= 05 && time < 12) {
                        msg = "Bonjour, Monsieur. ";
                    } else if (time >= 12 && time < 18) {
                        msg = "Bon après-midi, Monsieur. ";
                    } else {
                        msg = "Bonne nuit, Monsieur. ";
                    }
                } else if ("sra".equals(tratamento)) {
                    if (time >= 05 && time < 12) {
                        msg = "Bonjour, Mme. ";
                    } else if (time >= 12 && time < 18) {
                        msg = "Bon après-midi, Mme. ";
                    } else {
                        msg = "Bonne nuit, Mme. ";
                    }
                } else {
                    if (time >= 05 && time < 12) {
                        msg = "Bonjour, ";
                    } else if (time >= 12 && time < 18) {
                        msg = "Bon après-midi, ";
                    } else {
                        msg = "Bonne nuit, ";
                    }
                }
                break;
            case "de":
                if ("sr".equals(tratamento)) {
                    if (time >= 05 && time < 12) {
                        msg = "Guten Morgen, Herr. ";
                    } else if (time >= 12 && time < 18) {
                        msg = "Guten Tag, Herr. ";
                    } else {
                        msg = "Gute Nacht, Herr. ";
                    }
                } else if ("sra".equals(tratamento)) {
                    if (time >= 05 && time < 12) {
                        msg = "Guten Morgen, Frau. ";
                    } else if (time >= 12 && time < 18) {
                        msg = "Guten Tag, Frau. ";
                    } else {
                        msg = "Gute Nacht, Frau. ";
                    }
                } else {
                    if (time >= 05 && time < 12) {
                        msg = "Guten Morgen, ";
                    } else if (time >= 12 && time < 18) {
                        msg = "Guten Tag, ";
                    } else {
                        msg = "Gute Nacht, ";
                    }
                }
                break;

            case "ru":
                if ("sr".equals(tratamento)) {
                    if (time >= 05 && time < 12) {
                        msg = "Доброе утро, Мистер. ";
                    } else if (time >= 12 && time < 18) {
                        msg = "Добрый день, Мистер. ";
                    } else {
                        msg = "спокойной ночи, Мистер. ";
                    }
                } else if ("sra".equals(tratamento)) {
                    if (time >= 05 && time < 12) {
                        msg = "Доброе утро, Г-жа. ";
                    } else if (time >= 12 && time < 18) {
                        msg = "Добрый день, Г-жа. ";
                    } else {
                        msg = "спокойной ночи, Г-жа. ";
                    }
                } else {
                    if (time >= 05 && time < 12) {
                        msg = "Доброе утро, ";
                    } else if (time >= 12 && time < 18) {
                        msg = "Добрый день, ";
                    } else {
                        msg = "спокойной ночи, ";
                    }
                }

                break;

            case "tp":
                if ("sr".equals(tratamento)) {
                    if (time >= 05 && time < 12) {
                        msg = "Tîa nde ko'ema, Taá ";
                    } else if (time >= 12 && time < 18) {
                        msg = "Tîa nde karuka, Taá ";
                    } else {
                        msg = "Tîa nde pytuna, Taá ";
                    }
                } else if ("sra".equals(tratamento)) {
                    if (time >= 05 && time < 12) {
                        msg = "Tîa nde ko'ema, Tapê ";
                    } else if (time >= 12 && time < 18) {
                        msg = "Tîa nde karuka, Tapê ";
                    } else {
                        msg = "Tîa nde pytuna, Tapê ";
                    }
                } else {
                    if (time >= 05 && time < 12) {
                        msg = "Tîa nde ko'ema, ";
                    } else if (time >= 12 && time < 18) {
                        msg = "Tîa nde karuka, ";
                    } else {
                        msg = "Tîa nde pytuna, ";
                    }
                }
                break;
        }

        String nome = request.getParameter("nome");

        if ("".equals(nome)) {
            nome = "Fulano";
        }
        System.out.print("Nome: " + nome);
        msg = msg + nome + "!";

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet HelloServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet HelloServlet</h1>");
            out.println("<p>" + msg + "</p>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
