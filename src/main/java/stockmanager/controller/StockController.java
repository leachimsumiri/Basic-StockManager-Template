package stockmanager.controller;


import java.sql.SQLException;


import stockmanager.beans.Stock;

public class StockController {
	
	
	public StockController() throws ClassNotFoundException, SQLException {
	}
	
	public void process() {
		//TODO load all Tickers from the db 
		
		// load all quotes for the defined tickers
	}
	
	public void save(Stock stock) throws SQLException {
		//TODO save the bean
		
	}

	public void loadQuote(Stock stock) {
		//TODO add info for the logger 
		
		//TODO use IEXTradingClient to load quotes

		//TODO update the name in the database of the stock
		
		//TODO save the time series
	}
	
	public void calcStatistics(Stock stock) {
		//TODO calc some statistics 
	}
}
