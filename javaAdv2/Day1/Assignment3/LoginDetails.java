package javaAdv2.Day1.Assignment3; 
 import java.util.Map; 
 import java.util.LinkedHashMap; 
 import java.util.Set; 
 import java.util.Iterator;  
 public class LoginDetails{ 
	 public void addSameKey(Map<Integer,String> map){ 
		 if(map.containsKey(3)){ 
			 System.out.println("Key present"); 
		} 
		 map.put(3,"Kashif"); 
	} 
	 
	 public void printLoginDetails(Map<Integer,String> map){ 
		 //Creating a set of keys of map 
		 Set<Integer> set=map.keySet(); 
		 Iterator<Integer> iterator=set.iterator();
		 while(iterator.hasNext()){ 
			 System.out.println(iterator.next()); 
		 } 
	 }  
	 public static void main(String args[]){ 
		 Map<Integer,String> map=new LinkedHashMap<Integer,String>(); 
		 map.put(1,"Sam"); 
		 map.put(2,"Wazzzaa"); 
		 map.put(3,"Messiii"); 
		 map.put(4,"Zeda"); 
		 System.out.println("Map before adding the same key 3"+ map); 
		 LoginDetails loginDetails=new LoginDetails(); 
		 loginDetails.addSameKey(map); 
		 System.out.println("Value for 3, after addSameKey() : "+map.get(3)); 
		 System.out.println("Map after adding the same key 3"+ map); 
		 loginDetails.printLoginDetails(map); 
	}
	 
 
	 
	 }
 