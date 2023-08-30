package entrevista2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GridChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> grid = new ArrayList<>();
		grid.add("hbc");
		grid.add("fde");
		grid.add("feg");
		
		List<String> nuevaGrid = new ArrayList<>();
		
		for (String word : grid) {
			char[] caracteres = word.toCharArray();
	        Arrays.sort(caracteres);
	        String palabraOrdenada = new String(caracteres);
	        nuevaGrid.add(palabraOrdenada);
		}
		
		int palabraLength = nuevaGrid.get(0).length();
		
		for (int i=0; i<palabraLength; i++) {
			for(int j=0; j<grid.size()-1; j++) {
				if(nuevaGrid.get(j).charAt(i)>nuevaGrid.get(j+1).charAt(i)) {
					System.out.println("no");
				} else {
					System.out.println("Si");
				}
				
			}
		}
		
		System.out.println(nuevaGrid);
		


	}

}
