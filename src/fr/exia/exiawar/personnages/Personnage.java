package fr.exia.exiawar.personnages;

import java.awt.Image;

import javax.swing.ImageIcon;

public abstract class Personnage {

	protected String nom;
	protected Image logo;

	public Personnage(String nom, String logoPath) {
		this.nom = nom;
		this.logo = new ImageIcon(logoPath).getImage();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Image getLogo() {
		return logo;
	}

	public void setLogo(Image logo) {
		this.logo = logo;
	}

}
