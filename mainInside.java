package no3_latihan;

/*
Nama      : Irma Nurkhofifah M.
Kelas     : B2
hari/tgl  : Jumat, 1 Mei 2020
 */
public class mainInside {
    public static void main(String[] args){
        Test obj1 = new Test();
        Test obj2 = new Test();
        Test obj3 = new Test();
        obj1.addCounter();
        
        System.out.println("counter milik obj1 = "+obj1.getCounter());
        System.out.println("counter milik obj2 = "+obj2.getCounter());
        System.out.println("counter milik obj3 = "+obj3.getCounter());
    }
}
