package application.model;

public class Contato {
    private String nome;
    private String sobrenome;
    private String email;
    private String telefone;
    private String assunto;
    private String mensagem;

    public Contato(String nome, String sobrenome, String email, String telefone, String assunto, String mensagem) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.telefone = telefone;
        this.assunto = assunto;
        this.mensagem = mensagem;
    }

    public String getNome() { return nome; }
    public String getSobrenome() { return sobrenome; }
    public String getEmail() { return email; }
    public String getTelefone() { return telefone; }
    public String getAssunto() { return assunto; }
    public String getMensagem() { return mensagem; }
}
