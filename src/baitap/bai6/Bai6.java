package baitap.bai6;

import java.io.IOException;
public class Bai6 {
    public static void main(String[] args) {
        User user = new User("An");

        try {
            user.printUserName();
            user.setAge(-5);
            UserService.processUserData(user);
        }
        catch (InvalidAgeException e) {
            LoggerUtil.logError(e.getMessage());
        }
        catch (IOException e) {
            LoggerUtil.logError("Lỗi hệ thống khi lưu file: " + e.getMessage());
        }
        System.out.println(".");
    }
}

