import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {
		
		int n1,n2,select;
		Scanner scan=new Scanner(System.in);
		System.out.println("İlk sayıy giriniz: ");
		n1=scan.nextInt();
		System.out.println("İkinci sayıyı giriniz: ");
		n2=scan.nextInt();
		
		System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
		System.out.println("Seçiminiz: ");
		select=scan.nextInt();
		
		switch(select)
		{
		case 1:
			System.out.println("Toplamın sonucu: " + (n1+n2));
		break;
		case 2:
			System.out.println("Farkların sonucu: " + (n1-n2));
		break;
		case 3:
			System.out.println("Çarpma sonucu: " + (n1*n2));
		break;
		case 4:
			if(n2>0)
			{
				System.out.println("Bölme sonucu: " + (n1/n2));
			}
			else
			{
				System.out.println("payda 0 olamaz");
			}
		break;
		default:
			System.out.println("Hatalı seçim yaptınız!");
		
		
		}
			

	}

}
