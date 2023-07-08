package Structural.C.Proxy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class InternetProxy implements InternetServiceProvider {
    private final List<String> blockedSites = Arrays.asList("Facebook", "Twitter", "Tiktok");

    @Override
    public String navigateToWebsite(String url) {
        System.out.printf("%s Requested \n", url);
        if(blockedSites.contains(url))
            return "This site is Blocked!";
        return new WE_Company().navigateToWebsite(url);
    }
}
