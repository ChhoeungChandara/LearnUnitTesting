package com.chandara.UnitTesting.Caculator;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import com.chandara.UnitTesting.math.array;
public class findingMaxArrayTest {
	@Test
	public void TestingToFindingMaxArray() {
		int[] arr = {1,24,5,6,7,4,22};
		int expectedNum = 24;
		 Assert.assertEquals(expectedNum,array.findingMaxArray(arr)); 
	}
	@Test
	public void TestingToFindingMinArray() {
		int[] arr = {1,33,4,6,7};
		int expectedNum= 1;
		Assert.assertEquals(expectedNum,array.findingMinArray(arr));
	}
	@Test
	public void TesgingToFindSumOfArray() {
		int[] arr = {1,2,3,4};
		int expectedNum = 10;
		Assert.assertEquals(expectedNum,array.sumOfArray(arr));
	}
}
