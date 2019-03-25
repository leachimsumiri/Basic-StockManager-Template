package stockmanager;

import java.sql.SQLException;

import stockmanager.controller.StockController;

public class MCP {

	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		StockController st = new StockController();
		st.process();
	}
}
