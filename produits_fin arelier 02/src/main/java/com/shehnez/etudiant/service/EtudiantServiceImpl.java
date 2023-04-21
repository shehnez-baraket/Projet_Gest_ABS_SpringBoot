package com.shehnez.etudiant.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shehnez.etudiant.entities.Etudiant;
import com.shehnez.etudiant.repos.EtudiantRepository;


@Service
public class EtudiantServiceImpl implements EtudiantService{

	@Autowired
	EtudiantRepository EtudiantRepository;
	
	@Override
	public Etudiant saveEtudiant(Etudiant p) {
		return EtudiantRepository.save(p);
	}

	@Override
	public Etudiant updateEtudiant(Etudiant p) {
		return EtudiantRepository.save(p);
	}

	@Override
	public void deleteEtudiant(Etudiant p) {
		EtudiantRepository.delete(p);
		
	}

	@Override
	public void deleteEtudiantById(Long id) {
		EtudiantRepository.deleteById(id);
		
	}

	@Override
	public Etudiant getEtudiant(Long id) {
		return EtudiantRepository.findById(id).get();
	}

	@Override
	public List<Etudiant> getAllEtudiants() {
		
		return EtudiantRepository.findAll();
	}
	
	

}
