package com.stream;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

public class CollectOperationTest {
    /**
     * Colect operation
     * method ini biasanya digunakan untuk meng collect data stream dan
     * mengubahnya menjadi struktur data yang kita inginkan
     * biasanya para developer nggunakan collcet untuk mengubah
     * stream menjadi collection
     * operasi collect() membuthkan Collcetors
     *
     * Collectors
     * adalah kelas helper yang bisa digunakan untuk membaut collector ini
     * memudahkan kita untuk menggunakan operasi collect() pada stream
     * ada banyak method static yang dimiliki oleh Class Colectors
     */

     public Stream<String> getStream() {
        return List.of("Alliano", "Allia", "AHh ANJIG", "Pusing", "Kamu Nanya", "Biar aku kasih tau ya").stream();
     }

     @Test
     public void testCollection() {
        Set<String> dataSet = getStream().collect(Collectors.toSet());
        Set<String> dataSetImmutable = getStream().collect(Collectors.toUnmodifiableSet());
        System.out.println(dataSet);
        System.out.println(dataSetImmutable);

        List<String> dataList = getStream().collect(Collectors.toList());
        List<String> dataListImutable = getStream().collect(Collectors.toUnmodifiableList());
        System.out.println(dataList);
        System.out.println(dataListImutable);

     }

     @Test
     public void testMap() {

        Map<String, String> dataMap = getStream().collect(Collectors.toMap(name -> name, name -> name));
        System.out.println(dataMap);
     }
}
