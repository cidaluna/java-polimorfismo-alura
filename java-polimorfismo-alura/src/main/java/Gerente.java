public class Gerente extends Funcionario{

    private int senha;

    public int getSenha(){
        return this.senha;
    }

    public void setSenha(int novaSenha){
        this.senha = novaSenha;
    }

    // para cada tipo de funcionario o metodo de bonificacao se comporta de maneira diferente
    public double getBonificacao(){
        return super.getBonificacao() + super.getSalario();
    }

}
