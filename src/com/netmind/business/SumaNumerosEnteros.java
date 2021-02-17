package com.netmind.business;

public class SumaNumerosEnteros {
	public int [] arraydevalores = new int[100];
	public int[] generacionArray(int [] arrayvalores){
		for (int i=0;i<arrayvalores.length;i++)
			arrayvalores[i]=i;
		return arrayvalores;
	}
	public int sumaArray(int arrayvalores[]){
		int suma=0;
		for (int i=0;i<arrayvalores.length;i++){
			if(i%2==0){
				suma+=arrayvalores[i];
			}
			System.out.println(i);
		}
		return suma;
	}
}
