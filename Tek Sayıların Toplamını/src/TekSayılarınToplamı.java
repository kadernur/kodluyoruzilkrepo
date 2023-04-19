import java.util.Scanner;

public class TekSayılarınToplamı {

	public static void main(String[] args) {
//		Java döngüler ile negatif bir değer girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden tek sayıları toplayıp ekrana basan programı yazıyoruz.
//
//		Ödev
//		Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
//	
		
		int total=0;
		int sayi;
		Scanner scan=new Scanner(System.in);
		
//		do
//		{
//			System.out.println("Sayı giriniz: ");
//			sayi=scan.nextInt();
//			if(sayi%2==1)
//			{
//				total+=sayi;
//			}
//			
//		}while(sayi>0);
//		
//		System.out.println("Toplam: " +total);
//		
//		
		
		
		do {
			System.out.println("Sayı giriniz: ");
			sayi=scan.nextInt();
			if(sayi%2==0 )
			{
				if(sayi%4==0)
				{
					total+=sayi;
					
				}
				
			}
			
		}while(sayi%2==0);
		
		System.out.println("Toplam: " +total);
		
		
	
	}

}
