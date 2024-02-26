package com.chandara.UnitTesting.Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListsDemo {
	//1
	public static List<Integer> StringtoIntegerList(List<String> list){
		return list.stream().map(string->string.length())
				            .toList();
	}
	//2
	
	public static List<Integer> getEvenNumber(List<Integer> list){
		return list.stream().filter(num->num%2==0).toList(); 
	}
	//3
	public static List<Integer> getOldNumber(List<Integer> list){
		return list.stream().filter(num->num%2!=0).toList();
	}
	//4
	
	public static List<String> sortString(List<String> list){
		return list.stream().sorted().toList();
	}
	//5
	
	public static List<Integer> UingSkipAndLimitOperations(List<Integer> list){
		return list.stream().skip(2).limit(5).toList();
	}
	//6
	public static List<Integer> sumOfTwoList(List<Integer> list1,List<Integer> list2){
		List<Integer> result = new ArrayList<>();
		int minSize = Math.min(list1.size(),list2.size()); // [1,2,3] and [1,2,3,4] // 4 no need to sum
		result = IntStream.range(0, minSize)
				          .mapToObj(i->list1.get(i)+list2.get(i))
				          .collect(Collectors.toList());
		return result;
	}

}