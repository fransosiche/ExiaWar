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
	private BoutonPersonnage ahmed;
	private BoutonPersonnage annelaure;

	public Options(int width, int height, Affichage affichage) {
		menu = new MenuB(width - 115, 20, 100, 30, affichage);
		ahmed = new BoutonPersonnage((int) (width / 3.5), (int) (height / 3.5), 100, 80, new Ahmed(), affichage);
		annelaure = new BoutonPersonnage((int) (width /2.5), (int) (height / 3.5), 100, 80, new AnneLaure(), affichage);
	}

	public void dessiner(Graphics2D g2d) {
		menu.dessiner(g2d);
		ahmed.dessiner(g2d);
		annelaure.dessiner(g2d);
	}

}
