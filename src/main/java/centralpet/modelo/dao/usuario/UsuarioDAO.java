package centralpet.modelo.dao.usuario;

import java.util.List;

import centralpet.modelo.entidade.usuario.Usuario;

public interface UsuarioDAO {

	void inserirUsuario(Usuario usuario);
	
	void deletarUsuario(Usuario usuario);
	
	void atualizarUsuario(Usuario usuario);
	
	List<Usuario> recuperarUsuario(Usuario id);
	
	List<Usuario> recuperarTodosUsuarios();
	
}
