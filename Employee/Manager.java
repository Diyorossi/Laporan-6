package employee;
public class Manager extends Employee{
    private double tunjanganjabatan;
    public Manager(String n, String i, String j,int t,String s, int a){
        super(n,i,j,t,s,a);
    }
    public double tunjanganjabatan(){
        double tunjanganjabatan=0.1*getGaji();
        return tunjanganjabatan;
    }
    
    public double totalhasil(){
        double  totalgaji=getGaji()+tunjanganistri()+tunjangananak();
        return totalgaji;
    }
    public double totalhasil2(){
        double  totalgaji=getGaji()+tunjanganistri()+tunjangananak()+tunjanganjabatan();
        return totalgaji;
        }
    }

