package com.tinder.chat.view.message;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.DrawableRes;
import android.support.constraint.ConstraintLayout;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import butterknife.BindDimen;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.tinder.R;
import com.tinder.chat.injection.provider.ChatActivitySubcomponentProvider;
import com.tinder.chat.view.ChatAvatarView;
import com.tinder.chat.view.LinkClickListenableMovementMethod;
import com.tinder.chat.view.LinkClickListenableMovementMethod.OnLinksClickedListener;
import com.tinder.chat.view.action.C10592s;
import com.tinder.chat.view.action.MessageAvatarClickingActionHandler;
import com.tinder.chat.view.model.C8503z;
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

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u0003H\u0016J\u0010\u00102\u001a\u0002002\u0006\u00101\u001a\u00020\u0003H\u0002J\u0010\u00103\u001a\u00020\u00152\u0006\u00104\u001a\u000205H\u0003R\u001e\u0010\b\u001a\u00020\t8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0014\u001a\u00020\u00158\u0002XD¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u00020\u00158\u0002XD¢\u0006\u0002\n\u0000R\u0012\u0010\u0017\u001a\u00020\u00188\u0000@\u0000X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0019\u001a\u00020\u001a8\u0016@\u0016X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\u001f\u001a\u00020 8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0012\u0010%\u001a\u00020\u00188\u0000@\u0000X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010&\u001a\u00020'8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001e\u0010,\u001a\u00020 8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\"\"\u0004\b.\u0010$¨\u00066"}, d2 = {"Lcom/tinder/chat/view/message/InboundTextMessageView;", "Landroid/support/constraint/ConstraintLayout;", "Lcom/tinder/chat/view/message/BindableChatItemView;", "Lcom/tinder/chat/view/model/TextMessageViewModel;", "Lcom/tinder/chat/view/message/LikeableChatView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "actionHandler", "Lcom/tinder/chat/view/action/InboundTextMessageViewActionHandler;", "getActionHandler$Tinder_release", "()Lcom/tinder/chat/view/action/InboundTextMessageViewActionHandler;", "setActionHandler$Tinder_release", "(Lcom/tinder/chat/view/action/InboundTextMessageViewActionHandler;)V", "avatarView", "Lcom/tinder/chat/view/ChatAvatarView;", "getAvatarView$Tinder_release", "()Lcom/tinder/chat/view/ChatAvatarView;", "setAvatarView$Tinder_release", "(Lcom/tinder/chat/view/ChatAvatarView;)V", "batchStartBubbleDrawableId", "", "bubbleDrawableId", "emojiOnlyTextSize", "", "heartView", "Lcom/tinder/chat/view/message/HeartView;", "getHeartView", "()Lcom/tinder/chat/view/message/HeartView;", "setHeartView", "(Lcom/tinder/chat/view/message/HeartView;)V", "textMessageContentView", "Landroid/widget/TextView;", "getTextMessageContentView$Tinder_release", "()Landroid/widget/TextView;", "setTextMessageContentView$Tinder_release", "(Landroid/widget/TextView;)V", "textSize", "timestampFormatter", "Lcom/tinder/chat/view/message/MessageTimestampFormatter;", "getTimestampFormatter$Tinder_release", "()Lcom/tinder/chat/view/message/MessageTimestampFormatter;", "setTimestampFormatter$Tinder_release", "(Lcom/tinder/chat/view/message/MessageTimestampFormatter;)V", "timestampView", "getTimestampView$Tinder_release", "setTimestampView$Tinder_release", "bind", "", "viewModel", "bindTextMessageContentView", "resolveBubbleStyle", "positionInfo", "Lcom/tinder/chat/view/model/PositionInfo;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class InboundTextMessageView extends ConstraintLayout implements BindableChatItemView<am>, LikeableChatView {
    @Inject
    @NotNull
    /* renamed from: a */
    public C10592s f34457a;
    @NotNull
    @BindView(2131362076)
    public ChatAvatarView avatarView;
    @Inject
    @NotNull
    /* renamed from: b */
    public C8490z f34458b;
    @DrawableRes
    /* renamed from: c */
    private final int f34459c = R.drawable.chat_message_inbound_bubble_background_batch_start;
    @DrawableRes
    /* renamed from: d */
    private final int f34460d = R.drawable.chat_message_inbound_bubble_background;
    @BindDimen(2131166252)
    @JvmField
    public float emojiOnlyTextSize;
    @NotNull
    @BindView(2131362079)
    public HeartView heartView;
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
    /* renamed from: com.tinder.chat.view.message.InboundTextMessageView$a */
    static final class C8474a implements OnLongClickListener {
        /* renamed from: a */
        final /* synthetic */ InboundTextMessageView f30157a;
        /* renamed from: b */
        final /* synthetic */ am f30158b;

        C8474a(InboundTextMessageView inboundTextMessageView, am amVar) {
            this.f30157a = inboundTextMessageView;
            this.f30158b = amVar;
        }

        public final boolean onLongClick(View view) {
            this.f30157a.getActionHandler$Tinder_release().onMessageLongClicked(this.f30158b.m42909p(), this.f30158b.m42898e(), this.f30158b.m42899f(), this.f30158b.m42905l(), this.f30158b.m42907n().m36429a(), this.f30158b.m42903j());
            return true;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onLinkClicked"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.view.message.InboundTextMessageView$b */
    static final class C10597b implements OnLinksClickedListener {
        /* renamed from: a */
        final /* synthetic */ InboundTextMessageView f34455a;
        /* renamed from: b */
        final /* synthetic */ am f34456b;

        C10597b(InboundTextMessageView inboundTextMessageView, am amVar) {
            this.f34455a = inboundTextMessageView;
            this.f34456b = amVar;
        }

        public final void onLinkClicked(String str) {
            this.f34455a.getActionHandler$Tinder_release().onLinkClicked(this.f34456b.m42909p(), this.f34456b.m42899f(), C8587g.m36613a(this.f34455a.getTextMessageContentView$Tinder_release()), this.f34456b.m42900g());
        }
    }

    public InboundTextMessageView(@NotNull Context context) {
        C2668g.b(context, "context");
        super(context);
        ((ChatActivitySubcomponentProvider) context).provideChatActivityComponent().inject(this);
        View.inflate(context, R.layout.chat_message_text_inbound_view, this);
        ButterKnife.a(this);
        setLayoutParams(new LayoutParams(-1, -2));
    }

    public /* synthetic */ void bind(ChatItem chatItem) {
        m42713a((am) chatItem);
    }

    @NotNull
    public final C10592s getActionHandler$Tinder_release() {
        C10592s c10592s = this.f34457a;
        if (c10592s == null) {
            C2668g.b("actionHandler");
        }
        return c10592s;
    }

    public final void setActionHandler$Tinder_release(@NotNull C10592s c10592s) {
        C2668g.b(c10592s, "<set-?>");
        this.f34457a = c10592s;
    }

    @NotNull
    public final C8490z getTimestampFormatter$Tinder_release() {
        C8490z c8490z = this.f34458b;
        if (c8490z == null) {
            C2668g.b("timestampFormatter");
        }
        return c8490z;
    }

    public final void setTimestampFormatter$Tinder_release(@NotNull C8490z c8490z) {
        C2668g.b(c8490z, "<set-?>");
        this.f34458b = c8490z;
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
    public void m42713a(@NotNull am amVar) {
        C2668g.b(amVar, "viewModel");
        m42712b(amVar);
        HeartView heartView = getHeartView();
        MessageViewModel messageViewModel = amVar;
        C10592s c10592s = this.f34457a;
        if (c10592s == null) {
            C2668g.b("actionHandler");
        }
        heartView.m36228a(messageViewModel, c10592s);
        C10592s c10592s2 = this.f34457a;
        if (c10592s2 == null) {
            C2668g.b("actionHandler");
        }
        aa.m36232a(this, amVar, (MessageAvatarClickingActionHandler) c10592s2);
        C8490z c8490z = this.f34458b;
        if (c8490z == null) {
            C2668g.b("timestampFormatter");
        }
        ah.m36307a(this, amVar, c8490z);
        TextView textView = this.textMessageContentView;
        if (textView == null) {
            C2668g.b("textMessageContentView");
        }
        textView.setOnLongClickListener(new C8474a(this, amVar));
        textView = this.textMessageContentView;
        if (textView == null) {
            C2668g.b("textMessageContentView");
        }
        textView.setMovementMethod(new LinkClickListenableMovementMethod(new C10597b(this, amVar)));
    }

    /* renamed from: b */
    private final void m42712b(am amVar) {
        Drawable drawable;
        float f;
        if (amVar.m50168a()) {
            drawable = (Drawable) null;
            f = this.emojiOnlyTextSize;
        } else {
            drawable = au.b(this, m42711a(amVar.m42907n()));
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
        ah.m36306a(this);
    }

    @DrawableRes
    /* renamed from: a */
    private final int m42711a(C8503z c8503z) {
        if (c8503z.m36435g() != null) {
            return this.f34459c;
        }
        return this.f34460d;
    }
}
