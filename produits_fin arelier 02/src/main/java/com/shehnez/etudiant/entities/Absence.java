package com.shehnez.etudiant.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
@Table (name =  "T_ABSENCE")
public class Absence {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column( name = "ABS_ID")
	int id;
	
	@Column( name = "ABS_SEANCE")
	String Seance;
	
	@Column( name = "ABS_DATE")
	Date date;
	
	@Column( name = "ABS_MODULE")
	String Module;
	
	@Column( name = "ABS_EXCUSE")
	String excuse;
	
	

}
