package week2.day4.javaoops;

  public abstract class AbstactionMySqlConnection implements InterfaceDatabseConnection
  {
	  @Override
		public void connect() {
			System.out.println("connect method implemented in abstarct class");
			
		}

		@Override
		public void disconnect() {
			System.out.println("disconnect method implemented in abstarct class");
			
		}

		@Override
		public void executeUpdate() {
			System.out.println("executeUpdate method implemented in abstarct class");
			
		}

		abstract public void executeQuery();
		{
			
		}
}
