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
import com.tinder.chat.view.action.C8457a;
import com.tinder.chat.view.action.ae;
import com.tinder.chat.view.model.C12747i;
import com.tinder.chat.view.model.ChatItem;
import com.tinder.profile.p365d.C14398a;
import com.tinder.spotify.views.SpotifyPlayerView.PlayerControlsClickListener;
import com.tinder.utils.au;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u0003H\u0016R\u001e\u0010\u0007\u001a\u00020\b8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u00020\u000e8\u0000XD¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u00020\u001aX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001eX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001e\u0010!\u001a\u00020\"8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u001aX\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001c¨\u0006,"}, d2 = {"Lcom/tinder/chat/view/message/OutboundFeedSpotifyView;", "Landroid/widget/RelativeLayout;", "Lcom/tinder/chat/view/message/BindableChatItemView;", "Lcom/tinder/chat/view/model/ActivityMessageViewModel;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "audioClickHandler", "Lcom/tinder/chat/view/action/ActivityMessageAudioClickHandler;", "getAudioClickHandler$Tinder_release", "()Lcom/tinder/chat/view/action/ActivityMessageAudioClickHandler;", "setAudioClickHandler$Tinder_release", "(Lcom/tinder/chat/view/action/ActivityMessageAudioClickHandler;)V", "bubbleDrawableId", "", "getBubbleDrawableId$Tinder_release", "()I", "messageActionHandler", "Lcom/tinder/chat/view/action/OutboundActivityMessageViewActionHandler;", "getMessageActionHandler$Tinder_release", "()Lcom/tinder/chat/view/action/OutboundActivityMessageViewActionHandler;", "setMessageActionHandler$Tinder_release", "(Lcom/tinder/chat/view/action/OutboundActivityMessageViewActionHandler;)V", "spotifyContentView", "Lcom/tinder/chat/view/message/SpotifyChatContentView;", "textMessageContentView", "Landroid/widget/TextView;", "getTextMessageContentView$Tinder_release", "()Landroid/widget/TextView;", "textSize", "", "getTextSize$Tinder_release", "()F", "timestampFormatter", "Lcom/tinder/chat/view/message/MessageTimestampFormatter;", "getTimestampFormatter$Tinder_release", "()Lcom/tinder/chat/view/message/MessageTimestampFormatter;", "setTimestampFormatter$Tinder_release", "(Lcom/tinder/chat/view/message/MessageTimestampFormatter;)V", "timestampView", "getTimestampView$Tinder_release", "bind", "", "viewModel", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class ba extends RelativeLayout implements BindableChatItemView<C12747i> {
    @Inject
    @NotNull
    /* renamed from: a */
    public ae f34642a;
    @Inject
    @NotNull
    /* renamed from: b */
    public C8490z f34643b;
    @Inject
    @NotNull
    /* renamed from: c */
    public C8457a f34644c;
    /* renamed from: d */
    private final float f34645d = au.a(this, R.dimen.text_s);
    @DrawableRes
    /* renamed from: e */
    private final int f34646e = R.drawable.chat_message_outbound_bubble_background_batch_start;
    @NotNull
    /* renamed from: f */
    private final TextView f34647f;
    @NotNull
    /* renamed from: g */
    private final TextView f34648g;
    /* renamed from: h */
    private final SpotifyChatContentView f34649h;
    /* renamed from: i */
    private HashMap f34650i;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0006"}, d2 = {"com/tinder/chat/view/message/OutboundFeedSpotifyView$bind$playerControlsClickListener$1", "Lcom/tinder/spotify/views/SpotifyPlayerView$PlayerControlsClickListener;", "(Lcom/tinder/chat/view/message/OutboundFeedSpotifyView;Lcom/tinder/chat/view/model/ActivityMessageViewModel;)V", "onPlayClicked", "", "onStopClicked", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.view.message.ba$a */
    public static final class C10607a implements PlayerControlsClickListener {
        /* renamed from: a */
        final /* synthetic */ ba f34640a;
        /* renamed from: b */
        final /* synthetic */ C12747i f34641b;

        C10607a(ba baVar, C12747i c12747i) {
            this.f34640a = baVar;
            this.f34641b = c12747i;
        }

        public void onPlayClicked() {
            this.f34640a.getAudioClickHandler$Tinder_release().m36195a(this.f34641b);
        }

        public void onStopClicked() {
            this.f34640a.getAudioClickHandler$Tinder_release().m36196b(this.f34641b);
        }
    }

    /* renamed from: a */
    public View m42797a(int i) {
        if (this.f34650i == null) {
            this.f34650i = new HashMap();
        }
        View view = (View) this.f34650i.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f34650i.put(Integer.valueOf(i), view);
        return view;
    }

    public ba(@NotNull Context context) {
        C2668g.b(context, "context");
        super(context);
        Context a = C14398a.a(context);
        if (a == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.chat.injection.provider.ChatActivitySubcomponentProvider");
        }
        ((ChatActivitySubcomponentProvider) a).provideChatActivityComponent().inject(this);
        View.inflate(context, R.layout.chat_activity_feed_outbound_spotify_view, this);
        setLayoutParams(new LayoutParams(-1, -2));
        TextView textView = (TextView) m42797a(C6248a.chatTextMessageContent);
        C2668g.a(textView, "chatTextMessageContent");
        this.f34647f = textView;
        textView = (TextView) m42797a(C6248a.chatMessageTimestamp);
        C2668g.a(textView, "chatMessageTimestamp");
        this.f34648g = textView;
        SpotifyChatContentView spotifyChatContentView = (SpotifyChatContentView) m42797a(C6248a.chatActivityFeedSpotifyContent);
        C2668g.a(spotifyChatContentView, "chatActivityFeedSpotifyContent");
        this.f34649h = spotifyChatContentView;
    }

    public /* synthetic */ void bind(ChatItem chatItem) {
        m42798a((C12747i) chatItem);
    }

    @NotNull
    public final ae getMessageActionHandler$Tinder_release() {
        ae aeVar = this.f34642a;
        if (aeVar == null) {
            C2668g.b("messageActionHandler");
        }
        return aeVar;
    }

    public final void setMessageActionHandler$Tinder_release(@NotNull ae aeVar) {
        C2668g.b(aeVar, "<set-?>");
        this.f34642a = aeVar;
    }

    @NotNull
    public final C8490z getTimestampFormatter$Tinder_release() {
        C8490z c8490z = this.f34643b;
        if (c8490z == null) {
            C2668g.b("timestampFormatter");
        }
        return c8490z;
    }

    public final void setTimestampFormatter$Tinder_release(@NotNull C8490z c8490z) {
        C2668g.b(c8490z, "<set-?>");
        this.f34643b = c8490z;
    }

    @NotNull
    public final C8457a getAudioClickHandler$Tinder_release() {
        C8457a c8457a = this.f34644c;
        if (c8457a == null) {
            C2668g.b("audioClickHandler");
        }
        return c8457a;
    }

    public final void setAudioClickHandler$Tinder_release(@NotNull C8457a c8457a) {
        C2668g.b(c8457a, "<set-?>");
        this.f34644c = c8457a;
    }

    public final float getTextSize$Tinder_release() {
        return this.f34645d;
    }

    public final int getBubbleDrawableId$Tinder_release() {
        return this.f34646e;
    }

    @NotNull
    public final TextView getTextMessageContentView$Tinder_release() {
        return this.f34647f;
    }

    @NotNull
    public final TextView getTimestampView$Tinder_release() {
        return this.f34648g;
    }

    /* renamed from: a */
    public void m42798a(@NotNull C12747i c12747i) {
        C2668g.b(c12747i, "viewModel");
        ae aeVar = this.f34642a;
        if (aeVar == null) {
            C2668g.b("messageActionHandler");
        }
        ad.m36279a(this, c12747i, aeVar);
        this.f34649h.m50161a(c12747i.m50169a(), new C10607a(this, c12747i));
        C8490z c8490z = this.f34643b;
        if (c8490z == null) {
            C2668g.b("timestampFormatter");
        }
        ah.m36322a(this, c12747i, c8490z);
    }
}
