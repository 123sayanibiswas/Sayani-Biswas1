import java.util.*;
public class CarHashMap3 {
	public static void main(String[]args) {
		Map<String, Car> carMap=new HashMap<String, Car>();
		Car vw=new Car("4433200", 0, "black");
		Car honda=new Car("652000",0, "white");
		Car bmw=new Car("1204789",0, "brown");
		carMap.put( vw.getVin(),vw);
		carMap.put(honda.getVin(),honda);
		carMap.put(bmw.getVin(),bmw);
		Set<Map.Entry<String, Car>>cars=carMap.entrySet();
		System.out.println("Here are the mappings:");
		for(Map.Entry<String,Car>entry: cars)
		{
			System.out.println("Key="+ entry.getKey());
			System.out.println("Value="+entry.getValue());
			System.out.println();
		}
	}

}
