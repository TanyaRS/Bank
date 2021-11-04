package Banks;

public class Account{
    public Integer scorenumber;
    public int balance;
    public Client client;

    public Account(Integer scorenumber, int balance, Client client) {
        this.scorenumber = scorenumber;
        this.balance = balance;
        this.client = client;
    }

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return scorenumber == account.scorenumber;
    }*/

    /*@Override
    public int hashCode() {
        return Objects.hash(scorenumber);
    }*/

    @Override
    public boolean equals (Object o){
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Account otherAccount = (Account) o;
        return this.scorenumber.equals(otherAccount.scorenumber);//Objects.equals(this.scorenumber, otherAccount.scorenumber);
    }

        @Override
        public int hashCode () {
            return scorenumber;
        }

    }

