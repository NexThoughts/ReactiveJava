package com.nexthoughts.reactiveJava;

import rx.Observable;
import rx.functions.Action1;
import rx.functions.Func1;

/**
 * Created by hitenpratap on 13/10/16.
 */
public class MapRx {
    public static void main(String[] args) {
        Observable.range(1, 10).
                map(new Func1<Integer, Integer>() {
                    @Override
                    public Integer call(Integer integer) {
                        return integer * 5;
                    }
                }).
                subscribe(new Action1<Integer>() {
                    @Override
                    public void call(Integer integer) {
                        System.out.println(integer);
                    }
                });
    }
}
