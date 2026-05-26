package com.example.javademo2.controller;
import com.example.javademo2.model.ChucVu;
import com.example.javademo2.repository.ChucVuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
@Controller
@RequestMapping("/chucvu")
public class ChucVuController {
    @Autowired
    private ChucVuRepository chucVuRepo;

    // 1. Hàm load giao diện và danh sách 
    @GetMapping
    public String showPage(Model model) {
        model.addAttribute("listChucVu", chucVuRepo.findAll());
        model.addAttribute("chucVuMoi", new ChucVu()); // Chuẩn bị sẵn 1 đối tượng rỗng để Thêm mới
        return "chucvu"; // Trả về file HTML tên là chucvu.html
    }

    // 2. Hàm Thêm / Sửa
    @PostMapping("/save")
    public String save(@ModelAttribute("chucVuMoi") ChucVu chucVu) {
        chucVuRepo.save(chucVu);
        return "redirect:/chucvu"; // Lưu xong thì f5 lại trang
    }

    // 3. Hàm Xóa
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") String machucvu) {
        chucVuRepo.deleteById(machucvu);
        return "redirect:/chucvu";
    }

}
