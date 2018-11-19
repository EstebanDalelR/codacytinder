package com.tinder.data.feed;

import com.tinder.api.model.activityfeed.ApiActivityCommentMetaData;
import com.tinder.api.model.activityfeed.ApiActivityEventInstagramConnect;
import com.tinder.api.model.activityfeed.ApiActivityEventInstagramMedia;
import com.tinder.api.model.activityfeed.ApiActivityEventInstagramNewMedia;
import com.tinder.api.model.activityfeed.ApiActivityEventMatch;
import com.tinder.api.model.activityfeed.ApiActivityEventProfileAddLoop;
import com.tinder.api.model.activityfeed.ApiActivityEventProfileAddPhoto;
import com.tinder.api.model.activityfeed.ApiActivityEventProfileChangeAnthem;
import com.tinder.api.model.activityfeed.ApiActivityEventProfileChangeBio;
import com.tinder.api.model.activityfeed.ApiActivityEventProfileChangeSchool;
import com.tinder.api.model.activityfeed.ApiActivityEventProfileChangeWork;
import com.tinder.api.model.activityfeed.ApiActivityEventProfileSpotifyTopArtist;
import com.tinder.api.model.activityfeed.ApiActivityEventSpotifyAlbum;
import com.tinder.api.model.activityfeed.ApiActivityEventSpotifyArtist;
import com.tinder.api.model.activityfeed.ApiActivityEventSpotifyTrack;
import com.tinder.api.model.activityfeed.ApiActivityFeedAnthem;
import com.tinder.api.model.activityfeed.ApiActivityFeedArtist;
import com.tinder.api.model.activityfeed.ApiActivityFeedComment;
import com.tinder.api.model.activityfeed.ApiActivityFeedImage;
import com.tinder.api.model.activityfeed.ApiActivityFeedJob;
import com.tinder.api.model.activityfeed.ApiActivityFeedLoop;
import com.tinder.api.model.activityfeed.ApiActivityFeedPhoto;
import com.tinder.api.model.activityfeed.ApiActivityFeedSchool;
import com.tinder.api.model.activityfeed.ApiActivityFeedVideo;
import com.tinder.api.model.activityfeed.ApiActivityUserInfo;
import com.tinder.domain.common.model.Gender;
import com.tinder.domain.common.model.Gender.Value;
import com.tinder.domain.feed.ActivityCommentMetaData;
import com.tinder.domain.feed.ActivityEventNewMatch;
import com.tinder.domain.feed.ActivityFeedAlbum;
import com.tinder.domain.feed.ActivityFeedArtist;
import com.tinder.domain.feed.ActivityFeedComment;
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
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import kotlin.sequences.C19285g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000ð\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002\u001a(\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002\u001a\f\u0010\t\u001a\u00020\n*\u00020\u000bH\u0002\u001a\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0005*\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0005H\u0000\u001a\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0000\u001a\f\u0010\u0010\u001a\u00020\u0011*\u00020\u0012H\u0000\u001a\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u0005*\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0005H\u0000\u001a\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0005*\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0005H\u0000\u001a\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0005*\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0005H\u0000\u001a\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0005*\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u0005H\u0000\u001a\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0005*\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u0005H\u0000\u001a\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0005*\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u0005H\u0000\u001a\u000e\u0010#\u001a\u00020$*\u0004\u0018\u00010%H\u0000\u001a\f\u0010#\u001a\u00020&*\u00020'H\u0000\u001a\f\u0010#\u001a\u00020(*\u00020)H\u0000\u001a\f\u0010#\u001a\u00020**\u00020+H\u0000\u001a\f\u0010#\u001a\u00020,*\u00020-H\u0000\u001a\f\u0010#\u001a\u00020.*\u00020/H\u0000\u001a\f\u0010#\u001a\u000200*\u000201H\u0000\u001a\f\u0010#\u001a\u000202*\u000203H\u0000\u001a\f\u0010#\u001a\u000204*\u000205H\u0000\u001a\f\u0010#\u001a\u000206*\u000207H\u0000\u001a\f\u0010#\u001a\u000208*\u000209H\u0000\u001a\f\u0010#\u001a\u00020:*\u00020;H\u0000\u001a\f\u0010#\u001a\u00020\u0001*\u00020<H\u0000\u001a\f\u0010#\u001a\u00020\u0018*\u00020\u0019H\u0000\u001a\f\u0010#\u001a\u00020=*\u00020>H\u0000\u001a\f\u0010#\u001a\u00020\u001e*\u00020\u001fH\u0000\u001a\u000e\u0010#\u001a\u0004\u0018\u00010?*\u00020\u000bH\u0000\u001a\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020A0\u0005*\n\u0012\u0004\u0012\u00020B\u0018\u00010\u0005H\u0000\u001a\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00180\u0005*\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0005H\u0000\u001a\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020=0\u0005*\n\u0012\u0004\u0012\u00020>\u0018\u00010\u0005H\u0000\u001a\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0005*\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u0005H\u0000¨\u0006F"}, d2 = {"createActivityFeedSong", "Lcom/tinder/domain/feed/ActivityFeedSong;", "apiSpotifyTrack", "Lcom/tinder/api/model/activityfeed/ApiActivityEventSpotifyTrack;", "apiSpotifyArtists", "", "Lcom/tinder/api/model/activityfeed/ApiActivityEventSpotifyArtist;", "reverseMapSpotifyTracksFromSpotifyArtistsToArtists", "", "extractGender", "Lcom/tinder/domain/common/model/Gender;", "Lcom/tinder/api/model/activityfeed/ApiActivityUserInfo;", "toActivityFeedArtistList", "Lcom/tinder/domain/feed/ActivityFeedArtist;", "Lcom/tinder/api/model/activityfeed/ApiActivityFeedArtist;", "toActivityFeedArtistSongs", "toActivityFeedComment", "Lcom/tinder/domain/feed/ActivityFeedComment;", "Lcom/tinder/api/model/activityfeed/ApiActivityFeedComment;", "toActivityFeedCommentList", "toActivityFeedImageList", "Lcom/tinder/domain/feed/ActivityFeedImage;", "Lcom/tinder/api/model/activityfeed/ApiActivityFeedImage;", "toActivityFeedJobList", "Lcom/tinder/domain/feed/ActivityFeedJob;", "Lcom/tinder/api/model/activityfeed/ApiActivityFeedJob;", "toActivityFeedPhotoList", "Lcom/tinder/domain/feed/ActivityFeedPhoto;", "Lcom/tinder/api/model/activityfeed/ApiActivityFeedPhoto;", "toActivityFeedSchoolList", "Lcom/tinder/domain/feed/ActivityFeedSchool;", "Lcom/tinder/api/model/activityfeed/ApiActivityFeedSchool;", "toActivityFeedVideoList", "Lcom/tinder/domain/feed/ActivityFeedVideo;", "Lcom/tinder/api/model/activityfeed/ApiActivityFeedVideo;", "toDomainModel", "Lcom/tinder/domain/feed/ActivityCommentMetaData;", "Lcom/tinder/api/model/activityfeed/ApiActivityCommentMetaData;", "Lcom/tinder/domain/feed/InstagramConnect;", "Lcom/tinder/api/model/activityfeed/ApiActivityEventInstagramConnect;", "Lcom/tinder/domain/feed/InstagramNewMedia;", "Lcom/tinder/api/model/activityfeed/ApiActivityEventInstagramNewMedia;", "Lcom/tinder/domain/feed/ActivityEventNewMatch;", "Lcom/tinder/api/model/activityfeed/ApiActivityEventMatch;", "Lcom/tinder/domain/feed/ProfileAddLoop;", "Lcom/tinder/api/model/activityfeed/ApiActivityEventProfileAddLoop;", "Lcom/tinder/domain/feed/ProfileAddPhoto;", "Lcom/tinder/api/model/activityfeed/ApiActivityEventProfileAddPhoto;", "Lcom/tinder/domain/feed/ProfileChangeAnthem;", "Lcom/tinder/api/model/activityfeed/ApiActivityEventProfileChangeAnthem;", "Lcom/tinder/domain/feed/ProfileChangeBio;", "Lcom/tinder/api/model/activityfeed/ApiActivityEventProfileChangeBio;", "Lcom/tinder/domain/feed/ProfileChangeSchool;", "Lcom/tinder/api/model/activityfeed/ApiActivityEventProfileChangeSchool;", "Lcom/tinder/domain/feed/ProfileChangeWork;", "Lcom/tinder/api/model/activityfeed/ApiActivityEventProfileChangeWork;", "Lcom/tinder/domain/feed/ProfileSpotifyTopArtist;", "Lcom/tinder/api/model/activityfeed/ApiActivityEventProfileSpotifyTopArtist;", "Lcom/tinder/domain/feed/ActivityFeedAlbum;", "Lcom/tinder/api/model/activityfeed/ApiActivityEventSpotifyAlbum;", "Lcom/tinder/api/model/activityfeed/ApiActivityFeedAnthem;", "Lcom/tinder/domain/feed/ActivityFeedLoop;", "Lcom/tinder/api/model/activityfeed/ApiActivityFeedLoop;", "Lcom/tinder/domain/feed/ActivityFeedUserInfo;", "toInstagramMediaList", "Lcom/tinder/domain/feed/InstagramMedia;", "Lcom/tinder/api/model/activityfeed/ApiActivityEventInstagramMedia;", "toJobsList", "toLoopsList", "toSchoolsList", "data_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.data.feed.b */
public final class C8653b {
    @NotNull
    /* renamed from: a */
    public static final ActivityCommentMetaData m36895a(@Nullable ApiActivityCommentMetaData apiActivityCommentMetaData) {
        apiActivityCommentMetaData = apiActivityCommentMetaData != null ? apiActivityCommentMetaData.getCarouselItemId() : null;
        if (apiActivityCommentMetaData == null) {
            apiActivityCommentMetaData = "";
        }
        return new ActivityCommentMetaData(apiActivityCommentMetaData);
    }

    @Nullable
    /* renamed from: a */
    public static final ActivityFeedUserInfo m36904a(@NotNull ApiActivityUserInfo apiActivityUserInfo) {
        C2668g.b(apiActivityUserInfo, "$receiver");
        String userId = apiActivityUserInfo.getUserId();
        if (userId == null) {
            return null;
        }
        boolean z;
        String name = apiActivityUserInfo.getName();
        if (name == null) {
            name = "";
        }
        String str = name;
        List f = C8653b.m36920f(apiActivityUserInfo.getPhotos());
        List i = C8653b.m36923i(apiActivityUserInfo.getJobs());
        List h = C8653b.m36922h(apiActivityUserInfo.getSchools());
        Gender b = C8653b.m36915b(apiActivityUserInfo);
        Double distanceInMiles = apiActivityUserInfo.getDistanceInMiles();
        apiActivityUserInfo = apiActivityUserInfo.isVerified();
        if (apiActivityUserInfo != null) {
            if (apiActivityUserInfo.intValue() == 1) {
                z = true;
                return new ActivityFeedUserInfo(userId, str, f, i, h, b, distanceInMiles, z);
            }
        }
        z = false;
        return new ActivityFeedUserInfo(userId, str, f, i, h, b, distanceInMiles, z);
    }

    @NotNull
    /* renamed from: a */
    public static final ActivityFeedComment m36898a(@NotNull ApiActivityFeedComment apiActivityFeedComment) {
        C2668g.b(apiActivityFeedComment, "$receiver");
        String message = apiActivityFeedComment.getMessage();
        if (message == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        String activityFeedItemId = apiActivityFeedComment.getActivityFeedItemId();
        if (activityFeedItemId == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        Long createdAt = apiActivityFeedComment.getCreatedAt();
        if (createdAt != null) {
            return new ActivityFeedComment(message, activityFeedItemId, createdAt.longValue(), C8653b.m36895a(apiActivityFeedComment.getMetadata()), null, 16, null);
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @NotNull
    /* renamed from: a */
    public static final List<ActivityFeedComment> m36914a(@Nullable List<ApiActivityFeedComment> list) {
        List<ActivityFeedComment> list2;
        if (list != null) {
            Iterable<ApiActivityFeedComment> iterable = list;
            Collection arrayList = new ArrayList(C19301m.a(iterable, 10));
            for (ApiActivityFeedComment a : iterable) {
                arrayList.add(C8653b.m36898a(a));
            }
            list2 = (List) arrayList;
        } else {
            list2 = null;
        }
        return list2 != null ? list2 : C19301m.a();
    }

    @NotNull
    /* renamed from: b */
    public static final List<InstagramMedia> m36916b(@Nullable List<ApiActivityEventInstagramMedia> list) {
        List<InstagramMedia> list2;
        if (list != null) {
            Iterable<ApiActivityEventInstagramMedia> iterable = list;
            Collection arrayList = new ArrayList(C19301m.a(iterable, 10));
            for (ApiActivityEventInstagramMedia apiActivityEventInstagramMedia : iterable) {
                String component1 = apiActivityEventInstagramMedia.component1();
                List component2 = apiActivityEventInstagramMedia.component2();
                List component3 = apiActivityEventInstagramMedia.component3();
                if (component1 == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                arrayList.add(new InstagramMedia(component1, C8653b.m36917c(component2), C8653b.m36918d(component3)));
            }
            list2 = (List) arrayList;
        } else {
            list2 = null;
        }
        return list2 != null ? list2 : C19301m.a();
    }

    @NotNull
    /* renamed from: c */
    public static final List<ActivityFeedImage> m36917c(@Nullable List<ApiActivityFeedImage> list) {
        List<ActivityFeedImage> list2;
        if (list != null) {
            Iterable<ApiActivityFeedImage> iterable = list;
            Collection arrayList = new ArrayList(C19301m.a(iterable, 10));
            for (ApiActivityFeedImage apiActivityFeedImage : iterable) {
                Integer component1 = apiActivityFeedImage.component1();
                Integer component2 = apiActivityFeedImage.component2();
                String component3 = apiActivityFeedImage.component3();
                String component4 = apiActivityFeedImage.component4();
                if (component1 == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                int intValue = component1.intValue();
                if (component2 == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                int intValue2 = component2.intValue();
                if (component3 == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                if (component4 == null) {
                    component4 = "";
                }
                arrayList.add(new ActivityFeedImage(intValue, intValue2, component3, component4));
            }
            list2 = (List) arrayList;
        } else {
            list2 = null;
        }
        return list2 != null ? list2 : C19301m.a();
    }

    @NotNull
    /* renamed from: d */
    public static final List<ActivityFeedVideo> m36918d(@Nullable List<ApiActivityFeedVideo> list) {
        List<ActivityFeedVideo> list2;
        if (list != null) {
            Iterable<ApiActivityFeedVideo> iterable = list;
            Collection arrayList = new ArrayList(C19301m.a(iterable, 10));
            for (ApiActivityFeedVideo apiActivityFeedVideo : iterable) {
                Integer component1 = apiActivityFeedVideo.component1();
                Integer component2 = apiActivityFeedVideo.component2();
                String component3 = apiActivityFeedVideo.component3();
                String component4 = apiActivityFeedVideo.component4();
                if (component1 == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                int intValue = component1.intValue();
                if (component2 == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                int intValue2 = component2.intValue();
                if (component3 == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                if (component4 == null) {
                    component4 = "";
                }
                arrayList.add(new ActivityFeedVideo(intValue, intValue2, component3, component4));
            }
            list2 = (List) arrayList;
        } else {
            list2 = null;
        }
        return list2 != null ? list2 : C19301m.a();
    }

    @NotNull
    /* renamed from: e */
    public static final List<ActivityFeedSong> m36919e(@Nullable List<ApiActivityEventSpotifyArtist> list) {
        if (list == null) {
            list = C19301m.a();
        }
        list = C8653b.m36927m(list);
        Collection arrayList = new ArrayList(list.size());
        list = list.entrySet().iterator();
        while (list.hasNext()) {
            Entry entry = (Entry) list.next();
            arrayList.add(C8653b.m36902a((ApiActivityEventSpotifyTrack) entry.getKey(), (List) entry.getValue()));
        }
        return (List) arrayList;
    }

    @NotNull
    /* renamed from: a */
    public static final ActivityFeedAlbum m36897a(@NotNull ApiActivityEventSpotifyAlbum apiActivityEventSpotifyAlbum) {
        C2668g.b(apiActivityEventSpotifyAlbum, "$receiver");
        String name = apiActivityEventSpotifyAlbum.getName();
        if (name == null) {
            name = "";
        }
        return new ActivityFeedAlbum(name, C8653b.m36917c(apiActivityEventSpotifyAlbum.getImages()));
    }

    @NotNull
    /* renamed from: f */
    public static final List<ActivityFeedPhoto> m36920f(@Nullable List<ApiActivityFeedPhoto> list) {
        List<ActivityFeedPhoto> list2;
        if (list != null) {
            Iterable<ApiActivityFeedPhoto> iterable = list;
            Collection arrayList = new ArrayList(C19301m.a(iterable, 10));
            for (ApiActivityFeedPhoto apiActivityFeedPhoto : iterable) {
                String component1 = apiActivityFeedPhoto.component1();
                List component2 = apiActivityFeedPhoto.component2();
                List component3 = apiActivityFeedPhoto.component3();
                if (component1 == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                arrayList.add(new ActivityFeedPhoto(component1, C8653b.m36917c(component2), C8653b.m36918d(component3)));
            }
            list2 = (List) arrayList;
        } else {
            list2 = null;
        }
        return list2 != null ? list2 : C19301m.a();
    }

    @NotNull
    /* renamed from: g */
    public static final List<ActivityFeedArtist> m36921g(@Nullable List<ApiActivityFeedArtist> list) {
        List<ActivityFeedArtist> list2;
        if (list != null) {
            Iterable<ApiActivityFeedArtist> iterable = list;
            Collection arrayList = new ArrayList(C19301m.a(iterable, 10));
            for (ApiActivityFeedArtist apiActivityFeedArtist : iterable) {
                String component1 = apiActivityFeedArtist.component1();
                String component2 = apiActivityFeedArtist.component2();
                if (component1 == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                if (component2 == null) {
                    component2 = "";
                }
                arrayList.add(new ActivityFeedArtist(component1, component2, null, 4, null));
            }
            list2 = (List) arrayList;
        } else {
            list2 = null;
        }
        return list2 != null ? list2 : C19301m.a();
    }

    @NotNull
    /* renamed from: a */
    public static final ActivityFeedSong m36903a(@NotNull ApiActivityFeedAnthem apiActivityFeedAnthem) {
        C2668g.b(apiActivityFeedAnthem, "$receiver");
        String id = apiActivityFeedAnthem.getId();
        if (id == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        String name = apiActivityFeedAnthem.getName();
        if (name == null) {
            name = "";
        }
        String str = name;
        String url = apiActivityFeedAnthem.getUrl();
        if (url == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        ApiActivityEventSpotifyAlbum album = apiActivityFeedAnthem.getAlbum();
        ActivityFeedAlbum a = album != null ? C8653b.m36897a(album) : null;
        if (a != null) {
            return new ActivityFeedSong(id, str, url, a, C8653b.m36921g(apiActivityFeedAnthem.getArtists()));
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @NotNull
    /* renamed from: a */
    public static final InstagramNewMedia m36906a(@NotNull ApiActivityEventInstagramNewMedia apiActivityEventInstagramNewMedia) {
        C2668g.b(apiActivityEventInstagramNewMedia, "$receiver");
        Long userNumber = apiActivityEventInstagramNewMedia.getUserNumber();
        if (userNumber == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        long longValue = userNumber.longValue();
        userNumber = apiActivityEventInstagramNewMedia.getTimestamp();
        if (userNumber == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        long longValue2 = userNumber.longValue();
        String id = apiActivityEventInstagramNewMedia.getId();
        if (id == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        userNumber = apiActivityEventInstagramNewMedia.getUserId();
        if (userNumber == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        long longValue3 = userNumber.longValue();
        String userName = apiActivityEventInstagramNewMedia.getUserName();
        if (userName == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        String caption = apiActivityEventInstagramNewMedia.getCaption();
        if (caption == null) {
            caption = "";
        }
        return new InstagramNewMedia(longValue, longValue2, id, longValue3, userName, caption, C8653b.m36916b(apiActivityEventInstagramNewMedia.getMedia()));
    }

    @NotNull
    /* renamed from: a */
    public static final ProfileSpotifyTopArtist m36913a(@NotNull ApiActivityEventProfileSpotifyTopArtist apiActivityEventProfileSpotifyTopArtist) {
        C2668g.b(apiActivityEventProfileSpotifyTopArtist, "$receiver");
        Long userNumber = apiActivityEventProfileSpotifyTopArtist.getUserNumber();
        if (userNumber == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        long longValue = userNumber.longValue();
        userNumber = apiActivityEventProfileSpotifyTopArtist.getTimestamp();
        if (userNumber != null) {
            return new ProfileSpotifyTopArtist(longValue, userNumber.longValue(), C8653b.m36919e(apiActivityEventProfileSpotifyTopArtist.getArtists()));
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @NotNull
    /* renamed from: a */
    public static final ProfileAddPhoto m36908a(@NotNull ApiActivityEventProfileAddPhoto apiActivityEventProfileAddPhoto) {
        C2668g.b(apiActivityEventProfileAddPhoto, "$receiver");
        Long userNumber = apiActivityEventProfileAddPhoto.getUserNumber();
        if (userNumber == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        long longValue = userNumber.longValue();
        userNumber = apiActivityEventProfileAddPhoto.getTimestamp();
        if (userNumber != null) {
            return new ProfileAddPhoto(longValue, userNumber.longValue(), C8653b.m36920f(apiActivityEventProfileAddPhoto.getPhotos()));
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @NotNull
    /* renamed from: a */
    public static final InstagramConnect m36905a(@NotNull ApiActivityEventInstagramConnect apiActivityEventInstagramConnect) {
        C2668g.b(apiActivityEventInstagramConnect, "$receiver");
        Long userNumber = apiActivityEventInstagramConnect.getUserNumber();
        if (userNumber == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        long longValue = userNumber.longValue();
        userNumber = apiActivityEventInstagramConnect.getTimestamp();
        if (userNumber == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        long longValue2 = userNumber.longValue();
        String instagramUserName = apiActivityEventInstagramConnect.getInstagramUserName();
        if (instagramUserName == null) {
            instagramUserName = "";
        }
        return new InstagramConnect(longValue, longValue2, instagramUserName, C8653b.m36920f(apiActivityEventInstagramConnect.getPhotos()));
    }

    @NotNull
    /* renamed from: a */
    public static final ProfileChangeAnthem m36909a(@NotNull ApiActivityEventProfileChangeAnthem apiActivityEventProfileChangeAnthem) {
        C2668g.b(apiActivityEventProfileChangeAnthem, "$receiver");
        Long userNumber = apiActivityEventProfileChangeAnthem.getUserNumber();
        if (userNumber == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        long longValue = userNumber.longValue();
        userNumber = apiActivityEventProfileChangeAnthem.getTimestamp();
        if (userNumber == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        long longValue2 = userNumber.longValue();
        ApiActivityFeedAnthem anthem = apiActivityEventProfileChangeAnthem.getAnthem();
        ApiActivityEventProfileChangeAnthem a = anthem != null ? C8653b.m36903a(anthem) : null;
        if (a != null) {
            return new ProfileChangeAnthem(longValue, longValue2, a);
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @NotNull
    /* renamed from: a */
    public static final ActivityEventNewMatch m36896a(@NotNull ApiActivityEventMatch apiActivityEventMatch) {
        C2668g.b(apiActivityEventMatch, "$receiver");
        Long userNumber = apiActivityEventMatch.getUserNumber();
        if (userNumber == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        long longValue = userNumber.longValue();
        userNumber = apiActivityEventMatch.getOtherUserNumber();
        if (userNumber == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        long longValue2 = userNumber.longValue();
        apiActivityEventMatch = apiActivityEventMatch.getTimestamp();
        if (apiActivityEventMatch != null) {
            return new ActivityEventNewMatch(longValue, longValue2, ((Number) apiActivityEventMatch).longValue());
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @NotNull
    /* renamed from: h */
    public static final List<ActivityFeedSchool> m36922h(@Nullable List<ApiActivityFeedSchool> list) {
        List<ActivityFeedSchool> list2;
        if (list != null) {
            Iterable<ApiActivityFeedSchool> iterable = list;
            Collection arrayList = new ArrayList(C19301m.a(iterable, 10));
            for (ApiActivityFeedSchool apiActivityFeedSchool : iterable) {
                String component1 = apiActivityFeedSchool.component1();
                String component2 = apiActivityFeedSchool.component2();
                String component3 = apiActivityFeedSchool.component3();
                if (component1 == null) {
                    throw new IllegalStateException("school name must not be null".toString());
                }
                if (component2 == null) {
                    component2 = "";
                }
                if (component3 == null) {
                    component3 = "";
                }
                arrayList.add(new ActivityFeedSchool(component1, component2, component3));
            }
            list2 = (List) arrayList;
        } else {
            list2 = null;
        }
        return list2 != null ? list2 : C19301m.a();
    }

    @NotNull
    /* renamed from: i */
    public static final List<ActivityFeedJob> m36923i(@Nullable List<ApiActivityFeedJob> list) {
        if (list != null) {
            String component2;
            Collection arrayList = new ArrayList();
            for (Object next : list) {
                Object obj;
                CharSequence charSequence;
                Object obj2;
                ApiActivityFeedJob apiActivityFeedJob = (ApiActivityFeedJob) next;
                String component1 = apiActivityFeedJob.component1();
                component2 = apiActivityFeedJob.component2();
                CharSequence charSequence2 = component1;
                Object obj3 = 1;
                if (charSequence2 != null) {
                    if (charSequence2.length() != 0) {
                        obj = null;
                        if (obj != null) {
                            charSequence = component2;
                            if (charSequence != null) {
                                if (charSequence.length() == 0) {
                                    obj2 = null;
                                    if (obj2 != null) {
                                        obj3 = null;
                                    }
                                }
                            }
                            obj2 = 1;
                            if (obj2 != null) {
                                obj3 = null;
                            }
                        }
                        if (obj3 != null) {
                            arrayList.add(next);
                        }
                    }
                }
                obj = 1;
                if (obj != null) {
                    charSequence = component2;
                    if (charSequence != null) {
                        if (charSequence.length() == 0) {
                            obj2 = null;
                            if (obj2 != null) {
                                obj3 = null;
                            }
                        }
                    }
                    obj2 = 1;
                    if (obj2 != null) {
                        obj3 = null;
                    }
                }
                if (obj3 != null) {
                    arrayList.add(next);
                }
            }
            Iterable<ApiActivityFeedJob> iterable = (List) arrayList;
            Collection arrayList2 = new ArrayList(C19301m.a(iterable, 10));
            for (ApiActivityFeedJob apiActivityFeedJob2 : iterable) {
                component2 = apiActivityFeedJob2.component1();
                String component22 = apiActivityFeedJob2.component2();
                if (component2 == null) {
                    component2 = "";
                }
                if (component22 == null) {
                    component22 = "";
                }
                arrayList2.add(new ActivityFeedJob(component2, component22));
            }
            list = (List) arrayList2;
        } else {
            list = null;
        }
        return list != null ? list : C19301m.a();
    }

    /* renamed from: b */
    private static final Gender m36915b(@NotNull ApiActivityUserInfo apiActivityUserInfo) {
        Integer gender = apiActivityUserInfo.getGender();
        if (gender != null) {
            Integer showGenderOnProfile = apiActivityUserInfo.getShowGenderOnProfile();
            if (showGenderOnProfile != null) {
                if (showGenderOnProfile.intValue() == 1) {
                    apiActivityUserInfo = Gender.create(gender.intValue(), apiActivityUserInfo.getCustomGender());
                    C2668g.a(apiActivityUserInfo, "Gender.create(gender, customGender)");
                    return apiActivityUserInfo;
                }
            }
        }
        apiActivityUserInfo = Gender.create(Value.UNKNOWN);
        C2668g.a(apiActivityUserInfo, "Gender.create(Gender.Value.UNKNOWN)");
        return apiActivityUserInfo;
    }

    /* renamed from: m */
    private static final Map<ApiActivityEventSpotifyTrack, List<ApiActivityEventSpotifyArtist>> m36927m(List<ApiActivityEventSpotifyArtist> list) {
        Map<ApiActivityEventSpotifyTrack, List<ApiActivityEventSpotifyArtist>> linkedHashMap = new LinkedHashMap();
        list = C19285g.d(C19301m.r(list), C13807xa78ff905.f43814a).iterator();
        while (list.hasNext()) {
            Pair pair = (Pair) list.next();
            ApiActivityEventSpotifyTrack apiActivityEventSpotifyTrack = (ApiActivityEventSpotifyTrack) pair.c();
            ArrayList arrayList = linkedHashMap.get(apiActivityEventSpotifyTrack);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(apiActivityEventSpotifyTrack, arrayList);
            }
            arrayList.add((ApiActivityEventSpotifyArtist) pair.d());
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    private static final ActivityFeedSong m36902a(ApiActivityEventSpotifyTrack apiActivityEventSpotifyTrack, List<ApiActivityEventSpotifyArtist> list) {
        String id = apiActivityEventSpotifyTrack.getId();
        if (id == null) {
            throw ((Throwable) new IllegalStateException("Required value was null.".toString()));
        }
        String name = apiActivityEventSpotifyTrack.getName();
        if (name == null) {
            throw ((Throwable) new IllegalStateException("Required value was null.".toString()));
        }
        String url = apiActivityEventSpotifyTrack.getUrl();
        if (url == null) {
            url = "";
        }
        String str = url;
        ApiActivityEventSpotifyAlbum album = apiActivityEventSpotifyTrack.getAlbum();
        ApiActivityEventSpotifyTrack a = album != null ? C8653b.m36897a(album) : null;
        Iterable<ApiActivityEventSpotifyArtist> iterable = list;
        Collection collection = (Collection) new ArrayList(C19301m.a(iterable, 10));
        for (ApiActivityEventSpotifyArtist apiActivityEventSpotifyArtist : iterable) {
            String id2 = apiActivityEventSpotifyArtist.getId();
            if (id2 == null) {
                throw ((Throwable) new IllegalStateException("Required value was null.".toString()));
            }
            String name2 = apiActivityEventSpotifyArtist.getName();
            if (name2 == null) {
                throw ((Throwable) new IllegalStateException("Required value was null.".toString()));
            }
            collection.add(new ActivityFeedArtist(id2, name2, C8653b.m36917c(apiActivityEventSpotifyArtist.getImages())));
        }
        return new ActivityFeedSong(id, name, str, a, (List) collection);
    }

    @NotNull
    /* renamed from: a */
    public static final ProfileChangeBio m36910a(@NotNull ApiActivityEventProfileChangeBio apiActivityEventProfileChangeBio) {
        C2668g.b(apiActivityEventProfileChangeBio, "$receiver");
        Long userNumber = apiActivityEventProfileChangeBio.getUserNumber();
        if (userNumber == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        long longValue = userNumber.longValue();
        userNumber = apiActivityEventProfileChangeBio.getTimestamp();
        if (userNumber == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        long longValue2 = userNumber.longValue();
        String bio = apiActivityEventProfileChangeBio.getBio();
        if (bio == null) {
            bio = "";
        }
        String str = bio;
        apiActivityEventProfileChangeBio = apiActivityEventProfileChangeBio.getOldBio();
        if (apiActivityEventProfileChangeBio == null) {
            apiActivityEventProfileChangeBio = "";
        }
        return new ProfileChangeBio(longValue, longValue2, str, apiActivityEventProfileChangeBio);
    }

    @NotNull
    /* renamed from: a */
    public static final ProfileChangeWork m36912a(@NotNull ApiActivityEventProfileChangeWork apiActivityEventProfileChangeWork) {
        C2668g.b(apiActivityEventProfileChangeWork, "$receiver");
        Long userNumber = apiActivityEventProfileChangeWork.getUserNumber();
        if (userNumber == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        long longValue = userNumber.longValue();
        userNumber = apiActivityEventProfileChangeWork.getTimestamp();
        if (userNumber != null) {
            return new ProfileChangeWork(longValue, userNumber.longValue(), C8653b.m36925k(apiActivityEventProfileChangeWork.getWorks()));
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @NotNull
    /* renamed from: a */
    public static final ProfileChangeSchool m36911a(@NotNull ApiActivityEventProfileChangeSchool apiActivityEventProfileChangeSchool) {
        C2668g.b(apiActivityEventProfileChangeSchool, "$receiver");
        Long userNumber = apiActivityEventProfileChangeSchool.getUserNumber();
        if (userNumber == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        long longValue = userNumber.longValue();
        userNumber = apiActivityEventProfileChangeSchool.getTimestamp();
        if (userNumber != null) {
            return new ProfileChangeSchool(longValue, userNumber.longValue(), C8653b.m36926l(apiActivityEventProfileChangeSchool.getSchools()));
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @NotNull
    /* renamed from: a */
    public static final ProfileAddLoop m36907a(@NotNull ApiActivityEventProfileAddLoop apiActivityEventProfileAddLoop) {
        C2668g.b(apiActivityEventProfileAddLoop, "$receiver");
        Long userNumber = apiActivityEventProfileAddLoop.getUserNumber();
        if (userNumber == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        long longValue = userNumber.longValue();
        userNumber = apiActivityEventProfileAddLoop.getTimestamp();
        if (userNumber != null) {
            return new ProfileAddLoop(longValue, userNumber.longValue(), C8653b.m36924j(apiActivityEventProfileAddLoop.getLoops()));
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @NotNull
    /* renamed from: a */
    public static final ActivityFeedLoop m36900a(@NotNull ApiActivityFeedLoop apiActivityFeedLoop) {
        C2668g.b(apiActivityFeedLoop, "$receiver");
        String id = apiActivityFeedLoop.getId();
        if (id != null) {
            return new ActivityFeedLoop(id, C8653b.m36917c(apiActivityFeedLoop.getThumbnailImages()), C8653b.m36918d(apiActivityFeedLoop.getVideos()));
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @NotNull
    /* renamed from: j */
    public static final List<ActivityFeedLoop> m36924j(@Nullable List<ApiActivityFeedLoop> list) {
        List<ActivityFeedLoop> list2;
        if (list != null) {
            Iterable<ApiActivityFeedLoop> iterable = list;
            Collection arrayList = new ArrayList(C19301m.a(iterable, 10));
            for (ApiActivityFeedLoop a : iterable) {
                arrayList.add(C8653b.m36900a(a));
            }
            list2 = (List) arrayList;
        } else {
            list2 = null;
        }
        return list2 != null ? list2 : C19301m.a();
    }

    @NotNull
    /* renamed from: k */
    public static final List<ActivityFeedJob> m36925k(@Nullable List<ApiActivityFeedJob> list) {
        List<ActivityFeedJob> list2;
        if (list != null) {
            Iterable<ApiActivityFeedJob> iterable = list;
            Collection arrayList = new ArrayList(C19301m.a(iterable, 10));
            for (ApiActivityFeedJob a : iterable) {
                arrayList.add(C8653b.m36899a(a));
            }
            list2 = (List) arrayList;
        } else {
            list2 = null;
        }
        return list2 != null ? list2 : C19301m.a();
    }

    @NotNull
    /* renamed from: l */
    public static final List<ActivityFeedSchool> m36926l(@Nullable List<ApiActivityFeedSchool> list) {
        List<ActivityFeedSchool> list2;
        if (list != null) {
            Iterable<ApiActivityFeedSchool> iterable = list;
            Collection arrayList = new ArrayList(C19301m.a(iterable, 10));
            for (ApiActivityFeedSchool a : iterable) {
                arrayList.add(C8653b.m36901a(a));
            }
            list2 = (List) arrayList;
        } else {
            list2 = null;
        }
        return list2 != null ? list2 : C19301m.a();
    }

    @NotNull
    /* renamed from: a */
    public static final ActivityFeedJob m36899a(@NotNull ApiActivityFeedJob apiActivityFeedJob) {
        C2668g.b(apiActivityFeedJob, "$receiver");
        String company = apiActivityFeedJob.getCompany();
        if (company == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        apiActivityFeedJob = apiActivityFeedJob.getTitle();
        if (apiActivityFeedJob != null) {
            return new ActivityFeedJob(company, apiActivityFeedJob);
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @NotNull
    /* renamed from: a */
    public static final ActivityFeedSchool m36901a(@NotNull ApiActivityFeedSchool apiActivityFeedSchool) {
        C2668g.b(apiActivityFeedSchool, "$receiver");
        String name = apiActivityFeedSchool.getName();
        if (name == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        String type = apiActivityFeedSchool.getType();
        if (type == null) {
            type = "";
        }
        apiActivityFeedSchool = apiActivityFeedSchool.getYear();
        if (apiActivityFeedSchool == null) {
            apiActivityFeedSchool = "";
        }
        return new ActivityFeedSchool(name, type, apiActivityFeedSchool);
    }
}
