import java.util.*;
import java.util.Iterator;
public class Testclass {
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			
			Product product1 = new Product ("1", "Book", 2.0f, 25);
			Product product2 = new Product ("2", "Pen", 3.0f, 30);
			Product product3 = new Product ("3", "Pencil", 4.0f, 45);
			
			ArrayList<Product> al=new ArrayList<Product>();
		        al.add(product1);
		        al.add(product2);  
		        al.add(product3);  

		        Iterator<Product> itr=al.iterator(); 
		        Scanner sc=new Scanner(System.in);
				
				System.out.println("Enter the Product Id : ");
				
				String Id=sc.next();
				
				System.out.println("Enter no of products required : ");
				
				int  quant =sc.nextInt();
				
				Order order = new Order(Id,quant);
				
				//sc.close();

		        //traverse elements of ArrayList object  
		        while(itr.hasNext())
		        {  
		           Product st=(Product)itr.next(); 
		            
		        	if((st.getId()==order.getOrderId()) && (st.getQuantity() >= order.getQuantity())){
                    
		        		st.setQuantity(st.getQuantity()-order.getQuantity());	
                        
		        		System.out.println("Your Order is processed");
		        		//System.out.println("");
		        		
		        		 }
		         if(((st.getId()==order.getOrderId()) && (st.getQuantity() < order.getQuantity())))  {
		        		System.out.println("Your order cannot be processed");
		        		
		        }
		        	// if((st.getId()==order.getOrderId()) && (st.getQuantity()<order.getQuantity()));
		        	
		        	
		            
		        	
		        }  
		 
		
	}

}
