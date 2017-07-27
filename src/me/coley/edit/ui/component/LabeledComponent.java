package me.coley.edit.ui.component;

import java.awt.BorderLayout;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class LabeledComponent extends JPanel {
	public LabeledComponent(String label, JComponent component) {
		setLayout(new BorderLayout());
		add(new JLabel(label), BorderLayout.WEST);
		add(component, BorderLayout.CENTER);
	}
}
