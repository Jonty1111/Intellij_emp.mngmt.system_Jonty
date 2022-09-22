package com.spring.fundamentals.emp.mngmt.system.SpringBasedDependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class RecommendedMovieImplementation {


    //@Autowired
    //@Qualifier("CF")
    public Filter filter;



    //Not recommended way
    //public Filter contentFiltering;




    /*
    //Jab hum only qualifier use krte hai then comment use krte hai
    public RecommendedMovieImplementation(Filter filter)
    {
         super();
         this.filter=filter;
    }
    */

    /*
    // This is the constructor injection in which we have use the Autowired annotation here otherwisw if we don't use it here it throws error if primary is comment on both filters
    //@Autowired
    public RecommendedMovieImplementation(@Qualifier("CF") Filter filter)
    {

        this.filter=filter;
    }
    */

   //This is the setter injection
    @Autowired
    @Qualifier("RE")
    public void setFilter(Filter filter)
    {
        this.filter=filter;
    }

    public String[] recommendMovie(String movie)
    {
        System.out.println("Checking the filter names in usage:" + filter + "\n"  );
        String[] resultMovies=filter.getRecommendations("ET");
        return resultMovies;
    }
}
