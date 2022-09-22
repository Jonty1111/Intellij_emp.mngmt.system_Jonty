package Decoupling;

public class RecommendedImplementation {

    public Filter filter;

    public RecommendedImplementation(Filter filter)
    {
        super();
        this.filter=filter;
    }
    public String[] recommendMovie(String movie)
    {
        System.out.println("Checking the filter names in usage:" + filter + "\n"  );
        String[] resultMovies=filter.getRecommendations("ET");

        return resultMovies;
    }
}
