package entrevista2;

public class SuperDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String n = "861568688536788";
		int k = 100000;
	    long s, f = 0;
	    while (true) {
	        s = 0;
	        for(int i=0; i<n.length(); i++) {
	            s += n.charAt(i) - '0';
	        }
	        if(f==0) {
	            s *= k;
	            f = 1;
	        }
	        if(s<10) break;
	        n = Long.toString(s);

	    }
	    System.out.println((int)s);
	}
	   

	}

