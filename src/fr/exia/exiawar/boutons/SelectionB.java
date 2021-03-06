package fr.exia.exiawar.boutons;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

import fr.exia.exiawar.ecran.Affichage;
import fr.exia.exiawar.enums.EnumAffichage;
import fr.exia.exiawar.enums.EnumJeux;

public class SelectionB extends Bouton {

	public SelectionB(int x, int y, int width, int height, Affichage affichage) {
		super(x, y, width, height, "Select", true, affichage);
	}

	public void action() {
		if (affichage.getAffichage() == EnumAffichage.Jeux
				&& affichage.getJeux().getAffichage() == EnumJeux.SelectionPersonnage) {
			if (affichage.getJeux().getSelectionP().getPersonnageJ1() == null) {
				affichage.getJeux().getSelectionP()
						.setPersonnageJ1(affichage.getJeux().getSelectionP().getPersonnageSelected());
				affichage.getJeux().getSelectionP().setPersonnageSelected(null);
				affichage.getJeux().getSelectionP().getSelect().setLocked(true);
			} else if (affichage.getJeux().getSelectionP().getPersonnageJ2() == null) {
				affichage.getJeux().getSelectionP()
						.setPersonnageJ2(affichage.getJeux().getSelectionP().getPersonnageSelected());
				affichage.getJeux().getSelectionP().getSelect().setLocked(true);
				affichage.getJeux().setAffichage(EnumJeux.Partie);
			} else {
				affichage.getJeux().setAffichage(EnumJeux.Partie);
			}
		}
	}

	public void action(Graphics2D g2d) {

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

		g2d.setFont(new Font(Affichage.POLICE, Font.BOLD, 20));
		String UPtext = text.toUpperCase();

		int widthTxt = (int) g2d.getFontMetrics().getStringBounds(UPtext, g2d).getWidth();
		int heightTxt = (int) g2d.getFontMetrics().getStringBounds(UPtext, g2d).getHeight();

		g2d.drawString(UPtext, x + width / 2 - widthTxt / 2, y + height / 2 + heightTxt / 3);
	}

}
