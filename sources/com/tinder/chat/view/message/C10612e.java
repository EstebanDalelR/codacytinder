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
import com.tinder.chat.view.action.C8460f;
import com.tinder.chat.view.action.MessageAvatarClickingActionHandler;
import com.tinder.chat.view.model.C10639h;
import com.tinder.chat.view.model.C10643r;
import com.tinder.chat.view.model.C12747i;
import com.tinder.chat.view.model.C8492a;
import com.tinder.chat.view.model.C8499q;
import com.tinder.chat.view.model.ChatItem;
import com.tinder.feed.view.feed.C9492d;
import com.tinder.loops.OnMediaContentLoadedListener;
import com.tinder.profile.p365d.C14398a;
import com.tinder.utils.au;
import com.tinder.video.view.MediaView;
import com.tinder.video.view.MediaView.VideoClickListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u0003H\u0016J\u0018\u00108\u001a\u0002062\u0006\u00107\u001a\u00020\u00032\u0006\u0010/\u001a\u000200H\u0002R\u0014\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\f8\u0000XD¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u00020\u001a8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020 X\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020$X\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u001e\u0010'\u001a\u00020(8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020 X\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\"R\u001e\u0010/\u001a\u0002008\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u00069"}, d2 = {"Lcom/tinder/chat/view/message/InboundFeedInstagramVideoView;", "Landroid/widget/RelativeLayout;", "Lcom/tinder/chat/view/message/BindableChatItemView;", "Lcom/tinder/chat/view/model/ActivityMessageViewModel;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "avatarView", "Lcom/tinder/chat/view/ChatAvatarView;", "getAvatarView$Tinder_release", "()Lcom/tinder/chat/view/ChatAvatarView;", "bubbleDrawableId", "", "getBubbleDrawableId$Tinder_release", "()I", "mediaUnavailableHandler", "Lcom/tinder/chat/view/action/InboundActivityMessageMediaUnavailableHandler;", "getMediaUnavailableHandler$Tinder_release", "()Lcom/tinder/chat/view/action/InboundActivityMessageMediaUnavailableHandler;", "setMediaUnavailableHandler$Tinder_release", "(Lcom/tinder/chat/view/action/InboundActivityMessageMediaUnavailableHandler;)V", "mediaView", "Lcom/tinder/video/view/MediaView;", "getMediaView$Tinder_release", "()Lcom/tinder/video/view/MediaView;", "messageActionHandler", "Lcom/tinder/chat/view/action/InboundActivityMessageViewActionHandler;", "getMessageActionHandler$Tinder_release", "()Lcom/tinder/chat/view/action/InboundActivityMessageViewActionHandler;", "setMessageActionHandler$Tinder_release", "(Lcom/tinder/chat/view/action/InboundActivityMessageViewActionHandler;)V", "textMessageContentView", "Landroid/widget/TextView;", "getTextMessageContentView$Tinder_release", "()Landroid/widget/TextView;", "textSize", "", "getTextSize$Tinder_release", "()F", "timestampFormatter", "Lcom/tinder/chat/view/message/MessageTimestampFormatter;", "getTimestampFormatter$Tinder_release", "()Lcom/tinder/chat/view/message/MessageTimestampFormatter;", "setTimestampFormatter$Tinder_release", "(Lcom/tinder/chat/view/message/MessageTimestampFormatter;)V", "timestampView", "getTimestampView$Tinder_release", "videoClickHandler", "Lcom/tinder/chat/view/action/ActivityMessageVideoClickHandler;", "getVideoClickHandler$Tinder_release", "()Lcom/tinder/chat/view/action/ActivityMessageVideoClickHandler;", "setVideoClickHandler$Tinder_release", "(Lcom/tinder/chat/view/action/ActivityMessageVideoClickHandler;)V", "bind", "", "viewModel", "bindMediaView", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.chat.view.message.e */
public final class C10612e extends RelativeLayout implements BindableChatItemView<C12747i> {
    @Inject
    @NotNull
    /* renamed from: a */
    public C10588n f34702a;
    @Inject
    @NotNull
    /* renamed from: b */
    public C8490z f34703b;
    @Inject
    @NotNull
    /* renamed from: c */
    public C8460f f34704c;
    @Inject
    @NotNull
    /* renamed from: d */
    public C10587l f34705d;
    /* renamed from: e */
    private final float f34706e = au.a(this, R.dimen.text_s);
    @DrawableRes
    /* renamed from: f */
    private final int f34707f = R.drawable.chat_activity_feed_message_inbound_bubble_background;
    @NotNull
    /* renamed from: g */
    private final TextView f34708g;
    @NotNull
    /* renamed from: h */
    private final ChatAvatarView f34709h;
    @NotNull
    /* renamed from: i */
    private final TextView f34710i;
    @NotNull
    /* renamed from: j */
    private final MediaView f34711j;
    /* renamed from: k */
    private HashMap f34712k;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005¸\u0006\u0000"}, d2 = {"com/tinder/chat/view/message/InboundFeedInstagramVideoView$bindMediaView$1$videoClickListener$1", "Lcom/tinder/video/view/MediaView$VideoClickListener;", "(Lcom/tinder/chat/view/message/InboundFeedInstagramVideoView$bindMediaView$1;)V", "onClicked", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.view.message.e$a */
    public static final class C10610a implements VideoClickListener {
        /* renamed from: a */
        final /* synthetic */ C10612e f34696a;
        /* renamed from: b */
        final /* synthetic */ C8460f f34697b;
        /* renamed from: c */
        final /* synthetic */ C12747i f34698c;

        C10610a(C10612e c10612e, C8460f c8460f, C12747i c12747i) {
            this.f34696a = c10612e;
            this.f34697b = c8460f;
            this.f34698c = c12747i;
        }

        public void onClicked() {
            this.f34697b.m36205a(this.f34698c);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b¸\u0006\u0000"}, d2 = {"com/tinder/chat/view/message/InboundFeedInstagramVideoView$bindMediaView$1$onMediaContentLoadedListener$1", "Lcom/tinder/loops/OnMediaContentLoadedListener;", "(Lcom/tinder/chat/view/message/InboundFeedInstagramVideoView$bindMediaView$1;)V", "onContentLoaded", "", "onErrorLoadingContent", "url", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.view.message.e$b */
    public static final class C10611b implements OnMediaContentLoadedListener {
        /* renamed from: a */
        final /* synthetic */ C10612e f34699a;
        /* renamed from: b */
        final /* synthetic */ C8460f f34700b;
        /* renamed from: c */
        final /* synthetic */ C12747i f34701c;

        public void onContentLoaded() {
        }

        C10611b(C10612e c10612e, C8460f c8460f, C12747i c12747i) {
            this.f34699a = c10612e;
            this.f34700b = c8460f;
            this.f34701c = c12747i;
        }

        public void onErrorLoadingContent(@NotNull String str) {
            C2668g.b(str, "url");
            this.f34699a.getMediaUnavailableHandler$Tinder_release().onMediaUnavailable(this.f34701c, str);
        }
    }

    /* renamed from: a */
    public View m42828a(int i) {
        if (this.f34712k == null) {
            this.f34712k = new HashMap();
        }
        View view = (View) this.f34712k.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f34712k.put(Integer.valueOf(i), view);
        return view;
    }

    public C10612e(@NotNull Context context) {
        C2668g.b(context, "context");
        super(context);
        Context a = C14398a.a(context);
        if (a == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.chat.injection.provider.ChatActivitySubcomponentProvider");
        }
        ((ChatActivitySubcomponentProvider) a).provideChatActivityComponent().inject(this);
        View.inflate(context, R.layout.chat_activity_feed_inbound_instagram_video_view, this);
        setLayoutParams(new LayoutParams(-1, -2));
        TextView textView = (TextView) m42828a(C6248a.chatTextMessageContent);
        C2668g.a(textView, "chatTextMessageContent");
        this.f34708g = textView;
        ChatAvatarView chatAvatarView = (ChatAvatarView) m42828a(C6248a.chatMessageAvatar);
        C2668g.a(chatAvatarView, "chatMessageAvatar");
        this.f34709h = chatAvatarView;
        textView = (TextView) m42828a(C6248a.chatMessageTimestamp);
        C2668g.a(textView, "chatMessageTimestamp");
        this.f34710i = textView;
        MediaView mediaView = (MediaView) m42828a(C6248a.chatActivityFeedPlayerContainer);
        C2668g.a(mediaView, "chatActivityFeedPlayerContainer");
        this.f34711j = mediaView;
    }

    public /* synthetic */ void bind(ChatItem chatItem) {
        m42829a((C12747i) chatItem);
    }

    @NotNull
    public final C10588n getMessageActionHandler$Tinder_release() {
        C10588n c10588n = this.f34702a;
        if (c10588n == null) {
            C2668g.b("messageActionHandler");
        }
        return c10588n;
    }

    public final void setMessageActionHandler$Tinder_release(@NotNull C10588n c10588n) {
        C2668g.b(c10588n, "<set-?>");
        this.f34702a = c10588n;
    }

    @NotNull
    public final C8490z getTimestampFormatter$Tinder_release() {
        C8490z c8490z = this.f34703b;
        if (c8490z == null) {
            C2668g.b("timestampFormatter");
        }
        return c8490z;
    }

    public final void setTimestampFormatter$Tinder_release(@NotNull C8490z c8490z) {
        C2668g.b(c8490z, "<set-?>");
        this.f34703b = c8490z;
    }

    @NotNull
    public final C8460f getVideoClickHandler$Tinder_release() {
        C8460f c8460f = this.f34704c;
        if (c8460f == null) {
            C2668g.b("videoClickHandler");
        }
        return c8460f;
    }

    public final void setVideoClickHandler$Tinder_release(@NotNull C8460f c8460f) {
        C2668g.b(c8460f, "<set-?>");
        this.f34704c = c8460f;
    }

    @NotNull
    public final C10587l getMediaUnavailableHandler$Tinder_release() {
        C10587l c10587l = this.f34705d;
        if (c10587l == null) {
            C2668g.b("mediaUnavailableHandler");
        }
        return c10587l;
    }

    public final void setMediaUnavailableHandler$Tinder_release(@NotNull C10587l c10587l) {
        C2668g.b(c10587l, "<set-?>");
        this.f34705d = c10587l;
    }

    public final float getTextSize$Tinder_release() {
        return this.f34706e;
    }

    public final int getBubbleDrawableId$Tinder_release() {
        return this.f34707f;
    }

    @NotNull
    public final TextView getTextMessageContentView$Tinder_release() {
        return this.f34708g;
    }

    @NotNull
    public final ChatAvatarView getAvatarView$Tinder_release() {
        return this.f34709h;
    }

    @NotNull
    public final TextView getTimestampView$Tinder_release() {
        return this.f34710i;
    }

    @NotNull
    public final MediaView getMediaView$Tinder_release() {
        return this.f34711j;
    }

    /* renamed from: a */
    public void m42829a(@NotNull C12747i c12747i) {
        C2668g.b(c12747i, "viewModel");
        C10588n c10588n = this.f34702a;
        if (c10588n == null) {
            C2668g.b("messageActionHandler");
        }
        ad.m36281a(this, c12747i, c10588n);
        c10588n = this.f34702a;
        if (c10588n == null) {
            C2668g.b("messageActionHandler");
        }
        aa.m36235a(this, c12747i, (MessageAvatarClickingActionHandler) c10588n);
        C8490z c8490z = this.f34703b;
        if (c8490z == null) {
            C2668g.b("timestampFormatter");
        }
        ah.m36325a(this, c12747i, c8490z);
        C8460f c8460f = this.f34704c;
        if (c8460f == null) {
            C2668g.b("videoClickHandler");
        }
        m42827a(c12747i, c8460f);
    }

    /* renamed from: a */
    private final void m42827a(C12747i c12747i, C8460f c8460f) {
        C8492a a = c12747i.m50169a();
        if (a == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.chat.view.model.InstagramNewMediaViewModel");
        }
        List b;
        List list;
        C10610a c10610a;
        C8499q c8499q = (C8499q) C19301m.g(((C10643r) a).m42956f());
        if (c8499q != null) {
            b = c8499q.m36420b();
            if (b != null) {
                Collection arrayList = new ArrayList();
                for (Object next : b) {
                    if (next instanceof C10639h) {
                        arrayList.add(next);
                    }
                }
                list = (List) arrayList;
                if (list != null) {
                    list = C19301m.a();
                }
                b = C9492d.m39695b(list);
                c10610a = new C10610a(this, c8460f, c12747i);
                this.f34711j.a(b, C19301m.a(), new C10611b(this, c8460f, c12747i), c10610a);
            }
        }
        list = null;
        if (list != null) {
            list = C19301m.a();
        }
        b = C9492d.m39695b(list);
        c10610a = new C10610a(this, c8460f, c12747i);
        this.f34711j.a(b, C19301m.a(), new C10611b(this, c8460f, c12747i), c10610a);
    }
}
