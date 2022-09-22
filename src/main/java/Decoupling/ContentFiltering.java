package Decoupling;

public class ContentFiltering implements Filter {
    public String[] getRecommendations(String movie)
    {
        return new String[]{"Italaian Job","Missiion Impossible","M13"};
    }



}
