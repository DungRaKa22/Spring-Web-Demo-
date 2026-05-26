package com.example.javademo2;

import com.example.javademo2.model.Quyen;
import com.example.javademo2.repository.QuyenRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JavaDemo2Application {

    public static void main(String[] args) {
        SpringApplication.run(JavaDemo2Application.class, args);
    }

    // Hàm này sẽ tự động chạy 1 lần duy nhất mỗi khi bật ứng dụng
    @Bean
    public CommandLineRunner initData(QuyenRepository quyenRepo) {
        return args -> {
            // Kiểm tra xem bảng Quyền đã có dữ liệu chưa, chưa có thì mới Insert
            if (quyenRepo.count() == 0) {
                Quyen q1 = new Quyen();
                q1.setMaquyen("Q01");
                q1.setTenquyen("Quản trị viên");
                q1.setGhichu("Full quyền hệ thống");
                quyenRepo.save(q1);

                Quyen q2 = new Quyen();
                q2.setMaquyen("Q02");
                q2.setTenquyen("Nhân viên");
                q2.setGhichu("Quyền cơ bản");
                quyenRepo.save(q2);

                System.out.println("Đã tự động mồi dữ liệu bảng Quyền thành công!");
            }
        };
    }
}