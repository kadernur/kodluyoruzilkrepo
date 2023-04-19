import java.util.Scanner;

public class ÜslüSayıHesaplayanProgram {

	public static void main(String[] args) {
		/*Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı yazıyoruz.

		Ödev
		Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.
	
	*/
		
		
		int n,k;
		Scanner scan=new Scanner(System.in);
		System.out.println("Üssü alınacak sayıyı yazınız: ");
		n=scan.nextInt();
		
		System.out.println("üs olacak sayıyı yazınız: ");
		k=scan.nextInt();
		
		int total=1 ,i=1;
		
		/*while(i<=k)
		{
			total *=n;
			i++;
			
		}
		
		System.out.println("Cevap: " +total);
		
		*/
		
		
		
		//for döngüsü ile 
		for(i=1;i<=k;i++)
		{
			total*=n;
		}
		
		System.out.println("Cevap : " +total);
		
	}

}
