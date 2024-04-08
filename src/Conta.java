import java.util.Date;

public class Operacao {

    /* Data de realização da operação */
    public Date data;

    /* Tipo da operação */
    public char tipo;

    /* Valor da operação */
    public double valor;

    public Operacao(char tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
        data = new Date();
    }

}
public class Conta {

    String dono = new Cliente();
    double saldo;
    int numero;
    String agencia;
    double limite;




    boolean depositar(double valor) {
        if(valor > 0.0) {
            this.saldo += valor;
            return true;
        } else {
            return false;
        }
    }


    boolean sacar(double valor) {
        if(valor > 0.0 && valor <= this.saldo) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }


    boolean transferir(Conta contaDestino, double valor) {
        boolean saqueRealizado = this.sacar(valor);
        if(saqueRealizado) {
            boolean depositoRealizado = contaDestino.depositar(valor);
            return depositoRealizado;
        } else {
            return false;
        }
    }

    void imprimir () {
        System.out.println ("Dono: "+Dono.Nome);
        System.out.println ("CPF: "+Dono.CPF);
        System.out.println ("Endereço: "+Dono.endereço);
        System.out.println ("Idade: "Dono.idade);
        System.out.println ("Genero: "+Dono.genero);
        System.out.println ("Numero da conta: "+numero);
        System.out.println ("Saldo: " +saldo);
        System.out.println ("Limite: "+limite);

    }
}