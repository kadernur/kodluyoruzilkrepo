import java.util.Scanner;

public class PasswordDogrulama {

	public static void main(String[] args) {
		/* Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
		eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği
		ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip , şifreler aynı ise ekrana "Şifre oluşturulamadı,
		 lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
		 */
		
		Scanner scan=new Scanner(System.in);
		String password, password2, userName;
		int secim;
		
		System.out.println("Kullanici adi giriniz: ");
		userName=scan.nextLine();
		System.out.println("Şifreniz: ");
		password=scan.nextLine();
		
		if(password.equals("kader6565") && userName.equals("kader"))
		{
			System.out.println("Giriş başarılı");
		}
		else
		{
			System.out.println("Giriş başarısız.");
			System.out.println("Şifrenizi sıfırlamak istiyor musunuz? istiyorsanız 1'e, istemiyorsanız 2' ye basınız.");
			secim=scan.nextInt();
			
			switch(secim)
			{
			case 1:
				System.out.println("Yeni şifrenizi giriniz:");
				password2=scan.next();
				if(password2.equals("kader6565"))
				{
					System.out.println("Yeni şifreniz eskisiyle aynı olamaz. ");
				}
				else
				{
					System.out.println("Şifreniz değiştirilmiştir.");
				}
			break;
			case 2:
				System.out.println("İşlem sonlandı");
			break;
			default:
				System.out.println("Hatalı giriş!!");
			
	
			}
		}
		
		

	}

}
