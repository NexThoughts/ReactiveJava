package com.nexthoughts.reactiveJava;

import rx.Observable;
import rx.functions.Action1;
import rx.functions.Func2;

/**
 * Created by hitenpratap on 13/10/16.
 */
public class ZipRx {
    public static void main(String[] args) {
        Observable observable1 = Observable.range(1, 10);
        Observable observable2 = Observable.just("A", "B", "C", "D");

        Observable.zip(observable1, observable2, new Func2() {
            @Override
            public Object call(Object o, Object o2) {
                return String.valueOf(o) + o2;
            }
        }).subscribe(new Action1() {
            @Override
            public void call(Object o) {
                System.out.println(o);
            }
        });
    }
}
