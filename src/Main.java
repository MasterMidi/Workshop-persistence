

import db.DBConnection;
import db.DataAccessException;
import Enviroment.ENV;

public class Main {

	public static void main(String[] args) {
		
		
		DBConnection.setServerAddress(ENV.db_host);
		DBConnection.setDBName(ENV.db_name);
		DBConnection.setDBLogin(ENV.db_user, ENV.db_password);
		
		try {
			DBConnection.getInstance();
		} catch (DataAccessException e) {
			System.out.println("sadge");
		}
		System.out.println("Happii");
	}

}
