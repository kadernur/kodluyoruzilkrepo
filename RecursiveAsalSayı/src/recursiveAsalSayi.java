import java.util.Scanner;

public class recursiveAsalSayi {
	
	static void İsPrimeRecursive()
	{
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Sayı giriniz: ");
		int sayi=scan.nextInt();
		int count=0;
		for(int i=2;i<sayi;i++)
		{
			if(sayi%i==0)
			{
				count++;
			}
		}
		
		if(count==0)
		{
			System.out.println(sayi +" asal sayıdır.");
		}
		else
		{
			System.out.println(sayi+ " asal sayi değildir.");
		}
		
	}

	public static void main(String[] args) {
		
		
	/*	
	 * Java dilinde "Recursive" metot kullanarak, kullanıcıdan alınan sayının "Asal" sayı olup olmadığını bulan programı yazın.

		Senaryo
		Sayı Giriniz : 22
		22 sayısı ASAL değildir !


		Sayı Giriniz : 2
		2 sayısı ASALDIR !


		Sayı Giriniz : 39
		39 sayısı ASAL değildir !


		Sayı Giriniz : 17
		17 sayısı ASALDIR !
		
		
		*/
		
		İsPrimeRecursive();
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		

	}

}
