package com.tinder.feed.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.etl.event.EtlEvent;
import com.tinder.feed.analytics.session.C9450f;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.Completable;
import rx.Single;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J(\u0010\u0007\u001a\u00020\b\"\b\b\u0000\u0010\t*\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\t0\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J2\u0010\u000f\u001a\u00020\b\"\b\b\u0000\u0010\t*\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\t0\f0\u0011JO\u0010\u000f\u001a\u00020\b\"\b\b\u0000\u0010\u0012*\u00020\u0001\"\b\b\u0001\u0010\t*\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u0002H\u00122\u001e\u0010\u0010\u001a\u001a\u0012\u0004\u0012\u0002H\u0012\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\t0\f0\u0014¢\u0006\u0002\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/tinder/feed/analytics/FeedEventDispatchingSubscriber;", "", "feedSessionExecutor", "Lcom/tinder/feed/analytics/session/FeedSessionExecutor;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "(Lcom/tinder/feed/analytics/session/FeedSessionExecutor;Lcom/tinder/analytics/fireworks/Fireworks;)V", "addEventAndSubscribe", "", "ETL", "Lcom/tinder/etl/event/EtlEvent;", "feedEventSingle", "Lrx/Single;", "feedEventName", "", "subscribe", "feedEventCreator", "Lkotlin/Function1;", "REQUEST", "request", "Lkotlin/Function2;", "(Ljava/lang/String;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.analytics.a */
public final class C9432a {
    /* renamed from: a */
    private final C9450f f31601a;
    /* renamed from: b */
    private final C2630h f31602b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0003*\u00020\u00042\u000e\u0010\u0005\u001a\n \u0002*\u0004\u0018\u0001H\u0003H\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Lrx/Completable;", "kotlin.jvm.PlatformType", "ETL", "Lcom/tinder/etl/event/EtlEvent;", "event", "call", "(Lcom/tinder/etl/event/EtlEvent;)Lrx/Completable;"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.analytics.a$a */
    static final class C13215a<T, R> implements Func1<ETL, Completable> {
        /* renamed from: a */
        final /* synthetic */ C9432a f41929a;

        C13215a(C9432a c9432a) {
            this.f41929a = c9432a;
        }

        public /* synthetic */ Object call(Object obj) {
            return m51205a((EtlEvent) obj);
        }

        /* renamed from: a */
        public final Completable m51205a(final ETL etl) {
            return Completable.a(new Action0() {
                public final void call() {
                    this.f41929a.f31602b.a(etl);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "ETL", "Lcom/tinder/etl/event/EtlEvent;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.analytics.a$b */
    static final class C13947b implements Action0 {
        /* renamed from: a */
        final /* synthetic */ String f44080a;

        C13947b(String str) {
            this.f44080a = str;
        }

        public final void call() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("");
            stringBuilder.append(this.f44080a);
            stringBuilder.append(" successfully logged");
            C0001a.b(stringBuilder.toString(), new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "ETL", "Lcom/tinder/etl/event/EtlEvent;", "throwable", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.analytics.a$c */
    static final class C13948c<T> implements Action1<Throwable> {
        /* renamed from: a */
        final /* synthetic */ String f44081a;

        C13948c(String str) {
            this.f44081a = str;
        }

        public /* synthetic */ void call(Object obj) {
            m53474a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53474a(Throwable th) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to fire ");
            stringBuilder.append(this.f44081a);
            C0001a.c(th, stringBuilder.toString(), new Object[0]);
        }
    }

    @Inject
    public C9432a(@NotNull C9450f c9450f, @NotNull C2630h c2630h) {
        C2668g.b(c9450f, "feedSessionExecutor");
        C2668g.b(c2630h, "fireworks");
        this.f31601a = c9450f;
        this.f31602b = c2630h;
    }

    /* renamed from: a */
    public final <REQUEST, ETL extends EtlEvent> void m39436a(@NotNull String str, @NotNull REQUEST request, @NotNull Function2<? super REQUEST, ? super String, ? extends Single<ETL>> function2) {
        C2668g.b(str, "feedEventName");
        C2668g.b(request, "request");
        C2668g.b(function2, "feedEventCreator");
        m39435a((Single) function2.invoke(request, this.f31601a.m39497a()), str);
    }

    /* renamed from: a */
    public final <ETL extends EtlEvent> void m39437a(@NotNull String str, @NotNull Function1<? super String, ? extends Single<ETL>> function1) {
        C2668g.b(str, "feedEventName");
        C2668g.b(function1, "feedEventCreator");
        m39435a((Single) function1.invoke(this.f31601a.m39497a()), str);
    }

    /* renamed from: a */
    private final <ETL extends EtlEvent> void m39435a(Single<ETL> single, String str) {
        single.c(new C13215a(this)).a(new C13947b(str), new C13948c(str));
    }
}
