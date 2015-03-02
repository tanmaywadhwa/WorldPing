import java.net.InetAddress;


public class PingIP implements Runnable {
	static int a,b,c,d;
	public PingIP(int ina,int inb, int inc, int ind){
		a=ina;
		b=inb;
		c=inc;
		d=ind;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		InetAddress inet;
		try {
			inet=InetAddress.getByAddress(new byte[] { (byte)a, (byte)b, (byte)c, (byte)d });
			if(inet.isReachable(4000))
				System.out.print("\n _"+a+"."+b+"."+c+"."+d+"\n");
			else
				System.out.print(".");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
