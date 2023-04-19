import java.util.Scanner;

public class ATMProjesi {

	public static void main(String[] args) {
		// java döngüler ile kullanıcının banka hesabını yönetebildiği bir ATM projesi yapıyoruz.
		
		 String username, password;
		 Scanner scan=new Scanner(System.in);
		 int right=3;
		 int balance=1500;
		 int select;
		 while(right>0)
		 {
			 System.out.println("Kullanıcı Adınızı giriniz: ");
			 username=scan.nextLine();
			 System.out.println("Lütfen Parolanızı giriniz: ");
			 password=scan.nextLine();
			 
			 if(username.equals("patika") && password.equals("dev123"))
			 {
				 System.out.println("Merhaba kodluyoruz bankasına hoşgeldiniz!");
				 
				 do {
					 System.out.println("1-Para yatırma\n" +
	                            "2-Para Çekme\n" +
	                            "3-Bakiye Sorgula\n" +
	                            "4-Çıkış Yap");
					 System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz: ");
					 select=scan.nextInt();
					 switch(select)
					 {
					 case 1:
						 System.out.println("Para miktarı: " );
						 int price=scan.nextInt();
						 balance+=price;
						 break;
						 
					 case 2:
						 System.out.println("Para Miktarı: ");
						 int priceMoney=scan.nextInt();
						 if(priceMoney>balance)
						 {
							 System.out.println("Bakiye yetersiz!!");
							 
						 }
						 else
						 {
							 balance-=priceMoney;
						 }
						 
						 break;
						 
						 
						 
					 case 3:
						 System.out.println("Bakiyeniz: " + balance);
						 break;
						 
					 case 4: 
						 System.out.println("Tekrar görüşmek üzere.");
						 break;
					
					 
					 
						 
						 
					 }
					 
					
				 }while (select != 4);
	               
			 }
			 
			 else
			 {
				 right--;
				 System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz. ");
				 if(right==0)
				 {
					 System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçiniz.");
				 }
				 else
				 {
					 System.out.println("Kalan hakkınız: " +right);
				 }
			 }
		 }
		 
		

	}

}
