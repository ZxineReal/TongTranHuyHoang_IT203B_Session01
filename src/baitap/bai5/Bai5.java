package baitap.bai5;

public class Bai5 {
    public static void main(String[] args) {
        User user = new User();

        try {
            user.setAge(-10);
        } catch (InvalidAgeException e) {
            System.out.println("Lỗi: " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("Chương trình vẫn tiếp tục chạy.");
    }
}
