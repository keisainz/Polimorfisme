package Polimorfisme;

public class Main {
    public static void main(String[] argv) {
        Pegawai p = new Pegawai();
        p = new Programmer();
        p = new Manajer();

        Manajer m = new Manajer();
    }
}