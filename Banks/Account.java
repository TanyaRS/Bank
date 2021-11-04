package Banks;

import java.util.Objects;

public class Account{
    public int scorenumber;
    public int balance;

    public Account(int scorenumber,int balance) {
        this.scorenumber = scorenumber;
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return scorenumber == account.scorenumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(scorenumber);
    }
    //        @Override
//        public boolean equals (Object o){
//            if (this == o) return true;
//            if (o == null) return false;
//            if (getClass() != o.getClass()) return false;
//            Account otherAccount = (Account) o;
//            return this.scorenumber.equals(otherAccount.scorenumber);//Objects.equals(this.scorenumber, otherAccount.scorenumber);
//        }
//
//        @Override
//        public int hashCode () {
//            return scorenumber;
//        }

    }

