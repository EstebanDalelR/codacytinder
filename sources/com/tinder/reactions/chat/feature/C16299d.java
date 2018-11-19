package com.tinder.reactions.chat.feature;

import android.support.annotation.StringRes;
import com.tinder.R;
import com.tinder.chat.injection.scope.ChatActivityScope;
import com.tinder.deadshot.Deadshot;
import com.tinder.reactions.chat.p386a.C14599c;
import com.tinder.reactions.chat.p387b.C14601a;
import com.tinder.reactions.chat.presenter.C14605d;
import com.tinder.reactions.chat.target.ReactionTutorialFeatureTarget;
import com.tinder.reactions.chat.view.ChatInputExpandButtonView;
import com.tinder.reactions.common.feature.FeatureLifecycle;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import tinder.com.tooltip.Tooltip;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0015\u001a\u00020\u0013H\u0016J\b\u0010\u0016\u001a\u00020\u0013H\u0016J\b\u0010\u0017\u001a\u00020\u0013H\u0016J\u0012\u0010\u0018\u001a\u00020\u00132\b\b\u0001\u0010\u0019\u001a\u00020\u001aH\u0002R\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/tinder/reactions/chat/feature/ReactionTutorialFromChatInputFeature;", "Lcom/tinder/reactions/common/feature/FeatureLifecycle;", "Lcom/tinder/reactions/chat/target/ReactionTutorialFeatureTarget;", "presenter", "Lcom/tinder/reactions/chat/presenter/ReactionTutorialFromChatInputPresenter;", "chatInputExpandButtonProvider", "Lcom/tinder/reactions/chat/provider/ChatInputExpandButtonViewProvider;", "(Lcom/tinder/reactions/chat/presenter/ReactionTutorialFromChatInputPresenter;Lcom/tinder/reactions/chat/provider/ChatInputExpandButtonViewProvider;)V", "getChatInputExpandButtonProvider$Tinder_release", "()Lcom/tinder/reactions/chat/provider/ChatInputExpandButtonViewProvider;", "chatInputExpandButtonView", "Lcom/tinder/reactions/chat/view/ChatInputExpandButtonView;", "getChatInputExpandButtonView$Tinder_release", "()Lcom/tinder/reactions/chat/view/ChatInputExpandButtonView;", "setChatInputExpandButtonView$Tinder_release", "(Lcom/tinder/reactions/chat/view/ChatInputExpandButtonView;)V", "tutorialTooltipDialog", "Ltinder/com/tooltip/Tooltip;", "dismissTooltipDialog", "", "onAttached", "onDetached", "showReactionButtonEmptyTutorialDialog", "showReactionButtonReplyTutorialDialog", "showTutorialDialog", "resId", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@ChatActivityScope
/* renamed from: com.tinder.reactions.chat.feature.d */
public final class C16299d implements ReactionTutorialFeatureTarget, FeatureLifecycle {
    @NotNull
    /* renamed from: a */
    public ChatInputExpandButtonView f50733a;
    /* renamed from: b */
    private Tooltip f50734b;
    /* renamed from: c */
    private final C14605d f50735c;
    @NotNull
    /* renamed from: d */
    private final C14599c f50736d;

    @Inject
    public C16299d(@NotNull C14605d c14605d, @NotNull C14599c c14599c) {
        C2668g.b(c14605d, "presenter");
        C2668g.b(c14599c, "chatInputExpandButtonProvider");
        this.f50735c = c14605d;
        this.f50736d = c14599c;
        C14602a.m55704a(this);
    }

    @NotNull
    /* renamed from: b */
    public final C14599c m61506b() {
        return this.f50736d;
    }

    @NotNull
    /* renamed from: a */
    public final ChatInputExpandButtonView m61504a() {
        ChatInputExpandButtonView chatInputExpandButtonView = this.f50733a;
        if (chatInputExpandButtonView == null) {
            C2668g.b("chatInputExpandButtonView");
        }
        return chatInputExpandButtonView;
    }

    /* renamed from: a */
    public final void m61505a(@NotNull ChatInputExpandButtonView chatInputExpandButtonView) {
        C2668g.b(chatInputExpandButtonView, "<set-?>");
        this.f50733a = chatInputExpandButtonView;
    }

    public void onAttached() {
        Deadshot.take(this, this.f50735c);
    }

    public void onDetached() {
        Deadshot.drop(this);
    }

    public void showReactionButtonReplyTutorialDialog() {
        Tooltip tooltip = this.f50734b;
        if (tooltip == null || !tooltip.isShowing()) {
            m61503a((int) R.string.chat_gesture_announcement_reply);
            this.f50735c.m55732e();
        }
    }

    public void showReactionButtonEmptyTutorialDialog() {
        Tooltip tooltip = this.f50734b;
        if (tooltip == null || !tooltip.isShowing()) {
            m61503a((int) R.string.chat_gesture_announcement);
            this.f50735c.m55731d();
        }
    }

    public void dismissTooltipDialog() {
        Tooltip tooltip = this.f50734b;
        if (tooltip != null) {
            tooltip.dismiss();
        }
    }

    /* renamed from: a */
    private final void m61503a(@StringRes int i) {
        ChatInputExpandButtonView chatInputExpandButtonView = this.f50733a;
        if (chatInputExpandButtonView == null) {
            C2668g.b("chatInputExpandButtonView");
        }
        this.f50734b = new C14601a(chatInputExpandButtonView, i).m55700a((Function1) new ReactionTutorialFromChatInputFeature$showTutorialDialog$1(this)).m55702b(new ReactionTutorialFromChatInputFeature$showTutorialDialog$2(this)).m55701a();
    }
}
