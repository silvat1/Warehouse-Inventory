package team2.inventory.controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;

import team2.inventory.controller.database.Connector;
import team2.inventory.controller.database.Query;
import team2.inventory.controller.database.Update;
import team2.inventory.model.Inventory;

/** Database testing driver.
 * @author James A. Donnell Jr. */
public class DatabaseTestDriver {

	/** Testing all tables in database.
	 * @param args Database table, username and password on seperate lines. */
	public static void main(String[] args) {
		try {
			Connection connection = Connector.createConnection(args[0], args[1], args[2]);
			//allTests(connection);

			Update.updateInventory(connection,
					new Inventory(1, 1, 5, 1, 1, 0, Date.valueOf("2015-07-06"), null, 1, 0));

			connection.close();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

	@SuppressWarnings("unused")
	private static void allTests(Connection connection) throws SQLException {
		System.out.println("All Barcodes:\n" + Query.getBarcodes(connection) + "\n");
		System.out.println("All Companies:\n" + Query.getCompanies(connection) + "\n");
		System.out.println("All Items:\n" + Query.getItems(connection) + "\n");
		System.out.println("All Item Types:\n" + Query.getItemTypes(connection) + "\n");
		System.out.println("All Locations:\n" + Query.getLocations(connection) + "\n");
		System.out.println("All Privileges:\n" + Query.getPrivileges(connection) + "\n");
		System.out.println("All Users:\n" + Query.getUsers(connection) + "\n");
		System.out.println("All Inventory:\n" + Query.getInventory(connection));

		System.out.println(Query.getBarcodeByID(connection, 1));
		System.out.println(Query.getBarcodesByBarcode(connection, "ABCDEFG"));
		System.out.println(Query.getCompanyByID(connection, 2));
		System.out.println(Query.getItemByID(connection, 1));
		System.out.println(Query.getLocationByID(connection, 1));
		System.out.println(Query.getUserByID(connection, 2));
		System.out.println(Query.getInventoryByID(connection, 1));
	}
}