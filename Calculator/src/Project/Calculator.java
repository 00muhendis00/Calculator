package Project;
import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		double s1,s2;
		int select;
		Scanner input = new Scanner(System.in);
		System.out.print("1. Sayıyı giriniz ");
		s1 = input.nextDouble();
		System.out.print("2. Sayıyı giriniz ");
		s2 = input.nextDouble();
		System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
		System.out.print("İşlem Türünü Seçiniz ");
		select = input.nextInt();
		/*
		if(select == 1)
		{
			System.out.print("Sonuc -> " + (s1+s2));
		}
		else if((select == 2) && (s1 >=s2))
		{
			System.out.print("Sonuç -> " + (s1-s2));
		}
		else if((select == 2) && (s2 > s1)) 
		{
			System.out.print("Sonuç -> " + (s2 - s1));
		}
		else if(select == 3)
		{
			System.out.print("Sonuç -> " + (s1 * s2));
		}
		else if((select==4) && (s1>s2))
		{
			System.out.print("Sonuç -> " + (s1 / s2));
		}
		else if((select == 4) && (s2 > s1)) 
		{
			System.out.print("Sonuç -> " + (s2 / s1));
		}
		*/
		switch(select) {
		case 1:
			System.out.print("Sonuç -> " + (s1 + s2));
			break;
		case 2:
			System.out.print("Sonuç -> " + (s1 - s2));
			break;
		case 3:
			System.out.print("Sonuç -> " + (s1 * s2));
			break;
		case 4:
			System.out.print("Sonuç -> " + (s1 / s2));
			break;
		default:
			System.out.print("Hatalı Giriş");
		}
	}
}
