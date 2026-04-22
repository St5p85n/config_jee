package com.gl.demo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/client")
public class ClientServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Etudiant> etuds = new ArrayList<>();
        Etudiant et1 = new Etudiant();
        et1.setNom("Diop");
        et1.setPrenom("Alpha");
        Etudiant et2 = new Etudiant();

        et2.setNom("BaDa");
        et2.setPrenom("Hm");
        etuds.add(et1);
        etuds.add(et2);
        request.setAttribute("etuds", etuds);
        log("Utilisateur d'utilisateur : " + et2.getPrenom()+"Bien ajoute");
        request.getRequestDispatcher("client.jsp").forward(request, response);
    }
}
