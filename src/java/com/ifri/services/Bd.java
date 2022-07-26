/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifri.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import com.ifri.models.Equipement;
import com.ifri.models.Entite;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Bd {
    private Connection connexion;
    
    private void loadDatabase() { 
        // Chargement du driver
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
        	System.out.println(" \n \n bbbbbbbbbbbbb");
        }

        try {
        	connexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/ifriEquipemnt1", "root", "");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("aaaaaaaaaaaaaaa");
        }
    }
    
    public void ajouterEquipement(Equipement equipement) {
        loadDatabase();
        
        try {
            PreparedStatement preparedStatement = connexion.prepareStatement("INSERT INTO Equipements(nomEquipement, categoryEquipement, dateAchat, etreLivre) VALUES(?, ?, ?, ?);");
            preparedStatement.setString(1, equipement.getNomEquipement());
            preparedStatement.setString(2, equipement.getCategoryEquipement());
            preparedStatement.setString(3, equipement.getDateAchat());
            preparedStatement.setString(4, equipement.getEtreLivre()== true ? "1" : "0");
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public List<Equipement> recupererToutEquipement() {
        List<Equipement> equipements = new ArrayList<Equipement>();
        Statement statement = null;
        ResultSet resultat = null;
        
        loadDatabase();
        
        try {
            statement = connexion.createStatement();

            //Exécution de la requête
            resultat = statement.executeQuery("SELECT nomEquipement,categoryEquipement, dateAchat, etreLivre, prixEquipement  FROM Equipements;");
            

            // Récupération des données
            while (resultat.next()) {
                
                Equipement equipement = new Equipement(resultat.getString("nomEquipement"), resultat.getString("categoryEquipementt"), 
                        resultat.getString("dateAchat"), resultat.getString("nomEquipement").equals("1") ? true : false, 
                        Double.parseDouble(resultat.getString("prixEquipement")));
                equipements.add(equipement);
           
            }
        } catch (SQLException e) {
        } finally {
            // Fermeture de la connexion
            try {
                if (resultat != null)
                    resultat.close();
                if (statement != null)
                    statement.close();
                if (connexion != null)
                    connexion.close();
            } catch (SQLException ignore) {
            }
        }
        
        return equipements;
    }
    
    public List<Equipement> recupererEquipementNonLivre() {
        List<Equipement> equipements = new ArrayList<Equipement>();
        Statement statement = null;
        ResultSet resultat = null;
        
        loadDatabase();
        
        try {
            statement = connexion.createStatement();

            // Exécution de la requête
            resultat = statement.executeQuery("SELECT nomEquipement,categoryEquipement, dateAchat, etreLivre, prixEquipement  FROM Equipements WHERE etreLivre=0;");

            // Récupération des données
            while (resultat.next()) {
                
                Equipement equipement = new Equipement(resultat.getString("nomEquipement"), resultat.getString("categoryEquipement"), 
                        resultat.getString("dateAchat"), resultat.getString("etreLivre").equals("1") ? true : false, 
                        Double.parseDouble(resultat.getString("prixEquipement")) );
                equipements.add(equipement);
           
            }
        } catch (SQLException e) {
        } finally {
            // Fermeture de la connexion
            try {
                if (resultat != null)
                    resultat.close();
                if (statement != null)
                    statement.close();
                if (connexion != null)
                    connexion.close();
            } catch (SQLException ignore) {
            }
        }
        
        return equipements;
    }
    
    public List<Equipement> recupererEquipementLivre() {
        List<Equipement> equipements = new ArrayList<Equipement>();
        Statement statement = null;
        ResultSet resultat = null;
        
        loadDatabase();
        
        try {
            statement = connexion.createStatement();

            // Exécution de la requête
            resultat = statement.executeQuery("SELECT nomEquipement,categoryEquipement, dateAchat, etreLivre, prixEquipemnt  FROM Equipements WHERE "
                    + "etreLivre=1;");

            // Récupération des données
            while (resultat.next()) {
                
                Equipement equipement = new Equipement(resultat.getString("nomEquipement"), resultat.getString("categoryEquipementt"), 
                        resultat.getString("dateAchat"), resultat.getString("nomEquipement").equals("1") ? true : false, 
                        Double.parseDouble(resultat.getString("prixEquipement")));
                equipements.add(equipement);
           
            }
        } catch (SQLException e) {
        } finally {
            // Fermeture de la connexion
            try {
                if (resultat != null)
                    resultat.close();
                if (statement != null)
                    statement.close();
                if (connexion != null)
                    connexion.close();
            } catch (SQLException ignore) {
            }
        }
        
        return equipements;
    }
    
    public String rechercherIdEquipement(Equipement equipement) {
        loadDatabase();
        Statement statement = null;
        ResultSet resultat = null;
        String id = "";
        try {
            statement = connexion.createStatement();

            // Exécution de la requête
            resultat = statement.executeQuery("SELECT idEquipement  FROM Equipements WHERE nomEquipement = " + equipement.getNomEquipement() + " etreLivre=1;");

            // Récupération des données
            while (resultat.next()) {
                id = resultat.getString("idEquipement");
            }
        } catch (SQLException e) {
        } finally {
            // Fermeture de la connexion
            try {
                if (resultat != null)
                    resultat.close();
                if (statement != null)
                    statement.close();
                if (connexion != null)
                    connexion.close();
            } catch (SQLException ignore) {
                
            }
            }
        return id;
        
    }
    
    public String rechercherIdEntite(Entite entite) {
        loadDatabase();
        Statement statement = null;
        ResultSet resultat = null;
        String id = "";
        try {
            statement = connexion.createStatement();

            // Exécution de la requête
            resultat = statement.executeQuery("SELECT idEntite  FROM Entite WHERE nomEntite = " + entite.getNomEntite() + ";");

            // Récupération des données
            while (resultat.next()) {
                id = resultat.getString("idEntite");
            }
        } catch (SQLException e) {
        } finally {
            // Fermeture de la connexion
            try {
                if (resultat != null)
                    resultat.close();
                if (statement != null)
                    statement.close();
                if (connexion != null)
                    connexion.close();
            } catch (SQLException ignore) {
                
            }
            }
        return id;
        
    }
    
    
    public void ajouterLivraison(Entite entite, Equipement equipement) {
        loadDatabase();
        String idEntite = rechercherIdEntite(entite);
        String idEquipement = rechercherIdEquipement(equipement);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        String date = dtf.format(LocalDateTime.now());
        
        try {
            PreparedStatement preparedStatement = connexion.prepareStatement("INSERT INTO Livraison(idEquipement, idEntite, dateLivraison) VALUES(?, ?, ?);");
            preparedStatement.setString(1, idEquipement);
            preparedStatement.setString(2, idEntite);
            preparedStatement.setString(3, date);
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        try {
            PreparedStatement preparedStatement = connexion.prepareStatement("UPDATE Equipement SET etreLivre=1 entiteLivre=? WHERE idEquipement=?;");
            preparedStatement.setString(3, idEquipement);
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    
    
    
    
    
    public List<Equipement> recupererEquipementParEntite(Entite entite) {
        List<Equipement> equipements = new ArrayList<Equipement>();
        Statement statement = null;
        ResultSet resultat = null;
        
        loadDatabase();
        
        try {
            statement = connexion.createStatement();

            // Exécution de la requête
            resultat = statement.executeQuery("SELECT nomEquipement,categoryEquipemen,dateAchat, prixEquipement FROM (Entite INNER JOIN Livraison ON Equipement.idEquipement=Livraison.idEquipement) "
                    + "INNER JOIN Entite ON Livraison.idEntite=Entite.idEntite WHERE nomEntite="+entite.getNomEntite()+";");

            // Récupération des données
            while (resultat.next()) {
                
                Equipement equipement = new Equipement(resultat.getString("nomEquipement"), resultat.getString("categoryEquipement"), resultat.getString("dateAchat"), true, Double.parseDouble(resultat.getString("prixEquipement")));
                equipements.add(equipement);
           
            }
        } catch (SQLException e) {
        } finally {
            // Fermeture de la connexion
            try {
                if (resultat != null)
                    resultat.close();
                if (statement != null)
                    statement.close();
                if (connexion != null)
                    connexion.close();
            } catch (SQLException ignore) {
            }
        }
        
        return equipements;
    }
    
}