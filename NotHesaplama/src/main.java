import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		/*
		 * Not Ortalaması Hesaplayan Program Java ile Matematik, Fizik, Kimya, Türkçe,
		 * Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını
		 * hesaplayıp ekrana bastırılan programı yazın.
		 * 
		 * Ödev Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının
		 * ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı"
		 * yazsın.
		 * 
		 * Not : If ve Else kullanılmayacak...
		 */
		
		int mat,fizik,kimya,turkce,tarih,muzik;
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Metametik notunuz: ");
		mat=scan.nextInt();
		System.out.println("Fizik notunuz: ");
		fizik=scan.nextInt();
		System.out.println("Kimya notunuz: ");
		kimya=scan.nextInt();
		System.out.println("Türkçe notunuz: ");
		turkce=scan.nextInt();
		System.out.println("Tarih notunuz: ");
		tarih=scan.nextInt();
		System.out.println("Müzik notunuz: ");
		muzik=scan.nextInt();
		
		int toplam=mat+fizik+kimya+turkce+muzik+tarih;
		double ortalama=toplam/6;
		System.out.println("Ortalamanıuz: " + ortalama);
		System.out.println(ortalama>60?"Sınıfı Geçti" : "Sınıfta Kaldı");
		

	
		
		
		
	}

}
