package fr.exia.exiawar.ecran.affichages;

import java.awt.Graphics2D;

import fr.exia.exiawar.Interface.IDessiner;
import fr.exia.exiawar.boutons.MenuB;
import fr.exia.exiawar.boutons.StartB;
import fr.exia.exiawar.ecran.Affichage;

public class Options implements IDessiner {

	private MenuB menu;

	public Options(int width, int height, Affichage affichage) {
		menu = new MenuB(width - 115, 20, 100, 30, affichage);
	}

	public void dessiner(Graphics2D g2d) {
		menu.dessiner(g2d);
		
	}

}
