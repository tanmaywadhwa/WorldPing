import java.io.IOException;
import java.util.Scanner;
public class WorldPing {
	public static void main(String[] args) throws IOException, InterruptedException{
		System.out.println("Press Y to begin, Q to quit");
		Scanner sn=new Scanner(System.in);
		String input=sn.nextLine();
		while(!(input.equals("Y")||input.equals("Q"))){
			System.out.println("Invalid entry! Press Y to begin, Q to quit");
			sn=new Scanner(System.in);
			input=sn.nextLine();	
		}
		sn.close();
		if(input.equals("Q")){
			System.exit(0);
		}
		else{
			// this is where I would start creating threads and pinging computers and probably end up killing my router! :p
			System.out.println("Starting dude!");
		    int a=205,b=254,c=254,d=254;
		    while(a>0){
		    	b=254;
		    	while(b>0){
		    		c=254;
		    		while(c>0){
		    			d=254;
		    			while(d>0){
		    				Thread t=new Thread(new PingIP(a,b,c,d));
		    				Thread.sleep(1);
		    				t.start();
		    				d--;
		    						    				
		    			}
		    			System.out.print("\n");
		    			System.out.print(a+"."+b+"."+c+"."+d+"\n");
		    			c--;
		    		}
		    		b--;
		    	}
		    	a--;
		    }
		    
		    

		  System.out.println("Pings complete");
		  Thread.sleep(10000);
			
		}
	
	}

}
