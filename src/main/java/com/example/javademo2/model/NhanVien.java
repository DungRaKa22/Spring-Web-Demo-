package com.example.javademo2.model;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDate;

@Entity
@Table(name = "NhanVien")
public class NhanVien {

    @Id
    @Column(name = "manhanvien", length = 10)
    private String manhanvien;

    @Column(name = "tennhanvien",length = 50)
    private String tennhanvien;

    @Column(name = "ngaysinh")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate ngaysinh;

    @Column(name = "gioitinh", length = 5)
    private String gioitinh;

    @Column(name = "ngayvaolam")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate ngayvaolam;

    @Column(name = "chucvu", length = 50, nullable = false)
    private String chucvu;

    @Column(name = "diachi", length = 50)
    private String diachi;

    @Column(name = "sdt", length = 15)
    private String sdt;

    @Column(name = "ghichu", length = 50)
    private String ghichu;


    public NhanVien() {}
    public String getManhanvien() { return manhanvien; }
    public void setManhanvien(String manhanvien) { this.manhanvien = manhanvien; }
    public String getTennhanvien() { return tennhanvien; }
    public void setTennhanvien(String tennhanvien) { this.tennhanvien = tennhanvien; }
    public LocalDate getNgaysinh() { return ngaysinh; }
    public void setNgaysinh(LocalDate ngaysinh) { this.ngaysinh = ngaysinh; }
    public String getGioitinh() { return gioitinh; }
    public void setGioitinh(String gioitinh) { this.gioitinh = gioitinh; }
    public LocalDate getNgayvaolam() { return ngayvaolam; }
    public void setNgayvaolam(LocalDate ngayvaolam) { this.ngayvaolam = ngayvaolam; }
    public String getChucvu() { return chucvu; }
    public void setChucvu(String chucvu) { this.chucvu = chucvu; }
    public String getDiachi() { return diachi; }
    public void setDiachi(String diachi) { this.diachi = diachi; }
    public String getSdt() { return sdt; }
    public void setSdt(String sdt) { this.sdt = sdt; }
    public String getGhichu() { return ghichu; }
    public void setGhichu(String ghichu) { this.ghichu = ghichu; }
}