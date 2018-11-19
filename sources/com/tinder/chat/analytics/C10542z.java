package com.tinder.chat.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.etl.event.dl;
import com.tinder.model.analytics.AnalyticsConstants;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0017\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/chat/analytics/ChatSelectSendErrorOptionsEventDispatcher;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "Lcom/tinder/chat/analytics/ChatSelectSendErrorOptionsEventDispatcher$Request;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "chatAnalyticsFactory", "Lcom/tinder/chat/analytics/ChatAnalyticsFactory;", "(Lcom/tinder/analytics/fireworks/Fireworks;Lcom/tinder/chat/analytics/ChatAnalyticsFactory;)V", "execute", "", "request", "Request", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.chat.analytics.z */
public final class C10542z implements VoidUseCase<C8439a> {
    /* renamed from: a */
    private final C2630h f34283a;
    /* renamed from: b */
    private final C10522a f34284b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001a\b\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\rHÆ\u0003J[\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010#\u001a\u00020\r2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0005HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006'"}, d2 = {"Lcom/tinder/chat/analytics/ChatSelectSendErrorOptionsEventDispatcher$Request;", "", "matchId", "", "messageType", "", "message", "messageIndex", "contentId", "position", "", "button", "isFeedComment", "", "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/Number;Ljava/lang/String;Z)V", "getButton", "()Ljava/lang/String;", "getContentId", "()Z", "getMatchId", "getMessage", "getMessageIndex", "()I", "getMessageType", "getPosition", "()Ljava/lang/Number;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.z$a */
    public static final class C8439a {
        @NotNull
        /* renamed from: a */
        private final String f29971a;
        /* renamed from: b */
        private final int f29972b;
        @NotNull
        /* renamed from: c */
        private final String f29973c;
        /* renamed from: d */
        private final int f29974d;
        @NotNull
        /* renamed from: e */
        private final String f29975e;
        @Nullable
        /* renamed from: f */
        private final Number f29976f;
        @NotNull
        /* renamed from: g */
        private final String f29977g;
        /* renamed from: h */
        private final boolean f29978h;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C8439a) {
                C8439a c8439a = (C8439a) obj;
                if (C2668g.a(this.f29971a, c8439a.f29971a)) {
                    if ((this.f29972b == c8439a.f29972b ? 1 : null) != null && C2668g.a(this.f29973c, c8439a.f29973c)) {
                        if ((this.f29974d == c8439a.f29974d ? 1 : null) != null && C2668g.a(this.f29975e, c8439a.f29975e) && C2668g.a(this.f29976f, c8439a.f29976f) && C2668g.a(this.f29977g, c8439a.f29977g)) {
                            if ((this.f29978h == c8439a.f29978h ? 1 : null) != null) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }

        public int hashCode() {
            String str = this.f29971a;
            int i = 0;
            int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f29972b) * 31;
            String str2 = this.f29973c;
            hashCode = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f29974d) * 31;
            str2 = this.f29975e;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            Number number = this.f29976f;
            hashCode = (hashCode + (number != null ? number.hashCode() : 0)) * 31;
            str2 = this.f29977g;
            if (str2 != null) {
                i = str2.hashCode();
            }
            hashCode = (hashCode + i) * 31;
            i = this.f29978h;
            if (i != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(matchId=");
            stringBuilder.append(this.f29971a);
            stringBuilder.append(", messageType=");
            stringBuilder.append(this.f29972b);
            stringBuilder.append(", message=");
            stringBuilder.append(this.f29973c);
            stringBuilder.append(", messageIndex=");
            stringBuilder.append(this.f29974d);
            stringBuilder.append(", contentId=");
            stringBuilder.append(this.f29975e);
            stringBuilder.append(", position=");
            stringBuilder.append(this.f29976f);
            stringBuilder.append(", button=");
            stringBuilder.append(this.f29977g);
            stringBuilder.append(", isFeedComment=");
            stringBuilder.append(this.f29978h);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C8439a(@NotNull String str, int i, @NotNull String str2, int i2, @NotNull String str3, @Nullable Number number, @NotNull String str4, boolean z) {
            C2668g.b(str, "matchId");
            C2668g.b(str2, "message");
            C2668g.b(str3, "contentId");
            C2668g.b(str4, AnalyticsConstants.VALUE_SHARE_METHOD_BUTTON);
            this.f29971a = str;
            this.f29972b = i;
            this.f29973c = str2;
            this.f29974d = i2;
            this.f29975e = str3;
            this.f29976f = number;
            this.f29977g = str4;
            this.f29978h = z;
        }

        @NotNull
        /* renamed from: a */
        public final String m36003a() {
            return this.f29971a;
        }

        /* renamed from: b */
        public final int m36004b() {
            return this.f29972b;
        }

        @NotNull
        /* renamed from: c */
        public final String m36005c() {
            return this.f29973c;
        }

        /* renamed from: d */
        public final int m36006d() {
            return this.f29974d;
        }

        @NotNull
        /* renamed from: e */
        public final String m36007e() {
            return this.f29975e;
        }

        @Nullable
        /* renamed from: f */
        public final Number m36008f() {
            return this.f29976f;
        }

        @NotNull
        /* renamed from: g */
        public final String m36009g() {
            return this.f29977g;
        }

        /* renamed from: h */
        public final boolean m36010h() {
            return this.f29978h;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/etl/event/ChatSelectSendErrorOptionsEvent;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.z$b */
    static final class C12709b<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ C10542z f40997a;

        C12709b(C10542z c10542z) {
            this.f40997a = c10542z;
        }

        public /* synthetic */ Object call(Object obj) {
            m50022a((dl) obj);
            return C15813i.f49016a;
        }

        /* renamed from: a */
        public final void m50022a(dl dlVar) {
            this.f40997a.f34283a.a(dlVar);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.z$c */
    static final class C13706c implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C8439a f43567a;

        C13706c(C8439a c8439a) {
            this.f43567a = c8439a;
        }

        public final void call() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ChatSendErrorOptionsEvent logged for matchId: ");
            stringBuilder.append(this.f43567a.m36003a());
            C0001a.b(stringBuilder.toString(), new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.z$d */
    static final class C13707d<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C13707d f43568a = new C13707d();

        C13707d() {
        }

        public /* synthetic */ void call(Object obj) {
            m53245a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53245a(Throwable th) {
            C0001a.c(th, "ChatSendErrorOptionsEventDispatcher failed.", new Object[0]);
        }
    }

    @Inject
    public C10542z(@NotNull C2630h c2630h, @NotNull C10522a c10522a) {
        C2668g.b(c2630h, "fireworks");
        C2668g.b(c10522a, "chatAnalyticsFactory");
        this.f34283a = c2630h;
        this.f34284b = c10522a;
    }

    public /* synthetic */ void execute(Object obj) {
        m42636a((C8439a) obj);
    }

    /* renamed from: a */
    public void m42636a(@NotNull C8439a c8439a) {
        C2668g.b(c8439a, "request");
        this.f34284b.m42542a(c8439a.m36003a(), c8439a.m36004b(), c8439a.m36005c(), c8439a.m36007e(), c8439a.m36006d(), c8439a.m36008f(), c8439a.m36009g(), c8439a.m36010h()).d(new C12709b(this)).b().b(Schedulers.io()).a(new C13706c(c8439a), (Action1) C13707d.f43568a);
    }
}
