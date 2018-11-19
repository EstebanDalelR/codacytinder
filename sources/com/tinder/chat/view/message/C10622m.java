package com.tinder.chat.view.message;

import android.content.Context;
import android.support.annotation.DrawableRes;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tinder.C6250b.C6248a;
import com.tinder.R;
import com.tinder.chat.injection.provider.ChatActivitySubcomponentProvider;
import com.tinder.chat.view.ChatAvatarView;
import com.tinder.chat.view.action.C10587l;
import com.tinder.chat.view.action.C10588n;
import com.tinder.chat.view.action.C8458c;
import com.tinder.chat.view.action.MessageAvatarClickingActionHandler;
import com.tinder.chat.view.model.C12747i;
import com.tinder.chat.view.model.ChatItem;
import com.tinder.chat.view.model.ac;
import com.tinder.common.feed.view.FeedProfileChangeBioContentView;
import com.tinder.profile.p365d.C14398a;
import com.tinder.utils.au;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u0003H\u0016R\u0014\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\f8\u0000XD¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u00020\u00148\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u00020\u001a8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\u001f\u001a\u00020 8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020&X\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020*X\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u001e\u0010-\u001a\u00020.8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0014\u00103\u001a\u00020&X\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010(¨\u00068"}, d2 = {"Lcom/tinder/chat/view/message/InboundFeedProfileChangeBioView;", "Landroid/widget/RelativeLayout;", "Lcom/tinder/chat/view/message/BindableChatItemView;", "Lcom/tinder/chat/view/model/ActivityMessageViewModel;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "avatarView", "Lcom/tinder/chat/view/ChatAvatarView;", "getAvatarView$Tinder_release", "()Lcom/tinder/chat/view/ChatAvatarView;", "bubbleDrawableId", "", "getBubbleDrawableId$Tinder_release", "()I", "feedProfileChangeBioContentView", "Lcom/tinder/common/feed/view/FeedProfileChangeBioContentView;", "getFeedProfileChangeBioContentView$Tinder_release", "()Lcom/tinder/common/feed/view/FeedProfileChangeBioContentView;", "imageClickHandler", "Lcom/tinder/chat/view/action/ActivityMessageImageClickHandler;", "getImageClickHandler$Tinder_release", "()Lcom/tinder/chat/view/action/ActivityMessageImageClickHandler;", "setImageClickHandler$Tinder_release", "(Lcom/tinder/chat/view/action/ActivityMessageImageClickHandler;)V", "mediaUnavailableHandler", "Lcom/tinder/chat/view/action/InboundActivityMessageMediaUnavailableHandler;", "getMediaUnavailableHandler$Tinder_release", "()Lcom/tinder/chat/view/action/InboundActivityMessageMediaUnavailableHandler;", "setMediaUnavailableHandler$Tinder_release", "(Lcom/tinder/chat/view/action/InboundActivityMessageMediaUnavailableHandler;)V", "messageActionHandler", "Lcom/tinder/chat/view/action/InboundActivityMessageViewActionHandler;", "getMessageActionHandler$Tinder_release", "()Lcom/tinder/chat/view/action/InboundActivityMessageViewActionHandler;", "setMessageActionHandler$Tinder_release", "(Lcom/tinder/chat/view/action/InboundActivityMessageViewActionHandler;)V", "textMessageContentView", "Landroid/widget/TextView;", "getTextMessageContentView$Tinder_release", "()Landroid/widget/TextView;", "textSize", "", "getTextSize$Tinder_release", "()F", "timestampFormatter", "Lcom/tinder/chat/view/message/MessageTimestampFormatter;", "getTimestampFormatter$Tinder_release", "()Lcom/tinder/chat/view/message/MessageTimestampFormatter;", "setTimestampFormatter$Tinder_release", "(Lcom/tinder/chat/view/message/MessageTimestampFormatter;)V", "timestampView", "getTimestampView$Tinder_release", "bind", "", "viewModel", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.chat.view.message.m */
public final class C10622m extends RelativeLayout implements BindableChatItemView<C12747i> {
    @Inject
    @NotNull
    /* renamed from: a */
    public C10588n f34766a;
    @Inject
    @NotNull
    /* renamed from: b */
    public C8490z f34767b;
    @Inject
    @NotNull
    /* renamed from: c */
    public C8458c f34768c;
    @Inject
    @NotNull
    /* renamed from: d */
    public C10587l f34769d;
    /* renamed from: e */
    private final float f34770e = au.a(this, R.dimen.text_s);
    @DrawableRes
    /* renamed from: f */
    private final int f34771f = R.drawable.chat_activity_feed_message_inbound_bubble_background;
    @NotNull
    /* renamed from: g */
    private final TextView f34772g;
    @NotNull
    /* renamed from: h */
    private final ChatAvatarView f34773h;
    @NotNull
    /* renamed from: i */
    private final TextView f34774i;
    @NotNull
    /* renamed from: j */
    private final FeedProfileChangeBioContentView f34775j;
    /* renamed from: k */
    private HashMap f34776k;

    /* renamed from: a */
    public View m42856a(int i) {
        if (this.f34776k == null) {
            this.f34776k = new HashMap();
        }
        View view = (View) this.f34776k.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f34776k.put(Integer.valueOf(i), view);
        return view;
    }

    public C10622m(@NotNull Context context) {
        C2668g.b(context, "context");
        super(context);
        Context a = C14398a.a(context);
        if (a == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.chat.injection.provider.ChatActivitySubcomponentProvider");
        }
        ((ChatActivitySubcomponentProvider) a).provideChatActivityComponent().inject(this);
        RelativeLayout.inflate(context, R.layout.chat_activity_feed_inbound_change_bio_view, this);
        setLayoutParams(new LayoutParams(-1, -2));
        TextView textView = (TextView) m42856a(C6248a.chatTextMessageContent);
        C2668g.a(textView, "chatTextMessageContent");
        this.f34772g = textView;
        ChatAvatarView chatAvatarView = (ChatAvatarView) m42856a(C6248a.chatMessageAvatar);
        C2668g.a(chatAvatarView, "chatMessageAvatar");
        this.f34773h = chatAvatarView;
        textView = (TextView) m42856a(C6248a.chatMessageTimestamp);
        C2668g.a(textView, "chatMessageTimestamp");
        this.f34774i = textView;
        FeedProfileChangeBioContentView feedProfileChangeBioContentView = (FeedProfileChangeBioContentView) m42856a(C6248a.chatActivityFeedImageContainer);
        C2668g.a(feedProfileChangeBioContentView, "chatActivityFeedImageContainer");
        this.f34775j = feedProfileChangeBioContentView;
    }

    public /* synthetic */ void bind(ChatItem chatItem) {
        m42857a((C12747i) chatItem);
    }

    @NotNull
    public final C10588n getMessageActionHandler$Tinder_release() {
        C10588n c10588n = this.f34766a;
        if (c10588n == null) {
            C2668g.b("messageActionHandler");
        }
        return c10588n;
    }

    public final void setMessageActionHandler$Tinder_release(@NotNull C10588n c10588n) {
        C2668g.b(c10588n, "<set-?>");
        this.f34766a = c10588n;
    }

    @NotNull
    public final C8490z getTimestampFormatter$Tinder_release() {
        C8490z c8490z = this.f34767b;
        if (c8490z == null) {
            C2668g.b("timestampFormatter");
        }
        return c8490z;
    }

    public final void setTimestampFormatter$Tinder_release(@NotNull C8490z c8490z) {
        C2668g.b(c8490z, "<set-?>");
        this.f34767b = c8490z;
    }

    @NotNull
    public final C8458c getImageClickHandler$Tinder_release() {
        C8458c c8458c = this.f34768c;
        if (c8458c == null) {
            C2668g.b("imageClickHandler");
        }
        return c8458c;
    }

    public final void setImageClickHandler$Tinder_release(@NotNull C8458c c8458c) {
        C2668g.b(c8458c, "<set-?>");
        this.f34768c = c8458c;
    }

    @NotNull
    public final C10587l getMediaUnavailableHandler$Tinder_release() {
        C10587l c10587l = this.f34769d;
        if (c10587l == null) {
            C2668g.b("mediaUnavailableHandler");
        }
        return c10587l;
    }

    public final void setMediaUnavailableHandler$Tinder_release(@NotNull C10587l c10587l) {
        C2668g.b(c10587l, "<set-?>");
        this.f34769d = c10587l;
    }

    public final float getTextSize$Tinder_release() {
        return this.f34770e;
    }

    public final int getBubbleDrawableId$Tinder_release() {
        return this.f34771f;
    }

    @NotNull
    public final TextView getTextMessageContentView$Tinder_release() {
        return this.f34772g;
    }

    @NotNull
    public final ChatAvatarView getAvatarView$Tinder_release() {
        return this.f34773h;
    }

    @NotNull
    public final TextView getTimestampView$Tinder_release() {
        return this.f34774i;
    }

    @NotNull
    public final FeedProfileChangeBioContentView getFeedProfileChangeBioContentView$Tinder_release() {
        return this.f34775j;
    }

    /* renamed from: a */
    public void m42857a(@NotNull C12747i c12747i) {
        C2668g.b(c12747i, "viewModel");
        C10588n c10588n = this.f34766a;
        if (c10588n == null) {
            C2668g.b("messageActionHandler");
        }
        ad.m36285a(this, c12747i, c10588n);
        c10588n = this.f34766a;
        if (c10588n == null) {
            C2668g.b("messageActionHandler");
        }
        aa.m36239a(this, c12747i, (MessageAvatarClickingActionHandler) c10588n);
        C8490z c8490z = this.f34767b;
        if (c8490z == null) {
            C2668g.b("timestampFormatter");
        }
        ah.m36329a(this, c12747i, c8490z);
        C8458c c8458c = this.f34768c;
        if (c8458c == null) {
            C2668g.b("imageClickHandler");
        }
        C10587l c10587l = this.f34769d;
        if (c10587l == null) {
            C2668g.b("mediaUnavailableHandler");
        }
        ac.m36260a(this, c12747i, c8458c, c10587l);
        c12747i = c12747i.m50169a();
        if (c12747i instanceof ac) {
            FeedProfileChangeBioContentView.m50250a(this.f34775j, ((ac) c12747i).m42918c(), null, null, 6, null);
            return;
        }
        throw ((Throwable) new IllegalArgumentException("InboundFeedProfileChangeBioView accepts only ProfileChangeBioViewModel"));
    }
}
