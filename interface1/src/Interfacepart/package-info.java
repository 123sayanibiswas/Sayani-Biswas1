package Interfacepart;
//all the method inside interface will be abstract

//you can have the abstract class by abstract keyword

abstract class Mobile {
	public void sendSMS() {
		System.out.println("Send SMS");
	}

	public void calling() {
		System.out.println(" 5 G calling");
	}

	abstract public void brand();

	abstract public void brand2();

	{
	}

	abstract class Apple extends Mobile {

		@Override
		public void brand() {
			// TODO Auto-generated method stub

		}

	}

	public class MyMobile {

		public void main(String[] args) {

			Apple A11 = new Apple();
			A11.sendSMS();
			A11.calling();
			A11.brand();

		}

	}
}
