import java.util.Scanner;

public class recursive_pattern {


	public static void main(String[] args) {
/*		Java dilinde kullanıcıdan alınan n değerine göre aşağıdaki kurala uyan döngü kullanmadan bir "Recursive" metot yazın.

		Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın. Her çıkarma işlemi sırasında ekrana son değeri yazdırın. Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin. Yine her ekleme işleminde sayının son değerini ekrana yazdırın.

Senaryolar
N Sayısı : 16
Çıktısı : 16 11 6 1 -4 1 6 11 16 


N Sayısı : 10
Çıktısı : 10 5 0 5 10 


N Sayısı : 25
Çıktısı : 25 20 15 10 5 0 5 10 15 20 25 


N Sayısı : 5
Çıktısı : 5 0 5 
*/
	int sayi,temp;
	Scanner scan= new Scanner(System.in);
	System.out.print("Sayı Gir: ");
	sayi=scan.nextInt();
	temp=sayi;
	recursivePatternMinus(sayi,temp);
		
	}

	static void recursivePatternMinus(int sayi,int temp)
	{
		if(sayi>0)
		{
			System.out.print(sayi + " ");
			sayi=sayi-5;
			recursivePatternMinus(sayi, temp);
			
		}
		else if(sayi<=0)
		{
			recursivePatternPlus(sayi, temp);
		}
			
	}
	
		
	static void recursivePatternPlus(int sayi,int temp)
	{
		if(temp>=sayi) {
			System.out.print(sayi+ " ");
			sayi=sayi+5;
			recursivePatternPlus(sayi, temp);
		}
			
	}
	
	
	
}
	
	

