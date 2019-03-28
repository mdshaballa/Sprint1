package fr.univbrest.dosi.bean;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the question_evaluation database table.
 * 
 */
@Entity
@Table(name="question_evaluation")
@NamedQuery(name="QuestionEvaluation.findAll", query="SELECT q FROM QuestionEvaluation q")
public class QuestionEvaluation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_QUESTION_EVALUATION")
	private int idQuestionEvaluation;

	@Column(name="ID_QUALIFICATIF")
	private int idQualificatif;

	@Column(name="INTITULE")
	private String intitule;

	@Column(name="ORDRE")
	private int ordre;

	//bi-directional many-to-one association to Question
	@ManyToOne
	@JoinColumn(name="ID_QUESTION")
	private Question question;

	//bi-directional many-to-one association to RubriqueEvaluation
	@ManyToOne
	@JoinColumn(name="ID_RUBRIQUE_EVALUATION")
	private RubriqueEvaluation rubriqueEvaluation;

	public QuestionEvaluation() {
	}

	public int getIdQuestionEvaluation() {
		return this.idQuestionEvaluation;
	}

	public void setIdQuestionEvaluation(int idQuestionEvaluation) {
		this.idQuestionEvaluation = idQuestionEvaluation;
	}

	public int getIdQualificatif() {
		return this.idQualificatif;
	}

	public void setIdQualificatif(int idQualificatif) {
		this.idQualificatif = idQualificatif;
	}

	public String getIntitule() {
		return this.intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public int getOrdre() {
		return this.ordre;
	}

	public void setOrdre(int ordre) {
		this.ordre = ordre;
	}

	public Question getQuestion() {
		return this.question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public RubriqueEvaluation getRubriqueEvaluation() {
		return this.rubriqueEvaluation;
	}

	public void setRubriqueEvaluation(RubriqueEvaluation rubriqueEvaluation) {
		this.rubriqueEvaluation = rubriqueEvaluation;
	}

}