import java.util.Scanner;

public class TwoPower {

	public static void main(String[] args) {

		
//		Java döngüler ile girilen sayıya kadar olan 2'nin kuvvetlerini ekrana yazdıran programı yazıyoruz.
//
//		Ödev
//		Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
// 
		
		int n;
		Scanner scan=new Scanner(System.in);
		System.out.println("Sınır değer giriniz: ");
		n=scan.nextInt();
		
/*		//2'nin kuvvetleri
		
		for(int i=1;i<=n;i*=2)
		{
			System.out.println(i);
		}

		//4'ün kuvvetkleri
		for(int i=1;i<=n;i*=4)
			{
				System.out.println(i);
			}
		*/
		
		//5'in kuvvetleri
		
		for(int i=1;i<=n;i*=5)
		{
			System.out.println(i);
		}
		
	}

}
