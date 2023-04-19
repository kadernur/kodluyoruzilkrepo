import java.util.Scanner;

public class FibonacciSerisi {

	public static void main(String[] args) {
		
		/*Java döngüler ile fibonacci serisi bulan program yazıyoruz. Fibonacci serisinin eleman sayısını kullanıcıdan alın.

		Fibonacci Serisi Nedir ?
		Fibonacci serisi, her sayının kendinden önceki ile toplanması sonucu oluşan bir sayı dizisidir. Bu şekilde devam eden bu dizide sayılar birbirleriyle oranlandığında altın oran ortaya çıkar, yani bir sayı kendisinden önceki sayıya bölündüğünde altın orana gittikçe yaklaşan bir dizi elde edilir.

		Fibonacci dizisi, 0'dan başlar ve sonsuza kadar. Her rakam, bir önceki rakamla toplanır. Elde edilen sonuç rakamın sağ tarafına yazılır. Fibonacci dizisinin ilk on sayısı şu şekildedir:

		9 Elemanlı Fibonacci Serisi : 0 1 1 2 3 5 8 13 21 34

		 0 + 1 = 1

		 1 + 1 = 2

		 1 + 2 = 3

		 2 + 3 = 5

		 3 + 5 = 8

		 5 + 8 = 13

		 13 + 8 = 21

		 21 + 8 = 34
		 
		 */
		
		
		
		  Scanner scan = new Scanner(System.in);
	        int num0 = 0, num1 = 1, fibonacci;

	        System.out.println("Sayı giriniz: ");
	        int num = scan.nextInt();
	        if (num >= 1) {
	            System.out.print(0+" "+1);
	            for (int i = 1; i <= num; i++) {
	                fibonacci = num0 + num1;
	                System.out.print(" "+fibonacci);
	                num0=num1;
	                num1=fibonacci;
	            }
	        }
		

	}

}
