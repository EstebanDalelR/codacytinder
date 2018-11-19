package com.tinder.data.feed;

import com.tinder.domain.feed.FeedPositionRange;
import com.tinder.domain.feed.FeedRangeRepository;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;
import rx.Observable;
import rx.functions.Action0;
import rx.subjects.C19785a;
import rx.subjects.C19786b;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004H\u0002J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000RN\u0010\u0005\u001aB\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00040\u0004 \u0007* \u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/tinder/data/feed/FeedDataRangeRepository;", "Lcom/tinder/domain/feed/FeedRangeRepository;", "()V", "feedRange", "Lcom/tinder/domain/feed/FeedPositionRange;", "subject", "Lrx/subjects/SerializedSubject;", "kotlin.jvm.PlatformType", "clear", "Lrx/Completable;", "dispatchUpdate", "", "range", "observe", "Lrx/Observable;", "setRange", "min", "", "max", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.feed.f */
public final class C10775f implements FeedRangeRepository {
    /* renamed from: a */
    private final C19786b<FeedPositionRange, FeedPositionRange> f35186a = C19785a.w().B();
    /* renamed from: b */
    private FeedPositionRange f35187b = FeedPositionRange.Companion.m37726default();

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.feed.f$a */
    static final class C13808a implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C10775f f43816a;

        C13808a(C10775f c10775f) {
            this.f43816a = c10775f;
        }

        public final void call() {
            synchronized (this.f43816a) {
                this.f43816a.f35187b = FeedPositionRange.Companion.m37726default();
                C15813i c15813i = C15813i.f49016a;
            }
            this.f43816a.m43188a(this.f43816a.f35187b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.feed.f$b */
    static final class C13809b implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C10775f f43817a;
        /* renamed from: b */
        final /* synthetic */ int f43818b;
        /* renamed from: c */
        final /* synthetic */ int f43819c;

        C13809b(C10775f c10775f, int i, int i2) {
            this.f43817a = c10775f;
            this.f43818b = i;
            this.f43819c = i2;
        }

        public final void call() {
            synchronized (this.f43817a) {
                int min;
                if (this.f43817a.f35187b.getMinRangePosition() != -1) {
                    min = Math.min(this.f43817a.f35187b.getMinRangePosition(), this.f43818b);
                } else {
                    min = this.f43818b;
                }
                this.f43817a.f35187b = new FeedPositionRange(min, Math.max(this.f43817a.f35187b.getMaxRangePosition(), this.f43819c));
                C15813i c15813i = C15813i.f49016a;
            }
            this.f43817a.m43188a(this.f43817a.f35187b);
        }
    }

    @NotNull
    public Observable<FeedPositionRange> observe() {
        Observable<FeedPositionRange> e = this.f35186a.e();
        C2668g.a(e, "subject.asObservable()");
        return e;
    }

    @NotNull
    public Completable setRange(int i, int i2) {
        i = Completable.a(new C13809b(this, i, i2));
        C2668g.a(i, "Completable.fromAction {…)\n            }\n        }");
        return i;
    }

    @NotNull
    public Completable clear() {
        Completable a = Completable.a(new C13808a(this));
        C2668g.a(a, "Completable.fromAction {…)\n            }\n        }");
        return a;
    }

    /* renamed from: a */
    private final void m43188a(FeedPositionRange feedPositionRange) {
        this.f35186a.onNext(feedPositionRange);
    }
}
