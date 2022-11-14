package Ex1;

public class Main {
	
	public static void main(String[] args) {
		
		
		PessoaFisica pf1 = new PessoaFisica("Aurora", "Rua Herculano Nunes Teixeira");
		pf1.setCpf("010-685-940-40");
		pf1.setEstadoCivil("Solteira");
		System.out.println(pf1);

		PessoaJuridica pf2 = new PessoaJuridica("Livraria Book", "Rua dos Bobos, numero 0" );
		pf2.setCnpj("38.232.958/0001-80");
		pf2.setTipoEmpresa("Livraria");
		System.out.println(pf2);

		
	}
	

}
