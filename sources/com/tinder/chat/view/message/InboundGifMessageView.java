package com.tinder.chat.view.message;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.tinder.R;
import com.tinder.chat.injection.provider.ChatActivitySubcomponentProvider;
import com.tinder.chat.view.ChatAvatarView;
import com.tinder.chat.view.action.C10589p;
import com.tinder.chat.view.action.MessageAvatarClickingActionHandler;
import com.tinder.chat.view.model.C12748m;
import com.tinder.chat.view.model.ChatItem;
import com.tinder.chat.view.model.MessageViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0010\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u0004H\u0016R\u001e\u0010\n\u001a\u00020\u000b8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00178\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\u00020\u001d8\u0016@\u0016X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001e\u0010\"\u001a\u00020#8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001e\u0010(\u001a\u00020)8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u00061"}, d2 = {"Lcom/tinder/chat/view/message/InboundGifMessageView;", "Landroid/support/constraint/ConstraintLayout;", "Lcom/tinder/chat/view/message/LikeableChatView;", "Lcom/tinder/chat/view/message/BindableChatItemView;", "Lcom/tinder/chat/view/model/GifMessageViewModel;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "actionHandler", "Lcom/tinder/chat/view/action/InboundGifMessageViewActionHandler;", "getActionHandler$Tinder_release", "()Lcom/tinder/chat/view/action/InboundGifMessageViewActionHandler;", "setActionHandler$Tinder_release", "(Lcom/tinder/chat/view/action/InboundGifMessageViewActionHandler;)V", "avatarView", "Lcom/tinder/chat/view/ChatAvatarView;", "getAvatarView$Tinder_release", "()Lcom/tinder/chat/view/ChatAvatarView;", "setAvatarView$Tinder_release", "(Lcom/tinder/chat/view/ChatAvatarView;)V", "gifView", "Lcom/tinder/chat/view/message/MessageGifView;", "getGifView$Tinder_release", "()Lcom/tinder/chat/view/message/MessageGifView;", "setGifView$Tinder_release", "(Lcom/tinder/chat/view/message/MessageGifView;)V", "heartView", "Lcom/tinder/chat/view/message/HeartView;", "getHeartView", "()Lcom/tinder/chat/view/message/HeartView;", "setHeartView", "(Lcom/tinder/chat/view/message/HeartView;)V", "timestampFormatter", "Lcom/tinder/chat/view/message/MessageTimestampFormatter;", "getTimestampFormatter$Tinder_release", "()Lcom/tinder/chat/view/message/MessageTimestampFormatter;", "setTimestampFormatter$Tinder_release", "(Lcom/tinder/chat/view/message/MessageTimestampFormatter;)V", "timestampView", "Landroid/widget/TextView;", "getTimestampView$Tinder_release", "()Landroid/widget/TextView;", "setTimestampView$Tinder_release", "(Landroid/widget/TextView;)V", "bind", "", "viewModel", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class InboundGifMessageView extends ConstraintLayout implements BindableChatItemView<C12748m>, LikeableChatView {
    @Inject
    @NotNull
    /* renamed from: a */
    public C10589p f34449a;
    @NotNull
    @BindView(2131362076)
    public ChatAvatarView avatarView;
    @Inject
    @NotNull
    /* renamed from: b */
    public C8490z f34450b;
    @NotNull
    @BindView(2131362102)
    public MessageGifView gifView;
    @NotNull
    @BindView(2131362079)
    public HeartView heartView;
    @NotNull
    @BindView(2131362082)
    public TextView timestampView;

    public /* synthetic */ void bind(ChatItem chatItem) {
        m42709a((C12748m) chatItem);
    }

    public /* synthetic */ InboundGifMessageView(Context context, AttributeSet attributeSet, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public InboundGifMessageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        ((ChatActivitySubcomponentProvider) context).provideChatActivityComponent().inject(this);
        ConstraintLayout.inflate(context, R.layout.chat_message_gif_inbound_view, this);
        ButterKnife.a(this);
        setLayoutParams(new LayoutParams(-1, -2));
    }

    @NotNull
    public final C10589p getActionHandler$Tinder_release() {
        C10589p c10589p = this.f34449a;
        if (c10589p == null) {
            C2668g.b("actionHandler");
        }
        return c10589p;
    }

    public final void setActionHandler$Tinder_release(@NotNull C10589p c10589p) {
        C2668g.b(c10589p, "<set-?>");
        this.f34449a = c10589p;
    }

    @NotNull
    public final C8490z getTimestampFormatter$Tinder_release() {
        C8490z c8490z = this.f34450b;
        if (c8490z == null) {
            C2668g.b("timestampFormatter");
        }
        return c8490z;
    }

    public final void setTimestampFormatter$Tinder_release(@NotNull C8490z c8490z) {
        C2668g.b(c8490z, "<set-?>");
        this.f34450b = c8490z;
    }

    @NotNull
    public final MessageGifView getGifView$Tinder_release() {
        MessageGifView messageGifView = this.gifView;
        if (messageGifView == null) {
            C2668g.b("gifView");
        }
        return messageGifView;
    }

    public final void setGifView$Tinder_release(@NotNull MessageGifView messageGifView) {
        C2668g.b(messageGifView, "<set-?>");
        this.gifView = messageGifView;
    }

    @NotNull
    public HeartView getHeartView() {
        HeartView heartView = this.heartView;
        if (heartView == null) {
            C2668g.b("heartView");
        }
        return heartView;
    }

    public void setHeartView(@NotNull HeartView heartView) {
        C2668g.b(heartView, "<set-?>");
        this.heartView = heartView;
    }

    @NotNull
    public final ChatAvatarView getAvatarView$Tinder_release() {
        ChatAvatarView chatAvatarView = this.avatarView;
        if (chatAvatarView == null) {
            C2668g.b("avatarView");
        }
        return chatAvatarView;
    }

    public final void setAvatarView$Tinder_release(@NotNull ChatAvatarView chatAvatarView) {
        C2668g.b(chatAvatarView, "<set-?>");
        this.avatarView = chatAvatarView;
    }

    @NotNull
    public final TextView getTimestampView$Tinder_release() {
        TextView textView = this.timestampView;
        if (textView == null) {
            C2668g.b("timestampView");
        }
        return textView;
    }

    public final void setTimestampView$Tinder_release(@NotNull TextView textView) {
        C2668g.b(textView, "<set-?>");
        this.timestampView = textView;
    }

    /* renamed from: a */
    public void m42709a(@NotNull C12748m c12748m) {
        C2668g.b(c12748m, "viewModel");
        MessageGifView messageGifView = this.gifView;
        if (messageGifView == null) {
            C2668g.b("gifView");
        }
        C10589p c10589p = this.f34449a;
        if (c10589p == null) {
            C2668g.b("actionHandler");
        }
        messageGifView.m42715a(c12748m, c10589p);
        HeartView heartView = getHeartView();
        MessageViewModel messageViewModel = c12748m;
        C10589p c10589p2 = this.f34449a;
        if (c10589p2 == null) {
            C2668g.b("actionHandler");
        }
        heartView.m36228a(messageViewModel, c10589p2);
        C10589p c10589p3 = this.f34449a;
        if (c10589p3 == null) {
            C2668g.b("actionHandler");
        }
        aa.m36230a(this, c12748m, (MessageAvatarClickingActionHandler) c10589p3);
        C8490z c8490z = this.f34450b;
        if (c8490z == null) {
            C2668g.b("timestampFormatter");
        }
        ah.m36304a(this, c12748m, c8490z);
    }
}
