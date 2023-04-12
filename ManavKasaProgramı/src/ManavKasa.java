import java.util.Scanner;

public class ManavKasa {

	public static void main(String[] args) {
//		Manav Kasa Programı
//		Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.
//
//		Meyveler ve KG Fiyatları
//
//		Armut : 2,14 TL
//		Elma : 3,67 TL
//		Domates : 1,11 TL
//		Muz: 0,95 TL
//		Patlıcan : 5,00 TL
//		Örnek Çıktı;
//
//		Armut Kaç Kilo ? :0
//		Elma Kaç Kilo ? :1
//		Domates Kaç Kilo ? :1
//		Muz Kaç Kilo ? :2
//		Patlıcan Kaç Kilo ? :3
//		Toplam Tutar : 21.68 TL

		Scanner input = new Scanner(System.in);
        double armut, elma, domates,muz,patlican;
        System.out.println("Armut Kaç kilo");
        armut=input.nextDouble();
        System.out.println("elma Kaç kilo");
        elma=input.nextDouble();
        System.out.println("dometes Kaç kilo");
        domates=input.nextDouble();
        System.out.println("muz Kaç kilo");
        muz=input.nextDouble();
        System.out.println("patlıcan Kaç kilo");
        patlican=input.nextDouble();
        Double Tutar=(armut*2.14)+(elma*3.67)+(domates*1.11)+(muz*0.95)+(patlican*5.0);
        System.out.println("Toplam tutar:"+Tutar);
		
	}

}
