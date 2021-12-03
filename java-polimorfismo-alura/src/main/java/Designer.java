public class Designer extends Funcionario{

    String apelido;

    public String getApelido(){
        return apelido;
    }

    public void setApelido(String novoApelido){
        this.apelido = novoApelido;
    }

    // para cada tipo de funcionario o metodo de bonificacao se comporta de maneira diferente
    public double getBonificacao(){
        return 10;
    }
}
