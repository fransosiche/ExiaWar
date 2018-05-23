package fr.exia.exiawar.ecran;

import javax.swing.JFrame;

import fr.exia.exiawar.controleurs.Mouse;

public class Fenetre extends JFrame{

	private static final long serialVersionUID = 8726086582991131514L;

	public Fenetre() {
		
		Affichage affichage = new Affichage();
		Mouse mouse = new Mouse();
		
		this.setTitle("ExiaWar");
		this.setSize(1200,720);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setContentPane(affichage);
		
		this.addMouseListener(mouse);
		this.addMouseMotionListener(mouse);
		
		mouse.addObserver(affichage);
		
		this.setVisible(true);
	}

}
