package controllers;

import java.util.ArrayList;

import models.User;
import views.UsersView;

public class UsersController {
	private UsersView view;
	private User model;
	
	public UsersController() {
		view = new UsersView();
		model = new User();
	}
	
	public void showUsers() {
		ArrayList <User> users = model.get();
		view.tableUsers(users);
	}
	
	public boolean addUser(String e, String p, String n, String l, String t) {

	    boolean flag = model.make(e,p,l,n,t);
	    return flag;
	}

}
