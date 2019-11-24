package com.example.demo;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class FileChooserDialog extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5129694236473979866L;
	private JFileChooser fileChooser;

	public FileChooserDialog() {
		fileChooser = new JFileChooser();
	}

	public int showDialog() {
		return fileChooser.showOpenDialog(this);

	}

	public String getFileSelected() {
		return fileChooser.getSelectedFile().getAbsolutePath();
	}

	public JFileChooser getFileChooser() {
		return fileChooser;
	}

}
