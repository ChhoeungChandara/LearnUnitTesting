package com.chandara.UnitTesting.product;

import java.util.Arrays;

public class productSorter {
	public static void SortbyPrice(products[] product) {
		// Use Arrays.sort method with a lambda expression to define the sorting criteria
		  // The lambda expression compares two Product objects based on their price.
		Arrays.sort(product,(p1,p2)->Double.compare(p1.getPrice(),p2.getPrice()));
		
	}
}
