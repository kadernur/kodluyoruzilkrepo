import java.util.Scanner;

public class Etkinlikonerisi {

	public static void main(String[] args) {
		/* Koşullar :
		Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
		Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
		Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
		Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner. */
		
		
		int sıcaklık;
		Scanner scan =new Scanner(System.in);
		System.out.println("Sıcaklığı giriniz: ");
		sıcaklık=scan.nextInt();
		if(sıcaklık<5)
		{
			System.out.println("Kayak yapabilirsiniz.");
		}
		else if(sıcaklık >5 && sıcaklık<=15)
		{
			System.out.println("Sinemaya gidebilirsiniz.");
		}
		else if(sıcaklık>15 && sıcaklık <=25)
		{
			System.out.println("Piknik yapmak için mükemmel bir gün.");
		}
		else
		{
		 
			System.out.println("Yüzmeye gitme fikrine ne derseniz. ");
		}
		
		
//		Ödev
//		Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi farklı çözüm yolları bulunuz.

		//Bu örneği if koşulunu switch case ile de gerçekleştirebilirdim.
	}

}
