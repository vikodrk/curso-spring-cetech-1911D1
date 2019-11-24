package com.example.demo;

import java.io.Serializable;

public class StackWithArray<ITEM extends Serializable> implements IStack<ITEM> {

	private Object[] items;
	private int size;

	public StackWithArray(int size) {
		items = new Object[size];
		size = 0;
	}

	@Override
	public void push(ITEM element) {
		if (size + 1 > items.length) {
			throw new RuntimeException("Stack is full");
		} else {
			items[size] = element;
			size++;
		}
	}

	@Override
	public ITEM pop() {
		if (isEmpty()) {
			return null;
		} else {
			ITEM last = (ITEM) items[size - 1];
			items[size-1] = null;
			size--;
			return last;
		}
	}

	@Override
	public ITEM peek() {
		if (isEmpty()) {
			return null;
		} else {
			return (ITEM) items[size - 1];
		}
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public void print() {
		System.out.println("==================");
		for (int x = items.length - 1; x >= 0; x--) {
			System.out.println(items[x]);
		}
		System.out.println("==================");
	}

}
