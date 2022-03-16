package dmacc.beans;

import javax.persistence.Embeddable;

import lombok.Data;

/**
 * @author jword - jord
 * CIS175 - Spring - 2022
 * Mar 7, 2022
 */
@Data
@Embeddable
public class ComicInformation {
	private int yearPub;
	private String cityPub;
	private String statePub;
	
	
	/**
	 * 
	 *//*
	public ComicInformation() {
		super();
		// TODO Auto-generated constructor stub
	}


	*//**
	 * @param yearPub
	 * @param cityPub
	 * @param statePub
	 *//*
	public ComicInformation(int yearPub, String cityPub, String statePub) {
		super();
		this.yearPub = yearPub;
		this.cityPub = cityPub;
		this.statePub = statePub;
	}


	*//**
	 * @return the yearPub
	 *//*
	public int getYearPub() {
		return yearPub;
	}


	*//**
	 * @param yearPub the yearPub to set
	 *//*
	public void setYearPub(int yearPub) {
		this.yearPub = yearPub;
	}


	*//**
	 * @return the cityPub
	 *//*
	public String getCityPub() {
		return cityPub;
	}


	*//**
	 * @param cityPub the cityPub to set
	 *//*
	public void setCityPub(String cityPub) {
		this.cityPub = cityPub;
	}


	*//**
	 * @return the statePub
	 *//*
	public String getStatePub() {
		return statePub;
	}


	*//**
	 * @param statePub the statePub to set
	 *//*
	public void setStatePub(String statePub) {
		this.statePub = statePub;
	}


	@Override
	public String toString() {
		return "ComicInformation [yearPub=" + yearPub + ", cityPub=" + cityPub + ", statePub=" + statePub + "]";
	}
	
	

}
*/
}