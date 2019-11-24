package com.example.demo;

public class StackMain {

	public static void main(String[] args) {
		
		//Instanciamos la pila
		IStack<String> stack = new StackNoArray<>();
		
		//Comprobamos si esta vacia y preguntamos su tamaño.
				System.out.println("La pila esta vacia? " + stack.isEmpty()+" -- Tamaño de la pila: "+stack.size());
				
				//agregamos elementos.
				
				stack.push("primer elemento");
				stack.push("segundo elemento");
				stack.push("tercer elemento");
				stack.push("cuarto elemento");
				stack.push("quinto elemento");
				
				//Volvemos a preguntar si esta vacia y preguntamos su tamaño
				System.out.println("La pila esta vacia? " + stack.isEmpty()+" -- Tamaño de la pila: "+stack.size());
				
				//Imprimimos contenido de la pila
				stack.print();
				
				//Obtenemos el peek y vemos que el tamaño continua. Ya que peek solo nos devuelve el ultimo elemento pero sin sacarlo
				System.out.println("Peek: "+stack.peek()+" -- Tamaño de la pila: "+stack.size());
				
				//Sacamos el elemento y volvemos a preguntar por su tamaño
				String element = stack.pop();
				System.out.println("Elemento retirado: "+element+" -- Tamaño de la pila: "+stack.size());
				
				//Imprimimos contenido de la pila
				stack.print();
				
				//Ingresamos otro elemento
				stack.push("otro quinto elemento");
				
				//Volvemos a imprimir contenido de la pila
				stack.print();
				
				System.exit(0);

	}

}
