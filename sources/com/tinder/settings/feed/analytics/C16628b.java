package com.tinder.settings.feed.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.etl.event.wh;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.Completable;
import rx.Single;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/settings/feed/analytics/AddSettingsFeedUseCase;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "Lcom/tinder/settings/feed/analytics/AddSettingsFeedUseCase$Request;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "(Lcom/tinder/analytics/fireworks/Fireworks;)V", "createEvent", "Lrx/Single;", "Lcom/tinder/etl/event/SettingsFeedEvent;", "request", "execute", "", "Request", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.settings.feed.analytics.b */
public final class C16628b implements VoidUseCase<C14873a> {
    /* renamed from: a */
    private final C2630h f51502a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/tinder/settings/feed/analytics/AddSettingsFeedUseCase$Request;", "", "photosEnabled", "", "spotifyAnthemEnabled", "spotifyTopArtistsEnabled", "(ZZZ)V", "getPhotosEnabled", "()Z", "getSpotifyAnthemEnabled", "getSpotifyTopArtistsEnabled", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.settings.feed.analytics.b$a */
    public static final class C14873a {
        /* renamed from: a */
        private final boolean f46552a;
        /* renamed from: b */
        private final boolean f46553b;
        /* renamed from: c */
        private final boolean f46554c;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C14873a) {
                C14873a c14873a = (C14873a) obj;
                if ((this.f46552a == c14873a.f46552a ? 1 : null) != null) {
                    if ((this.f46553b == c14873a.f46553b ? 1 : null) != null) {
                        if ((this.f46554c == c14873a.f46554c ? 1 : null) != null) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }

        public int hashCode() {
            int i = this.f46552a;
            int i2 = 1;
            if (i != 0) {
                i = 1;
            }
            i *= 31;
            int i3 = this.f46553b;
            if (i3 != 0) {
                i3 = 1;
            }
            i = (i + i3) * 31;
            boolean z = this.f46554c;
            if (!z) {
                i2 = z;
            }
            return i + i2;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(photosEnabled=");
            stringBuilder.append(this.f46552a);
            stringBuilder.append(", spotifyAnthemEnabled=");
            stringBuilder.append(this.f46553b);
            stringBuilder.append(", spotifyTopArtistsEnabled=");
            stringBuilder.append(this.f46554c);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C14873a(boolean z, boolean z2, boolean z3) {
            this.f46552a = z;
            this.f46553b = z2;
            this.f46554c = z3;
        }

        /* renamed from: a */
        public final boolean m56303a() {
            return this.f46552a;
        }

        /* renamed from: b */
        public final boolean m56304b() {
            return this.f46553b;
        }

        /* renamed from: c */
        public final boolean m56305c() {
            return this.f46554c;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lrx/Completable;", "kotlin.jvm.PlatformType", "it", "Lcom/tinder/etl/event/SettingsFeedEvent;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.settings.feed.analytics.b$b */
    static final class C18067b<T, R> implements Func1<wh, Completable> {
        /* renamed from: a */
        final /* synthetic */ C16628b f56111a;

        C18067b(C16628b c16628b) {
            this.f56111a = c16628b;
        }

        public /* synthetic */ Object call(Object obj) {
            return m65568a((wh) obj);
        }

        /* renamed from: a */
        public final Completable m65568a(final wh whVar) {
            return Completable.a(new Action0() {
                public final void call() {
                    this.f56111a.f51502a.a(whVar);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.settings.feed.analytics.b$c */
    static final class C18841c implements Action0 {
        /* renamed from: a */
        public static final C18841c f58393a = new C18841c();

        C18841c() {
        }

        public final void call() {
            C0001a.b("SettingsFeedEvent successfully logged", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.settings.feed.analytics.b$d */
    static final class C18842d<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C18842d f58394a = new C18842d();

        C18842d() {
        }

        public /* synthetic */ void call(Object obj) {
            m67283a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m67283a(Throwable th) {
            C0001a.c(th, "AddSettingsFeedUseCase failed", new Object[0]);
        }
    }

    @Inject
    public C16628b(@NotNull C2630h c2630h) {
        C2668g.b(c2630h, "fireworks");
        this.f51502a = c2630h;
    }

    public /* synthetic */ void execute(Object obj) {
        m62089a((C14873a) obj);
    }

    /* renamed from: a */
    public void m62089a(@NotNull C14873a c14873a) {
        C2668g.b(c14873a, "request");
        m62088b(c14873a).c(new C18067b(this)).b(Schedulers.io()).a(C18841c.f58393a, C18842d.f58394a);
    }

    /* renamed from: b */
    private final Single<wh> m62088b(C14873a c14873a) {
        c14873a = Single.a(wh.a().a(Boolean.valueOf(c14873a.m56303a())).b(Boolean.valueOf(c14873a.m56304b())).c(Boolean.valueOf(c14873a.m56305c())).a());
        C2668g.a(c14873a, "Single.just(SettingsFeed…ed)\n            .build())");
        return c14873a;
    }
}
