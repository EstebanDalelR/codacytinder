package com.tinder.reactions.drawer.mediator;

import com.tinder.chat.injection.scope.ChatActivityScope;
import com.tinder.chat.view.provider.ChatInputGifSelectorState;
import com.tinder.chat.view.provider.ChatInputGifSelectorStateUpdatesProvider;
import com.tinder.chat.view.provider.ChatInputTextStateUpdatesProvider;
import com.tinder.chat.view.provider.ChatTextInputState;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.p500e.C19573b;
import rx.subjects.PublishSubject;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0017\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0011\u001a\u00020\rJ\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0013J\u0006\u0010\u0015\u001a\u00020\u0013J\u0006\u0010\u0016\u001a\u00020\u0013J\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\u0018J\u0006\u0010\u0019\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R2\u0010\u000b\u001a&\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r \u000e*\u0012\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r\u0018\u00010\f0\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/tinder/reactions/drawer/mediator/ChatInputStateDelegate;", "", "chatInputTextStateUpdatesProvider", "Lcom/tinder/chat/view/provider/ChatInputTextStateUpdatesProvider;", "chatInputGifSelectorStateUpdatesProvider", "Lcom/tinder/chat/view/provider/ChatInputGifSelectorStateUpdatesProvider;", "(Lcom/tinder/chat/view/provider/ChatInputTextStateUpdatesProvider;Lcom/tinder/chat/view/provider/ChatInputGifSelectorStateUpdatesProvider;)V", "chatInputState", "Lcom/tinder/chat/view/provider/ChatTextInputState;", "compositeSubscription", "Lrx/subscriptions/CompositeSubscription;", "gifSelectorDismissedSubject", "Lrx/subjects/PublishSubject;", "", "kotlin.jvm.PlatformType", "gifSelectorState", "Lcom/tinder/chat/view/provider/ChatInputGifSelectorState;", "clear", "isChatInputActive", "", "isGifSelectorActive", "isGifSelectorInProgress", "isKeyboardActive", "observeGifSelectorDismissed", "Lrx/Observable;", "start", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@ChatActivityScope
/* renamed from: com.tinder.reactions.drawer.mediator.b */
public final class C14629b {
    /* renamed from: a */
    public static final C14628a f46139a = new C14628a();
    /* renamed from: b */
    private final PublishSubject<C15813i> f46140b = PublishSubject.w();
    /* renamed from: c */
    private final C19573b f46141c = new C19573b();
    /* renamed from: d */
    private ChatTextInputState f46142d = ChatTextInputState.INACTIVE;
    /* renamed from: e */
    private ChatInputGifSelectorState f46143e = ChatInputGifSelectorState.INACTIVE;
    /* renamed from: f */
    private final ChatInputTextStateUpdatesProvider f46144f;
    /* renamed from: g */
    private final ChatInputGifSelectorStateUpdatesProvider f46145g;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/tinder/reactions/drawer/mediator/ChatInputStateDelegate$Companion;", "", "()V", "DEACTIVATE_TIMEOUT_MS", "", "HIDE_KEYBOARD_DELAY_MS", "SHOW_KEYBOARD_DELAY_MS", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.drawer.mediator.b$a */
    public static final class C14628a {
        private C14628a() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "state", "Lcom/tinder/chat/view/provider/ChatTextInputState;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.drawer.mediator.b$b */
    static final class C17961b<T, R> implements Func1<ChatTextInputState, Boolean> {
        /* renamed from: a */
        final /* synthetic */ C14629b f55893a;

        C17961b(C14629b c14629b) {
            this.f55893a = c14629b;
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m65294a((ChatTextInputState) obj));
        }

        /* renamed from: a */
        public final boolean m65294a(ChatTextInputState chatTextInputState) {
            return chatTextInputState != this.f55893a.f46142d ? true : null;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "state", "Lcom/tinder/chat/view/provider/ChatInputGifSelectorState;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.drawer.mediator.b$d */
    static final class C17962d<T, R> implements Func1<ChatInputGifSelectorState, Boolean> {
        /* renamed from: a */
        final /* synthetic */ C14629b f55894a;

        C17962d(C14629b c14629b) {
            this.f55894a = c14629b;
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m65295a((ChatInputGifSelectorState) obj));
        }

        /* renamed from: a */
        public final boolean m65295a(ChatInputGifSelectorState chatInputGifSelectorState) {
            return chatInputGifSelectorState != this.f55894a.f46143e ? true : null;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "state", "Lcom/tinder/chat/view/provider/ChatTextInputState;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.drawer.mediator.b$c */
    static final class C18709c<T> implements Action1<ChatTextInputState> {
        /* renamed from: a */
        final /* synthetic */ C14629b f58190a;

        C18709c(C14629b c14629b) {
            this.f58190a = c14629b;
        }

        public /* synthetic */ void call(Object obj) {
            m67135a((ChatTextInputState) obj);
        }

        /* renamed from: a */
        public final void m67135a(ChatTextInputState chatTextInputState) {
            C14629b c14629b = this.f58190a;
            C2668g.a(chatTextInputState, "state");
            c14629b.f46142d = chatTextInputState;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "state", "Lcom/tinder/chat/view/provider/ChatInputGifSelectorState;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.drawer.mediator.b$e */
    static final class C18710e<T> implements Action1<ChatInputGifSelectorState> {
        /* renamed from: a */
        final /* synthetic */ C14629b f58191a;

        C18710e(C14629b c14629b) {
            this.f58191a = c14629b;
        }

        public /* synthetic */ void call(Object obj) {
            m67136a((ChatInputGifSelectorState) obj);
        }

        /* renamed from: a */
        public final void m67136a(ChatInputGifSelectorState chatInputGifSelectorState) {
            C14629b c14629b = this.f58191a;
            C2668g.a(chatInputGifSelectorState, "state");
            c14629b.f46143e = chatInputGifSelectorState;
            if (this.f58191a.f46143e == ChatInputGifSelectorState.INACTIVE) {
                this.f58191a.f46140b.onNext(C15813i.f49016a);
            }
        }
    }

    @Inject
    public C14629b(@NotNull ChatInputTextStateUpdatesProvider chatInputTextStateUpdatesProvider, @NotNull ChatInputGifSelectorStateUpdatesProvider chatInputGifSelectorStateUpdatesProvider) {
        C2668g.b(chatInputTextStateUpdatesProvider, "chatInputTextStateUpdatesProvider");
        C2668g.b(chatInputGifSelectorStateUpdatesProvider, "chatInputGifSelectorStateUpdatesProvider");
        this.f46144f = chatInputTextStateUpdatesProvider;
        this.f46145g = chatInputGifSelectorStateUpdatesProvider;
    }

    /* renamed from: a */
    public final boolean m55798a() {
        if (this.f46142d != ChatTextInputState.ACTIVE) {
            if (this.f46143e != ChatInputGifSelectorState.ACTIVE) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public final boolean m55799b() {
        return this.f46142d == ChatTextInputState.ACTIVE;
    }

    /* renamed from: c */
    public final boolean m55800c() {
        return this.f46143e == ChatInputGifSelectorState.ACTIVE;
    }

    /* renamed from: d */
    public final boolean m55801d() {
        return this.f46143e == ChatInputGifSelectorState.IN_PROGRESS;
    }

    @NotNull
    /* renamed from: e */
    public final Observable<C15813i> m55802e() {
        Observable<C15813i> e = this.f46140b.e();
        C2668g.a(e, "gifSelectorDismissedSubject.asObservable()");
        return e;
    }

    /* renamed from: f */
    public final void m55803f() {
        if (!this.f46141c.b()) {
            this.f46141c.a(this.f46144f.observe().f(new C17961b(this)).d(new C18709c(this)));
            this.f46141c.a(this.f46145g.observe().f(new C17962d(this)).d(new C18710e(this)));
        }
    }

    /* renamed from: g */
    public final void m55804g() {
        this.f46141c.a();
    }
}
