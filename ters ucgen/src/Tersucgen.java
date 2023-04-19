import java.util.Scanner;

public class Tersucgen {

	public static void main(String[] args) {
		// Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak, yıldızlar(*) ile ekrana ters üçgen çizen programı yazın.
		
		int n;
		Scanner scan=new Scanner(System.in);
		System.out.println("Basamak sayısını giriniz: ");
		n=scan.nextInt();
		for (int i = n; i >=0  ; i--) {
            for (int j = (n - i); j >0 ; j--) {
                System.out.print(" ");
            }
            for (int k = (2 * i + 1); k >=1 ; k--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }    
            
	}

}
