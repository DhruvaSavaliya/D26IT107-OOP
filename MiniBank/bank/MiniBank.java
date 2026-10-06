package bank;

public class MiniBank {

    public static void main(String[] args) {

        Account account1 = new Account("Dhruva", 7000);
        Account account2 = new Account("Bhakti",4351);
        Account account3 = new Account("John");

        System.out.println("Accounts:");

        System.out.println(account1.toString());
        System.out.println(account2.toString());
        System.out.println(account3.toString());

        System.out.println();

        Account account4 = account1;

        System.out.println("Equals:");
        System.out.println("account1 equals account4: "
                + account1.equals(account4));

        System.out.println();

        System.out.println("Instanceof:");

        if (account1 instanceof Account) {
            System.out.println("account1 is an Account");
        }

        System.out.println();

        Customer.Address address =
                new Customer.Address(
                        "Charusat Campus, petlad highway",
                        "Anand",
                        "388001"
                );

        Customer customer1 =
                new Customer("Dhruva", address);

        Customer customer2 = customer1.clone();

        System.out.println("Customer:");

        System.out.println("Name: "
                + customer1.getName());

        System.out.println("Address: "
                + customer1.getAddress().getLine());

        System.out.println("City: "
                + customer1.getAddress().getCity());

        System.out.println("Pincode: "
                + customer1.getAddress().getPincode());

        System.out.println();

        System.out.println("Clone created: "
                + (customer1 != customer2));
    }
}