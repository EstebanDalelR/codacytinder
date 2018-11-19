package com.tinder.settings.feed.view;

import android.content.Context;
import android.databinding.BindingAdapter;
import android.util.AttributeSet;
import butterknife.BindString;
import butterknife.ButterKnife;
import com.tinder.api.ManagerWebServices;
import com.tinder.domain.settings.feed.model.FeedSharingOption;
import com.tinder.domain.settings.feed.model.FeedSharingType;
import com.tinder.settings.views.SwitchRowView;
import com.tinder.settings.views.SwitchRowView$CheckStatusListener;
import java.util.Map;
import kotlin.C15811g;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000  2\u00020\u0001:\u0002 !B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u000eR\u001e\u0010\u0007\u001a\u00020\b8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u00020\b8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\n\"\u0004\b\u0011\u0010\fR\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\b0\u0013X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0015\u001a\u00020\b8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\n\"\u0004\b\u0017\u0010\fR\u001e\u0010\u0018\u001a\u00020\b8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\n\"\u0004\b\u001a\u0010\f¨\u0006\""}, d2 = {"Lcom/tinder/settings/feed/view/FeedSharingOptionItemView;", "Lcom/tinder/settings/views/SwitchRowView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "instagram", "", "getInstagram$Tinder_release", "()Ljava/lang/String;", "setInstagram$Tinder_release", "(Ljava/lang/String;)V", "onFeedSharingOptionChangedListener", "Lcom/tinder/settings/feed/view/FeedSharingOptionItemView$OnFeedSharingOptionChangedListener;", "profileUpdates", "getProfileUpdates$Tinder_release", "setProfileUpdates$Tinder_release", "sharingOptionStringMap", "", "Lcom/tinder/domain/settings/feed/model/FeedSharingType;", "spotifyAnthem", "getSpotifyAnthem$Tinder_release", "setSpotifyAnthem$Tinder_release", "topArtists", "getTopArtists$Tinder_release", "setTopArtists$Tinder_release", "bindViewModel", "", "feedSharingOption", "Lcom/tinder/domain/settings/feed/model/FeedSharingOption;", "setOnFeedSharingOptionChangedListener", "Companion", "OnFeedSharingOptionChangedListener", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class FeedSharingOptionItemView extends SwitchRowView {
    /* renamed from: a */
    public static final C14881a f51513a = new C14881a();
    /* renamed from: c */
    private OnFeedSharingOptionChangedListener f51514c;
    /* renamed from: d */
    private final Map<FeedSharingType, String> f51515d;
    @BindString(2131821085)
    @NotNull
    public String instagram;
    @BindString(2131821086)
    @NotNull
    public String profileUpdates;
    @BindString(2131821087)
    @NotNull
    public String spotifyAnthem;
    @BindString(2131821088)
    @NotNull
    public String topArtists;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/tinder/settings/feed/view/FeedSharingOptionItemView$OnFeedSharingOptionChangedListener;", "", "onSharingOptionChanged", "", "feedSharingOption", "Lcom/tinder/domain/settings/feed/model/FeedSharingOption;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public interface OnFeedSharingOptionChangedListener {
        void onSharingOptionChanged(@NotNull FeedSharingOption feedSharingOption);
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\f"}, d2 = {"Lcom/tinder/settings/feed/view/FeedSharingOptionItemView$Companion;", "", "()V", "bindViewModel", "", "feedSharingOptionItemView", "Lcom/tinder/settings/feed/view/FeedSharingOptionItemView;", "sharingOptionItem", "Lcom/tinder/domain/settings/feed/model/FeedSharingOption;", "setOnFeedSharingOptionChangedListener", "onFeedSharingOptionChangedListener", "Lcom/tinder/settings/feed/view/FeedSharingOptionItemView$OnFeedSharingOptionChangedListener;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.settings.feed.view.FeedSharingOptionItemView$a */
    public static final class C14881a {
        private C14881a() {
        }

        @JvmStatic
        @BindingAdapter({"viewModel"})
        /* renamed from: a */
        public final void m56324a(@NotNull FeedSharingOptionItemView feedSharingOptionItemView, @NotNull FeedSharingOption feedSharingOption) {
            C2668g.b(feedSharingOptionItemView, "feedSharingOptionItemView");
            C2668g.b(feedSharingOption, "sharingOptionItem");
            feedSharingOptionItemView.m62096a(feedSharingOption);
        }

        @JvmStatic
        @BindingAdapter({"onFeedSharingOptionChangedListener"})
        /* renamed from: a */
        public final void m56325a(@NotNull FeedSharingOptionItemView feedSharingOptionItemView, @NotNull OnFeedSharingOptionChangedListener onFeedSharingOptionChangedListener) {
            C2668g.b(feedSharingOptionItemView, "feedSharingOptionItemView");
            C2668g.b(onFeedSharingOptionChangedListener, "onFeedSharingOptionChangedListener");
            feedSharingOptionItemView.setOnFeedSharingOptionChangedListener(onFeedSharingOptionChangedListener);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0006"}, d2 = {"com/tinder/settings/feed/view/FeedSharingOptionItemView$bindViewModel$1", "Lcom/tinder/settings/views/SwitchRowView$CheckStatusListener;", "(Lcom/tinder/settings/feed/view/FeedSharingOptionItemView;Lcom/tinder/domain/settings/feed/model/FeedSharingOption;)V", "onChecked", "", "onUnChecked", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.settings.feed.view.FeedSharingOptionItemView$b */
    public static final class C16636b implements SwitchRowView$CheckStatusListener {
        /* renamed from: a */
        final /* synthetic */ FeedSharingOptionItemView f51511a;
        /* renamed from: b */
        final /* synthetic */ FeedSharingOption f51512b;

        C16636b(FeedSharingOptionItemView feedSharingOptionItemView, FeedSharingOption feedSharingOption) {
            this.f51511a = feedSharingOptionItemView;
            this.f51512b = feedSharingOption;
        }

        public void onChecked() {
            FeedSharingOptionItemView.m62093a(this.f51511a).onSharingOptionChanged(new FeedSharingOption(this.f51512b.getFeedSharingType(), true));
        }

        public void onUnChecked() {
            FeedSharingOptionItemView.m62093a(this.f51511a).onSharingOptionChanged(new FeedSharingOption(this.f51512b.getFeedSharingType(), false));
        }
    }

    @JvmStatic
    @BindingAdapter({"viewModel"})
    /* renamed from: a */
    public static final void m62094a(@NotNull FeedSharingOptionItemView feedSharingOptionItemView, @NotNull FeedSharingOption feedSharingOption) {
        f51513a.m56324a(feedSharingOptionItemView, feedSharingOption);
    }

    @JvmStatic
    @BindingAdapter({"onFeedSharingOptionChangedListener"})
    /* renamed from: a */
    public static final void m62095a(@NotNull FeedSharingOptionItemView feedSharingOptionItemView, @NotNull OnFeedSharingOptionChangedListener onFeedSharingOptionChangedListener) {
        f51513a.m56325a(feedSharingOptionItemView, onFeedSharingOptionChangedListener);
    }

    public FeedSharingOptionItemView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        C2668g.b(context, "context");
        C2668g.b(attributeSet, "attrs");
        super(context, attributeSet);
        ButterKnife.a(this);
        context = new Pair[4];
        attributeSet = FeedSharingType.PROFILE_PHOTOS;
        String str = this.profileUpdates;
        if (str == null) {
            C2668g.b("profileUpdates");
        }
        context[0] = C15811g.m59834a(attributeSet, str);
        FeedSharingType feedSharingType = FeedSharingType.INSTAGRAM;
        String str2 = this.instagram;
        if (str2 == null) {
            C2668g.b(ManagerWebServices.IG_PARAM_INSTAGRAM);
        }
        context[1] = C15811g.m59834a(feedSharingType, str2);
        feedSharingType = FeedSharingType.SPOTIFY_TOP_ARTISTS;
        str2 = this.topArtists;
        if (str2 == null) {
            C2668g.b("topArtists");
        }
        context[2] = C15811g.m59834a(feedSharingType, str2);
        feedSharingType = FeedSharingType.SPOTIFY_ANTHEM;
        str2 = this.spotifyAnthem;
        if (str2 == null) {
            C2668g.b("spotifyAnthem");
        }
        context[3] = C15811g.m59834a(feedSharingType, str2);
        this.f51515d = ah.m66889a((Pair[]) context);
    }

    @NotNull
    /* renamed from: a */
    public static final /* synthetic */ OnFeedSharingOptionChangedListener m62093a(FeedSharingOptionItemView feedSharingOptionItemView) {
        feedSharingOptionItemView = feedSharingOptionItemView.f51514c;
        if (feedSharingOptionItemView == null) {
            C2668g.b("onFeedSharingOptionChangedListener");
        }
        return feedSharingOptionItemView;
    }

    @NotNull
    public final String getProfileUpdates$Tinder_release() {
        String str = this.profileUpdates;
        if (str == null) {
            C2668g.b("profileUpdates");
        }
        return str;
    }

    public final void setProfileUpdates$Tinder_release(@NotNull String str) {
        C2668g.b(str, "<set-?>");
        this.profileUpdates = str;
    }

    @NotNull
    public final String getInstagram$Tinder_release() {
        String str = this.instagram;
        if (str == null) {
            C2668g.b(ManagerWebServices.IG_PARAM_INSTAGRAM);
        }
        return str;
    }

    public final void setInstagram$Tinder_release(@NotNull String str) {
        C2668g.b(str, "<set-?>");
        this.instagram = str;
    }

    @NotNull
    public final String getSpotifyAnthem$Tinder_release() {
        String str = this.spotifyAnthem;
        if (str == null) {
            C2668g.b("spotifyAnthem");
        }
        return str;
    }

    public final void setSpotifyAnthem$Tinder_release(@NotNull String str) {
        C2668g.b(str, "<set-?>");
        this.spotifyAnthem = str;
    }

    @NotNull
    public final String getTopArtists$Tinder_release() {
        String str = this.topArtists;
        if (str == null) {
            C2668g.b("topArtists");
        }
        return str;
    }

    public final void setTopArtists$Tinder_release(@NotNull String str) {
        C2668g.b(str, "<set-?>");
        this.topArtists = str;
    }

    /* renamed from: a */
    public final void m62096a(@NotNull FeedSharingOption feedSharingOption) {
        C2668g.b(feedSharingOption, "feedSharingOption");
        String str = (String) this.f51515d.get(feedSharingOption.getFeedSharingType());
        if (str != null) {
            setText(str);
            setChecked(feedSharingOption.getEnabled());
            setCheckStatusClickListener(new C16636b(this, feedSharingOption));
            return;
        }
        throw ((Throwable) new IllegalStateException("Sharing option string not available"));
    }

    public final void setOnFeedSharingOptionChangedListener(@NotNull OnFeedSharingOptionChangedListener onFeedSharingOptionChangedListener) {
        C2668g.b(onFeedSharingOptionChangedListener, "onFeedSharingOptionChangedListener");
        this.f51514c = onFeedSharingOptionChangedListener;
    }
}
