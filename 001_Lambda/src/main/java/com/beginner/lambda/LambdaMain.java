package com.beginner.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

interface Welcome{
	public String sayMessage(String message, String name);
}

public class LambdaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Welcome w = (msg, name) ->  {
			String nm = name;
			String mg = msg;
			return nm  + " " + mg; 	
		};	
	System.out.println(w.sayMessage("Java 8", "OBB"));
		
	List<String> friends = new ArrayList<>();
	friends.add("OBB");
	friends.add("BNP");
	friends.add("OWIOH");
	friends.add("MLANN");
	friends.add("ABCD");
	
	//imperative way
	for(String f: friends) {
		System.out.println(f);
	}
	System.out.println("---------------------------");
	//non-blocking way using foreach
	friends.forEach((f)->{
		System.out.print(f + " length is ");
		System.out.println(f.length());
	});
	//sort the list!
	System.out.println("---------------------------");
	Collections.sort(friends, (n1, n2)->{
		return n1.compareTo(n2);
	});
	
	friends.forEach((f)->{
		System.out.println(f );
		
	});
	
	//filter the list of friends!
	System.out.println("---------------------------");
	Stream<String> friendStream = friends
							.stream()	
							.filter(f-> f.length()>3);
	friendStream.forEach(f -> System.out.println(f));
	
		
	}
	
	
	
	

	

}



