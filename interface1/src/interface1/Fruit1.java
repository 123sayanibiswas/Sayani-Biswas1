package interface1;

public interface Fruit1 {
	public void grow();//abstract type method
	public static void test()//static method of interface
	{
		System.out.println("static method of fruit interface");
	}
	default void demo()//default method inside interface
	{
		System.out.println("default demo method inside interface");
	}

}


