package com.jenkins.practica;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import com.jenkins.utils.DogsOperations;

public class OperationsTests {

	/**
	 * Checks if the operation getRandomDogImage returns a .jpg
	 */
	private DogsOperations dogops;
	private String img;
	private ArrayList breeds;
	
	@Test
	public void testRandom() {
		// Instantiate DogsOperations class
		dogops = new DogsOperations();
		
		// Call getRandomDogImage operation and store the result on String
		img = dogops.getRandomDogImage();
		
		// Assert true if the result string ends with '.jpg'
		assertEquals(img.endsWith(".jpg"),true);
	}
	
	/**
	 * Checks if the operation getBreedList returns a list of dogs (f.e. size > 0)
	 */
	@Test
	public void breedsList() {
		// Instantiate DogsOperations class
		dogops = new DogsOperations();
		
		// Call getBreedList operation and store the result on ArrayList
		breeds = dogops.getBreedList();
		
		// Assert true if the result ArrayList has size of more than 0
		assertEquals(breeds.size()>=1,true);
	}
}
