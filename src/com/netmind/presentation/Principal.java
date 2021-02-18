package com.netmind.presentation;

//import com.netmind.business.Calculator;
import com.netmind.business.SumaNumerosEnteros;

public class Principal {

	public static void main(String[] args) {
		SumaNumerosEnteros suma= new SumaNumerosEnteros();
		System.out.println(suma.sumaArray(suma.generacionArray()));
	}

}
