package br.com.alura.gerenciador.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

public class Banco {

	private static List<Empresa> lista = new ArrayList<>();
	private static List<Usuario> listaUsuarios = new ArrayList<>();
	private static Integer chaveSequencial = 1;
	
	static {
		Empresa empresa = new Empresa();
		empresa.setId(chaveSequencial++);
		empresa.setNome("Igor");
		Empresa empresa2 = new Empresa();
		empresa2.setNome("Caelum");
		empresa2.setId(chaveSequencial++);
		lista.add(empresa);
		lista.add(empresa2);
		
		Usuario u1 = new Usuario();
		u1.setLogin("igor");
		u1.setSenha("12345");
		
		Usuario u2 = new Usuario();
		u2.setLogin("sil");
		u2.setSenha("54321");
		
		listaUsuarios.add(u1);
		listaUsuarios.add(u2);
	}
	
	public void adiciona(Empresa empresa) {
		empresa.setId(Banco.chaveSequencial++);
		// TODO Auto-generated method stub
		Banco.lista.add(empresa);
	}
	public List<Empresa> getEmpresas(){
		return Banco.lista;
	}
	public void removeEmpresa(Integer id) {

		Iterator<Empresa> it = lista.iterator();
		
		while(it.hasNext()) {
			Empresa emp = it.next();
			
			if(emp.getId() == id) {
				it.remove();
			}
		}
	}
	public Empresa buscaEmpresaPelaId(Integer id) {
		
		for (Empresa empresa : lista) {
			if(empresa.getId()== id) {
				return empresa;
			}
		}
		
		return null;
	}
	public Usuario existeUsuario(String login, String senha) {

		for(Usuario usuario : listaUsuarios) {
			if(usuario.ehIgual(login, senha)) {
				return usuario;
			}
		}
		return null;
	}
}