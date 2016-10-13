package com.nexthoughts.reactiveJava.townTemperature;

import java.util.Random;

/**
 * Created by hitenpratap on 13/10/16.
 */
public class TempInfo {
    public static final Random random = new Random();

    public final String town;
    public final int temp;

    public TempInfo(String town, int temp) {
        this.temp = temp;
        this.town = town;
    }

    public static TempInfo fetch(String town) {
        return new TempInfo(town, random.nextInt(70) - 20);
    }

    public String toString() {
        return town + " : " + temp;
    }
}
