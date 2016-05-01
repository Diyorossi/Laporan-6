package employee;

/**
 *
 * @author DDR
 */
public class Employee {
    private String nama;
    private String id;
    private String jabatan;
    private String istri;
    private int tahunmasuk,anak;
    public final int gajipokok=3000000;
    private double tunjanganistri;
    private double tunjangananak;
    private double tunjangan;
    private double bonus;
    public Employee(String n, String i, String j,int t,String s, int a){
        nama=n;
        id=i;
        jabatan=j;
        tahunmasuk=t;
        istri=s;
        anak=a;
    }
  public void setBiodata(String n, String i, String j,String s,int a, int t){
        nama=n;
        id=i;
        jabatan=j;
        istri=s;
        anak=a;
        tahunmasuk=t;
    }
    public String getNama(){
        return nama;
    }
    public String getId(){
        return id;
    }
    public String getJabatan(){
        return jabatan;
    }
    public int getTahunmasuk(){
        return tahunmasuk;
    }
    public String getIstri(){
        return istri;
    }
    public int getAnak(){
        return anak;
    }
    public int Masakerja(){
        int masakerja=2016-tahunmasuk;
        return masakerja;
    }
    public double getBonus(){
        if (Masakerja()>=6&&Masakerja()<=10){
            bonus=0.05*gajipokok;
        }
        else if(Masakerja()>10){
            bonus=0.1*gajipokok;
        }
        else {
            bonus=0;
        }
        return bonus;
    }
    public double Tunjangankerja(){
        if (Masakerja()>=6&&Masakerja()<=10){
            tunjangan=0;
        }
        else if(Masakerja()>10){
            tunjangan=0.1*gajipokok;
        }
        else {
            tunjangan=0;
        }
        return tunjangan;
    }
    public double getGaji(){
        double total=gajipokok+getBonus()+Tunjangankerja();
        return total;
    }
    public double tunjanganistri(){
        if(istri.equalsIgnoreCase("ya")||istri.equalsIgnoreCase("y")){
            tunjanganistri=0.1*getGaji();
        }
        else{
            tunjanganistri=0;
        }
        return tunjanganistri;
    }
    public double tunjangananak(){
        if(anak<=3){
            tunjangananak=anak*0.15*getGaji();
        }
        else if (anak>3) {
            tunjangananak=3*0.15*getGaji();
        }
        else {
            tunjangananak=0;
        }
        return tunjangananak;
    }
    public double totalhasil(){
        double  totalgaji=getGaji()+tunjanganistri()+tunjangananak();
        return totalgaji;
    }
    }
   
