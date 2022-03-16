package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;

/**
 * @author jword - jord CIS175 - Spring - 2022 Mar 7, 2022
 */
@Data
@Entity
public class Comic {
	@Id
	@GeneratedValue
	private long id;
	private String list;
	private String comicTitle;
	private int issuNum;
	@Autowired
	private ComicInformation comicInformation;

	/**
	 * 
	 */
	public Comic() {
		super();
		this.list = "";

		// TODO Auto-generated constructor stub
	}
	/**
	 * @param list
	 */
	/*
	 * public Comic(String comicTitle) { super(); this.comicTitle = comicTitle; }
	 *//**
		 * @param list
		 * @param comicTitle
		 * @param issuNum
		 */
	/*
	 * public Comic(String list, String comicTitle, int issuNum) { super();
	 * this.list = list; this.comicTitle = comicTitle; this.issuNum = issuNum; }
	 *//**
		 * @param id
		 * @param list
		 * @param comicTitle
		 * @param issuNum
		 */
	/*
	 * public Comic(long id, String list, String comicTitle, int issuNum) { super();
	 * this.id = id; this.list = list; this.comicTitle = comicTitle; this.issuNum =
	 * issuNum; }
	 *//**
		 * @param string
		 * @param i
		 * @param string2
		 */
	/*
	 * public Comic(String comicTitle, int issuNum, String list) { // TODO
	 * Auto-generated constructor stub this.comicTitle = comicTitle; this.issuNum =
	 * issuNum; this.list = list; }
	 *//**
		 * @return the id
		 */
	/*
	 * public long getId() { return id; }
	 *//**
		 * @param id the id to set
		 */
	/*
	 * public void setId(long id) { this.id = id; }
	 *//**
		 * @return the list
		 */
	/*
	 * public String getlist() { return list; }
	 *//**
		 * @param list the list to set
		 */
	/*
	 * public void setList(String list) { this.list = list; }
	 *//**
		 * @return the comicTitle
		 */
	/*
	 * public String getComicTitle() { return comicTitle; }
	 *//**
		 * @param comicTitle the comicTitle to set
		 */
	/*
	 * public void setComicTitle(String comicTitle) { this.comicTitle = comicTitle;
	 * }
	 *//**
		 * @return the issuNum
		 */
	/*
	 * public int getIssuNum() { return issuNum; }
	 *//**
		 * @param issuNum the issuNum to set
		 *//*
			 * public void setIssuNum(int issuNum) { this.issuNum = issuNum; }
			 * 
			 */

	/**
	 * @return the comicInformation
	 */
	public ComicInformation getComicInformation() {
		return comicInformation;
	}

	/**
	 * @param comicInformation the comicInformation to set
	 */
	public void setComicInformation(ComicInformation comicInformation) {
		this.comicInformation = comicInformation;
	}

	/*
	 * @Override public String toString() { return "Comic [id=" + id + ", list=" +
	 * list + ", comicTitle=" + comicTitle + ", issuNum=" + issuNum +
	 * ", comicInformation" + comicInformation + "]"; }
	 */
}
