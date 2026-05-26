package com.example.javademo2.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Quyen")
public class Quyen {
    @Id
    @Column(name = "maquyen", length = 10)
    private String maquyen;

    @Column(name = "tenquyen",  nullable = false, unique = true)
    private String tenquyen;

    @Column(name = "ghichu")
    private String ghichu;

    public Quyen() {}
    public String getMaquyen() { return maquyen; }
    public void setMaquyen(String maquyen) { this.maquyen = maquyen; }
    public String getTenquyen() { return tenquyen; }
    public void setTenquyen(String tenquyen) { this.tenquyen = tenquyen; }
    public String getGhichu() { return ghichu; }
    public void setGhichu(String ghichu) { this.ghichu = ghichu; }
}