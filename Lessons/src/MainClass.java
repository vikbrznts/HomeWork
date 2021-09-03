public class MainClass {
	public MainClass() {
	}	
	
	
	public static void main(String[] args) { 
		
		
		MainClass object = new MainClass();
		object.loops();
	}
			
	
	private void loops() {
		
	}	
	
		int[] myNum = {10, 20, 30, 40}; 
		int sum = 0; {
	    for (int i = 0; i<myNum.length; i++) {
	    System.out.println(myNum [i]);
	    sum += myNum[i];
	    }
	    
	    System.out.println(String.format("The sum is : %d", sum));
	    
	    
	    sum = 0;
	    for (int v : myNum) {
	    	if (v == 3) break;
	    	sum += v;
	    }
	    System.out.println(String.format("The sum is : %d", sum));
	    
 
	    
	    int secondSum = 0;
	    int b = 0;
	        while (b <= 3) {
	        secondSum += myNum[b];
		    b++;}
		System.out.println(String.format("The sum is : %d", secondSum));
		
		
		
		int thirdSum = 0;
	    int n = 0;
	    do {
	      	thirdSum += myNum[n];
	    	n++;
	    } while (n <=3);
	    System.out.println(String.format("The sum is : %d", thirdSum));
	   
	  		    
	}
}
		      		      
		     