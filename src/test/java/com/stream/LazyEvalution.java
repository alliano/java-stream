package com.stream;

import java.util.List;

import org.junit.Test;

public class LazyEvalution {

    /**
     * lazy evaluation
     * Stream secara default akan lazy
     * tidak akan mengalirkand data sebelum menggunakan termianl operation
     * data hanya akan dilahirkan seperlunya saja, tergantung terminal operation nya
     */

     /**
      * Intermediate && terminal operartion
      * ada 2 jenis Stream operation intermediate dan terminal
      * intermediate -> lazy operation yang mna stream tidak akan
      * dieksekusi sampai memmang dibutuhkan
      * terminal -> operasi yang mentriger sebuah stream supaya mengalir dan berjalan
      * karna Intermediate adalah lazy maka secara garis besar semua operasi intermediate
      * akan mengembalikan stream baru
      */

    @Test
    public void testIntermediateOperation() {
        List.of("Alliano", "Arya Wahyu", "Faiz", "Gani","KONTOL").stream()
        // map disini adalah operasi intermediate
        .map(nama -> {
            System.out.println("change "+nama+" to uppercase");
            return nama.toUpperCase();
        })

        .map(name -> {
            System.out.println("add uciha in fron of name");
            return "uciha ".toUpperCase() + name;
        });
    }

    @Test
    public void testTerminalOperation() {
        /*
         * untuk menteriger atau mejalankan program ini kita membutuhkan yang namanya
         * Method termianl contohnya seperti foreach
        */

        List.of("Alliano", "Arya Wahyu", "Faiz", "Gani","KONTOL").stream()
        // map disini adalah operasi intermediate
        .map(nama -> {
            System.out.println("change "+nama+" to uppercase");
            return nama.toUpperCase();
        })

        .map(name -> {
            System.out.println("add uciha in fron of name");
            return "uciha ".toUpperCase() + name;
        })
        /**
         *
         * untuk menteriger atau mejalankan program ini kita membutuhkan yang namanya
         * Method termianl contohnya seperti foreach
        */
        .forEach(System.out::println);
    }
}
