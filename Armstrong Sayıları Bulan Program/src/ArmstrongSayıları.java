import java.util.Scanner;

public class ArmstrongSayıları {

	public static void main(String[] args) {
		/*Java döngüler ile sayının armstrong sayı olup olmadığını bulan programı yazıyoruz.

		Armstrong Sayı Nedir ?
		N haneli bir sayının basamaklarının n’inci üstlerinin toplamı, sayının kendisine eşitse, böyle sayılara Armstrong sayı denir.

		Örneğin 407 sayısını ele alalım. (4^3)+ (0^3)+(7^3) = 64+0+343 = 407 sonucunu verir. Bu da 407 sayısının armstrong bir sayı olduğunu gösterir.

		1342 sayısına da bakalım. (1^4)+(3^4)+(4^4)+(2^4) =1+81+256+16=354 sayısı 1342’ye eşit olmadığı için armstrong sayı olmaz.

		1634=1^4+6^4+3^4+4^4=1+1296+81+256=1634

		54748=5^5+4^5+7^5+4^5+8^5=3125+1024+16807+1024+32768=54748
**/
		
		
		int number;
		Scanner scan=new Scanner(System.in);
		System.out.println("Sayı Giriniz: ");
		
		number=scan.nextInt();
		int basNumber=0;
		int tempNumber=number;
		int basValue;
		int result=0;
		int basPow;
		
		
		//kaç basamaklı olduğunu bulduk
		while(tempNumber !=0)
		{
			tempNumber /=10;
			basNumber++;
		}
		
		//basamak değerleri sayısı kadar basamakların üstlerinin alalım.
		
		tempNumber=number;
		
		while(tempNumber !=0)
		{
			basValue=tempNumber%10;
			basPow=1;
			
			for(int i=1;i<=basNumber;i++)
			{
				basPow*=basValue;
			}
			
			result +=basPow;
			
			tempNumber /=10;

		}
		
		
		if(result==number)
		{
			System.out.println(number + "sayısı bir Armstrong sayıdır.");
			
		}
		else
		{
			System.out.println(number +" sayısı bir Armstrong sayı değildir.");
		}
		
		
		int x;
		System.out.println("Basamakları toplanacak sayıyı giriniz: ");
		x=scan.nextInt();
		
		int elde,toplam=0;
		
		while(x !=0)
		{
			elde=x%10;
			toplam+=elde;
			x /=10;
		}
		
		System.out.println("Basamak değerleri toplamı: " +toplam);
		
		
	}

}
