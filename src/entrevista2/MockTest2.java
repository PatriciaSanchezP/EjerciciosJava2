package entrevista2;

import java.util.ArrayList;
import java.util.List;

public class MockTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int rows = 4; // Número de filas
	     int cols = 4; // Número de columnas

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
	        
	        int sum = 0;
	        int size = arr.size();
	        for (int i = 0; i < size/2; i++) {
	            for (int j = 0; j < size/2; j++) {
	                sum += Math.max( arr.get(i).get(j), 
	                    Math.max( arr.get(i).get(size-1-j),
	                    Math.max( arr.get(size-1-i).get(j), 
	                        arr.get(size-1-i).get(size-1-j))
	                    )  
	                );
	            }            
	        }
	       System.out.println(sum);
	        
	}

}
