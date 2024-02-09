package com.collection_java101;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*  <<<<<<--------------HASHMAP----------->>>>>>   */
//points to remember

//map (interface) -> AbstractMap(abstractClass)    ->   HashMap<class> 

//1.HashMap is class impplenting the map interface 

//2.it stores in key value pair

//3.keys must be unquie value can be duplicated  and  it can store one null key and multiple null values

//4.it is non-synchronized mean not thread safe 

//5.it allow to  saves null values or one null key

//6.it is subclass of AbstractMap abstract class  

//7.order of the element is not guarented as it depends on the hashcode 

//and in order which it is inserted

//8.iteration can be done efficiently with entryset();



//all the methods of hashmap

//void clear()
//boolean containsKey(Object key)
//boolean containsValue(Object value)
//V get(Object key)
//boolean isEmpty()
//V put(K key, V value)
//void putAll(Map<? extends K,? extends V> map)
//V remove(Object key)
//int size()
//Set<Map.Entry<K,V>> entrySet()
//Set<K> keySet()
//Collection<V> values()
//boolean equals(Object o)
//int hashCode()
//V getOrDefault(Object key, V defaultValue)
//V putIfAbsent(K key, V value)
//void replaceAll(BiFunction<? super K,? super V,? extends V> function)
//void forEach(BiConsumer<? super K,? super V> action)
//V computeIfAbsent(K key, Function<? super K,? extends V> mappingFunction)
//V computeIfPresent(K key, BiFunction<? super K,? super V,? extends V> remappingFunction)
//V compute(K key, BiFunction<? super K,? super V,? extends V> remappingFunction)
//V merge(K key, V value, BiFunction<? super V,? super V,? extends V> remappingFunction)



public class HashMap_java101 {

	public static void main(String args[]) 
	{
		//declaring the hashmap 
		HashMap< String , Integer>  map1 =new HashMap<String, Integer>();
		
		//adding the key value in hashmap
		map1.put("a", 69);
		
		map1.put("b", 79);
		
		map1.put("c", 89);
		
		map1.put("d", 99);
		
		
		//iteratoring over the hashmap 
		
		//declaring the iterator 
		Iterator<Map.Entry<String , Integer>> a1=map1.entrySet().iterator();
		
		//while loop
		while (a1.hasNext()) {
			Map.Entry<String , Integer>  entry= a1.next();
			System.out.println("key :- " + entry.getKey()  +   " values :- " + entry.getValue());
		}
		
		
	}
	
	
}
