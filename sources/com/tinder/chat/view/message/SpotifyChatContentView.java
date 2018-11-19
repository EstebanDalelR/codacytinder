package com.tinder.chat.view.message;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.tinder.C6250b.C6248a;
import com.tinder.R;
import com.tinder.chat.view.model.C8492a;
import com.tinder.chat.view.model.C8496j;
import com.tinder.chat.view.model.af;
import com.tinder.chat.view.model.aj;
import com.tinder.chat.view.model.ak;
import com.tinder.common.feed.view.FeedImageContentView;
import com.tinder.common.feed.view.SpotifyTrackPlayerView;
import com.tinder.common.feed.view.SpotifyTrackPlayerView.TrackType;
import com.tinder.spotify.views.SpotifyPlayerView.PlayerControlsClickListener;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/tinder/chat/view/message/SpotifyChatContentView;", "Lcom/tinder/common/feed/view/FeedImageContentView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "spotifyTrackPlayer", "Lcom/tinder/chat/view/message/SpotifyChatTrackPlayerView;", "bind", "", "eventViewModel", "Lcom/tinder/chat/view/model/ActivityEventViewModel;", "playerControlsClickListener", "Lcom/tinder/spotify/views/SpotifyPlayerView$PlayerControlsClickListener;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class SpotifyChatContentView extends FeedImageContentView {
    /* renamed from: b */
    private final SpotifyChatTrackPlayerView f41111b;
    /* renamed from: c */
    private HashMap f41112c;

    @JvmOverloads
    public SpotifyChatContentView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public SpotifyChatContentView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public View mo11001a(int i) {
        if (this.f41112c == null) {
            this.f41112c = new HashMap();
        }
        View view = (View) this.f41112c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f41112c.put(Integer.valueOf(i), view);
        return view;
    }

    @JvmOverloads
    public /* synthetic */ SpotifyChatContentView(Context context, AttributeSet attributeSet, int i, int i2, C15823e c15823e) {
        if ((i2 & 2) != null) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    @JvmOverloads
    public SpotifyChatContentView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        C2668g.b(context, "context");
        super(context, attributeSet, i);
        View.inflate(context, R.layout.chat_activity_feed_spotify_content_view, this);
        setLayoutParams(new LayoutParams(-1, -2));
        SpotifyChatTrackPlayerView spotifyChatTrackPlayerView = (SpotifyChatTrackPlayerView) mo11001a(C6248a.feedSpotifyTrackPlayer);
        C2668g.a(spotifyChatTrackPlayerView, "feedSpotifyTrackPlayer");
        this.f41111b = spotifyChatTrackPlayerView;
        setImageCornerRadius$Tinder_release(getResources().getDimensionPixelSize(R.dimen.space_xs));
        setClipChildren(false);
        setClipToPadding(false);
    }

    /* renamed from: a */
    public final void m50161a(@NotNull C8492a c8492a, @NotNull PlayerControlsClickListener playerControlsClickListener) {
        C2668g.b(c8492a, "eventViewModel");
        C2668g.b(playerControlsClickListener, "playerControlsClickListener");
        if (c8492a instanceof af) {
            af afVar = (af) c8492a;
            SpotifyTrackPlayerView.m42993a(this.f41111b, C8496j.m36390a((ak) C19301m.f(afVar.m42930c())), TrackType.TOP_ARTISTS, playerControlsClickListener, null, 8, null);
            FeedImageContentView.m42982a(this, afVar.m42931d().m42942a(), null, 2, null);
        } else if (c8492a instanceof aj) {
            aj ajVar = (aj) c8492a;
            SpotifyTrackPlayerView.m42993a(this.f41111b, C8496j.m36390a(ajVar.m42934c()), TrackType.ANTHEM, playerControlsClickListener, null, 8, null);
            FeedImageContentView.m42982a(this, ajVar.m42935d().m42942a(), null, 2, null);
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Can't bind ");
            stringBuilder.append(c8492a.getClass().getName());
            stringBuilder.append(" to ");
            stringBuilder.append("SpotifyChatContentView. Expected ProfileSpotifyTopArtistViewModel ");
            stringBuilder.append("or SpotifyNewAnthemViewModel");
            playerControlsClickListener = new IllegalArgumentException(stringBuilder.toString());
        }
    }
}
