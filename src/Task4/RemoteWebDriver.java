package Task4;

public interface RemoteWebDriver extends WedDriver {
    void navigate();
}

class ChromeDiver implements RemoteWebDriver{

    @Override
    public void navigate() {
        System.out.println("Navigate to google home page");
    }

    @Override
    public void open() {
        System.out.println("Open Chrome browser");
    }

    @Override
    public void close() {
        System.out.println("Close Chrome browser");
    }

    @Override
    public String getTitle() {
        return null;
    }
}
class SafariDriver implements RemoteWebDriver{

    @Override
    public void navigate() {
        System.out.println("Navigate to apple home page");
    }

    @Override
    public void open() {
        System.out.println("Open Safari browser");
    }

    @Override
    public void close() {
        System.out.println("Close Safari browser");
    }

    @Override
    public String getTitle() {
        return null;
    }
}
class FirefoxDriver implements RemoteWebDriver{

    @Override
    public void navigate() {
        System.out.println("Navigate to search home page");
    }

    @Override
    public void open() {
        System.out.println("Open Firefox browser");
    }

    @Override
    public void close() {
        System.out.println("Close Firefox browser");
    }

    @Override
    public String getTitle() {
        return null;
    }
}
