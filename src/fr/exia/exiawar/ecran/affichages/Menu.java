package fr.exia.exiawar.ecran.affichages;

import java.awt.Graphics2D;

import fr.exia.exiawar.Interface.IDessiner;
import fr.exia.exiawar.boutons.Start;

public class Menu implements IDessiner {

	private Start start;

	public Menu(int width, int height) {
		start = new Start(200, 200, 100, 30, null);
	}

	@Override
	public void dessiner(Graphics2D g2d) {
		start.dessiner(g2d);
	}

}
