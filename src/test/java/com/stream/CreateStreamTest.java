package com.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

import org.junit.Test;

public class CreateStreamTest {

    @Test
    public void createStream(){

        String data = null;

        //membaut stream kosong
        Stream<String> emptyStream = Stream.empty();

        //membaut stream dengan satu data
        Stream<String> nama = Stream.of("Alliano");

        //membuat stream dengan data nya bisa ada dan bisa nga (optional)
        Stream<String> optionalStream = Stream.ofNullable(data);

    }

    @Test
    public void createStreamFromArray() {

        //membuat stream dengan banyak data
        Stream<String> names = Stream.of("Alliano","Uciha","Kondom");

        //membaut Stream dengan banyak data integer
        Stream<Integer> dataIntegers = Stream.of(1,2,3,4,56,7,7);

        //membaut Stream dengan data array atau konversi Array ke Stream

        String[] foods = new String[]{"Miayam","Ayam krispi","Pecel","Sate"};

        Stream<String> covertsArray = Arrays.stream(foods);

    }

    @Test
    public void runDataStream() {
        /**
         * menajalankan data steram
         * Stream tisak akan berjalan selma kita tidak meng eksekusinya
         * Ada banyak cara untuk meminta Stream untuk mengalirkan atau menjalankan datanya
         * salah satu cara nya dengan menggunakan foreach
         * Stream hanya bisa jalan sekali, mirip seperti aliran data, setelah mengalar data
         * tidak bisa diulang lagi dari awal maksudnya disini adalah
         * jikalau suatud data pernah di alirkan (Stream) maka data tersebut tidak bisa
         * di stream lagi
         */
        Stream<String> names = Stream.of("Alliano","Uciha","Kondom");

        Stream<Integer> dataIntegers = Stream.of(1,2,3,4,5,6,7,8);

        names.forEach( name -> System.out.println(name));

        dataIntegers.forEach(System.out::println);
    }

    @Test
    public void createStremFomCollection() {

        Collection<String> names = List.of("Uciha Alliano", "Uciha Madara", "Uciha Itachi", "Denji");

        Stream<String> streamFromList = names.stream();

        streamFromList.forEach(System.out::println);

        //foreach ke 2 akan error karena data nya sudah pernah di stream sebelumnya
        // streamFromList.forEach(System.out::println);
    }


}
