package com.tinder.match.provider;

import android.support.annotation.NonNull;
import java.util.concurrent.TimeUnit;
import rx.Observable;
import rx.p494a.p496b.C19397a;
import rx.subjects.C19785a;

/* renamed from: com.tinder.match.provider.a */
public class C12076a implements MatchesSearchQueryProvider {
    /* renamed from: a */
    private final C19785a<String> f39221a = C19785a.f("");

    public Observable<String> observeSearchQuery() {
        return this.f39221a.c(100, TimeUnit.MILLISECONDS).a(C19397a.a()).e();
    }

    public void updateSearchQuery(@NonNull String str) {
        this.f39221a.onNext(str);
    }

    @NonNull
    public String getSearchQuery() {
        return (String) this.f39221a.A();
    }
}
