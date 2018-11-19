package com.tinder.feed.analytics.session;

import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;
import rx.subjects.PublishSubject;

@Singleton
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001:\u0001\fB\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005R2\u0010\u0003\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/feed/analytics/session/FeedPositionRequestProvider;", "", "()V", "requestSubject", "Lrx/subjects/PublishSubject;", "Lcom/tinder/feed/analytics/session/FeedPositionRequestProvider$Request;", "kotlin.jvm.PlatformType", "observe", "Lrx/Observable;", "update", "", "request", "Request", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class FeedPositionRequestProvider {
    /* renamed from: a */
    private final PublishSubject<Request> f31634a = PublishSubject.w();

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/tinder/feed/analytics/session/FeedPositionRequestProvider$Request;", "", "(Ljava/lang/String;I)V", "FIRST_ITEM_POSITION", "LAST_ITEM_POSITION", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public enum Request {
    }

    /* renamed from: a */
    public final void m39471a(@NotNull Request request) {
        C2668g.b(request, "request");
        this.f31634a.onNext(request);
    }

    @NotNull
    /* renamed from: a */
    public final Observable<Request> m39470a() {
        Observable<Request> e = this.f31634a.e();
        C2668g.a(e, "requestSubject.asObservable()");
        return e;
    }
}
