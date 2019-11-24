package com.example.demo;

import java.io.Serializable;

public class StackNoArray<TYPE extends Serializable> implements IStack<TYPE> {

	private int size;
	private BaseElement<TYPE> peek;

	@Override
	public void push(TYPE element) {
		BaseElement<TYPE> last = new BaseElement<>(element);
		last.setPrevious(peek);
		peek = last;
		size++;
	}

	@Override
	public TYPE pop() {
		if (isEmpty()) {
			return null;
		} else {
			BaseElement<TYPE> last = peek;
			peek = last.getPrevious();
			size--;
			return last.getContent();
		}
	}

	@Override
	public TYPE peek() {
		return peek.getContent();
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return peek == null;
	}

	@Override
	public void print() {
		System.out.println("==================");
		printElement(peek);
		System.out.println("==================");
	}
	
	private void printElement(BaseElement<TYPE> baseElement) {
		if(baseElement!=null) {
			System.out.println(baseElement.getContent());
			printElement(baseElement.getPrevious());
		}
	}

}
