package entrevista2;

import java.util.ArrayList;
import java.util.List;

public class Hackerrank2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Plus minus
		List <Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(1);
		arr.add(0);
		arr.add(-1);
		arr.add(-1);
		int positive = 0;
		int negative = 0;
		int zero = 0;
		
		for(int i= 0; i<arr.size(); i++) {
			if(arr.get(i)>0) {
				positive ++;
			} else if (arr.get(i)<0) {
				negative ++;
			} else {
				zero ++;
			}
		}
		
		double ratioPositive = (double) positive/arr.size();
		double ratioNegative = (double) negative/arr.size();
		double ratioZero = (double) zero/arr.size();
		
		System.out.printf("%.6f%n" ,ratioPositive);
		System.out.printf("%.6f%n", ratioNegative);
		System.out.printf("%.6f%n", ratioZero);
	}

}
