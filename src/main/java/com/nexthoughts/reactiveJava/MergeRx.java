package com.nexthoughts.reactiveJava;

import rx.Observable;
import rx.functions.Action1;

/**
 * Created by hitenpratap on 13/10/16.
 */
public class MergeRx {
    public static void main(String[] args) {
        Observable.range(1, 10).mergeWith(Observable.range(91, 10)).
                subscribe(new Action1<Integer>() {
                    @Override
                    public void call(Integer integer) {
                        System.out.println(integer);
                    }
                });
    }
}
