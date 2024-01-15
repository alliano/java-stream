package com.stream;

import java.util.List;
import java.util.stream.Stream;

import org.junit.Test;

public class StreamOperation {

    /**
     * Stream Operation
     * Strem Operation adalah kumpulan operasi yang kita bisa gunakan untuk memanipulasi
     * Stream itu sendiri (memanipulasi data stream nya) ada banyak operasi Stream
     * Secara garis besar Stream tidaka akan memodifikasi data aslinya, melainkan
     * melainkan data hasil dari operasi stream akan menghasilkan data stream baru
     */

     @Test
    public void testStream() {

        List<String> dataList = List.of("telor ceplok", "eelur dadar", "ayam kecap", "opor ayam");

        Stream<String> foods = dataList.stream();

        /* menggunakan operasi stream map untuk mengubah data stream sebelumnya dan
         * menghasilkan data steam baru
         *
        */
        Stream<String> foodsDatabaru = foods.map( food -> food.toUpperCase());

        foodsDatabaru.forEach(System.out::println);

        dataList.forEach(System.out::println);
    }

    @Test
    public void testStreamPipline() {

        /**
         * Stream Pipline
         * Saat kita menbuat Stream bisasanya ktia akan menggunkana banyak operasi terhadap satu stream
         * dan biasanya kita akan membaut stream pipline
         * stream pipline terdiri dari sutatu sumber (Array, Collection, dll) lalu diikuti dengan
         * kosong atau lebih stream operartion dan diakhiri dengan operasi akhir, misalnya foreach
         *
         * ket : iniadalah method chaining yang mana method akan di chain dengan method lainya
         */
        List.of("Alliano", "Manda", "wanda", "Ahh Kontol", "Kamu nanya ?")
        .stream().map(name -> name.toUpperCase()).map(name -> "uciha ".toUpperCase() + name)
        .forEach(System.out::println);;
    }

    @Test
    public void testReduce() {
       var result =  List.of(1,2,3,4,5,6,7,8,9).stream()
        .reduce(0, (bilanganPertama, bilanganKeDua) -> bilanganPertama + bilanganKeDua);
        System.out.println(result);

    /**
     * parameter pertama reduce adalah untuk mengisi parameter bilangan pertama
     * dan parameter bilanganKeDua akan diisi oleh stream nya dan jikalau selesai
     * dijumlahkan maka bilanganPertama akan diisi oleh hasil dari pnjumlahan
     * ex :
     * iterasi pertama
     * bilanganPertama = 0 bilanagnKeDua = 1 bilanganPertama + bilanganKeDua = 1
     * bilanganPertama = 1 bilanganKeDua = 2 BilanganPertama + BilanganKeDua = 3
     * danseterusnya
     */
    }

    @Test
    public void test() {

        /**
         * forEach Operation
         * Selain ForEach ada juga method untuk melakukan iterasi satu per satu tampa
         * harus melakukan terminal operarion
         * ******************************************************+
         *      Method      |       Keteranga                    *
         * ******************************************************+
         *  forEach(T->void)| melakukan iterasi 1 per 1          *
         *                  |data ini adalah terminal operation  *
         * ------------------------------------------------------*
         *  peek(T->void)   | melakukan iterasi 1 per 1          *
         *                  |namun mengembalikan stream lagi dan *
         *                  |ini bukan terminal operation        *
         * ******************************************************+
         */

         List.of("Alliano","Denji").stream()
         .peek(name -> System.out.println("Before change name to upper : "+name))
         .map(toUpper -> toUpper.toUpperCase())
         .peek(name -> System.out.println("After change name to upper : " + name))
         .forEach(System.out::println);
    }
}
