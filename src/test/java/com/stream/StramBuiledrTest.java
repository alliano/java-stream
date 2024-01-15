package com.stream;

import java.util.stream.Stream;

import org.junit.Test;

public class StramBuiledrTest {

    @Test
    public void streamBuilder() {
        /**
         * stream builder
         * kita bisa menambahkan stream secara manual
         * java menyedisakan stream builder untuk membuat stream secara manual, dan
         * kita bisa menggunakanya seperti collection
         */

        //membuat stram builder ini mirip seperti List<String> names = new ArrayList<String>();
        Stream.Builder<String> profesi = Stream.builder();

        /**
         * menambahkan data pada stram builder kita buisa menggunakan 2 method
         * accept(data) -> method ini bertipe void
         * add(data) -> method ini mereturn builder jadi kita bisa chaining
         * ex : builder.add(data1).add(data2)
         * setelah kita selesai menambahakan data stream builder
         * maka kita haru membuil data tersebut dengan menggunakan method build()
         */

         profesi.accept("Software engginer");
         profesi.add("Technical Arcitect").add("Backend Engginer").add("Frontend");

         Stream<String> profesiStream = profesi.build();

         profesiStream.forEach(System.out::println);

         //buid stream dengan cara simpel

         Stream<Object> datas = Stream.builder().add("Bakso").add("Mi Ayam").add("Ayam Goreng").build();

         datas.forEach(System.out::println);

    }
}
