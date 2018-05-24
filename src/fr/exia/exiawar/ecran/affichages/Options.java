package fr.exia.exiawar.ecran.affichages;

import java.awt.Graphics2D;

import fr.exia.exiawar.Interface.IDessiner;
import fr.exia.exiawar.boutons.BoutonPersonnage;
import fr.exia.exiawar.boutons.MenuB;
import fr.exia.exiawar.ecran.Affichage;
import fr.exia.exiawar.personnage.Ahmed;
import fr.exia.exiawar.personnage.AnneLaure;

public class Options implements IDessiner {

	private MenuB menu;

	public Options(int width, int height, Affichage affichage) {
		menu = new MenuB(width - 115, 20, 100, 30, affichage);

	}

	public void dessiner(Graphics2D g2d) {
		menu.dessiner(g2d);

	}

}
