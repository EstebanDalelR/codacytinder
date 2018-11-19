package com.tinder.apprating.p086a;

import javax.inject.Singleton;
import rx.Observable;
import rx.subjects.PublishSubject;

@Singleton
/* renamed from: com.tinder.apprating.a.d */
public class C8259d {
    /* renamed from: a */
    private final PublishSubject<String> f29489a = PublishSubject.w();

    /* renamed from: a */
    public Observable<String> m35260a() {
        return this.f29489a.e();
    }

    /* renamed from: a */
    public void m35261a(String str) {
        this.f29489a.onNext(str);
    }
}
