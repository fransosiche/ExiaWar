package fr.exia.exiawar.ecran.affichages;

import java.awt.Graphics2D;

import fr.exia.exiawar.ecran.Affichage;
import fr.exia.exiawar.ecran.affichages.jeux.Partie;
import fr.exia.exiawar.ecran.affichages.jeux.SelectionPersonnage;
import fr.exia.exiawar.enums.EnumJeux;
import fr.exia.exiawar.interfaces.IDessiner;

public class Jeux implements IDessiner {

	private EnumJeux affichage;

	private SelectionPersonnage selectionP;
	private Partie partie;

	public Jeux(Affichage affichage) {
		this.affichage = EnumJeux.SelectionPersonnage;
		this.selectionP = new SelectionPersonnage(affichage);
		this.partie = new Partie(affichage);
	}

	public void dessiner(Graphics2D g2d) {
		if (affichage == EnumJeux.SelectionPersonnage) {
			selectionP.dessiner(g2d);
		}else if (affichage == EnumJeux.Partie) {
			partie.dessiner(g2d);
		}
	}

	public EnumJeux getAffichage() {
		return affichage;
	}

	public void setAffichage(EnumJeux affichage) {
		this.affichage = affichage;
	}

	public SelectionPersonnage getSelectionP() {
		return selectionP;
	}

	public void setSelectionP(SelectionPersonnage selectionP) {
		this.selectionP = selectionP;
	}

	public Partie getPartie() {
		return partie;
	}

	public void setPartie(Partie partie) {
		this.partie = partie;
	}

}
