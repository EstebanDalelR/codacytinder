package com.tinder.reactions.drawer.view;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.Lifecycle.Event;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;
import android.util.AttributeSet;
import com.jakewharton.rxbinding2.C7833a;
import com.jakewharton.rxbinding2.p141c.C5717c;
import com.tinder.R;
import com.tinder.chat.injection.provider.ChatActivitySubcomponentProvider;
import com.tinder.chat.presenter.C8450z;
import com.tinder.chat.target.ChatInputEditTextTarget;
import com.tinder.chat.view.provider.ChatInputTextStateUpdatesNotifier;
import com.tinder.deadshot.Deadshot;
import com.tinder.profile.p365d.C14398a;
import com.tinder.reactions.chat.feature.C16298b;
import com.tinder.reactions.drawer.provider.C14637a;
import com.tinder.views.CustomEditText;
import io.reactivex.C3959e;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010)\u001a\u00020*H\u0002J\u000e\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020-J\b\u0010.\u001a\u00020*H\u0002J\b\u0010/\u001a\u00020*H\u0014J\b\u00100\u001a\u00020*H\u0014J\b\u00101\u001a\u00020*H\u0007J\b\u00102\u001a\u00020*H\u0007R\u001e\u0010\t\u001a\u00020\n8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u001c8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010!\u001a\u00020\"8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0010\u0010'\u001a\u0004\u0018\u00010(X\u000e¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/tinder/reactions/drawer/view/ChatInputEditText;", "Lcom/tinder/views/CustomEditText;", "Lcom/tinder/chat/target/ChatInputEditTextTarget;", "Landroid/arch/lifecycle/LifecycleObserver;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "chatInputEditTextProvider", "Lcom/tinder/reactions/drawer/provider/ChatInputEditTextProvider;", "getChatInputEditTextProvider$Tinder_release", "()Lcom/tinder/reactions/drawer/provider/ChatInputEditTextProvider;", "setChatInputEditTextProvider$Tinder_release", "(Lcom/tinder/reactions/drawer/provider/ChatInputEditTextProvider;)V", "chatInputTextStateUpdatesNotifier", "Lcom/tinder/chat/view/provider/ChatInputTextStateUpdatesNotifier;", "getChatInputTextStateUpdatesNotifier$Tinder_release", "()Lcom/tinder/chat/view/provider/ChatInputTextStateUpdatesNotifier;", "setChatInputTextStateUpdatesNotifier$Tinder_release", "(Lcom/tinder/chat/view/provider/ChatInputTextStateUpdatesNotifier;)V", "expandReactionDrawerFromChatInputFeature", "Lcom/tinder/reactions/chat/feature/ExpandReactionDrawerFromChatInputFeature;", "getExpandReactionDrawerFromChatInputFeature$Tinder_release", "()Lcom/tinder/reactions/chat/feature/ExpandReactionDrawerFromChatInputFeature;", "setExpandReactionDrawerFromChatInputFeature$Tinder_release", "(Lcom/tinder/reactions/chat/feature/ExpandReactionDrawerFromChatInputFeature;)V", "lifecycle", "Landroid/arch/lifecycle/Lifecycle;", "getLifecycle$Tinder_release", "()Landroid/arch/lifecycle/Lifecycle;", "setLifecycle$Tinder_release", "(Landroid/arch/lifecycle/Lifecycle;)V", "presenter", "Lcom/tinder/chat/presenter/ChatInputEditTextPresenter;", "getPresenter$Tinder_release", "()Lcom/tinder/chat/presenter/ChatInputEditTextPresenter;", "setPresenter$Tinder_release", "(Lcom/tinder/chat/presenter/ChatInputEditTextPresenter;)V", "textChangesDisposable", "Lio/reactivex/disposables/Disposable;", "bindFeatures", "", "enableTypingHeartbeats", "enabled", "", "observeFocusChange", "onAttachedToWindow", "onDetachedFromWindow", "onPause", "onResume", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class ChatInputEditText extends CustomEditText implements LifecycleObserver, ChatInputEditTextTarget {
    @Inject
    @NotNull
    /* renamed from: a */
    public C14637a f14706a;
    @Inject
    @NotNull
    /* renamed from: b */
    public ChatInputTextStateUpdatesNotifier f14707b;
    @Inject
    @NotNull
    /* renamed from: c */
    public C16298b f14708c;
    @Inject
    @NotNull
    /* renamed from: d */
    public C8450z f14709d;
    @Inject
    @NotNull
    /* renamed from: e */
    public Lifecycle f14710e;
    /* renamed from: f */
    private Disposable f14711f;

    public ChatInputEditText(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        C2668g.m10309b(context, "context");
        C2668g.m10309b(attributeSet, "attrs");
        super(context, attributeSet);
        context = C14398a.a(context);
        if (context == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.chat.injection.provider.ChatActivitySubcomponentProvider");
        }
        ((ChatActivitySubcomponentProvider) context).provideChatActivityComponent().inject(this);
        m18386a();
        m18387b();
    }

    @NotNull
    public final C14637a getChatInputEditTextProvider$Tinder_release() {
        C14637a c14637a = this.f14706a;
        if (c14637a == null) {
            C2668g.m10310b("chatInputEditTextProvider");
        }
        return c14637a;
    }

    public final void setChatInputEditTextProvider$Tinder_release(@NotNull C14637a c14637a) {
        C2668g.m10309b(c14637a, "<set-?>");
        this.f14706a = c14637a;
    }

    @NotNull
    public final ChatInputTextStateUpdatesNotifier getChatInputTextStateUpdatesNotifier$Tinder_release() {
        ChatInputTextStateUpdatesNotifier chatInputTextStateUpdatesNotifier = this.f14707b;
        if (chatInputTextStateUpdatesNotifier == null) {
            C2668g.m10310b("chatInputTextStateUpdatesNotifier");
        }
        return chatInputTextStateUpdatesNotifier;
    }

    public final void setChatInputTextStateUpdatesNotifier$Tinder_release(@NotNull ChatInputTextStateUpdatesNotifier chatInputTextStateUpdatesNotifier) {
        C2668g.m10309b(chatInputTextStateUpdatesNotifier, "<set-?>");
        this.f14707b = chatInputTextStateUpdatesNotifier;
    }

    @NotNull
    public final C16298b getExpandReactionDrawerFromChatInputFeature$Tinder_release() {
        C16298b c16298b = this.f14708c;
        if (c16298b == null) {
            C2668g.m10310b("expandReactionDrawerFromChatInputFeature");
        }
        return c16298b;
    }

    public final void setExpandReactionDrawerFromChatInputFeature$Tinder_release(@NotNull C16298b c16298b) {
        C2668g.m10309b(c16298b, "<set-?>");
        this.f14708c = c16298b;
    }

    @NotNull
    public final C8450z getPresenter$Tinder_release() {
        C8450z c8450z = this.f14709d;
        if (c8450z == null) {
            C2668g.m10310b("presenter");
        }
        return c8450z;
    }

    public final void setPresenter$Tinder_release(@NotNull C8450z c8450z) {
        C2668g.m10309b(c8450z, "<set-?>");
        this.f14709d = c8450z;
    }

    @NotNull
    public final Lifecycle getLifecycle$Tinder_release() {
        Lifecycle lifecycle = this.f14710e;
        if (lifecycle == null) {
            C2668g.m10310b("lifecycle");
        }
        return lifecycle;
    }

    public final void setLifecycle$Tinder_release(@NotNull Lifecycle lifecycle) {
        C2668g.m10309b(lifecycle, "<set-?>");
        this.f14710e = lifecycle;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Lifecycle lifecycle = this.f14710e;
        if (lifecycle == null) {
            C2668g.m10310b("lifecycle");
        }
        lifecycle.mo36a(this);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Lifecycle lifecycle = this.f14710e;
        if (lifecycle == null) {
            C2668g.m10310b("lifecycle");
        }
        lifecycle.mo37b(this);
    }

    @OnLifecycleEvent(Event.ON_RESUME)
    public final void onResume() {
        C8450z c8450z = this.f14709d;
        if (c8450z == null) {
            C2668g.m10310b("presenter");
        }
        Deadshot.take(this, c8450z);
        C7833a a = C5717c.a(this);
        Function1 function1 = ChatInputEditText$onResume$1.f59378a;
        if (function1 != null) {
            function1 = new C16330b(function1);
        }
        C3959e map = a.map((Function) function1);
        C8450z c8450z2 = this.f14709d;
        if (c8450z2 == null) {
            C2668g.m10310b("presenter");
        }
        this.f14711f = map.subscribe(new C16329a(new ChatInputEditText$onResume$2(c8450z2)), ChatInputEditText$b.f50811a);
    }

    @OnLifecycleEvent(Event.ON_PAUSE)
    public final void onPause() {
        Disposable disposable = this.f14711f;
        if (disposable != null) {
            disposable.dispose();
        }
        Deadshot.drop(this);
    }

    /* renamed from: a */
    public final void m18388a(boolean z) {
        C8450z c8450z = this.f14709d;
        if (c8450z == null) {
            C2668g.m10310b("presenter");
        }
        c8450z.a(z);
    }

    /* renamed from: a */
    private final void m18386a() {
        if (getId() == R.id.chat_input_text) {
            C14637a c14637a = this.f14706a;
            if (c14637a == null) {
                C2668g.m10310b("chatInputEditTextProvider");
            }
            c14637a.a(this);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("");
            C16298b c16298b = this.f14708c;
            if (c16298b == null) {
                C2668g.m10310b("expandReactionDrawerFromChatInputFeature");
            }
            stringBuilder.append(c16298b);
            stringBuilder.append(" bound to ");
            stringBuilder.append(getClass());
            C0001a.m22a(stringBuilder.toString(), new Object[0]);
        }
    }

    /* renamed from: b */
    private final void m18387b() {
        setOnFocusChangeListener(new ChatInputEditText$a(this));
    }
}
