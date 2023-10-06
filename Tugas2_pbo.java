/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas2_pbo;
import java.util.Scanner;
class Mahasiswa{
    String nama;
    int nim;
    float nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;
    
    // method untuk input data
    void cekKelulusan(){
    Scanner abc= new Scanner(System.in);
    System.out.println("Input Data Mahasiswa : ");
    System.out.print("Nama : ");
    nama = abc.nextLine();
    System.out.print("NIM : ");
    nim = abc.nextInt();
    System.out.print("Nilai Tugas : ");
    nilaiTugas = abc.nextFloat();
    System.out.print("Nilai UTS : ");
    nilaiUTS = abc.nextFloat();
    System.out.print("Nilai UAS : ");
    nilaiUAS = abc.nextFloat();
    }
    //cek status
    void cekStatus(){
    System.out.println("\nNama : " + nama);
    System.out.println("NIM : " + nim);
    System.out.println("Nilai Tugas : " + nilaiTugas);
    System.out.println("Nilai UTS : " + nilaiUTS);
    System.out.println("Nilai UAS : " + nilaiUAS);
    }
    // method input hasil nilai akhir
    void nilaiAkhirr(){
    nilaiAkhir = (nilaiTugas*35/100)+(nilaiUTS*25/100)+(nilaiUAS*40/100);
    //System.out.println("Nilai Akhir : " + nilaiAkhir);
    if (nilaiAkhir >= 60){
        System.out.println("Selamat! Anda lulus dengan nilai " + nilaiAkhir);
    } else {
        System.out.println("Mohon maaf! Anda Tidak Lulus. Nilai Anda " + nilaiAkhir);
    }
    }
}
public class Tugas2_pbo {
    public static void main(String[] args) {
        Mahasiswa mahasiswa=new Mahasiswa();
        mahasiswa.cekKelulusan();
        mahasiswa.cekStatus();
        mahasiswa.nilaiAkhirr();
        Mahasiswa mahasiswa1=new Mahasiswa();
        mahasiswa1.cekKelulusan();
        mahasiswa1.cekStatus();
        mahasiswa1.nilaiAkhirr();
    }
    
}
