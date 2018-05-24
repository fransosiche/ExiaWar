package fr.exia.exiawar.boutons;

import java.awt.Graphics2D;

import fr.exia.exiawar.ecran.Affichage;
import fr.exia.exiawar.enums.EnumAffichage;

public class Start extends Bouton {

	public Start(int x, int y, int width, int height, Affichage affichage) {
		super(x, y, width, height, "Start", affichage);
	}


	public void action() {
		affichage.setAffichage(EnumAffichage.Jeux);
	}


	public void action(Graphics2D g2d) {
		
	}

}
