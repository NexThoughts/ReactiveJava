package com.nexthoughts.reactiveJava;

import rx.Observable;
import rx.functions.Action1;
import rx.functions.Func1;

/**
 * Created by hitenpratap on 13/10/16.
 */
public class FilterRx {
    public static void main(String[] args) {
        Observable.range(1, 10).
                filter(new Func1<Integer, Boolean>() {
                    @Override
                    public Boolean call(Integer integer) {
                        return integer % 2 == 0;
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
