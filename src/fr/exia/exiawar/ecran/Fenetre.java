package fr.exia.exiawar.ecran;

import javax.swing.JFrame;

public class Fenetre extends JFrame{

	private static final long serialVersionUID = 8726086582991131514L;

	public Fenetre() {
		this.setTitle("ExiaWar");
		this.setSize(1200,720);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setContentPane(new Affichage());
		
		this.setVisible(true);
	}

}
