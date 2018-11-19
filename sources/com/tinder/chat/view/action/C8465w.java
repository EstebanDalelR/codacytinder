package com.tinder.chat.view.action;

import com.tinder.chat.analytics.C10535m;
import com.tinder.chat.analytics.C10535m.C8432a;
import com.tinder.domain.config.model.ProfileEditingConfig;
import com.tinder.domain.message.usecase.LikeMessage;
import com.tinder.domain.message.usecase.UnLikeMessage;
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

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0002JN\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00142\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000bJ\u000e\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/tinder/chat/view/action/MessageLikingAction;", "", "likeMessage", "Lcom/tinder/domain/message/usecase/LikeMessage;", "unlikeMessage", "Lcom/tinder/domain/message/usecase/UnLikeMessage;", "chatLikeEventDispatcher", "Lcom/tinder/chat/analytics/ChatLikeEventDispatcher;", "(Lcom/tinder/domain/message/usecase/LikeMessage;Lcom/tinder/domain/message/usecase/UnLikeMessage;Lcom/tinder/chat/analytics/ChatLikeEventDispatcher;)V", "likingSubscriptions", "", "", "Lrx/Subscription;", "isSubscribed", "", "messageId", "like", "", "matchId", "messageType", "", "messageText", "contentId", "messageIndex", "contentSource", "contentUrl", "unlike", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.chat.view.action.w */
public final class C8465w {
    /* renamed from: a */
    private final Map<String, Subscription> f30129a = ((Map) new LinkedHashMap());
    /* renamed from: b */
    private final LikeMessage f30130b;
    /* renamed from: c */
    private final UnLikeMessage f30131c;
    /* renamed from: d */
    private final C10535m f30132d;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.view.action.w$a */
    static final class C13738a implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C8465w f43635a;
        /* renamed from: b */
        final /* synthetic */ String f43636b;
        /* renamed from: c */
        final /* synthetic */ int f43637c;
        /* renamed from: d */
        final /* synthetic */ String f43638d;
        /* renamed from: e */
        final /* synthetic */ String f43639e;
        /* renamed from: f */
        final /* synthetic */ int f43640f;
        /* renamed from: g */
        final /* synthetic */ String f43641g;
        /* renamed from: h */
        final /* synthetic */ String f43642h;

        C13738a(C8465w c8465w, String str, int i, String str2, String str3, int i2, String str4, String str5) {
            this.f43635a = c8465w;
            this.f43636b = str;
            this.f43637c = i;
            this.f43638d = str2;
            this.f43639e = str3;
            this.f43640f = i2;
            this.f43641g = str4;
            this.f43642h = str5;
        }

        public final void call() {
            this.f43635a.f30132d.m42622a(new C8432a(this.f43636b, this.f43637c, this.f43638d, this.f43639e, this.f43640f, this.f43641g, this.f43642h));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.view.action.w$b */
    static final class C13739b<T> implements Action1<Throwable> {
        /* renamed from: a */
        final /* synthetic */ String f43643a;

        C13739b(String str) {
            this.f43643a = str;
        }

        public /* synthetic */ void call(Object obj) {
            m53266a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53266a(Throwable th) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unable to like message: ");
            stringBuilder.append(this.f43643a);
            C0001a.b(th, stringBuilder.toString(), new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.view.action.w$c */
    static final class C13740c implements Action0 {
        /* renamed from: a */
        public static final C13740c f43644a = new C13740c();

        C13740c() {
        }

        public final void call() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.view.action.w$d */
    static final class C13741d<T> implements Action1<Throwable> {
        /* renamed from: a */
        final /* synthetic */ String f43645a;

        C13741d(String str) {
            this.f43645a = str;
        }

        public /* synthetic */ void call(Object obj) {
            m53267a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53267a(Throwable th) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unable to unlike message: ");
            stringBuilder.append(this.f43645a);
            C0001a.b(th, stringBuilder.toString(), new Object[0]);
        }
    }

    @Inject
    public C8465w(@NotNull LikeMessage likeMessage, @NotNull UnLikeMessage unLikeMessage, @NotNull C10535m c10535m) {
        C2668g.b(likeMessage, "likeMessage");
        C2668g.b(unLikeMessage, "unlikeMessage");
        C2668g.b(c10535m, "chatLikeEventDispatcher");
        this.f30130b = likeMessage;
        this.f30131c = unLikeMessage;
        this.f30132d = c10535m;
    }

    /* renamed from: a */
    public static /* synthetic */ void m36209a(C8465w c8465w, String str, String str2, int i, String str3, String str4, int i2, String str5, String str6, int i3, Object obj) {
        int i4 = i3;
        c8465w.m36212a(str, str2, i, str3, str4, i2, (i4 & 64) != 0 ? (String) null : str5, (i4 & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0 ? (String) null : str6);
    }

    /* renamed from: a */
    public final void m36212a(@NotNull String str, @NotNull String str2, int i, @NotNull String str3, @NotNull String str4, int i2, @Nullable String str5, @Nullable String str6) {
        String str7 = str;
        C2668g.b(str7, "messageId");
        String str8 = str2;
        C2668g.b(str8, "matchId");
        String str9 = str3;
        C2668g.b(str9, "messageText");
        String str10 = str4;
        C2668g.b(str10, "contentId");
        if (!m36210b(str7)) {
            Map map = r9.f30129a;
            Subscription a = r9.f30130b.execute(str7).b(Schedulers.io()).a(new C13738a(r9, str8, i, str9, str10, i2, str5, str6), new C13739b(str7));
            C2668g.a(a, "likeMessage.execute(mess…geId\")\n                })");
            map.put(str7, a);
        }
    }

    /* renamed from: a */
    public final void m36211a(@NotNull String str) {
        C2668g.b(str, "messageId");
        if (!m36210b(str)) {
            Map map = this.f30129a;
            Subscription a = this.f30131c.execute(str).b(Schedulers.io()).a(C13740c.f43644a, new C13741d(str));
            C2668g.a(a, "unlikeMessage.execute(me…geId\")\n                })");
            map.put(str, a);
        }
    }

    /* renamed from: b */
    private final boolean m36210b(String str) {
        Subscription subscription = (Subscription) this.f30129a.get(str);
        return (subscription == null || subscription.isUnsubscribed() != null) ? null : true;
    }
}
