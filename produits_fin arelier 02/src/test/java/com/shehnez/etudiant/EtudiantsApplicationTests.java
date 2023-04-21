package com.shehnez.etudiant;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shehnez.etudiant.entities.Etudiant;
import com.shehnez.etudiant.entities.Niveau;
import com.shehnez.etudiant.repos.EtudiantRepository;


@SpringBootTest
class EtudiantsApplicationTests {

	@Autowired
	private EtudiantRepository EtudiantRepository;
	
	@Test
	public void testCreateEtudiant() {
	Etudiant prod = new Etudiant("shehnez","baraket","bshehnez0@gmail.com",Niveau.Info2,new Date(),20);
	EtudiantRepository.save(prod);
	}
	
	@Test
	public void testFindEtudiant()
	{
	Etudiant p = EtudiantRepository.findById(3L).get();
	System.out.println(p);
	}
	
	@Test
	public void testUpdateEtudiant()
	{
	Etudiant p = EtudiantRepository.findById(4L).get();
	p.setDateNaissance(new Date());
	EtudiantRepository.save(p);
	
	System.out.println(p);
	}
	
	@Test
	public void testDeleteEtudiant()
	{
		EtudiantRepository.deleteById(4L);
	}
	
	@Test
	public void testFindAllEtudiants()
	{
		List<Etudiant> prods = EtudiantRepository.findAll();
		
		for (Etudiant p:prods)
			 System.out.println(p);	
	}	
}
