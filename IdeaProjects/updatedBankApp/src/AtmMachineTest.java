import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AtmMachineTest {
    @Test
    public void testThatAccountCanAddCustomer(){
        TheBank myTheBank = new TheBank("Toheeb Afeez", "1234567890", "1234", 0);
        Account myAccount = new Account();
        myAccount.addToListOfAccounts(myTheBank);
        assertEquals(1, myAccount.getAccount().size());
    }

    @Test
    public void testToCheckFor3Users(){
        TheBank firstTheBank = new TheBank("Toheeb Afeez", "1234567890", "1234", 0);
        TheBank secondTheBank = new TheBank("Obanla one", "213441221", "3344", 0);
        TheBank thirdTheBank = new TheBank("Obaturn", "64534223", "5663", 0);
        Account myAccount = new Account();
        myAccount.addToListOfAccounts(thirdTheBank);
        myAccount.addToListOfAccounts(secondTheBank);
        myAccount.addToListOfAccounts(firstTheBank);
        assertEquals(3, myAccount.getAccount().size());
    }

    @Test
    public void testThatAccountCanDeposit(){
        AtmMachine atmMachine = new AtmMachine();
        assertEquals(10000, atmMachine.deposit(10000));
    }


    @Test
    public void testThatAccountCanWithdraw(){
        AtmMachine atmMachine = new AtmMachine();
        assertEquals(10000, atmMachine.deposit(10000));
       assertEquals(6000, atmMachine.withdraw(4000));
    }

    @Test
    public void testThatAccountCanTransfer(){
        Account myAccount = new Account();
        AtmMachine atmMachine = new AtmMachine();
        atmMachine.deposit(10000);
        assertEquals(4000, atmMachine.transfer(4000,"9876543210"));
        System.out.println(atmMachine.transfer(0,"9876543210"));
    }

    @Test
    public void testThatTheFirstAccountBalanceWasDebited(){
        Account myAccount = new Account();
        AtmMachine atmMachine = new AtmMachine();
        atmMachine.deposit(10000);
        atmMachine.transfer(4000,"9876543210");
        assertEquals(6000, atmMachine.accountBalance());
        System.out.println(atmMachine.accountBalance());

    }







}
