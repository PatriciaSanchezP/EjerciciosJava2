package entrevista2;

import java.util.ArrayList;
import java.util.List;

public class MockTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<List<Integer>> petrolpumps = new ArrayList<>();

        // Crear listas secundarias y agregarlas a la lista principal
        List<Integer> lista1 = new ArrayList<>();
        lista1.add(1);
        lista1.add(5);

        List<Integer> lista2 = new ArrayList<>();
        lista2.add(10);
        lista2.add(3);
        
        List<Integer> lista3 = new ArrayList<>();
        lista3.add(3);
        lista3.add(4);

        petrolpumps.add(lista1);
        petrolpumps.add(lista2);
        petrolpumps.add(lista3);
        int currentPetrol = 0;
        int index = 0;
        
        
        
        for(int i = 0; i<petrolpumps.size(); i++){
        	currentPetrol += petrolpumps.get(i).get(0);
        	currentPetrol -= petrolpumps.get(i).get(1);
        	if(currentPetrol<0) {
        		currentPetrol = 0;
        		index = i+1;
        	}
        }
        
        System.out.println(index);
        	
        
        

	}

}
