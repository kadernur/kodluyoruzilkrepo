import java.util.Scanner;

public class Minmax {

	public static void main(String[] args) {
		/*Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.

		Senaryo
		Kaç tane sayı gireceksiniz: 4
		1. Sayıyı giriniz: 16
		2. Sayıyı giriniz: -22
		3. Sayıyı giriniz: -15
		4. Sayıyı giriniz: 100
		En büyük sayı: 100
		En küçük sayı: -22
		
		*/
		
		
		int n,sayi,tempMax=1 ,tempMin=0,elde;
		Scanner scan= new Scanner(System.in);
		System.out.println("Kaç tane sayı gireceksiniz: ");
		n=scan.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println(i+". sayı: ");
			sayi=scan.nextInt();
			System.out.println(sayi);
			
			if(sayi>tempMax)
			{
				
				tempMax=sayi;
				
				
			}
			if(sayi<tempMin)
			{
				tempMin=sayi;
			}
			
		
		}
		
		System.out.println("Max sayı: " +tempMax);
		System.out.println("Min sayı: " +tempMin);

	}

}
