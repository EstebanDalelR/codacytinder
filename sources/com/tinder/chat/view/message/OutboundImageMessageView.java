package com.tinder.chat.view.message;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import butterknife.BindColor;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.tinder.R;
import com.tinder.chat.injection.provider.ChatActivitySubcomponentProvider;
import com.tinder.chat.view.action.ah;
import com.tinder.chat.view.model.C12749o;
import com.tinder.chat.view.model.ChatItem;
import com.tinder.chat.view.model.MessageViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0010\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\u0004H\u0016R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0010\u001a\u00020\u00118\u0000@\u0000X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u00020\u00138\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\u00198\u0016@\u0016X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001e\u001a\u00020\u001f8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001e\u0010$\u001a\u00020%8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001e\u0010*\u001a\u00020\u00138\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0015\"\u0004\b,\u0010\u0017R\u0012\u0010-\u001a\u00020\u00118\u0000@\u0000X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010.\u001a\u00020/8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001e\u00104\u001a\u00020%8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010'\"\u0004\b6\u0010)¨\u0006:"}, d2 = {"Lcom/tinder/chat/view/message/OutboundImageMessageView;", "Landroid/support/constraint/ConstraintLayout;", "Lcom/tinder/chat/view/message/LikeableChatView;", "Lcom/tinder/chat/view/message/BindableChatItemView;", "Lcom/tinder/chat/view/model/ImageMessageViewModel;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "actionHandler", "Lcom/tinder/chat/view/action/OutboundImageMessageActionHandler;", "getActionHandler", "()Lcom/tinder/chat/view/action/OutboundImageMessageActionHandler;", "setActionHandler", "(Lcom/tinder/chat/view/action/OutboundImageMessageActionHandler;)V", "errorStatusColor", "", "errorView", "Landroid/view/View;", "getErrorView$Tinder_release", "()Landroid/view/View;", "setErrorView$Tinder_release", "(Landroid/view/View;)V", "heartView", "Lcom/tinder/chat/view/message/HeartView;", "getHeartView", "()Lcom/tinder/chat/view/message/HeartView;", "setHeartView", "(Lcom/tinder/chat/view/message/HeartView;)V", "imageView", "Lcom/tinder/chat/view/message/MessageImageView;", "getImageView$Tinder_release", "()Lcom/tinder/chat/view/message/MessageImageView;", "setImageView$Tinder_release", "(Lcom/tinder/chat/view/message/MessageImageView;)V", "messageStatusView", "Landroid/widget/TextView;", "getMessageStatusView$Tinder_release", "()Landroid/widget/TextView;", "setMessageStatusView$Tinder_release", "(Landroid/widget/TextView;)V", "pendingView", "getPendingView$Tinder_release", "setPendingView$Tinder_release", "sentStatusColor", "timestampFormatter", "Lcom/tinder/chat/view/message/MessageTimestampFormatter;", "getTimestampFormatter$Tinder_release", "()Lcom/tinder/chat/view/message/MessageTimestampFormatter;", "setTimestampFormatter$Tinder_release", "(Lcom/tinder/chat/view/message/MessageTimestampFormatter;)V", "timestampView", "getTimestampView$Tinder_release", "setTimestampView$Tinder_release", "bind", "", "viewModel", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class OutboundImageMessageView extends ConstraintLayout implements BindableChatItemView<C12749o>, LikeableChatView {
    @Inject
    @NotNull
    /* renamed from: a */
    public ah f34469a;
    @Inject
    @NotNull
    /* renamed from: b */
    public C8490z f34470b;
    @BindColor(2131100238)
    @JvmField
    public int errorStatusColor;
    @NotNull
    @BindView(2131362078)
    public View errorView;
    @NotNull
    @BindView(2131362079)
    public HeartView heartView;
    @NotNull
    @BindView(2131362103)
    public MessageImageView imageView;
    @NotNull
    @BindView(2131362081)
    public TextView messageStatusView;
    @NotNull
    @BindView(2131362080)
    public View pendingView;
    @BindColor(2131100234)
    @JvmField
    public int sentStatusColor;
    @NotNull
    @BindView(2131362082)
    public TextView timestampView;

    public /* synthetic */ void bind(ChatItem chatItem) {
        m42721a((C12749o) chatItem);
    }

    public /* synthetic */ OutboundImageMessageView(Context context, AttributeSet attributeSet, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public OutboundImageMessageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        ((ChatActivitySubcomponentProvider) context).provideChatActivityComponent().inject(this);
        ConstraintLayout.inflate(context, R.layout.chat_message_image_outbound_view, this);
        ButterKnife.a(this);
        setLayoutParams(new LayoutParams(-1, -2));
    }

    @NotNull
    public final ah getActionHandler() {
        ah ahVar = this.f34469a;
        if (ahVar == null) {
            C2668g.b("actionHandler");
        }
        return ahVar;
    }

    public final void setActionHandler(@NotNull ah ahVar) {
        C2668g.b(ahVar, "<set-?>");
        this.f34469a = ahVar;
    }

    @NotNull
    public final C8490z getTimestampFormatter$Tinder_release() {
        C8490z c8490z = this.f34470b;
        if (c8490z == null) {
            C2668g.b("timestampFormatter");
        }
        return c8490z;
    }

    public final void setTimestampFormatter$Tinder_release(@NotNull C8490z c8490z) {
        C2668g.b(c8490z, "<set-?>");
        this.f34470b = c8490z;
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

    @NotNull
    public final View getErrorView$Tinder_release() {
        View view = this.errorView;
        if (view == null) {
            C2668g.b("errorView");
        }
        return view;
    }

    public final void setErrorView$Tinder_release(@NotNull View view) {
        C2668g.b(view, "<set-?>");
        this.errorView = view;
    }

    @NotNull
    public final View getPendingView$Tinder_release() {
        View view = this.pendingView;
        if (view == null) {
            C2668g.b("pendingView");
        }
        return view;
    }

    public final void setPendingView$Tinder_release(@NotNull View view) {
        C2668g.b(view, "<set-?>");
        this.pendingView = view;
    }

    @NotNull
    public final TextView getMessageStatusView$Tinder_release() {
        TextView textView = this.messageStatusView;
        if (textView == null) {
            C2668g.b("messageStatusView");
        }
        return textView;
    }

    public final void setMessageStatusView$Tinder_release(@NotNull TextView textView) {
        C2668g.b(textView, "<set-?>");
        this.messageStatusView = textView;
    }

    /* renamed from: a */
    public void m42721a(@NotNull C12749o c12749o) {
        C2668g.b(c12749o, "viewModel");
        MessageImageView messageImageView = this.imageView;
        if (messageImageView == null) {
            C2668g.b("imageView");
        }
        ah ahVar = this.f34469a;
        if (ahVar == null) {
            C2668g.b("actionHandler");
        }
        messageImageView.m42719a(c12749o, ahVar);
        MessageViewModel messageViewModel = c12749o;
        HeartView.m36227a(getHeartView(), messageViewModel, null, 2, null);
        C8490z c8490z = this.f34470b;
        if (c8490z == null) {
            C2668g.b("timestampFormatter");
        }
        ah.m36309a(this, c12749o, c8490z);
        ae.m36292a(this, messageViewModel);
    }
}
