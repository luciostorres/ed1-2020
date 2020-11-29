package app;


public class FaixaIp {
    private String rede;
    private String intervalo;
    private String broadcast;

    public FaixaIp(String rede, String intervalo, String broadcast) {
        this.rede = rede;
        this.intervalo = intervalo;
        this.broadcast = broadcast;
    }

    public String getRede() {
        return rede;
    }

    public String getIntervalo() {
        return intervalo;
    }

    public String getBroadcast() {
        return broadcast;
    }
    
    public String[] toStringArray(){
        return new String[]{rede,intervalo,broadcast};
    }
    
}
