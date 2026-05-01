package controllers;

import views.authView;
import models.AuthModel;

public class authControllers {

    private authView vista;
    private AuthModel modelo;

    public authControllers() {
        vista = new authView();
        modelo = new AuthModel();
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
}
