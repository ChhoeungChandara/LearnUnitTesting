package com.chandara.UnitTesting.Collections;

import java.util.List;

public class ListsDemo {
	
	public static List<Integer> toIntegerList(List<String> list){
		
		return list.stream().map(string->string.length())
				            .toList();
	}
	
	public static List<Integer> getEvenNumber(List<Integer> list){
		return list.stream().filter(num->num%2==0).toList(); 
	}
	
	public static List<Integer> getOldNumber(List<Integer> list){
		return list.stream().filter(num->num%2!=0).toList();
	}
	
	public static List<String> sortString(List<String> list){
		return list.stream().sorted().toList();
	}

}