package entrevista2;


public class Palindromo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aaaab";
		for(int i = 0; i<s.length()/2; i++) {
			if(s.charAt(i)!=s.charAt(s.length()-1-i)) {
				String newS = new StringBuilder(s).deleteCharAt(i).toString();
				String newSRev = new StringBuilder(s).deleteCharAt(i).reverse().toString();
				String newS2 = new StringBuilder(s).deleteCharAt(s.length()-1-i).toString();
				String newS2Rev = new StringBuilder(s).deleteCharAt(s.length()-1-i).reverse().toString();
				if(newS.equals(newSRev)) {
					System.out.println(s.charAt(i));
				} else if (newS2.equals(newS2Rev)) {
					System.out.println(s.charAt(s.length()-1-i));
				} else {
					System.out.println(-1);
				}
				
			} else {
				
				System.out.println(-1);
			}
			
		
	
}

	}

}
