package rocks.zipcode.atm.bank;

/**
 * @author ZipCodeWilmington
 */
public final class AccountData {

    private final int id;
    private final String name;
    private final String email;
    private final Double balance;

    AccountData(int id, String name, String email, double balance) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return String.format("Account id: %d\nName: %s\nEmail: %s\nBalance: $%.2f", id, name, email, balance);
//
//                 + id + '\n' +
//                "Name: " + name + '\n' +
//                "Email: " + email + '\n' +
//                "Balance: " + balance;
    }
}
