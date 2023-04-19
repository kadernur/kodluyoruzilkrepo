import java.util.Scanner;

public class FaktöriyelHesaplayanProgram {

	public static void main(String[] args) {
		/*Java ile faktöriyel hesaplayan program yazıyoruz.

		
*/
		
		int faktoriyel;
		Scanner scan=new Scanner(System.in);
		System.out.println("Faktoriyel sayısını giriniz: ");
		faktoriyel=scan.nextInt();
		int total=1;
		
		for(int i=1;i<=faktoriyel;i++)
		{
			total=total*i;
		}
		
		System.out.println(faktoriyel + "sayısının faktoriyeli: "+ total);
		
		
		
		/*
		 * Ödev
		N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

		Java ile kombinasyon hesaplayan program yazınız.

		Kombinasyon formülü
		C(n,r) = n! / (r! * (n-r)!)
		
		*/
		
		
		
		 int n,r;
		 System.out.println("n ve r saılarını giriniz: ");
		 n=scan.nextInt();
		 r=scan.nextInt();
		 int nfak=1,rfak=1,n_rFak=1;
		 for(int j=1;j<=n;j++)
		 {
			 nfak=nfak*j;
		 }
		 
		 for(int k=1;k<=r;k++)
		 {
			 rfak=rfak*k;
			 
		 }
		 
		 
		 for(int t=1;t<=(n-r); t++)
		 {
			 n_rFak=n_rFak*t;
		 }
		 
		 int sonuc=nfak/(rfak*n_rFak);
		 System.out.println("Kombinasyonu: " +sonuc);
		 
		 
		 
		
	}

}
