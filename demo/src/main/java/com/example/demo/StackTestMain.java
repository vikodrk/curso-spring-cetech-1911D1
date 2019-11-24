package com.example.demo;

public class StackTestMain {

	public static void main(String[] args) {
		System.out.println("Ejemplo de pila con Array");
		IStack<String> stringStack = new StackWithArray<>(5);
		
		//Comprobamos si esta vacia y preguntamos su tamaño.
		System.out.println("La pila esta vacia? " + stringStack.isEmpty()+" -- Tamaño de la pila: "+stringStack.size());
		
		//agregamos elementos.
		
		stringStack.push("primer elemento");
		stringStack.push("segundo elemento");
		stringStack.push("tercer elemento");
		stringStack.push("cuarto elemento");
		stringStack.push("quinto elemento");
		
		//Volvemos a preguntar si esta vacia y preguntamos su tamaño
		System.out.println("La pila esta vacia? " + stringStack.isEmpty()+" -- Tamaño de la pila: "+stringStack.size());
		
		//Imprimimos contenido de la pila
		stringStack.print();
		
		//Obtenemos el peek y vemos que el tamaño continua. Ya que peek solo nos devuelve el ultimo elemento pero sin sacarlo
		System.out.println("Peek: "+stringStack.peek()+" -- Tamaño de la pila: "+stringStack.size());
		
		//Sacamos el elemento y volvemos a preguntar por su tamaño
		String element = stringStack.pop();
		System.out.println("Elemento retirado: "+element+" -- Tamaño de la pila: "+stringStack.size());
		
		//Imprimimos contenido de la pila
		stringStack.print();
		
		//Ingresamos otro elemento
		stringStack.push("otro quinto elemento");
		
		//Imprimimos contenido de la pila
		stringStack.print();
		
		//Intentamos agregar un 6to elemento para provocar un error de "PILA LLENA"
		try {
			stringStack.push("sexto elemento");
		}catch(RuntimeException e) {
			System.err.println(e.getMessage());
		}
		
		//Imprimimos contenido
		stringStack.print();
		
		System.exit(0);

	}

}
