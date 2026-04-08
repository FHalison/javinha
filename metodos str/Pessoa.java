public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;
    private Telefone telefone;

    public Pessoa(String nome, String cpf, String endereco, String telefoneComercial, String telefonePessoal) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = new Telefone(telefoneComercial, telefonePessoal);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefoneComercial() {
        return telefone.getTelefoneComercial();
    }
    public void setTelefoneComercial(String telefoneComercial){
        telefone.setTelefoneComercial(telefoneComercial);
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }
}
