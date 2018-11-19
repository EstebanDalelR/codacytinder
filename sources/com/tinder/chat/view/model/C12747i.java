package com.tinder.chat.view.model;

import com.tinder.api.ManagerWebServices;
import com.tinder.domain.common.model.Photo;
import com.tinder.domain.feed.ActivityEvent;
import com.tinder.domain.feed.ActivityEventNewMatch;
import com.tinder.domain.feed.ActivityFeedComment;
import com.tinder.domain.feed.InstagramConnect;
import com.tinder.domain.feed.InstagramNewMedia;
import com.tinder.domain.feed.ProfileAddLoop;
import com.tinder.domain.feed.ProfileAddPhoto;
import com.tinder.domain.feed.ProfileChangeAnthem;
import com.tinder.domain.feed.ProfileChangeBio;
import com.tinder.domain.feed.ProfileChangeSchool;
import com.tinder.domain.feed.ProfileChangeWork;
import com.tinder.domain.feed.ProfileSpotifyTopArtist;
import com.tinder.domain.message.ActivityMessage;
import java.util.List;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\u0010\rR\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/tinder/chat/view/model/ActivityMessageViewModel;", "Lcom/tinder/chat/view/model/MessageViewModel;", "Lcom/tinder/domain/message/ActivityMessage;", "message", "userId", "", "positionInfo", "Lcom/tinder/chat/view/model/PositionInfo;", "avatarUrl", "matchId", "feedOwnerPhotos", "", "Lcom/tinder/domain/common/model/Photo;", "(Lcom/tinder/domain/message/ActivityMessage;Ljava/lang/String;Lcom/tinder/chat/view/model/PositionInfo;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "activityId", "getActivityId", "()Ljava/lang/String;", "event", "Lcom/tinder/chat/view/model/ActivityEventViewModel;", "getEvent", "()Lcom/tinder/chat/view/model/ActivityEventViewModel;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.chat.view.model.i */
public final class C12747i extends MessageViewModel<ActivityMessage> {
    @NotNull
    /* renamed from: a */
    private final C8492a f41118a;
    @NotNull
    /* renamed from: b */
    private final String f41119b;

    public C12747i(@NotNull ActivityMessage activityMessage, @NotNull String str, @NotNull C8503z c8503z, @NotNull String str2, @NotNull String str3, @NotNull List<? extends Photo> list) {
        C8492a a;
        ActivityMessage activityMessage2 = activityMessage;
        List list2 = list;
        C2668g.b(activityMessage2, "message");
        String str4 = str;
        C2668g.b(str4, ManagerWebServices.PARAM_USER_ID);
        C8503z c8503z2 = c8503z;
        C2668g.b(c8503z2, "positionInfo");
        String str5 = str2;
        C2668g.b(str5, "avatarUrl");
        String str6 = str3;
        C2668g.b(str6, "matchId");
        C2668g.b(list2, "feedOwnerPhotos");
        super(activityMessage2, str4, c8503z2, str5, str6, null, 32, null);
        this.f41119b = activityMessage2.getActivityFeedItem().getActivityId();
        ActivityEvent activityEvent = activityMessage2.getActivityFeedItem().getActivityEvent();
        String carouselItemId = ((ActivityFeedComment) C19301m.f(activityMessage2.getActivityFeedItem().getComments())).getMetadata().getCarouselItemId();
        Photo photo = (Photo) C19301m.f(list);
        if (activityEvent instanceof InstagramNewMedia) {
            a = C8496j.m36384a((InstagramNewMedia) activityEvent, carouselItemId);
        } else if (activityEvent instanceof ActivityEventNewMatch) {
            a = C8496j.m36386a((ActivityEventNewMatch) activityEvent, list2, carouselItemId);
        } else if (activityEvent instanceof ProfileChangeAnthem) {
            a = C8496j.m36369a((ProfileChangeAnthem) activityEvent, photo);
        } else if (activityEvent instanceof InstagramConnect) {
            a = C8496j.m36381a((InstagramConnect) activityEvent, carouselItemId);
        } else if (activityEvent instanceof ProfileAddPhoto) {
            a = C8496j.m36361a((ProfileAddPhoto) activityEvent, carouselItemId);
        } else if (activityEvent instanceof ProfileSpotifyTopArtist) {
            a = C8496j.m36366a((ProfileSpotifyTopArtist) activityEvent, photo, carouselItemId);
        } else if (activityEvent instanceof ProfileAddLoop) {
            a = C8496j.m36359a((ProfileAddLoop) activityEvent, carouselItemId);
        } else if (activityEvent instanceof ProfileChangeBio) {
            a = C8496j.m36362a((ProfileChangeBio) activityEvent, photo);
        } else if (activityEvent instanceof ProfileChangeWork) {
            a = C8496j.m36364a((ProfileChangeWork) activityEvent, photo);
        } else if (activityEvent instanceof ProfileChangeSchool) {
            a = C8496j.m36363a((ProfileChangeSchool) activityEvent, photo);
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("View model for ");
            stringBuilder.append(activityEvent);
            stringBuilder.append(" is not yet implemented");
            String stringBuilder2 = stringBuilder.toString();
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("An operation is not implemented: ");
            stringBuilder3.append(stringBuilder2);
            throw new NotImplementedError(stringBuilder3.toString());
        }
        r9.f41118a = a;
    }

    @NotNull
    /* renamed from: a */
    public final C8492a m50169a() {
        return this.f41118a;
    }

    @NotNull
    /* renamed from: b */
    public final String m50170b() {
        return this.f41119b;
    }
}
