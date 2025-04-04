package application.service;

import application.model.Contato;
import java.util.regex.Pattern;

public class ContatoService {

    public static boolean validarContato(Contato contato) {
        return !contato.getNome().isEmpty()
                && !contato.getSobrenome().isEmpty()
                && isEmailValido(contato.getEmail())
                && !contato.getTelefone().isEmpty()
                && !contato.getAssunto().isEmpty()
                && !contato.getMensagem().isEmpty();
    }

    private static boolean isEmailValido(String email) {
        String regex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        return Pattern.matches(regex, email);
    }

    public static void salvarContato(Contato contato) {
        System.out.println("Contato salvo:");
        System.out.println("Nome: " + contato.getNome() + " " + contato.getSobrenome());
        System.out.println("Email: " + contato.getEmail());
        System.out.println("Telefone: " + contato.getTelefone());
        System.out.println("Assunto: " + contato.getAssunto());
        System.out.println("Mensagem: " + contato.getMensagem());
    }
}
