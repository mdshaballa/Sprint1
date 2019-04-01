	package fr.univbrest.dosi.bean;

	import java.io.Serializable;
	import javax.persistence.*;


	
	@Entity
	@Table(name="rubrique")
	@NamedQueries({
	@NamedQuery(name="Rubrique.findAll", query="SELECT r FROM Rubrique r"),
	@NamedQuery(name="Rubrique.findById", query="SELECT r FROM Rubrique r where r.idRubrique =?1")
	})
	public class Rubrique implements Serializable {
		private static final long serialVersionUID = 1L;

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="ID_RUBRIQUE")
		private int idRubrique;

		private String designation;

		private double ordre;

		private String type;

		//uni-directional many-to-one association to Enseignant
		@ManyToOne
		@JoinColumn(name="NO_ENSEIGNANT")
		private Enseignant enseignant;

		public Rubrique() {
		}

		public Integer getIdRubrique() {
			return this.idRubrique;
		}

		public void setIdRubrique(Integer idRubrique) {
			this.idRubrique = idRubrique;
		}

		public String getDesignation() {
			return this.designation;
		}

		public void setDesignation(String designation) {
			this.designation = designation;
		}

		public double getOrdre() {
			return this.ordre;
		}

		public void setOrdre(double ordre) {
			this.ordre = ordre;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Enseignant getEnseignant() {
			return this.enseignant;
		}

		public void setEnseignant(Enseignant enseignant) {
			this.enseignant = enseignant;
		}

}