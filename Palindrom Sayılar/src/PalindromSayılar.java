
public class PalindromSayılar {

	public static void main(String[] args) {
	/*	Java ile bir sayının "Palindrom Sayı" olup olmadığını bulan bir program yapıyoruz.

		Palindrom Sayı Nedir ?
		Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.

		Örnek: 1, 4, 8, 99, 101, 363, 4004, 9889....
		
		*/
		
		System.out.println(isPolidrom(104));
		
		

	}
	
	
	static String isPolidrom(int sayi)
	{
		int temp=sayi, reverseNumber=0, lastNumber;
		
		while(temp !=0)
		{
			lastNumber=temp%10;
			reverseNumber=(reverseNumber*10)+lastNumber;
			temp/=10;
			
		}
		
		if(reverseNumber==sayi)
		{
			return sayi +  "Polindrom sayıdır";
		}
		else
		{
			return sayi + "Polindrom sayı değildir.";
		}
		
	}

}
