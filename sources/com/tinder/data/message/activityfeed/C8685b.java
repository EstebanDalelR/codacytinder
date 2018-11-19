package com.tinder.data.message.activityfeed;

import com.squareup.sqlbrite.BriteDatabase;
import com.tinder.data.message.activityfeed.model.C8688h;
import com.tinder.data.message.activityfeed.model.C8689m;
import com.tinder.data.message.activityfeed.model.C8691w;
import com.tinder.data.message.activityfeed.model.aj;
import com.tinder.data.message.activityfeed.model.ao;
import com.tinder.data.message.activityfeed.model.aw;
import com.tinder.data.message.activityfeed.model.bb;
import com.tinder.data.message.activityfeed.model.bq;
import com.tinder.data.message.activityfeed.model.bv;
import com.tinder.data.model.activityfeed.ActivityEventNewMatchModel.C13023b;
import com.tinder.data.model.activityfeed.ActivityFeedAlbumModel.C13024b;
import com.tinder.data.model.activityfeed.ActivityFeedArtistModel.C13025b;
import com.tinder.data.model.activityfeed.ActivityFeedCommentModel.C13026b;
import com.tinder.data.model.activityfeed.ActivityFeedItemModel.C13028c;
import com.tinder.data.model.activityfeed.ActivityFeedItemUserInfoModel.C13029b;
import com.tinder.data.model.activityfeed.ActivityFeedSongModel.C13030b;
import com.tinder.data.model.activityfeed.InstagramConnectModel.C13031b;
import com.tinder.data.model.activityfeed.InstagramNewMediaModel.C13032b;
import com.tinder.data.model.activityfeed.ProfileAddLoopModel.C13034b;
import com.tinder.data.model.activityfeed.ProfileAddPhotoModel.C13035b;
import com.tinder.data.model.activityfeed.ProfileChangeAnthemModel.C13036b;
import com.tinder.data.model.activityfeed.ProfileChangeBioModel.C13037b;
import com.tinder.data.model.activityfeed.ProfileChangeSchoolModel.C13038b;
import com.tinder.data.model.activityfeed.ProfileChangeWorkModel.C13039b;
import com.tinder.data.model.activityfeed.ProfileSpotifyTopArtistModel.C13040b;
import com.tinder.domain.feed.ActivityEvent;
import com.tinder.domain.feed.ActivityEventNewMatch;
import com.tinder.domain.feed.ActivityFeedAlbum;
import com.tinder.domain.feed.ActivityFeedArtist;
import com.tinder.domain.feed.ActivityFeedComment;
import com.tinder.domain.feed.ActivityFeedItem;
import com.tinder.domain.feed.ActivityFeedSong;
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
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C15811g;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000â\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0002J\u0018\u0010)\u001a\u00020&2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0002J\u0010\u0010.\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0002J\u000e\u0010\r\u001a\u00020&2\u0006\u0010'\u001a\u00020(J\u0010\u0010/\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0002J\u001e\u00100\u001a\u00020&2\u0006\u0010*\u001a\u00020+2\f\u00101\u001a\b\u0012\u0004\u0012\u00020302H\u0002J\u001e\u00104\u001a\u00020&2\u0006\u0010*\u001a\u00020+2\f\u00101\u001a\b\u0012\u0004\u0012\u00020302H\u0002J\u001e\u00105\u001a\u00020&2\u0006\u0010*\u001a\u00020+2\f\u00101\u001a\b\u0012\u0004\u0012\u00020302H\u0002J\u0018\u00106\u001a\u00020&2\u0006\u0010*\u001a\u00020+2\u0006\u00107\u001a\u000208H\u0002J\u0018\u00109\u001a\u00020&2\u0006\u0010*\u001a\u00020+2\u0006\u0010:\u001a\u00020;H\u0002J\u0018\u0010<\u001a\u00020&2\u0006\u0010*\u001a\u00020+2\u0006\u0010=\u001a\u00020>H\u0002J\u0018\u0010?\u001a\u00020&2\u0006\u0010*\u001a\u00020+2\u0006\u0010@\u001a\u00020AH\u0002J\u0018\u0010B\u001a\u00020&2\u0006\u0010*\u001a\u00020+2\u0006\u0010C\u001a\u00020DH\u0002J\u0018\u0010E\u001a\u00020&2\u0006\u0010*\u001a\u00020+2\u0006\u0010F\u001a\u00020GH\u0002J\u0018\u0010H\u001a\u00020&2\u0006\u0010*\u001a\u00020+2\u0006\u0010I\u001a\u00020JH\u0002J\u0018\u0010K\u001a\u00020&2\u0006\u0010*\u001a\u00020+2\u0006\u0010L\u001a\u00020MH\u0002J\u0018\u0010N\u001a\u00020&2\u0006\u0010*\u001a\u00020+2\u0006\u0010O\u001a\u00020PH\u0002J\u0010\u0010Q\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0004¢\u0006\u0002\n\u0000¨\u0006R"}, d2 = {"Lcom/tinder/data/message/activityfeed/ActivityFeedItemInsertOperation;", "", "briteDatabase", "Lcom/squareup/sqlbrite/BriteDatabase;", "(Lcom/squareup/sqlbrite/BriteDatabase;)V", "insertActivityEventNewMatch", "Lcom/tinder/data/model/activityfeed/ActivityEventNewMatchModel$Insert_activity_event_new_match;", "insertActivityFeedAlbum", "Lcom/tinder/data/model/activityfeed/ActivityFeedAlbumModel$Insert_activity_feed_album;", "insertActivityFeedArtist", "Lcom/tinder/data/model/activityfeed/ActivityFeedArtistModel$Insert_activity_feed_artist;", "insertActivityFeedComment", "Lcom/tinder/data/model/activityfeed/ActivityFeedCommentModel$Insert_activity_feed_comment;", "insertActivityFeedItem", "Lcom/tinder/data/model/activityfeed/ActivityFeedItemModel$Insert_activity_feed_item;", "insertActivityFeedSong", "Lcom/tinder/data/model/activityfeed/ActivityFeedSongModel$Insert_activity_feed_song;", "insertInstagramConnect", "Lcom/tinder/data/model/activityfeed/InstagramConnectModel$Insert_instagram_connect;", "insertInstagramNewMedia", "Lcom/tinder/data/model/activityfeed/InstagramNewMediaModel$Insert_instagram_new_media;", "insertProfileAddLoop", "Lcom/tinder/data/model/activityfeed/ProfileAddLoopModel$Insert_profile_add_loop;", "insertProfileAddPhoto", "Lcom/tinder/data/model/activityfeed/ProfileAddPhotoModel$Insert_profile_add_photo;", "insertProfileChangeAnthem", "Lcom/tinder/data/model/activityfeed/ProfileChangeAnthemModel$Insert_profile_change_anthem;", "insertProfileChangeBio", "Lcom/tinder/data/model/activityfeed/ProfileChangeBioModel$Insert_profile_change_bio;", "insertProfileChangeSchool", "Lcom/tinder/data/model/activityfeed/ProfileChangeSchoolModel$Insert_profile_change_school;", "insertProfileChangeWork", "Lcom/tinder/data/model/activityfeed/ProfileChangeWorkModel$Insert_profile_change_work;", "insertProfileSpotifyTopArtist", "Lcom/tinder/data/model/activityfeed/ProfileSpotifyTopArtistModel$Insert_profile_spotify_top_artist;", "insertUserInfo", "Lcom/tinder/data/model/activityfeed/ActivityFeedItemUserInfoModel$Insert_user_info;", "insertActivityEventIntoRespectiveTable", "", "activityFeedItem", "Lcom/tinder/domain/feed/ActivityFeedItem;", "insertActivityEventNewMatchIntoActivityEventNewMatchTable", "activityFeedItemId", "", "activityEventNewMatch", "Lcom/tinder/domain/feed/ActivityEventNewMatch;", "insertActivityFeedCommentsIntoActivityFeedCommentTable", "insertActivityFeedItemIntoActivityFeedItemTable", "insertActivityFeedSongAlbumsIntoActivityFeedAlbumTable", "activityFeedSongs", "", "Lcom/tinder/domain/feed/ActivityFeedSong;", "insertActivityFeedSongArtistsIntoActivityFeedArtistTable", "insertActivityFeedSongsIntoActivityFeedSongTable", "insertInstagramConnectIntoInstagramConnectTable", "instagramConnect", "Lcom/tinder/domain/feed/InstagramConnect;", "insertInstagramNewMediaIntoInstagramNewMediaTable", "instagramNewMedia", "Lcom/tinder/domain/feed/InstagramNewMedia;", "insertProfileAddLoopIntoProfileAddLoopTable", "profileAddLoop", "Lcom/tinder/domain/feed/ProfileAddLoop;", "insertProfileAddPhotoIntoProfileAddPhotoTable", "profileAddPhoto", "Lcom/tinder/domain/feed/ProfileAddPhoto;", "insertProfileChangeAnthemIntoProfileChangeAnthemTable", "profileChangeAnthem", "Lcom/tinder/domain/feed/ProfileChangeAnthem;", "insertProfileChangeBioIntoProfileChangeBioTable", "profileChangeBio", "Lcom/tinder/domain/feed/ProfileChangeBio;", "insertProfileChangeSchoolIntoProfileChangeSchoolTable", "profileChangeSchool", "Lcom/tinder/domain/feed/ProfileChangeSchool;", "insertProfileChangeWorkIntoProfileChangeWorkTable", "profileChangeWork", "Lcom/tinder/domain/feed/ProfileChangeWork;", "insertProfileSpotifyTopArtistIntoProfileSpotifyTopArtistTable", "profileSpotifyTopArtist", "Lcom/tinder/domain/feed/ProfileSpotifyTopArtist;", "insertUserInfoIntoActivityFeedItemUserInfoTable", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.message.activityfeed.b */
public final class C8685b {
    /* renamed from: a */
    private final C13028c f30566a;
    /* renamed from: b */
    private final C13029b f30567b;
    /* renamed from: c */
    private final C13026b f30568c;
    /* renamed from: d */
    private final C13032b f30569d;
    /* renamed from: e */
    private final C13023b f30570e;
    /* renamed from: f */
    private final C13031b f30571f;
    /* renamed from: g */
    private final C13035b f30572g;
    /* renamed from: h */
    private final C13034b f30573h;
    /* renamed from: i */
    private final C13037b f30574i;
    /* renamed from: j */
    private final C13039b f30575j;
    /* renamed from: k */
    private final C13038b f30576k;
    /* renamed from: l */
    private final C13040b f30577l;
    /* renamed from: m */
    private final C13036b f30578m;
    /* renamed from: n */
    private final C13030b f30579n;
    /* renamed from: o */
    private final C13024b f30580o;
    /* renamed from: p */
    private final C13025b f30581p;
    /* renamed from: q */
    private final BriteDatabase f30582q;

    public C8685b(@NotNull BriteDatabase briteDatabase) {
        C2668g.b(briteDatabase, "briteDatabase");
        this.f30582q = briteDatabase;
        briteDatabase = this.f30582q.b();
        this.f30566a = new C13028c(briteDatabase, C8691w.m37075a());
        this.f30567b = new C13029b(briteDatabase);
        this.f30568c = new C13026b(briteDatabase);
        this.f30569d = new C13032b(briteDatabase, ao.m37049a());
        this.f30570e = new C13023b(briteDatabase);
        this.f30571f = new C13031b(briteDatabase, aj.m37047a());
        this.f30572g = new C13035b(briteDatabase, bb.m37055a());
        this.f30573h = new C13034b(briteDatabase, aw.m37053a());
        this.f30574i = new C13037b(briteDatabase);
        this.f30575j = new C13039b(briteDatabase, bv.m37063a());
        this.f30576k = new C13038b(briteDatabase, bq.m37061a());
        this.f30577l = new C13040b(briteDatabase);
        this.f30578m = new C13036b(briteDatabase);
        this.f30579n = new C13030b(briteDatabase);
        this.f30580o = new C13024b(briteDatabase, C8688h.m37069a());
        this.f30581p = new C13025b(briteDatabase, C8689m.m37071a());
    }

    /* renamed from: a */
    public final void m37040a(@NotNull ActivityFeedItem activityFeedItem) {
        C2668g.b(activityFeedItem, "activityFeedItem");
        m37034b(activityFeedItem);
        m37036c(activityFeedItem);
        m37038d(activityFeedItem);
        m37039e(activityFeedItem);
    }

    /* renamed from: b */
    private final void m37034b(ActivityFeedItem activityFeedItem) {
        this.f30566a.m50780a(activityFeedItem.getId(), activityFeedItem.getMatchId(), C8686c.m37042b(activityFeedItem.getActivityEvent()), activityFeedItem.getActivityId());
        this.f30582q.b(this.f30566a.a, this.f30566a.b);
    }

    /* renamed from: c */
    private final void m37036c(ActivityFeedItem activityFeedItem) {
        this.f30567b.m50781a(activityFeedItem.getId(), activityFeedItem.getUserInfo().getUserId());
        this.f30582q.b(this.f30567b.a, this.f30567b.b);
    }

    /* renamed from: d */
    private final void m37038d(ActivityFeedItem activityFeedItem) {
        for (ActivityFeedComment activityFeedComment : activityFeedItem.getComments()) {
            this.f30568c.m50778a(activityFeedComment.getActivityFeedItemId(), activityFeedComment.getCreatedAt(), activityFeedComment.getMessage(), activityFeedComment.getMetadata().getCarouselItemId());
            this.f30582q.b(this.f30568c.a, this.f30568c.b);
        }
    }

    /* renamed from: e */
    private final void m37039e(ActivityFeedItem activityFeedItem) {
        ActivityEvent activityEvent = activityFeedItem.getActivityEvent();
        if (activityEvent instanceof InstagramNewMedia) {
            m37025a(activityFeedItem.getId(), (InstagramNewMedia) activityEvent);
        } else if (activityEvent instanceof ActivityEventNewMatch) {
            m37023a(activityFeedItem.getId(), (ActivityEventNewMatch) activityEvent);
        } else if (activityEvent instanceof InstagramConnect) {
            m37024a(activityFeedItem.getId(), (InstagramConnect) activityEvent);
        } else if (activityEvent instanceof ProfileAddPhoto) {
            m37027a(activityFeedItem.getId(), (ProfileAddPhoto) activityEvent);
        } else if (activityEvent instanceof ProfileAddLoop) {
            m37026a(activityFeedItem.getId(), (ProfileAddLoop) activityEvent);
        } else if (activityEvent instanceof ProfileSpotifyTopArtist) {
            ProfileSpotifyTopArtist profileSpotifyTopArtist = (ProfileSpotifyTopArtist) activityEvent;
            m37032a(activityFeedItem.getId(), profileSpotifyTopArtist);
            m37033a(activityFeedItem.getId(), profileSpotifyTopArtist.getArtistSongs());
            m37035b(activityFeedItem.getId(), profileSpotifyTopArtist.getArtistSongs());
            m37037c(activityFeedItem.getId(), profileSpotifyTopArtist.getArtistSongs());
        } else if (activityEvent instanceof ProfileChangeAnthem) {
            ProfileChangeAnthem profileChangeAnthem = (ProfileChangeAnthem) activityEvent;
            List a = C19301m.a(profileChangeAnthem.getSong());
            m37028a(activityFeedItem.getId(), profileChangeAnthem);
            m37033a(activityFeedItem.getId(), C19301m.a(profileChangeAnthem.getSong()));
            m37035b(activityFeedItem.getId(), a);
            m37037c(activityFeedItem.getId(), a);
        } else if (activityEvent instanceof ProfileChangeBio) {
            m37029a(activityFeedItem.getId(), (ProfileChangeBio) activityEvent);
        } else if (activityEvent instanceof ProfileChangeWork) {
            m37031a(activityFeedItem.getId(), (ProfileChangeWork) activityEvent);
        } else if (activityEvent instanceof ProfileChangeSchool) {
            m37030a(activityFeedItem.getId(), (ProfileChangeSchool) activityEvent);
        } else if (C2668g.a(activityEvent, UnknownActivityEvent.INSTANCE) != null) {
            throw ((Throwable) new IllegalStateException("Inserting UnknownActivityEvent is prohibited"));
        }
    }

    /* renamed from: a */
    private final void m37025a(String str, InstagramNewMedia instagramNewMedia) {
        this.f30569d.m50784a(str, instagramNewMedia.getId(), instagramNewMedia.getUserName(), instagramNewMedia.getUserNumber(), instagramNewMedia.getUserId(), instagramNewMedia.getTimestamp(), instagramNewMedia.getCaption(), instagramNewMedia.getMedia());
        this.f30582q.b(this.f30569d.a, this.f30569d.b);
    }

    /* renamed from: a */
    private final void m37023a(String str, ActivityEventNewMatch activityEventNewMatch) {
        this.f30570e.m50775a(str, activityEventNewMatch.getUserNumber(), activityEventNewMatch.getOtherUserNumber(), activityEventNewMatch.getTimestamp());
        this.f30582q.b(this.f30570e.a, this.f30570e.b);
    }

    /* renamed from: a */
    private final void m37024a(String str, InstagramConnect instagramConnect) {
        this.f30571f.m50783a(str, instagramConnect.getUserNumber(), instagramConnect.getTimestamp(), instagramConnect.getInstagramUserName(), instagramConnect.getPhotos());
        this.f30582q.b(this.f30571f.a, this.f30571f.b);
    }

    /* renamed from: a */
    private final void m37027a(String str, ProfileAddPhoto profileAddPhoto) {
        this.f30572g.m50787a(str, profileAddPhoto.getUserNumber(), profileAddPhoto.getTimestamp(), profileAddPhoto.getPhotos());
        this.f30582q.b(this.f30572g.a, this.f30572g.b);
    }

    /* renamed from: a */
    private final void m37026a(String str, ProfileAddLoop profileAddLoop) {
        this.f30573h.m50786a(str, profileAddLoop.getUserNumber(), profileAddLoop.getTimestamp(), profileAddLoop.getLoops());
        this.f30582q.b(this.f30573h.a, this.f30573h.b);
    }

    /* renamed from: a */
    private final void m37029a(String str, ProfileChangeBio profileChangeBio) {
        this.f30574i.m50789a(str, profileChangeBio.getUserNumber(), profileChangeBio.getTimestamp(), profileChangeBio.getBio(), profileChangeBio.getOldBio());
        this.f30582q.b(this.f30574i.a, this.f30574i.b);
    }

    /* renamed from: a */
    private final void m37031a(String str, ProfileChangeWork profileChangeWork) {
        this.f30575j.m50791a(str, profileChangeWork.getUserNumber(), profileChangeWork.getTimestamp(), profileChangeWork.getWorks());
        this.f30582q.b(this.f30575j.a, this.f30575j.b);
    }

    /* renamed from: a */
    private final void m37030a(String str, ProfileChangeSchool profileChangeSchool) {
        this.f30576k.m50790a(str, profileChangeSchool.getUserNumber(), profileChangeSchool.getTimestamp(), profileChangeSchool.getSchools());
        this.f30582q.b(this.f30576k.a, this.f30576k.b);
    }

    /* renamed from: a */
    private final void m37032a(String str, ProfileSpotifyTopArtist profileSpotifyTopArtist) {
        this.f30577l.m50792a(str, profileSpotifyTopArtist.getUserNumber(), profileSpotifyTopArtist.getTimestamp());
        this.f30582q.b(this.f30577l.a, this.f30577l.b);
    }

    /* renamed from: a */
    private final void m37028a(String str, ProfileChangeAnthem profileChangeAnthem) {
        this.f30578m.m50788a(str, profileChangeAnthem.getUserNumber(), profileChangeAnthem.getTimestamp());
        this.f30582q.b(this.f30578m.a, this.f30578m.b);
    }

    /* renamed from: a */
    private final void m37033a(String str, List<ActivityFeedSong> list) {
        for (ActivityFeedSong activityFeedSong : list) {
            this.f30579n.m50782a(activityFeedSong.getId(), str, activityFeedSong.getName(), activityFeedSong.getUrl());
            this.f30582q.b(this.f30579n.a, this.f30579n.b);
        }
    }

    /* renamed from: b */
    private final void m37035b(String str, List<ActivityFeedSong> list) {
        for (ActivityFeedSong activityFeedSong : list) {
            ActivityFeedAlbum album = activityFeedSong.getAlbum();
            if (album != null) {
                this.f30580o.m50776a(str, activityFeedSong.getId(), album.getName(), album.getImages());
                this.f30582q.b(this.f30580o.a, this.f30580o.b);
            }
        }
    }

    /* renamed from: c */
    private final void m37037c(String str, List<ActivityFeedSong> list) {
        Collection arrayList = new ArrayList();
        for (ActivityFeedSong activityFeedSong : list) {
            Iterable<ActivityFeedArtist> artists = activityFeedSong.getArtists();
            Collection arrayList2 = new ArrayList(C19301m.a(artists, 10));
            for (ActivityFeedArtist a : artists) {
                arrayList2.add(C15811g.a(activityFeedSong.getId(), a));
            }
            C19301m.a(arrayList, (List) arrayList2);
        }
        for (Pair pair : (List) arrayList) {
            String str2 = (String) pair.c();
            ActivityFeedArtist activityFeedArtist = (ActivityFeedArtist) pair.d();
            this.f30581p.m50777a(activityFeedArtist.getId(), str, str2, activityFeedArtist.getName(), activityFeedArtist.getImages());
            this.f30582q.b(this.f30581p.a, this.f30581p.b);
        }
    }
}
