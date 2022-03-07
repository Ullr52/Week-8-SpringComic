package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


import dmacc.beans.Comic;
import dmacc.beans.ComicInformation;

import dmacc.controller.BeanConfiguration;
import dmacc.repository.ComicRepository;

@SpringBootApplication
public class SpringComicsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringComicsApplication.class, args);
		
	}
		
		@Autowired
		ComicRepository repo;
		
		@Override
		public void run(String... args) throws Exception {
			// TODO Auto-generated method stub
			ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
			Comic c = appContext.getBean("comic", Comic.class);
			c.setList("have");
			repo.save(c);
			
			Comic cm = new Comic("Amazing Spider-Man", 100, "have");
			ComicInformation ci = new ComicInformation(1964, "New York", "NY");
			cm.setComicInformation(ci);
			repo.save(cm);
			
			List<Comic> MyComicList = repo.findAll();
					for(Comic myComics : MyComicList) {
						System.out.println(myComics.toString());
						
					}
					((AbstractApplicationContext) appContext).close();
	}

}
