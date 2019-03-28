package fr.univbrest.dosi.bean;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the question database table.
 * 
 */
@Entity
@Table(name="question")
@NamedQuery(name="Question.findAll", query="SELECT q FROM Question q")
public class Question implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_QUESTION")
	private int idQuestion;
    
	@ManyToOne
	@JoinColumn(name="ID_QUALIFICATIF")
	private Qualificatif qualificatif;

	@Column(name="INTITULE")
	private String intitule;
    
	@ManyToOne
	@JoinColumn(name="NO_ENSEIGNANT")
	private Enseignant enseignant;

	@Column(name="TYPE")
	private String type;

	public Question() {
		super();
	}

	public Question(int idQuestion, Qualificatif qualificatif, String intitule, Enseignant enseignant, String type) {
		super();
		this.idQuestion = idQuestion;
		this.qualificatif = qualificatif;
		this.intitule = intitule;
		this.enseignant = enseignant;
		this.type = type;
	}
	
	public int getIdQuestion() {
		return idQuestion;
	}

	public void setIdQuestion(int idQuestion) {
		this.idQuestion = idQuestion;
	}

	public Qualificatif getQualificatif() {
		return qualificatif;
	}

	public void setQualificatif(Qualificatif qualificatif) {
		this.qualificatif = qualificatif;
	}

	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public Enseignant getEnseignant() {
		return enseignant;
	}

	public void setEnseignant(Enseignant enseignant) {
		this.enseignant = enseignant;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Question [idQuestion=" + idQuestion + ", qualificatif=" + qualificatif + ", intitule=" + intitule
				+ ", enseignant=" + enseignant + ", type=" + type + "]";
	}
    
	
	

}