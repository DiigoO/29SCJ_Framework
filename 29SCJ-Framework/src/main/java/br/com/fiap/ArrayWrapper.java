package br.com.fiap;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.lang3.ArrayUtils;

public class ArrayWrapper {
	public ArrayWrapper() {
		String carros[] = new String[] {"Honda","Mercedes","Nissan"};
		
		System.out.println(ArrayUtils.indexOf(carros, "Honda"));
	}
	 public static void main( String[] args ) throws IllegalAccessException, InvocationTargetException{
	    	new ArrayWrapper();
	    }
}
