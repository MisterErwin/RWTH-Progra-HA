public class HA_2_2_b_ii{
	public static void main(String[] args) {
		int a = -2147483648, b = 2147483647;

		//Linke Seite
		System.out.println(" "+form(a));
		System.out.println("+"+form(a));
		System.out.println("="+form(a+a)); 
		System.out.println();
		 
		//Rechte Seite
		System.out.println(" "+form(b));
		System.out.println("+"+form(b));
		System.out.println("="+form(b+b)); 

		//Und das Endergebnis
		System.out.println("===>" + (a+a>b+b));
	}

	//Eine Helfermethode, die eine 32bit Ganzzahl (int) in base2 und base10 ausgibt
	private static String form(int val){
		return String.format("%32s", Integer.toBinaryString(val)).replace(" ","0") + "  |  " + val;
	}
}