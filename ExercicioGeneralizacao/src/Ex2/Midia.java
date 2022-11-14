package Ex2;

public class Midia extends Item {
	
	private String gravadora;
	private float duracao;
	
	
	public Midia() {
		
	}
	
	public Midia ( String gravadora, float duracao) {
		setGravadora(gravadora);
		setDuracao(duracao);
	}
	
	
	
	
	public String getGravadora() {
		return gravadora;
	}
	public void setGravadora(String gravadora) {
		this.gravadora = gravadora;
	}
	public float getDuracao() {
		return duracao;
	}
	public void setDuracao(float duracao) {
		this.duracao = duracao;
	}
	
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Midia [gravadora=");
		builder.append(gravadora);
		builder.append(", duracao=");
		builder.append(duracao);
		builder.append("]");
		return builder.toString();
	}

}
