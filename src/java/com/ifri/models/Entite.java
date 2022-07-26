/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifri.models;
import java.util.List;
import java.util.ArrayList;

public class Entite {
    private String nomEntite;
	private List<Equipement> listEquipements;
        public Entite(String nomEntite){
            this.nomEntite = nomEntite;
        }
	public String getNomEntite() {
		return nomEntite;
	}
	public void setNomEntite(String nomEntite) {
		this.nomEntite = nomEntite;
	}
	public List<Equipement> getListEquipements() {
		return listEquipements;
	}
	public void setListEquipements(List<Equipement> listEquipements) {
		this.listEquipements = listEquipements;
	}
        
        public static List<Entite> demoEntites(){
            List<Entite> entites = new ArrayList();
            Entite entite1 = new Entite("Direction");
            Entite entite2 = new Entite("Sécrétariat");
            Entite entite3 = new Entite("Chef scolarité");
            entites.add(entite1);
            entites.add(entite2);
            entites.add(entite3);
            return entites;
        }
        
        public static Entite demoEntite(String nom){
            Entite entite = new Entite(nom);
            Equipement equipement1 = new Equipement("Ordinateur MAC", "Materiel", "25-02-2019", false, 800000);
            Equipement equipement2 = new Equipement("Tablette Apple", "Materiel", "22-02-2020", false, 500000);
            List<Equipement> equipements = new ArrayList();
            equipements.add(equipement1);
            equipements.add(equipement2);
            entite.setListEquipements(equipements);
            return entite;
        }
}
