package com.example.demo;

import java.lang.reflect.InvocationTargetException;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class FileChooserExample {

	public static void main(String[] args) throws InterruptedException, InvocationTargetException {

		int option = JOptionPane.YES_OPTION;

		while (option != JOptionPane.NO_OPTION) {
			System.out.println("running...");
			FileChooserRunner chooserRunner = new FileChooserRunner();
			Thread thread = new Thread(chooserRunner);
			SwingUtilities.invokeAndWait(thread);
			if (!thread.isAlive()) {
				option = JOptionPane.showConfirmDialog(null, "Desea cargar otro archivo?", "",
						JOptionPane.YES_NO_OPTION);
				System.out.println(option);
			}
		}
		System.exit(0);

	}

}
