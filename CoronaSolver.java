import java.util.*;
import java.io.*;

public class CoronaSolver {
	static int n, f;
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
		n = scan.nextInt();
		f = scan.nextInt();
	}

	public String solve() {
		LA = new int[n];
		NY = new int[n];
		for (int i = 0; i < n; i++) {
			LA[i] = scan.nextInt();
			NY[i] = scan.nextInt();
		}

		scan.close();
		return "";
	}


}
