import java.util.*;
import java.io.*;

public class CoronaSolver {
	
	// let n = total number of days
	// let f = number of people infected from each flight
	int n, f;
	
	//Returns a string of Ls and Ns to designate which days to spend

	//in Los Angeles and New York City such that we will be exposed

	//to as few infected people as possible.  inputFileName’s file

	//will be in the following format:

	//The first line will be the total number of days, n.

	// The second line will be the number of people you’re exposed to

	// on a flight, F.

	//Every subsequent line will have two numbers, separated by //spaces:

	// Li Ni

	public String solve(String inputFileName) throws FileNotFoundException {
		Scanner scan = new Scanner (new File (inputFileName));
		
		n = scan.nextInt();
		f = scan.nextInt();
		
		
		
		scan.close();
		return "";
	}


}
