package com.spring.fundamentals.emp.mngmt.system.SpringBasedDependencyInjection;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Qualifier("RE")
public class MultiFiltering implements Filter {
    public String[] getRecommendations(String movie)
    {

        return new String[]{"Moviefilter","Ice age","Toy story","Evil Dead"};
    }
}
