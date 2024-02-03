public class UserApp {
    public static void main(String[] args) {
        User user1 = new User.UserBuilder("Juan", "Dela Cruz", "juan.delacruz@neu.edu.ph")
                .Address("Quezon City")
                .Phone("09876543210")
                .Age(18)
                .build();

        System.out.println(user1.firstName + " " + user1.lastName);
        System.out.println(user1.email);
        System.out.println(user1.address);
        System.out.println(user1.phone);
        System.out.println(user1.age);
    }
}
