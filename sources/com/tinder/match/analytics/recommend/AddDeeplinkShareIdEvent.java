package com.tinder.match.analytics.recommend;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.etl.event.er;
import io.reactivex.C3956a;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.C15756a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\t\nB\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/match/analytics/recommend/AddDeeplinkShareIdEvent;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "Lcom/tinder/match/analytics/recommend/AddDeeplinkShareIdEvent$Request;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "(Lcom/tinder/analytics/fireworks/Fireworks;)V", "execute", "", "request", "From", "Request", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class AddDeeplinkShareIdEvent implements VoidUseCase<C9847a> {
    /* renamed from: a */
    private final C2630h f39156a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/tinder/match/analytics/recommend/AddDeeplinkShareIdEvent$From;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "REC", "MATCH", "FEED_MENU", "REC_MENU", "MATCH_MENU", "REC_SCREENSHOT", "PROFILE_SCREENSHOT", "MATCH_SCREENSHOT", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public enum From {
        ;
        
        @NotNull
        private final String value;

        protected From(String str) {
            C2668g.b(str, "value");
            this.value = str;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/tinder/match/analytics/recommend/AddDeeplinkShareIdEvent$Request;", "", "activityType", "", "completed", "", "referralURL", "from", "otherId", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getActivityType", "()Ljava/lang/String;", "getCompleted", "()Z", "getFrom", "getOtherId", "getReferralURL", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.match.analytics.recommend.AddDeeplinkShareIdEvent$a */
    public static final class C9847a {
        @NotNull
        /* renamed from: a */
        private final String f32624a;
        /* renamed from: b */
        private final boolean f32625b;
        @NotNull
        /* renamed from: c */
        private final String f32626c;
        @NotNull
        /* renamed from: d */
        private final String f32627d;
        @NotNull
        /* renamed from: e */
        private final String f32628e;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C9847a) {
                C9847a c9847a = (C9847a) obj;
                if (C2668g.a(this.f32624a, c9847a.f32624a)) {
                    return (this.f32625b == c9847a.f32625b ? 1 : null) != null && C2668g.a(this.f32626c, c9847a.f32626c) && C2668g.a(this.f32627d, c9847a.f32627d) && C2668g.a(this.f32628e, c9847a.f32628e);
                }
            }
        }

        public int hashCode() {
            String str = this.f32624a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            int i2 = this.f32625b;
            if (i2 != 0) {
                i2 = 1;
            }
            hashCode = (hashCode + i2) * 31;
            String str2 = this.f32626c;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            str2 = this.f32627d;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            str2 = this.f32628e;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(activityType=");
            stringBuilder.append(this.f32624a);
            stringBuilder.append(", completed=");
            stringBuilder.append(this.f32625b);
            stringBuilder.append(", referralURL=");
            stringBuilder.append(this.f32626c);
            stringBuilder.append(", from=");
            stringBuilder.append(this.f32627d);
            stringBuilder.append(", otherId=");
            stringBuilder.append(this.f32628e);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        @NotNull
        /* renamed from: a */
        public final String m40533a() {
            return this.f32624a;
        }

        /* renamed from: b */
        public final boolean m40534b() {
            return this.f32625b;
        }

        @NotNull
        /* renamed from: c */
        public final String m40535c() {
            return this.f32626c;
        }

        @NotNull
        /* renamed from: d */
        public final String m40536d() {
            return this.f32627d;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.match.analytics.recommend.AddDeeplinkShareIdEvent$b */
    static final class C12039b implements Action {
        /* renamed from: a */
        final /* synthetic */ AddDeeplinkShareIdEvent f39152a;
        /* renamed from: b */
        final /* synthetic */ C9847a f39153b;

        C12039b(AddDeeplinkShareIdEvent addDeeplinkShareIdEvent, C9847a c9847a) {
            this.f39152a = addDeeplinkShareIdEvent;
            this.f39153b = c9847a;
        }

        public final void run() {
            this.f39152a.f39156a.a(er.m45011a().m38221a(this.f39153b.m40533a()).m38220a(Boolean.valueOf(this.f39153b.m40534b())).m38223b(this.f39153b.m40535c()).m38224c(this.f39153b.m40536d()).m38222a());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.match.analytics.recommend.AddDeeplinkShareIdEvent$c */
    static final class C12040c implements Action {
        /* renamed from: a */
        public static final C12040c f39154a = new C12040c();

        C12040c() {
        }

        public final void run() {
            C0001a.b("DeeplinkShareID event successfully logged.", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.match.analytics.recommend.AddDeeplinkShareIdEvent$d */
    static final class C12041d<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C12041d f39155a = new C12041d();

        C12041d() {
        }

        public /* synthetic */ void accept(Object obj) {
            m48140a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m48140a(Throwable th) {
            C0001a.c(th, "AddDeeplinkShareIdUseCase failed.", new Object[0]);
        }
    }

    @Inject
    public AddDeeplinkShareIdEvent(@NotNull C2630h c2630h) {
        C2668g.b(c2630h, "fireworks");
        this.f39156a = c2630h;
    }

    public /* synthetic */ void execute(Object obj) {
        m48142a((C9847a) obj);
    }

    /* renamed from: a */
    public void m48142a(@NotNull C9847a c9847a) {
        C2668g.b(c9847a, "request");
        C3956a.a(new C12039b(this, c9847a)).b(C15756a.b()).a(C12040c.f39154a, C12041d.f39155a);
    }
}
