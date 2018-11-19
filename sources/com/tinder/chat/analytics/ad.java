package com.tinder.chat.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.domain.config.model.ProfileEditingConfig;
import com.tinder.etl.event.C11263do;
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

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0017\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/chat/analytics/ChatSendMessageEventDispatcher;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "Lcom/tinder/chat/analytics/ChatSendMessageEventDispatcher$Request;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "chatAnalyticsFactory", "Lcom/tinder/chat/analytics/ChatAnalyticsFactory;", "(Lcom/tinder/analytics/fireworks/Fireworks;Lcom/tinder/chat/analytics/ChatAnalyticsFactory;)V", "execute", "", "request", "Request", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class ad implements VoidUseCase<C8417a> {
    /* renamed from: a */
    private final C2630h f34218a;
    /* renamed from: b */
    private final C10522a f34219b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001d\b\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jg\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010#\u001a\u00020\n2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0006HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010¨\u0006'"}, d2 = {"Lcom/tinder/chat/analytics/ChatSendMessageEventDispatcher$Request;", "", "matchId", "", "messageText", "messageType", "", "contentId", "sendFrom", "isRetry", "", "isFeedComment", "contentSource", "contentUrl", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;)V", "getContentId", "()Ljava/lang/String;", "getContentSource", "getContentUrl", "()Z", "getMatchId", "getMessageText", "getMessageType", "()I", "getSendFrom", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.ad$a */
    public static final class C8417a {
        @NotNull
        /* renamed from: a */
        private final String f29874a;
        @NotNull
        /* renamed from: b */
        private final String f29875b;
        /* renamed from: c */
        private final int f29876c;
        @NotNull
        /* renamed from: d */
        private final String f29877d;
        @NotNull
        /* renamed from: e */
        private final String f29878e;
        /* renamed from: f */
        private final boolean f29879f;
        /* renamed from: g */
        private final boolean f29880g;
        @Nullable
        /* renamed from: h */
        private final String f29881h;
        @Nullable
        /* renamed from: i */
        private final String f29882i;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C8417a) {
                C8417a c8417a = (C8417a) obj;
                if (C2668g.a(this.f29874a, c8417a.f29874a) && C2668g.a(this.f29875b, c8417a.f29875b)) {
                    if ((this.f29876c == c8417a.f29876c ? 1 : null) != null && C2668g.a(this.f29877d, c8417a.f29877d) && C2668g.a(this.f29878e, c8417a.f29878e)) {
                        if ((this.f29879f == c8417a.f29879f ? 1 : null) != null) {
                            return (this.f29880g == c8417a.f29880g ? 1 : null) != null && C2668g.a(this.f29881h, c8417a.f29881h) && C2668g.a(this.f29882i, c8417a.f29882i);
                        }
                    }
                }
            }
        }

        public int hashCode() {
            String str = this.f29874a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f29875b;
            hashCode = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f29876c) * 31;
            str2 = this.f29877d;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            str2 = this.f29878e;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            int i2 = this.f29879f;
            if (i2 != 0) {
                i2 = 1;
            }
            hashCode = (hashCode + i2) * 31;
            i2 = this.f29880g;
            if (i2 != 0) {
                i2 = 1;
            }
            hashCode = (hashCode + i2) * 31;
            str2 = this.f29881h;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            str2 = this.f29882i;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(matchId=");
            stringBuilder.append(this.f29874a);
            stringBuilder.append(", messageText=");
            stringBuilder.append(this.f29875b);
            stringBuilder.append(", messageType=");
            stringBuilder.append(this.f29876c);
            stringBuilder.append(", contentId=");
            stringBuilder.append(this.f29877d);
            stringBuilder.append(", sendFrom=");
            stringBuilder.append(this.f29878e);
            stringBuilder.append(", isRetry=");
            stringBuilder.append(this.f29879f);
            stringBuilder.append(", isFeedComment=");
            stringBuilder.append(this.f29880g);
            stringBuilder.append(", contentSource=");
            stringBuilder.append(this.f29881h);
            stringBuilder.append(", contentUrl=");
            stringBuilder.append(this.f29882i);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C8417a(@NotNull String str, @NotNull String str2, int i, @NotNull String str3, @NotNull String str4, boolean z, boolean z2, @Nullable String str5, @Nullable String str6) {
            C2668g.b(str, "matchId");
            C2668g.b(str2, "messageText");
            C2668g.b(str3, "contentId");
            C2668g.b(str4, "sendFrom");
            this.f29874a = str;
            this.f29875b = str2;
            this.f29876c = i;
            this.f29877d = str3;
            this.f29878e = str4;
            this.f29879f = z;
            this.f29880g = z2;
            this.f29881h = str5;
            this.f29882i = str6;
        }

        @NotNull
        /* renamed from: a */
        public final String m35901a() {
            return this.f29874a;
        }

        @NotNull
        /* renamed from: b */
        public final String m35902b() {
            return this.f29875b;
        }

        /* renamed from: c */
        public final int m35903c() {
            return this.f29876c;
        }

        @NotNull
        /* renamed from: d */
        public final String m35904d() {
            return this.f29877d;
        }

        @NotNull
        /* renamed from: e */
        public final String m35905e() {
            return this.f29878e;
        }

        /* renamed from: f */
        public final boolean m35906f() {
            return this.f29879f;
        }

        /* renamed from: g */
        public final boolean m35907g() {
            return this.f29880g;
        }

        public /* synthetic */ C8417a(String str, String str2, int i, String str3, String str4, boolean z, boolean z2, String str5, String str6, int i2, C15823e c15823e) {
            int i3 = i2;
            this(str, str2, i, str3, str4, (i3 & 32) != 0 ? false : z, (i3 & 64) != 0 ? false : z2, (i3 & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0 ? (String) null : str5, (i3 & 256) != 0 ? (String) null : str6);
        }

        @Nullable
        /* renamed from: h */
        public final String m35908h() {
            return this.f29881h;
        }

        @Nullable
        /* renamed from: i */
        public final String m35909i() {
            return this.f29882i;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/etl/event/ChatSendMessageEvent;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.ad$b */
    static final class C12679b<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ ad f40939a;

        C12679b(ad adVar) {
            this.f40939a = adVar;
        }

        public /* synthetic */ Object call(Object obj) {
            m49957a((C11263do) obj);
            return C15813i.f49016a;
        }

        /* renamed from: a */
        public final void m49957a(C11263do c11263do) {
            this.f40939a.f34218a.a(c11263do);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.ad$c */
    static final class C13666c implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C8417a f43527a;

        C13666c(C8417a c8417a) {
            this.f43527a = c8417a;
        }

        public final void call() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ChatSendMessageEvent logged for matchId: ");
            stringBuilder.append(this.f43527a.m35901a());
            C0001a.b(stringBuilder.toString(), new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.ad$d */
    static final class C13667d<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C13667d f43528a = new C13667d();

        C13667d() {
        }

        public /* synthetic */ void call(Object obj) {
            m53221a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53221a(Throwable th) {
            C0001a.c(th, "ChatSendMessageEventDispatcher failed.", new Object[0]);
        }
    }

    @Inject
    public ad(@NotNull C2630h c2630h, @NotNull C10522a c10522a) {
        C2668g.b(c2630h, "fireworks");
        C2668g.b(c10522a, "chatAnalyticsFactory");
        this.f34218a = c2630h;
        this.f34219b = c10522a;
    }

    public /* synthetic */ void execute(Object obj) {
        m42567a((C8417a) obj);
    }

    /* renamed from: a */
    public void m42567a(@NotNull C8417a c8417a) {
        C2668g.b(c8417a, "request");
        this.f34219b.m42551a(c8417a.m35901a(), c8417a.m35902b(), c8417a.m35903c(), c8417a.m35904d(), c8417a.m35905e(), c8417a.m35906f(), c8417a.m35907g(), c8417a.m35908h(), c8417a.m35909i()).d(new C12679b(this)).b().b(Schedulers.io()).a(new C13666c(c8417a), (Action1) C13667d.f43528a);
    }
}
