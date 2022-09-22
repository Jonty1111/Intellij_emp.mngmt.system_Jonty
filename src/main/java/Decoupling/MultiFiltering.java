package Decoupling;

public class MultiFiltering implements Filter{
    public String[] getRecommendations(String movie)
    {
        return new String[]{"Ice age","Toy story","Evil Dead"};
    }
}
