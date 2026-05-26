package com.example.javademo2.controller;
import com.example.javademo2.model.NhanVien;
import com.example.javademo2.repository.NhanVienRepository;
import com.example.javademo2.repository.ChucVuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
@Controller
@RequestMapping("/nhanvien")
public class NhanVienCotroller {
    @Autowired
    private NhanVienRepository nhanVienRepo;

    @Autowired
    private ChucVuRepository chucVuRepo;

    @GetMapping
    public String showPage(Model model, @RequestParam(name = "keyword", required = false) String keyword) {
        if (keyword != null && !keyword.isEmpty()) {
            model.addAttribute("listNhanVien", nhanVienRepo.findByTennhanvienContainingOrManhanvienContaining(keyword, keyword));
        } else {
            model.addAttribute("listNhanVien", nhanVienRepo.findAll());
        }

        model.addAttribute("nhanVienMoi", new NhanVien());

        model.addAttribute("listChucVu", chucVuRepo.findAll());

        return "nhanvien";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("nhanVienMoi") NhanVien nhanVien) {
        nhanVienRepo.save(nhanVien);
        return "redirect:/nhanvien";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") String id) {
        nhanVienRepo.deleteById(id);
        return "redirect:/nhanvien";
    }
}
