package accounts;
public class Account {
    String nome;
    String agencia;
    String nconta;
    double saldo;

    public Account(String nome, String agencia, String nconta, double saldo){
        this.nome = nome;
        this.agencia = agencia;
        this.nconta = nconta;
        this.saldo = saldo;
    }

    public void exibirConta(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Agência: " + this.agencia);
        System.out.println("Número da Conta: " + this.nconta);
        System.out.println("Saldo: " + this.saldo);
    }

    public boolean depositar(double valor){
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("\nDeposito realizado com sucesso.\n");
            return true;
        }

        else {
            System.out.println("\nO valor do deposito deve ser maior que zero.\n");
            return false;
        }
    }

    public boolean sacar(double valor){
        if (this.saldo > valor || this.saldo == valor) {
            this.saldo -= valor;
            System.out.println("\nSaque realizado com sucesso.\n");
            return true;
        }

        else {
            System.out.println("\nSaldo insuficiente para realizar o saque.\n");
            return false;
        }
    }

    public boolean transferir(double valor, Account destino){
        if (valor > 0) {
            
            if (this.saldo > valor || this.saldo == valor) {
                this.saldo -= valor;
                destino.saldo += valor;
    
                System.out.println("\nTranferência realizada com sucesso.\n");
                return true;
            }
    
            else {
                System.out.println("\nSaldo insuficiente para realizar a transferência.\n");
                return false;
            }

        }

        else {
            System.out.println("\nO valor da transferência deve ser maior que zero.\n");
            return false;
        }
    }
}
