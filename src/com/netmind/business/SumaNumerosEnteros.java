package com.netmind.business;

public class SumaNumerosEnteros {
	public int[] generacionArray(){
		int [] arrayvalores = new int[100];
		for (int i=0;i<arrayvalores.length;i++)
			arrayvalores[i]=i;
		return arrayvalores;
	}
	public int sumaArray(int arrayvalores[]){
		int suma=0;
		for (int i=0;i<arrayvalores.length;i+=2)
			suma+=arrayvalores[i];
		return suma;
	}
}
