public class mobil{
public static void main(String[] args) {
// Membuat objek mobil
Mobil mobilUdin = new Mobil("putih", "sport", "matic", 4, "LED");
// Mengubah warna mobil
mobilUdin.setWarnaCat("merah");
// Mencetak warna mobil
System.out.println("Warna mobil: " + mobilUdin.getWarnaCat());
// Mengubah tipe bohlam dan jumlah ban
mobilUdin.setTipeBohlaDanBan("Halogen", 10);
// Mencetak tipe bohlam dan jumlah ban
System.out.println("Tipe bohlam dan jumlah ban: " +
mobilUdin.getTipeBohlaDanBan());
}
}
class Mobil {
protected String warnaCat;
protected String jenisMobil;
protected String tipeTransmisi;
protected int banyakBan;
protected String tipeBohla;
public Mobil(String warnaCat, String jenisMobil, String tipeTransmisi,
int banyakBan, String tipeBohla) {


this.warnaCat = warnaCat;
this.jenisMobil = jenisMobil;
this.tipeTransmisi = tipeTransmisi;
this.banyakBan = banyakBan;
this.tipeBohla = tipeBohla;
}
public String getWarnaCat() {
return warnaCat;
}
public void setWarnaCat(String warnaCat) {
this.warnaCat = warnaCat;
}
public String getTipeBohlaDanBan() {
return tipeBohla + " " + banyakBan;
}
public void setTipeBohlaDanBan(String tipeBohla, int banyakBan) {
this.tipeBohla = tipeBohla;
this.banyakBan = banyakBan;
}
}