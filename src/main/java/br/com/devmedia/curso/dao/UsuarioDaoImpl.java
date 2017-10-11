package br.com.devmedia.curso.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.devmedia.curso.domain.Usuario;

@Repository
public class UsuarioDaoImpl implements UsuarioDao {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void salvar(Usuario usuario) {
		// TODO
	}

	@Override
	public void editar(Usuario usuario) {
		// TODO		
	}

	@Override
	public void excluir(Long id) {
		// TODO		
	}

	@Override
	public Usuario getId(Long id) {
		// TODO
	}

	@Override
	public List<Usuario> getTodos() {
		// TODO
	}
}
