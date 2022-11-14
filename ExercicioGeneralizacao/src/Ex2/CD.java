package Ex2;

public class CD extends Midia {
	
	private int faixa;
	private String artista;
	private String album;
	
	public CD() {
		
	}
	
	public CD(int faixa, String artista, String album) {
		setFaixa(faixa);
		setArtista(artista);
		setAlbum(album);
	}
	
	public int getFaixa() {
		return faixa;
	}
	public void setFaixa(int faixa) {
		this.faixa = faixa;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CD [faixa=");
		builder.append(faixa);
		builder.append(", artista=");
		builder.append(artista);
		builder.append(", album=");
		builder.append(album);
		builder.append("]");
		return builder.toString();
	}

}
