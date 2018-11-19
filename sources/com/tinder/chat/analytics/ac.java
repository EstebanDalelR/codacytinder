package com.tinder.chat.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.etl.event.dn;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0017\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/chat/analytics/ChatSendMessageErrorEventDispatcher;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "Lcom/tinder/chat/analytics/ChatSendMessageErrorEventDispatcher$Request;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "chatAnalyticsFactory", "Lcom/tinder/chat/analytics/ChatAnalyticsFactory;", "(Lcom/tinder/analytics/fireworks/Fireworks;Lcom/tinder/chat/analytics/ChatAnalyticsFactory;)V", "execute", "", "request", "Request", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class ac implements VoidUseCase<C8416a> {
    /* renamed from: a */
    private final C2630h f34216a;
    /* renamed from: b */
    private final C10522a f34217b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0019\b\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003JS\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0005HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lcom/tinder/chat/analytics/ChatSendMessageErrorEventDispatcher$Request;", "", "matchId", "", "messageType", "", "message", "contentId", "isFeedComment", "", "contentSource", "contentUrl", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "getContentId", "()Ljava/lang/String;", "getContentSource", "getContentUrl", "()Z", "getMatchId", "getMessage", "getMessageType", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.ac$a */
    public static final class C8416a {
        @NotNull
        /* renamed from: a */
        private final String f29867a;
        /* renamed from: b */
        private final int f29868b;
        @NotNull
        /* renamed from: c */
        private final String f29869c;
        @NotNull
        /* renamed from: d */
        private final String f29870d;
        /* renamed from: e */
        private final boolean f29871e;
        @Nullable
        /* renamed from: f */
        private final String f29872f;
        @Nullable
        /* renamed from: g */
        private final String f29873g;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C8416a) {
                C8416a c8416a = (C8416a) obj;
                if (C2668g.a(this.f29867a, c8416a.f29867a)) {
                    if ((this.f29868b == c8416a.f29868b ? 1 : null) != null && C2668g.a(this.f29869c, c8416a.f29869c) && C2668g.a(this.f29870d, c8416a.f29870d)) {
                        return (this.f29871e == c8416a.f29871e ? 1 : null) != null && C2668g.a(this.f29872f, c8416a.f29872f) && C2668g.a(this.f29873g, c8416a.f29873g);
                    }
                }
            }
        }

        public int hashCode() {
            String str = this.f29867a;
            int i = 0;
            int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f29868b) * 31;
            String str2 = this.f29869c;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            str2 = this.f29870d;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            int i2 = this.f29871e;
            if (i2 != 0) {
                i2 = 1;
            }
            hashCode = (hashCode + i2) * 31;
            str2 = this.f29872f;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            str2 = this.f29873g;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(matchId=");
            stringBuilder.append(this.f29867a);
            stringBuilder.append(", messageType=");
            stringBuilder.append(this.f29868b);
            stringBuilder.append(", message=");
            stringBuilder.append(this.f29869c);
            stringBuilder.append(", contentId=");
            stringBuilder.append(this.f29870d);
            stringBuilder.append(", isFeedComment=");
            stringBuilder.append(this.f29871e);
            stringBuilder.append(", contentSource=");
            stringBuilder.append(this.f29872f);
            stringBuilder.append(", contentUrl=");
            stringBuilder.append(this.f29873g);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C8416a(@NotNull String str, int i, @NotNull String str2, @NotNull String str3, boolean z, @Nullable String str4, @Nullable String str5) {
            C2668g.b(str, "matchId");
            C2668g.b(str2, "message");
            C2668g.b(str3, "contentId");
            this.f29867a = str;
            this.f29868b = i;
            this.f29869c = str2;
            this.f29870d = str3;
            this.f29871e = z;
            this.f29872f = str4;
            this.f29873g = str5;
        }

        @NotNull
        /* renamed from: a */
        public final String m35894a() {
            return this.f29867a;
        }

        /* renamed from: b */
        public final int m35895b() {
            return this.f29868b;
        }

        @NotNull
        /* renamed from: c */
        public final String m35896c() {
            return this.f29869c;
        }

        @NotNull
        /* renamed from: d */
        public final String m35897d() {
            return this.f29870d;
        }

        /* renamed from: e */
        public final boolean m35898e() {
            return this.f29871e;
        }

        public /* synthetic */ C8416a(String str, int i, String str2, String str3, boolean z, String str4, String str5, int i2, C15823e c15823e) {
            this(str, i, str2, str3, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? (String) null : str4, (i2 & 64) != 0 ? (String) null : str5);
        }

        @Nullable
        /* renamed from: f */
        public final String m35899f() {
            return this.f29872f;
        }

        @Nullable
        /* renamed from: g */
        public final String m35900g() {
            return this.f29873g;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/etl/event/ChatSendMessageErrorEvent;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.ac$b */
    static final class C12678b<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ ac f40938a;

        C12678b(ac acVar) {
            this.f40938a = acVar;
        }

        public /* synthetic */ Object call(Object obj) {
            m49956a((dn) obj);
            return C15813i.f49016a;
        }

        /* renamed from: a */
        public final void m49956a(dn dnVar) {
            this.f40938a.f34216a.a(dnVar);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.ac$c */
    static final class C13664c implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C8416a f43525a;

        C13664c(C8416a c8416a) {
            this.f43525a = c8416a;
        }

        public final void call() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ChatSendMessageErrorEvent logged for matchId: ");
            stringBuilder.append(this.f43525a.m35894a());
            C0001a.b(stringBuilder.toString(), new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.ac$d */
    static final class C13665d<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C13665d f43526a = new C13665d();

        C13665d() {
        }

        public /* synthetic */ void call(Object obj) {
            m53220a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53220a(Throwable th) {
            C0001a.c(th, "ChatSendMessageErrorEventDispatcher failed.", new Object[0]);
        }
    }

    @Inject
    public ac(@NotNull C2630h c2630h, @NotNull C10522a c10522a) {
        C2668g.b(c2630h, "fireworks");
        C2668g.b(c10522a, "chatAnalyticsFactory");
        this.f34216a = c2630h;
        this.f34217b = c10522a;
    }

    public /* synthetic */ void execute(Object obj) {
        m42565a((C8416a) obj);
    }

    /* renamed from: a */
    public void m42565a(@NotNull C8416a c8416a) {
        C2668g.b(c8416a, "request");
        this.f34217b.m42545a(c8416a.m35894a(), c8416a.m35895b(), c8416a.m35896c(), c8416a.m35897d(), c8416a.m35898e(), c8416a.m35899f(), c8416a.m35900g()).d(new C12678b(this)).b().b(Schedulers.io()).a(new C13664c(c8416a), (Action1) C13665d.f43526a);
    }
}
