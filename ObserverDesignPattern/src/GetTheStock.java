import java.text.DecimalFormat;


public class GetTheStock implements Runnable{

	private String stock;
	private double price;
	private int startTime;
	
	private Subject stockGrabber;
	
	public GetTheStock(Subject newStockGrabber,int newStartTime,String newStock,
				double newPrice)
	{
		this.stockGrabber=newStockGrabber;
		this.price=newPrice;
		this.startTime=newStartTime;
		this.stock=newStock;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=20;i++)
		{
			try
			{
				Thread.sleep(2000);
			}catch(InterruptedException e){}
			
			double randNum=(Math.random()*(.06))-0.03;
			DecimalFormat df=new DecimalFormat("#.##");
			price=Double.valueOf(df.format(price+randNum));
			
			if(stock=="IBM")
				((StockGrabber) stockGrabber).setIBMPrice(price);
			if(stock=="AAPL")
				((StockGrabber) stockGrabber).setAAPLPrice(price);
			if(stock=="GOOG")
				((StockGrabber) stockGrabber).setGOOGPrice(price);
			
			System.out.println(stock+": "+df.format((price+randNum))
					+" "+df.format(randNum));
			System.out.println();
		
		}
	}

}
