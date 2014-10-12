package ogg.entity;

public class Yonetmen {

	private int id;
	private String ad;
	private String soyad;
	private int yas;
	
	public Yonetmen(int id, String ad, String soyad, int yas) {
		
		this.id = id;
		this.ad = ad;
		this.soyad = soyad;
		this.yas = yas;
	}
	
	public Yonetmen(){
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	
	public int getYas() {
		return yas;
	}
	
	public void setYas(int yas) {
		this.yas = yas;
	}
	
}
