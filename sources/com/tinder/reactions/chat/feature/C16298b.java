package com.tinder.reactions.chat.feature;

import com.jakewharton.rxbinding.view.C5707b;
import com.tinder.chat.injection.scope.ChatActivityScope;
import com.tinder.chat.target.ChatInputBoxGifSelector;
import com.tinder.chat.view.provider.C8507f;
import com.tinder.common.view.extension.C8587g;
import com.tinder.deadshot.Deadshot;
import com.tinder.reactions.chat.p386a.C14599c;
import com.tinder.reactions.chat.presenter.C14603a;
import com.tinder.reactions.chat.target.ExpandReactionDrawerFeatureTarget;
import com.tinder.reactions.chat.view.ChatInputExpandButtonView;
import com.tinder.reactions.common.feature.FeatureLifecycle;
import com.tinder.reactions.common.utils.C14616a;
import com.tinder.reactions.drawer.mediator.C14629b;
import com.tinder.reactions.drawer.provider.C14637a;
import com.tinder.reactions.drawer.provider.C14639g;
import com.tinder.reactions.drawer.view.ChatInputEditText;
import com.tinder.reactions.drawer.view.ReactionDrawer;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.Observable;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.p494a.p496b.C19397a;
import rx.p500e.C19573b;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B7\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u000e\u00102\u001a\b\u0012\u0004\u0012\u00020403H\u0002J\b\u00105\u001a\u000204H\u0016J\b\u00106\u001a\u000204H\u0016J\b\u00107\u001a\u000204H\u0002J\b\u00108\u001a\u000204H\u0016J\b\u00109\u001a\u000204H\u0016J\b\u0010:\u001a\u000204H\u0016R\u001a\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u00020\u0017X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u000e\u0010 \u001a\u00020!X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\"\u001a\u00020#X.¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010*\u001a\u00020+X.¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0014\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101¨\u0006;"}, d2 = {"Lcom/tinder/reactions/chat/feature/ExpandReactionDrawerFromChatInputFeature;", "Lcom/tinder/reactions/common/feature/FeatureLifecycle;", "Lcom/tinder/reactions/chat/target/ExpandReactionDrawerFeatureTarget;", "presenter", "Lcom/tinder/reactions/chat/presenter/ExpandReactionDrawerFromChatInputPresenter;", "expandButtonViewProvider", "Lcom/tinder/reactions/chat/provider/ChatInputExpandButtonViewProvider;", "reactionDrawerProvider", "Lcom/tinder/reactions/drawer/provider/ReactionDrawerProvider;", "chatInputEditTextProvider", "Lcom/tinder/reactions/drawer/provider/ChatInputEditTextProvider;", "chatInputGifSelectorProvider", "Lcom/tinder/chat/view/provider/ChatInputGifSelectorProvider;", "chatInputDelegate", "Lcom/tinder/reactions/drawer/mediator/ChatInputStateDelegate;", "(Lcom/tinder/reactions/chat/presenter/ExpandReactionDrawerFromChatInputPresenter;Lcom/tinder/reactions/chat/provider/ChatInputExpandButtonViewProvider;Lcom/tinder/reactions/drawer/provider/ReactionDrawerProvider;Lcom/tinder/reactions/drawer/provider/ChatInputEditTextProvider;Lcom/tinder/chat/view/provider/ChatInputGifSelectorProvider;Lcom/tinder/reactions/drawer/mediator/ChatInputStateDelegate;)V", "chatInputBoxGifSelector", "Lcom/tinder/chat/target/ChatInputBoxGifSelector;", "getChatInputBoxGifSelector$Tinder_release", "()Lcom/tinder/chat/target/ChatInputBoxGifSelector;", "setChatInputBoxGifSelector$Tinder_release", "(Lcom/tinder/chat/target/ChatInputBoxGifSelector;)V", "chatInputEditText", "Lcom/tinder/reactions/drawer/view/ChatInputEditText;", "getChatInputEditText$Tinder_release", "()Lcom/tinder/reactions/drawer/view/ChatInputEditText;", "setChatInputEditText$Tinder_release", "(Lcom/tinder/reactions/drawer/view/ChatInputEditText;)V", "getChatInputEditTextProvider$Tinder_release", "()Lcom/tinder/reactions/drawer/provider/ChatInputEditTextProvider;", "getChatInputGifSelectorProvider$Tinder_release", "()Lcom/tinder/chat/view/provider/ChatInputGifSelectorProvider;", "compositeSubscription", "Lrx/subscriptions/CompositeSubscription;", "expandButtonView", "Lcom/tinder/reactions/chat/view/ChatInputExpandButtonView;", "getExpandButtonView$Tinder_release", "()Lcom/tinder/reactions/chat/view/ChatInputExpandButtonView;", "setExpandButtonView$Tinder_release", "(Lcom/tinder/reactions/chat/view/ChatInputExpandButtonView;)V", "getExpandButtonViewProvider$Tinder_release", "()Lcom/tinder/reactions/chat/provider/ChatInputExpandButtonViewProvider;", "reactionDrawer", "Lcom/tinder/reactions/drawer/view/ReactionDrawer;", "getReactionDrawer$Tinder_release", "()Lcom/tinder/reactions/drawer/view/ReactionDrawer;", "setReactionDrawer$Tinder_release", "(Lcom/tinder/reactions/drawer/view/ReactionDrawer;)V", "getReactionDrawerProvider$Tinder_release", "()Lcom/tinder/reactions/drawer/provider/ReactionDrawerProvider;", "deactivateChatInput", "Lrx/Observable;", "", "expandDrawer", "hideReactions", "observeClicks", "onAttached", "onDetached", "showReactions", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@ChatActivityScope
/* renamed from: com.tinder.reactions.chat.feature.b */
public final class C16298b implements ExpandReactionDrawerFeatureTarget, FeatureLifecycle {
    @NotNull
    /* renamed from: a */
    public ChatInputExpandButtonView f50722a;
    @NotNull
    /* renamed from: b */
    public ReactionDrawer f50723b;
    @NotNull
    /* renamed from: c */
    public ChatInputEditText f50724c;
    @NotNull
    /* renamed from: d */
    public ChatInputBoxGifSelector f50725d;
    /* renamed from: e */
    private final C19573b f50726e = new C19573b();
    /* renamed from: f */
    private final C14603a f50727f;
    @NotNull
    /* renamed from: g */
    private final C14599c f50728g;
    @NotNull
    /* renamed from: h */
    private final C14639g f50729h;
    @NotNull
    /* renamed from: i */
    private final C14637a f50730i;
    @NotNull
    /* renamed from: j */
    private final C8507f f50731j;
    /* renamed from: k */
    private final C14629b f50732k;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call", "(Ljava/lang/Long;)V"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.chat.feature.b$a */
    static final class C17946a<T, R> implements Func1<T, R> {
        /* renamed from: a */
        public static final C17946a f55857a = new C17946a();

        C17946a() {
        }

        /* renamed from: a */
        public final void m65267a(Long l) {
        }

        public /* synthetic */ Object call(Object obj) {
            m65267a((Long) obj);
            return C15813i.f49016a;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "call", "(Lkotlin/Unit;)V"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.chat.feature.b$b */
    static final class C18685b<T> implements Action1<C15813i> {
        /* renamed from: a */
        final /* synthetic */ C16298b f58164a;

        C18685b(C16298b c16298b) {
            this.f58164a = c16298b;
        }

        public /* synthetic */ void call(Object obj) {
            m67118a((C15813i) obj);
        }

        /* renamed from: a */
        public final void m67118a(C15813i c15813i) {
            this.f58164a.m61497b().expandDrawer();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.chat.feature.b$c */
    static final class C18686c<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C18686c f58165a = new C18686c();

        C18686c() {
        }

        public /* synthetic */ void call(Object obj) {
            m67119a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m67119a(Throwable th) {
            C0001a.c(th, "Unable to deactivate chat input", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.chat.feature.b$d */
    static final class C18687d<T> implements Action1<Void> {
        /* renamed from: a */
        final /* synthetic */ C16298b f58166a;

        C18687d(C16298b c16298b) {
            this.f58166a = c16298b;
        }

        public /* synthetic */ void call(Object obj) {
            m67120a((Void) obj);
        }

        /* renamed from: a */
        public final void m67120a(Void voidR) {
            this.f58166a.f50727f.m55709b();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.chat.feature.b$e */
    static final class C18688e<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C18688e f58167a = new C18688e();

        C18688e() {
        }

        public /* synthetic */ void call(Object obj) {
            m67121a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m67121a(Throwable th) {
            C0001a.c(th, "Unable to observe clicks", new Object[0]);
        }
    }

    @Inject
    public C16298b(@NotNull C14603a c14603a, @NotNull C14599c c14599c, @NotNull C14639g c14639g, @NotNull C14637a c14637a, @NotNull C8507f c8507f, @NotNull C14629b c14629b) {
        C2668g.b(c14603a, "presenter");
        C2668g.b(c14599c, "expandButtonViewProvider");
        C2668g.b(c14639g, "reactionDrawerProvider");
        C2668g.b(c14637a, "chatInputEditTextProvider");
        C2668g.b(c8507f, "chatInputGifSelectorProvider");
        C2668g.b(c14629b, "chatInputDelegate");
        this.f50727f = c14603a;
        this.f50728g = c14599c;
        this.f50729h = c14639g;
        this.f50730i = c14637a;
        this.f50731j = c8507f;
        this.f50732k = c14629b;
        C14602a.m55703a(this);
    }

    @NotNull
    /* renamed from: c */
    public final C14599c m61498c() {
        return this.f50728g;
    }

    @NotNull
    /* renamed from: d */
    public final C14639g m61499d() {
        return this.f50729h;
    }

    @NotNull
    /* renamed from: e */
    public final C14637a m61500e() {
        return this.f50730i;
    }

    @NotNull
    /* renamed from: f */
    public final C8507f m61501f() {
        return this.f50731j;
    }

    @NotNull
    /* renamed from: a */
    public final ChatInputExpandButtonView m61492a() {
        ChatInputExpandButtonView chatInputExpandButtonView = this.f50722a;
        if (chatInputExpandButtonView == null) {
            C2668g.b("expandButtonView");
        }
        return chatInputExpandButtonView;
    }

    /* renamed from: a */
    public final void m61494a(@NotNull ChatInputExpandButtonView chatInputExpandButtonView) {
        C2668g.b(chatInputExpandButtonView, "<set-?>");
        this.f50722a = chatInputExpandButtonView;
    }

    /* renamed from: a */
    public final void m61496a(@NotNull ReactionDrawer reactionDrawer) {
        C2668g.b(reactionDrawer, "<set-?>");
        this.f50723b = reactionDrawer;
    }

    @NotNull
    /* renamed from: b */
    public final ReactionDrawer m61497b() {
        ReactionDrawer reactionDrawer = this.f50723b;
        if (reactionDrawer == null) {
            C2668g.b("reactionDrawer");
        }
        return reactionDrawer;
    }

    /* renamed from: a */
    public final void m61495a(@NotNull ChatInputEditText chatInputEditText) {
        C2668g.b(chatInputEditText, "<set-?>");
        this.f50724c = chatInputEditText;
    }

    /* renamed from: a */
    public final void m61493a(@NotNull ChatInputBoxGifSelector chatInputBoxGifSelector) {
        C2668g.b(chatInputBoxGifSelector, "<set-?>");
        this.f50725d = chatInputBoxGifSelector;
    }

    public void onAttached() {
        Deadshot.take(this, this.f50727f);
        this.f50732k.m55803f();
        m61490g();
    }

    public void onDetached() {
        this.f50726e.a();
        this.f50732k.m55804g();
        Deadshot.drop(this);
    }

    public void showReactions() {
        ChatInputExpandButtonView chatInputExpandButtonView = this.f50722a;
        if (chatInputExpandButtonView == null) {
            C2668g.b("expandButtonView");
        }
        C8587g.a(chatInputExpandButtonView, true);
    }

    public void hideReactions() {
        ChatInputExpandButtonView chatInputExpandButtonView = this.f50722a;
        if (chatInputExpandButtonView == null) {
            C2668g.b("expandButtonView");
        }
        C8587g.a(chatInputExpandButtonView, false);
    }

    public void expandDrawer() {
        this.f50726e.a(m61491h().h(1500, TimeUnit.MILLISECONDS).c(1).a(C19397a.a()).a(new C18685b(this), C18686c.f58165a));
    }

    /* renamed from: g */
    private final void m61490g() {
        ChatInputExpandButtonView chatInputExpandButtonView = this.f50722a;
        if (chatInputExpandButtonView == null) {
            C2668g.b("expandButtonView");
        }
        C5707b.b(chatInputExpandButtonView).a(C19397a.a()).a(new C18687d(this), C18688e.f58167a);
    }

    /* renamed from: h */
    private final Observable<C15813i> m61491h() {
        if (this.f50732k.m55800c()) {
            ChatInputBoxGifSelector chatInputBoxGifSelector = this.f50725d;
            if (chatInputBoxGifSelector == null) {
                C2668g.b("chatInputBoxGifSelector");
            }
            chatInputBoxGifSelector.hideGifSearch();
            return this.f50732k.m55802e();
        } else if (this.f50732k.m55799b()) {
            C14616a c14616a = C14616a.f46121a;
            ChatInputEditText chatInputEditText = this.f50724c;
            if (chatInputEditText == null) {
                C2668g.b("chatInputEditText");
            }
            c14616a.m55770b(chatInputEditText);
            r0 = Observable.b(500, TimeUnit.MILLISECONDS).k(C17946a.f55857a);
            C2668g.a(r0, "Observable.timer(ChatInp…            .map { Unit }");
            return r0;
        } else {
            r0 = Observable.a(C15813i.f49016a);
            C2668g.a(r0, "Observable.just(Unit)");
            return r0;
        }
    }
}
