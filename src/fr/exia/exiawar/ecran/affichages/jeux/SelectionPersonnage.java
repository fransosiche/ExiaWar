package fr.exia.exiawar.ecran.affichages.jeux;

import java.awt.Color;
import java.awt.Graphics2D;

import fr.exia.exiawar.boutons.BoutonPersonnage;
import fr.exia.exiawar.boutons.MenuB;
import fr.exia.exiawar.boutons.SelectionB;
import fr.exia.exiawar.ecran.Affichage;
import fr.exia.exiawar.interfaces.IDessiner;
import fr.exia.exiawar.personnages.Ahmed;
import fr.exia.exiawar.personnages.AnneLaure;
import fr.exia.exiawar.personnages.Jeremy;
import fr.exia.exiawar.personnages.Personnage;

public class SelectionPersonnage implements IDessiner {
	private MenuB menu;

	private Personnage personnageSelected;

	private BoutonPersonnage ahmed;
	private BoutonPersonnage annelaure;
	private BoutonPersonnage jeremi;

	private SelectionB select;

	public SelectionPersonnage(Affichage affichage) {
		menu = new MenuB(affichage.getWidth() - 115, 20, 100, 30, affichage);
		ahmed = new BoutonPersonnage((int) (affichage.getWidth() / 2.1 + 200), (int) (affichage.getHeight() / 3.5), 100,
				80, new Ahmed(), affichage);
		annelaure = new BoutonPersonnage((int) (affichage.getWidth() / 2.1), (int) (affichage.getHeight() / 3.5), 100,
				80, new AnneLaure(), affichage);
		jeremi = new BoutonPersonnage((int) (affichage.getWidth() / 2.1 - 200), (int) (affichage.getHeight() / 3.5),
				100, 80, new Jeremy(), affichage);

		select = new SelectionB((int) (affichage.getWidth() / 2 - 150),
				(int) (affichage.getHeight() / 3.5) + 400, 300, 50, affichage);

		personnageSelected = null;
	}

	public void dessiner(Graphics2D g2d) {
		menu.dessiner(g2d);
		ahmed.dessiner(g2d);
		annelaure.dessiner(g2d);
		jeremi.dessiner(g2d);

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
