package employee;
public class PegawaiTidakTetap extends Employee {
    private int lembur;
    private double gajilembur;
    
public PegawaiTidakTetap(String n, String i, String j,int t,String s, int a, int r){
    super(n,i,j,t,s,a);
    this.lembur=r;
}   
public double gajilembur(){
    if(lembur>10){
        gajilembur=10000*(lembur-10);
    }
    else {
        gajilembur=0;
    }
    return gajilembur;
}
    public double totalhasil(){
        double  totalgaji=getGaji()+gajilembur();
        return totalgaji;
    }
        }
    
