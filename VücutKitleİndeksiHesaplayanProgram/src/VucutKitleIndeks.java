import java.util.Scanner;

public class VucutKitleIndeks {

	public static void main(String[] args) {
//		Vücut Kitle İndeksi Hesaplama
//		Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
		//Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
//
//		Formül
//		Kilo (kg) / Boy(m) * Boy(m)
//
//		Çıktısı
//		Lütfen boyunuzu (metre cinsinde) giriniz : 1,72
//		Lütfen kilonuzu giriniz : 105
//		Vücut Kitle İndeksiniz : 35.49215792320173

		double boy,kilo;
		Scanner scan=new Scanner(System.in);
		System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
		boy=scan.nextDouble();
		System.out.print("Lütfen kilonuzu giriniz : " );
		kilo=scan.nextDouble();
		double index=(kilo/(boy*boy));
		System.out.print("Vücut Kitle İndeksiniz : "+ index);
		
		
	}

}
