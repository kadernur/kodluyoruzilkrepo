import java.util.Scanner;

public class RecursiveUsluSayi {

	static void us()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Taban değeri giriniz:");
		int taban=scan.nextInt();
		System.out.println("Üs değerini giriniz: ");
		int us=scan.nextInt();
		int sonuc=1;
		
		for(int i=1; i<=us;i++)
		{
			sonuc*=taban;
		}
		
		System.out.println("Sonuc: " +sonuc);
	}
	public static void main(String[] args) {
	/*	Recursive Metotlar ile Üslü Sayı Hesaplama
		Java dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma işlemini "Recursive" metot kullanarak yapan programı yazınız.

		Senaryo

		Taban değeri giriniz :2 Üs değerini giriniz : 0
		Sonuç : 1
		Taban değeri giriniz : 2
		Üs değerini giriniz : 3
		Sonuç : 8
		Taban değeri giriniz : 5
		Üs değerini giriniz : 3
		Sonuç : 125
		
		*/
		
		us();

	}

}
