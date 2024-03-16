
public class Calisan {
	
	private String ad;
	private String soyad;
	private int id;
	
	public Calisan(String ad,String soyad,int id) {
		this.ad=ad;
		this.soyad=soyad;
		this.id=id;
	}
	
	public String getad() {
		return ad;
	}
	public void setad(String ad) {
		this.ad=ad;
	}
	public String getsoyad() {
		return soyad;
	}
	public void setsoyad(String soyad) {
		this.soyad=soyad;
	}
	public int id() {
		return id;
	}
	public void setid(int id) {
		this.id=id;
	}
	
	public void yazdir() {
		System.out.println("Ad:"+ad);
		System.out.println("Soyad:"+soyad);
		System.out.println("id:"+id);
	}
}
