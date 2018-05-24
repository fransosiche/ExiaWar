package fr.exia.exiawar.boutons;

import java.awt.Graphics2D;

import fr.exia.exiawar.ecran.Affichage;
import fr.exia.exiawar.enums.EnumAffichage;

public class Exit extends Bouton {

	public Exit(int x, int y, int width, int height, Affichage affichage) {
		super(x, y, width, height, "Exit", affichage);
	}

	public void action() {
		if (affichage.getAffichage() == EnumAffichage.Menu) {
			System.exit(0);
		}
	}

	public void action(Graphics2D g2d) {
		// TODO Auto-generated method stub

	}

}
