import java.io.IOException;
public class CoronaTester {
public static void main (String [] args) throws IOException
{
	CoronaSolver test = new CoronaSolver ("smalltest.txt");
	System.out.println(test.solve());
}
	
}
