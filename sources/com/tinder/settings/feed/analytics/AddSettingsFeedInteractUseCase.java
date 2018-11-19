package com.tinder.settings.feed.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.etl.event.wi;
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

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\f\rB\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/tinder/settings/feed/analytics/AddSettingsFeedInteractUseCase;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "Lcom/tinder/settings/feed/analytics/AddSettingsFeedInteractUseCase$Request;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "(Lcom/tinder/analytics/fireworks/Fireworks;)V", "createEvent", "Lrx/Single;", "Lcom/tinder/etl/event/SettingsFeedInteractEvent;", "request", "execute", "", "Request", "Type", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class AddSettingsFeedInteractUseCase implements VoidUseCase<C14871a> {
    /* renamed from: a */
    private final C2630h f51500a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/tinder/settings/feed/analytics/AddSettingsFeedInteractUseCase$Type;", "", "analyticsValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getAnalyticsValue", "()Ljava/lang/String;", "ALL", "INSTAGRAM", "SPOTIFY_ANTHEM", "SPOTIFY_TOP_ARTISTS", "PHOTOS", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public enum Type {
        ;
        
        @NotNull
        private final String analyticsValue;

        protected Type(String str) {
            C2668g.b(str, "analyticsValue");
            this.analyticsValue = str;
        }

        @NotNull
        public final String getAnalyticsValue() {
            return this.analyticsValue;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/tinder/settings/feed/analytics/AddSettingsFeedInteractUseCase$Request;", "", "type", "Lcom/tinder/settings/feed/analytics/AddSettingsFeedInteractUseCase$Type;", "enable", "", "(Lcom/tinder/settings/feed/analytics/AddSettingsFeedInteractUseCase$Type;Z)V", "getEnable", "()Z", "getType", "()Lcom/tinder/settings/feed/analytics/AddSettingsFeedInteractUseCase$Type;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.settings.feed.analytics.AddSettingsFeedInteractUseCase$a */
    public static final class C14871a {
        @NotNull
        /* renamed from: a */
        private final Type f46548a;
        /* renamed from: b */
        private final boolean f46549b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C14871a) {
                C14871a c14871a = (C14871a) obj;
                if (C2668g.a(this.f46548a, c14871a.f46548a)) {
                    if ((this.f46549b == c14871a.f46549b ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }

        public int hashCode() {
            Type type = this.f46548a;
            int hashCode = (type != null ? type.hashCode() : 0) * 31;
            int i = this.f46549b;
            if (i != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(type=");
            stringBuilder.append(this.f46548a);
            stringBuilder.append(", enable=");
            stringBuilder.append(this.f46549b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C14871a(@NotNull Type type, boolean z) {
            C2668g.b(type, "type");
            this.f46548a = type;
            this.f46549b = z;
        }

        @NotNull
        /* renamed from: a */
        public final Type m56299a() {
            return this.f46548a;
        }

        /* renamed from: b */
        public final boolean m56300b() {
            return this.f46549b;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lrx/Completable;", "kotlin.jvm.PlatformType", "it", "Lcom/tinder/etl/event/SettingsFeedInteractEvent;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.settings.feed.analytics.AddSettingsFeedInteractUseCase$b */
    static final class C18064b<T, R> implements Func1<wi, Completable> {
        /* renamed from: a */
        final /* synthetic */ AddSettingsFeedInteractUseCase f56108a;

        C18064b(AddSettingsFeedInteractUseCase addSettingsFeedInteractUseCase) {
            this.f56108a = addSettingsFeedInteractUseCase;
        }

        public /* synthetic */ Object call(Object obj) {
            return m65563a((wi) obj);
        }

        /* renamed from: a */
        public final Completable m65563a(final wi wiVar) {
            return Completable.a(new Action0() {
                public final void call() {
                    this.f56108a.f51500a.a(wiVar);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.settings.feed.analytics.AddSettingsFeedInteractUseCase$c */
    static final class C18835c implements Action0 {
        /* renamed from: a */
        public static final C18835c f58385a = new C18835c();

        C18835c() {
        }

        public final void call() {
            C0001a.b("SettingsFeedInteractEvent successfully logged", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.settings.feed.analytics.AddSettingsFeedInteractUseCase$d */
    static final class C18836d<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C18836d f58386a = new C18836d();

        C18836d() {
        }

        public /* synthetic */ void call(Object obj) {
            m67281a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m67281a(Throwable th) {
            C0001a.c(th, "AddSettingsFeedInteractUseCase failed", new Object[0]);
        }
    }

    @Inject
    public AddSettingsFeedInteractUseCase(@NotNull C2630h c2630h) {
        C2668g.b(c2630h, "fireworks");
        this.f51500a = c2630h;
    }

    public /* synthetic */ void execute(Object obj) {
        m62083a((C14871a) obj);
    }

    /* renamed from: a */
    public void m62083a(@NotNull C14871a c14871a) {
        C2668g.b(c14871a, "request");
        m62082b(c14871a).c(new C18064b(this)).b(Schedulers.io()).a(C18835c.f58385a, C18836d.f58386a);
    }

    /* renamed from: b */
    private final Single<wi> m62082b(C14871a c14871a) {
        c14871a = Single.a(wi.a().a(c14871a.m56299a().getAnalyticsValue()).a(Boolean.valueOf(c14871a.m56300b())).a());
        C2668g.a(c14871a, "Single.just(SettingsFeed…                .build())");
        return c14871a;
    }
}
