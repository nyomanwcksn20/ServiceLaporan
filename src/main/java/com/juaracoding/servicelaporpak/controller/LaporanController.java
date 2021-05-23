package com.juaracoding.servicelaporpak.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juaracoding.servicelaporpak.entity.DataUser;
import com.juaracoding.servicelaporpak.entity.Laporan;
import com.juaracoding.servicelaporpak.repository.LaporanRepository;

@RestController
@RequestMapping("/laporan")
public class LaporanController {

	@Autowired
	LaporanRepository laporanRepo;
	
	@GetMapping("/")
	public List<Laporan> getAll() {
		return laporanRepo.findAll();
	}

	@GetMapping("/name/{value}")
	public Laporan getByName(@PathVariable("value") String value) {
		return laporanRepo.findByName(value);
	}
	
	@PostMapping("/lapor/")
	public String addUser(@RequestBody Laporan user) {
		laporanRepo.save(user);
		return "Insert Berhasil";
	}
}
