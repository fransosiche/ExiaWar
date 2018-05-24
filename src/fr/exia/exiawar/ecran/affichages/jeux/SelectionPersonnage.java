package fr.exia.exiawar.ecran.affichages.jeux;

import java.awt.Color;
import java.awt.Graphics2D;

import fr.exia.exiawar.Interface.IDessiner;
import fr.exia.exiawar.ecran.Affichage;

public class SelectionPersonnage implements IDessiner{

	public SelectionPersonnage(Affichage affichage) {
		
	}

	
	public void dessiner(Graphics2D g2d) {
		g2d.setColor(Color.BLACK);
		g2d.fillRect(50, 50, 50, 50);
	}

}
