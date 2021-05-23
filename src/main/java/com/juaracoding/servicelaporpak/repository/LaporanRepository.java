package com.juaracoding.servicelaporpak.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.juaracoding.servicelaporpak.entity.DataUser;
import com.juaracoding.servicelaporpak.entity.Laporan;

public interface LaporanRepository extends JpaRepository<Laporan, Long> {
	Laporan findByName(String name); 
}
