package com.tinder.data.profile.adapter;

import com.tinder.api.model.profile.ActivityFeedSettings;
import com.tinder.data.adapter.C2646o;
import com.tinder.domain.settings.feed.model.FeedSettings;
import com.tinder.domain.settings.feed.model.FeedSharingOption;
import com.tinder.domain.settings.feed.model.FeedSharingType;
import java.util.LinkedList;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0005J\u0014\u0010\u0006\u001a\u00020\u00022\n\u0010\u0007\u001a\u00060\u0003j\u0002`\u0004H\u0016J\u0012\u0010\b\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\t\u001a\u00020\u0002J+\u0010\n\u001a\u0004\u0018\u00010\u000b*\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0002\u0010\u0011J1\u0010\u0012\u001a\u00020\u000b*\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0013\u001a\u00020\u000bH\u0002¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/tinder/data/profile/adapter/ActivityFeedSettingsApiAdapter;", "Lcom/tinder/data/adapter/DomainApiAdapter;", "Lcom/tinder/domain/settings/feed/model/FeedSettings;", "Lcom/tinder/api/model/profile/ActivityFeedSettings;", "Lcom/tinder/data/profile/adapter/ApiSettings;", "()V", "fromApi", "apiModel", "toApi", "settings", "addIfNonNull", "", "Ljava/util/LinkedList;", "Lcom/tinder/domain/settings/feed/model/FeedSharingOption;", "type", "Lcom/tinder/domain/settings/feed/model/FeedSharingType;", "field", "(Ljava/util/LinkedList;Lcom/tinder/domain/settings/feed/model/FeedSharingType;Ljava/lang/Boolean;)Ljava/lang/Boolean;", "addIfNonNullWithDefault", "default", "(Ljava/util/LinkedList;Lcom/tinder/domain/settings/feed/model/FeedSharingType;Ljava/lang/Boolean;Z)Z", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.profile.adapter.e */
public final class C10915e extends C2646o<FeedSettings, ActivityFeedSettings> {
    @NotNull
    /* renamed from: a */
    public FeedSettings m43500a(@NotNull ActivityFeedSettings activityFeedSettings) {
        C2668g.b(activityFeedSettings, "apiModel");
        LinkedList linkedList = new LinkedList();
        m43498a(linkedList, FeedSharingType.SPOTIFY_TOP_ARTISTS, activityFeedSettings.getShouldShareSpotifyTopArtistUpdates(), false);
        m43498a(linkedList, FeedSharingType.SPOTIFY_ANTHEM, activityFeedSettings.getShouldShareSpotifyAnthemUpdates(), false);
        m43498a(linkedList, FeedSharingType.PROFILE_PHOTOS, activityFeedSettings.getShouldShareProfileUpdates(), false);
        return new FeedSettings(C19301m.n(linkedList));
    }

    @NotNull
    /* renamed from: a */
    public final ActivityFeedSettings m43499a(@NotNull FeedSettings feedSettings) {
        C2668g.b(feedSettings, "settings");
        Boolean valueOf = Boolean.valueOf(feedSettings.getEnabled());
        FeedSharingOption optionOrNull = feedSettings.getOptionOrNull(FeedSharingType.INSTAGRAM);
        Boolean valueOf2 = optionOrNull != null ? Boolean.valueOf(optionOrNull.getEnabled()) : null;
        optionOrNull = feedSettings.getOptionOrNull(FeedSharingType.SPOTIFY_TOP_ARTISTS);
        Boolean valueOf3 = optionOrNull != null ? Boolean.valueOf(optionOrNull.getEnabled()) : null;
        optionOrNull = feedSettings.getOptionOrNull(FeedSharingType.SPOTIFY_ANTHEM);
        Boolean valueOf4 = optionOrNull != null ? Boolean.valueOf(optionOrNull.getEnabled()) : null;
        feedSettings = feedSettings.getOptionOrNull(FeedSharingType.PROFILE_PHOTOS);
        return new ActivityFeedSettings(valueOf, valueOf2, valueOf3, valueOf4, feedSettings != null ? Boolean.valueOf(feedSettings.getEnabled()) : null);
    }

    /* renamed from: a */
    private final boolean m43498a(@NotNull LinkedList<FeedSharingOption> linkedList, FeedSharingType feedSharingType, Boolean bool, boolean z) {
        return bool != null ? linkedList.add(new FeedSharingOption(feedSharingType, bool.booleanValue())) : linkedList.add(new FeedSharingOption(feedSharingType, z));
    }
}
