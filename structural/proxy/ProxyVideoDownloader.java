package structural.proxy;

public class ProxyVideoDownloader implements VideoDownloader{
    private RealVideoDownloader realObj;
    private String url;

    public ProxyVideoDownloader(String url) {
        this.url = url;
    }

    @Override
    public void loadVideo() {
        if(realObj == null){
            this.realObj = new RealVideoDownloader(url);
            realObj.loadVideo();
        }else{
            System.out.println("Loaded From Cache");
        }

    }
}
