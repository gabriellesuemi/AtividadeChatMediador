import java.util.ArrayList;
import java.util.List;

public class MediadorChatConcreto implements MediadorChat{

    private List<Usuario> usuarios = new ArrayList<>();

    @Override
    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    @Override
    public void enviarMensagem(String mensagem, Usuario usuarioRemetente) {
        for (Usuario usuario : usuarios) {
            if (usuario != usuarioRemetente) {
                    usuario.receber(usuarioRemetente.getNome() + ": " + mensagem);
            }
        }
    }
}
