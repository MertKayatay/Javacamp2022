
public class workWithStrings {

	public static void main(String[] args) {
		String mesaj = "Bugun hava çok güzel.";
		System.out.println(mesaj);

		System.out.println(mesaj.replace(' ','-'));
		
		String yeniMesaj = mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2,5));
		
		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
		
		
		
	}

}
