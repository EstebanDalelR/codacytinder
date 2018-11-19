package com.tinder.feed.view.model;

import com.tinder.chat.view.model.C10641l;
import com.tinder.chat.view.model.C8496j;
import com.tinder.domain.common.model.Photo.Quality;
import com.tinder.domain.feed.ActivityCommentMetaData;
import com.tinder.domain.feed.ActivityEvent;
import com.tinder.domain.feed.ActivityEventNewMatch;
import com.tinder.domain.feed.ActivityFeedComment;
import com.tinder.domain.feed.ActivityFeedItem;
import com.tinder.domain.feed.InstagramConnect;
import com.tinder.domain.feed.InstagramNewMedia;
import com.tinder.domain.feed.ProfileAddLoop;
import com.tinder.domain.feed.ProfileAddPhoto;
import com.tinder.domain.feed.ProfileChangeAnthem;
import com.tinder.domain.feed.ProfileChangeBio;
import com.tinder.domain.feed.ProfileChangeSchool;
import com.tinder.domain.feed.ProfileChangeWork;
import com.tinder.domain.feed.ProfileSpotifyTopArtist;
import com.tinder.domain.feed.UnknownActivityEvent;
import com.tinder.domain.match.model.visitor.UserPhotoExtKt;
import com.tinder.domain.meta.model.CurrentUser;
import com.tinder.feed.view.info.C9504c;
import com.tinder.feed.view.model.FeedCommentViewModel.State;
import com.tinder.p204d.p205a.C8609a;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/tinder/feed/view/model/ActivityFeedViewModelMapper;", "", "loopsExperimentUtility", "Lcom/tinder/loop/experiment/LoopsExperimentUtility;", "(Lcom/tinder/loop/experiment/LoopsExperimentUtility;)V", "isLoopsEnabled", "", "carouselItemId", "", "metadata", "Lcom/tinder/domain/feed/ActivityCommentMetaData;", "createCommentViewModel", "Lcom/tinder/feed/view/model/FeedCommentViewModel;", "feedItem", "Lcom/tinder/domain/feed/ActivityFeedItem;", "currentUser", "Lcom/tinder/domain/meta/model/CurrentUser;", "from", "Lcom/tinder/feed/view/model/FeedItem;", "activityFeedItem", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.view.model.a */
public final class C9537a {
    /* renamed from: a */
    private final boolean f31908a;

    @Inject
    public C9537a(@NotNull C8609a c8609a) {
        C2668g.b(c8609a, "loopsExperimentUtility");
        this.f31908a = c8609a.m36729b();
    }

    @NotNull
    /* renamed from: a */
    public final FeedItem m39800a(@NotNull ActivityFeedItem activityFeedItem, @NotNull CurrentUser currentUser) {
        List c;
        C2668g.b(activityFeedItem, "activityFeedItem");
        C2668g.b(currentUser, "currentUser");
        ActivityEvent activityEvent = activityFeedItem.getActivityEvent();
        if (this.f31908a) {
            c = C8496j.m36398c(activityFeedItem.getUserInfo().getPhotos());
        } else {
            c = C8496j.m36400d(activityFeedItem.getUserInfo().getPhotos());
        }
        C9539e a = C8496j.m36387a(activityFeedItem.getUserInfo(), c);
        FeedCommentViewModel b = m39799b(activityFeedItem, currentUser);
        if ((activityEvent instanceof InstagramNewMedia) != null) {
            return (FeedItem) new C13281i(C8496j.m36383a((InstagramNewMedia) activityEvent), a, activityFeedItem.getId(), activityFeedItem.getActivityId(), b, activityFeedItem.getMatchId(), C9504c.m39757a(activityFeedItem.getMatchType()));
        }
        if ((activityEvent instanceof ActivityEventNewMatch) != null) {
            return (FeedItem) new C13282k(C8496j.m36385a((ActivityEventNewMatch) activityEvent, C10641l.f34911a.m36416a()), a, activityFeedItem.getId(), activityFeedItem.getActivityId(), b, activityFeedItem.getMatchId(), C9504c.m39757a(activityFeedItem.getMatchType()));
        }
        if ((activityEvent instanceof ProfileChangeAnthem) != null) {
            return (FeedItem) new C13289r(C8496j.m36369a((ProfileChangeAnthem) activityEvent, C10641l.f34911a.m36416a()), a, activityFeedItem.getId(), activityFeedItem.getActivityId(), b, activityFeedItem.getMatchId(), C9504c.m39757a(activityFeedItem.getMatchType()));
        }
        if ((activityEvent instanceof ProfileAddPhoto) != null) {
            return (FeedItem) new C13284m(C8496j.m36360a((ProfileAddPhoto) activityEvent), a, activityFeedItem.getId(), activityFeedItem.getActivityId(), b, activityFeedItem.getMatchId(), C9504c.m39757a(activityFeedItem.getMatchType()));
        }
        if ((activityEvent instanceof ProfileSpotifyTopArtist) != null) {
            return (FeedItem) new C13288q(C8496j.m36365a((ProfileSpotifyTopArtist) activityEvent, C10641l.f34911a.m36416a()), a, activityFeedItem.getId(), activityFeedItem.getActivityId(), b, activityFeedItem.getMatchId(), C9504c.m39757a(activityFeedItem.getMatchType()));
        }
        if ((activityEvent instanceof InstagramConnect) != null) {
            return (FeedItem) new C13280h(C8496j.m36380a((InstagramConnect) activityEvent), a, activityFeedItem.getId(), activityFeedItem.getActivityId(), b, activityFeedItem.getMatchId(), C9504c.m39757a(activityFeedItem.getMatchType()));
        }
        if ((activityEvent instanceof ProfileChangeWork) != null) {
            return (FeedItem) new C13287p(C8496j.m36364a((ProfileChangeWork) activityEvent, C10641l.f34911a.m36416a()), a, activityFeedItem.getId(), activityFeedItem.getActivityId(), b, activityFeedItem.getMatchId(), C9504c.m39757a(activityFeedItem.getMatchType()));
        }
        if ((activityEvent instanceof ProfileAddLoop) != null) {
            return (FeedItem) new C13283l(C8496j.m36358a((ProfileAddLoop) activityEvent), a, activityFeedItem.getId(), activityFeedItem.getActivityId(), b, activityFeedItem.getMatchId(), C9504c.m39757a(activityFeedItem.getMatchType()));
        }
        if ((activityEvent instanceof ProfileChangeBio) != null) {
            return (FeedItem) new C13285n(C8496j.m36362a((ProfileChangeBio) activityEvent, C10641l.f34911a.m36416a()), a, activityFeedItem.getId(), activityFeedItem.getActivityId(), b, activityFeedItem.getMatchId(), C9504c.m39757a(activityFeedItem.getMatchType()));
        }
        if ((activityEvent instanceof ProfileChangeSchool) != null) {
            return (FeedItem) new C13286o(C8496j.m36363a((ProfileChangeSchool) activityEvent, C10641l.f34911a.m36416a()), a, activityFeedItem.getId(), activityFeedItem.getActivityId(), b, activityFeedItem.getMatchId(), C9504c.m39757a(activityFeedItem.getMatchType()));
        }
        if (C2668g.a(activityEvent, UnknownActivityEvent.INSTANCE) != null) {
            currentUser = new StringBuilder();
            currentUser.append("Unknown ActivityFeed EventType : ");
            currentUser.append('{');
            currentUser.append(activityEvent);
            currentUser.append("} cannot be mappped.");
            throw ((Throwable) new IllegalArgumentException(currentUser.toString()));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: b */
    private final FeedCommentViewModel m39799b(ActivityFeedItem activityFeedItem, CurrentUser currentUser) {
        if (activityFeedItem.getComments().isEmpty()) {
            return null;
        }
        State state;
        ActivityFeedComment activityFeedComment = (ActivityFeedComment) C19301m.f(activityFeedItem.getComments());
        String id = activityFeedItem.getId();
        String message = activityFeedComment.getMessage();
        DateTime dateTime = new DateTime(activityFeedComment.getCreatedAt());
        switch (C9538b.f31909a[activityFeedComment.getState().ordinal()]) {
            case 1:
                state = State.SENT;
                break;
            case 2:
                state = State.PENDING;
                break;
            case 3:
                state = State.FAILED;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new FeedCommentViewModel(id, message, dateTime, state, UserPhotoExtKt.avatarUrl(currentUser, Quality.M), activityFeedItem.getMatchId(), m39798a(activityFeedComment.getMetadata()));
    }

    /* renamed from: a */
    private final String m39798a(ActivityCommentMetaData activityCommentMetaData) {
        activityCommentMetaData = activityCommentMetaData.getCarouselItemId();
        return (((CharSequence) activityCommentMetaData).length() == 0 ? 1 : null) != null ? null : activityCommentMetaData;
    }
}
