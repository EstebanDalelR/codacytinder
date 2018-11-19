package com.tinder.chat.view.message;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.DrawableRes;
import android.support.constraint.ConstraintLayout;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import butterknife.BindColor;
import butterknife.BindDimen;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.tinder.R;
import com.tinder.chat.injection.provider.ChatActivitySubcomponentProvider;
import com.tinder.chat.view.LinkClickListenableMovementMethod;
import com.tinder.chat.view.LinkClickListenableMovementMethod.OnLinksClickedListener;
import com.tinder.chat.view.action.aj;
import com.tinder.chat.view.model.ChatItem;
import com.tinder.chat.view.model.MessageViewModel;
import com.tinder.chat.view.model.am;
import com.tinder.common.view.extension.C8587g;
import com.tinder.utils.au;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\u0003H\u0016J\u0010\u0010<\u001a\u00020:2\u0006\u0010;\u001a\u00020\u0003H\u0002J\u0010\u0010=\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020\u0003H\u0003R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u00020\u000f8\u0002XD¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u00020\u000f8\u0002XD¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u00020\u000f8\u0002XD¢\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u00020\u00138\u0000@\u0000X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u00020\u000f8\u0002XD¢\u0006\u0002\n\u0000R\u0012\u0010\u0015\u001a\u00020\u000f8\u0000@\u0000X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0016\u001a\u00020\u00178\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\u00020\u001d8\u0016@\u0016X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001e\u0010\"\u001a\u00020#8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001e\u0010(\u001a\u00020\u00178\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0019\"\u0004\b*\u0010\u001bR\u0012\u0010+\u001a\u00020\u000f8\u0000@\u0000X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010,\u001a\u00020#8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010%\"\u0004\b.\u0010'R\u0012\u0010/\u001a\u00020\u00138\u0000@\u0000X\u000e¢\u0006\u0002\n\u0000R\u001e\u00100\u001a\u0002018\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001e\u00106\u001a\u00020#8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010%\"\u0004\b8\u0010'¨\u0006>"}, d2 = {"Lcom/tinder/chat/view/message/OutboundTextMessageView;", "Landroid/support/constraint/ConstraintLayout;", "Lcom/tinder/chat/view/message/BindableChatItemView;", "Lcom/tinder/chat/view/model/TextMessageViewModel;", "Lcom/tinder/chat/view/message/LikeableChatView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "actionHandler", "Lcom/tinder/chat/view/action/OutboundTextMessageViewActionHandler;", "getActionHandler", "()Lcom/tinder/chat/view/action/OutboundTextMessageViewActionHandler;", "setActionHandler", "(Lcom/tinder/chat/view/action/OutboundTextMessageViewActionHandler;)V", "batchStartBubbleDrawableId", "", "batchStartErrorBubbleDrawableId", "bubbleDrawableId", "emojiOnlyTextSize", "", "errorBubbleDrawableId", "errorStatusColor", "errorView", "Landroid/view/View;", "getErrorView$Tinder_release", "()Landroid/view/View;", "setErrorView$Tinder_release", "(Landroid/view/View;)V", "heartView", "Lcom/tinder/chat/view/message/HeartView;", "getHeartView", "()Lcom/tinder/chat/view/message/HeartView;", "setHeartView", "(Lcom/tinder/chat/view/message/HeartView;)V", "messageStatusView", "Landroid/widget/TextView;", "getMessageStatusView$Tinder_release", "()Landroid/widget/TextView;", "setMessageStatusView$Tinder_release", "(Landroid/widget/TextView;)V", "pendingView", "getPendingView$Tinder_release", "setPendingView$Tinder_release", "sentStatusColor", "textMessageContentView", "getTextMessageContentView$Tinder_release", "setTextMessageContentView$Tinder_release", "textSize", "timestampFormatter", "Lcom/tinder/chat/view/message/MessageTimestampFormatter;", "getTimestampFormatter$Tinder_release", "()Lcom/tinder/chat/view/message/MessageTimestampFormatter;", "setTimestampFormatter$Tinder_release", "(Lcom/tinder/chat/view/message/MessageTimestampFormatter;)V", "timestampView", "getTimestampView$Tinder_release", "setTimestampView$Tinder_release", "bind", "", "viewModel", "bindTextMessageContentView", "resolveBubbleStyle", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class OutboundTextMessageView extends ConstraintLayout implements BindableChatItemView<am>, LikeableChatView {
    @Inject
    @NotNull
    /* renamed from: a */
    public aj f34474a;
    @Inject
    @NotNull
    /* renamed from: b */
    public C8490z f34475b;
    @DrawableRes
    /* renamed from: c */
    private final int f34476c = R.drawable.chat_message_outbound_bubble_background_batch_start;
    @DrawableRes
    /* renamed from: d */
    private final int f34477d = R.drawable.chat_message_outbound_bubble_background_error_batch_start;
    @DrawableRes
    /* renamed from: e */
    private final int f34478e = R.drawable.chat_message_outbound_bubble_background;
    @BindDimen(2131166252)
    @JvmField
    public float emojiOnlyTextSize;
    @BindColor(2131100238)
    @JvmField
    public int errorStatusColor;
    @NotNull
    @BindView(2131362078)
    public View errorView;
    @DrawableRes
    /* renamed from: f */
    private final int f34479f = R.drawable.chat_message_outbound_bubble_background_error;
    @NotNull
    @BindView(2131362079)
    public HeartView heartView;
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
    @BindView(2131362089)
    public TextView textMessageContentView;
    @BindDimen(2131166250)
    @JvmField
    public float textSize;
    @NotNull
    @BindView(2131362082)
    public TextView timestampView;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onLongClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.view.message.OutboundTextMessageView$a */
    static final class C8479a implements OnLongClickListener {
        /* renamed from: a */
        final /* synthetic */ OutboundTextMessageView f30166a;
        /* renamed from: b */
        final /* synthetic */ am f30167b;

        C8479a(OutboundTextMessageView outboundTextMessageView, am amVar) {
            this.f30166a = outboundTextMessageView;
            this.f30167b = amVar;
        }

        public final boolean onLongClick(View view) {
            this.f30166a.getActionHandler().onMessageLongClicked(this.f30167b.m42909p(), this.f30167b.m42898e(), this.f30167b.m42899f(), this.f30167b.m42905l(), this.f30167b.m42907n().m36429a(), this.f30167b.m42903j());
            return true;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.view.message.OutboundTextMessageView$c */
    static final class C8480c implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ OutboundTextMessageView f30168a;
        /* renamed from: b */
        final /* synthetic */ am f30169b;

        C8480c(OutboundTextMessageView outboundTextMessageView, am amVar) {
            this.f30168a = outboundTextMessageView;
            this.f30169b = amVar;
        }

        public final void onClick(View view) {
            this.f30168a.getActionHandler().onMessageLongClicked(this.f30169b.m42909p(), this.f30169b.m42898e(), this.f30169b.m42899f(), this.f30169b.m42905l(), this.f30169b.m42907n().m36429a(), this.f30169b.m42903j());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.view.message.OutboundTextMessageView$d */
    static final class C8481d implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ OutboundTextMessageView f30170a;
        /* renamed from: b */
        final /* synthetic */ am f30171b;

        C8481d(OutboundTextMessageView outboundTextMessageView, am amVar) {
            this.f30170a = outboundTextMessageView;
            this.f30171b = amVar;
        }

        public final void onClick(View view) {
            this.f30170a.getActionHandler().onMessageLongClicked(this.f30171b.m42909p(), this.f30171b.m42898e(), this.f30171b.m42899f(), this.f30171b.m42905l(), this.f30171b.m42907n().m36429a(), this.f30171b.m42903j());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.view.message.OutboundTextMessageView$e */
    static final class C8482e implements OnClickListener {
        /* renamed from: a */
        public static final C8482e f30172a = new C8482e();

        C8482e() {
        }

        public final void onClick(View view) {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.view.message.OutboundTextMessageView$f */
    static final class C8483f implements OnClickListener {
        /* renamed from: a */
        public static final C8483f f30173a = new C8483f();

        C8483f() {
        }

        public final void onClick(View view) {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onLinkClicked"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.view.message.OutboundTextMessageView$b */
    static final class C10598b implements OnLinksClickedListener {
        /* renamed from: a */
        final /* synthetic */ OutboundTextMessageView f34472a;
        /* renamed from: b */
        final /* synthetic */ am f34473b;

        C10598b(OutboundTextMessageView outboundTextMessageView, am amVar) {
            this.f34472a = outboundTextMessageView;
            this.f34473b = amVar;
        }

        public final void onLinkClicked(String str) {
            this.f34472a.getActionHandler().onLinkClicked(this.f34473b.m42909p(), this.f34473b.m42899f(), C8587g.m36613a(this.f34472a.getTextMessageContentView$Tinder_release()), this.f34473b.m42900g());
        }
    }

    public OutboundTextMessageView(@NotNull Context context) {
        C2668g.b(context, "context");
        super(context);
        ((ChatActivitySubcomponentProvider) context).provideChatActivityComponent().inject(this);
        View.inflate(context, R.layout.chat_message_text_outbound_view, this);
        ButterKnife.a(this);
        setLayoutParams(new LayoutParams(-1, -2));
    }

    public /* synthetic */ void bind(ChatItem chatItem) {
        m42724a((am) chatItem);
    }

    @NotNull
    public final aj getActionHandler() {
        aj ajVar = this.f34474a;
        if (ajVar == null) {
            C2668g.b("actionHandler");
        }
        return ajVar;
    }

    public final void setActionHandler(@NotNull aj ajVar) {
        C2668g.b(ajVar, "<set-?>");
        this.f34474a = ajVar;
    }

    @NotNull
    public final C8490z getTimestampFormatter$Tinder_release() {
        C8490z c8490z = this.f34475b;
        if (c8490z == null) {
            C2668g.b("timestampFormatter");
        }
        return c8490z;
    }

    public final void setTimestampFormatter$Tinder_release(@NotNull C8490z c8490z) {
        C2668g.b(c8490z, "<set-?>");
        this.f34475b = c8490z;
    }

    @NotNull
    public final TextView getTextMessageContentView$Tinder_release() {
        TextView textView = this.textMessageContentView;
        if (textView == null) {
            C2668g.b("textMessageContentView");
        }
        return textView;
    }

    public final void setTextMessageContentView$Tinder_release(@NotNull TextView textView) {
        C2668g.b(textView, "<set-?>");
        this.textMessageContentView = textView;
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
    public void m42724a(@NotNull am amVar) {
        C2668g.b(amVar, "viewModel");
        m42722b(amVar);
        MessageViewModel messageViewModel = amVar;
        HeartView.m36227a(getHeartView(), messageViewModel, null, 2, null);
        C8490z c8490z = this.f34475b;
        if (c8490z == null) {
            C2668g.b("timestampFormatter");
        }
        ah.m36311a(this, amVar, c8490z);
        ae.m36293a(this, messageViewModel);
        TextView textView = this.textMessageContentView;
        if (textView == null) {
            C2668g.b("textMessageContentView");
        }
        textView.setOnLongClickListener(new C8479a(this, amVar));
        textView = this.textMessageContentView;
        if (textView == null) {
            C2668g.b("textMessageContentView");
        }
        textView.setMovementMethod(new LinkClickListenableMovementMethod(new C10598b(this, amVar)));
        if (amVar.m42905l()) {
            textView = this.textMessageContentView;
            if (textView == null) {
                C2668g.b("textMessageContentView");
            }
            textView.setOnClickListener(new C8480c(this, amVar));
            View view = this.errorView;
            if (view == null) {
                C2668g.b("errorView");
            }
            view.setOnClickListener(new C8481d(this, amVar));
            return;
        }
        amVar = this.textMessageContentView;
        if (amVar == null) {
            C2668g.b("textMessageContentView");
        }
        amVar.setOnClickListener(C8482e.f30172a);
        amVar = this.errorView;
        if (amVar == null) {
            C2668g.b("errorView");
        }
        amVar.setOnClickListener(C8483f.f30173a);
    }

    /* renamed from: b */
    private final void m42722b(am amVar) {
        Drawable drawable;
        float f;
        if (amVar.m50168a()) {
            drawable = (Drawable) null;
            f = this.emojiOnlyTextSize;
        } else {
            drawable = au.b(this, m42723c(amVar));
            f = this.textSize;
        }
        TextView textView = this.textMessageContentView;
        if (textView == null) {
            C2668g.b("textMessageContentView");
        }
        textView.setText(amVar.m42899f());
        amVar = this.textMessageContentView;
        if (amVar == null) {
            C2668g.b("textMessageContentView");
        }
        amVar.setBackground(drawable);
        amVar = this.textMessageContentView;
        if (amVar == null) {
            C2668g.b("textMessageContentView");
        }
        amVar.setTextSize(0, f);
        ah.m36310a(this);
    }

    @DrawableRes
    /* renamed from: c */
    private final int m42723c(am amVar) {
        if (amVar.m42907n().m36435g()) {
            if (amVar.m42905l() != null) {
                return this.f34477d;
            }
            return this.f34476c;
        } else if (amVar.m42905l() != null) {
            return this.f34479f;
        } else {
            return this.f34478e;
        }
    }
}
