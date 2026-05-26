package com.example.javademo2.repository;

import com.example.javademo2.model.NguoiDung;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface NguoiDungRepository extends JpaRepository<NguoiDung, String> {
    List<NguoiDung> findByTendangnhapContaining(String keyword);
}