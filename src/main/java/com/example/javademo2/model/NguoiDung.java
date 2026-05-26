package com.example.javademo2.model;

import jakarta.persistence.*;

@Entity
@Table(name = "NguoiDung")
public class NguoiDung {
    @Id
    @Column(name = "id", length = 10)
    private String id;

    @Column(name = "manhanvien", length = 10, nullable = false)
    private String manhanvien;

    @Column(name = "tendangnhap")
    private String tendangnhap;

    @Column(name = "password")
    private String password;

    @Column(name = "quyen",  nullable = false)
    private String quyen;

    @Column(name = "ghichu")
    private String ghichu;

    public NguoiDung() {}
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getManhanvien() { return manhanvien; }
    public void setManhanvien(String manhanvien) { this.manhanvien = manhanvien; }
    public String getTendangnhap() { return tendangnhap; }
    public void setTendangnhap(String tendangnhap) { this.tendangnhap = tendangnhap; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    public String getQuyen() { return quyen; }
    public void setQuyen(String quyen) { this.quyen = quyen; }
    public String getGhichu() { return ghichu; }
    public void setGhichu(String ghichu) { this.ghichu = ghichu; }
}