/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifri.models;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author dellouh
 */
public class Equipement {
	private String nomEquipement;
	private String categoryEquipement;
	private String dateAchat;
	private boolean etreLivre;
        private int nombreEquipement;
        private double prix;
        
        public void setPrix(double prix){
            this.prix = prix;
        }
        
        public double getPrix(){
            return this.prix;
        }
        
        public Equipement(String nomEquipement, String categoryEquipement, String dateAchat, boolean etreLivre, double prix){
            this.nomEquipement = nomEquipement;
            this.categoryEquipement = categoryEquipement;
            this.dateAchat = dateAchat;
            this.etreLivre = etreLivre;
            this.prix = prix;
        }
        
        public void setNombreEquipement(int nombreEquipement){
            this.nombreEquipement  = nombreEquipement;
        }
        
        public int getNombreEquipemnt(){
            return this.nombreEquipement;
        }
        
        public void ajouterNombreEquipement(){
            this.nombreEquipement++;
        }
	
	public String getNomEquipement() {
		return nomEquipement;
	}
	public void setNomEquipement(String nomEquipement) {
		this.nomEquipement = nomEquipement;
	}
	public String getCategoryEquipement() {
		return categoryEquipement;
	}
	public void setCategoryEquipement(String typeEquipement) {
		this.categoryEquipement = typeEquipement;
	}
	public String getDateAchat() {
		return dateAchat;
	}
	public void setDateAchat(String dateAchat) {
		this.dateAchat = dateAchat;
	}
	public boolean getEtreLivre() {
		return etreLivre;
	}
	public void setEtreLivre(boolean etreLivre) {
		this.etreLivre = etreLivre;
	}
        
        public static List<Equipement> demoEquipements(){
            Equipement equipement1 = new Equipement("Ordinateur", "Materiel", "Lundi", false, 100000);
            Equipement equipement2 = new Equipement("photocopieuse", "Materiel", "Lundi", true, 200000);
            Equipement equipement3 = new Equipement("siteTp", "Logiciel", "Lundi", false, 40000);
            List<Equipement> equipements = new ArrayList();
            equipements.add(equipement1);
            equipements.add(equipement2);
            equipements.add(equipement3);
            return equipements;
        }
        
}
