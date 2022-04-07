import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
public class MyMap {
	public static void main(String[] args) {
		TreeMap<String,Integer>evenNumbers=new TreeMap();
		evenNumbers.put("Two",2);
		evenNumbers.put("Four",4);
		evenNumbers.putIfAbsent("Six",6);
		System.out.println("TreeMap of even numbers:" +evenNumbers);
		TreeMap<String,Integer>numbers=new TreeMap<>();
		numbers.put("One",1);
		numbers.putAll(evenNumbers);
		System.out.println("TreeMap of numbers:" +numbers);		
		}
}
	

