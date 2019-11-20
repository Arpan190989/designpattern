
public class MoneyTransaction {
	

   
    private static MoneyTransaction tran = null; 
  
 
    public String name; 
  
   
    private MoneyTransaction() 
    { 
    	name = "This is money transaction";
    } 
  
    
    public static MoneyTransaction getInstance() 
    { 
        if (tran == null) 
        	tran = new MoneyTransaction(); 
  
        return tran; 
    } 

}
