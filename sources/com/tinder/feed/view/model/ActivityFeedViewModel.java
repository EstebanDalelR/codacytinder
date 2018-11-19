package com.tinder.feed.view.model;

import com.tinder.chat.view.model.C8492a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\u00020\u0003:\u0001\u001cB\u000f\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00028\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\tR\u0012\u0010\u0016\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\tR\u0012\u0010\u0018\u001a\u00020\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\u0001\n\u001d\u001e\u001f !\"#$%&¨\u0006'"}, d2 = {"Lcom/tinder/feed/view/model/ActivityFeedViewModel;", "FEED_EVENT", "Lcom/tinder/chat/view/model/ActivityEventViewModel;", "Lcom/tinder/feed/view/model/FeedItem;", "id", "", "(Ljava/lang/String;)V", "activityId", "getActivityId", "()Ljava/lang/String;", "attribution", "Lcom/tinder/feed/view/model/ActivityFeedViewModel$Attribution;", "getAttribution", "()Lcom/tinder/feed/view/model/ActivityFeedViewModel$Attribution;", "feedCommentViewModel", "Lcom/tinder/feed/view/model/FeedCommentViewModel;", "getFeedCommentViewModel", "()Lcom/tinder/feed/view/model/FeedCommentViewModel;", "feedEventViewModel", "getFeedEventViewModel", "()Lcom/tinder/chat/view/model/ActivityEventViewModel;", "getId", "matchId", "getMatchId", "userInfoViewModel", "Lcom/tinder/feed/view/model/FeedUserInfoViewModel;", "getUserInfoViewModel", "()Lcom/tinder/feed/view/model/FeedUserInfoViewModel;", "Attribution", "Lcom/tinder/feed/view/model/InstagramMediaFeedViewModel;", "Lcom/tinder/feed/view/model/NewMatchFeedViewModel;", "Lcom/tinder/feed/view/model/SpotifyNewAnthemFeedViewModel;", "Lcom/tinder/feed/view/model/ProfileAddPhotoFeedViewModel;", "Lcom/tinder/feed/view/model/ProfileSpotifyArtistFeedViewModel;", "Lcom/tinder/feed/view/model/InstagramConnectFeedViewModel;", "Lcom/tinder/feed/view/model/ProfileAddLoopFeedViewModel;", "Lcom/tinder/feed/view/model/ProfileChangeBioFeedViewModel;", "Lcom/tinder/feed/view/model/ProfileChangeWorkFeedViewModel;", "Lcom/tinder/feed/view/model/ProfileChangeSchoolFeedViewModel;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public abstract class ActivityFeedViewModel<FEED_EVENT extends C8492a> implements FeedItem {
    @NotNull
    /* renamed from: a */
    private final String f38471a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/tinder/feed/view/model/ActivityFeedViewModel$Attribution;", "", "(Ljava/lang/String;I)V", "NONE", "SUPER_LIKE", "LIKES_YOU", "BOOST", "TOP_PICKS", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public enum Attribution {
    }

    @NotNull
    /* renamed from: a */
    public abstract String mo11139a();

    @NotNull
    /* renamed from: b */
    public abstract String mo11140b();

    @NotNull
    /* renamed from: c */
    public abstract Attribution mo11141c();

    @NotNull
    /* renamed from: d */
    public abstract FEED_EVENT mo11142d();

    @NotNull
    /* renamed from: e */
    public abstract C9539e mo11143e();

    @Nullable
    /* renamed from: f */
    public abstract FeedCommentViewModel mo11144f();

    private ActivityFeedViewModel(String str) {
        this.f38471a = str;
    }

    @NotNull
    public String getId() {
        return this.f38471a;
    }
}
