package company.devices;

public class Phone extends Device {
    Integer Nrtel;
    int cena;
    static String version = "latest";
    static final String urlProtocol = "HTTP";
    static final String defaultVersion = "Ostatnia";
    private String name;
    private String server;
    private static String appList;
    private String url;

    public Phone (Integer Nrtel, int cena, String producer, String model)
    {
        super(model, producer, null);
        this.cena = cena;
        this.Nrtel = Nrtel;
    }
    public String toString() {
        return "Nr tel: " + this.Nrtel + " Producer: " + this.producer;
    }
    public void turnOn(){
        System.out.println("Phone włączony");
    }
    public void installAnnApp1(String name){
        this.name = name;
        System.out.println("App name: " + name);
    }
    public void installAnnApp2(String name, String version){
        this.name = name;
        this.version = version;
        System.out.println("App name: " + name + "App version: " + version);
    }
    public void installAnnApp3(String name, String version, String server){
        this.name = name;
        this.version = version;
        this.server = server;
        System.out.println("App name: " + name + "App version: " + version + "App server: " + server);
    }
    public void installAnnApp4(String appList){
        this.appList = appList;
        System.out.println("App name to download: " + appList);
    }
    public void installAnnApp5(String url){
        this.url = url;
        System.out.println("App URL: " + url);
    }
}
