package com.nexthoughts.reactiveJava;

import rx.Observable;
import rx.functions.Action1;

import java.util.Arrays;

/**
 * Created by hitenpratap on 13/10/16.
 */
public class HelloWorld2 {
    public static void main(String[] args) {
        Observable.just("Hello", "World!")
                .subscribe(new Action1<String>() {
                    @Override
                    public void call(String s) {
                        System.out.println(s);
                    }
                });

        Observable.empty().subscribe();

        Observable.from(Arrays.asList("Hello", "World!"))
                .subscribe(new Action1<String>() {
                    @Override
                    public void call(String s) {
                        System.out.println(s);
                    }
                });
    }
}
