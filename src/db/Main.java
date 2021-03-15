package db;

public class Main {

	public static void main(String[] args) {
		DBConnection.setServerAddress("hildur.ucn.dk");
		DBConnection.setDBName("dmab0920_11111");
		DBConnection.setDBLogin("dmab0920_11111", "");
		
		try {
			DBConnection.getInstance();
		} catch (DataAccessException e) {
			System.out.println("sadge");
		}
		System.out.println("Happii");
	}

}
