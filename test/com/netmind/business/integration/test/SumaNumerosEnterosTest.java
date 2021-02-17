package com.netmind.business.integration.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.netmind.business.SumaNumerosEnteros;

public class SumaNumerosEnterosTest {

	@Test
	public void testGeneracionArray() {
		SumaNumerosEnteros suma= new SumaNumerosEnteros();
		suma.generacionArray(suma.arraydevalores);
	}

	@Test
	public void testSumaArray() {
		SumaNumerosEnteros suma= new SumaNumerosEnteros();
		assertEquals(suma.sumaArray(suma.generacionArray(suma.arraydevalores)),2450);
	}

}
