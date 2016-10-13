package com.nexthoughts.reactiveJava;

import rx.Observable;
import rx.functions.Action1;
import rx.functions.Func1;

/**
 * Created by hitenpratap on 13/10/16.
 */
public class FlatMapRx {
    public static void main(String[] args) {
        Observable.range(1, 10).flatMap(new Func1<Integer, Observable<?>>() {
            @Override
            public Observable<?> call(Integer integer) {
                return Observable.just(-integer, integer);
            }
        }).subscribe(new Action1<Object>() {
            @Override
            public void call(Object o) {
                System.out.println(o);
            }
        });
    }
}
