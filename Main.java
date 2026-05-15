public class Main {
    public static void main(String[] args) {

        MediadorChat mediador = new MediadorChatConcreto();

        Usuario ana = new UsuarioChat(mediador, "Ana");
        Usuario joao = new UsuarioChat(mediador, "João");
        Usuario maria = new UsuarioChat(mediador, "Maria");

        mediador.adicionarUsuario(ana);
        mediador.adicionarUsuario(joao);
        mediador.adicionarUsuario(maria);

        ana.enviar("Oi, pessoal!");
        joao.enviar("Oi, Ana!");
        maria.enviar("Tudo bem com vocês?");
    }
}