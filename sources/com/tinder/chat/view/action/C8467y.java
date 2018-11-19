package com.tinder.chat.view.action;

import com.tinder.chat.analytics.ad;
import com.tinder.chat.analytics.ad.C8417a;
import com.tinder.domain.message.usecase.ResendFailedMessage;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;
import rx.Subscription;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0002J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/tinder/chat/view/action/MessageRetryAction;", "", "resendFailedMessage", "Lcom/tinder/domain/message/usecase/ResendFailedMessage;", "chatSendMessageEventDispatcher", "Lcom/tinder/chat/analytics/ChatSendMessageEventDispatcher;", "(Lcom/tinder/domain/message/usecase/ResendFailedMessage;Lcom/tinder/chat/analytics/ChatSendMessageEventDispatcher;)V", "retrySubscriptions", "", "", "Lrx/Subscription;", "isSubscribed", "", "messageId", "retry", "", "request", "Lcom/tinder/chat/view/action/MessageRetryAction$Request;", "Request", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.chat.view.action.y */
public final class C8467y {
    /* renamed from: a */
    private final Map<String, Subscription> f30141a = ((Map) new LinkedHashMap());
    /* renamed from: b */
    private final ResendFailedMessage f30142b;
    /* renamed from: c */
    private final ad f30143c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J]\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0007HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006%"}, d2 = {"Lcom/tinder/chat/view/action/MessageRetryAction$Request;", "", "messageId", "", "matchId", "messageText", "messageType", "", "contentId", "sendFrom", "contentSource", "contentUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getContentId", "()Ljava/lang/String;", "getContentSource", "getContentUrl", "getMatchId", "getMessageId", "getMessageText", "getMessageType", "()I", "getSendFrom", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.view.action.y$a */
    public static final class C8466a {
        @NotNull
        /* renamed from: a */
        private final String f30133a;
        @NotNull
        /* renamed from: b */
        private final String f30134b;
        @NotNull
        /* renamed from: c */
        private final String f30135c;
        /* renamed from: d */
        private final int f30136d;
        @NotNull
        /* renamed from: e */
        private final String f30137e;
        @NotNull
        /* renamed from: f */
        private final String f30138f;
        @Nullable
        /* renamed from: g */
        private final String f30139g;
        @Nullable
        /* renamed from: h */
        private final String f30140h;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C8466a) {
                C8466a c8466a = (C8466a) obj;
                if (C2668g.a(this.f30133a, c8466a.f30133a) && C2668g.a(this.f30134b, c8466a.f30134b) && C2668g.a(this.f30135c, c8466a.f30135c)) {
                    return (this.f30136d == c8466a.f30136d ? 1 : null) != null && C2668g.a(this.f30137e, c8466a.f30137e) && C2668g.a(this.f30138f, c8466a.f30138f) && C2668g.a(this.f30139g, c8466a.f30139g) && C2668g.a(this.f30140h, c8466a.f30140h);
                }
            }
        }

        public int hashCode() {
            String str = this.f30133a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f30134b;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            str2 = this.f30135c;
            hashCode = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f30136d) * 31;
            str2 = this.f30137e;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            str2 = this.f30138f;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            str2 = this.f30139g;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            str2 = this.f30140h;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(messageId=");
            stringBuilder.append(this.f30133a);
            stringBuilder.append(", matchId=");
            stringBuilder.append(this.f30134b);
            stringBuilder.append(", messageText=");
            stringBuilder.append(this.f30135c);
            stringBuilder.append(", messageType=");
            stringBuilder.append(this.f30136d);
            stringBuilder.append(", contentId=");
            stringBuilder.append(this.f30137e);
            stringBuilder.append(", sendFrom=");
            stringBuilder.append(this.f30138f);
            stringBuilder.append(", contentSource=");
            stringBuilder.append(this.f30139g);
            stringBuilder.append(", contentUrl=");
            stringBuilder.append(this.f30140h);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C8466a(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, @NotNull String str4, @NotNull String str5, @Nullable String str6, @Nullable String str7) {
            C2668g.b(str, "messageId");
            C2668g.b(str2, "matchId");
            C2668g.b(str3, "messageText");
            C2668g.b(str4, "contentId");
            C2668g.b(str5, "sendFrom");
            this.f30133a = str;
            this.f30134b = str2;
            this.f30135c = str3;
            this.f30136d = i;
            this.f30137e = str4;
            this.f30138f = str5;
            this.f30139g = str6;
            this.f30140h = str7;
        }

        @NotNull
        /* renamed from: a */
        public final String m36213a() {
            return this.f30133a;
        }

        @NotNull
        /* renamed from: b */
        public final String m36214b() {
            return this.f30134b;
        }

        @NotNull
        /* renamed from: c */
        public final String m36215c() {
            return this.f30135c;
        }

        /* renamed from: d */
        public final int m36216d() {
            return this.f30136d;
        }

        @NotNull
        /* renamed from: e */
        public final String m36217e() {
            return this.f30137e;
        }

        @NotNull
        /* renamed from: f */
        public final String m36218f() {
            return this.f30138f;
        }

        @Nullable
        /* renamed from: g */
        public final String m36219g() {
            return this.f30139g;
        }

        @Nullable
        /* renamed from: h */
        public final String m36220h() {
            return this.f30140h;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.view.action.y$b */
    static final class C13742b implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C8467y f43646a;
        /* renamed from: b */
        final /* synthetic */ C8466a f43647b;

        C13742b(C8467y c8467y, C8466a c8466a) {
            this.f43646a = c8467y;
            this.f43647b = c8466a;
        }

        public final void call() {
            this.f43646a.f30143c.m42567a(new C8417a(this.f43647b.m36214b(), this.f43647b.m36215c(), this.f43647b.m36216d(), this.f43647b.m36217e(), this.f43647b.m36218f(), true, false, this.f43647b.m36219g(), this.f43647b.m36220h(), 64, null));
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Retried message: ");
            stringBuilder.append(this.f43647b.m36213a());
            C0001a.b(stringBuilder.toString(), new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.view.action.y$c */
    static final class C13743c<T> implements Action1<Throwable> {
        /* renamed from: a */
        final /* synthetic */ C8466a f43648a;

        C13743c(C8466a c8466a) {
            this.f43648a = c8466a;
        }

        public /* synthetic */ void call(Object obj) {
            m53268a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53268a(Throwable th) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error retrying message: ");
            stringBuilder.append(this.f43648a.m36213a());
            C0001a.b(th, stringBuilder.toString(), new Object[0]);
        }
    }

    @Inject
    public C8467y(@NotNull ResendFailedMessage resendFailedMessage, @NotNull ad adVar) {
        C2668g.b(resendFailedMessage, "resendFailedMessage");
        C2668g.b(adVar, "chatSendMessageEventDispatcher");
        this.f30142b = resendFailedMessage;
        this.f30143c = adVar;
    }

    /* renamed from: a */
    public final void m36223a(@NotNull C8466a c8466a) {
        C2668g.b(c8466a, "request");
        if (!m36222a(c8466a.m36213a())) {
            Map map = this.f30141a;
            String a = c8466a.m36213a();
            c8466a = this.f30142b.execute(c8466a.m36213a()).b(Schedulers.io()).a(new C13742b(this, c8466a), new C13743c(c8466a));
            C2668g.a(c8466a, "resendFailedMessage.exec…eId}\")\n                })");
            map.put(a, c8466a);
        }
    }

    /* renamed from: a */
    private final boolean m36222a(String str) {
        Subscription subscription = (Subscription) this.f30141a.get(str);
        return (subscription == null || subscription.isUnsubscribed() != null) ? null : true;
    }
}
