package com.tinder.reactions.chat.feature;

import com.tinder.chat.target.ChatInputBoxGifSelector;
import com.tinder.reactions.chat.view.ChatInputExpandButtonView;
import com.tinder.reactions.common.feature.C14614a;
import com.tinder.reactions.common.feature.FeatureLifecycle;
import com.tinder.reactions.drawer.view.ChatInputEditText;
import com.tinder.reactions.drawer.view.ReactionDrawer;
import io.reactivex.C3959e;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function4;
import io.reactivex.p453a.p455b.C15674a;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0003H\u0000¨\u0006\u0004"}, d2 = {"bind", "", "Lcom/tinder/reactions/chat/feature/ExpandReactionDrawerFromChatInputFeature;", "Lcom/tinder/reactions/chat/feature/ReactionTutorialFromChatInputFeature;", "Tinder_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.chat.feature.a */
public final class C14602a {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "view", "Lcom/tinder/reactions/chat/view/ChatInputExpandButtonView;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.chat.feature.a$a */
    static final class C16292a<T> implements Consumer<ChatInputExpandButtonView> {
        /* renamed from: a */
        final /* synthetic */ C16299d f50716a;

        C16292a(C16299d c16299d) {
            this.f50716a = c16299d;
        }

        public /* synthetic */ void accept(Object obj) {
            m61483a((ChatInputExpandButtonView) obj);
        }

        /* renamed from: a */
        public final void m61483a(ChatInputExpandButtonView chatInputExpandButtonView) {
            C16299d c16299d = this.f50716a;
            C2668g.a(chatInputExpandButtonView, "view");
            c16299d.m61505a(chatInputExpandButtonView);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/reactions/chat/view/ChatInputExpandButtonView;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.chat.feature.a$b */
    static final class C16293b<T> implements Consumer<ChatInputExpandButtonView> {
        /* renamed from: a */
        final /* synthetic */ C16299d f50717a;

        C16293b(C16299d c16299d) {
            this.f50717a = c16299d;
        }

        public /* synthetic */ void accept(Object obj) {
            m61484a((ChatInputExpandButtonView) obj);
        }

        /* renamed from: a */
        public final void m61484a(ChatInputExpandButtonView chatInputExpandButtonView) {
            C14614a.m55766a((FeatureLifecycle) this.f50717a, this.f50717a.m61504a());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.chat.feature.a$c */
    static final class C16294c<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C16294c f50718a = new C16294c();

        C16294c() {
        }

        public /* synthetic */ void accept(Object obj) {
            m61485a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m61485a(Throwable th) {
            C0001a.c(th, "Error observing view", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\n¢\u0006\u0002\b\n"}, d2 = {"<anonymous>", "", "expandButtonView", "Lcom/tinder/reactions/chat/view/ChatInputExpandButtonView;", "reactionDrawer", "Lcom/tinder/reactions/drawer/view/ReactionDrawer;", "chatInputEditText", "Lcom/tinder/reactions/drawer/view/ChatInputEditText;", "chatInputBoxGifSelector", "Lcom/tinder/chat/target/ChatInputBoxGifSelector;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.chat.feature.a$d */
    static final class C16295d<T1, T2, T3, T4, R> implements Function4<ChatInputExpandButtonView, ReactionDrawer, ChatInputEditText, ChatInputBoxGifSelector, C15813i> {
        /* renamed from: a */
        final /* synthetic */ C16298b f50719a;

        C16295d(C16298b c16298b) {
            this.f50719a = c16298b;
        }

        public /* synthetic */ Object apply(Object obj, Object obj2, Object obj3, Object obj4) {
            m61486a((ChatInputExpandButtonView) obj, (ReactionDrawer) obj2, (ChatInputEditText) obj3, (ChatInputBoxGifSelector) obj4);
            return C15813i.f49016a;
        }

        /* renamed from: a */
        public final void m61486a(@NotNull ChatInputExpandButtonView chatInputExpandButtonView, @NotNull ReactionDrawer reactionDrawer, @NotNull ChatInputEditText chatInputEditText, @NotNull ChatInputBoxGifSelector chatInputBoxGifSelector) {
            C2668g.b(chatInputExpandButtonView, "expandButtonView");
            C2668g.b(reactionDrawer, "reactionDrawer");
            C2668g.b(chatInputEditText, "chatInputEditText");
            C2668g.b(chatInputBoxGifSelector, "chatInputBoxGifSelector");
            this.f50719a.m61494a(chatInputExpandButtonView);
            this.f50719a.m61496a(reactionDrawer);
            this.f50719a.m61495a(chatInputEditText);
            this.f50719a.m61493a(chatInputBoxGifSelector);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "accept", "(Lkotlin/Unit;)V"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.chat.feature.a$e */
    static final class C16296e<T> implements Consumer<C15813i> {
        /* renamed from: a */
        final /* synthetic */ C16298b f50720a;

        C16296e(C16298b c16298b) {
            this.f50720a = c16298b;
        }

        public /* synthetic */ void accept(Object obj) {
            m61487a((C15813i) obj);
        }

        /* renamed from: a */
        public final void m61487a(C15813i c15813i) {
            C14614a.m55766a((FeatureLifecycle) this.f50720a, this.f50720a.m61492a());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.chat.feature.a$f */
    static final class C16297f<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C16297f f50721a = new C16297f();

        C16297f() {
        }

        public /* synthetic */ void accept(Object obj) {
            m61488a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m61488a(Throwable th) {
            C0001a.c(th, "Error observing views", new Object[0]);
        }
    }

    /* renamed from: a */
    public static final void m55704a(@NotNull C16299d c16299d) {
        C2668g.b(c16299d, "$receiver");
        c16299d.m61506b().m55695a().observeOn(C15674a.m58830a()).take(1).doOnNext(new C16292a(c16299d)).subscribe(new C16293b(c16299d), (Consumer) C16294c.f50718a);
    }

    /* renamed from: a */
    public static final void m55703a(@NotNull C16298b c16298b) {
        C2668g.b(c16298b, "$receiver");
        C3959e.zip(c16298b.m61498c().m55695a().take(1), c16298b.m61499d().m55828a().take(1), c16298b.m61500e().m55823a().take(1), c16298b.m61501f().a().take(1), new C16295d(c16298b)).observeOn(C15674a.m58830a()).take(1).subscribe(new C16296e(c16298b), (Consumer) C16297f.f50721a);
    }
}
