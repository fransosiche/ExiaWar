package fr.exia.exiawar.ecran.affichages.jeux;

import java.awt.Graphics2D;

import fr.exia.exiawar.Interface.IDessiner;
import fr.exia.exiawar.boutons.BoutonPersonnage;
import fr.exia.exiawar.ecran.Affichage;
import fr.exia.exiawar.personnage.Ahmed;
import fr.exia.exiawar.personnage.AnneLaure;
import fr.exia.exiawar.personnage.Jeremi;

public class SelectionPersonnage implements IDessiner {
	private BoutonPersonnage ahmed;
	private BoutonPersonnage annelaure;
	private BoutonPersonnage jeremi;

	public SelectionPersonnage(int width, int height, Affichage affichage) {
		ahmed = new BoutonPersonnage((int) (width / 3.5), (int) (height / 3.5), 100, 80, new Ahmed(), affichage);
		annelaure = new BoutonPersonnage((int) (width / 2.5), (int) (height / 3.5), 100, 80, new AnneLaure(),
				affichage);
		jeremi = new BoutonPersonnage((int) (width / 1.5), (int) (height / 3.5), 100, 80, new Jeremi(), affichage);

	}

	public void dessiner(Graphics2D g2d) {
		ahmed.dessiner(g2d);
		annelaure.dessiner(g2d);
		jeremi.dessiner(g2d);
	}

}
