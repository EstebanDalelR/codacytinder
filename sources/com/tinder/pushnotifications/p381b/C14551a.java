package com.tinder.pushnotifications.p381b;

import com.tinder.pushnotifications.model.TinderNotification;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;
import rx.subjects.C19786b;
import rx.subjects.PublishSubject;

@Singleton
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005RN\u0010\u0003\u001aB\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006* \u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/pushnotifications/provider/InAppNotificationProvider;", "", "()V", "notifications", "Lrx/subjects/SerializedSubject;", "Lcom/tinder/pushnotifications/model/TinderNotification;", "kotlin.jvm.PlatformType", "observeNotifications", "Lrx/Observable;", "postNotification", "", "notification", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.pushnotifications.b.a */
public final class C14551a {
    /* renamed from: a */
    private final C19786b<TinderNotification, TinderNotification> f45979a = PublishSubject.w().B();

    /* renamed from: a */
    public final void m55575a(@NotNull TinderNotification tinderNotification) {
        C2668g.b(tinderNotification, "notification");
        this.f45979a.onNext(tinderNotification);
    }

    @NotNull
    /* renamed from: a */
    public final Observable<TinderNotification> m55574a() {
        Observable<TinderNotification> e = this.f45979a.e();
        C2668g.a(e, "notifications.asObservable()");
        return e;
    }
}
