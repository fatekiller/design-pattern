package org.example.build.pattern.build.builder;

public class User {
    private String name;

    private int age;

    private String password;

    private User(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.password = builder.password;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", password='" + password + '\'' +
                '}';
    }

    public static class Builder {

        private String name;

        private int age;

        private String password;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
