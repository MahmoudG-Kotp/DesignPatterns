package Structural.C.Proxy;

public class WE_Company implements InternetServiceProvider {

    @Override
    public String navigateToWebsite(String url) {
        return String.format("https://www.%s.com", url);
    }
}
