
public class Yönetici extends Calisan {
	private int sorumlu_kisi_sayisi;
	
	public Yönetici(String ad, String soyad, int id,int sorumlu_kisi_sayisi) {
		super(ad, soyad, id);
		this.sorumlu_kisi_sayisi=sorumlu_kisi_sayisi;
	}
	
	public void yazdir() {
		super.yazdir();
		System.out.println("Yöneticinin sorumlu olduğu kişi sayısı:"+sorumlu_kisi_sayisi);
	}
	
	public void zamYap(int miktar) {
		System.out.println(getad()+  " çalışanlara "  +miktar+ " kadar zam yaptı. ");
	}
	

}
