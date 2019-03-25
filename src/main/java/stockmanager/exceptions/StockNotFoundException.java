package stockmanager.exceptions;

public class StockNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -532524698403102163L;

	public StockNotFoundException(String message) {
		super(message);
	}
}