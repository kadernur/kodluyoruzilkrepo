import java.util.Scanner;

public class main {

	public static void main(String[] args) {
//		Dik Üçgende Hipotenüs Bulan Program
//		Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.
//
//		Ödev
//		Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
//
//		Formül
//		Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
//
//		𝑢 = (a+b+c) / 2
//
//		Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)7
		
		int a,b,c;
		double alan, u;
		Scanner scan=new Scanner(System.in);
		System.out.println("a kenarının uzunluğu: ");
		a=scan.nextInt();
		System.out.println("b kenarının uzunluğu : ");
		b=scan.nextInt();
		System.out.println("c kenarının uzunluğu: ");
		c=scan.nextInt();
		
		u=(a+b+c) /2;
		alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
		System.out.println("Üçgenini alanı: " + alan);
		
		

	}

}
