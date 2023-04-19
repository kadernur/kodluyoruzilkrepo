import java.util.Scanner;

public class HarmonikSayıları {

	public static void main(String[] args) {
		//Java ile girilen sayının harmonik serisini bulan program yazacağız.

		
		int n;
		Scanner scan=new Scanner(System.in);
		System.out.println("n sayısını giriniz: ");
		n=scan.nextInt();
		double total=0;
		for(double i=1;i<=n;i++)
		{
			total+=(1/i);
		}


		System.out.println("Harmonik sayı: " + total);

	}

}
