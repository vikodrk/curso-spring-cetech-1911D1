package com.example.demo;

import java.io.Serializable;

public interface IStack<ELEMENT extends Serializable> {
	
	void push(ELEMENT element);
	
	ELEMENT pop();
	
	ELEMENT peek();
	
	int size();
	
	boolean isEmpty();
	
	void print();

}
