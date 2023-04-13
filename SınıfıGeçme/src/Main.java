import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik
//
//		Geçme Notu : 55
//
//		Ödev
//		Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.

		
         int mat,fizik,kimya,turkce,muzik;
		
		 Scanner scan= new Scanner(System.in);
		
		System.out.println("Metametik notunuz: ");
		mat=scan.nextInt();
		System.out.println("Fizik notunuz: ");
		fizik=scan.nextInt();
		System.out.println("Kimya notunuz: ");
		kimya=scan.nextInt();
		System.out.println("Türkçe notunuz: ");
		turkce=scan.nextInt();
		System.out.println("Müzik notunuz: ");
		muzik=scan.nextInt();
		
		if(mat>=0 && mat<=100 && fizik<=0 && fizik>=100 && kimya<=0 &&kimya>=100 && turkce<=0 && turkce<=100 && muzik<=0 && muzik>=100)
		{
			int toplam=mat+fizik+kimya+turkce+muzik;
		   double ortalama=toplam/6;
		
		   System.out.println("ortalamanız: " +ortalama);
		   if(ortalama<55)
		   {
			   System.out.println("Kaldımız.");
		   }
		   
		   else
		   {
			   System.out.println("Geçtiniz");
		   }
		
			
		}
		
		else
		{
			System.out.println("Hatalı giriş!! Notlar '0 'dan küçük 100'den büyük olamaz.");
		}
		
		
		
		
		
	}

}
