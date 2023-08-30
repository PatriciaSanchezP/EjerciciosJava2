package entrevista2;

import java.util.ArrayList;
import java.util.List;

public class Hackerrank1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr = new ArrayList<>();
		arr.add(3);
		arr.add(7);
		arr.add(5);
		arr.add(6);
		arr.add(2);
		
		List<Integer> subsetA = new ArrayList<>();
		List<Integer> subsetB = new ArrayList<>();
		
		int maxSum=0;
		

	for(int i = 0; i<arr.size(); i++) {
		for(int j= i+1; j<arr.size(); j++) {
			int sum = arr.get(i)+arr.get(j);
			System.out.println(sum);
			if(sum>maxSum) {
				maxSum=sum;

			}
		}
	}
	
	System.out.println();
	System.out.println(maxSum);
	System.out.println();
	
	for(int i=0; i<arr.size(); i++) {
		for(int j= i+1; j<arr.size(); j++) {
			if(arr.get(i)+arr.get(j)==maxSum) {
				subsetA.add(arr.get(i));
				subsetA.add(arr.get(j));
				subsetA.sort(null);
				System.out.println(subsetA.get(0));
				System.out.println(subsetA.get(1));
			}
		}
	}
				
	for(int i=0; i<arr.size(); i++) {
			if (subsetA.contains(arr.get(i))) {
				continue;
		} else {
			subsetB.add(arr.get(i));
			subsetB.sort(null);
		}
	}
	
	System.out.println();
 System.out.println(subsetB.get(0));
 System.out.println(subsetB.get(1));
 System.out.println(subsetB.get(2));
	}
//
}
