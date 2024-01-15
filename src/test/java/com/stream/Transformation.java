package com.stream;

import java.util.List;
import java.util.stream.Stream;

import org.junit.Test;

public class Transformation {

    /**
     * Transformation Operation
     * adalah operasi yang digunakan untuk mengubah bentuk stream
     * ada banyak function yang bisa digunakan untk mengubah bentuk stream
     * menjadi sebuah stream baru, contohnya map dan flatMap
     */

     @Test
     public void testMap() {
        List.of("Kucig", "kambing", "Kuda", "ayam jantan", "kelinci", "Kecoa").stream()
        /**
         * map digunakan untuk merbah data stream menjadi
         * data yang kita tentukan misal dalam case ini
         * saya merubah data nya menjadi hurf besar dan saya
         * menghituh dari panjang karakter dari masing masing data stream nya
         */
        .map(binatang -> binatang.toUpperCase())
        .map(longChar -> longChar.length())
        .forEach(longchar -> System.out.println(longchar));
     }

     @Test
     public void faltMapTest() {
        List.of("Kambing", "Kuda Jantan", "Telor", "Kelinci").stream()
        .map(binatang -> binatang.toUpperCase())
        .flatMap(upper -> Stream.of(upper, upper.length()))
        .forEach(longchar -> System.out.println(longchar));

     }

     @Test
     public void filteringTest() {

        /**
         * Filtering Operation
         * operasi Stream yang digunakan untuk melakukan filter data stream
         * ex misal kita punya stream dari data 1 samapai 10 lalu kita ingin
         * menggunkan data ganjil atau genap saja
         */

        List<Integer> data = List.of(1,2,3,4,5,6,7,8,9,10);
        Stream<Integer> dataGenap = data.stream()
        .filter( angka -> (angka % 2 == 0));
        dataGenap.forEach(System.out::println);
        Stream<Integer> dataGanjil = data.stream().filter(angka -> (angka % 2 != 0));
        dataGanjil.forEach(System.out::println);

     }
     @Test
     public void testDistinc() {
        //method distinc digunakan untk meremove data yang duplikat

        Stream<String> data = List.of("Alliano", "Alliano", "Saringgan", "Saringgan").stream().distinct();
        data.forEach(System.out::println);
     }
}
