package entrevista2;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int rows = 3; // Número de filas
	     int cols = 3; // Número de columnas

	        List<List<Integer>> arr = new ArrayList<>();

	        // Llenar la matriz con valores
	        for (int i = 0; i < rows; i++) {
	            List<Integer> row = new ArrayList<>();
	            for (int j = 0; j < cols; j++) {
	                row.add(i * cols + j); // Valor a agregar
	            }
	            arr.add(row); // Agregar la fila a la matriz
	        }

	        // Imprimir la matriz
	        for (List<Integer> row : arr) {
	            System.out.println(row);
	        }
	        
	        int sumLeftRight = 0;
	        for (int i=0; i<arr.size(); i++) {
	        	sumLeftRight += arr.get(i).get(i);
	        }
	        
	        int sumRightLeft = 0;
	        for(int i = 0; i<arr.size(); i++) { 
	        	sumRightLeft+=arr.get(i).get(arr.size()-(i+1));
	        }
	        
	        int abs = Math.abs(sumLeftRight-sumRightLeft);
	        System.out.println(abs);

	        


	    }

	}
