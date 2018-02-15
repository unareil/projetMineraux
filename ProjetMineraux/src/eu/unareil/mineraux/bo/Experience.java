package eu.unareil.mineraux.bo;
import java.util.GregorianCalendar;

public class Experience {

  private Integer id;

  private GregorianCalendar dateExp;

  private String situationDebExp;

  private String situationFinExp;
    private Specimen unSpecimen;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public GregorianCalendar getDateExp() {
		return dateExp;
	}
	public void setDateExp(GregorianCalendar dateExp) {
		this.dateExp = dateExp;
	}
	public String getSituationDebExp() {
		return situationDebExp;
	}
	public void setSituationDebExp(String situationDebExp) {
		this.situationDebExp = situationDebExp;
	}
	public String getSituationFinExp() {
		return situationFinExp;
	}
	public void setSituationFinExp(String situationFinExp) {
		this.situationFinExp = situationFinExp;
	}
	public Specimen getUnSpecimen() {
		return unSpecimen;
	}
	public void setUnSpecimen(Specimen unSpecimen) {
		this.unSpecimen = unSpecimen;
	}
	@Override
	public String toString() {
		return "Experience [id=" + id + ", dateExp=" + dateExp + ", situationDebExp=" + situationDebExp
				+ ", situationFinExp=" + situationFinExp + ", unSpecimen=" + unSpecimen + "]";
	}

}
