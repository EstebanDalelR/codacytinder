package com.tinder.apprating.p165c;

import com.tinder.apprating.enums.AppRatingType;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;
import rx.subjects.C19786b;
import rx.subjects.PublishSubject;

@Singleton
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bRN\u0010\u0003\u001aB\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006* \u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/apprating/provider/AppRatingDialogProvider;", "", "()V", "subject", "Lrx/subjects/SerializedSubject;", "Lcom/tinder/apprating/enums/AppRatingType;", "kotlin.jvm.PlatformType", "notifyDialogType", "", "type", "observe", "Lrx/Observable;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.apprating.c.a */
public final class C8264a {
    /* renamed from: a */
    private final C19786b<AppRatingType, AppRatingType> f29511a = PublishSubject.w().B();

    @NotNull
    /* renamed from: a */
    public final Observable<AppRatingType> m35283a() {
        Observable<AppRatingType> e = this.f29511a.e();
        C2668g.a(e, "subject.asObservable()");
        return e;
    }

    /* renamed from: a */
    public final void m35284a(@NotNull AppRatingType appRatingType) {
        C2668g.b(appRatingType, "type");
        this.f29511a.onNext(appRatingType);
    }
}
