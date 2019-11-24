package com.example.demo;

public class ThreadsExample {
	
	static class RunabbleClass implements Runnable {
		
		private final String name;
		
		public RunabbleClass(String name) {
			this.name=name;
		}

		@Override
		public void run() {
			//Aqui va lo que se debe executar
			Long randomValue = (long)(Math.random()*10000) +1;
			randomValue = randomValue <0?randomValue*-1:randomValue;
			System.out.println("Se entro a executar el metodo de "+name+" y esperare por "+ randomValue +" milisegundos");
			try {
				Thread.currentThread().sleep(randomValue);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name+" acabe...");
		}
		
	}

	public static void main(String[] args) {
		RunabbleClass aRunnable = new RunabbleClass("Runnable a");
		RunabbleClass bRunnable = new RunabbleClass("Runnable b");
		RunabbleClass cRunnable = new RunabbleClass("Runnable c");
		
		Thread aThread = new Thread(aRunnable);
		Thread bThread = new Thread(bRunnable);
		Thread cThread = new Thread(cRunnable);
		
		aThread.start();
		bThread.start();
		cThread.start();

	}

}
