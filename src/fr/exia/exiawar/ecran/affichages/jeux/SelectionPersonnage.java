package fr.exia.exiawar.ecran.affichages.jeux;

import java.awt.Color;
import java.awt.Graphics2D;

import fr.exia.exiawar.boutons.BoutonPersonnage;
import fr.exia.exiawar.boutons.MenuB;
import fr.exia.exiawar.boutons.SelectionB;
import fr.exia.exiawar.ecran.Affichage;
import fr.exia.exiawar.interfaces.IDessiner;
import fr.exia.exiawar.personnages.Ahmed;
import fr.exia.exiawar.personnages.Amiel;
import fr.exia.exiawar.personnages.AnneLaure;
import fr.exia.exiawar.personnages.Benjamin;
import fr.exia.exiawar.personnages.Erwan;
import fr.exia.exiawar.personnages.Francois;
import fr.exia.exiawar.personnages.Gurvan;
import fr.exia.exiawar.personnages.Gwenael;
import fr.exia.exiawar.personnages.Jeremy;
import fr.exia.exiawar.personnages.Julien;
import fr.exia.exiawar.personnages.KevKev;
import fr.exia.exiawar.personnages.Louis;
import fr.exia.exiawar.personnages.Mmouky;
import fr.exia.exiawar.personnages.Pauline;
import fr.exia.exiawar.personnages.Personnage;
import fr.exia.exiawar.personnages.Remi;

public class SelectionPersonnage implements IDessiner {
	private MenuB menu;

	private Personnage personnageSelected;

	private BoutonPersonnage ahmed;
	private BoutonPersonnage annelaure;
	private BoutonPersonnage jeremy;
	private BoutonPersonnage remi;
	private BoutonPersonnage amiel;
	private BoutonPersonnage louis;
	private BoutonPersonnage benjamin;
	private BoutonPersonnage kevkev;
	private BoutonPersonnage francois;
	private BoutonPersonnage erwan;
	private BoutonPersonnage mmouky;
	private BoutonPersonnage julien;
	private BoutonPersonnage pauline;
	private BoutonPersonnage gurvan;
	private BoutonPersonnage gwenael;

	private SelectionB select;

	public SelectionPersonnage(Affichage affichage) {
		menu = new MenuB(affichage.getWidth() - 115, 20, 100, 30, affichage);
		
		ahmed = new BoutonPersonnage((int) (affichage.getWidth() / 2 + 200), (int) (affichage.getHeight() / 3.5), 100,
				80, new Ahmed(), affichage);
		annelaure = new BoutonPersonnage((int) (affichage.getWidth() / 2), (int) (affichage.getHeight() / 3.5), 100,
				80, new AnneLaure(), affichage);
		jeremy = new BoutonPersonnage((int) (affichage.getWidth() / 2 - 200), (int) (affichage.getHeight() / 3.5),
				100, 80, new Jeremy(), affichage);
		amiel = new BoutonPersonnage((int) (affichage.getWidth() / 2 - 400), (int) (affichage.getHeight() / 3.5),
				100, 80, new Amiel(), affichage);
		remi = new BoutonPersonnage((int) (affichage.getWidth() / 2 - 400), (int) (affichage.getHeight() / 3.5),
				100, 80, new Remi(), affichage);
		louis = new BoutonPersonnage((int) (affichage.getWidth() / 2 - 400), (int) (affichage.getHeight() / 3.5),
				100, 80, new Louis(), affichage);
		benjamin = new BoutonPersonnage((int) (affichage.getWidth() / 2 - 400), (int) (affichage.getHeight() / 3.5),
				100, 80, new Benjamin(), affichage);
		francois = new BoutonPersonnage((int) (affichage.getWidth() / 2 - 400), (int) (affichage.getHeight() / 3.5),
				100, 80, new Francois(), affichage);
		kevkev = new BoutonPersonnage((int) (affichage.getWidth() / 2 - 400), (int) (affichage.getHeight() / 3.5),
				100, 80, new KevKev(), affichage);
		erwan = new BoutonPersonnage((int) (affichage.getWidth() / 2 - 400), (int) (affichage.getHeight() / 3.5),
				100, 80, new Erwan(), affichage);
		mmouky = new BoutonPersonnage((int) (affichage.getWidth() / 2 - 400), (int) (affichage.getHeight() / 3.5),
				100, 80, new Mmouky(), affichage);
		pauline = new BoutonPersonnage((int) (affichage.getWidth() / 2 - 400), (int) (affichage.getHeight() / 3.5),
				100, 80, new Pauline(), affichage);
		gurvan = new BoutonPersonnage((int) (affichage.getWidth() / 2 - 400), (int) (affichage.getHeight() / 3.5),
				100, 80, new Gurvan(), affichage);
		julien = new BoutonPersonnage((int) (affichage.getWidth() / 2 - 400), (int) (affichage.getHeight() / 3.5),
				100, 80, new Julien(), affichage);
		gwenael = new BoutonPersonnage((int) (affichage.getWidth() / 2 - 400), (int) (affichage.getHeight() / 3.5),
				100, 80, new Gwenael(), affichage);
		

		select = new SelectionB((int) (affichage.getWidth() / 2 - 150),
				(int) (affichage.getHeight() / 3.5) + 400, 300, 50, affichage);

		personnageSelected = null;
	}

	public void dessiner(Graphics2D g2d) {
		menu.dessiner(g2d);
		
		for(BoutonPersonnage persoB : BoutonPersonnage.liste_personnage){
			persoB.dessiner(g2d);
		}

		select.dessiner(g2d);

		dessinerPersonnageSelectionne(g2d);
	}

	public void dessinerPersonnageSelectionne(Graphics2D g2d) {
		g2d.setColor(Color.BLACK);
		g2d.drawRect(20, 550, 100, 100);
		if (personnageSelected != null)
			g2d.drawImage(personnageSelected.getLogo(), 20, 550, 100, 100, null);
	}

	public Personnage getPersonnageSelected() {
		return personnageSelected;
	}

	public void setPersonnageSelected(Personnage personnageSelected) {
		this.personnageSelected = personnageSelected;
	}

	public SelectionB getSelect() {
		return select;
	}

	public void setSelect(SelectionB select) {
		this.select = select;
	}

}
