package com.tinder.data.adapter.p208a;

import com.tinder.api.model.activityfeed.ApiActivityEvent;
import com.tinder.api.model.activityfeed.ApiActivityEventInstagramConnect;
import com.tinder.api.model.activityfeed.ApiActivityEventInstagramNewMedia;
import com.tinder.api.model.activityfeed.ApiActivityEventMatch;
import com.tinder.api.model.activityfeed.ApiActivityEventProfileAddLoop;
import com.tinder.api.model.activityfeed.ApiActivityEventProfileAddPhoto;
import com.tinder.api.model.activityfeed.ApiActivityEventProfileChangeAnthem;
import com.tinder.api.model.activityfeed.ApiActivityEventProfileChangeBio;
import com.tinder.api.model.activityfeed.ApiActivityEventProfileChangeSchool;
import com.tinder.api.model.activityfeed.ApiActivityEventProfileChangeWork;
import com.tinder.api.model.activityfeed.ApiActivityEventProfileSpotifyTopArtist;
import com.tinder.api.model.activityfeed.ApiActivityFeedItem;
import com.tinder.api.model.activityfeed.ApiActivityUserInfo;
import com.tinder.data.adapter.C2646o;
import com.tinder.data.feed.C8653b;
import com.tinder.domain.feed.ActivityEvent;
import com.tinder.domain.feed.ActivityEventNewMatch;
import com.tinder.domain.feed.ActivityFeedItem;
import com.tinder.domain.feed.ActivityFeedUserInfo;
import com.tinder.domain.feed.InstagramConnect;
import com.tinder.domain.feed.InstagramNewMedia;
import com.tinder.domain.feed.ProfileAddLoop;
import com.tinder.domain.feed.ProfileAddPhoto;
import com.tinder.domain.feed.ProfileChangeAnthem;
import com.tinder.domain.feed.ProfileChangeBio;
import com.tinder.domain.feed.ProfileChangeWork;
import com.tinder.domain.feed.ProfileSpotifyTopArtist;
import com.tinder.domain.feed.UnknownActivityEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0016J\u000e\u0010\u000b\u001a\u00020\f*\u0004\u0018\u00010\rH\u0002¨\u0006\u000e"}, d2 = {"Lcom/tinder/data/adapter/activityfeed/ActivityFeedItemApiAdapter;", "Lcom/tinder/data/adapter/DomainApiAdapter;", "Lcom/tinder/domain/feed/ActivityFeedItem;", "Lcom/tinder/api/model/activityfeed/ApiActivityFeedItem;", "()V", "activityEventWrapper", "Lcom/tinder/domain/feed/ActivityEvent;", "apiActivityEvent", "Lcom/tinder/api/model/activityfeed/ApiActivityEvent;", "fromApi", "feedItemApi", "toDomainMatchType", "Lcom/tinder/domain/feed/ActivityFeedItem$MatchType;", "", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.adapter.a.b */
public final class C10727b extends C2646o<ActivityFeedItem, ApiActivityFeedItem> {
    @Nullable
    /* renamed from: a */
    public ActivityFeedItem m43066a(@NotNull ApiActivityFeedItem apiActivityFeedItem) {
        C2668g.b(apiActivityFeedItem, "feedItemApi");
        String id = apiActivityFeedItem.getId();
        if (id == null) {
            return null;
        }
        String activityId = apiActivityFeedItem.getActivityId();
        String str = activityId != null ? activityId : id;
        String matchId = apiActivityFeedItem.getMatchId();
        if (matchId == null) {
            return null;
        }
        ApiActivityUserInfo userInfo = apiActivityFeedItem.getUserInfo();
        if (userInfo != null) {
            ActivityFeedUserInfo a = C8653b.m36904a(userInfo);
            if (a != null) {
                ActivityEvent a2 = m43064a(apiActivityFeedItem.getActivityEvent());
                if (a2 != null) {
                    return new ActivityFeedItem(id, str, matchId, C8653b.m36914a(apiActivityFeedItem.getComments()), a2, a, m43065a(apiActivityFeedItem.getMatchType()));
                }
                return null;
            }
        }
        return null;
    }

    /* renamed from: a */
    private final ActivityEvent m43064a(ApiActivityEvent apiActivityEvent) {
        ActivityEvent activityEvent;
        ApiActivityEventProfileAddPhoto profileAddPhoto;
        ProfileAddPhoto a;
        ApiActivityEventInstagramConnect instagramConnect;
        InstagramConnect a2;
        ApiActivityEventProfileChangeAnthem profileChangeAnthem;
        ProfileChangeAnthem a3;
        ApiActivityEventMatch match;
        ActivityEventNewMatch a4;
        ApiActivityEventProfileAddLoop profileAddLoop;
        ProfileAddLoop a5;
        ApiActivityEventProfileChangeBio profileChangeBio;
        ProfileChangeBio a6;
        ApiActivityEventProfileChangeWork profileChangeWork;
        ProfileChangeWork a7;
        ApiActivityEventProfileChangeSchool profileChangeSchool;
        ProfileSpotifyTopArtist a8;
        if (apiActivityEvent != null) {
            try {
                ApiActivityEventInstagramNewMedia instagramNewMedia = apiActivityEvent.getInstagramNewMedia();
                if (instagramNewMedia != null) {
                    InstagramNewMedia a9 = C8653b.m36906a(instagramNewMedia);
                    if (a9 != null) {
                        activityEvent = a9;
                        if (activityEvent != null) {
                            if (apiActivityEvent != null) {
                                profileAddPhoto = apiActivityEvent.getProfileAddPhoto();
                                if (profileAddPhoto != null) {
                                    a = C8653b.m36908a(profileAddPhoto);
                                    activityEvent = a;
                                }
                            }
                            a = null;
                            activityEvent = a;
                        }
                        if (activityEvent != null) {
                            if (apiActivityEvent != null) {
                                instagramConnect = apiActivityEvent.getInstagramConnect();
                                if (instagramConnect != null) {
                                    a2 = C8653b.m36905a(instagramConnect);
                                    activityEvent = a2;
                                }
                            }
                            a2 = null;
                            activityEvent = a2;
                        }
                        if (activityEvent != null) {
                            if (apiActivityEvent != null) {
                                profileChangeAnthem = apiActivityEvent.getProfileChangeAnthem();
                                if (profileChangeAnthem != null) {
                                    a3 = C8653b.m36909a(profileChangeAnthem);
                                    activityEvent = a3;
                                }
                            }
                            a3 = null;
                            activityEvent = a3;
                        }
                        if (activityEvent != null) {
                            if (apiActivityEvent != null) {
                                match = apiActivityEvent.getMatch();
                                if (match != null) {
                                    a4 = C8653b.m36896a(match);
                                    activityEvent = a4;
                                }
                            }
                            a4 = null;
                            activityEvent = a4;
                        }
                        if (activityEvent != null) {
                            if (apiActivityEvent != null) {
                                profileAddLoop = apiActivityEvent.getProfileAddLoop();
                                if (profileAddLoop != null) {
                                    a5 = C8653b.m36907a(profileAddLoop);
                                    activityEvent = a5;
                                }
                            }
                            a5 = null;
                            activityEvent = a5;
                        }
                        if (activityEvent != null) {
                            if (apiActivityEvent != null) {
                                profileChangeBio = apiActivityEvent.getProfileChangeBio();
                                if (profileChangeBio != null) {
                                    a6 = C8653b.m36910a(profileChangeBio);
                                    activityEvent = a6;
                                }
                            }
                            a6 = null;
                            activityEvent = a6;
                        }
                        if (activityEvent != null) {
                            if (apiActivityEvent != null) {
                                profileChangeWork = apiActivityEvent.getProfileChangeWork();
                                if (profileChangeWork != null) {
                                    a7 = C8653b.m36912a(profileChangeWork);
                                    activityEvent = a7;
                                }
                            }
                            a7 = null;
                            activityEvent = a7;
                        }
                        if (activityEvent != null) {
                            if (apiActivityEvent != null) {
                                profileChangeSchool = apiActivityEvent.getProfileChangeSchool();
                                if (profileChangeSchool != null) {
                                    apiActivityEvent = C8653b.m36911a(profileChangeSchool);
                                    activityEvent = (ActivityEvent) apiActivityEvent;
                                }
                            }
                            apiActivityEvent = null;
                            activityEvent = (ActivityEvent) apiActivityEvent;
                        }
                        if (activityEvent != null) {
                            return activityEvent;
                        }
                        return (ActivityEvent) UnknownActivityEvent.INSTANCE;
                    }
                }
            } catch (ApiActivityEvent apiActivityEvent2) {
                C0001a.b((Throwable) apiActivityEvent2, "Invalid activity event due to a missing required field", new Object[0]);
                return null;
            } catch (ApiActivityEvent apiActivityEvent22) {
                C0001a.b((Throwable) apiActivityEvent22, "Invalid activity event due to an invalid required field", new Object[0]);
                return null;
            }
        }
        if (apiActivityEvent22 != null) {
            ApiActivityEventProfileSpotifyTopArtist profileSpotifyTopArtist = apiActivityEvent22.getProfileSpotifyTopArtist();
            if (profileSpotifyTopArtist != null) {
                a8 = C8653b.m36913a(profileSpotifyTopArtist);
                activityEvent = a8;
                if (activityEvent != null) {
                    if (apiActivityEvent22 != null) {
                        profileAddPhoto = apiActivityEvent22.getProfileAddPhoto();
                        if (profileAddPhoto != null) {
                            a = C8653b.m36908a(profileAddPhoto);
                            activityEvent = a;
                        }
                    }
                    a = null;
                    activityEvent = a;
                }
                if (activityEvent != null) {
                    if (apiActivityEvent22 != null) {
                        instagramConnect = apiActivityEvent22.getInstagramConnect();
                        if (instagramConnect != null) {
                            a2 = C8653b.m36905a(instagramConnect);
                            activityEvent = a2;
                        }
                    }
                    a2 = null;
                    activityEvent = a2;
                }
                if (activityEvent != null) {
                    if (apiActivityEvent22 != null) {
                        profileChangeAnthem = apiActivityEvent22.getProfileChangeAnthem();
                        if (profileChangeAnthem != null) {
                            a3 = C8653b.m36909a(profileChangeAnthem);
                            activityEvent = a3;
                        }
                    }
                    a3 = null;
                    activityEvent = a3;
                }
                if (activityEvent != null) {
                    if (apiActivityEvent22 != null) {
                        match = apiActivityEvent22.getMatch();
                        if (match != null) {
                            a4 = C8653b.m36896a(match);
                            activityEvent = a4;
                        }
                    }
                    a4 = null;
                    activityEvent = a4;
                }
                if (activityEvent != null) {
                    if (apiActivityEvent22 != null) {
                        profileAddLoop = apiActivityEvent22.getProfileAddLoop();
                        if (profileAddLoop != null) {
                            a5 = C8653b.m36907a(profileAddLoop);
                            activityEvent = a5;
                        }
                    }
                    a5 = null;
                    activityEvent = a5;
                }
                if (activityEvent != null) {
                    if (apiActivityEvent22 != null) {
                        profileChangeBio = apiActivityEvent22.getProfileChangeBio();
                        if (profileChangeBio != null) {
                            a6 = C8653b.m36910a(profileChangeBio);
                            activityEvent = a6;
                        }
                    }
                    a6 = null;
                    activityEvent = a6;
                }
                if (activityEvent != null) {
                    if (apiActivityEvent22 != null) {
                        profileChangeWork = apiActivityEvent22.getProfileChangeWork();
                        if (profileChangeWork != null) {
                            a7 = C8653b.m36912a(profileChangeWork);
                            activityEvent = a7;
                        }
                    }
                    a7 = null;
                    activityEvent = a7;
                }
                if (activityEvent != null) {
                    if (apiActivityEvent22 != null) {
                        profileChangeSchool = apiActivityEvent22.getProfileChangeSchool();
                        if (profileChangeSchool != null) {
                            apiActivityEvent22 = C8653b.m36911a(profileChangeSchool);
                            activityEvent = (ActivityEvent) apiActivityEvent22;
                        }
                    }
                    apiActivityEvent22 = null;
                    activityEvent = (ActivityEvent) apiActivityEvent22;
                }
                if (activityEvent != null) {
                    return (ActivityEvent) UnknownActivityEvent.INSTANCE;
                }
                return activityEvent;
            }
        }
        a8 = null;
        activityEvent = a8;
        if (activityEvent != null) {
            if (apiActivityEvent22 != null) {
                profileAddPhoto = apiActivityEvent22.getProfileAddPhoto();
                if (profileAddPhoto != null) {
                    a = C8653b.m36908a(profileAddPhoto);
                    activityEvent = a;
                }
            }
            a = null;
            activityEvent = a;
        }
        if (activityEvent != null) {
            if (apiActivityEvent22 != null) {
                instagramConnect = apiActivityEvent22.getInstagramConnect();
                if (instagramConnect != null) {
                    a2 = C8653b.m36905a(instagramConnect);
                    activityEvent = a2;
                }
            }
            a2 = null;
            activityEvent = a2;
        }
        if (activityEvent != null) {
            if (apiActivityEvent22 != null) {
                profileChangeAnthem = apiActivityEvent22.getProfileChangeAnthem();
                if (profileChangeAnthem != null) {
                    a3 = C8653b.m36909a(profileChangeAnthem);
                    activityEvent = a3;
                }
            }
            a3 = null;
            activityEvent = a3;
        }
        if (activityEvent != null) {
            if (apiActivityEvent22 != null) {
                match = apiActivityEvent22.getMatch();
                if (match != null) {
                    a4 = C8653b.m36896a(match);
                    activityEvent = a4;
                }
            }
            a4 = null;
            activityEvent = a4;
        }
        if (activityEvent != null) {
            if (apiActivityEvent22 != null) {
                profileAddLoop = apiActivityEvent22.getProfileAddLoop();
                if (profileAddLoop != null) {
                    a5 = C8653b.m36907a(profileAddLoop);
                    activityEvent = a5;
                }
            }
            a5 = null;
            activityEvent = a5;
        }
        if (activityEvent != null) {
            if (apiActivityEvent22 != null) {
                profileChangeBio = apiActivityEvent22.getProfileChangeBio();
                if (profileChangeBio != null) {
                    a6 = C8653b.m36910a(profileChangeBio);
                    activityEvent = a6;
                }
            }
            a6 = null;
            activityEvent = a6;
        }
        if (activityEvent != null) {
            if (apiActivityEvent22 != null) {
                profileChangeWork = apiActivityEvent22.getProfileChangeWork();
                if (profileChangeWork != null) {
                    a7 = C8653b.m36912a(profileChangeWork);
                    activityEvent = a7;
                }
            }
            a7 = null;
            activityEvent = a7;
        }
        if (activityEvent != null) {
            if (apiActivityEvent22 != null) {
                profileChangeSchool = apiActivityEvent22.getProfileChangeSchool();
                if (profileChangeSchool != null) {
                    apiActivityEvent22 = C8653b.m36911a(profileChangeSchool);
                    activityEvent = (ActivityEvent) apiActivityEvent22;
                }
            }
            apiActivityEvent22 = null;
            activityEvent = (ActivityEvent) apiActivityEvent22;
        }
        if (activityEvent != null) {
            return activityEvent;
        }
        return (ActivityEvent) UnknownActivityEvent.INSTANCE;
    }

    /* renamed from: a */
    private final com.tinder.domain.feed.ActivityFeedItem.MatchType m43065a(@org.jetbrains.annotations.Nullable java.lang.String r7) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r6 = this;
        if (r7 == 0) goto L_0x0044;
    L_0x0002:
        r0 = 0;
        r1 = com.tinder.domain.feed.ActivityFeedItem.MatchType.values();	 Catch:{ NoSuchElementException -> 0x0025 }
        r2 = r1.length;	 Catch:{ NoSuchElementException -> 0x0025 }
        r3 = 0;	 Catch:{ NoSuchElementException -> 0x0025 }
    L_0x0009:
        if (r3 >= r2) goto L_0x001b;	 Catch:{ NoSuchElementException -> 0x0025 }
    L_0x000b:
        r4 = r1[r3];	 Catch:{ NoSuchElementException -> 0x0025 }
        r5 = r4.getValue();	 Catch:{ NoSuchElementException -> 0x0025 }
        r5 = kotlin.jvm.internal.C2668g.a(r5, r7);	 Catch:{ NoSuchElementException -> 0x0025 }
        if (r5 == 0) goto L_0x0018;	 Catch:{ NoSuchElementException -> 0x0025 }
    L_0x0017:
        goto L_0x0041;	 Catch:{ NoSuchElementException -> 0x0025 }
    L_0x0018:
        r3 = r3 + 1;	 Catch:{ NoSuchElementException -> 0x0025 }
        goto L_0x0009;	 Catch:{ NoSuchElementException -> 0x0025 }
    L_0x001b:
        r1 = new java.util.NoSuchElementException;	 Catch:{ NoSuchElementException -> 0x0025 }
        r2 = "Array contains no element matching the predicate.";	 Catch:{ NoSuchElementException -> 0x0025 }
        r1.<init>(r2);	 Catch:{ NoSuchElementException -> 0x0025 }
        r1 = (java.lang.Throwable) r1;	 Catch:{ NoSuchElementException -> 0x0025 }
        throw r1;	 Catch:{ NoSuchElementException -> 0x0025 }
    L_0x0025:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Unknown match type=";
        r1.append(r2);
        r1.append(r7);
        r7 = ". Falling back to NONE";
        r1.append(r7);
        r7 = r1.toString();
        r0 = new java.lang.Object[r0];
        p000a.p001a.C0001a.d(r7, r0);
        r4 = 0;
    L_0x0041:
        if (r4 == 0) goto L_0x0044;
    L_0x0043:
        goto L_0x0046;
    L_0x0044:
        r4 = com.tinder.domain.feed.ActivityFeedItem.MatchType.NONE;
    L_0x0046:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.adapter.a.b.a(java.lang.String):com.tinder.domain.feed.ActivityFeedItem$MatchType");
    }
}
