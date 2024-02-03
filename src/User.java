public class User {
    final String firstName;
    final String lastName;
    final String email;
    final String address;
    final String phone;
    final int age;

    User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.address = builder.address;
        this.phone = builder.phone;
        this.age = builder.age;
    }

    static class UserBuilder {
        private final String firstName;
        private final String lastName;
        private final String email;
        private String address = "";
        private String phone = "";
        private int age = 0;

        UserBuilder(String firstName, String lastName, String email) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
        }

        UserBuilder Address(String address) {
            this.address = address;
            return this;
        }

        UserBuilder Phone(String phone) {
            this.phone = phone;
            return this;
        }

        UserBuilder Age(int age) {
            this.age = age;
            return this;
        }

        User build() {
            return new User(this);
        }
    }
}
