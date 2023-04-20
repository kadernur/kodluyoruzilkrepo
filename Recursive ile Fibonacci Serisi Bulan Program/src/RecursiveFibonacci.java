
public class RecursiveFibonacci {

	public static void main(String[] args) {
		//Java'da recursive metotlar ile fibonacci serisi bulan program yapıyoruz.
		
		//f(1)=1,f(2)=1 Başlangıç değerleri
		
		/*
		 *  f(6)= f(5)+f(4)
		 *  f(5)=f(4)+f(3)
		 *  
		 *  f(n)=f(n-1)+f(n-2)
		 */
		
	
		System.out.println(fib(5));
		

	}
	
	static int fib(int sayi)
	{
		
		if(sayi==1 || sayi==2)
		{
			return 1;
		}
		return fib(sayi-1)+fib(sayi-2);
		
	}

}
