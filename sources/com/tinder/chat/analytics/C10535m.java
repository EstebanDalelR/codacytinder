package com.tinder.chat.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.etl.event.db;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0017\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/chat/analytics/ChatLikeEventDispatcher;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "Lcom/tinder/chat/analytics/ChatLikeEventDispatcher$Request;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "chatAnalyticsFactory", "Lcom/tinder/chat/analytics/ChatAnalyticsFactory;", "(Lcom/tinder/analytics/fireworks/Fireworks;Lcom/tinder/chat/analytics/ChatAnalyticsFactory;)V", "execute", "", "request", "Request", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.chat.analytics.m */
public final class C10535m implements VoidUseCase<C8432a> {
    /* renamed from: a */
    private final C2630h f34269a;
    /* renamed from: b */
    private final C10522a f34270b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003JS\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0005HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012¨\u0006\""}, d2 = {"Lcom/tinder/chat/analytics/ChatLikeEventDispatcher$Request;", "", "matchId", "", "messageType", "", "messageText", "contentId", "messageIndex", "contentSource", "contentUrl", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getContentId", "()Ljava/lang/String;", "getContentSource", "getContentUrl", "getMatchId", "getMessageIndex", "()I", "getMessageText", "getMessageType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.m$a */
    public static final class C8432a {
        @NotNull
        /* renamed from: a */
        private final String f29933a;
        /* renamed from: b */
        private final int f29934b;
        @NotNull
        /* renamed from: c */
        private final String f29935c;
        @NotNull
        /* renamed from: d */
        private final String f29936d;
        /* renamed from: e */
        private final int f29937e;
        @Nullable
        /* renamed from: f */
        private final String f29938f;
        @Nullable
        /* renamed from: g */
        private final String f29939g;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C8432a) {
                C8432a c8432a = (C8432a) obj;
                if (C2668g.a(this.f29933a, c8432a.f29933a)) {
                    if ((this.f29934b == c8432a.f29934b ? 1 : null) != null && C2668g.a(this.f29935c, c8432a.f29935c) && C2668g.a(this.f29936d, c8432a.f29936d)) {
                        return (this.f29937e == c8432a.f29937e ? 1 : null) != null && C2668g.a(this.f29938f, c8432a.f29938f) && C2668g.a(this.f29939g, c8432a.f29939g);
                    }
                }
            }
        }

        public int hashCode() {
            String str = this.f29933a;
            int i = 0;
            int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f29934b) * 31;
            String str2 = this.f29935c;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            str2 = this.f29936d;
            hashCode = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f29937e) * 31;
            str2 = this.f29938f;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            str2 = this.f29939g;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(matchId=");
            stringBuilder.append(this.f29933a);
            stringBuilder.append(", messageType=");
            stringBuilder.append(this.f29934b);
            stringBuilder.append(", messageText=");
            stringBuilder.append(this.f29935c);
            stringBuilder.append(", contentId=");
            stringBuilder.append(this.f29936d);
            stringBuilder.append(", messageIndex=");
            stringBuilder.append(this.f29937e);
            stringBuilder.append(", contentSource=");
            stringBuilder.append(this.f29938f);
            stringBuilder.append(", contentUrl=");
            stringBuilder.append(this.f29939g);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C8432a(@NotNull String str, int i, @NotNull String str2, @NotNull String str3, int i2, @Nullable String str4, @Nullable String str5) {
            C2668g.b(str, "matchId");
            C2668g.b(str2, "messageText");
            C2668g.b(str3, "contentId");
            this.f29933a = str;
            this.f29934b = i;
            this.f29935c = str2;
            this.f29936d = str3;
            this.f29937e = i2;
            this.f29938f = str4;
            this.f29939g = str5;
        }

        @NotNull
        /* renamed from: a */
        public final String m35965a() {
            return this.f29933a;
        }

        /* renamed from: b */
        public final int m35966b() {
            return this.f29934b;
        }

        @NotNull
        /* renamed from: c */
        public final String m35967c() {
            return this.f29935c;
        }

        @NotNull
        /* renamed from: d */
        public final String m35968d() {
            return this.f29936d;
        }

        /* renamed from: e */
        public final int m35969e() {
            return this.f29937e;
        }

        @Nullable
        /* renamed from: f */
        public final String m35970f() {
            return this.f29938f;
        }

        @Nullable
        /* renamed from: g */
        public final String m35971g() {
            return this.f29939g;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/etl/event/ChatLikeEvent;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.m$b */
    static final class C12696b<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ C10535m f40978a;

        C12696b(C10535m c10535m) {
            this.f40978a = c10535m;
        }

        public /* synthetic */ Object call(Object obj) {
            m49997a((db) obj);
            return C15813i.f49016a;
        }

        /* renamed from: a */
        public final void m49997a(db dbVar) {
            this.f40978a.f34269a.a(dbVar);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "call", "(Lkotlin/Unit;)V"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.m$c */
    static final class C13692c<T> implements Action1<C15813i> {
        /* renamed from: a */
        final /* synthetic */ C8432a f43553a;

        C13692c(C8432a c8432a) {
            this.f43553a = c8432a;
        }

        public /* synthetic */ void call(Object obj) {
            m53235a((C15813i) obj);
        }

        /* renamed from: a */
        public final void m53235a(C15813i c15813i) {
            c15813i = new StringBuilder();
            c15813i.append("ChatLikeEvent logged for matchId: ");
            c15813i.append(this.f43553a.m35965a());
            C0001a.b(c15813i.toString(), new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.m$d */
    static final class C13693d<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C13693d f43554a = new C13693d();

        C13693d() {
        }

        public /* synthetic */ void call(Object obj) {
            m53236a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53236a(Throwable th) {
            C0001a.c(th, "ChatLikeEventDispatcher failed.", new Object[0]);
        }
    }

    @Inject
    public C10535m(@NotNull C2630h c2630h, @NotNull C10522a c10522a) {
        C2668g.b(c2630h, "fireworks");
        C2668g.b(c10522a, "chatAnalyticsFactory");
        this.f34269a = c2630h;
        this.f34270b = c10522a;
    }

    public /* synthetic */ void execute(Object obj) {
        m42622a((C8432a) obj);
    }

    /* renamed from: a */
    public void m42622a(@NotNull C8432a c8432a) {
        C2668g.b(c8432a, "request");
        this.f34270b.m42543a(c8432a.m35965a(), c8432a.m35966b(), c8432a.m35967c(), c8432a.m35968d(), c8432a.m35969e(), c8432a.m35970f(), c8432a.m35971g()).d(new C12696b(this)).b(Schedulers.io()).a(new C13692c(c8432a), (Action1) C13693d.f43554a);
    }
}
