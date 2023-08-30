package entrevista2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CaesarCipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "abcdefghijklmnopqrstuvwxyz";
		System.out.println(a.length());
		String A = a.toUpperCase();
		List<String> alphabet = new ArrayList<String>(Arrays.asList(a.split("")));
		String s = "Hello_World!";
	    List<String> textArr = new ArrayList<String>(Arrays.asList(s.split("")));
	    List<String> newArr = new ArrayList<>();
		int k = 4;
		
		for(String letter: textArr) {
			if(a.contains(letter) && alphabet.indexOf(letter) < alphabet.size()-k) {
				newArr.add(alphabet.get(alphabet.indexOf(letter.toLowerCase())+k));
			} else if (a.contains(letter) && alphabet.indexOf(letter) >= alphabet.size()-k) {
				newArr.add(alphabet.get((alphabet.indexOf(letter)+k)%alphabet.size()));
			} else if  (A.contains(letter) && alphabet.indexOf(letter.toLowerCase()) < alphabet.size()-k) {
				newArr.add(alphabet.get(alphabet.indexOf(letter.toLowerCase())+k).toUpperCase());
			} else if (A.contains(letter) && alphabet.indexOf(letter.toLowerCase()) >= alphabet.size()-k) {
				newArr.add(alphabet.get((alphabet.indexOf(letter.toLowerCase())+k)%alphabet.size()).toUpperCase());
			} else {
				newArr.add(letter);
			}
		}
		
		System.out.println(newArr);
		String sCipher = String.join("", newArr);
		System.out.println(sCipher);
		



		

	}

}
