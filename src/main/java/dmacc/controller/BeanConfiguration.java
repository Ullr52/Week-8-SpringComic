package dmacc.controller;

import org.springframework.context.annotation.Bean;

import dmacc.beans.Comic;
import dmacc.beans.ComicInformation;

/**
 * @author jword - jord
 * CIS175 - Spring - 2022
 * Mar 7, 2022
 */
public class BeanConfiguration {
	
	@Bean
	public Comic comic() {
	Comic bean = new Comic("X-Men");
	bean.setIssuNum(11);
	return bean;
	}
	
	@Bean
	public ComicInformation comicInformation() {
		
		ComicInformation bean = new ComicInformation(1976, "New York", "NY");
		return bean;
			
		
		
	}

}
