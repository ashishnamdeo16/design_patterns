package structural.proxy;

public class RealVideoDownloader implements VideoDownloader{
    private String url;

    public RealVideoDownloader(String url){
        this.url = url;
    }

    @Override
    public void loadVideo() {
        System.out.println("Fetching Data...");
        System.out.println("Fetching Data...");
        System.out.println("Starting Download...");
        System.out.println("Starting Download...");
    }
}
