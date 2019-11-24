package com.example.demo;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class FileChooserRunner implements Runnable {
	
	private FileChooserDialog dialog;
	
	public FileChooserRunner() {
		dialog = new FileChooserDialog();
	}

	@Override
	public void run() {
		int response = dialog.showDialog();
		System.out.println(dialog.getFileChooser().isShowing());
		System.out.println("showing...");
		if(response == JFileChooser.APPROVE_OPTION) {
			String path = dialog.getFileSelected();
			StringBuilder output = new StringBuilder();
			try {
				output.append("Contenido del archivo: \n");
				List<String> lineas = Files.readAllLines(Paths.get(path), StandardCharsets.UTF_8);
				for(String linea : lineas) {
					output.append(linea).append("\n");
				}
			} catch (IOException e) {
				e.printStackTrace();
				output.append("Error leyendo el archivo...");
			}
			JOptionPane.showMessageDialog(null, output.toString());
		}
	}

}
