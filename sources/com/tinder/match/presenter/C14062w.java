package com.tinder.match.presenter;

import com.tinder.match.target.NewMatchesTarget;
import java.util.List;
import rx.functions.Action1;

/* renamed from: com.tinder.match.presenter.w */
final /* synthetic */ class C14062w implements Action1 {
    /* renamed from: a */
    private final C13431s f44574a;
    /* renamed from: b */
    private final List f44575b;

    C14062w(C13431s c13431s, List list) {
        this.f44574a = c13431s;
        this.f44575b = list;
    }

    public void call(Object obj) {
        this.f44574a.m51921a(this.f44575b, (NewMatchesTarget) obj);
    }
}
