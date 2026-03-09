package baitap.bai3;

public class Main {
    public static void main(String[] args) {
        User user = new User();

        try {
            user.setAge(-5);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        user.setAge(20);
        System.out.println("Tuổi: " + user.getAge());
    }
}