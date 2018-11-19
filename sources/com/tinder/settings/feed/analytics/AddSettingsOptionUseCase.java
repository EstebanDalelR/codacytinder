package com.tinder.settings.feed.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.etl.event.wj;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;
import rx.Completable;
import rx.Single;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\f\rB\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/tinder/settings/feed/analytics/AddSettingsOptionUseCase;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "Lcom/tinder/settings/feed/analytics/AddSettingsOptionUseCase$Request;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "(Lcom/tinder/analytics/fireworks/Fireworks;)V", "createEvent", "Lrx/Single;", "Lcom/tinder/etl/event/SettingsOptionEvent;", "request", "execute", "", "Request", "Type", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class AddSettingsOptionUseCase implements VoidUseCase<C14872a> {
    /* renamed from: a */
    private final C2630h f51501a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/tinder/settings/feed/analytics/AddSettingsOptionUseCase$Type;", "", "analyticsValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getAnalyticsValue", "()Ljava/lang/String;", "SHARED_CONTENT", "MANAGE_PLACES", "Tinder_release"}, k = 1, mv = {1, 1, 10})
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

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/tinder/settings/feed/analytics/AddSettingsOptionUseCase$Request;", "", "type", "Lcom/tinder/settings/feed/analytics/AddSettingsOptionUseCase$Type;", "source", "", "(Lcom/tinder/settings/feed/analytics/AddSettingsOptionUseCase$Type;Ljava/lang/String;)V", "getSource", "()Ljava/lang/String;", "getType", "()Lcom/tinder/settings/feed/analytics/AddSettingsOptionUseCase$Type;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.settings.feed.analytics.AddSettingsOptionUseCase$a */
    public static final class C14872a {
        @NotNull
        /* renamed from: a */
        private final Type f46550a;
        @Nullable
        /* renamed from: b */
        private final String f46551b;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C14872a) {
                    C14872a c14872a = (C14872a) obj;
                    if (C2668g.a(this.f46550a, c14872a.f46550a) && C2668g.a(this.f46551b, c14872a.f46551b)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            Type type = this.f46550a;
            int i = 0;
            int hashCode = (type != null ? type.hashCode() : 0) * 31;
            String str = this.f46551b;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(type=");
            stringBuilder.append(this.f46550a);
            stringBuilder.append(", source=");
            stringBuilder.append(this.f46551b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C14872a(@NotNull Type type, @Nullable String str) {
            C2668g.b(type, "type");
            this.f46550a = type;
            this.f46551b = str;
        }

        public /* synthetic */ C14872a(Type type, String str, int i, C15823e c15823e) {
            if ((i & 2) != 0) {
                str = null;
            }
            this(type, str);
        }

        @NotNull
        /* renamed from: a */
        public final Type m56301a() {
            return this.f46550a;
        }

        @Nullable
        /* renamed from: b */
        public final String m56302b() {
            return this.f46551b;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lrx/Completable;", "kotlin.jvm.PlatformType", "it", "Lcom/tinder/etl/event/SettingsOptionEvent;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.settings.feed.analytics.AddSettingsOptionUseCase$b */
    static final class C18065b<T, R> implements Func1<wj, Completable> {
        /* renamed from: a */
        final /* synthetic */ AddSettingsOptionUseCase f56109a;

        C18065b(AddSettingsOptionUseCase addSettingsOptionUseCase) {
            this.f56109a = addSettingsOptionUseCase;
        }

        public /* synthetic */ Object call(Object obj) {
            return m65564a((wj) obj);
        }

        /* renamed from: a */
        public final Completable m65564a(final wj wjVar) {
            return Completable.a(new Action0() {
                public final void call() {
                    this.f56109a.f51501a.a(wjVar);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.settings.feed.analytics.AddSettingsOptionUseCase$c */
    static final class C18838c implements Action0 {
        /* renamed from: a */
        public static final C18838c f58389a = new C18838c();

        C18838c() {
        }

        public final void call() {
            C0001a.b("SettingsOptionEvent successfully logged", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.settings.feed.analytics.AddSettingsOptionUseCase$d */
    static final class C18839d<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C18839d f58390a = new C18839d();

        C18839d() {
        }

        public /* synthetic */ void call(Object obj) {
            m67282a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m67282a(Throwable th) {
            C0001a.c(th, "AddSettingsOptionUseCase failed", new Object[0]);
        }
    }

    @Inject
    public AddSettingsOptionUseCase(@NotNull C2630h c2630h) {
        C2668g.b(c2630h, "fireworks");
        this.f51501a = c2630h;
    }

    public /* synthetic */ void execute(Object obj) {
        m62086a((C14872a) obj);
    }

    /* renamed from: a */
    public void m62086a(@NotNull C14872a c14872a) {
        C2668g.b(c14872a, "request");
        m62085b(c14872a).c(new C18065b(this)).b(Schedulers.io()).a(C18838c.f58389a, C18839d.f58390a);
    }

    /* renamed from: b */
    private final Single<wj> m62085b(C14872a c14872a) {
        c14872a = Single.a(wj.a().b(c14872a.m56301a().getAnalyticsValue()).a(c14872a.m56302b()).a());
        C2668g.a(c14872a, "Single.just(SettingsOpti…                .build())");
        return c14872a;
    }
}
