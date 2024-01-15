package com.stream;

import java.util.List;

import org.junit.Test;

public class RetrivingOperation {

    /**
     * Retriving Operation
     * Operasi pada Stream untuk melakukan pengambilan sebagian data
     * secara garis besar cara kerjanya mirip denga Filter
     *
     * ***************************************************************+
     *      Method          |         Keterangan                      *
     * ***************************************************************+
     *  limit(n)            | mengambil data dengan jumlah dari n     *
     *  skip(n)             | menghiraukan sejumlah data n            *
     *  takeWhile(T -> Bool)| Menggambil data selama kondisinya true  *
     *  dropWhile(T -> Bool)| mengambil data selama kondisinya false  *
     * ***************************************************************+
     */

    @Test
    public void testLimit() {
        List.of("Alliano", "Madara", "Itachi", "Denji").stream()
        .limit(3).forEach(System.out::println);
    }

    @Test
    public void testSkip() {
        List.of("Alliano", "Madara", "Itachi", "Denji").stream()
        .skip(3).forEach(System.out::println);
    }
    @Test
    public void testTakeWhike() {
        /**
         * takeWhile dia akan mengecek dan jikalau
         * hasilnya false maka data selanjutnya tidak akan di cek
         */
        List.of("Denji", "Madara", "Alliano", "Itachi").stream()
        .takeWhile(name -> name.length() <= 6 ).forEach(System.out::println);
    }
    @Test
    public void testDropWhike() {
        /**
         * dropWhile dia akan mengecek dan jikalau
         * hasilnya true maka data selanjutnya akan diaikan
         */
        List.of("Denji", "Madara", "Alliano", "Itachi").stream()
        .dropWhile(name -> name.length() <= 6 ).forEach(System.out::println);
    }



}
