package centralpet.modelo.dao.usuario;

import java.util.List;

import centralpet.modelo.entidade.contato.Contato;
import centralpet.modelo.entidade.usuario.Usuario;

public interface UsuarioDAO {

	void inserirUsuario(Usuario usuario);
	
	void deletarUsuario(Usuario usuario);
	
	void atualizarUsuario(Usuario usuario);
	
	String recuperarEmailUsuario(Contato contato);
	
	List<Usuario> recuperarTodosUsuarios();
	
}
