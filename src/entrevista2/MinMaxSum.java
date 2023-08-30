package entrevista2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinMaxSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Integer> arr = new ArrayList<>();
		arr.add(5);
		arr.add(5);
		arr.add(5);
		arr.add(5);
		arr.add(5);
		int maxValue = Collections.max(arr);
		int minValue = Collections.min(arr);
		System.out.println(maxValue);
		System.out.println(minValue);
		int sum = 0;
		
		for (int i = 0; i < arr.size(); i++) {
			sum += arr.get(i);
		}
		
		int minSum = sum-maxValue;
		int maxSum = sum-minValue;
		

		System.out.println(minSum + " " +  maxSum);
	}

}
