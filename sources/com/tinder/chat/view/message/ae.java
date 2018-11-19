package com.tinder.chat.view.message;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tinder.R;
import com.tinder.chat.view.model.MessageViewModel;
import com.tinder.views.CustomTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0002\u001a,\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0002\u001a\u001c\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0002\u001a\u0016\u0010\u000e\u001a\u00020\u0001*\u00020\u000f2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005\u001a\u0016\u0010\u000e\u001a\u00020\u0001*\u00020\u00102\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005\u001a\u0016\u0010\u000e\u001a\u00020\u0001*\u00020\u00112\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005\u001a\u0016\u0010\u000e\u001a\u00020\u0001*\u00020\u00122\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005¨\u0006\u0013"}, d2 = {"bindErrorView", "", "errorView", "Landroid/view/View;", "viewModel", "Lcom/tinder/chat/view/model/MessageViewModel;", "bindMessageStatus", "messageStatusView", "Landroid/widget/TextView;", "errorStatusColor", "", "sentStatusColor", "bindPendingView", "pendingView", "bindOutboundViews", "Lcom/tinder/chat/view/message/OutboundGifMessageView;", "Lcom/tinder/chat/view/message/OutboundImageMessageView;", "Lcom/tinder/chat/view/message/OutboundReactionMessageView;", "Lcom/tinder/chat/view/message/OutboundTextMessageView;", "Tinder_release"}, k = 2, mv = {1, 1, 10})
public final class ae {
    /* renamed from: a */
    public static final void m36293a(@NotNull OutboundTextMessageView outboundTextMessageView, @NotNull MessageViewModel<?> messageViewModel) {
        C2668g.b(outboundTextMessageView, "$receiver");
        C2668g.b(messageViewModel, "viewModel");
        m36289a(outboundTextMessageView.getPendingView$Tinder_release(), (MessageViewModel) messageViewModel);
        m36295b(outboundTextMessageView.getErrorView$Tinder_release(), messageViewModel);
        m36290a(outboundTextMessageView.getMessageStatusView$Tinder_release(), outboundTextMessageView.errorStatusColor, outboundTextMessageView.sentStatusColor, messageViewModel);
    }

    /* renamed from: a */
    public static final void m36291a(@NotNull OutboundGifMessageView outboundGifMessageView, @NotNull MessageViewModel<?> messageViewModel) {
        C2668g.b(outboundGifMessageView, "$receiver");
        C2668g.b(messageViewModel, "viewModel");
        m36289a(outboundGifMessageView.getPendingView$Tinder_release(), (MessageViewModel) messageViewModel);
        m36295b(outboundGifMessageView.getErrorView$Tinder_release(), messageViewModel);
        m36290a(outboundGifMessageView.getMessageStatusView$Tinder_release(), outboundGifMessageView.errorStatusColor, outboundGifMessageView.sentStatusColor, messageViewModel);
    }

    /* renamed from: a */
    public static final void m36294a(@NotNull be beVar, @NotNull MessageViewModel<?> messageViewModel) {
        C2668g.b(beVar, "$receiver");
        C2668g.b(messageViewModel, "viewModel");
        ProgressBar pendingView$Tinder_release = beVar.getPendingView$Tinder_release();
        C2668g.a(pendingView$Tinder_release, "pendingView");
        m36289a((View) pendingView$Tinder_release, (MessageViewModel) messageViewModel);
        ImageView errorView$Tinder_release = beVar.getErrorView$Tinder_release();
        C2668g.a(errorView$Tinder_release, "errorView");
        m36295b(errorView$Tinder_release, messageViewModel);
        CustomTextView messageStatusView$Tinder_release = beVar.getMessageStatusView$Tinder_release();
        C2668g.a(messageStatusView$Tinder_release, "messageStatusView");
        m36290a(messageStatusView$Tinder_release, beVar.getErrorStatusColor$Tinder_release(), beVar.getSentStatusColor$Tinder_release(), messageViewModel);
    }

    /* renamed from: a */
    public static final void m36292a(@NotNull OutboundImageMessageView outboundImageMessageView, @NotNull MessageViewModel<?> messageViewModel) {
        C2668g.b(outboundImageMessageView, "$receiver");
        C2668g.b(messageViewModel, "viewModel");
        m36289a(outboundImageMessageView.getPendingView$Tinder_release(), (MessageViewModel) messageViewModel);
        m36295b(outboundImageMessageView.getErrorView$Tinder_release(), messageViewModel);
        m36290a(outboundImageMessageView.getMessageStatusView$Tinder_release(), outboundImageMessageView.errorStatusColor, outboundImageMessageView.sentStatusColor, messageViewModel);
    }

    /* renamed from: a */
    private static final void m36289a(View view, MessageViewModel<?> messageViewModel) {
        view.setVisibility(messageViewModel.m42906m() != null ? null : 8);
    }

    /* renamed from: b */
    private static final void m36295b(View view, MessageViewModel<?> messageViewModel) {
        view.setVisibility(messageViewModel.m42905l() != null ? null : 8);
    }

    /* renamed from: a */
    private static final void m36290a(TextView textView, int i, int i2, MessageViewModel<?> messageViewModel) {
        if (messageViewModel.m42905l()) {
            textView.setVisibility(0);
            textView.setText(R.string.chat_message_not_delivered);
            textView.setTextColor(i);
        } else if (messageViewModel.m42907n().m36430b() == 0 || messageViewModel.m42906m() != 0) {
            textView.setVisibility(8);
            textView.setText((CharSequence) 0);
        } else {
            textView.setVisibility(0);
            textView.setText(R.string.chat_message_sent);
            textView.setTextColor(i2);
        }
    }
}
