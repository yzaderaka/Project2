package Task4;

import java.util.ArrayList;


public class Test {
    public static void main(String[] args) {
        RemoteWebDriver[] browsers = {new FirefoxDriver(), new SafariDriver(), new ChromeDiver()};

        for (RemoteWebDriver drivers : browsers) {
            drivers.open();
            drivers.navigate();
            drivers.close();
            drivers.getTitle();
        }
    }
}
