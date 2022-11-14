package Ex2;

public class Livro extends Item {
	
	public Livro(int codigo, String descricao) {
		super(codigo, descricao);
		// TODO Auto-generated constructor stub
	}
	
	
	public Livro() {
		
	}
	private String autor;

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Livro [autor=");
		builder.append(autor);
		builder.append("]");
		return builder.toString();
	} 
	
	

}
