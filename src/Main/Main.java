package Main;

import javax.swing.JFrame;

import controllers.authControllers;

import java.awt.Color;
import java.awt.Dimension;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Ventana miventana = new Ventana();
		authControllers ac = new authControllers();
		ac.showLogin();
		//ac.showRegister();
		
		
	}

}
