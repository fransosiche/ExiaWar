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
	private Affichage affichage;

	private Personnage personnageSelected;

	private Personnage personnageJ1;
	private Personnage personnageJ2;

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
		this.affichage = affichage;

		ahmed = new BoutonPersonnage((int) (affichage.getWidth() / 2 + 250), (int) (affichage.getHeight() / 2 - 270),
				100, 80, new Ahmed(), affichage);
		annelaure = new BoutonPersonnage((int) (affichage.getWidth() / 2 + 100),
				(int) (affichage.getHeight() / 2 - 270), 100, 80, new AnneLaure(), affichage);
		jeremy = new BoutonPersonnage((int) (affichage.getWidth() / 2 - 50), (int) (affichage.getHeight() / 2 - 270),
				100, 80, new Jeremy(), affichage);
		amiel = new BoutonPersonnage((int) (affichage.getWidth() / 2 - 200), (int) (affichage.getHeight() / 2 - 270),
				100, 80, new Amiel(), affichage);
		remi = new BoutonPersonnage((int) (affichage.getWidth() / 2 - 350), (int) (affichage.getHeight() / 2 - 270),
				100, 80, new Remi(), affichage);

		louis = new BoutonPersonnage((int) (affichage.getWidth() / 2 + 250), (int) (affichage.getHeight() / 2 - 140),
				100, 80, new Louis(), affichage);
		benjamin = new BoutonPersonnage((int) (affichage.getWidth() / 2 + 100), (int) (affichage.getHeight() / 2 - 140),
				100, 80, new Benjamin(), affichage);
		francois = new BoutonPersonnage((int) (affichage.getWidth() / 2 - 50), (int) (affichage.getHeight() / 2 - 140),
				100, 80, new Francois(), affichage);
		kevkev = new BoutonPersonnage((int) (affichage.getWidth() / 2 - 200), (int) (affichage.getHeight() / 2 - 140),
				100, 80, new KevKev(), affichage);
		erwan = new BoutonPersonnage((int) (affichage.getWidth() / 2 - 350), (int) (affichage.getHeight() / 2 - 140),
				100, 80, new Erwan(), affichage);

		mmouky = new BoutonPersonnage((int) (affichage.getWidth() / 2 + 250), (int) (affichage.getHeight() / 2 - 10),
				100, 80, new Mmouky(), affichage);
		pauline = new BoutonPersonnage((int) (affichage.getWidth() / 2 + 100), (int) (affichage.getHeight() / 2 - 10),
				100, 80, new Pauline(), affichage);
		gurvan = new BoutonPersonnage((int) (affichage.getWidth() / 2 - 50), (int) (affichage.getHeight() / 2 - 10),
				100, 80, new Gurvan(), affichage);
		julien = new BoutonPersonnage((int) (affichage.getWidth() / 2 - 200), (int) (affichage.getHeight() / 2 - 10),
				100, 80, new Julien(), affichage);
		gwenael = new BoutonPersonnage((int) (affichage.getWidth() / 2 - 350), (int) (affichage.getHeight() / 2 - 10),
				100, 80, new Gwenael(), affichage);

		select = new SelectionB((int) (affichage.getWidth() / 2 - 150), (int) (affichage.getHeight() / 3.5) + 400, 300,
				50, affichage);

		personnageSelected = null;
		personnageJ1 = null;
		personnageJ2 = null;
	}

	public void dessiner(Graphics2D g2d) {
		menu.dessiner(g2d);

		for (BoutonPersonnage persoB : BoutonPersonnage.liste_personnage) {
			persoB.dessiner(g2d);
		}

		select.dessiner(g2d);

		dessinerPersonnageSelectionne(g2d);
		dessinerPersonnageJ1(g2d);
		dessinerPersonnageJ2(g2d);
	}

	public void dessinerPersonnageSelectionne(Graphics2D g2d) {
		g2d.setColor(Color.BLACK);
		g2d.drawRect(this.affichage.getWidth() / 2 - 50, this.affichage.getHeight() - 230, 100, 100);
		if (personnageSelected != null)
			g2d.drawImage(personnageSelected.getLogo(), this.affichage.getWidth() / 2 - 50,
					this.affichage.getHeight() - 230, 100, 100, null);
	}

	public void dessinerPersonnageJ1(Graphics2D g2d) {
		g2d.setColor(Color.BLACK);
		g2d.drawRect(50, this.affichage.getHeight() - 160, 100, 100);
		if (personnageJ1 != null)
			g2d.drawImage(personnageJ1.getLogo(), 50, this.affichage.getHeight() - 160, 100, 100, null);
	}

	public void dessinerPersonnageJ2(Graphics2D g2d) {
		g2d.setColor(Color.BLACK);
		g2d.drawRect(this.affichage.getWidth() - 160, this.affichage.getHeight() - 160, 100, 100);
		if (personnageJ2 != null)
			g2d.drawImage(personnageJ2.getLogo(), this.affichage.getWidth() - 160, this.affichage.getHeight() - 160,
					100, 100, null);
	}

	public void resetSelection() {
		this.select.setLocked(true);
		this.setPersonnageJ1(null);
		this.setPersonnageJ2(null);
		this.setPersonnageSelected(null);
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

	public Personnage getPersonnageJ1() {
		return personnageJ1;
	}

	public void setPersonnageJ1(Personnage personnageJ1) {
		this.personnageJ1 = personnageJ1;
	}

	public Personnage getPersonnageJ2() {
		return personnageJ2;
	}

	public void setPersonnageJ2(Personnage personnageJ2) {
		this.personnageJ2 = personnageJ2;
	}

}
