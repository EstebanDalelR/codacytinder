package com.tinder.chat.view.message;

import android.view.View;
import android.view.View.OnClickListener;
import com.tinder.chat.view.ChatAvatarView;
import com.tinder.chat.view.action.MessageAvatarClickingActionHandler;
import com.tinder.chat.view.model.C12747i;
import com.tinder.chat.view.model.C12748m;
import com.tinder.chat.view.model.C12749o;
import com.tinder.chat.view.model.MessageViewModel;
import com.tinder.chat.view.model.ag;
import com.tinder.chat.view.model.am;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000x\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001aA\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\n\u001a\u00020\u000b2\u001b\u0010\f\u001a\u0017\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0002\u001a\u001c\u0010\r\u001a\u00020\u0006*\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000bH\u0000\u001a\u001c\u0010\r\u001a\u00020\u0006*\u00020\u00102\u0006\u0010\t\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000bH\u0000\u001a\u001c\u0010\r\u001a\u00020\u0006*\u00020\u00112\u0006\u0010\t\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000bH\u0000\u001a\u001c\u0010\r\u001a\u00020\u0006*\u00020\u00122\u0006\u0010\t\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000bH\u0000\u001a\u001c\u0010\r\u001a\u00020\u0006*\u00020\u00132\u0006\u0010\t\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000bH\u0000\u001a\u001c\u0010\r\u001a\u00020\u0006*\u00020\u00142\u0006\u0010\t\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000bH\u0000\u001a\u001c\u0010\r\u001a\u00020\u0006*\u00020\u00152\u0006\u0010\t\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000bH\u0000\u001a\u001c\u0010\r\u001a\u00020\u0006*\u00020\u00162\u0006\u0010\t\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000bH\u0000\u001a\u001c\u0010\r\u001a\u00020\u0006*\u00020\u00172\u0006\u0010\t\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000bH\u0000\u001a\u001c\u0010\r\u001a\u00020\u0006*\u00020\u00182\u0006\u0010\t\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000bH\u0000\u001a\u001c\u0010\r\u001a\u00020\u0006*\u00020\u00192\u0006\u0010\t\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\u000bH\u0000\u001a\u001c\u0010\r\u001a\u00020\u0006*\u00020\u001b2\u0006\u0010\t\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\u000bH\u0000\u001a\u001c\u0010\r\u001a\u00020\u0006*\u00020\u001d2\u0006\u0010\t\u001a\u00020\u001e2\u0006\u0010\n\u001a\u00020\u000bH\u0000\u001a\u001c\u0010\r\u001a\u00020\u0006*\u00020\u001f2\u0006\u0010\t\u001a\u00020 2\u0006\u0010\n\u001a\u00020\u000bH\u0000\"#\u0010\u0000\u001a\u0017\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"showAvatarBasedOnPosition", "Lkotlin/Function1;", "Lcom/tinder/chat/view/model/MessageViewModel;", "", "Lkotlin/ExtensionFunctionType;", "bind", "", "avatarView", "Lcom/tinder/chat/view/ChatAvatarView;", "viewModel", "actionHandler", "Lcom/tinder/chat/view/action/MessageAvatarClickingActionHandler;", "shouldShowAvatar", "bindAvatarView", "Lcom/tinder/chat/view/message/InboundFeedInstagramConnectView;", "Lcom/tinder/chat/view/model/ActivityMessageViewModel;", "Lcom/tinder/chat/view/message/InboundFeedInstagramImageView;", "Lcom/tinder/chat/view/message/InboundFeedInstagramVideoView;", "Lcom/tinder/chat/view/message/InboundFeedLoopVideoView;", "Lcom/tinder/chat/view/message/InboundFeedNewMatchView;", "Lcom/tinder/chat/view/message/InboundFeedProfileAddPhotoView;", "Lcom/tinder/chat/view/message/InboundFeedProfileChangeBioView;", "Lcom/tinder/chat/view/message/InboundFeedProfileChangeSchoolView;", "Lcom/tinder/chat/view/message/InboundFeedProfileChangeWorkView;", "Lcom/tinder/chat/view/message/InboundFeedSpotifyView;", "Lcom/tinder/chat/view/message/InboundGifMessageView;", "Lcom/tinder/chat/view/model/GifMessageViewModel;", "Lcom/tinder/chat/view/message/InboundImageMessageView;", "Lcom/tinder/chat/view/model/ImageMessageViewModel;", "Lcom/tinder/chat/view/message/InboundReactionMessageView;", "Lcom/tinder/chat/view/model/ReactionMessageViewModel;", "Lcom/tinder/chat/view/message/InboundTextMessageView;", "Lcom/tinder/chat/view/model/TextMessageViewModel;", "Tinder_release"}, k = 2, mv = {1, 1, 10})
public final class aa {
    /* renamed from: a */
    private static final Function1<MessageViewModel<?>, Boolean> f30176a = MessageViewAvatarBindingExtensionsKt$showAvatarBasedOnPosition$1.f43680a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.view.message.aa$a */
    static final class C8484a implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ MessageAvatarClickingActionHandler f30174a;
        /* renamed from: b */
        final /* synthetic */ MessageViewModel f30175b;

        C8484a(MessageAvatarClickingActionHandler messageAvatarClickingActionHandler, MessageViewModel messageViewModel) {
            this.f30174a = messageAvatarClickingActionHandler;
            this.f30175b = messageViewModel;
        }

        public final void onClick(View view) {
            this.f30174a.onAvatarClicked(this.f30175b.m42901h(), this.f30175b.m42909p());
        }
    }

    /* renamed from: a */
    public static final void m36236a(@NotNull C10616g c10616g, @NotNull C12747i c12747i, @NotNull MessageAvatarClickingActionHandler messageAvatarClickingActionHandler) {
        C2668g.b(c10616g, "$receiver");
        C2668g.b(c12747i, "viewModel");
        C2668g.b(messageAvatarClickingActionHandler, "actionHandler");
        m36229a(c10616g.getAvatarView$Tinder_release(), c12747i, messageAvatarClickingActionHandler, MessageViewAvatarBindingExtensionsKt$bindAvatarView$1.f43671a);
    }

    /* renamed from: a */
    public static final void m36235a(@NotNull C10612e c10612e, @NotNull C12747i c12747i, @NotNull MessageAvatarClickingActionHandler messageAvatarClickingActionHandler) {
        C2668g.b(c10612e, "$receiver");
        C2668g.b(c12747i, "viewModel");
        C2668g.b(messageAvatarClickingActionHandler, "actionHandler");
        m36229a(c10612e.getAvatarView$Tinder_release(), c12747i, messageAvatarClickingActionHandler, MessageViewAvatarBindingExtensionsKt$bindAvatarView$2.f43672a);
    }

    /* renamed from: a */
    public static final void m36234a(@NotNull C10608c c10608c, @NotNull C12747i c12747i, @NotNull MessageAvatarClickingActionHandler messageAvatarClickingActionHandler) {
        C2668g.b(c10608c, "$receiver");
        C2668g.b(c12747i, "viewModel");
        C2668g.b(messageAvatarClickingActionHandler, "actionHandler");
        m36229a(c10608c.getAvatarView$Tinder_release(), c12747i, messageAvatarClickingActionHandler, MessageViewAvatarBindingExtensionsKt$bindAvatarView$3.f43673a);
    }

    /* renamed from: a */
    public static final void m36237a(@NotNull C10618i c10618i, @NotNull C12747i c12747i, @NotNull MessageAvatarClickingActionHandler messageAvatarClickingActionHandler) {
        C2668g.b(c10618i, "$receiver");
        C2668g.b(c12747i, "viewModel");
        C2668g.b(messageAvatarClickingActionHandler, "actionHandler");
        m36229a(c10618i.getAvatarView$Tinder_release(), c12747i, messageAvatarClickingActionHandler, MessageViewAvatarBindingExtensionsKt$bindAvatarView$4.f43674a);
    }

    /* renamed from: a */
    public static final void m36233a(@NotNull C10599a c10599a, @NotNull C12747i c12747i, @NotNull MessageAvatarClickingActionHandler messageAvatarClickingActionHandler) {
        C2668g.b(c10599a, "$receiver");
        C2668g.b(c12747i, "viewModel");
        C2668g.b(messageAvatarClickingActionHandler, "actionHandler");
        m36229a(c10599a.getAvatarView$Tinder_release(), c12747i, messageAvatarClickingActionHandler, MessageViewAvatarBindingExtensionsKt$bindAvatarView$5.f43675a);
    }

    /* renamed from: a */
    public static final void m36238a(@NotNull C10620k c10620k, @NotNull C12747i c12747i, @NotNull MessageAvatarClickingActionHandler messageAvatarClickingActionHandler) {
        C2668g.b(c10620k, "$receiver");
        C2668g.b(c12747i, "viewModel");
        C2668g.b(messageAvatarClickingActionHandler, "actionHandler");
        m36229a(c10620k.getAvatarView$Tinder_release(), c12747i, messageAvatarClickingActionHandler, MessageViewAvatarBindingExtensionsKt$bindAvatarView$6.f43676a);
    }

    /* renamed from: a */
    public static final void m36239a(@NotNull C10622m c10622m, @NotNull C12747i c12747i, @NotNull MessageAvatarClickingActionHandler messageAvatarClickingActionHandler) {
        C2668g.b(c10622m, "$receiver");
        C2668g.b(c12747i, "viewModel");
        C2668g.b(messageAvatarClickingActionHandler, "actionHandler");
        m36229a(c10622m.getAvatarView$Tinder_release(), c12747i, messageAvatarClickingActionHandler, MessageViewAvatarBindingExtensionsKt$bindAvatarView$7.f43677a);
    }

    /* renamed from: a */
    public static final void m36241a(@NotNull C10626q c10626q, @NotNull C12747i c12747i, @NotNull MessageAvatarClickingActionHandler messageAvatarClickingActionHandler) {
        C2668g.b(c10626q, "$receiver");
        C2668g.b(c12747i, "viewModel");
        C2668g.b(messageAvatarClickingActionHandler, "actionHandler");
        m36229a(c10626q.getAvatarView$Tinder_release(), c12747i, messageAvatarClickingActionHandler, MessageViewAvatarBindingExtensionsKt$bindAvatarView$8.f43678a);
    }

    /* renamed from: a */
    public static final void m36240a(@NotNull C10624o c10624o, @NotNull C12747i c12747i, @NotNull MessageAvatarClickingActionHandler messageAvatarClickingActionHandler) {
        C2668g.b(c10624o, "$receiver");
        C2668g.b(c12747i, "viewModel");
        C2668g.b(messageAvatarClickingActionHandler, "actionHandler");
        m36229a(c10624o.getAvatarView$Tinder_release(), c12747i, messageAvatarClickingActionHandler, MessageViewAvatarBindingExtensionsKt$bindAvatarView$9.f43679a);
    }

    /* renamed from: a */
    public static final void m36242a(@NotNull C10629s c10629s, @NotNull C12747i c12747i, @NotNull MessageAvatarClickingActionHandler messageAvatarClickingActionHandler) {
        C2668g.b(c10629s, "$receiver");
        C2668g.b(c12747i, "viewModel");
        C2668g.b(messageAvatarClickingActionHandler, "actionHandler");
        m36229a(c10629s.getAvatarView$Tinder_release(), c12747i, messageAvatarClickingActionHandler, MessageViewAvatarBindingExtensionsKt$bindAvatarView$10.f43669a);
    }

    /* renamed from: a */
    public static final void m36232a(@NotNull InboundTextMessageView inboundTextMessageView, @NotNull am amVar, @NotNull MessageAvatarClickingActionHandler messageAvatarClickingActionHandler) {
        C2668g.b(inboundTextMessageView, "$receiver");
        C2668g.b(amVar, "viewModel");
        C2668g.b(messageAvatarClickingActionHandler, "actionHandler");
        m36229a(inboundTextMessageView.getAvatarView$Tinder_release(), amVar, messageAvatarClickingActionHandler, f30176a);
    }

    /* renamed from: a */
    public static final void m36231a(@NotNull InboundImageMessageView inboundImageMessageView, @NotNull C12749o c12749o, @NotNull MessageAvatarClickingActionHandler messageAvatarClickingActionHandler) {
        C2668g.b(inboundImageMessageView, "$receiver");
        C2668g.b(c12749o, "viewModel");
        C2668g.b(messageAvatarClickingActionHandler, "actionHandler");
        m36229a(inboundImageMessageView.getAvatarView$Tinder_release(), c12749o, messageAvatarClickingActionHandler, MessageViewAvatarBindingExtensionsKt$bindAvatarView$11.f43670a);
    }

    /* renamed from: a */
    public static final void m36230a(@NotNull InboundGifMessageView inboundGifMessageView, @NotNull C12748m c12748m, @NotNull MessageAvatarClickingActionHandler messageAvatarClickingActionHandler) {
        C2668g.b(inboundGifMessageView, "$receiver");
        C2668g.b(c12748m, "viewModel");
        C2668g.b(messageAvatarClickingActionHandler, "actionHandler");
        m36229a(inboundGifMessageView.getAvatarView$Tinder_release(), c12748m, messageAvatarClickingActionHandler, f30176a);
    }

    /* renamed from: a */
    public static final void m36243a(@NotNull C10633w c10633w, @NotNull ag agVar, @NotNull MessageAvatarClickingActionHandler messageAvatarClickingActionHandler) {
        C2668g.b(c10633w, "$receiver");
        C2668g.b(agVar, "viewModel");
        C2668g.b(messageAvatarClickingActionHandler, "actionHandler");
        m36229a(c10633w.getAvatarView(), agVar, messageAvatarClickingActionHandler, f30176a);
    }

    /* renamed from: a */
    private static final void m36229a(ChatAvatarView chatAvatarView, MessageViewModel<?> messageViewModel, MessageAvatarClickingActionHandler messageAvatarClickingActionHandler, Function1<? super MessageViewModel<?>, Boolean> function1) {
        if (((Boolean) function1.invoke(messageViewModel)).booleanValue() != null) {
            chatAvatarView.m36175a(messageViewModel.m42908o());
            chatAvatarView.setVisibility(null);
            chatAvatarView.setOnClickListener((OnClickListener) new C8484a(messageAvatarClickingActionHandler, messageViewModel));
            return;
        }
        chatAvatarView.setVisibility(8);
        chatAvatarView.setOnClickListener(null);
    }
}
