package com.shehnez.etudiant.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shehnez.etudiant.entities.Etudiant;



public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {

}
