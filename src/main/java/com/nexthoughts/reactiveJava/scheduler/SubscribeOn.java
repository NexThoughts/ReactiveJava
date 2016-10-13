package com.nexthoughts.reactiveJava.scheduler;

import rx.Observable;
import rx.Subscriber;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/**
 * Created by hitenpratap on 13/10/16.
 */
public class SubscribeOn {
    public static void main(String[] args) {
        Observable observable = Observable.create(new Observable.OnSubscribe<String>() {
            @Override
            public void call(Subscriber<? super String> sub) {
                System.out.println("Observable executing on: " + Thread.currentThread());
                sub.onNext("Hello World!");
                sub.onCompleted();
            }
        });

        observable.subscribeOn(Schedulers.io()).subscribe(new Action1() {
            @Override
            public void call(Object o) {
                System.out.println("Observing on: " + Thread.currentThread() + " " + o);
            }
        });
    }
}
