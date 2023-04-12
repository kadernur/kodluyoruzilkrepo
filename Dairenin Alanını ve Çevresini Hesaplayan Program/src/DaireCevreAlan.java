import java.util.Scanner;

public class DaireCevreAlan {

	public static void main(String[] args) {
//		Dairenin Alanını ve Çevresini Hesaplayan Program
//		Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.
//
//		Alan Formülü : π * r * r;
//
//		Çevre Formülü : 2 * π * r;
//
//		Ödev
//		Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
//
//		𝜋 sayısını = 3.14 alınız.
//
//		Formül : (𝜋 * (r*r) * 𝛼) / 360
		
		
		
		double pi=3.14;
		int r,aci;
		Scanner scan=new Scanner(System.in);
		System.out.println("Yarıçapı giriniz: ");
		r=scan.nextInt();
		System.out.println("Açıyı giriniz: ");
		aci=scan.nextInt();
		
		double alan=((pi*(r*r)*aci)/360);
		System.out.println("Dairenin alanı: " + alan);
		
		
		
		

	}

}
