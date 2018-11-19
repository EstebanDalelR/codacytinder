package com.tinder.match.presenter;

import com.tinder.domain.match.usecase.GetNewMatches;
import rx.functions.Func1;

final /* synthetic */ class aa implements Func1 {
    /* renamed from: a */
    private final GetNewMatches f42582a;

    private aa(GetNewMatches getNewMatches) {
        this.f42582a = getNewMatches;
    }

    /* renamed from: a */
    static Func1 m51900a(GetNewMatches getNewMatches) {
        return new aa(getNewMatches);
    }

    public Object call(Object obj) {
        return this.f42582a.execute((String) obj);
    }
}
