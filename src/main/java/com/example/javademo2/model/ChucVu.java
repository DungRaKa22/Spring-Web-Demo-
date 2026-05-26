package com.example.javademo2.model;
import jakarta.persistence.*;
@Entity
@Table(name = "ChucVu")
public class ChucVu {
    @Id
    @Column(name = "machucvu", length = 10)
    private String machucvu;

    @Column(name = "tenchucvu",  nullable = false, unique = true)
    private String tenchucvu;


    @Column(name = "ghichu")
    private String ghichu;

    public ChucVu() {}

    public String getMachucvu() { return machucvu; }
    public void setMachucvu(String machucvu) { this.machucvu = machucvu; }

    public String getTenchucvu() { return tenchucvu; }
    public void setTenchucvu(String tenchucvu) { this.tenchucvu = tenchucvu; }

    public String getGhichu() { return ghichu; }
    public void setGhichu(String ghichu) { this.ghichu = ghichu; }
}
