package structural.proxy;

public class Download {
    public static void main(String[] args) {
        ProxyVideoDownloader obj = new ProxyVideoDownloader("www.youtube.com/abc");
        obj.loadVideo();
        obj.loadVideo();
    }
}
