package baitap;

import java.io.IOException;

public class Bai4 {
    public static void saveToFile() throws IOException {
        throw new IOException("Lỗi khi ghi dữ liệu vào file!");
    }

    public static void processUserData() throws IOException {
        System.out.println("Đang xử lý dữ liệu người dùng...");
        saveToFile();
    }

    public static void main(String[] args) {
        try {
            processUserData();
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi: " + e.getMessage());
        }
        System.out.println(".");
    }
}