package com.netmind.presentation;

import com.netmind.business.Calculator;
import com.netmind.business.SumaNumerosEnteros;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola mundo");
		Calculator calculadora = new Calculator();
		System.out.println(calculadora.add(14, 15));
		SumaNumerosEnteros suma= new SumaNumerosEnteros();
		//suma.generacionArray(suma.arrayvalores);
		System.out.println(suma.sumaArray(suma.generacionArray(suma.arraydevalores)));
	}

}
