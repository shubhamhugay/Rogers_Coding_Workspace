package com.collection_java101;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

/*  <<<<<<hashtable>>>>>>   */
//points to remember
//map + serializable + cloneable (interface)    ->   HashTable<class> extending the Dictionary<class>
//1.Hashtable is a legacy class that implements hashtable
//2.it stores in key value pair
//3.keys must be unquie value can be duplicated
//4.it is synchronized means thread safe decreased performance
//5.it does not saves null values or key
//6.it is subclass of dictionary abstract class which saves key value 
//7.order of the element is not guarented as it depends on the hashcode 
//and in order which it is inserted

//methods of hashtable 
//size()
//isEmpty()
//keys()
//elements()
//contains()
//containKey()
//containValue()
//get()
//put()
//remove()
//putAll()
//clear()
//clone()
//toString()
//rehash()
//equals()
//hashCode()


//only inportant operations
public class HashTable_java101 {

	public static void main(String[] args) {
	

//		declaring hashtable storing integer type of value 
		Hashtable<String , Integer> table1=new Hashtable<>();
		
		
//	    adding items in key value pair in hashtable
		table1.put("a",55);
		table1.put("b", 100);
		table1.put("c",55);
		table1.put("d", 100);

//		iterating over the hashtable 
//		defining the iterator
		Iterator<Map.Entry<String, Integer>> l1=table1.entrySet().iterator();
		
//		iterating
		while(l1.hasNext()) {
			Map.Entry<String , Integer> entry =l1.next();
			System.out.println("key:- " + entry.getKey() + " value :- " + entry.getValue());
		}
		
	}
	
	
}


