package stockmanager.dao;

import java.sql.SQLException;

import stockmanager.beans.Stock;


public interface StockDao {

	int insertStock(Stock stock) throws SQLException;

	int updateStock(Stock stock) throws SQLException;
	
	Stock getStockByTicker(String ticker) throws SQLException, ClassNotFoundException;
	
	int deleteStock(Stock stock) throws SQLException;
	
	void closeConnection() throws SQLException;
	
}
