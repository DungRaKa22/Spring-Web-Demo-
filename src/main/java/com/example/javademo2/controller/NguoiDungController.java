package com.example.javademo2.controller;

import com.example.javademo2.model.NguoiDung;
import com.example.javademo2.repository.NguoiDungRepository;
import com.example.javademo2.repository.NhanVienRepository;
import com.example.javademo2.repository.QuyenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/taikhoan")
public class NguoiDungController {

    @Autowired private NguoiDungRepository nguoiDungRepo;
    @Autowired private NhanVienRepository nhanVienRepo;
    @Autowired private QuyenRepository quyenRepo;

    @GetMapping
    public String showPage(Model model, @RequestParam(name = "keyword", required = false) String keyword) {
        if (keyword != null && !keyword.isEmpty()) {
            model.addAttribute("listTaiKhoan", nguoiDungRepo.findByTendangnhapContaining(keyword));
        } else {
            model.addAttribute("listTaiKhoan", nguoiDungRepo.findAll());
        }

        model.addAttribute("taiKhoanMoi", new NguoiDung());
        model.addAttribute("listNhanVien", nhanVienRepo.findAll());
        model.addAttribute("listQuyen", quyenRepo.findAll());

        return "taikhoan";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("taiKhoanMoi") NguoiDung nguoiDung) {
        nguoiDungRepo.save(nguoiDung);
        return "redirect:/taikhoan";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") String id) {
        nguoiDungRepo.deleteById(id);
        return "redirect:/taikhoan";
    }
}