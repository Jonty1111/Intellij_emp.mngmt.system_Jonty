package com.spring.fundamentals.emp.mngmt.system.SpringBasedDependencyInjection;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
//@Primary
@Qualifier("CF")
public class ContentFiltering implements Filter {
    public String[] getRecommendations(String movie)
    {
        return new String[]{"ContentMovie","Italaian Job","Missiion Impossible","M13"};
    }



}
