package Banks;

import java.util.Objects;

public class Account{
    public int scorenumber;
    public int balance;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Account otherAccount = (Account) o;
        return Objects.equals(this.scorenumber, otherAccount.scorenumber);//scorenumber == account.scorenumber && balance == account.balance;
    }

    @Override
    public int hashCode() {
    return scorenumber;
    }

    public Account(int scorenumber,int balance) {
        this.scorenumber = scorenumber;
        this.balance = balance;
    }
}

