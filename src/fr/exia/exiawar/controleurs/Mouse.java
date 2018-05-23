package fr.exia.exiawar.controleurs;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Observable;

import fr.exia.exiawar.boutons.Bouton;

public class Mouse extends Observable implements MouseListener, MouseMotionListener {

	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void mouseReleased(MouseEvent e) {
		for (Bouton bouton : Bouton.boutons) {
			if (bouton.getRect().contains(e.getPoint()) && !bouton.isLocked()) {
				bouton.action();
				this.setChanged();
				this.notifyObservers();
			}
		}
	}

	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void mouseMoved(MouseEvent e) {
		for (Bouton bouton : Bouton.boutons) {
			if (!bouton.isLocked()) {
				if (bouton.getRect().contains(e.getPoint()) && !bouton.isFocus()) {
					bouton.setFocus(true);
					this.setChanged();
					this.notifyObservers();
				} else if (!bouton.getRect().contains(e.getPoint()) && bouton.isFocus()) {
					bouton.setFocus(false);
					this.setChanged();
					this.notifyObservers();
				}
			}
		}
	}

}
