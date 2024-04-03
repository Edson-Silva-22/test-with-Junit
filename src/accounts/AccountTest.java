package accounts;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AccountTest {
    @Test
    public void depositar(){
        Account pessoa1 = new Account("Alex", "128", "55555-7", 200.00);

        assertEquals(true, pessoa1.depositar(50));
    }

    @Test
    public void sacar(){
        Account pessoa1 = new Account("Alex", "128", "55555-7", 200.00);

        assertEquals(true, pessoa1.sacar(30));
    }

    @Test
    public void transferir(){
        Account pessoa1 = new Account("Alex", "128", "55555-7", 200.00);
        Account pessoa2 = new Account("Maria", "128", "44444-7", 50.00);

        assertEquals(true, pessoa1.transferir(50, pessoa2));
    }
}
