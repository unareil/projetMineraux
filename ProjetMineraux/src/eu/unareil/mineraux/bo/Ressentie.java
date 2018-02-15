package eu.unareil.mineraux.bo;
import java.util.GregorianCalendar;

public class Ressentie {

  private Integer id;

  private GregorianCalendar dateRessentie;

  private String libelle;

    private Specimen unSpecimen;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public GregorianCalendar getDateRessentie() {
		return dateRessentie;
	}

	public void setDateRessentie(GregorianCalendar dateRessentie) {
		this.dateRessentie = dateRessentie;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Specimen getUnSpecimen() {
		return unSpecimen;
	}

	public void setUnSpecimen(Specimen unSpecimen) {
		this.unSpecimen = unSpecimen;
	}

	@Override
	public String toString() {
		return "Ressentie [id=" + id + ", dateRessentie=" + dateRessentie + ", libelle=" + libelle + ", unSpecimen="
				+ unSpecimen + "]";
	}

}