package fr.exia.exiawar.ecran.affichages;

import java.awt.Graphics2D;

import fr.exia.exiawar.Interface.IDessiner;
import fr.exia.exiawar.boutons.Exit;
import fr.exia.exiawar.boutons.OptionsB;
import fr.exia.exiawar.boutons.Start;
import fr.exia.exiawar.ecran.Affichage;

public class Menu implements IDessiner {

	private Start start;
	private Exit exit;
	private OptionsB option;
	
	public Menu(int width, int height, Affichage affichage) {
		start = new Start(width / 2 - 50, (int) (height / 1.5) - 100, 100, 30, affichage);
		option = new OptionsB(width / 2 - 50, (int) (height / 1.5) - 50, 100, 30, affichage);
		exit = new Exit(width / 2 - 50, (int) (height / 1.5), 100, 30, affichage);
	}

	public void dessiner(Graphics2D g2d) {
		start.dessiner(g2d);
		option.dessiner(g2d);
		exit.dessiner(g2d);
	}

}
