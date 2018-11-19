package com.tinder.goingout.p357a;

import com.tinder.goingout.target.TimeSinceTextViewTarget;
import com.tinder.presenters.PresenterBase;
import com.tinder.utils.RxUtils;
import java.util.concurrent.TimeUnit;
import rx.Observable;

/* renamed from: com.tinder.goingout.a.a */
public class C13319a extends PresenterBase<TimeSinceTextViewTarget> {
    /* renamed from: a */
    private static final Long f42267a = Long.valueOf(60);

    /* renamed from: a */
    public Observable<Long> m51557a(long j) {
        return Observable.a(1, TimeUnit.MINUTES).k(new C13320b(j)).r(C13321c.f42269a).a(RxUtils.a());
    }
}
