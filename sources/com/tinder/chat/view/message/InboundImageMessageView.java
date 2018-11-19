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
import com.tinder.chat.view.action.C10590q;
import com.tinder.chat.view.action.MessageAvatarClickingActionHandler;
import com.tinder.chat.view.model.C12749o;
import com.tinder.chat.view.model.ChatItem;
import com.tinder.chat.view.model.MessageViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0010\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u0004H\u0016R\u001e\u0010\n\u001a\u00020\u000b8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00178\u0016@\u0016X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\u00020\u001d8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001e\u0010\"\u001a\u00020#8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001e\u0010(\u001a\u00020)8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u00061"}, d2 = {"Lcom/tinder/chat/view/message/InboundImageMessageView;", "Landroid/support/constraint/ConstraintLayout;", "Lcom/tinder/chat/view/message/LikeableChatView;", "Lcom/tinder/chat/view/message/BindableChatItemView;", "Lcom/tinder/chat/view/model/ImageMessageViewModel;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "actionHandler", "Lcom/tinder/chat/view/action/InboundImageMessageActionHandler;", "getActionHandler$Tinder_release", "()Lcom/tinder/chat/view/action/InboundImageMessageActionHandler;", "setActionHandler$Tinder_release", "(Lcom/tinder/chat/view/action/InboundImageMessageActionHandler;)V", "avatarView", "Lcom/tinder/chat/view/ChatAvatarView;", "getAvatarView$Tinder_release", "()Lcom/tinder/chat/view/ChatAvatarView;", "setAvatarView$Tinder_release", "(Lcom/tinder/chat/view/ChatAvatarView;)V", "heartView", "Lcom/tinder/chat/view/message/HeartView;", "getHeartView", "()Lcom/tinder/chat/view/message/HeartView;", "setHeartView", "(Lcom/tinder/chat/view/message/HeartView;)V", "imageView", "Lcom/tinder/chat/view/message/MessageImageView;", "getImageView$Tinder_release", "()Lcom/tinder/chat/view/message/MessageImageView;", "setImageView$Tinder_release", "(Lcom/tinder/chat/view/message/MessageImageView;)V", "timestampFormatter", "Lcom/tinder/chat/view/message/MessageTimestampFormatter;", "getTimestampFormatter$Tinder_release", "()Lcom/tinder/chat/view/message/MessageTimestampFormatter;", "setTimestampFormatter$Tinder_release", "(Lcom/tinder/chat/view/message/MessageTimestampFormatter;)V", "timestampView", "Landroid/widget/TextView;", "getTimestampView$Tinder_release", "()Landroid/widget/TextView;", "setTimestampView$Tinder_release", "(Landroid/widget/TextView;)V", "bind", "", "viewModel", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class InboundImageMessageView extends ConstraintLayout implements BindableChatItemView<C12749o>, LikeableChatView {
    @Inject
    @NotNull
    /* renamed from: a */
    public C10590q f34452a;
    @NotNull
    @BindView(2131362076)
    public ChatAvatarView avatarView;
    @Inject
    @NotNull
    /* renamed from: b */
    public C8490z f34453b;
    @NotNull
    @BindView(2131362079)
    public HeartView heartView;
    @NotNull
    @BindView(2131362103)
    public MessageImageView imageView;
    @NotNull
    @BindView(2131362082)
    public TextView timestampView;

    public /* synthetic */ void bind(ChatItem chatItem) {
        m42710a((C12749o) chatItem);
    }

    public /* synthetic */ InboundImageMessageView(Context context, AttributeSet attributeSet, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public InboundImageMessageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        ((ChatActivitySubcomponentProvider) context).provideChatActivityComponent().inject(this);
        ConstraintLayout.inflate(context, R.layout.chat_message_image_inbound_view, this);
        ButterKnife.a(this);
        setLayoutParams(new LayoutParams(-1, -2));
    }

    @NotNull
    public final C10590q getActionHandler$Tinder_release() {
        C10590q c10590q = this.f34452a;
        if (c10590q == null) {
            C2668g.b("actionHandler");
        }
        return c10590q;
    }

    public final void setActionHandler$Tinder_release(@NotNull C10590q c10590q) {
        C2668g.b(c10590q, "<set-?>");
        this.f34452a = c10590q;
    }

    @NotNull
    public final C8490z getTimestampFormatter$Tinder_release() {
        C8490z c8490z = this.f34453b;
        if (c8490z == null) {
            C2668g.b("timestampFormatter");
        }
        return c8490z;
    }

    public final void setTimestampFormatter$Tinder_release(@NotNull C8490z c8490z) {
        C2668g.b(c8490z, "<set-?>");
        this.f34453b = c8490z;
    }

    @NotNull
    public final MessageImageView getImageView$Tinder_release() {
        MessageImageView messageImageView = this.imageView;
        if (messageImageView == null) {
            C2668g.b("imageView");
        }
        return messageImageView;
    }

    public final void setImageView$Tinder_release(@NotNull MessageImageView messageImageView) {
        C2668g.b(messageImageView, "<set-?>");
        this.imageView = messageImageView;
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
    public void m42710a(@NotNull C12749o c12749o) {
        C2668g.b(c12749o, "viewModel");
        MessageImageView messageImageView = this.imageView;
        if (messageImageView == null) {
            C2668g.b("imageView");
        }
        C10590q c10590q = this.f34452a;
        if (c10590q == null) {
            C2668g.b("actionHandler");
        }
        messageImageView.m42719a(c12749o, c10590q);
        HeartView heartView = getHeartView();
        MessageViewModel messageViewModel = c12749o;
        C10590q c10590q2 = this.f34452a;
        if (c10590q2 == null) {
            C2668g.b("actionHandler");
        }
        heartView.m36228a(messageViewModel, c10590q2);
        C10590q c10590q3 = this.f34452a;
        if (c10590q3 == null) {
            C2668g.b("actionHandler");
        }
        aa.m36231a(this, c12749o, (MessageAvatarClickingActionHandler) c10590q3);
        C8490z c8490z = this.f34453b;
        if (c8490z == null) {
            C2668g.b("timestampFormatter");
        }
        ah.m36305a(this, c12749o, c8490z);
    }
}
