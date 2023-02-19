package inter;

public class ABankasi implements IBanka{
    private String bankaAdi;
    private  String terminalId;
    private  String sifre;

    public ABankasi(String bankaAdi, String terminalId, String sifre) {
        this.bankaAdi = bankaAdi;
        this.terminalId = terminalId;
        this.sifre = sifre;
    }
    @Override
    public boolean connect(String ipAdress){
        System.out.println("Kullanıcı ip : " + ipAdress);
        System.out.println("Marka ip : " + hostIpAdress);
        System.out.println(this.bankaAdi + "Bağlandı! ");
        return true;
    }
    @Override
    public boolean payment(double price , String cardNumber, String expiryDate, String cvc){
        System.out.println("Bankadan cevap bekleniyor...");
        System.out.println("İşlem başarılı oldu ! ");
        return true;
    }

    public String getBankaAdi() {
        return bankaAdi;
    }

    public void setBankaAdi(String bankaAdi) {
        this.bankaAdi = bankaAdi;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }
}
