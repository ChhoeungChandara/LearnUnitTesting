package com.chandara.UnitTesting.productTesting;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.chandara.UnitTesting.product.productSorter;
import com.chandara.UnitTesting.product.products;

public class productTesting {
	
	@Test
	public void testSortProductByPrice() {
		products[] product = new products[] {
			new products("watch", 30),
			new products("nokia",120),
			new products("laptop", 1110)
		};
		
		productSorter.SortbyPrice(product);
		Assert.assertEquals("laptop", product[2].getName());
		Assert.assertEquals("nokia",  product[1].getName());
		Assert.assertEquals("watch",  product[0].getName());
	}

}
