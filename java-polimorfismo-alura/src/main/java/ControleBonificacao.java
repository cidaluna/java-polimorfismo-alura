public class ControleBonificacao {

    private double soma; // soma de todas as bonificacoes

    public void registra(Funcionario f){  // este parametro pode ser um funcionario, um gerente, um editor, qualquer pessoa
        double boni = f.getBonificacao(); // este metodo pode ser aplicado seguindo as regras do TIPO do funcionario referenciado
        this.soma = this.soma + boni;
    }

    public double getSoma(){
        return soma;
    }


}
