package com.ocs.login;

import javax.swing.*;

public class Login {
	
	public static void main(String args[]) {
		JFrame login = new JFrame("Clinic On Click");
		
		JPanel loginPanel = new JPanel();
		loginPanel.setBounds(40,70,800,800);
		
		login.add(loginPanel);
		
		JLabel title = new JLabel("LOGIN");
		title.setSize(200,200);
		
		JTextField username = new JTextField(30);
		JTextField password = new JTextField(30);
		
		loginPanel.add(title);
		loginPanel.add(username);
		loginPanel.add(password);

		JButton submit = new JButton("Login");
		loginPanel.add(submit);
		
		login.setSize(800,800);
		login.setLayout(null); // default layout No. of component to be added adjuscent , 
		login.setVisible(true);// by default frame object as invisible 

			
	}
}
