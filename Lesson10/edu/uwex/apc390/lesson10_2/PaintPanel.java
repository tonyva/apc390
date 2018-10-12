package edu.uwex.apc390.lesson10_2;

import java.awt.Graphics;
import java.awt.LayoutManager;

import javax.swing.JPanel;

public class PaintPanel extends JPanel {
	/**
	 * Data member
	 */
	private static final long serialVersionUID = 1L;

	public PaintPanel() {
	}

	public PaintPanel(LayoutManager layout) {
		super(layout);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		// For debugging only: 
		//g.drawString("This is the PaintPanel", 50, 50);
	}
}
