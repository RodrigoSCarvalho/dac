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
                msg = "Al??, ";
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
            out.println("<h2>" + msg + "</h2>");
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
        String onde = "";

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
                onde = "Portugal - Mo??ambique - Angola - Timor Leste - Guin??-Bissau - Guin?? Equatorial - Cabo Verde - S??o Tom?? e Pr??ncipe - Macau - Brasil";
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
                onde = "Austr??lia - Bahamas - Estados Unidos - Granada - Guiana - Inglaterra - Esc??cia - Gales - Irlanda - Jamaica - Nova Zel??ndia - Trinidad <br><br> "
                        + "Pa??ses com o Ingl??s como l??ngua oficial mas n??o nativa:  <br><br> "
                        + "Botsuana - Fiji - G??mbia - Gana - Lib??ria - Maur??cio - Nig??ria - Rod??sia - Serra Leoa - Uganda - Z??mbia";
                break;

            case "fr":
                if ("sr".equals(tratamento)) {
                    if (time >= 05 && time < 12) {
                        msg = "Bonjour, Monsieur ";
                    } else if (time >= 12 && time < 18) {
                        msg = "Bon apr??s-midi, Monsieur ";
                    } else {
                        msg = "Bonne nuit, Monsieur. ";
                    }
                } else if ("sra".equals(tratamento)) {
                    if (time >= 05 && time < 12) {
                        msg = "Bonjour, Mme. ";
                    } else if (time >= 12 && time < 18) {
                        msg = "Bon apr??s-midi, Mme. ";
                    } else {
                        msg = "Bonne nuit, Mme. ";
                    }
                } else {
                    if (time >= 05 && time < 12) {
                        msg = "Bonjour, ";
                    } else if (time >= 12 && time < 18) {
                        msg = "Bon apr??s-midi, ";
                    } else {
                        msg = "Bonne nuit, ";
                    }
                   
                }
                onde = "Benin - Burkina Faso - Rep??blica do Congo - Rep??blica Democr??tica do Congo - Costa do Marfim - Fran??a metropolitana e C??rsega "
                        + "- Gab??o - Guin??e - Mali - Senegal - Togo - M??naco - Niger";
                break;
            case "de":
                if ("sr".equals(tratamento)) {
                    if (time >= 05 && time < 12) {
                        msg = "Guten Morgen, Herr ";
                    } else if (time >= 12 && time < 18) {
                        msg = "Guten Tag, Herr ";
                    } else {
                        msg = "Gute Nacht, Herr ";
                    }
                } else if ("sra".equals(tratamento)) {
                    if (time >= 05 && time < 12) {
                        msg = "Guten Morgen, Frau ";
                    } else if (time >= 12 && time < 18) {
                        msg = "Guten Tag, Frau ";
                    } else {
                        msg = "Gute Nacht, Frau ";
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
                onde = "Alemanha - ??ustria - B??lgica - Luxemburgo - Su????a - Liechtenstein";
                break;

            case "ru":
                if ("sr".equals(tratamento)) {
                    if (time >= 05 && time < 12) {
                        msg = "???????????? ????????, ???????????? ";
                    } else if (time >= 12 && time < 18) {
                        msg = "???????????? ????????, ???????????? ";
                    } else {
                        msg = "?????????????????? ????????, ???????????? ";
                    }
                } else if ("sra".equals(tratamento)) {
                    if (time >= 05 && time < 12) {
                        msg = "???????????? ????????, ??-???? ";
                    } else if (time >= 12 && time < 18) {
                        msg = "???????????? ????????, ??-???? ";
                    } else {
                        msg = "?????????????????? ????????, ??-???? ";
                    }
                } else {
                    if (time >= 05 && time < 12) {
                        msg = "???????????? ????????, ";
                    } else if (time >= 12 && time < 18) {
                        msg = "???????????? ????????, ";
                    } else {
                        msg = "?????????????????? ????????, ";
                    }
                }
                onde = "R??ssia - Bielorr??ssia - Ucr??nia - Cazaquist??o - Quirguist??o";
                break;

            case "tp":
                if ("sr".equals(tratamento)) {
                    if (time >= 05 && time < 12) {
                        msg = "T??a nde ko'ema, Ta?? ";
                    } else if (time >= 12 && time < 18) {
                        msg = "T??a nde karuka, Ta?? ";
                    } else {
                        msg = "T??a nde pytuna, Ta?? ";
                    }
                } else if ("sra".equals(tratamento)) {
                    if (time >= 05 && time < 12) {
                        msg = "T??a nde ko'ema, Tap?? ";
                    } else if (time >= 12 && time < 18) {
                        msg = "T??a nde karuka, Tap?? ";
                    } else {
                        msg = "T??a nde pytuna, Tap?? ";
                    }
                } else {
                    if (time >= 05 && time < 12) {
                        msg = "T??a nde ko'ema, ";
                    } else if (time >= 12 && time < 18) {
                        msg = "T??a nde karuka, ";
                    } else {
                        msg = "T??a nde pytuna, ";
                    }
                }
                onde = "O Tupi ou Tupinamb?? era falado pelas 5 principais etnias: <br>"
                        + "Tupinamb??s, Tupiniquins, Caet??s, Potiguaras e Tamoios.";
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
            out.println("<p>Servlet HelloServlet</p>");
            out.println("<h1>" + msg + "</h1>");
            out.println("<br><h4>?? a l??ngua oficial dos seguintes pa??ses:</h4>");
            out.println("<p>" + onde + "</p>");
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
