package com.tinder.feed.view.tracker;

import com.tinder.feed.view.model.C9540f;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java8.util.Optional;
import javax.inject.Singleton;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ae;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;
import rx.Single;
import rx.functions.Action0;

@Singleton
@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007\b\u0001¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000b0\n2\u0006\u0010\f\u001a\u00020\u0005J \u0010\r\u001a\u00020\b2\u0018\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00100\u000fR\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/tinder/feed/view/tracker/FeedViewModelWithPositionMap;", "", "()V", "feedItemIdToViewModelWithPositionMap", "", "", "Lcom/tinder/feed/view/model/FeedViewModelWithPosition;", "clear", "Lrx/Completable;", "get", "Lrx/Single;", "Ljava8/util/Optional;", "key", "putAll", "keyValuePairs", "", "Lkotlin/Pair;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.view.tracker.g */
public final class C9551g {
    /* renamed from: a */
    private final Map<String, C9540f> f31950a = new LinkedHashMap();

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Ljava8/util/Optional;", "Lcom/tinder/feed/view/model/FeedViewModelWithPosition;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.tracker.g$b */
    static final class C9550b<V> implements Callable<T> {
        /* renamed from: a */
        final /* synthetic */ C9551g f31948a;
        /* renamed from: b */
        final /* synthetic */ String f31949b;

        C9550b(C9551g c9551g, String str) {
            this.f31948a = c9551g;
            this.f31949b = str;
        }

        public /* synthetic */ Object call() {
            return m39852a();
        }

        /* renamed from: a */
        public final Optional<C9540f> m39852a() {
            Optional<C9540f> a;
            synchronized (this.f31948a.f31950a) {
                C9540f c9540f = (C9540f) this.f31948a.f31950a.get(this.f31949b);
                if (c9540f != null) {
                    a = Optional.a(c9540f);
                } else {
                    a = Optional.a();
                }
            }
            return a;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.tracker.g$a */
    static final class C14027a implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C9551g f44415a;

        C14027a(C9551g c9551g) {
            this.f44415a = c9551g;
        }

        public final void call() {
            synchronized (this.f44415a.f31950a) {
                this.f44415a.f31950a.clear();
                C15813i c15813i = C15813i.f49016a;
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.tracker.g$c */
    static final class C14028c implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C9551g f44416a;
        /* renamed from: b */
        final /* synthetic */ Iterable f44417b;

        C14028c(C9551g c9551g, Iterable iterable) {
            this.f44416a = c9551g;
            this.f44417b = iterable;
        }

        public final void call() {
            synchronized (this.f44416a.f31950a) {
                ae.a(this.f44416a.f31950a, this.f44417b);
                C15813i c15813i = C15813i.f49016a;
            }
        }
    }

    @NotNull
    /* renamed from: a */
    public final Single<Optional<C9540f>> m39856a(@NotNull String str) {
        C2668g.b(str, "key");
        str = Single.a(new C9550b(this, str));
        C2668g.a(str, "Single.fromCallable {\n  …}\n            }\n        }");
        return str;
    }

    @NotNull
    /* renamed from: a */
    public final Completable m39855a(@NotNull Iterable<Pair<String, C9540f>> iterable) {
        C2668g.b(iterable, "keyValuePairs");
        iterable = Completable.a(new C14028c(this, iterable));
        C2668g.a(iterable, "Completable.fromAction {…)\n            }\n        }");
        return iterable;
    }

    @NotNull
    /* renamed from: a */
    public final Completable m39854a() {
        Completable a = Completable.a(new C14027a(this));
        C2668g.a(a, "Completable.fromAction {…)\n            }\n        }");
        return a;
    }
}
