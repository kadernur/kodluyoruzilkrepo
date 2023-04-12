import java.util.Scanner;

public class Taksimetre {

	public static void main(String[] args) {
//		Taksimetre Programı
//		Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
//
//		Taksimetre KM başına 2.20 TL tutmaktadır.
//		Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
//		Taksimetre açılış ücreti 10 TL'dir.
		
		
		int km;
		double kmb=2.20 , tutar, acilis=10;
		Scanner scan= new Scanner(System.in);
		System.out.println("Mesafenizi(KM) giriniz: ");
		km=scan.nextInt();
		tutar=(km*kmb+acilis);
		if(tutar<=20)
		{
			tutar=20;
		}
		
		System.out.println(tutar);
		
	}

}
