package com.tinder.chat.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;
import com.tinder.chat.injection.provider.ChatActivitySubcomponentProvider;
import com.tinder.chat.view.provider.C8508j;
import com.tinder.profile.p365d.C14398a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u001e\u0010\u0007\u001a\u00020\b8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/tinder/chat/view/ChatInputSendButtonView;", "Landroid/widget/ImageButton;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "provider", "Lcom/tinder/chat/view/provider/ChatInputSendButtonViewProvider;", "getProvider$Tinder_release", "()Lcom/tinder/chat/view/provider/ChatInputSendButtonViewProvider;", "setProvider$Tinder_release", "(Lcom/tinder/chat/view/provider/ChatInputSendButtonViewProvider;)V", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class ChatInputSendButtonView extends ImageButton {
    @Inject
    @NotNull
    /* renamed from: a */
    public C8508j f30090a;

    public ChatInputSendButtonView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        C2668g.b(context, "context");
        C2668g.b(attributeSet, "attrs");
        super(context, attributeSet);
        context = C14398a.a(context);
        if (context == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.chat.injection.provider.ChatActivitySubcomponentProvider");
        }
        ((ChatActivitySubcomponentProvider) context).provideChatActivityComponent().inject(this);
        context = this.f30090a;
        if (context == null) {
            C2668g.b("provider");
        }
        context.m36450a(this);
    }

    @NotNull
    public final C8508j getProvider$Tinder_release() {
        C8508j c8508j = this.f30090a;
        if (c8508j == null) {
            C2668g.b("provider");
        }
        return c8508j;
    }

    public final void setProvider$Tinder_release(@NotNull C8508j c8508j) {
        C2668g.b(c8508j, "<set-?>");
        this.f30090a = c8508j;
    }
}
