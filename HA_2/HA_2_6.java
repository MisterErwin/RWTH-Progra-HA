public class HA2_6 {

	private static String PWD = null; 

	public static void main(String[] args){
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		String line;
		showInfo();
		while (!"V".equals((line = scanner.next()))){
			if ("A".equals(line)){
				System.out.println(PWD==null?"Passwort noch nicht gesetzt":"Das Passwort ist " + PWD);
			}else if ("S".equals(line)){
				System.out.println("Bitte neues Passwort eingeben!");
				line = scanner.next();
				System.out.println("Bitte Passwort erneut eingeben!");
				String pwd2 = scanner.next();
				if (line.equals(pwd2)){
					PWD = line;
					System.out.println("Neues Passwort gesetzt!");
				}else
					System.out.println("Passwort Bestätigung nicht erfüllt => Passwort nicht gesetzt");
			}else{
				System.out.println("Eingabe nicht erkannt!");
				showInfo();
			}
		}
		System.out.println("See you later, Alligator");

	}

	private static void showInfo(){
		System.out.println("[A]nzeigen des Passwortes");
		System.out.println("[S]etzen des Passwortes");
		System.out.println("[V]erlassen des Programmes");
	}

}