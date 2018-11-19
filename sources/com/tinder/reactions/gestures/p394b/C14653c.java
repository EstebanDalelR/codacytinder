package com.tinder.reactions.gestures.p394b;

import com.tinder.chat.view.model.ChatContext;
import com.tinder.chat.view.provider.C8506a;
import com.tinder.deadshot.DeadshotTarget;
import com.tinder.deadshot.Drop;
import com.tinder.deadshot.Take;
import com.tinder.reactions.gestures.target.GrandGestureMatchAvatarTarget;
import com.tinder.utils.RxUtils;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C2668g;
import kotlin.text.C19296q;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.Subscription;
import rx.functions.Action1;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\r\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0002\b\u000fJ\r\u0010\u0010\u001a\u00020\u000eH\u0001¢\u0006\u0002\b\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\b8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/tinder/reactions/gestures/presenter/GrandGestureMatchAvatarPresenter;", "", "chatContextProvider", "Lcom/tinder/chat/view/provider/ChatContextProvider;", "(Lcom/tinder/chat/view/provider/ChatContextProvider;)V", "matchAvatarUrlSubscription", "Lrx/Subscription;", "target", "Lcom/tinder/reactions/gestures/target/GrandGestureMatchAvatarTarget;", "getTarget$Tinder_release", "()Lcom/tinder/reactions/gestures/target/GrandGestureMatchAvatarTarget;", "setTarget$Tinder_release", "(Lcom/tinder/reactions/gestures/target/GrandGestureMatchAvatarTarget;)V", "loadMatchAvatar", "", "loadMatchAvatar$Tinder_release", "unsubscribe", "unsubscribe$Tinder_release", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.gestures.b.c */
public final class C14653c {
    @DeadshotTarget
    @NotNull
    /* renamed from: a */
    public GrandGestureMatchAvatarTarget f46205a;
    /* renamed from: b */
    private Subscription f46206b;
    /* renamed from: c */
    private final C8506a f46207c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "chatContext", "Lcom/tinder/chat/view/model/ChatContext;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.gestures.b.c$a */
    static final class C17981a<T, R> implements Func1<T, R> {
        /* renamed from: a */
        public static final C17981a f55912a = new C17981a();

        C17981a() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m65328a((ChatContext) obj);
        }

        @NotNull
        /* renamed from: a */
        public final String m65328a(ChatContext chatContext) {
            return (String) C19299w.m68829f((List) chatContext.getAvatarUrls());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "url", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.gestures.b.c$b */
    static final class C18739b<T> implements Action1<String> {
        /* renamed from: a */
        final /* synthetic */ C14653c f58229a;

        C18739b(C14653c c14653c) {
            this.f58229a = c14653c;
        }

        public /* synthetic */ void call(Object obj) {
            m67163a((String) obj);
        }

        /* renamed from: a */
        public final void m67163a(String str) {
            C2668g.a(str, "url");
            if ((C19296q.m68673a(str) ^ 1) != 0) {
                this.f58229a.m55868a().showAvatar(str);
            } else {
                this.f58229a.m55868a().showPlaceholderAvatar();
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.gestures.b.c$c */
    static final class C18740c<T> implements Action1<Throwable> {
        /* renamed from: a */
        final /* synthetic */ C14653c f58230a;

        C18740c(C14653c c14653c) {
            this.f58230a = c14653c;
        }

        public /* synthetic */ void call(Object obj) {
            m67164a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m67164a(Throwable th) {
            this.f58230a.m55868a().showPlaceholderAvatar();
            C0001a.c(th, "Failed to get match avatar url", new Object[0]);
        }
    }

    @Inject
    public C14653c(@NotNull C8506a c8506a) {
        C2668g.b(c8506a, "chatContextProvider");
        this.f46207c = c8506a;
    }

    @NotNull
    /* renamed from: a */
    public final GrandGestureMatchAvatarTarget m55868a() {
        GrandGestureMatchAvatarTarget grandGestureMatchAvatarTarget = this.f46205a;
        if (grandGestureMatchAvatarTarget == null) {
            C2668g.b("target");
        }
        return grandGestureMatchAvatarTarget;
    }

    @Take
    /* renamed from: b */
    public final void m55869b() {
        this.f46206b = this.f46207c.a().k(C17981a.f55912a).a(RxUtils.a()).a(new C18739b(this), new C18740c(this));
    }

    @Drop
    /* renamed from: c */
    public final void m55870c() {
        Subscription subscription = this.f46206b;
        if (subscription != null) {
            subscription.unsubscribe();
        }
    }
}
