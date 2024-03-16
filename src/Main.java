
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("çalışan programına hoşgeldiniz");
		String islemler="1.yazılımcı işlemleri\n"
				+"2.yönetici işlemleri\n"
				+"çıkış için q'ya basın";
		System.out.println("*********************************");
		System.out.println(islemler);
		System.out.println("*********************************");
		
		while(true) {
			System.out.println("İşlem seçiniz:");
			String islem=scan.nextLine();
			
			if(islem.equals("q")) {
				System.out.println("Programdan çıkılıyor...");
				break;
			}
			
			else if(islem.equals("1")) {
				Yazilimci yazilimci=new Yazilimci("betül","şenyüz",361,"java,c++,python");
				String y_islem="1.format at\n"
						+"2.bilgileri göster\n"
						+"çıkış için q'ya bas\n";
				System.out.println(y_islem);
				
				while(true) {
					
					System.out.println("İşlem seçin:");
					String yi=scan.nextLine();
					
					if(yi.equals("q")) {
						System.out.println("Yazılımcı işlemlerinden çıkılıyor..");
						break;
					}
					else if(yi.equals("1")) {
						System.out.println("işletim sistemi seçin:");
						String isletim_sistemi=scan.nextLine();
						yazilimci.formatAt(isletim_sistemi);
					}
					else if(yi.equals("2")){
						yazilimci.yazdir();
					}
					else {
						System.out.println("Geçersiz yazılımcı işlemi.");
					}
				}
			}
				
			else if(islem.equals("2")) {
				Yönetici yönetici=new Yönetici("nuray","yazıcı",714,80);
				String yönetici_islem="1.zam yap\n"
						+"2.bilgileri göster\n"
						+"çıkış için q'ya basın";
				System.out.println(yönetici_islem);
				
				while(true) {
					System.out.println("işlem seçin:");
					String yö_islem=scan.nextLine();
					
					if(yö_islem.equals("q")) {
						System.out.println("Yönetici işlemlerinden çıkılıyor..");
						break;
					}
					else if(yö_islem.equals("1")){
						System.out.println("zam miktarını girin:");
						int zam=scan.nextInt();
						scan.nextLine();						
						yönetici.zamYap(zam);
					}
					else if(yö_islem.equals("2")) {
						yönetici.yazdir();
					}
					else {
						System.out.println("Geçersiz yönetici işlemi");
					}
				}
				
			}
				
			else {
				System.out.println("Geçersiz işlem.");
			}
	}

}
}
