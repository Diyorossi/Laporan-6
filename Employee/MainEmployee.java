package employee;
import java.util.Scanner;
public class MainEmployee {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Scanner in=new Scanner (System.in);
        String j;
        do{
        System.out.println("-------------------------------------------");
        System.out.println("-----------Program Gaji Karyawan-----------");
        System.out.println("-------------------------------------------");
        System.out.println("1. Manager");
        System.out.println("2. Pegawai Tetap");
        System.out.println("3. Pegawai Tidak Tetap");
        System.out.println("4. Keluar");
        System.out.println("Masukkan pilihan jabatan : ");
        j=input.nextLine();
        switch(j){
            case ("1") :{System.out.print("Masukkan nama : ");
        String n=input.nextLine();
        System.out.print("Masukkan id-kerja : ");
        String i=input.nextLine();
        System.out.print("Sudah Punya istri? (y/n) : ");
        String s=input.nextLine();
        System.out.print("Jumlah anak? : ");
        int a=input.nextInt();
        System.out.print("Tahun masuk kerja : ");
        int t=in.nextInt();
        System.out.println();
        Manager M1=new Manager(n,i,"Manager",t,s,a);
        System.out.println("Nama            : "+M1.getNama());
        System.out.println("Id Kerja        : "+M1.getId());
        System.out.println("Tahun Masuk     : "+M1.getTahunmasuk());
        System.out.println("Jabatan         : "+M1.getJabatan());
        System.out.println("Bonus           : "+"Rp "+M1.getBonus());
        System.out.println("Tunjangan Kerja : "+"Rp "+M1.Tunjangankerja());
        System.out.println("Gaji            : "+"Rp "+M1.getGaji());
        System.out.println("Tunjangan istri : "+"Rp "+M1.tunjanganistri());
        System.out.println("Tunjangan anak  : "+"Rp "+M1.tunjangananak());
        System.out.println("Total Gaji      : "+"Rp "+M1.totalhasil());
        System.out.println("Tunjangan jabatan         : "+"Rp "+M1.tunjanganjabatan());
        System.out.println("Total seluruh gaji adalah : "+"Rp "+M1.totalhasil2());
        System.out.println(); break;}
            case ("2"):{
        System.out.print("Masukkan nama : ");
        String n=input.nextLine();
        System.out.print("Masukkan id-kerja : ");
        String i=input.nextLine();
        System.out.print("Sudah Punya istri? (y/n) : ");
        String s=input.nextLine();
        System.out.print("Jumlah anak : ");
        int a=input.nextInt();
        System.out.print("Tahun masuk kerja : ");
        int t=in.nextInt();
        System.out.println();
        PegawaiTetap P2=new PegawaiTetap(n,i,"Pegawai Tetap",t,s,a);
        System.out.println("Nama            : "+P2.getNama());
        System.out.println("Id Kerja        : "+P2.getId());
        System.out.println("Tahun Masuk     : "+P2.getTahunmasuk());
        System.out.println("Jabatan         : "+P2.getJabatan());
        System.out.println("Bonus           : "+"Rp "+P2.getBonus());
        System.out.println("Tunjangan Kerja : "+"Rp "+P2.Tunjangankerja());
        System.out.println("Gaji            : "+"Rp "+P2.getGaji());
        System.out.println("Tunjangan istri : "+"Rp "+P2.tunjanganistri());
        System.out.println("Tunjangan anak  : "+"Rp "+P2.tunjangananak());
        System.out.println("Total Gaji      : "+"Rp "+P2.totalhasil());
        System.out.println(); break;}
            case("3") : {
            System.out.print("Masukkan nama : ");
        String n=input.nextLine();
        System.out.print("Masukkan id-kerja : ");
        String i=input.nextLine();
        System.out.print("Sudah Punya istri? (y/n) : ");
        String s=input.nextLine();
        System.out.print("Jumlah anak : ");
        int a=input.nextInt();
        System.out.print("Tahun masuk kerja : ");
        int t=in.nextInt();
        System.out.print("Masukkan jam kerja : ");
        int r=input.nextInt();
        System.out.println();
        PegawaiTidakTetap P3=new PegawaiTidakTetap(n,i,"Pegawai Tidak Tetap",t,s,a,r);
        System.out.println("Nama              : "+P3.getNama());
        System.out.println("Id Kerja          : "+P3.getId());
        System.out.println("Tahun Masuk       : "+P3.getTahunmasuk());
        System.out.println("Jabatan           : "+P3.getJabatan());
        System.out.println("Bonus             : "+"Rp "+P3.getBonus());
        System.out.println("Tunjangan kerja   : "+"Rp "+P3.Tunjangankerja());
        System.out.println("Gaji              : "+"Rp "+P3.getGaji());
        System.out.println("Bonus Lembur      : "+"Rp "+P3.gajilembur());
        System.out.println("Total gaji adalah : "+"Rp "+P3.totalhasil());
        System.out.println(); break;
            }
            case("4") : {
                System.out.println("-------------------------------------------");
                System.out.println("-----------.....Terimakasih.....-----------"); 
                System.out.println("-------------------------------------------");
            System.exit(0);break;}     
        }
    }
        while(j!=("4")); 
  }
}
