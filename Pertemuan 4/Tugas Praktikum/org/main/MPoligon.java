package org.main;

import org.bangundatar.*;

public class MPoligon{
    public static void main(String[] args){
        PersegiPanjang persegi = new PersegiPanjang(10, 10, 4);
        Segitiga segitiga = new Segitiga(10, 10, 3);
        persegi.printInfo();
        System.out.println("Luas Persegi Panjang : "+persegi.hitungLuas());
        segitiga.printInfo();
        System.out.println("Luas Segitiga : "+segitiga.hitungLuas());
    }
}