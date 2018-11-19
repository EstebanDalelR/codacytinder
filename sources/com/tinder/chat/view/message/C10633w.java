package com.tinder.chat.view.message;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.tinder.R;
import com.tinder.chat.injection.provider.ChatActivitySubcomponentProvider;
import com.tinder.chat.view.ChatAvatarView;
import com.tinder.chat.view.action.C10591r;
import com.tinder.chat.view.action.MessageAvatarClickingActionHandler;
import com.tinder.chat.view.action.MessageLikingActionHandler;
import com.tinder.chat.view.model.ChatItem;
import com.tinder.chat.view.model.MessageViewModel;
import com.tinder.chat.view.model.ag;
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

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u00042\u00020\u00052\u00020\u0006B\r\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u0003H\u0016R\u001e\u0010\n\u001a\u00020\u000b8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118VX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0016\u001a\u00020\u00178@X\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001b\u001a\u00020\u001c8VX\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010 \u001a\u00020!8@X\u0002¢\u0006\f\n\u0004\b$\u0010\u0015\u001a\u0004\b\"\u0010#R\u001e\u0010%\u001a\u00020&8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001b\u0010+\u001a\u00020!8VX\u0002¢\u0006\f\n\u0004\b-\u0010\u0015\u001a\u0004\b,\u0010#R\u001b\u0010.\u001a\u00020!8@X\u0002¢\u0006\f\n\u0004\b0\u0010\u0015\u001a\u0004\b/\u0010#¨\u00064"}, d2 = {"Lcom/tinder/chat/view/message/InboundReactionMessageView;", "Landroid/support/constraint/ConstraintLayout;", "Lcom/tinder/chat/view/message/BindableChatItemView;", "Lcom/tinder/chat/view/model/ReactionMessageViewModel;", "Lcom/tinder/chat/view/message/LikeableChatView;", "Lcom/tinder/chat/view/message/AvatarChatView;", "Lcom/tinder/chat/view/message/TimestampChatView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "actionHandler", "Lcom/tinder/chat/view/action/InboundReactionMessageViewActionHandler;", "getActionHandler$Tinder_release", "()Lcom/tinder/chat/view/action/InboundReactionMessageViewActionHandler;", "setActionHandler$Tinder_release", "(Lcom/tinder/chat/view/action/InboundReactionMessageViewActionHandler;)V", "avatarView", "Lcom/tinder/chat/view/ChatAvatarView;", "getAvatarView", "()Lcom/tinder/chat/view/ChatAvatarView;", "avatarView$delegate", "Lkotlin/Lazy;", "gestureImageView", "Landroid/widget/ImageView;", "getGestureImageView$Tinder_release", "()Landroid/widget/ImageView;", "gestureImageView$delegate", "heartView", "Lcom/tinder/chat/view/message/HeartView;", "getHeartView", "()Lcom/tinder/chat/view/message/HeartView;", "heartView$delegate", "messageStatusTextView", "Landroid/widget/TextView;", "getMessageStatusTextView$Tinder_release", "()Landroid/widget/TextView;", "messageStatusTextView$delegate", "timestampFormatter", "Lcom/tinder/chat/view/message/MessageTimestampFormatter;", "getTimestampFormatter$Tinder_release", "()Lcom/tinder/chat/view/message/MessageTimestampFormatter;", "setTimestampFormatter$Tinder_release", "(Lcom/tinder/chat/view/message/MessageTimestampFormatter;)V", "timestampView", "getTimestampView", "timestampView$delegate", "unsupportedContentTextView", "getUnsupportedContentTextView$Tinder_release", "unsupportedContentTextView$delegate", "bind", "", "viewModel", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.chat.view.message.w */
public final class C10633w extends ConstraintLayout implements AvatarChatView, BindableChatItemView<ag>, LikeableChatView, TimestampChatView {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f34830a = new KProperty[]{C15825i.a(new PropertyReference1Impl(C15825i.a(C10633w.class), "heartView", "getHeartView()Lcom/tinder/chat/view/message/HeartView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(C10633w.class), "avatarView", "getAvatarView()Lcom/tinder/chat/view/ChatAvatarView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(C10633w.class), "timestampView", "getTimestampView()Landroid/widget/TextView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(C10633w.class), "gestureImageView", "getGestureImageView$Tinder_release()Landroid/widget/ImageView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(C10633w.class), "unsupportedContentTextView", "getUnsupportedContentTextView$Tinder_release()Landroid/widget/TextView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(C10633w.class), "messageStatusTextView", "getMessageStatusTextView$Tinder_release()Landroid/widget/TextView;"))};
    @Inject
    @NotNull
    /* renamed from: b */
    public C10591r f34831b;
    @Inject
    @NotNull
    /* renamed from: c */
    public C8490z f34832c;
    @NotNull
    /* renamed from: d */
    private final Lazy f34833d = C18451c.a(new InboundReactionMessageView$heartView$2(this));
    @NotNull
    /* renamed from: e */
    private final Lazy f34834e = C18451c.a(new InboundReactionMessageView$avatarView$2(this));
    @NotNull
    /* renamed from: f */
    private final Lazy f34835f = C18451c.a(new InboundReactionMessageView$timestampView$2(this));
    @NotNull
    /* renamed from: g */
    private final Lazy f34836g = C18451c.a(new InboundReactionMessageView$gestureImageView$2(this));
    @NotNull
    /* renamed from: h */
    private final Lazy f34837h = C18451c.a(new InboundReactionMessageView$unsupportedContentTextView$2(this));
    @NotNull
    /* renamed from: i */
    private final Lazy f34838i = C18451c.a(new InboundReactionMessageView$messageStatusTextView$2(this));
    /* renamed from: j */
    private HashMap f34839j;

    /* renamed from: a */
    public View m42889a(int i) {
        if (this.f34839j == null) {
            this.f34839j = new HashMap();
        }
        View view = (View) this.f34839j.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f34839j.put(Integer.valueOf(i), view);
        return view;
    }

    @NotNull
    public ChatAvatarView getAvatarView() {
        Lazy lazy = this.f34834e;
        KProperty kProperty = f34830a[1];
        return (ChatAvatarView) lazy.getValue();
    }

    @NotNull
    public final ImageView getGestureImageView$Tinder_release() {
        Lazy lazy = this.f34836g;
        KProperty kProperty = f34830a[3];
        return (ImageView) lazy.getValue();
    }

    @NotNull
    public HeartView getHeartView() {
        Lazy lazy = this.f34833d;
        KProperty kProperty = f34830a[0];
        return (HeartView) lazy.getValue();
    }

    @NotNull
    public final TextView getMessageStatusTextView$Tinder_release() {
        Lazy lazy = this.f34838i;
        KProperty kProperty = f34830a[5];
        return (TextView) lazy.getValue();
    }

    @NotNull
    public TextView getTimestampView() {
        Lazy lazy = this.f34835f;
        KProperty kProperty = f34830a[2];
        return (TextView) lazy.getValue();
    }

    @NotNull
    public final TextView getUnsupportedContentTextView$Tinder_release() {
        Lazy lazy = this.f34837h;
        KProperty kProperty = f34830a[4];
        return (TextView) lazy.getValue();
    }

    public /* synthetic */ void bind(ChatItem chatItem) {
        m42890a((ag) chatItem);
    }

    public C10633w(@NotNull Context context) {
        C2668g.b(context, "context");
        super(context);
        ((ChatActivitySubcomponentProvider) context).provideChatActivityComponent().inject(this);
        ConstraintLayout.inflate(context, R.layout.chat_message_reaction_inbound_view, this);
        setLayoutParams(new LayoutParams(-1, -2));
    }

    @NotNull
    public final C10591r getActionHandler$Tinder_release() {
        C10591r c10591r = this.f34831b;
        if (c10591r == null) {
            C2668g.b("actionHandler");
        }
        return c10591r;
    }

    public final void setActionHandler$Tinder_release(@NotNull C10591r c10591r) {
        C2668g.b(c10591r, "<set-?>");
        this.f34831b = c10591r;
    }

    @NotNull
    public final C8490z getTimestampFormatter$Tinder_release() {
        C8490z c8490z = this.f34832c;
        if (c8490z == null) {
            C2668g.b("timestampFormatter");
        }
        return c8490z;
    }

    public final void setTimestampFormatter$Tinder_release(@NotNull C8490z c8490z) {
        C2668g.b(c8490z, "<set-?>");
        this.f34832c = c8490z;
    }

    /* renamed from: a */
    public void m42890a(@NotNull ag agVar) {
        C2668g.b(agVar, "viewModel");
        C10591r c10591r = this.f34831b;
        if (c10591r == null) {
            C2668g.b("actionHandler");
        }
        af.m36298a(this, agVar, c10591r);
        MessageViewModel messageViewModel = agVar;
        C10591r c10591r2 = this.f34831b;
        if (c10591r2 == null) {
            C2668g.b("actionHandler");
        }
        ab.m36247a(this, messageViewModel, (MessageLikingActionHandler) c10591r2);
        C8490z c8490z = this.f34832c;
        if (c8490z == null) {
            C2668g.b("timestampFormatter");
        }
        ah.m36333a(this, agVar, c8490z);
        c10591r = this.f34831b;
        if (c10591r == null) {
            C2668g.b("actionHandler");
        }
        aa.m36243a(this, agVar, (MessageAvatarClickingActionHandler) c10591r);
    }
}
