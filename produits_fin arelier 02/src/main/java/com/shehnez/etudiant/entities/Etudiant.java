package com.shehnez.etudiant.entities;
import java.io.Serializable;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;


@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode

@Entity
@Table (name =  "T_ETUDIANT")
public class Etudiant implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Etudiant() {
		// TODO Auto-generated constructor stub
	}

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column( name = "ETUD_ID")
	Long id;
	
	
	@Column( name = "ETUD_NOM")
	String nom;
	
	@Column( name = "ETUD_PRENOM")
	String prenom;
	
	@Column( name = "ETUD_EMAIL")
	String email;
	
	@Column( name = "ETUD_NIVEAU")
	@Enumerated(EnumType.STRING)
	Niveau niveau;
	
	@Column( name = "ETUD_NAISSANCE")
	@Temporal(TemporalType.DATE)
	Date date_naissance;
	
	@Column( name = "ETUD_AGE")
	@Transient
	float age;
	

	public void setDateNaissance(Date dateNaiss) {
		this.date_naissance=dateNaiss;
		
	}

	public Long getIdEtudiant() {
		// TODO Auto-generated method stub
		return this.id;
	}

	public void setIdEtudiant(Long id2) {
		this.id =id2;
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Niveau getNiveau() {
		return niveau;
	}

	public void setNiveau(Niveau niveau) {
		this.niveau = niveau;
	}

	public Date getDate_naissance() {
		return date_naissance;
	}

	public void setDate_naissance(Date date_naissance) {
		this.date_naissance = date_naissance;
	}

	public float getAge() {
		return age;
	}

	public void setAge(float age) {
		this.age = age;
	}

	public Etudiant(String nom, String prenom, String email, Niveau niveau, Date date_naissance, float age) {
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.niveau = niveau;
		this.date_naissance = date_naissance;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Etudiant [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", niveau=" + niveau
				+ ", date_naissance=" + date_naissance + ", age=" + age + "]";
	}
	
	
}
