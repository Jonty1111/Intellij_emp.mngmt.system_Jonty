package TightCoupling;

import TightCoupling.ContentFiltering;

public class RecommenderImplementation {
    public String[] recommendMovie(String Movie)
    {
        ContentFiltering filter=new ContentFiltering();
        String[] filteredResult =filter.getRecommendations("ET");
        return filteredResult;
        //return new String[]{"Resident Evil 1","Resident Evil 2","Resident Evil 3"};
    }
}
