package employee;
public class PegawaiTetap extends Employee {
    public PegawaiTetap(String n, String i, String j,int t,String s, int a){
        super(n,i,j,t,s,a);
    }
    
    public double totalhasil(){
        double  totalgaji=getGaji()+tunjanganistri()+tunjangananak();
        return totalgaji;
        }
    }

