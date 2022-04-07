import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CarMain {
	
	
	public static void main(String[] args) {
		Map<String, Car> carMap=new HashMap<String, Car>();
		Car vw=new Car("1", 0, "black");
		Car honda=new Car("2",0, "white");
		Car bmw=new Car("3",0, "brown");
		carMap.put("1",vw);
		carMap.put("2",honda);
		carMap.put("3",bmw);
		Set<String> keys=carMap.keySet();
		for(String key:keys)
		{
			System.out.println("Key is "+key +" valye "+carMap.get(key));
		}
	}

}
