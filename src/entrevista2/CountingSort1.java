package entrevista2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountingSort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(1);
		arr.add(3);
		arr.add(2);
		arr.add(1);
		
        Map<Integer, Integer> countMap = new HashMap<>();
        
        int n = 4;
        
        for(int i=0; i<n; i++) {
        	countMap.put(i, 0);
        }
        
        
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        List<Integer> result = new ArrayList<>();
        
        for (int i=0; i<countMap.size(); i++) {
        	result.add(countMap.get(i));
 
        }
        
       	System.out.println(result);
        

		

	}

}
