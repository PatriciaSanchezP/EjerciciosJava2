package entrevista2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LonelyInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(1);
		a.add(3);
		a.add(4);
		a.add(2);
		a.add(2);
		a.add(3);
		
	     Map<Integer, Integer> countMap = new HashMap<>();
	        for (int num : a) {
	            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
	        }
	        
	        for (int key : countMap.keySet()) {
	            int value = countMap.get(key);
	            if(value==1) {
	           System.out.println(key);
	            	break;
	            }

	        }
	       
		}
	}

