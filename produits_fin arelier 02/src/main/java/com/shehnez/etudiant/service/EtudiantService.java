package com.shehnez.etudiant.service;

import java.util.List;

import com.shehnez.etudiant.entities.Etudiant;

public interface EtudiantService {
	Etudiant saveEtudiant(Etudiant p);
	Etudiant updateEtudiant(Etudiant p);
	void deleteEtudiant(Etudiant p);
	void deleteEtudiantById(Long id);
	Etudiant getEtudiant(Long id);
	List<Etudiant> getAllEtudiants();

}
