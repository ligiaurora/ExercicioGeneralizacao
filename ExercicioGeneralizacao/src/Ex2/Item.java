package Ex2;

public class Item {
	
	private int codigo;
	private String descricao;
	
	
	public Item() {
		
	}
	
	
	public Item(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	
	//Get e Sets
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Item [codigo=");
		builder.append(codigo);
		builder.append(", descricao=");
		builder.append(descricao);
		builder.append("]");
		return builder.toString();
	}

}
