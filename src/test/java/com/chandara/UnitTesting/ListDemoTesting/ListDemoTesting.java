package com.chandara.UnitTesting.ListDemoTesting;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import org.junit.jupiter.api.Test;
import com.chandara.UnitTesting.Collections.ListsDemo;
public class ListDemoTesting {
	
	//1
	@Test
	public void convertListOfStringToListOfInteger() {
		
		List<String> string = List.of("apple","banana","hello");
		List<Integer> integerList = ListsDemo.StringtoIntegerList(string);
		assertEquals(3,integerList.size());
		assertEquals(5,integerList.get(0));
		assertEquals(6,integerList.get(1));
		assertEquals(5,integerList.get(2));
	}
	//2
	@Test
	public void getEvenNumberTest() {
		List<Integer> num = List.of(4,6,7,8);
		List<Integer> expectedNum = List.of(4,6,8);
		List<Integer> evenNumber = ListsDemo.getEvenNumber(num);
		assertEquals(3,evenNumber.size());
		assertEquals(expectedNum,evenNumber);
	}
	//3
	@Test
	public void getOldNumberTest() {
		List<Integer> num = List.of(3,4,5,6,8,9,11);
		List<Integer> expectedNum = List.of(3,5,9,11);
		List<Integer> oldNum = ListsDemo.getOldNumber(num);
		assertEquals(4, oldNum.size());
		assertEquals(expectedNum,oldNum);
	}
	//4
	@Test
	public void sortStringTest() {
		List<String> strings = List.of("apple","egg","phone","banana");
		List<String> expectList = List.of("apple","banana","egg","phone");
		List<String> sortList = ListsDemo.sortString(strings);
		assertEquals(4, sortList.size());
		assertEquals(expectList,sortList);
	}
	//6
	@Test
	public void sumOfTwoList() {
		List<Integer> list1 = List.of(1,2,3);
		List<Integer> list2 = List.of(3,4,6);
		List<Integer> expectedResult = List.of(4,6,9);
		List<Integer> sumOfTwoList = ListsDemo.sumOfTwoList(list1, list2);
		assertEquals(3,sumOfTwoList.size());
		assertEquals(expectedResult,sumOfTwoList);
	}
	//5
	@Test
	public void skipAndLimitOperatiosTest() {
		List<Integer> lists = List.of(1,2,3,4,5,6,7,8,11,23);
		List<Integer> expectedResult = List.of(3,4,5,6,7);
		List<Integer> list1 = ListsDemo.UingSkipAndLimitOperations(lists);
		assertEquals(5,list1.size());
		assertEquals(expectedResult, list1);
	}
	

}