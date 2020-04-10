package comparingObjectsForEqualityDemos;

public class BankAccount {
    String acctNumber;
    int acctType;

    @Override
    public boolean equals(Object o) {
        if (o instanceof BankAccount) {
            BankAccount b = (BankAccount)o;
            return (acctNumber.equals(b.acctNumber) &&
                    acctType == b.acctType);
        }
        else
            return false;
    }
}
