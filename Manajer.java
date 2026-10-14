package Polimorfisme;
public class Manajer extends Pegawai{
    public int tunjangan;
    
    @Override
    public void tampilData(){
        super.tampilData();
        System.out.println("TUNJANGAN = "+tunjangan);
    }
}
