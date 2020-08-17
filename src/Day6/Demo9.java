package Day6;

abstract class transaction{

    int amount;

    abstract void getBalance();

    abstract void debit();
    abstract void credit();
}

abstract class loan extends transaction{
    abstract void test1();
}




public class Demo9 {
}
