package week2.day4.javaoops;

public class InterfaceConcreteClass implements InterfaceDatabseConnection{

	public static void main(String[] args) {
		
		InterfaceConcreteClass obj=new InterfaceConcreteClass();
		obj.connect();
		obj.disconnect();
		obj.executeUpdate();
	}

	@Override
	public void connect() {
		System.out.println("connect method implemented in concrete class");
		
	}

	@Override
	public void disconnect() {
		System.out.println("disconnect method implemented in concrete class");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("executeUpdate method implemented in concrete class");
		
	}

}
