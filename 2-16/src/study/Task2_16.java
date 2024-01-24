package study;


public class Task2_16 {
		

	public static void main(String[] args) {
		
		//問①
		 String firstName = "神近";
		 String lastName = "一成";
		 
		 
		
		System.out.println(getName(firstName, lastName));
        System.out.println();
        
        
        int[] arr = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        

	        for(int n =0; n <arr.length; n++) {
	        	if(arr[n]%2!=0) {
	        		System.out.println(arr[n] + "は奇数です。");
	        		
	        	}
	    
	        }
	        
	        }
	        
	        
	        public static String  getName(String firstName,String lastName) {
	        	return firstName+lastName;
	        	
	        }
	        
	        public static void isOdd(int num) {
	            if(num % 2 != 0) {
	                System.out.println(num + "は奇数です。");
  
	       }  
      }
		
}