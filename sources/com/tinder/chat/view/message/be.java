package com.tinder.chat.view.message;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.support.v4.content.res.C0441a;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tinder.R;
import com.tinder.chat.injection.provider.ChatActivitySubcomponentProvider;
import com.tinder.chat.view.action.ai;
import com.tinder.chat.view.model.ChatItem;
import com.tinder.chat.view.model.MessageViewModel;
import com.tinder.chat.view.model.ag;
import com.tinder.views.CustomTextView;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.C18451c;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u00042\u00020\u0005B\r\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020\u0003H\u0016R\u001e\u0010\t\u001a\u00020\n8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R#\u0010\u0013\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00148@X\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001a\u001a\u00020\u00148@X\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001b\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u001e8VX\u0002¢\u0006\f\n\u0004\b!\u0010\u0019\u001a\u0004\b\u001f\u0010 R\u001b\u0010\"\u001a\u00020#8@X\u0002¢\u0006\f\n\u0004\b&\u0010\u0019\u001a\u0004\b$\u0010%R#\u0010'\u001a\n \u0015*\u0004\u0018\u00010(0(8@X\u0002¢\u0006\f\n\u0004\b+\u0010\u0019\u001a\u0004\b)\u0010*R#\u0010,\u001a\n \u0015*\u0004\u0018\u00010-0-8@X\u0002¢\u0006\f\n\u0004\b0\u0010\u0019\u001a\u0004\b.\u0010/R\u0014\u00101\u001a\u00020\u0010X\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u0012R\u001e\u00103\u001a\u0002048\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001b\u00109\u001a\u00020#8VX\u0002¢\u0006\f\n\u0004\b;\u0010\u0019\u001a\u0004\b:\u0010%R\u001b\u0010<\u001a\u00020#8@X\u0002¢\u0006\f\n\u0004\b>\u0010\u0019\u001a\u0004\b=\u0010%¨\u0006B"}, d2 = {"Lcom/tinder/chat/view/message/OutboundReactionMessageView;", "Landroid/support/constraint/ConstraintLayout;", "Lcom/tinder/chat/view/message/BindableChatItemView;", "Lcom/tinder/chat/view/model/ReactionMessageViewModel;", "Lcom/tinder/chat/view/message/LikeableChatView;", "Lcom/tinder/chat/view/message/TimestampChatView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "actionHandler", "Lcom/tinder/chat/view/action/OutboundReactionMessageViewActionHandler;", "getActionHandler$Tinder_release", "()Lcom/tinder/chat/view/action/OutboundReactionMessageViewActionHandler;", "setActionHandler$Tinder_release", "(Lcom/tinder/chat/view/action/OutboundReactionMessageViewActionHandler;)V", "errorStatusColor", "", "getErrorStatusColor$Tinder_release", "()I", "errorView", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "getErrorView$Tinder_release", "()Landroid/widget/ImageView;", "errorView$delegate", "Lkotlin/Lazy;", "gestureImageView", "getGestureImageView$Tinder_release", "gestureImageView$delegate", "heartView", "Lcom/tinder/chat/view/message/HeartView;", "getHeartView", "()Lcom/tinder/chat/view/message/HeartView;", "heartView$delegate", "messageStatusTextView", "Landroid/widget/TextView;", "getMessageStatusTextView$Tinder_release", "()Landroid/widget/TextView;", "messageStatusTextView$delegate", "messageStatusView", "Lcom/tinder/views/CustomTextView;", "getMessageStatusView$Tinder_release", "()Lcom/tinder/views/CustomTextView;", "messageStatusView$delegate", "pendingView", "Landroid/widget/ProgressBar;", "getPendingView$Tinder_release", "()Landroid/widget/ProgressBar;", "pendingView$delegate", "sentStatusColor", "getSentStatusColor$Tinder_release", "timestampFormatter", "Lcom/tinder/chat/view/message/MessageTimestampFormatter;", "getTimestampFormatter$Tinder_release", "()Lcom/tinder/chat/view/message/MessageTimestampFormatter;", "setTimestampFormatter$Tinder_release", "(Lcom/tinder/chat/view/message/MessageTimestampFormatter;)V", "timestampView", "getTimestampView", "timestampView$delegate", "unsupportedContentTextView", "getUnsupportedContentTextView$Tinder_release", "unsupportedContentTextView$delegate", "bind", "", "viewModel", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class be extends ConstraintLayout implements BindableChatItemView<ag>, LikeableChatView, TimestampChatView {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f34658a = new KProperty[]{C15825i.a(new PropertyReference1Impl(C15825i.a(be.class), "heartView", "getHeartView()Lcom/tinder/chat/view/message/HeartView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(be.class), "timestampView", "getTimestampView()Landroid/widget/TextView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(be.class), "gestureImageView", "getGestureImageView$Tinder_release()Landroid/widget/ImageView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(be.class), "unsupportedContentTextView", "getUnsupportedContentTextView$Tinder_release()Landroid/widget/TextView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(be.class), "errorView", "getErrorView$Tinder_release()Landroid/widget/ImageView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(be.class), "pendingView", "getPendingView$Tinder_release()Landroid/widget/ProgressBar;")), C15825i.a(new PropertyReference1Impl(C15825i.a(be.class), "messageStatusView", "getMessageStatusView$Tinder_release()Lcom/tinder/views/CustomTextView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(be.class), "messageStatusTextView", "getMessageStatusTextView$Tinder_release()Landroid/widget/TextView;"))};
    @Inject
    @NotNull
    /* renamed from: b */
    public ai f34659b;
    @Inject
    @NotNull
    /* renamed from: c */
    public C8490z f34660c;
    @NotNull
    /* renamed from: d */
    private final Lazy f34661d = C18451c.a(new OutboundReactionMessageView$heartView$2(this));
    @NotNull
    /* renamed from: e */
    private final Lazy f34662e = C18451c.a(new OutboundReactionMessageView$timestampView$2(this));
    @NotNull
    /* renamed from: f */
    private final Lazy f34663f = C18451c.a(new OutboundReactionMessageView$gestureImageView$2(this));
    @NotNull
    /* renamed from: g */
    private final Lazy f34664g = C18451c.a(new OutboundReactionMessageView$unsupportedContentTextView$2(this));
    /* renamed from: h */
    private final Lazy f34665h = C18451c.a(new OutboundReactionMessageView$errorView$2(this));
    /* renamed from: i */
    private final Lazy f34666i = C18451c.a(new OutboundReactionMessageView$pendingView$2(this));
    /* renamed from: j */
    private final Lazy f34667j = C18451c.a(new OutboundReactionMessageView$messageStatusView$2(this));
    @NotNull
    /* renamed from: k */
    private final Lazy f34668k = C18451c.a(new OutboundReactionMessageView$messageStatusTextView$2(this));
    /* renamed from: l */
    private final int f34669l = C0441a.b(getResources(), R.color.text_semi_dark, null);
    /* renamed from: m */
    private final int f34670m = C0441a.b(getResources(), R.color.text_light, null);
    /* renamed from: n */
    private HashMap f34671n;

    /* renamed from: a */
    public View m42809a(int i) {
        if (this.f34671n == null) {
            this.f34671n = new HashMap();
        }
        View view = (View) this.f34671n.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f34671n.put(Integer.valueOf(i), view);
        return view;
    }

    public final ImageView getErrorView$Tinder_release() {
        Lazy lazy = this.f34665h;
        KProperty kProperty = f34658a[4];
        return (ImageView) lazy.getValue();
    }

    @NotNull
    public final ImageView getGestureImageView$Tinder_release() {
        Lazy lazy = this.f34663f;
        KProperty kProperty = f34658a[2];
        return (ImageView) lazy.getValue();
    }

    @NotNull
    public HeartView getHeartView() {
        Lazy lazy = this.f34661d;
        KProperty kProperty = f34658a[0];
        return (HeartView) lazy.getValue();
    }

    @NotNull
    public final TextView getMessageStatusTextView$Tinder_release() {
        Lazy lazy = this.f34668k;
        KProperty kProperty = f34658a[7];
        return (TextView) lazy.getValue();
    }

    public final CustomTextView getMessageStatusView$Tinder_release() {
        Lazy lazy = this.f34667j;
        KProperty kProperty = f34658a[6];
        return (CustomTextView) lazy.getValue();
    }

    public final ProgressBar getPendingView$Tinder_release() {
        Lazy lazy = this.f34666i;
        KProperty kProperty = f34658a[5];
        return (ProgressBar) lazy.getValue();
    }

    @NotNull
    public TextView getTimestampView() {
        Lazy lazy = this.f34662e;
        KProperty kProperty = f34658a[1];
        return (TextView) lazy.getValue();
    }

    @NotNull
    public final TextView getUnsupportedContentTextView$Tinder_release() {
        Lazy lazy = this.f34664g;
        KProperty kProperty = f34658a[3];
        return (TextView) lazy.getValue();
    }

    public /* synthetic */ void bind(ChatItem chatItem) {
        m42810a((ag) chatItem);
    }

    public be(@NotNull Context context) {
        C2668g.b(context, "context");
        super(context);
        ((ChatActivitySubcomponentProvider) context).provideChatActivityComponent().inject(this);
        ConstraintLayout.inflate(context, R.layout.chat_message_reaction_outbound_view, this);
        setLayoutParams(new LayoutParams(-1, -2));
    }

    @NotNull
    public final ai getActionHandler$Tinder_release() {
        ai aiVar = this.f34659b;
        if (aiVar == null) {
            C2668g.b("actionHandler");
        }
        return aiVar;
    }

    public final void setActionHandler$Tinder_release(@NotNull ai aiVar) {
        C2668g.b(aiVar, "<set-?>");
        this.f34659b = aiVar;
    }

    @NotNull
    public final C8490z getTimestampFormatter$Tinder_release() {
        C8490z c8490z = this.f34660c;
        if (c8490z == null) {
            C2668g.b("timestampFormatter");
        }
        return c8490z;
    }

    public final void setTimestampFormatter$Tinder_release(@NotNull C8490z c8490z) {
        C2668g.b(c8490z, "<set-?>");
        this.f34660c = c8490z;
    }

    public final int getErrorStatusColor$Tinder_release() {
        return this.f34669l;
    }

    public final int getSentStatusColor$Tinder_release() {
        return this.f34670m;
    }

    /* renamed from: a */
    public void m42810a(@NotNull ag agVar) {
        C2668g.b(agVar, "viewModel");
        ai aiVar = this.f34659b;
        if (aiVar == null) {
            C2668g.b("actionHandler");
        }
        af.m36297a(this, agVar, aiVar);
        MessageViewModel messageViewModel = agVar;
        ab.m36246a(this, messageViewModel);
        C8490z c8490z = this.f34660c;
        if (c8490z == null) {
            C2668g.b("timestampFormatter");
        }
        ah.m36323a(this, agVar, c8490z);
        ae.m36294a(this, messageViewModel);
    }
}
