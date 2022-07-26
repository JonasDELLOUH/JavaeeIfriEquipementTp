/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifri.models;
import javax.servlet.http.HttpServletRequest;

public class ConnectionForm {
	
	public boolean verifierIdentifiants(HttpServletRequest request) {
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		
		if(password.equals(login + "123")) {
		    return true;
		} else {
			return false;
		}
	}

}
