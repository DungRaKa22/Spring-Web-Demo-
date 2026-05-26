package com.example.javademo2.repository;

import com.example.javademo2.model.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface NhanVienRepository extends JpaRepository<NhanVien, String> {
    List<NhanVien> findByTennhanvienContainingOrManhanvienContaining(String ten, String ma);
}