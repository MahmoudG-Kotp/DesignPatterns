package Structural.C.Proxy;

import java.util.Arrays;
import java.util.List;

/* mainly this design used to do limitations for specific class
   by making all operations done through proxy class*/
class Main {
    public static void main(String[] args) {
        List<String> sites = Arrays.asList("Facebook", "GeeksToGeeks", "Tiktok", "Google");

        InternetServiceProvider provider = new InternetProxy();
        for (String url : sites) {
            System.out.println(provider.navigateToWebsite(url) + "\n");
        }

    }
}
