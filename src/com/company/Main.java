package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader input =  new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input Jumlah data: ");

        int data = Integer.parseInt(input.readLine());
        int[] umur = new int[data];
        String[] nama = new String[data];
            int datake = 1;
            for (int a=0; a< data; a++){
                System.out.println("Silahkan Input data ke : " + datake++);
                System.out.print("Nama : ");
                nama[a] = input.readLine();
                System.out.print("Umur : ");
                umur[a] = Integer.parseInt(input.readLine());
            }

        System.out.print("Nama ");
        System.out.print(" ||   ");
        System.out.println("Umur ");

        for (int b=0; b<data ; b++){
            System.out.print(nama[b]);
            System.out.print("   ||  ");
            System.out.println(umur[b]);
        }
    }
}
