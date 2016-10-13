package com.nexthoughts.reactiveJava.townTemperature;

import rx.Observable;
import rx.functions.Action1;
import rx.functions.Func1;

import java.util.Arrays;

/**
 * Created by hitenpratap on 13/10/16.
 */
public class TownTemp {
    public static void main(String[] args) {
        Observable<TempInfo> feed = getFeeds("Milano", "Italy", "Berlin", "Geneva", "Rome");
        feed.subscribe(new Action1<TempInfo>() {
            @Override
            public void call(TempInfo tempInfo) {
                System.out.println(tempInfo.toString());
            }
        });
    }

    private static Observable<TempInfo> getFeeds(String... towns) {
        return Observable.from(Arrays.asList(towns)).map(new Func1<String, TempInfo>() {
            @Override
            public TempInfo call(String s) {
                return TempInfo.fetch(s);
            }
        });
    }

}
