package eu.unareil.mineraux.bo;
import java.util.ArrayList;

public class SystemeCristallin {

  private Integer id;

  private Integer axeA1;

  private Integer axeA2;

  private Integer axeA3;

  private Integer angleAlpha;

  private Integer angleBeta;

  private Integer angleGamma;

  private String Image;

    /**
   *
   * @element-type Mineral
   */
  private ArrayList <Mineral> lesMineraux;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAxeA1() {
		return axeA1;
	}

	public void setAxeA1(Integer axeA1) {
		this.axeA1 = axeA1;
	}

	public Integer getAxeA2() {
		return axeA2;
	}

	public void setAxeA2(Integer axeA2) {
		this.axeA2 = axeA2;
	}

	public Integer getAxeA3() {
		return axeA3;
	}

	public void setAxeA3(Integer axeA3) {
		this.axeA3 = axeA3;
	}

	public Integer getAngleAlpha() {
		return angleAlpha;
	}

	public void setAngleAlpha(Integer angleAlpha) {
		this.angleAlpha = angleAlpha;
	}

	public Integer getAngleBeta() {
		return angleBeta;
	}

	public void setAngleBeta(Integer angleBeta) {
		this.angleBeta = angleBeta;
	}

	public Integer getAngleGamma() {
		return angleGamma;
	}

	public void setAngleGamma(Integer angleGamma) {
		this.angleGamma = angleGamma;
	}

	public String getImage() {
		return Image;
	}

	public void setImage(String image) {
		Image = image;
	}

	public ArrayList<Mineral> getLesMineraux() {
		return lesMineraux;
	}

	public void setLesMineraux(ArrayList<Mineral> lesMineraux) {
		this.lesMineraux = lesMineraux;
	}

	@Override
	public String toString() {
		return "SystemeCristallin [id=" + id + ", axeA1=" + axeA1 + ", axeA2=" + axeA2 + ", axeA3=" + axeA3
				+ ", angleAlpha=" + angleAlpha + ", angleBeta=" + angleBeta + ", angleGamma=" + angleGamma + ", Image="
				+ Image + ", lesMineraux=" + lesMineraux + "]";
	}
  

}
