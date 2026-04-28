package controllers;

import views.authView;

public class authControllers {
	private authView vista;
	
	public authControllers() {
		vista = new authView();
	}
	
	public void showLogin() {
		vista.loginView();
	}
	
	public void showRegister() {
		vista.registerView();
	}
}
