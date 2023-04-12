import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		/*
		 * KDV Tutarı Hesaplayan Program Java ile kullanıcıdan alınan para değerinin
		 * KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
		 * 
		 * (Not : KDV tutarını 18% olarak alın)
		 * 
		 * KDV'siz Fiyat = 10;
		 * 
		 * KDV'li Fiyat = 11.8;
		 * 
		 * KDV tutarı = 1.8;
		 * 
		 * Ödev Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000
		 * TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı
		 * yazınız.
		 */
		
		
		int maliyet;
		Scanner scan=new Scanner(System.in);
		System.out.println("Maliyetinizi giriniz: ");
		maliyet=scan.nextInt();
		
		if(maliyet>=1000)
		{
			double KDV= maliyet + (maliyet* 0.8);
			System.out.println("maliyet:" + maliyet);
			System.out.println("KDV'li fiyat:" + KDV);
		}
		else if(maliyet<1000)
		{
			double KDV= maliyet + (maliyet* 0.18);
			System.out.println("maliyet:" + maliyet);
			System.out.println("KDV'li fiyat:" + KDV);
		}
		
	}

}
