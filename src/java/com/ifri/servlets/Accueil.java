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

import java.util.List;
import com.ifri.models.Equipement;
import com.ifri.models.Entite;
import com.ifri.services.Bd;
import javax.servlet.http.HttpSession;

/**
 *
 * @author dellouh
 */
@WebServlet(name = "Accueil", urlPatterns = {"/Accueil"})
public class Accueil extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //Bd bd = new Bd();
        List<Equipement> equipements;
        List<Entite> entites;
        //equipements = bd.recupererToutEquipement();
        equipements = Equipement.demoEquipements();
        entites = Entite.demoEntites();
        HttpSession session = request.getSession(true);
        session.setAttribute("equipements", equipements);
        session.setAttribute("entites", entites);
        this.getServletContext().getRequestDispatcher("/WEB-INF/Accueil.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

}
