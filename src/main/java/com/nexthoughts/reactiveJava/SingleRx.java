package com.nexthoughts.reactiveJava;

import rx.Single;
import rx.SingleSubscriber;

/**
 * Created by hitenpratap on 13/10/16.
 */
public class SingleRx {
    public static void main(String[] args) {
        Single<String> single = Single.just("Hello");
        single.subscribe(new SingleSubscriber<String>() {
            @Override
            public void onSuccess(String value) {
                System.out.println(value);
            }

            @Override
            public void onError(Throwable error) {
                System.out.println(error.getMessage());
            }
        });
    }
}
