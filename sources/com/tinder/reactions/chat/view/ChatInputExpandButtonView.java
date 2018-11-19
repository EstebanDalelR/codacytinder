package com.tinder.reactions.chat.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.tinder.chat.injection.provider.ChatActivitySubcomponentProvider;
import com.tinder.profile.p365d.C14398a;
import com.tinder.reactions.chat.feature.C16298b;
import com.tinder.reactions.chat.feature.C16299d;
import com.tinder.reactions.chat.p386a.C14599c;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0019\u001a\u00020\u001aH\u0002R\u001e\u0010\u0007\u001a\u00020\b8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\u000e8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u00020\u00148\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/tinder/reactions/chat/view/ChatInputExpandButtonView;", "Landroid/widget/ImageView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "chatExpandButtonViewProvider", "Lcom/tinder/reactions/chat/provider/ChatInputExpandButtonViewProvider;", "getChatExpandButtonViewProvider$Tinder_release", "()Lcom/tinder/reactions/chat/provider/ChatInputExpandButtonViewProvider;", "setChatExpandButtonViewProvider$Tinder_release", "(Lcom/tinder/reactions/chat/provider/ChatInputExpandButtonViewProvider;)V", "expandReactionDrawerFromChatInputFeature", "Lcom/tinder/reactions/chat/feature/ExpandReactionDrawerFromChatInputFeature;", "getExpandReactionDrawerFromChatInputFeature$Tinder_release", "()Lcom/tinder/reactions/chat/feature/ExpandReactionDrawerFromChatInputFeature;", "setExpandReactionDrawerFromChatInputFeature$Tinder_release", "(Lcom/tinder/reactions/chat/feature/ExpandReactionDrawerFromChatInputFeature;)V", "reactionTutorialFromChatInputFeature", "Lcom/tinder/reactions/chat/feature/ReactionTutorialFromChatInputFeature;", "getReactionTutorialFromChatInputFeature$Tinder_release", "()Lcom/tinder/reactions/chat/feature/ReactionTutorialFromChatInputFeature;", "setReactionTutorialFromChatInputFeature$Tinder_release", "(Lcom/tinder/reactions/chat/feature/ReactionTutorialFromChatInputFeature;)V", "bindFeatures", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class ChatInputExpandButtonView extends ImageView {
    @Inject
    @NotNull
    /* renamed from: a */
    public C14599c f46101a;
    @Inject
    @NotNull
    /* renamed from: b */
    public C16298b f46102b;
    @Inject
    @NotNull
    /* renamed from: c */
    public C16299d f46103c;

    public ChatInputExpandButtonView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        C2668g.b(context, "context");
        C2668g.b(attributeSet, "attrs");
        super(context, attributeSet);
        context = C14398a.m54830a(context);
        if (context == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.chat.injection.provider.ChatActivitySubcomponentProvider");
        }
        ((ChatActivitySubcomponentProvider) context).provideChatActivityComponent().inject(this);
        m55737a();
    }

    @NotNull
    public final C14599c getChatExpandButtonViewProvider$Tinder_release() {
        C14599c c14599c = this.f46101a;
        if (c14599c == null) {
            C2668g.b("chatExpandButtonViewProvider");
        }
        return c14599c;
    }

    public final void setChatExpandButtonViewProvider$Tinder_release(@NotNull C14599c c14599c) {
        C2668g.b(c14599c, "<set-?>");
        this.f46101a = c14599c;
    }

    @NotNull
    public final C16298b getExpandReactionDrawerFromChatInputFeature$Tinder_release() {
        C16298b c16298b = this.f46102b;
        if (c16298b == null) {
            C2668g.b("expandReactionDrawerFromChatInputFeature");
        }
        return c16298b;
    }

    public final void setExpandReactionDrawerFromChatInputFeature$Tinder_release(@NotNull C16298b c16298b) {
        C2668g.b(c16298b, "<set-?>");
        this.f46102b = c16298b;
    }

    @NotNull
    public final C16299d getReactionTutorialFromChatInputFeature$Tinder_release() {
        C16299d c16299d = this.f46103c;
        if (c16299d == null) {
            C2668g.b("reactionTutorialFromChatInputFeature");
        }
        return c16299d;
    }

    public final void setReactionTutorialFromChatInputFeature$Tinder_release(@NotNull C16299d c16299d) {
        C2668g.b(c16299d, "<set-?>");
        this.f46103c = c16299d;
    }

    /* renamed from: a */
    private final void m55737a() {
        C14599c c14599c = this.f46101a;
        if (c14599c == null) {
            C2668g.b("chatExpandButtonViewProvider");
        }
        c14599c.m55696a(this);
        StringBuilder stringBuilder = new StringBuilder();
        C16298b c16298b = this.f46102b;
        if (c16298b == null) {
            C2668g.b("expandReactionDrawerFromChatInputFeature");
        }
        stringBuilder.append(c16298b.toString());
        stringBuilder.append(" bound to ");
        stringBuilder.append(getClass());
        C0001a.a(stringBuilder.toString(), new Object[0]);
        stringBuilder = new StringBuilder();
        C16299d c16299d = this.f46103c;
        if (c16299d == null) {
            C2668g.b("reactionTutorialFromChatInputFeature");
        }
        stringBuilder.append(c16299d.toString());
        stringBuilder.append(" bound to ");
        stringBuilder.append(getClass());
        C0001a.a(stringBuilder.toString(), new Object[0]);
    }
}
