package ciftsayitoplam;

import java.util.Scanner;

public class CiftSayiToplam {

	public static void main(String[] args) {
		
//		java döngüler ile kullanıcının girdiği sayıya kadar çift olan sayıları bulan programı yazıyoruz.
//
//		Ödev
//		Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
//

		int sayi;
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz. ");
		sayi=scan.nextInt();
		
		for(int i=0;i<=sayi;i++)
		{
			if(i%2==0)
			{
				System.out.println( i+ "Çift Sayidir. ");
			}
			
		
			
		}
		
		
		for(int i=0; i<=sayi;i++)
		{
			if(i%12==0)
			{
				System.out.println(i+ " 3 ve 4'e tam bölünüyor");
			}
		}
	}

}