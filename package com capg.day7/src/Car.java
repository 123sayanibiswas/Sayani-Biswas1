
public class Car {
	static String name;
	static int price1;
	static String color;
	
	  Car(String name,int price,String color) {
		
		this.name=name;
		this.price1=price1;
		this.color=color;
	}
	public String getname() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	
	public int getprice() {
		return price1;

}
	public void setprice(int price) {
		this.price1=price;
	}
	public String getcolor() {
		return color;
}
	public void secolor(String color) {
		this.color=color;
	}
	public String toString() {
		return "name: " +this.name+" price " +price1 +" color "+color;
	}}