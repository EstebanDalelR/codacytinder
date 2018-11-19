package com.tinder.chat.view.model;

import com.tinder.api.ManagerWebServices;
import com.tinder.domain.common.model.Photo;
import com.tinder.domain.common.model.Photo.Render;
import com.tinder.domain.feed.ActivityEventNewMatch;
import com.tinder.domain.feed.ActivityFeedAlbum;
import com.tinder.domain.feed.ActivityFeedArtist;
import com.tinder.domain.feed.ActivityFeedImage;
import com.tinder.domain.feed.ActivityFeedJob;
import com.tinder.domain.feed.ActivityFeedLoop;
import com.tinder.domain.feed.ActivityFeedPhoto;
import com.tinder.domain.feed.ActivityFeedSchool;
import com.tinder.domain.feed.ActivityFeedSong;
import com.tinder.domain.feed.ActivityFeedUserInfo;
import com.tinder.domain.feed.ActivityFeedVideo;
import com.tinder.domain.feed.InstagramConnect;
import com.tinder.domain.feed.InstagramMedia;
import com.tinder.domain.feed.InstagramNewMedia;
import com.tinder.domain.feed.ProfileAddLoop;
import com.tinder.domain.feed.ProfileAddPhoto;
import com.tinder.domain.feed.ProfileChangeAnthem;
import com.tinder.domain.feed.ProfileChangeBio;
import com.tinder.domain.feed.ProfileChangeSchool;
import com.tinder.domain.feed.ProfileChangeWork;
import com.tinder.domain.feed.ProfileSpotifyTopArtist;
import com.tinder.feed.view.model.C9539e;
import com.tinder.spotify.model.Album;
import com.tinder.spotify.model.Artist;
import com.tinder.spotify.model.SearchTrack;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.C15811g;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.collections.ae;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0004H\u0000\u001a\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\b\u0012\u0004\u0012\u00020\b0\u0006H\u0000\u001a\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\b\u0012\u0004\u0012\u00020\n0\u0006H\u0000\u001a\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0006*\b\u0012\u0004\u0012\u00020\r0\u0006H\u0002\u001a\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006*\b\u0012\u0004\u0012\u00020\u00100\u0006H\u0002\u001a \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006*\b\u0012\u0004\u0012\u00020\u00100\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0002\u001a\u0018\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0006*\b\u0012\u0004\u0012\u00020\u00160\u0006H\u0002\u001a \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u0006*\b\u0012\u0004\u0012\u00020\u00160\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0002\u001a\u0018\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0006*\b\u0012\u0004\u0012\u00020\u001a0\u0006H\u0002\u001a\u0018\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0006*\b\u0012\u0004\u0012\u00020\u001d0\u0006H\u0000\u001a\u0018\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u0006*\b\u0012\u0004\u0012\u00020\r0\u0006H\u0002\u001a\f\u0010\u001f\u001a\u00020 *\u00020!H\u0000\u001a\f\u0010\"\u001a\u00020#*\u00020$H\u0000\u001a\u0018\u0010%\u001a\b\u0012\u0004\u0012\u00020#0\u0006*\b\u0012\u0004\u0012\u00020$0\u0006H\u0000\u001a\u0018\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130'*\u00020\u0007H\u0000\u001a$\u0010(\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130'0\u0006*\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000\u001a\f\u0010)\u001a\u00020\u000f*\u00020\u0016H\u0000\u001a\u0018\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u0006*\b\u0012\u0004\u0012\u00020\u00160\u0006H\u0002\u001a\f\u0010,\u001a\u00020\u0015*\u00020\u0016H\u0000\u001a\u0018\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00190\u0006*\b\u0012\u0004\u0012\u00020\u001a0\u0006H\u0002\u001a\f\u0010.\u001a\u00020/*\u000200H\u0000\u001a\u0018\u00101\u001a\b\u0012\u0004\u0012\u00020$0\u0006*\b\u0012\u0004\u0012\u0002020\u0006H\u0002\u001a \u00103\u001a\b\u0012\u0004\u0012\u0002000\u0006*\b\u0012\u0004\u0012\u0002040\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0002\u001a\u0018\u00105\u001a\b\u0012\u0004\u0012\u0002000\u0006*\b\u0012\u0004\u0012\u0002040\u0006H\u0002\u001a\f\u00106\u001a\u00020\u0015*\u000207H\u0000\u001a\f\u00106\u001a\u00020\u0007*\u00020\bH\u0000\u001a\u0014\u00106\u001a\u000208*\u0002092\u0006\u0010:\u001a\u000207H\u0000\u001a\f\u00106\u001a\u00020!*\u00020;H\u0002\u001a\f\u00106\u001a\u00020$*\u000202H\u0002\u001a\f\u00106\u001a\u00020\u0007*\u00020\nH\u0000\u001a\f\u00106\u001a\u00020\f*\u00020\rH\u0000\u001a\f\u00106\u001a\u00020\u000f*\u00020\u0010H\u0000\u001a\f\u00106\u001a\u00020\u0019*\u00020\u001aH\u0000\u001a\f\u00106\u001a\u000200*\u000204H\u0000\u001a\u001a\u00106\u001a\u00020<*\u00020=2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020+0\u0006H\u0000\u001a\f\u00106\u001a\u00020\u001c*\u00020\u001dH\u0000\u001a\f\u00106\u001a\u00020?*\u00020@H\u0000\u001a\u0014\u00106\u001a\u00020?*\u00020@2\u0006\u0010\u0012\u001a\u00020\u0013H\u0000\u001a\f\u00106\u001a\u00020\u0002*\u00020AH\u0002\u001a\f\u00106\u001a\u00020\u0004*\u00020BH\u0000\u001a\u0014\u00106\u001a\u00020\u0004*\u00020B2\u0006\u0010\u0012\u001a\u00020\u0013H\u0000\u001a\f\u00106\u001a\u00020C*\u00020DH\u0000\u001a\u0014\u00106\u001a\u00020C*\u00020D2\u0006\u0010\u0012\u001a\u00020\u0013H\u0000\u001a\f\u00106\u001a\u00020E*\u00020FH\u0000\u001a\u0014\u00106\u001a\u00020E*\u00020F2\u0006\u0010\u0012\u001a\u00020\u0013H\u0000\u001a\u0014\u00106\u001a\u00020G*\u00020H2\u0006\u0010:\u001a\u000207H\u0000\u001a\u0014\u00106\u001a\u00020I*\u00020J2\u0006\u0010:\u001a\u000207H\u0000\u001a\u0014\u00106\u001a\u00020K*\u00020L2\u0006\u0010:\u001a\u000207H\u0000\u001a\u0014\u00106\u001a\u00020M*\u00020N2\u0006\u0010:\u001a\u000207H\u0000\u001a\u0014\u00106\u001a\u00020O*\u00020P2\u0006\u0010:\u001a\u000207H\u0000\u001a\u001c\u00106\u001a\u00020O*\u00020P2\u0006\u0010:\u001a\u0002072\u0006\u0010\u0012\u001a\u00020\u0013H\u0000\u001a\u0018\u00106\u001a\b\u0012\u0004\u0012\u00020\u00150\u0006*\b\u0012\u0004\u0012\u00020\u00160\u0006H\u0000\u001a\"\u0010Q\u001a\u000208*\u0002092\f\u0010R\u001a\b\u0012\u0004\u0012\u0002070\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0000\u001a\u001a\u0010Q\u001a\u00020\u0015*\b\u0012\u0004\u0012\u0002070\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0000\u001a \u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006*\b\u0012\u0004\u0012\u00020A0\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0002\u001a\u0018\u0010S\u001a\b\u0012\u0004\u0012\u00020+0\u0006*\b\u0012\u0004\u0012\u00020\u00160\u0006H\u0000\u001a\u0018\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006*\b\u0012\u0004\u0012\u00020A0\u0006H\u0002\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0004¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003¨\u0006U"}, d2 = {"isVideo", "", "Lcom/tinder/chat/view/model/InstagramMediaViewModel;", "(Lcom/tinder/chat/view/model/InstagramMediaViewModel;)Z", "Lcom/tinder/chat/view/model/InstagramNewMediaViewModel;", "toActivityFeedImageViewModelList", "", "Lcom/tinder/chat/view/model/ActivityFeedImageViewModel;", "Lcom/tinder/domain/common/model/Photo$Render;", "toActivityFeedImageViewModels", "Lcom/tinder/domain/feed/ActivityFeedImage;", "toActivityFeedJobViewModels", "Lcom/tinder/chat/view/model/ActivityFeedJobViewModel;", "Lcom/tinder/domain/feed/ActivityFeedJob;", "toActivityFeedLoopViewModels", "Lcom/tinder/chat/view/model/ActivityFeedLoopViewModel;", "Lcom/tinder/domain/feed/ActivityFeedLoop;", "toActivityFeedLoopViewModelsByCarouselItemId", "carouselItemId", "", "toActivityFeedPhotoViewModels", "Lcom/tinder/chat/view/model/ActivityFeedPhotoViewModel;", "Lcom/tinder/domain/feed/ActivityFeedPhoto;", "toActivityFeedPhotoViewModelsByCarouselItemId", "toActivityFeedSchoolViewModels", "Lcom/tinder/chat/view/model/ActivityFeedSchoolViewModel;", "Lcom/tinder/domain/feed/ActivityFeedSchool;", "toActivityFeedVideoViewModels", "Lcom/tinder/chat/view/model/ActivityFeedVideoViewModel;", "Lcom/tinder/domain/feed/ActivityFeedVideo;", "toJobViewModels", "toLegacySpotifyAlbum", "Lcom/tinder/spotify/model/Album;", "Lcom/tinder/chat/view/model/SpotifyAlbumViewModel;", "toLegacySpotifyArtist", "Lcom/tinder/spotify/model/Artist;", "Lcom/tinder/chat/view/model/SpotifyArtistViewModel;", "toLegacySpotifyArtists", "toLegacySpotifyImage", "", "toLegacySpotifyImages", "toLoopViewModel", "toPhotoMediaViewModels", "Lcom/tinder/chat/view/model/PhotoMediaViewModel;", "toPhotoViewModel", "toSchoolViewModels", "toSearchTrack", "Lcom/tinder/spotify/model/SearchTrack;", "Lcom/tinder/chat/view/model/SpotifySongViewModel;", "toSpotifyArtistViewModels", "Lcom/tinder/domain/feed/ActivityFeedArtist;", "toSpotifySongViewModelByCarouselItemId", "Lcom/tinder/domain/feed/ActivityFeedSong;", "toSpotifySongViewModels", "toViewModel", "Lcom/tinder/domain/common/model/Photo;", "Lcom/tinder/chat/view/model/NewMatchViewModel;", "Lcom/tinder/domain/feed/ActivityEventNewMatch;", "matchPhoto", "Lcom/tinder/domain/feed/ActivityFeedAlbum;", "Lcom/tinder/feed/view/model/FeedUserInfoViewModel;", "Lcom/tinder/domain/feed/ActivityFeedUserInfo;", "images", "Lcom/tinder/chat/view/model/InstagramConnectViewModel;", "Lcom/tinder/domain/feed/InstagramConnect;", "Lcom/tinder/domain/feed/InstagramMedia;", "Lcom/tinder/domain/feed/InstagramNewMedia;", "Lcom/tinder/chat/view/model/ProfileAddLoopViewModel;", "Lcom/tinder/domain/feed/ProfileAddLoop;", "Lcom/tinder/chat/view/model/ProfileAddPhotoViewModel;", "Lcom/tinder/domain/feed/ProfileAddPhoto;", "Lcom/tinder/chat/view/model/SpotifyNewAnthemViewModel;", "Lcom/tinder/domain/feed/ProfileChangeAnthem;", "Lcom/tinder/chat/view/model/ProfileChangeBioViewModel;", "Lcom/tinder/domain/feed/ProfileChangeBio;", "Lcom/tinder/chat/view/model/ProfileChangeSchoolViewModel;", "Lcom/tinder/domain/feed/ProfileChangeSchool;", "Lcom/tinder/chat/view/model/ProfileChangeWorkViewModel;", "Lcom/tinder/domain/feed/ProfileChangeWork;", "Lcom/tinder/chat/view/model/ProfileSpotifyTopArtistViewModel;", "Lcom/tinder/domain/feed/ProfileSpotifyTopArtist;", "toViewModelByCarouselItemId", "userPhotos", "toViewModelWithLoop", "toViewModels", "Tinder_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.chat.view.model.j */
public final class C8496j {
    @NotNull
    /* renamed from: a */
    public static final ad m36363a(@NotNull ProfileChangeSchool profileChangeSchool, @NotNull Photo photo) {
        C2668g.b(profileChangeSchool, "$receiver");
        C2668g.b(photo, "matchPhoto");
        return new ad(profileChangeSchool.getUserNumber(), profileChangeSchool.getTimestamp(), C8496j.m36415q(profileChangeSchool.getSchools()), C8496j.m36375a(photo));
    }

    @NotNull
    /* renamed from: a */
    public static final ae m36364a(@NotNull ProfileChangeWork profileChangeWork, @NotNull Photo photo) {
        C2668g.b(profileChangeWork, "$receiver");
        C2668g.b(photo, "matchPhoto");
        return new ae(profileChangeWork.getUserNumber(), profileChangeWork.getTimestamp(), C8496j.m36414p(profileChangeWork.getWorks()), C8496j.m36375a(photo));
    }

    @NotNull
    /* renamed from: a */
    public static final ac m36362a(@NotNull ProfileChangeBio profileChangeBio, @NotNull Photo photo) {
        C2668g.b(profileChangeBio, "$receiver");
        C2668g.b(photo, "matchPhoto");
        return new ac(profileChangeBio.getUserNumber(), profileChangeBio.getTimestamp(), profileChangeBio.getBio(), profileChangeBio.getOldBio(), C8496j.m36375a(photo));
    }

    @NotNull
    /* renamed from: a */
    public static final aa m36358a(@NotNull ProfileAddLoop profileAddLoop) {
        C2668g.b(profileAddLoop, "$receiver");
        return new aa(profileAddLoop.getUserNumber(), profileAddLoop.getTimestamp(), C8496j.m36413o(profileAddLoop.getLoops()));
    }

    @NotNull
    /* renamed from: a */
    public static final aa m36359a(@NotNull ProfileAddLoop profileAddLoop, @NotNull String str) {
        C2668g.b(profileAddLoop, "$receiver");
        C2668g.b(str, "carouselItemId");
        return new aa(profileAddLoop.getUserNumber(), profileAddLoop.getTimestamp(), C8496j.m36399c(profileAddLoop.getLoops(), str));
    }

    @NotNull
    /* renamed from: a */
    public static final ab m36360a(@NotNull ProfileAddPhoto profileAddPhoto) {
        C2668g.b(profileAddPhoto, "$receiver");
        return new ab(profileAddPhoto.getUserNumber(), profileAddPhoto.getTimestamp(), C8496j.m36410l(profileAddPhoto.getPhotos()));
    }

    @NotNull
    /* renamed from: a */
    public static final ab m36361a(@NotNull ProfileAddPhoto profileAddPhoto, @NotNull String str) {
        C2668g.b(profileAddPhoto, "$receiver");
        C2668g.b(str, "carouselItemId");
        return new ab(profileAddPhoto.getUserNumber(), profileAddPhoto.getTimestamp(), C8496j.m36397b(profileAddPhoto.getPhotos(), str));
    }

    @NotNull
    /* renamed from: a */
    public static final af m36365a(@NotNull ProfileSpotifyTopArtist profileSpotifyTopArtist, @NotNull Photo photo) {
        C2668g.b(profileSpotifyTopArtist, "$receiver");
        C2668g.b(photo, "matchPhoto");
        return new af(profileSpotifyTopArtist.getUserNumber(), profileSpotifyTopArtist.getTimestamp(), C8496j.m36409k(profileSpotifyTopArtist.getArtistSongs()), C8496j.m36375a(photo));
    }

    @NotNull
    /* renamed from: a */
    public static final af m36366a(@NotNull ProfileSpotifyTopArtist profileSpotifyTopArtist, @NotNull Photo photo, @NotNull String str) {
        C2668g.b(profileSpotifyTopArtist, "$receiver");
        C2668g.b(photo, "matchPhoto");
        C2668g.b(str, "carouselItemId");
        return new af(profileSpotifyTopArtist.getUserNumber(), profileSpotifyTopArtist.getTimestamp(), C8496j.m36403e(profileSpotifyTopArtist.getArtistSongs(), str), C8496j.m36375a(photo));
    }

    @NotNull
    /* renamed from: a */
    public static final C10638f m36376a(@NotNull ActivityFeedPhoto activityFeedPhoto) {
        C2668g.b(activityFeedPhoto, "$receiver");
        return new C10638f(activityFeedPhoto.getId(), C8496j.m36391a(activityFeedPhoto.getImages()));
    }

    @NotNull
    /* renamed from: b */
    public static final C10637d m36395b(@NotNull ActivityFeedPhoto activityFeedPhoto) {
        C2668g.b(activityFeedPhoto, "$receiver");
        return new C10637d(activityFeedPhoto.getId(), C8496j.m36391a(activityFeedPhoto.getImages()), C8496j.m36396b(activityFeedPhoto.getVideos()));
    }

    @NotNull
    /* renamed from: a */
    public static final C10637d m36374a(@NotNull ActivityFeedLoop activityFeedLoop) {
        C2668g.b(activityFeedLoop, "$receiver");
        return new C10637d(activityFeedLoop.getId(), C8496j.m36391a(activityFeedLoop.getThumbnailImages()), C8496j.m36396b(activityFeedLoop.getVideos()));
    }

    @NotNull
    /* renamed from: a */
    public static final C10643r m36383a(@NotNull InstagramNewMedia instagramNewMedia) {
        C2668g.b(instagramNewMedia, "$receiver");
        return new C10643r(instagramNewMedia.getTimestamp(), instagramNewMedia.getId(), instagramNewMedia.getUserId(), instagramNewMedia.getUserName(), instagramNewMedia.getCaption(), C8496j.m36412n(instagramNewMedia.getMedia()));
    }

    @NotNull
    /* renamed from: a */
    public static final C10643r m36384a(@NotNull InstagramNewMedia instagramNewMedia, @NotNull String str) {
        C2668g.b(instagramNewMedia, "$receiver");
        C2668g.b(str, "carouselItemId");
        return new C10643r(instagramNewMedia.getTimestamp(), instagramNewMedia.getId(), instagramNewMedia.getUserId(), instagramNewMedia.getUserName(), instagramNewMedia.getCaption(), C8496j.m36401d(instagramNewMedia.getMedia(), str));
    }

    @NotNull
    /* renamed from: a */
    public static final C10642p m36380a(@NotNull InstagramConnect instagramConnect) {
        C2668g.b(instagramConnect, "$receiver");
        return new C10642p(instagramConnect.getUserNumber(), instagramConnect.getTimestamp(), instagramConnect.getInstagramUserName(), C8496j.m36410l(instagramConnect.getPhotos()));
    }

    @NotNull
    /* renamed from: a */
    public static final C10642p m36381a(@NotNull InstagramConnect instagramConnect, @NotNull String str) {
        C2668g.b(instagramConnect, "$receiver");
        C2668g.b(str, "carouselItemId");
        return new C10642p(instagramConnect.getUserNumber(), instagramConnect.getTimestamp(), instagramConnect.getInstagramUserName(), C8496j.m36397b(instagramConnect.getPhotos(), str));
    }

    @NotNull
    /* renamed from: a */
    public static final C10636b m36372a(@NotNull ActivityFeedImage activityFeedImage) {
        C2668g.b(activityFeedImage, "$receiver");
        return new C10636b(activityFeedImage.getWidth(), activityFeedImage.getHeight(), activityFeedImage.getUrl(), activityFeedImage.getName());
    }

    @NotNull
    /* renamed from: a */
    public static final C8495g m36378a(@NotNull ActivityFeedSchool activityFeedSchool) {
        C2668g.b(activityFeedSchool, "$receiver");
        return new C8495g(activityFeedSchool.getName(), activityFeedSchool.getType(), activityFeedSchool.getYear());
    }

    @NotNull
    /* renamed from: a */
    public static final C8493c m36373a(@NotNull ActivityFeedJob activityFeedJob) {
        C2668g.b(activityFeedJob, "$receiver");
        return new C8493c(activityFeedJob.getCompany(), activityFeedJob.getTitle());
    }

    @NotNull
    /* renamed from: a */
    public static final C10639h m36379a(@NotNull ActivityFeedVideo activityFeedVideo) {
        C2668g.b(activityFeedVideo, "$receiver");
        return new C10639h(activityFeedVideo.getWidth(), activityFeedVideo.getHeight(), activityFeedVideo.getUrl(), activityFeedVideo.getName());
    }

    @NotNull
    /* renamed from: a */
    public static final List<C10636b> m36391a(@NotNull List<ActivityFeedImage> list) {
        C2668g.b(list, "$receiver");
        Iterable<ActivityFeedImage> iterable = list;
        Collection arrayList = new ArrayList(C19301m.a(iterable, 10));
        for (ActivityFeedImage a : iterable) {
            arrayList.add(C8496j.m36372a(a));
        }
        return (List) arrayList;
    }

    @NotNull
    /* renamed from: b */
    public static final List<C10639h> m36396b(@NotNull List<ActivityFeedVideo> list) {
        C2668g.b(list, "$receiver");
        Iterable<ActivityFeedVideo> iterable = list;
        Collection arrayList = new ArrayList(C19301m.a(iterable, 10));
        for (ActivityFeedVideo a : iterable) {
            arrayList.add(C8496j.m36379a(a));
        }
        return (List) arrayList;
    }

    @NotNull
    /* renamed from: a */
    public static final C10644y m36385a(@NotNull ActivityEventNewMatch activityEventNewMatch, @NotNull Photo photo) {
        C2668g.b(activityEventNewMatch, "$receiver");
        C2668g.b(photo, "matchPhoto");
        return new C10644y(activityEventNewMatch.getUserNumber(), activityEventNewMatch.getOtherUserNumber(), activityEventNewMatch.getTimestamp(), C8496j.m36375a(photo));
    }

    @NotNull
    /* renamed from: a */
    public static final C10644y m36386a(@NotNull ActivityEventNewMatch activityEventNewMatch, @NotNull List<? extends Photo> list, @NotNull String str) {
        C2668g.b(activityEventNewMatch, "$receiver");
        C2668g.b(list, "userPhotos");
        C2668g.b(str, "carouselItemId");
        return new C10644y(activityEventNewMatch.getUserNumber(), activityEventNewMatch.getOtherUserNumber(), activityEventNewMatch.getTimestamp(), C8496j.m36377a((List) list, str));
    }

    @NotNull
    /* renamed from: a */
    public static final aj m36369a(@NotNull ProfileChangeAnthem profileChangeAnthem, @NotNull Photo photo) {
        C2668g.b(profileChangeAnthem, "$receiver");
        C2668g.b(photo, "matchPhoto");
        return new aj(profileChangeAnthem.getUserNumber(), profileChangeAnthem.getTimestamp(), C8496j.m36370a(profileChangeAnthem.getSong()), C8496j.m36375a(photo));
    }

    @NotNull
    /* renamed from: a */
    public static final C9539e m36387a(@NotNull ActivityFeedUserInfo activityFeedUserInfo, @NotNull List<? extends PhotoMediaViewModel> list) {
        C2668g.b(activityFeedUserInfo, "$receiver");
        C2668g.b(list, ManagerWebServices.PARAM_SPOTIFY_IMAGES);
        return new C9539e(activityFeedUserInfo.getName(), activityFeedUserInfo.getUserId(), list, C8496j.m36407i(activityFeedUserInfo.getSchools()), C8496j.m36408j(activityFeedUserInfo.getJobs()), activityFeedUserInfo.getDistanceInMiles(), activityFeedUserInfo.getGender(), activityFeedUserInfo.isVerified());
    }

    @NotNull
    /* renamed from: c */
    public static final List<PhotoMediaViewModel> m36398c(@NotNull List<ActivityFeedPhoto> list) {
        C2668g.b(list, "$receiver");
        return C8496j.m36411m(list);
    }

    @NotNull
    /* renamed from: d */
    public static final List<C10638f> m36400d(@NotNull List<ActivityFeedPhoto> list) {
        C2668g.b(list, "$receiver");
        return C8496j.m36410l(list);
    }

    @NotNull
    /* renamed from: a */
    public static final ak m36370a(@NotNull ActivityFeedSong activityFeedSong) {
        C2668g.b(activityFeedSong, "$receiver");
        String id = activityFeedSong.getId();
        String name = activityFeedSong.getName();
        String url = activityFeedSong.getUrl();
        ActivityFeedAlbum album = activityFeedSong.getAlbum();
        return new ak(id, name, url, album != null ? C8496j.m36367a(album) : null, C8496j.m36406h(activityFeedSong.getArtists()));
    }

    /* renamed from: a */
    private static final ah m36367a(@NotNull ActivityFeedAlbum activityFeedAlbum) {
        return new ah(activityFeedAlbum.getName(), C8496j.m36391a(activityFeedAlbum.getImages()));
    }

    /* renamed from: a */
    private static final ai m36368a(@NotNull ActivityFeedArtist activityFeedArtist) {
        return new ai(activityFeedArtist.getId(), activityFeedArtist.getName(), C8496j.m36391a(activityFeedArtist.getImages()));
    }

    /* renamed from: h */
    private static final List<ai> m36406h(@NotNull List<ActivityFeedArtist> list) {
        Iterable<ActivityFeedArtist> iterable = list;
        Collection arrayList = new ArrayList(C19301m.a(iterable, 10));
        for (ActivityFeedArtist a : iterable) {
            arrayList.add(C8496j.m36368a(a));
        }
        return (List) arrayList;
    }

    /* renamed from: i */
    private static final List<C8495g> m36407i(@NotNull List<ActivityFeedSchool> list) {
        Iterable<ActivityFeedSchool> iterable = list;
        Collection arrayList = new ArrayList(C19301m.a(iterable, 10));
        for (ActivityFeedSchool a : iterable) {
            arrayList.add(C8496j.m36378a(a));
        }
        return (List) arrayList;
    }

    /* renamed from: j */
    private static final List<C8493c> m36408j(@NotNull List<ActivityFeedJob> list) {
        Iterable<ActivityFeedJob> iterable = list;
        Collection arrayList = new ArrayList(C19301m.a(iterable, 10));
        for (ActivityFeedJob a : iterable) {
            arrayList.add(C8496j.m36373a(a));
        }
        return (List) arrayList;
    }

    /* renamed from: k */
    private static final List<ak> m36409k(@NotNull List<ActivityFeedSong> list) {
        Iterable<ActivityFeedSong> iterable = list;
        Collection arrayList = new ArrayList(C19301m.a(iterable, 10));
        for (ActivityFeedSong a : iterable) {
            arrayList.add(C8496j.m36370a(a));
        }
        return (List) arrayList;
    }

    @NotNull
    /* renamed from: a */
    public static final Map<String, String> m36392a(@NotNull C10636b c10636b) {
        C2668g.b(c10636b, "$receiver");
        return ae.a(C15811g.a("url", c10636b.m42938c()));
    }

    @NotNull
    /* renamed from: e */
    public static final List<Map<String, String>> m36402e(@NotNull List<C10636b> list) {
        C2668g.b(list, "$receiver");
        Iterable<C10636b> iterable = list;
        Collection arrayList = new ArrayList(C19301m.a(iterable, 10));
        for (C10636b a : iterable) {
            arrayList.add(C8496j.m36392a(a));
        }
        return (List) arrayList;
    }

    @NotNull
    /* renamed from: a */
    public static final Artist m36389a(@NotNull ai aiVar) {
        C2668g.b(aiVar, "$receiver");
        return new Artist(aiVar.m36347a(), aiVar.m36348b(), null, false);
    }

    @NotNull
    /* renamed from: f */
    public static final List<Artist> m36404f(@NotNull List<ai> list) {
        C2668g.b(list, "$receiver");
        Iterable<ai> iterable = list;
        Collection arrayList = new ArrayList(C19301m.a(iterable, 10));
        for (ai a : iterable) {
            arrayList.add(C8496j.m36389a(a));
        }
        return (List) arrayList;
    }

    @NotNull
    /* renamed from: a */
    public static final Album m36388a(@NotNull ah ahVar) {
        C2668g.b(ahVar, "$receiver");
        return new Album("", "", ahVar.m36345a(), C8496j.m36402e(ahVar.m36346b()));
    }

    @NotNull
    /* renamed from: a */
    public static final SearchTrack m36390a(@NotNull ak akVar) {
        C2668g.b(akVar, "$receiver");
        String a = akVar.m36349a();
        String b = akVar.m36350b();
        ah d = akVar.m36352d();
        return new SearchTrack(a, b, d != null ? C8496j.m36388a(d) : null, C8496j.m36404f(akVar.m36353e()), true, 0, akVar.m36351c(), "");
    }

    @NotNull
    /* renamed from: a */
    public static final C10636b m36371a(@NotNull Render render) {
        C2668g.b(render, "$receiver");
        int width = render.width();
        int height = render.height();
        render = render.url();
        C2668g.a(render, "url()");
        return new C10636b(width, height, render, "");
    }

    @NotNull
    /* renamed from: g */
    public static final List<C10636b> m36405g(@NotNull List<? extends Render> list) {
        C2668g.b(list, "$receiver");
        Iterable<Render> iterable = list;
        Collection arrayList = new ArrayList(C19301m.a(iterable, 10));
        for (Render a : iterable) {
            arrayList.add(C8496j.m36371a(a));
        }
        return (List) arrayList;
    }

    @NotNull
    /* renamed from: a */
    public static final C10638f m36377a(@NotNull List<? extends Photo> list, @NotNull String str) {
        C2668g.b(list, "$receiver");
        C2668g.b(str, "carouselItemId");
        for (Object next : list) {
            if (C2668g.a(((Photo) next).id(), str)) {
                break;
            }
        }
        Object next2 = null;
        Photo photo = (Photo) next2;
        if (photo == null) {
            photo = (Photo) C19301m.f(list);
        }
        str = photo.id();
        C2668g.a(str, "photo.id()");
        List renders = photo.renders();
        C2668g.a(renders, "photo.renders()");
        return new C10638f(str, C8496j.m36405g(renders));
    }

    @NotNull
    /* renamed from: a */
    public static final C10638f m36375a(@NotNull Photo photo) {
        C2668g.b(photo, "$receiver");
        String id = photo.id();
        C2668g.a(id, "id()");
        photo = photo.renders();
        C2668g.a(photo, "renders()");
        return new C10638f(id, C8496j.m36405g(photo));
    }

    /* renamed from: l */
    private static final List<C10638f> m36410l(@NotNull List<ActivityFeedPhoto> list) {
        Iterable<ActivityFeedPhoto> iterable = list;
        Collection arrayList = new ArrayList(C19301m.a(iterable, 10));
        for (ActivityFeedPhoto a : iterable) {
            arrayList.add(C8496j.m36376a(a));
        }
        return (List) arrayList;
    }

    /* renamed from: m */
    private static final List<PhotoMediaViewModel> m36411m(@NotNull List<ActivityFeedPhoto> list) {
        Iterable<ActivityFeedPhoto> iterable = list;
        Collection arrayList = new ArrayList(C19301m.a(iterable, 10));
        for (ActivityFeedPhoto activityFeedPhoto : iterable) {
            Object a;
            if (activityFeedPhoto.getVideos().isEmpty()) {
                a = C8496j.m36376a(activityFeedPhoto);
            } else {
                a = C8496j.m36395b(activityFeedPhoto);
            }
            arrayList.add(a);
        }
        return (List) arrayList;
    }

    /* renamed from: b */
    private static final List<C10638f> m36397b(@NotNull List<ActivityFeedPhoto> list, String str) {
        for (Object next : list) {
            if (C2668g.a(((ActivityFeedPhoto) next).getId(), str)) {
                break;
            }
        }
        Object next2 = null;
        ActivityFeedPhoto activityFeedPhoto = (ActivityFeedPhoto) next2;
        if (activityFeedPhoto == null) {
            activityFeedPhoto = (ActivityFeedPhoto) C19301m.f(list);
        }
        return C19301m.a(C8496j.m36376a(activityFeedPhoto));
    }

    /* renamed from: c */
    private static final List<C10637d> m36399c(@NotNull List<ActivityFeedLoop> list, String str) {
        for (Object next : list) {
            if (C2668g.a(((ActivityFeedLoop) next).getId(), str)) {
                break;
            }
        }
        Object next2 = null;
        ActivityFeedLoop activityFeedLoop = (ActivityFeedLoop) next2;
        if (activityFeedLoop == null) {
            activityFeedLoop = (ActivityFeedLoop) C19301m.f(list);
        }
        return C19301m.a(C8496j.m36374a(activityFeedLoop));
    }

    /* renamed from: n */
    private static final List<C8499q> m36412n(@NotNull List<InstagramMedia> list) {
        Iterable<InstagramMedia> iterable = list;
        Collection arrayList = new ArrayList(C19301m.a(iterable, 10));
        for (InstagramMedia a : iterable) {
            arrayList.add(C8496j.m36382a(a));
        }
        return (List) arrayList;
    }

    /* renamed from: d */
    private static final List<C8499q> m36401d(@NotNull List<InstagramMedia> list, String str) {
        for (Object next : list) {
            if (C2668g.a(((InstagramMedia) next).getId(), str)) {
                break;
            }
        }
        Object next2 = null;
        InstagramMedia instagramMedia = (InstagramMedia) next2;
        if (instagramMedia == null) {
            instagramMedia = (InstagramMedia) C19301m.f(list);
        }
        return C19301m.a(C8496j.m36382a(instagramMedia));
    }

    /* renamed from: e */
    private static final List<ak> m36403e(@NotNull List<ActivityFeedSong> list, String str) {
        for (Object next : list) {
            if (C2668g.a(((ActivityFeedSong) next).getId(), str)) {
                break;
            }
        }
        Object next2 = null;
        ActivityFeedSong activityFeedSong = (ActivityFeedSong) next2;
        if (activityFeedSong == null) {
            activityFeedSong = (ActivityFeedSong) C19301m.f(list);
        }
        return C19301m.a(C8496j.m36370a(activityFeedSong));
    }

    /* renamed from: a */
    private static final C8499q m36382a(@NotNull InstagramMedia instagramMedia) {
        List a = C8496j.m36391a(instagramMedia.getImages());
        List b = C8496j.m36396b(instagramMedia.getVideos());
        instagramMedia = instagramMedia.getId();
        if ((a.isEmpty() ^ 1) == 0) {
            a = b;
        }
        return new C8499q(instagramMedia, a);
    }

    /* renamed from: o */
    private static final List<C10637d> m36413o(@NotNull List<ActivityFeedLoop> list) {
        Iterable<ActivityFeedLoop> iterable = list;
        Collection arrayList = new ArrayList(C19301m.a(iterable, 10));
        for (ActivityFeedLoop a : iterable) {
            arrayList.add(C8496j.m36374a(a));
        }
        return (List) arrayList;
    }

    /* renamed from: a */
    public static final boolean m36394a(@NotNull C10643r c10643r) {
        C2668g.b(c10643r, "$receiver");
        return C8496j.m36393a((C8499q) C19301m.f(c10643r.m42956f()));
    }

    /* renamed from: a */
    public static final boolean m36393a(@NotNull C8499q c8499q) {
        C2668g.b(c8499q, "$receiver");
        return C19301m.g(c8499q.m36420b()) instanceof C10639h;
    }

    /* renamed from: p */
    private static final List<C8493c> m36414p(@NotNull List<ActivityFeedJob> list) {
        Iterable<ActivityFeedJob> iterable = list;
        Collection arrayList = new ArrayList(C19301m.a(iterable, 10));
        for (ActivityFeedJob a : iterable) {
            arrayList.add(C8496j.m36373a(a));
        }
        return (List) arrayList;
    }

    /* renamed from: q */
    private static final List<C8495g> m36415q(@NotNull List<ActivityFeedSchool> list) {
        Iterable<ActivityFeedSchool> iterable = list;
        Collection arrayList = new ArrayList(C19301m.a(iterable, 10));
        for (ActivityFeedSchool a : iterable) {
            arrayList.add(C8496j.m36378a(a));
        }
        return (List) arrayList;
    }
}
