package stockmanager.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import stockmanager.beans.Stock;
import stockmanager.controller.DbController;
import stockmanager.exceptions.StockNotFoundException;

public class DefaultStockDao implements StockDao {

	private DbController db;
	
	private Statement statement;
	
	private static Logger log = Logger.getLogger(DefaultStockDao.class);

	private void init() throws ClassNotFoundException, SQLException {
		if (db == null) {
			db = DbController.getInstance();
		}
		statement = db.getConnection().createStatement();
	}
	
	public DefaultStockDao() throws ClassNotFoundException, SQLException {
		init();
	}
	public void closeConnection() throws SQLException {
		statement.close();
	}
	
	public int insertStock(Stock stock) throws SQLException {
		//TODO fill values
		String sql = String.format(	"INSERT INTO STOCKS(NAME,TICKER) VALUES ('%s', '%s')",null, null);
		return statement.executeUpdate(sql);
	}

	public int updateStock(Stock stock) throws SQLException {
		String sql = String.format("UPDATE STOCKS SET NAME = '%s', TICKER = '%s' WHERE ID = %s",null, null, null);
		log.debug("SQL: "+sql);
		return statement.executeUpdate(sql);
	}

	public Stock getStockByTicker(String ticker) throws SQLException, ClassNotFoundException {
		String query = String.format("SELECT * FROM STOCKS WHERE TICKER ='%s'", ticker);
		ResultSet response = statement.executeQuery(query);
		if (response.next()) {
			//TOOO create object 
			
			//TODO load TimeSeries
			return null;
		} else {
			throw new StockNotFoundException("Stock not found");
		}
	}
	
	public List<Stock> getAlllStocks() throws SQLException {
		List<Stock> stocks = new ArrayList<>();
		String query = "SELECT * FROM STOCKS";
		ResultSet response = statement.executeQuery(query);
		while (response.next()) {
			//TOOO create object 
			
			//TODO load TimeSeries
		} 
		return stocks;
	}

	public int deleteStock(Stock stock) throws SQLException {
		//TODO pass ID
		String sql = String.format("DELETE FROM STOCKS WHERE ID=%s", null);
		return statement.executeUpdate(sql);
	}
}
