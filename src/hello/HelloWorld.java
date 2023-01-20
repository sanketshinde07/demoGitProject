package hello;
import java.math.BigInteger;

public class HelloWorld {
	public static void main(String []args)
	{
		System.out.println("Hello World");
		
		BigInteger b = new BigInteger("1234567891234567892232312221");
        BigInteger e = new BigInteger("561");
        BigInteger m = new BigInteger("1000");
        BigInteger result = b.mod(m);
        System.out.println(result);
        
        char c='1';  
        int a=Integer.parseInt(c+"");  
        System.out.println(a);  
	}

}
