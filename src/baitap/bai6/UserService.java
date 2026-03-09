package baitap.bai6;

import java.io.IOException;

public class UserService {
    public static void processUserData(User user) throws IOException {
        System.out.println("Đang xử lý dữ liệu người dùng");
        saveToFile(user);
    }

    public static void saveToFile(User user) throws IOException {
        throw new IOException("Không thể ghi dữ liệu vào file.");
    }
}
