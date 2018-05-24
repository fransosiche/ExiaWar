package fr.exia.exiawar.ecran.affichages;

import java.awt.Graphics2D;

import fr.exia.exiawar.Interface.IDessiner;
import fr.exia.exiawar.boutons.OptionsB;
import fr.exia.exiawar.boutons.Start;

public class Menu implements IDessiner {

	private Start start;
	private OptionsB option;

	public Menu(int width, int height) {
		start = new Start(width/2-50, (int)(height/2.5)-15, 100, 30, null);
		option = new OptionsB(width/2-50, (int)(height/2)-15, 100, 30, null);
	}

	public void dessiner(Graphics2D g2d) {
		start.dessiner(g2d);
		option.dessiner(g2d);
	}

}
