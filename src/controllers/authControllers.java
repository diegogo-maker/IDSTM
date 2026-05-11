package controllers;

import views.authView;
import views.homeView;
import models.AuthModel;

public class authControllers {

    private authView vista;
    private AuthModel modelo;
    private homeView casa;

    public authControllers() {
        vista = new authView();
        modelo = new AuthModel();
        casa = new homeView();
    }

    public void showLogin() {
        vista.loginView(this);
    }

    public void showRegister() {
        vista.registerView(this);
    }

    public boolean login(String user, String pass) {
        return modelo.login(user, pass);
    }
    
    public boolean register(String user, String pass) {
        return modelo.register(user, pass, pass, pass, pass);
    }
    
    public void home() {
    	casa.showHome();
    }
}
