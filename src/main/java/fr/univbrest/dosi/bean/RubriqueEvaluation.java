package fr.univbrest.dosi.bean;

import java.io.Serializable;
import javax.persistence.*;



@Entity
@Table(name="rubrique_evaluation")
@NamedQueries({
@NamedQuery(name="RubriqueEvaluation.findAll", query="SELECT r FROM RubriqueEvaluation r"),
@NamedQuery(name="RubriqueEvaluation.findByEvaluation", query="SELECT r FROM RubriqueEvaluation r where r.evaluation.idEvaluation = ?1")
})
public class RubriqueEvaluation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_RUBRIQUE_EVALUATION")
	private int idRubriqueEvaluation;

	private String designation;

	private byte ordre;

	//uni-directional many-to-one association to Evaluation
	@ManyToOne
	@JoinColumn(name="ID_EVALUATION")
	private Evaluation evaluation;

	//uni-directional many-to-one association to Rubrique
	@ManyToOne
	@JoinColumn(name="ID_RUBRIQUE")
	private Rubrique rubrique;

	public RubriqueEvaluation() {
	}

	public int getIdRubriqueEvaluation() {
		return this.idRubriqueEvaluation;
	}

	public void setIdRubriqueEvaluation(int idRubriqueEvaluation) {
		this.idRubriqueEvaluation = idRubriqueEvaluation;
	}

	public String getDesignation() {
		return this.designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public byte getOrdre() {
		return this.ordre;
	}

	public void setOrdre(byte ordre) {
		this.ordre = ordre;
	}

	public Evaluation getEvaluation() {
		return this.evaluation;
	}

	public void setEvaluation(Evaluation evaluation) {
		this.evaluation = evaluation;
	}

	public Rubrique getRubrique() {
		return this.rubrique;
	}

	public void setRubrique(Rubrique rubrique) {
		this.rubrique = rubrique;
	}

}

 interface RubriqueOnly {

	  Rubrique getRubrique();
	}