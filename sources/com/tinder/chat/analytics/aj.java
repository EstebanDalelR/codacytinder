package com.tinder.chat.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.domain.config.model.ProfileEditingConfig;
import com.tinder.etl.event.dr;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0017\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/chat/analytics/ChatTapMessageEventDispatcher;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "Lcom/tinder/chat/analytics/ChatTapMessageEventDispatcher$Request;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "chatAnalyticsFactory", "Lcom/tinder/chat/analytics/ChatAnalyticsFactory;", "(Lcom/tinder/analytics/fireworks/Fireworks;Lcom/tinder/chat/analytics/ChatAnalyticsFactory;)V", "execute", "", "request", "Request", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class aj implements VoidUseCase<C8420a> {
    /* renamed from: a */
    private final C2630h f34224a;
    /* renamed from: b */
    private final C10522a f34225b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J]\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0005HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017¨\u0006'"}, d2 = {"Lcom/tinder/chat/analytics/ChatTapMessageEventDispatcher$Request;", "", "matchId", "", "messageType", "", "message", "contentId", "messageIndex", "messageAction", "Lcom/tinder/chat/analytics/MessageAction;", "contentSource", "contentUrl", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILcom/tinder/chat/analytics/MessageAction;Ljava/lang/String;Ljava/lang/String;)V", "getContentId", "()Ljava/lang/String;", "getContentSource", "getContentUrl", "getMatchId", "getMessage", "getMessageAction", "()Lcom/tinder/chat/analytics/MessageAction;", "getMessageIndex", "()I", "getMessageType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.aj$a */
    public static final class C8420a {
        @NotNull
        /* renamed from: a */
        private final String f29889a;
        /* renamed from: b */
        private final int f29890b;
        @NotNull
        /* renamed from: c */
        private final String f29891c;
        @NotNull
        /* renamed from: d */
        private final String f29892d;
        /* renamed from: e */
        private final int f29893e;
        @NotNull
        /* renamed from: f */
        private final MessageAction f29894f;
        @Nullable
        /* renamed from: g */
        private final String f29895g;
        @Nullable
        /* renamed from: h */
        private final String f29896h;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C8420a) {
                C8420a c8420a = (C8420a) obj;
                if (C2668g.a(this.f29889a, c8420a.f29889a)) {
                    if ((this.f29890b == c8420a.f29890b ? 1 : null) != null && C2668g.a(this.f29891c, c8420a.f29891c) && C2668g.a(this.f29892d, c8420a.f29892d)) {
                        return (this.f29893e == c8420a.f29893e ? 1 : null) != null && C2668g.a(this.f29894f, c8420a.f29894f) && C2668g.a(this.f29895g, c8420a.f29895g) && C2668g.a(this.f29896h, c8420a.f29896h);
                    }
                }
            }
        }

        public int hashCode() {
            String str = this.f29889a;
            int i = 0;
            int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f29890b) * 31;
            String str2 = this.f29891c;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            str2 = this.f29892d;
            hashCode = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f29893e) * 31;
            MessageAction messageAction = this.f29894f;
            hashCode = (hashCode + (messageAction != null ? messageAction.hashCode() : 0)) * 31;
            str2 = this.f29895g;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            str2 = this.f29896h;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(matchId=");
            stringBuilder.append(this.f29889a);
            stringBuilder.append(", messageType=");
            stringBuilder.append(this.f29890b);
            stringBuilder.append(", message=");
            stringBuilder.append(this.f29891c);
            stringBuilder.append(", contentId=");
            stringBuilder.append(this.f29892d);
            stringBuilder.append(", messageIndex=");
            stringBuilder.append(this.f29893e);
            stringBuilder.append(", messageAction=");
            stringBuilder.append(this.f29894f);
            stringBuilder.append(", contentSource=");
            stringBuilder.append(this.f29895g);
            stringBuilder.append(", contentUrl=");
            stringBuilder.append(this.f29896h);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C8420a(@NotNull String str, int i, @NotNull String str2, @NotNull String str3, int i2, @NotNull MessageAction messageAction, @Nullable String str4, @Nullable String str5) {
            C2668g.b(str, "matchId");
            C2668g.b(str2, "message");
            C2668g.b(str3, "contentId");
            C2668g.b(messageAction, "messageAction");
            this.f29889a = str;
            this.f29890b = i;
            this.f29891c = str2;
            this.f29892d = str3;
            this.f29893e = i2;
            this.f29894f = messageAction;
            this.f29895g = str4;
            this.f29896h = str5;
        }

        @NotNull
        /* renamed from: a */
        public final String m35916a() {
            return this.f29889a;
        }

        /* renamed from: b */
        public final int m35917b() {
            return this.f29890b;
        }

        @NotNull
        /* renamed from: c */
        public final String m35918c() {
            return this.f29891c;
        }

        @NotNull
        /* renamed from: d */
        public final String m35919d() {
            return this.f29892d;
        }

        /* renamed from: e */
        public final int m35920e() {
            return this.f29893e;
        }

        public /* synthetic */ C8420a(String str, int i, String str2, String str3, int i2, MessageAction messageAction, String str4, String str5, int i3, C15823e c15823e) {
            int i4 = i3;
            this(str, i, (i4 & 4) != 0 ? "" : str2, str3, i2, (i4 & 32) != 0 ? MessageAction.NONE : messageAction, (i4 & 64) != 0 ? (String) null : str4, (i4 & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0 ? (String) null : str5);
        }

        @NotNull
        /* renamed from: f */
        public final MessageAction m35921f() {
            return this.f29894f;
        }

        @Nullable
        /* renamed from: g */
        public final String m35922g() {
            return this.f29895g;
        }

        @Nullable
        /* renamed from: h */
        public final String m35923h() {
            return this.f29896h;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/etl/event/ChatTapMessageEvent;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.aj$b */
    static final class C12682b<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ aj f40948a;

        C12682b(aj ajVar) {
            this.f40948a = ajVar;
        }

        public /* synthetic */ Object call(Object obj) {
            m49969a((dr) obj);
            return C15813i.f49016a;
        }

        /* renamed from: a */
        public final void m49969a(dr drVar) {
            this.f40948a.f34224a.a(drVar);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "call", "(Lkotlin/Unit;)V"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.aj$c */
    static final class C13672c<T> implements Action1<C15813i> {
        /* renamed from: a */
        final /* synthetic */ C8420a f43533a;

        C13672c(C8420a c8420a) {
            this.f43533a = c8420a;
        }

        public /* synthetic */ void call(Object obj) {
            m53224a((C15813i) obj);
        }

        /* renamed from: a */
        public final void m53224a(C15813i c15813i) {
            c15813i = new StringBuilder();
            c15813i.append("ChatTapMessageEvent logged for matchId: ");
            c15813i.append(this.f43533a.m35916a());
            C0001a.b(c15813i.toString(), new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.aj$d */
    static final class C13673d<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C13673d f43534a = new C13673d();

        C13673d() {
        }

        public /* synthetic */ void call(Object obj) {
            m53225a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53225a(Throwable th) {
            C0001a.c(th, "ChatTapMessageEventDispatcher failed.", new Object[0]);
        }
    }

    @Inject
    public aj(@NotNull C2630h c2630h, @NotNull C10522a c10522a) {
        C2668g.b(c2630h, "fireworks");
        C2668g.b(c10522a, "chatAnalyticsFactory");
        this.f34224a = c2630h;
        this.f34225b = c10522a;
    }

    public /* synthetic */ void execute(Object obj) {
        m42573a((C8420a) obj);
    }

    /* renamed from: a */
    public void m42573a(@NotNull C8420a c8420a) {
        C2668g.b(c8420a, "request");
        this.f34225b.m42541a(c8420a.m35916a(), c8420a.m35917b(), c8420a.m35918c(), c8420a.m35919d(), c8420a.m35920e(), c8420a.m35921f(), c8420a.m35922g(), c8420a.m35923h()).d(new C12682b(this)).b(Schedulers.io()).a(new C13672c(c8420a), (Action1) C13673d.f43534a);
    }
}
