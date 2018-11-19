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
import com.tinder.chat.view.action.C8460f;
import com.tinder.chat.view.action.ac;
import com.tinder.chat.view.action.ae;
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

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u0003H\u0016J\u0018\u00104\u001a\u0002022\u0006\u00103\u001a\u00020\u00032\u0006\u0010+\u001a\u00020,H\u0002R\u0016\u0010\u0007\u001a\u00020\b8\u0000XD¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u001cX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020 X\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u001e\u0010#\u001a\u00020$8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\u001cX\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001eR\u001e\u0010+\u001a\u00020,8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u00065"}, d2 = {"Lcom/tinder/chat/view/message/OutboundFeedInstagramVideoView;", "Landroid/widget/RelativeLayout;", "Lcom/tinder/chat/view/message/BindableChatItemView;", "Lcom/tinder/chat/view/model/ActivityMessageViewModel;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "bubbleDrawableId", "", "getBubbleDrawableId$Tinder_release", "()I", "mediaUnavailableHandler", "Lcom/tinder/chat/view/action/OutboundActivityMessageMediaUnavailableHandler;", "getMediaUnavailableHandler$Tinder_release", "()Lcom/tinder/chat/view/action/OutboundActivityMessageMediaUnavailableHandler;", "setMediaUnavailableHandler$Tinder_release", "(Lcom/tinder/chat/view/action/OutboundActivityMessageMediaUnavailableHandler;)V", "mediaView", "Lcom/tinder/video/view/MediaView;", "getMediaView$Tinder_release", "()Lcom/tinder/video/view/MediaView;", "messageActionHandler", "Lcom/tinder/chat/view/action/OutboundActivityMessageViewActionHandler;", "getMessageActionHandler$Tinder_release", "()Lcom/tinder/chat/view/action/OutboundActivityMessageViewActionHandler;", "setMessageActionHandler$Tinder_release", "(Lcom/tinder/chat/view/action/OutboundActivityMessageViewActionHandler;)V", "textMessageContentView", "Landroid/widget/TextView;", "getTextMessageContentView$Tinder_release", "()Landroid/widget/TextView;", "textSize", "", "getTextSize$Tinder_release", "()F", "timestampFormatter", "Lcom/tinder/chat/view/message/MessageTimestampFormatter;", "getTimestampFormatter$Tinder_release", "()Lcom/tinder/chat/view/message/MessageTimestampFormatter;", "setTimestampFormatter$Tinder_release", "(Lcom/tinder/chat/view/message/MessageTimestampFormatter;)V", "timestampView", "getTimestampView$Tinder_release", "videoClickHandler", "Lcom/tinder/chat/view/action/ActivityMessageVideoClickHandler;", "getVideoClickHandler$Tinder_release", "()Lcom/tinder/chat/view/action/ActivityMessageVideoClickHandler;", "setVideoClickHandler$Tinder_release", "(Lcom/tinder/chat/view/action/ActivityMessageVideoClickHandler;)V", "bind", "", "viewModel", "bindMediaView", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class am extends RelativeLayout implements BindableChatItemView<C12747i> {
    @Inject
    @NotNull
    /* renamed from: a */
    public ae f34534a;
    @Inject
    @NotNull
    /* renamed from: b */
    public C8490z f34535b;
    @Inject
    @NotNull
    /* renamed from: c */
    public C8460f f34536c;
    @Inject
    @NotNull
    /* renamed from: d */
    public ac f34537d;
    /* renamed from: e */
    private final float f34538e = au.a(this, R.dimen.text_s);
    @DrawableRes
    /* renamed from: f */
    private final int f34539f = R.drawable.chat_message_outbound_bubble_background_batch_start;
    @NotNull
    /* renamed from: g */
    private final TextView f34540g;
    @NotNull
    /* renamed from: h */
    private final TextView f34541h;
    @NotNull
    /* renamed from: i */
    private final MediaView f34542i;
    /* renamed from: j */
    private HashMap f34543j;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005¸\u0006\u0000"}, d2 = {"com/tinder/chat/view/message/OutboundFeedInstagramVideoView$bindMediaView$1$videoClickListener$1", "Lcom/tinder/video/view/MediaView$VideoClickListener;", "(Lcom/tinder/chat/view/message/OutboundFeedInstagramVideoView$bindMediaView$1;)V", "onClicked", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.view.message.am$a */
    public static final class C10602a implements VideoClickListener {
        /* renamed from: a */
        final /* synthetic */ am f34528a;
        /* renamed from: b */
        final /* synthetic */ C8460f f34529b;
        /* renamed from: c */
        final /* synthetic */ C12747i f34530c;

        C10602a(am amVar, C8460f c8460f, C12747i c12747i) {
            this.f34528a = amVar;
            this.f34529b = c8460f;
            this.f34530c = c12747i;
        }

        public void onClicked() {
            this.f34529b.m36205a(this.f34530c);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b¸\u0006\u0000"}, d2 = {"com/tinder/chat/view/message/OutboundFeedInstagramVideoView$bindMediaView$1$onMediaContentLoadedListener$1", "Lcom/tinder/loops/OnMediaContentLoadedListener;", "(Lcom/tinder/chat/view/message/OutboundFeedInstagramVideoView$bindMediaView$1;)V", "onContentLoaded", "", "onErrorLoadingContent", "url", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.view.message.am$b */
    public static final class C10603b implements OnMediaContentLoadedListener {
        /* renamed from: a */
        final /* synthetic */ am f34531a;
        /* renamed from: b */
        final /* synthetic */ C8460f f34532b;
        /* renamed from: c */
        final /* synthetic */ C12747i f34533c;

        public void onContentLoaded() {
        }

        C10603b(am amVar, C8460f c8460f, C12747i c12747i) {
            this.f34531a = amVar;
            this.f34532b = c8460f;
            this.f34533c = c12747i;
        }

        public void onErrorLoadingContent(@NotNull String str) {
            C2668g.b(str, "url");
            this.f34531a.getMediaUnavailableHandler$Tinder_release().onMediaUnavailable(this.f34533c, str);
        }
    }

    /* renamed from: a */
    public View m42743a(int i) {
        if (this.f34543j == null) {
            this.f34543j = new HashMap();
        }
        View view = (View) this.f34543j.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f34543j.put(Integer.valueOf(i), view);
        return view;
    }

    public am(@NotNull Context context) {
        C2668g.b(context, "context");
        super(context);
        Context a = C14398a.a(context);
        if (a == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.chat.injection.provider.ChatActivitySubcomponentProvider");
        }
        ((ChatActivitySubcomponentProvider) a).provideChatActivityComponent().inject(this);
        View.inflate(context, R.layout.chat_activity_feed_outbound_instagram_video_view, this);
        setLayoutParams(new LayoutParams(-1, -2));
        TextView textView = (TextView) m42743a(C6248a.chatTextMessageContent);
        C2668g.a(textView, "chatTextMessageContent");
        this.f34540g = textView;
        textView = (TextView) m42743a(C6248a.chatMessageTimestamp);
        C2668g.a(textView, "chatMessageTimestamp");
        this.f34541h = textView;
        MediaView mediaView = (MediaView) m42743a(C6248a.chatActivityFeedPlayerContainer);
        C2668g.a(mediaView, "chatActivityFeedPlayerContainer");
        this.f34542i = mediaView;
    }

    public /* synthetic */ void bind(ChatItem chatItem) {
        m42744a((C12747i) chatItem);
    }

    @NotNull
    public final ae getMessageActionHandler$Tinder_release() {
        ae aeVar = this.f34534a;
        if (aeVar == null) {
            C2668g.b("messageActionHandler");
        }
        return aeVar;
    }

    public final void setMessageActionHandler$Tinder_release(@NotNull ae aeVar) {
        C2668g.b(aeVar, "<set-?>");
        this.f34534a = aeVar;
    }

    @NotNull
    public final C8490z getTimestampFormatter$Tinder_release() {
        C8490z c8490z = this.f34535b;
        if (c8490z == null) {
            C2668g.b("timestampFormatter");
        }
        return c8490z;
    }

    public final void setTimestampFormatter$Tinder_release(@NotNull C8490z c8490z) {
        C2668g.b(c8490z, "<set-?>");
        this.f34535b = c8490z;
    }

    @NotNull
    public final C8460f getVideoClickHandler$Tinder_release() {
        C8460f c8460f = this.f34536c;
        if (c8460f == null) {
            C2668g.b("videoClickHandler");
        }
        return c8460f;
    }

    public final void setVideoClickHandler$Tinder_release(@NotNull C8460f c8460f) {
        C2668g.b(c8460f, "<set-?>");
        this.f34536c = c8460f;
    }

    @NotNull
    public final ac getMediaUnavailableHandler$Tinder_release() {
        ac acVar = this.f34537d;
        if (acVar == null) {
            C2668g.b("mediaUnavailableHandler");
        }
        return acVar;
    }

    public final void setMediaUnavailableHandler$Tinder_release(@NotNull ac acVar) {
        C2668g.b(acVar, "<set-?>");
        this.f34537d = acVar;
    }

    public final float getTextSize$Tinder_release() {
        return this.f34538e;
    }

    public final int getBubbleDrawableId$Tinder_release() {
        return this.f34539f;
    }

    @NotNull
    public final TextView getTextMessageContentView$Tinder_release() {
        return this.f34540g;
    }

    @NotNull
    public final TextView getTimestampView$Tinder_release() {
        return this.f34541h;
    }

    @NotNull
    public final MediaView getMediaView$Tinder_release() {
        return this.f34542i;
    }

    /* renamed from: a */
    public void m42744a(@NotNull C12747i c12747i) {
        C2668g.b(c12747i, "viewModel");
        ae aeVar = this.f34534a;
        if (aeVar == null) {
            C2668g.b("messageActionHandler");
        }
        ad.m36272a(this, c12747i, aeVar);
        C8490z c8490z = this.f34535b;
        if (c8490z == null) {
            C2668g.b("timestampFormatter");
        }
        ah.m36315a(this, c12747i, c8490z);
        C8460f c8460f = this.f34536c;
        if (c8460f == null) {
            C2668g.b("videoClickHandler");
        }
        m42742a(c12747i, c8460f);
    }

    /* renamed from: a */
    private final void m42742a(C12747i c12747i, C8460f c8460f) {
        C8492a a = c12747i.m50169a();
        if (a == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.chat.view.model.InstagramNewMediaViewModel");
        }
        List b;
        List list;
        C10602a c10602a;
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
                c10602a = new C10602a(this, c8460f, c12747i);
                this.f34542i.a(b, C19301m.a(), new C10603b(this, c8460f, c12747i), c10602a);
            }
        }
        list = null;
        if (list != null) {
            list = C19301m.a();
        }
        b = C9492d.m39695b(list);
        c10602a = new C10602a(this, c8460f, c12747i);
        this.f34542i.a(b, C19301m.a(), new C10603b(this, c8460f, c12747i), c10602a);
    }
}
