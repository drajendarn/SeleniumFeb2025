package week2.day4.javaoops;

public class ConcreteClassJavaConnection extends AbstactionMySqlConnection {

	public static void main(String[] args) {
		ConcreteClassJavaConnection obj =new ConcreteClassJavaConnection();
		obj.connect();
		obj.disconnect();
		obj.executeUpdate();
		obj.executeQuery();

	}

	@Override
	public void executeQuery() {
		System.out.println("implementing abstarct menthod executeQuery in concrete class JavaConnection");
		
	}

}
