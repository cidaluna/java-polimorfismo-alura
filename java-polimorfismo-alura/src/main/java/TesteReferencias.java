public class TesteReferencias {

    public static void main(String[] args) {

        Funcionario f = new Funcionario(); // o ideal é não instanciar funcionario, visto que o mesmo é apenas um conceito/abstracao
        f.setSalario(1000);

        Funcionario g1 = new Gerente(); // o TIPO funcionario pode ser usado normalmente, mas a instancia deve ser algo "concreto" no caso, um gerente
        g1.setNome("Marcos");
        g1.setSalario(5000.0);

        Funcionario d = new Designer();
        d.setSalario(7000);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(f);
        controle.registra(g1);
        controle.registra(d);

        System.out.println("Funcionario recebe meio salário de bonificacao ");
        System.out.println("Salário Funcionario: " +f.getSalario());
        System.out.println("Bonificacao Funcionario: " +f.getBonificacao());
        System.out.println("\nGerente recebe um salário e meio de bonificacao ");
        System.out.println("Salário Gerente: " +g1.getSalario());
        System.out.println("Bonificacao Gerente:  " +g1.getBonificacao());
        System.out.println("\nDesigner recebe 10 reais de bonificacao ");
        System.out.println("Salário Designer: " +f.getSalario());
        System.out.println("Bonificacao Designer: " +d.getBonificacao());
        System.out.println("\nSoma Total das Bonificações: " +controle.getSoma());
    }
}
