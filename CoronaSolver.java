import java.util.*;
import java.io.*;

public class CoronaSolver {
	static int days, flight;
	static int [] LA, NY;
	static Scanner scan;
	// let n = total number of days
	// let f = number of people infected from each flight

	//Returns a string of Ls and Ns to designate which days to spend

	//in Los Angeles and New York City such that we will be exposed

	//to as few infected people as possible.  inputFileName’s file

	//will be in the following format:

	//The first line will be the total number of days, n.

	// The second line will be the number of people you’re exposed to

	// on a flight, F.

	//Every subsequent line will have two numbers, separated by //spaces:

	// Li Ni
	public CoronaSolver (String inputFileName) throws FileNotFoundException {
		scan = new Scanner (new File (inputFileName));
		days = scan.nextInt();
		flight = scan.nextInt();
	}

	public int solve() {
		LA = new int[days];
		NY = new int[days];
		for (int i = 0; i < days; i++) {
			LA[i] = scan.nextInt();
			NY[i] = scan.nextInt();
		}
		int [] newLA = new int[days];
		newLA[days-1] = LA[days-1];
		int [] newNY = new int[days];
		newNY[days-1] = NY[days-1];
		
		for (int i=days-2; i>=0; i--)
		{
			newNY[i]=Math.min(NY[i]+flight, LA[i]);
			newLA[i] = Math.min(NY[i]+flight, LA[i]);
			
		}
		scan.close();
		return Math.min(newLA[0], newNY[0]);
	}


}
