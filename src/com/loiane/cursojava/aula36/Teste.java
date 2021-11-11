package com.loiane.cursojava.aula36;

public class Teste {

	public static void main(String[] args) {
		
		Contato contato = new Contato();
		contato.setNome("Tyrion");
		//contato.setEndereco("Kings Landing");
		//contato.setTelefone("11 99999-99999");
		
		//Relacionamento tem-um endereco
		Endereco end = new Endereco();
		end.setNomeRua("Rua Game of Thrones");
		end.setNumero("n/a");
		end.setComplemento("-");
		end.setCidade("Kings Landing");
		end.setEstado("Westeros");
		end.setCep("999999");
		contato.setEndereco(end);
		
		//Relacionamento tem-muitos telefone
		Telefone tel = new Telefone();
		tel.setTipo("celular");
		tel.setDdd("11");
		tel.setNumero("8888-8888");
		
		Telefone tel2 = new Telefone();
		tel2.setTipo("casa");
		tel2.setDdd("11");
		tel2.setNumero("4033-8888");
		
		Telefone[] telefones = new Telefone[2];
		telefones[0] = tel;
		telefones[1] = tel2;
		contato.setTelefones(telefones);
		
	
		System.out.println(contato.getNome());
		if(contato != null && contato.getEndereco() != null) {
			System.out.println(contato.getEndereco().getCidade());
		}
		
		if(contato != null && contato.getTelefones() != null ) {
			for(Telefone t : contato.getTelefones()) {
				System.out.println(t.getDdd() + " " + t.getNumero());
			}
		}
		

	}

}
