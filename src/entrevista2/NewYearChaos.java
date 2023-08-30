package entrevista2;

import java.util.ArrayList;
import java.util.List;

public class NewYearChaos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> q = new ArrayList<>();
		q.add(4);
		q.add(1);
		q.add(2);
		q.add(3);
		
		int count = 0;
		boolean chaotic = false;

		for (int i = 0; i < q.size(); i++) {
		    if (q.get(i) - (i + 1) > 2) {
		        chaotic = true;
		        break;
		    } else {
		        for (int j = Math.max(0, q.get(i) - 2); j < i; j++) {
		            if (q.get(j) > q.get(i)) {
		                count++;
		            }
		        }
		    }
		}

		if (chaotic) {
		    System.out.println("Too chaotic");
		} else {
		    System.out.println(count);
		}
	}

}
