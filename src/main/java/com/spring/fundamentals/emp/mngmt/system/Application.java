package com.spring.fundamentals.emp.mngmt.system;
//Tight Couple
import TightCoupling.RecommenderImplementation;
//Decouple
import Decoupling.RecommendedImplementation;
import Decoupling.MultiFiltering;
import com.spring.fundamentals.emp.mngmt.system.SpringBasedDependencyInjection.RecommendedMovieImplementation;
//import TightCoupling.RecommenderImplementation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;
// checking this thing whether my commit has done properly or not1
@SpringBootApplication
public class Application {


	public static void main(String[] args) {

		//for tight Coupling
		//Two classes are dependent on each other
		//One class has to be changed to some other responsibility you can't really do it
		RecommenderImplementation recommendations=new RecommenderImplementation();
		String[] resultMovies= recommendations.recommendMovie("ET");
		System.out.println(Arrays.toString(resultMovies));
		//Below line is used to run the springApplication
		//SpringApplication.run(Application.class, args);






		//Decoupling(Loose Coupling)
		//Independent responsibility
		RecommendedImplementation recommendObj =new RecommendedImplementation(new MultiFiltering());
		String[] finalResultMovies=recommendObj.recommendMovie("ET");
		System.out.println(Arrays.toString(finalResultMovies));
		//Below line is used to run the springApplication
		//SpringApplication.run(Application.class, args);






		//Spring Based AutoManaging Dependencies (like here no need for the manual thing like in previous we explicitly tell whether to use content filtering yaa multi filtering)
		ApplicationContext appContextObj=SpringApplication.run(Application.class,args);
		//using the same appContext
		RecommendedMovieImplementation recommendObj3=appContextObj.getBean(RecommendedMovieImplementation.class);
		String[] finalResultMovies3=recommendObj3.recommendMovie("ET");
		System.out.println(Arrays.toString(finalResultMovies3));








	}

}
