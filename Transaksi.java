package Class;

import java.util.ArrayList;

public class Transaksi {
    private String noTransaksi;
    private String namaPemesan;
    private String tanggal;
    private String noMeja;
    private ArrayList<Pesanan> pesanan;
    private double uangBayar;
    private double Pajak;
    private double totalBayar;

    public Transaksi (String noTransaksi, String namaPemesan, String tanggal, String noMeja) { }

    public void tambahPesanan (Pesanan pesanan) { }

    public Pesanan getPesanan() {return null;}

    public ArrayList<Pesanan> getSemuaPesanan() {return null;}

    public double hitungTotalBayar() {return 0;}

    public double hitungKembalian() {return 0;}

    public void cetakStruk() { }
}
