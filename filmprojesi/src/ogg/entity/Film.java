package ogg.entity;


public class Film {

	private int id;
	private String ad;
	private int sene;
	private Kategori kategori;
	private Yonetmen yonetmen;
	
	public Film(int id, String ad, int sene, Kategori kategori,
			Yonetmen yonetmen) {

		this.id = id;
		this.ad = ad;
		this.sene = sene;
		this.kategori = kategori;
		this.yonetmen = yonetmen;
	}

	public Film() {
		
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
	
	public int getSene() {
		return sene;
	}
	
	public void setSene(int sene) {
		this.sene = sene;
	}
	
	public Kategori getKategori() {
		return kategori;
	}
	
	public void setKategori(Kategori kategori) {
		this.kategori = kategori;
	}
	
	public Yonetmen getYonetmen() {
		return yonetmen;
	}
	
	public void setYonetmen(Yonetmen yonetmen) {
		this.yonetmen = yonetmen;
	}
	
}
