package pe.edu.upc.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Person")
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPerson;
	
	private String namePerson;
	private String lastnamePerson;
	private String mailPerson;
	private int dniPerson;
	private String directionPerson;
	
	
	public int getIdPerson() {
		return idPerson;
	}
	public void setIdPerson(int idPerson) {
		this.idPerson = idPerson;
	}
	public String getNamePerson() {
		return namePerson;
	}
	public void setNamePerson(String namePerson) {
		this.namePerson = namePerson;
	}
	public String getLastnamePerson() {
		return lastnamePerson;
	}
	public void setLastnamePerson(String lastnamePerson) {
		this.lastnamePerson = lastnamePerson;
	}
	public String getMailPerson() {
		return mailPerson;
	}
	public void setMailPerson(String mailPerson) {
		this.mailPerson = mailPerson;
	}
	public int getDniPerson() {
		return dniPerson;
	}
	public void setDniPerson(int dniPerson) {
		this.dniPerson = dniPerson;
	}
	public String getDirectionPerson() {
		return directionPerson;
	}
	public void setDirectionPerson(String directionPerson) {
		this.directionPerson = directionPerson;
	}
	
}
