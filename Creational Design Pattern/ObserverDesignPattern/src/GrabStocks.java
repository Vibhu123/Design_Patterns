
public class GrabStocks {

	public static void main(String[] args)
	{
		StockGrabber stockGrabber=new StockGrabber();
		
		StockObserver stockObserver1=new StockObserver(stockGrabber);
		
		stockGrabber.setIBMPrice(156.00);
		stockGrabber.setAAPLPrice(156.75);
		stockGrabber.setGOOGPrice(654.34);
		
		StockObserver stockObserver2=new StockObserver(stockGrabber);
		
		stockGrabber.setIBMPrice(156.00);
		stockGrabber.setAAPLPrice(156.75);
		stockGrabber.setGOOGPrice(654.34);
		
		stockGrabber.unregister(stockObserver1);
		stockGrabber.setIBMPrice(156.20);
		stockGrabber.setAAPLPrice(156.75);
		stockGrabber.setGOOGPrice(654.34);
	
		Runnable getIBM = new GetTheStock(stockGrabber,2,"IBM",197.00);
		Runnable getAAPL = new GetTheStock(stockGrabber,2,"AAPL",156.00);
		Runnable getGOOG = new GetTheStock(stockGrabber,2,"GOOG",197.34);
		
		new Thread(getIBM).start();
		new Thread(getAAPL).start();
		new Thread(getGOOG).start();
	
	}
	
}
