
public abstract class Mobilebrand {
	public abstract void calsgst(double price,float gst);
	public abstract void calcgst(double price,float gst);
	 // constructor
	public Mobilebrand () {
		System.out.println("i'm in abstract constructor");
		
		
	}
       class Samsung extends Mobilebrand{
    	   public Samsung () {
    		   super();
    		   System.out.println("i'm in samsung constructor");
    	   }
    	   

		
		public void calsgst(double price, float gst) {
			double sgst = (price/100)*9;
			System.out.println("sgst of samsung mobile:"+sgst);
			
					}

	
		public void calcgst(double price, float gst) {
			double cgst = (price/100)*9;
			System.out.println("sgst of samsung mobile:"+cgst);
			
		}
		
      } 
}
