/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.ifri.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.ifri.models.Entite;
import com.ifri.models.Equipement;
import java.util.List;

@WebServlet(name = "Livraison", urlPatterns = {"/Livraison"})
public class Livraison extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Equipement> equipementsNonLivres;
        equipementsNonLivres = Equipement.demoEquipements();
        
        request.setAttribute("equipementsNonLivres", equipementsNonLivres);
        
        this.getServletContext().getRequestDispatcher("/WEB-INF/livraison.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

}
