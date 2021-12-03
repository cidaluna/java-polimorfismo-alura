public class Funcionario {

    private String nome;
    private String cpf;
    private double salario;

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

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double novoSalario) {
        this.salario = novoSalario;
    }

    // para cada tipo de funcionario o metodo de bonificacao se comporta de maneira diferente
    public double getBonificacao() {
        return this.salario * 0.5;
    }


}
