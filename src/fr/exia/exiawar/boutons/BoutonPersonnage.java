package fr.exia.exiawar.boutons;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

import fr.exia.exiawar.ecran.Affichage;
import fr.exia.exiawar.enums.EnumAffichage;
import fr.exia.exiawar.enums.EnumJeux;
import fr.exia.exiawar.personnage.Personnage;

public class BoutonPersonnage extends Bouton {

	private final static int size = 100;
	private Personnage personnage;
	private Affichage affichage;

	public BoutonPersonnage(int x, int y, int width, int height, Personnage personnage, Affichage affichage) {
		super(x, y, size, size, personnage.getNom(), affichage);
		this.personnage = personnage;
		this.affichage = affichage;
	}

	public void dessiner(Graphics2D g2d) {
		if (isLocked == false) {
			if (isFocus == false) {
				g2d.setColor(Color.BLACK);
				g2d.draw(getRect());
			} else {
				int thickness = 3;
				g2d.setColor(Color.BLUE);
				g2d.fill(new Rectangle(x - thickness, y - thickness, width + thickness * 2, height + thickness * 2));
				g2d.clearRect(x, y, width, height);
			}
		} else {
			g2d.setColor(Color.BLACK);
			g2d.draw(getRect());

			int widthCadenas = 19;
			int heightCadenas = 25;

			g2d.drawImage(new ImageIcon("img\\boutons\\cadenas.png").getImage(), x - widthCadenas - 5,
					y + height / 2 - heightCadenas / 2, widthCadenas, heightCadenas, null);
		}

		g2d.drawImage(personnage.getLogo(), this.x, this.y, size, size, null);

	}

	public void action() {
		if (affichage.getAffichage() == EnumAffichage.Jeux
				&& affichage.getJeux().getAffichage() == EnumJeux.SelectionPersonnage) {
			affichage.getJeux().getSelectionP().setPersonnageSelected(personnage);
			affichage.getJeux().getSelectionP().getSelect().setLocked(false);
		}
	}

	public void action(Graphics2D g2d) {
		// TODO Auto-generated method stub

	}

	public Personnage getPersonnage() {
		return personnage;
	}

	public void setPersonnage(Personnage personnage) {
		this.personnage = personnage;
	}

	public Affichage getAffichage() {
		return affichage;
	}

	public void setAffichage(Affichage affichage) {
		this.affichage = affichage;
	}

}
