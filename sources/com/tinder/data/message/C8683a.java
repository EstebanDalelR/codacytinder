package com.tinder.data.message;

import android.database.Cursor;
import com.squareup.sqlbrite.BriteDatabase;
import com.squareup.sqldelight.C6124c;
import com.tinder.data.database.C8642a;
import com.tinder.data.message.activityfeed.ActivityEventType;
import com.tinder.data.message.activityfeed.model.C8688h;
import com.tinder.data.message.activityfeed.model.ae;
import com.tinder.data.message.activityfeed.model.bg;
import com.tinder.data.message.activityfeed.model.ca;
import com.tinder.data.model.activityfeed.ActivityFeedAlbumModel.Select_activity_feed_albumModel;
import com.tinder.data.model.activityfeed.ActivityFeedSongModel.Select_activity_feed_songModel;
import com.tinder.data.model.activityfeed.ProfileChangeAnthemModel.Select_profile_change_anthemModel;
import com.tinder.data.model.activityfeed.ProfileSpotifyTopArtistModel.Select_profile_spotify_top_artistModel;
import com.tinder.domain.feed.ActivityEvent;
import com.tinder.domain.feed.ActivityFeedAlbum;
import com.tinder.domain.feed.ActivityFeedSong;
import com.tinder.domain.feed.ProfileChangeAnthem;
import com.tinder.domain.feed.ProfileSpotifyTopArtist;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C19301m;
import kotlin.io.C15818b;
import kotlin.jvm.internal.C2668g;
import kotlin.sequences.C19285g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\bH\u0002J\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\bH\u0002J\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\bH\u0002J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00142\u0006\u0010\u000b\u001a\u00020\bH\u0002J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00142\u0006\u0010\u000b\u001a\u00020\bH\u0002J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u000b\u001a\u00020\bH\u0002J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u000b\u001a\u00020\bH\u0002J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u000b\u001a\u00020\bH\u0002J\u0010\u0010 \u001a\u00020!2\u0006\u0010\u000b\u001a\u00020\bH\u0002J\u0010\u0010\"\u001a\u00020#2\u0006\u0010\u000b\u001a\u00020\bH\u0002J\u0010\u0010$\u001a\u00020%2\u0006\u0010\u000b\u001a\u00020\bH\u0002J\u0010\u0010&\u001a\u00020'2\u0006\u0010\u000b\u001a\u00020\bH\u0002J\u0010\u0010(\u001a\u00020)2\u0006\u0010\u000b\u001a\u00020\bH\u0002J\u0010\u0010*\u001a\u00020+2\u0006\u0010\u000b\u001a\u00020\bH\u0002J\u0010\u0010,\u001a\u00020-2\u0006\u0010\u000b\u001a\u00020\bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/tinder/data/message/ActivityFeedItemDataStore;", "", "db", "Lcom/squareup/sqlbrite/BriteDatabase;", "(Lcom/squareup/sqlbrite/BriteDatabase;)V", "getActivityFeedItemForMessageId", "Lcom/tinder/domain/feed/ActivityFeedItem;", "messageId", "", "queryActivityEvent", "Lcom/tinder/domain/feed/ActivityEvent;", "activityFeedItemId", "activityEventType", "Lcom/tinder/data/message/activityfeed/ActivityEventType;", "queryActivityEventNewMatch", "Lcom/tinder/domain/feed/ActivityEventNewMatch;", "queryActivityFeedAlbum", "Lcom/tinder/domain/feed/ActivityFeedAlbum;", "activityFeedSongId", "queryActivityFeedArtists", "", "Lcom/tinder/domain/feed/ActivityFeedArtist;", "queryActivityFeedItemComments", "Lcom/tinder/domain/feed/ActivityFeedComment;", "queryActivityFeedSongs", "Lcom/tinder/domain/feed/ActivityFeedSong;", "queryInstagramConnect", "Lcom/tinder/domain/feed/InstagramConnect;", "queryInstagramNewMedia", "Lcom/tinder/domain/feed/InstagramNewMedia;", "queryProfileAddLoop", "Lcom/tinder/domain/feed/ProfileAddLoop;", "queryProfileAddPhoto", "Lcom/tinder/domain/feed/ProfileAddPhoto;", "queryProfileChangeAnthem", "Lcom/tinder/domain/feed/ProfileChangeAnthem;", "queryProfileChangeBio", "Lcom/tinder/domain/feed/ProfileChangeBio;", "queryProfileChangeSchool", "Lcom/tinder/domain/feed/ProfileChangeSchool;", "queryProfileChangeWork", "Lcom/tinder/domain/feed/ProfileChangeWork;", "queryProfileSpotifyTopArtist", "Lcom/tinder/domain/feed/ProfileSpotifyTopArtist;", "queryUserInfo", "Lcom/tinder/domain/feed/ActivityFeedUserInfo;", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.message.a */
public final class C8683a {
    /* renamed from: a */
    private final BriteDatabase f30563a;

    public C8683a(@NotNull BriteDatabase briteDatabase) {
        C2668g.b(briteDatabase, "db");
        this.f30563a = briteDatabase;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @org.jetbrains.annotations.NotNull
    /* renamed from: a */
    public final com.tinder.domain.feed.ActivityFeedItem m37021a(@org.jetbrains.annotations.NotNull java.lang.String r13) {
        /*
        r12 = this;
        r0 = "messageId";
        kotlin.jvm.internal.C2668g.b(r13, r0);
        r0 = com.tinder.data.message.activityfeed.model.C8691w.m37075a();
        r13 = r0.m37207a(r13);
        r0 = r12.f30563a;
        r1 = r13.f22514a;
        r13 = r13.f22515b;
        r2 = r13.length;
        r13 = java.util.Arrays.copyOf(r13, r2);
        r13 = (java.lang.String[]) r13;
        r13 = r0.a(r1, r13);
        if (r13 != 0) goto L_0x0023;
    L_0x0020:
        kotlin.jvm.internal.C2668g.a();
    L_0x0023:
        r13 = (java.io.Closeable) r13;
        r0 = 0;
        r0 = (java.lang.Throwable) r0;
        r1 = r13;
        r1 = (android.database.Cursor) r1;	 Catch:{ Throwable -> 0x0084 }
        r1 = com.tinder.data.database.C8642a.m36798a(r1);	 Catch:{ Throwable -> 0x0084 }
        r2 = new com.tinder.data.message.ActivityFeedItemDataStore$getActivityFeedItemForMessageId$2$1;	 Catch:{ Throwable -> 0x0084 }
        r3 = com.tinder.data.message.activityfeed.model.C8691w.m37076b();	 Catch:{ Throwable -> 0x0084 }
        r2.<init>(r3);	 Catch:{ Throwable -> 0x0084 }
        r2 = (kotlin.jvm.functions.Function1) r2;	 Catch:{ Throwable -> 0x0084 }
        r1 = kotlin.sequences.C19285g.e(r1, r2);	 Catch:{ Throwable -> 0x0084 }
        r1 = kotlin.sequences.C19285g.c(r1);	 Catch:{ Throwable -> 0x0084 }
        r1 = (com.tinder.data.model.activityfeed.ActivityFeedItemModel.Select_activity_feed_item_by_message_idModel) r1;	 Catch:{ Throwable -> 0x0084 }
        kotlin.io.C15818b.a(r13, r0);
        r3 = r1.id();
        r13 = new com.tinder.domain.feed.ActivityFeedItem;
        r0 = "activityFeedItemId";
        kotlin.jvm.internal.C2668g.a(r3, r0);
        r0 = r1.activity_id();
        if (r0 == 0) goto L_0x005a;
    L_0x0058:
        r4 = r0;
        goto L_0x005b;
    L_0x005a:
        r4 = r3;
    L_0x005b:
        r5 = r1.match_id();
        r0 = "activityFeedItemModel.match_id()";
        kotlin.jvm.internal.C2668g.a(r5, r0);
        r6 = r12.m37020n(r3);
        r0 = r1.activity_event_type();
        r1 = "activityFeedItemModel.activity_event_type()";
        kotlin.jvm.internal.C2668g.a(r0, r1);
        r7 = r12.m37005a(r3, r0);
        r8 = r12.m37007b(r3);
        r9 = 0;
        r10 = 64;
        r11 = 0;
        r2 = r13;
        r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11);
        return r13;
    L_0x0082:
        r1 = move-exception;
        goto L_0x0086;
    L_0x0084:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0082 }
    L_0x0086:
        kotlin.io.C15818b.a(r13, r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.message.a.a(java.lang.String):com.tinder.domain.feed.ActivityFeedItem");
    }

    /* renamed from: a */
    private final ActivityEvent m37005a(String str, ActivityEventType activityEventType) {
        switch (C8692b.f30645a[activityEventType.ordinal()]) {
            case 1:
                return m37009c(str);
            case 2:
                return m37010d(str);
            case 3:
                return m37011e(str);
            case 4:
                return m37012f(str);
            case 5:
                return m37013g(str);
            case 6:
                return m37017k(str);
            case 7:
                return m37018l(str);
            case 8:
                return m37014h(str);
            case 9:
                return m37015i(str);
            case 10:
                return m37016j(str);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    private final com.tinder.domain.feed.ActivityFeedUserInfo m37007b(java.lang.String r14) {
        /*
        r13 = this;
        r0 = com.tinder.data.message.activityfeed.model.aa.m37043a();
        r14 = r0.m37210a(r14);
        r0 = r13.f30563a;
        r1 = r14.f22514a;
        r14 = r14.f22515b;
        r2 = r14.length;
        r14 = java.util.Arrays.copyOf(r14, r2);
        r14 = (java.lang.String[]) r14;
        r14 = r0.a(r1, r14);
        if (r14 != 0) goto L_0x001e;
    L_0x001b:
        kotlin.jvm.internal.C2668g.a();
    L_0x001e:
        r14 = (java.io.Closeable) r14;
        r0 = 0;
        r0 = (java.lang.Throwable) r0;
        r1 = r14;
        r1 = (android.database.Cursor) r1;	 Catch:{ Throwable -> 0x005b }
        r1 = com.tinder.data.database.C8642a.m36798a(r1);	 Catch:{ Throwable -> 0x005b }
        r2 = new com.tinder.data.message.ActivityFeedItemDataStore$queryUserInfo$2$1;	 Catch:{ Throwable -> 0x005b }
        r3 = com.tinder.data.message.activityfeed.model.aa.m37044b();	 Catch:{ Throwable -> 0x005b }
        r2.<init>(r3);	 Catch:{ Throwable -> 0x005b }
        r2 = (kotlin.jvm.functions.Function1) r2;	 Catch:{ Throwable -> 0x005b }
        r1 = kotlin.sequences.C19285g.e(r1, r2);	 Catch:{ Throwable -> 0x005b }
        r1 = kotlin.sequences.C19285g.c(r1);	 Catch:{ Throwable -> 0x005b }
        r3 = r1;
        r3 = (java.lang.String) r3;	 Catch:{ Throwable -> 0x005b }
        kotlin.io.C15818b.a(r14, r0);
        r14 = new com.tinder.domain.feed.ActivityFeedUserInfo;
        r0 = "it";
        kotlin.jvm.internal.C2668g.a(r3, r0);
        r4 = 0;
        r5 = 0;
        r6 = 0;
        r7 = 0;
        r8 = 0;
        r9 = 0;
        r10 = 0;
        r11 = 254; // 0xfe float:3.56E-43 double:1.255E-321;
        r12 = 0;
        r2 = r14;
        r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12);
        return r14;
    L_0x0059:
        r1 = move-exception;
        goto L_0x005d;
    L_0x005b:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0059 }
    L_0x005d:
        kotlin.io.C15818b.a(r14, r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.message.a.b(java.lang.String):com.tinder.domain.feed.ActivityFeedUserInfo");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: c */
    private final com.tinder.domain.feed.InstagramNewMedia m37009c(java.lang.String r14) {
        /*
        r13 = this;
        r0 = com.tinder.data.message.activityfeed.model.ao.m37049a();
        r14 = r0.m37215a(r14);
        r0 = r13.f30563a;
        r1 = r14.f22514a;
        r14 = r14.f22515b;
        r2 = r14.length;
        r14 = java.util.Arrays.copyOf(r14, r2);
        r14 = (java.lang.String[]) r14;
        r14 = r0.a(r1, r14);
        if (r14 != 0) goto L_0x001e;
    L_0x001b:
        kotlin.jvm.internal.C2668g.a();
    L_0x001e:
        r14 = (java.io.Closeable) r14;
        r0 = 0;
        r0 = (java.lang.Throwable) r0;
        r1 = r14;
        r1 = (android.database.Cursor) r1;	 Catch:{ Throwable -> 0x007f }
        r1 = com.tinder.data.database.C8642a.m36798a(r1);	 Catch:{ Throwable -> 0x007f }
        r2 = new com.tinder.data.message.ActivityFeedItemDataStore$queryInstagramNewMedia$2$1;	 Catch:{ Throwable -> 0x007f }
        r3 = com.tinder.data.message.activityfeed.model.ao.m37050b();	 Catch:{ Throwable -> 0x007f }
        r2.<init>(r3);	 Catch:{ Throwable -> 0x007f }
        r2 = (kotlin.jvm.functions.Function1) r2;	 Catch:{ Throwable -> 0x007f }
        r1 = kotlin.sequences.C19285g.e(r1, r2);	 Catch:{ Throwable -> 0x007f }
        r1 = kotlin.sequences.C19285g.c(r1);	 Catch:{ Throwable -> 0x007f }
        r1 = (com.tinder.data.model.activityfeed.InstagramNewMediaModel.Select_instagram_new_mediaModel) r1;	 Catch:{ Throwable -> 0x007f }
        kotlin.io.C15818b.a(r14, r0);
        r14 = new com.tinder.domain.feed.InstagramNewMedia;
        r3 = r1.user_number();
        r5 = r1.timestamp();
        r7 = r1.instagram_media_id();
        r0 = "instagramNewMediaModel.instagram_media_id()";
        kotlin.jvm.internal.C2668g.a(r7, r0);
        r8 = r1.instagram_user_id();
        r10 = r1.instagram_user_name();
        r0 = "instagramNewMediaModel.instagram_user_name()";
        kotlin.jvm.internal.C2668g.a(r10, r0);
        r11 = r1.caption();
        r0 = "instagramNewMediaModel.caption()";
        kotlin.jvm.internal.C2668g.a(r11, r0);
        r0 = r1.media();
        if (r0 == 0) goto L_0x0073;
    L_0x0071:
        r12 = r0;
        goto L_0x0078;
    L_0x0073:
        r0 = kotlin.collections.C19301m.a();
        goto L_0x0071;
    L_0x0078:
        r2 = r14;
        r2.<init>(r3, r5, r7, r8, r10, r11, r12);
        return r14;
    L_0x007d:
        r1 = move-exception;
        goto L_0x0081;
    L_0x007f:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x007d }
    L_0x0081:
        kotlin.io.C15818b.a(r14, r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.message.a.c(java.lang.String):com.tinder.domain.feed.InstagramNewMedia");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: d */
    private final com.tinder.domain.feed.ActivityEventNewMatch m37010d(java.lang.String r10) {
        /*
        r9 = this;
        r0 = com.tinder.data.message.activityfeed.model.C8687c.m37065a();
        r10 = r0.m37199a(r10);
        r0 = r9.f30563a;
        r1 = r10.f22514a;
        r10 = r10.f22515b;
        r2 = r10.length;
        r10 = java.util.Arrays.copyOf(r10, r2);
        r10 = (java.lang.String[]) r10;
        r10 = r0.a(r1, r10);
        if (r10 != 0) goto L_0x001e;
    L_0x001b:
        kotlin.jvm.internal.C2668g.a();
    L_0x001e:
        r10 = (java.io.Closeable) r10;
        r0 = 0;
        r0 = (java.lang.Throwable) r0;
        r1 = r10;
        r1 = (android.database.Cursor) r1;	 Catch:{ Throwable -> 0x0057 }
        r1 = com.tinder.data.database.C8642a.m36798a(r1);	 Catch:{ Throwable -> 0x0057 }
        r2 = new com.tinder.data.message.ActivityFeedItemDataStore$queryActivityEventNewMatch$2$1;	 Catch:{ Throwable -> 0x0057 }
        r3 = com.tinder.data.message.activityfeed.model.C8687c.m37066b();	 Catch:{ Throwable -> 0x0057 }
        r2.<init>(r3);	 Catch:{ Throwable -> 0x0057 }
        r2 = (kotlin.jvm.functions.Function1) r2;	 Catch:{ Throwable -> 0x0057 }
        r1 = kotlin.sequences.C19285g.e(r1, r2);	 Catch:{ Throwable -> 0x0057 }
        r1 = kotlin.sequences.C19285g.c(r1);	 Catch:{ Throwable -> 0x0057 }
        r1 = (com.tinder.data.model.activityfeed.ActivityEventNewMatchModel.Select_activity_event_new_matchModel) r1;	 Catch:{ Throwable -> 0x0057 }
        kotlin.io.C15818b.a(r10, r0);
        r10 = new com.tinder.domain.feed.ActivityEventNewMatch;
        r3 = r1.user_number();
        r5 = r1.other_user_number();
        r7 = r1.timestamp();
        r2 = r10;
        r2.<init>(r3, r5, r7);
        return r10;
    L_0x0055:
        r1 = move-exception;
        goto L_0x0059;
    L_0x0057:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0055 }
    L_0x0059:
        kotlin.io.C15818b.a(r10, r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.message.a.d(java.lang.String):com.tinder.domain.feed.ActivityEventNewMatch");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: e */
    private final com.tinder.domain.feed.InstagramConnect m37011e(java.lang.String r10) {
        /*
        r9 = this;
        r0 = com.tinder.data.message.activityfeed.model.aj.m37047a();
        r10 = r0.m37213a(r10);
        r0 = r9.f30563a;
        r1 = r10.f22514a;
        r10 = r10.f22515b;
        r2 = r10.length;
        r10 = java.util.Arrays.copyOf(r10, r2);
        r10 = (java.lang.String[]) r10;
        r10 = r0.a(r1, r10);
        if (r10 != 0) goto L_0x001e;
    L_0x001b:
        kotlin.jvm.internal.C2668g.a();
    L_0x001e:
        r10 = (java.io.Closeable) r10;
        r0 = 0;
        r0 = (java.lang.Throwable) r0;
        r1 = r10;
        r1 = (android.database.Cursor) r1;	 Catch:{ Throwable -> 0x0069 }
        r1 = com.tinder.data.database.C8642a.m36798a(r1);	 Catch:{ Throwable -> 0x0069 }
        r2 = new com.tinder.data.message.ActivityFeedItemDataStore$queryInstagramConnect$2$1;	 Catch:{ Throwable -> 0x0069 }
        r3 = com.tinder.data.message.activityfeed.model.aj.m37048b();	 Catch:{ Throwable -> 0x0069 }
        r2.<init>(r3);	 Catch:{ Throwable -> 0x0069 }
        r2 = (kotlin.jvm.functions.Function1) r2;	 Catch:{ Throwable -> 0x0069 }
        r1 = kotlin.sequences.C19285g.e(r1, r2);	 Catch:{ Throwable -> 0x0069 }
        r1 = kotlin.sequences.C19285g.c(r1);	 Catch:{ Throwable -> 0x0069 }
        r1 = (com.tinder.data.model.activityfeed.InstagramConnectModel.Select_instagram_connectModel) r1;	 Catch:{ Throwable -> 0x0069 }
        kotlin.io.C15818b.a(r10, r0);
        r10 = new com.tinder.domain.feed.InstagramConnect;
        r3 = r1.user_number();
        r5 = r1.timestamp();
        r7 = r1.instagram_user_name();
        r0 = "instagramConnectModel.instagram_user_name()";
        kotlin.jvm.internal.C2668g.a(r7, r0);
        r0 = r1.photos();
        if (r0 == 0) goto L_0x005d;
    L_0x005b:
        r8 = r0;
        goto L_0x0062;
    L_0x005d:
        r0 = kotlin.collections.C19301m.a();
        goto L_0x005b;
    L_0x0062:
        r2 = r10;
        r2.<init>(r3, r5, r7, r8);
        return r10;
    L_0x0067:
        r1 = move-exception;
        goto L_0x006b;
    L_0x0069:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0067 }
    L_0x006b:
        kotlin.io.C15818b.a(r10, r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.message.a.e(java.lang.String):com.tinder.domain.feed.InstagramConnect");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: f */
    private final com.tinder.domain.feed.ProfileAddPhoto m37012f(java.lang.String r9) {
        /*
        r8 = this;
        r0 = com.tinder.data.message.activityfeed.model.bb.m37055a();
        r9 = r0.m37221a(r9);
        r0 = r8.f30563a;
        r1 = r9.f22514a;
        r9 = r9.f22515b;
        r2 = r9.length;
        r9 = java.util.Arrays.copyOf(r9, r2);
        r9 = (java.lang.String[]) r9;
        r9 = r0.a(r1, r9);
        if (r9 != 0) goto L_0x001e;
    L_0x001b:
        kotlin.jvm.internal.C2668g.a();
    L_0x001e:
        r9 = (java.io.Closeable) r9;
        r0 = 0;
        r0 = (java.lang.Throwable) r0;
        r1 = r9;
        r1 = (android.database.Cursor) r1;	 Catch:{ Throwable -> 0x0060 }
        r1 = com.tinder.data.database.C8642a.m36798a(r1);	 Catch:{ Throwable -> 0x0060 }
        r2 = new com.tinder.data.message.ActivityFeedItemDataStore$queryProfileAddPhoto$2$1;	 Catch:{ Throwable -> 0x0060 }
        r3 = com.tinder.data.message.activityfeed.model.bb.m37056b();	 Catch:{ Throwable -> 0x0060 }
        r2.<init>(r3);	 Catch:{ Throwable -> 0x0060 }
        r2 = (kotlin.jvm.functions.Function1) r2;	 Catch:{ Throwable -> 0x0060 }
        r1 = kotlin.sequences.C19285g.e(r1, r2);	 Catch:{ Throwable -> 0x0060 }
        r1 = kotlin.sequences.C19285g.c(r1);	 Catch:{ Throwable -> 0x0060 }
        r1 = (com.tinder.data.model.activityfeed.ProfileAddPhotoModel.Select_profile_add_photoModel) r1;	 Catch:{ Throwable -> 0x0060 }
        kotlin.io.C15818b.a(r9, r0);
        r9 = new com.tinder.domain.feed.ProfileAddPhoto;
        r3 = r1.user_number();
        r5 = r1.timestamp();
        r0 = r1.photos();
        if (r0 == 0) goto L_0x0054;
    L_0x0052:
        r7 = r0;
        goto L_0x0059;
    L_0x0054:
        r0 = kotlin.collections.C19301m.a();
        goto L_0x0052;
    L_0x0059:
        r2 = r9;
        r2.<init>(r3, r5, r7);
        return r9;
    L_0x005e:
        r1 = move-exception;
        goto L_0x0062;
    L_0x0060:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x005e }
    L_0x0062:
        kotlin.io.C15818b.a(r9, r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.message.a.f(java.lang.String):com.tinder.domain.feed.ProfileAddPhoto");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: g */
    private final com.tinder.domain.feed.ProfileAddLoop m37013g(java.lang.String r9) {
        /*
        r8 = this;
        r0 = com.tinder.data.message.activityfeed.model.aw.m37053a();
        r9 = r0.m37219a(r9);
        r0 = r8.f30563a;
        r1 = r9.f22514a;
        r9 = r9.f22515b;
        r2 = r9.length;
        r9 = java.util.Arrays.copyOf(r9, r2);
        r9 = (java.lang.String[]) r9;
        r9 = r0.a(r1, r9);
        if (r9 != 0) goto L_0x001e;
    L_0x001b:
        kotlin.jvm.internal.C2668g.a();
    L_0x001e:
        r9 = (java.io.Closeable) r9;
        r0 = 0;
        r0 = (java.lang.Throwable) r0;
        r1 = r9;
        r1 = (android.database.Cursor) r1;	 Catch:{ Throwable -> 0x0060 }
        r1 = com.tinder.data.database.C8642a.m36798a(r1);	 Catch:{ Throwable -> 0x0060 }
        r2 = new com.tinder.data.message.ActivityFeedItemDataStore$queryProfileAddLoop$2$1;	 Catch:{ Throwable -> 0x0060 }
        r3 = com.tinder.data.message.activityfeed.model.aw.m37054b();	 Catch:{ Throwable -> 0x0060 }
        r2.<init>(r3);	 Catch:{ Throwable -> 0x0060 }
        r2 = (kotlin.jvm.functions.Function1) r2;	 Catch:{ Throwable -> 0x0060 }
        r1 = kotlin.sequences.C19285g.e(r1, r2);	 Catch:{ Throwable -> 0x0060 }
        r1 = kotlin.sequences.C19285g.c(r1);	 Catch:{ Throwable -> 0x0060 }
        r1 = (com.tinder.data.model.activityfeed.ProfileAddLoopModel.Select_profile_add_loopModel) r1;	 Catch:{ Throwable -> 0x0060 }
        kotlin.io.C15818b.a(r9, r0);
        r9 = new com.tinder.domain.feed.ProfileAddLoop;
        r3 = r1.user_number();
        r5 = r1.timestamp();
        r0 = r1.loops();
        if (r0 == 0) goto L_0x0054;
    L_0x0052:
        r7 = r0;
        goto L_0x0059;
    L_0x0054:
        r0 = kotlin.collections.C19301m.a();
        goto L_0x0052;
    L_0x0059:
        r2 = r9;
        r2.<init>(r3, r5, r7);
        return r9;
    L_0x005e:
        r1 = move-exception;
        goto L_0x0062;
    L_0x0060:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x005e }
    L_0x0062:
        kotlin.io.C15818b.a(r9, r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.message.a.g(java.lang.String):com.tinder.domain.feed.ProfileAddLoop");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: h */
    private final com.tinder.domain.feed.ProfileChangeBio m37014h(java.lang.String r10) {
        /*
        r9 = this;
        r0 = com.tinder.data.message.activityfeed.model.bl.m37059a();
        r10 = r0.m37225a(r10);
        r0 = r9.f30563a;
        r1 = r10.f22514a;
        r10 = r10.f22515b;
        r2 = r10.length;
        r10 = java.util.Arrays.copyOf(r10, r2);
        r10 = (java.lang.String[]) r10;
        r10 = r0.a(r1, r10);
        if (r10 != 0) goto L_0x001e;
    L_0x001b:
        kotlin.jvm.internal.C2668g.a();
    L_0x001e:
        r10 = (java.io.Closeable) r10;
        r0 = 0;
        r0 = (java.lang.Throwable) r0;
        r1 = r10;
        r1 = (android.database.Cursor) r1;	 Catch:{ Throwable -> 0x0065 }
        r1 = com.tinder.data.database.C8642a.m36798a(r1);	 Catch:{ Throwable -> 0x0065 }
        r2 = new com.tinder.data.message.ActivityFeedItemDataStore$queryProfileChangeBio$2$1;	 Catch:{ Throwable -> 0x0065 }
        r3 = com.tinder.data.message.activityfeed.model.bl.m37060b();	 Catch:{ Throwable -> 0x0065 }
        r2.<init>(r3);	 Catch:{ Throwable -> 0x0065 }
        r2 = (kotlin.jvm.functions.Function1) r2;	 Catch:{ Throwable -> 0x0065 }
        r1 = kotlin.sequences.C19285g.e(r1, r2);	 Catch:{ Throwable -> 0x0065 }
        r1 = kotlin.sequences.C19285g.c(r1);	 Catch:{ Throwable -> 0x0065 }
        r1 = (com.tinder.data.model.activityfeed.ProfileChangeBioModel.Select_profile_change_bioModel) r1;	 Catch:{ Throwable -> 0x0065 }
        kotlin.io.C15818b.a(r10, r0);
        r10 = new com.tinder.domain.feed.ProfileChangeBio;
        r3 = r1.user_number();
        r5 = r1.timestamp();
        r7 = r1.bio();
        r0 = "profileChangeBioModel.bio()";
        kotlin.jvm.internal.C2668g.a(r7, r0);
        r8 = r1.old_bio();
        r0 = "profileChangeBioModel.old_bio()";
        kotlin.jvm.internal.C2668g.a(r8, r0);
        r2 = r10;
        r2.<init>(r3, r5, r7, r8);
        return r10;
    L_0x0063:
        r1 = move-exception;
        goto L_0x0067;
    L_0x0065:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0063 }
    L_0x0067:
        kotlin.io.C15818b.a(r10, r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.message.a.h(java.lang.String):com.tinder.domain.feed.ProfileChangeBio");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: i */
    private final com.tinder.domain.feed.ProfileChangeWork m37015i(java.lang.String r9) {
        /*
        r8 = this;
        r0 = com.tinder.data.message.activityfeed.model.bv.m37063a();
        r9 = r0.m37229a(r9);
        r0 = r8.f30563a;
        r1 = r9.f22514a;
        r9 = r9.f22515b;
        r2 = r9.length;
        r9 = java.util.Arrays.copyOf(r9, r2);
        r9 = (java.lang.String[]) r9;
        r9 = r0.a(r1, r9);
        if (r9 != 0) goto L_0x001e;
    L_0x001b:
        kotlin.jvm.internal.C2668g.a();
    L_0x001e:
        r9 = (java.io.Closeable) r9;
        r0 = 0;
        r0 = (java.lang.Throwable) r0;
        r1 = r9;
        r1 = (android.database.Cursor) r1;	 Catch:{ Throwable -> 0x0060 }
        r1 = com.tinder.data.database.C8642a.m36798a(r1);	 Catch:{ Throwable -> 0x0060 }
        r2 = new com.tinder.data.message.ActivityFeedItemDataStore$queryProfileChangeWork$2$1;	 Catch:{ Throwable -> 0x0060 }
        r3 = com.tinder.data.message.activityfeed.model.bv.m37064b();	 Catch:{ Throwable -> 0x0060 }
        r2.<init>(r3);	 Catch:{ Throwable -> 0x0060 }
        r2 = (kotlin.jvm.functions.Function1) r2;	 Catch:{ Throwable -> 0x0060 }
        r1 = kotlin.sequences.C19285g.e(r1, r2);	 Catch:{ Throwable -> 0x0060 }
        r1 = kotlin.sequences.C19285g.c(r1);	 Catch:{ Throwable -> 0x0060 }
        r1 = (com.tinder.data.model.activityfeed.ProfileChangeWorkModel.Select_profile_change_workModel) r1;	 Catch:{ Throwable -> 0x0060 }
        kotlin.io.C15818b.a(r9, r0);
        r9 = new com.tinder.domain.feed.ProfileChangeWork;
        r3 = r1.user_number();
        r5 = r1.timestamp();
        r0 = r1.works();
        if (r0 == 0) goto L_0x0054;
    L_0x0052:
        r7 = r0;
        goto L_0x0059;
    L_0x0054:
        r0 = kotlin.collections.C19301m.a();
        goto L_0x0052;
    L_0x0059:
        r2 = r9;
        r2.<init>(r3, r5, r7);
        return r9;
    L_0x005e:
        r1 = move-exception;
        goto L_0x0062;
    L_0x0060:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x005e }
    L_0x0062:
        kotlin.io.C15818b.a(r9, r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.message.a.i(java.lang.String):com.tinder.domain.feed.ProfileChangeWork");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: j */
    private final com.tinder.domain.feed.ProfileChangeSchool m37016j(java.lang.String r9) {
        /*
        r8 = this;
        r0 = com.tinder.data.message.activityfeed.model.bq.m37061a();
        r9 = r0.m37227a(r9);
        r0 = r8.f30563a;
        r1 = r9.f22514a;
        r9 = r9.f22515b;
        r2 = r9.length;
        r9 = java.util.Arrays.copyOf(r9, r2);
        r9 = (java.lang.String[]) r9;
        r9 = r0.a(r1, r9);
        if (r9 != 0) goto L_0x001e;
    L_0x001b:
        kotlin.jvm.internal.C2668g.a();
    L_0x001e:
        r9 = (java.io.Closeable) r9;
        r0 = 0;
        r0 = (java.lang.Throwable) r0;
        r1 = r9;
        r1 = (android.database.Cursor) r1;	 Catch:{ Throwable -> 0x0060 }
        r1 = com.tinder.data.database.C8642a.m36798a(r1);	 Catch:{ Throwable -> 0x0060 }
        r2 = new com.tinder.data.message.ActivityFeedItemDataStore$queryProfileChangeSchool$2$1;	 Catch:{ Throwable -> 0x0060 }
        r3 = com.tinder.data.message.activityfeed.model.bq.m37062b();	 Catch:{ Throwable -> 0x0060 }
        r2.<init>(r3);	 Catch:{ Throwable -> 0x0060 }
        r2 = (kotlin.jvm.functions.Function1) r2;	 Catch:{ Throwable -> 0x0060 }
        r1 = kotlin.sequences.C19285g.e(r1, r2);	 Catch:{ Throwable -> 0x0060 }
        r1 = kotlin.sequences.C19285g.c(r1);	 Catch:{ Throwable -> 0x0060 }
        r1 = (com.tinder.data.model.activityfeed.ProfileChangeSchoolModel.Select_profile_change_schoolModel) r1;	 Catch:{ Throwable -> 0x0060 }
        kotlin.io.C15818b.a(r9, r0);
        r9 = new com.tinder.domain.feed.ProfileChangeSchool;
        r3 = r1.user_number();
        r5 = r1.timestamp();
        r0 = r1.schools();
        if (r0 == 0) goto L_0x0054;
    L_0x0052:
        r7 = r0;
        goto L_0x0059;
    L_0x0054:
        r0 = kotlin.collections.C19301m.a();
        goto L_0x0052;
    L_0x0059:
        r2 = r9;
        r2.<init>(r3, r5, r7);
        return r9;
    L_0x005e:
        r1 = move-exception;
        goto L_0x0062;
    L_0x0060:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x005e }
    L_0x0062:
        kotlin.io.C15818b.a(r9, r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.message.a.j(java.lang.String):com.tinder.domain.feed.ProfileChangeSchool");
    }

    /* renamed from: k */
    private final ProfileSpotifyTopArtist m37017k(String str) {
        C6124c a = ca.m37067a().m37231a(str);
        BriteDatabase briteDatabase = this.f30563a;
        String str2 = a.f22514a;
        String[] strArr = a.f22515b;
        Cursor a2 = briteDatabase.a(str2, (String[]) Arrays.copyOf(strArr, strArr.length));
        if (a2 == null) {
            C2668g.a();
        }
        Closeable closeable = a2;
        try {
            Select_profile_spotify_top_artistModel select_profile_spotify_top_artistModel = (Select_profile_spotify_top_artistModel) C19285g.c(C19285g.e(C8642a.m36798a((Cursor) closeable), new ActivityFeedItemDataStore$queryProfileSpotifyTopArtist$2$1(ca.m37068b())));
            C15818b.a(closeable, (Throwable) null);
            return new ProfileSpotifyTopArtist(select_profile_spotify_top_artistModel.user_number(), select_profile_spotify_top_artistModel.timestamp(), m37019m(str));
        } catch (Throwable th) {
            C15818b.a(closeable, str);
        }
    }

    /* renamed from: l */
    private final ProfileChangeAnthem m37018l(String str) {
        C6124c a = bg.m37057a().m37223a(str);
        BriteDatabase briteDatabase = this.f30563a;
        String str2 = a.f22514a;
        String[] strArr = a.f22515b;
        Cursor a2 = briteDatabase.a(str2, (String[]) Arrays.copyOf(strArr, strArr.length));
        if (a2 == null) {
            C2668g.a();
        }
        Closeable closeable = a2;
        try {
            Select_profile_change_anthemModel select_profile_change_anthemModel = (Select_profile_change_anthemModel) C19285g.c(C19285g.e(C8642a.m36798a((Cursor) closeable), new ActivityFeedItemDataStore$queryProfileChangeAnthem$2$1(bg.m37058b())));
            C15818b.a(closeable, (Throwable) null);
            return new ProfileChangeAnthem(select_profile_change_anthemModel.user_number(), select_profile_change_anthemModel.timestamp(), (ActivityFeedSong) C19301m.f(m37019m(str)));
        } catch (Throwable th) {
            C15818b.a(closeable, str);
        }
    }

    /* renamed from: m */
    private final List<ActivityFeedSong> m37019m(String str) {
        C6124c a = ae.m37045a().m37211a(str);
        BriteDatabase briteDatabase = this.f30563a;
        String str2 = a.f22514a;
        String[] strArr = a.f22515b;
        Cursor a2 = briteDatabase.a(str2, (String[]) Arrays.copyOf(strArr, strArr.length));
        if (a2 == null) {
            C2668g.a();
        }
        Closeable closeable = a2;
        Throwable th = (Throwable) null;
        try {
            List f = C19285g.f(C19285g.e(C8642a.m36798a((Cursor) closeable), new ActivityFeedItemDataStore$queryActivityFeedSongs$2$1(ae.m37046b())));
            C15818b.a(closeable, th);
            Iterable<Select_activity_feed_songModel> iterable = f;
            Collection arrayList = new ArrayList(C19301m.a(iterable, 10));
            for (Select_activity_feed_songModel select_activity_feed_songModel : iterable) {
                String id = select_activity_feed_songModel.id();
                C2668g.a(id, "activityFeedSongId");
                String name = select_activity_feed_songModel.name();
                C2668g.a(name, "activityFeedSongModel.name()");
                String url = select_activity_feed_songModel.url();
                C2668g.a(url, "activityFeedSongModel.url()");
                arrayList.add(new ActivityFeedSong(id, name, url, m37006a(str, id), m37008b(str, id)));
            }
            return (List) arrayList;
        } catch (Throwable th2) {
            C15818b.a(closeable, str);
        }
    }

    /* renamed from: a */
    private final ActivityFeedAlbum m37006a(String str, String str2) {
        str = C8688h.m37069a().m37201a(str, str2);
        str2 = this.f30563a;
        String str3 = str.f22514a;
        str = str.f22515b;
        str = str2.a(str3, (String[]) Arrays.copyOf(str, str.length));
        if (str == null) {
            C2668g.a();
        }
        Closeable closeable = (Closeable) str;
        str2 = null;
        try {
            Select_activity_feed_albumModel select_activity_feed_albumModel = (Select_activity_feed_albumModel) C19285g.d(C19285g.e(C8642a.m36798a((Cursor) closeable), new ActivityFeedItemDataStore$queryActivityFeedAlbum$2$1(C8688h.m37070b())));
            C15818b.a(closeable, (Throwable) null);
            if (select_activity_feed_albumModel != null) {
                str = select_activity_feed_albumModel.name();
                C2668g.a(str, "model.name()");
                List images = select_activity_feed_albumModel.images();
                if (images == null) {
                    images = C19301m.a();
                }
                str2 = new ActivityFeedAlbum(str, images);
            }
            return str2;
        } catch (Throwable th) {
            C15818b.a(closeable, str2);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    private final java.util.List<com.tinder.domain.feed.ActivityFeedArtist> m37008b(java.lang.String r6, java.lang.String r7) {
        /*
        r5 = this;
        r0 = com.tinder.data.message.activityfeed.model.C8689m.m37071a();
        r6 = r0.m37203a(r6, r7);
        r7 = r5.f30563a;
        r0 = r6.f22514a;
        r6 = r6.f22515b;
        r1 = r6.length;
        r6 = java.util.Arrays.copyOf(r6, r1);
        r6 = (java.lang.String[]) r6;
        r6 = r7.a(r0, r6);
        if (r6 != 0) goto L_0x001e;
    L_0x001b:
        kotlin.jvm.internal.C2668g.a();
    L_0x001e:
        r6 = (java.io.Closeable) r6;
        r7 = 0;
        r7 = (java.lang.Throwable) r7;
        r0 = r6;
        r0 = (android.database.Cursor) r0;	 Catch:{ Throwable -> 0x0090 }
        r0 = com.tinder.data.database.C8642a.m36798a(r0);	 Catch:{ Throwable -> 0x0090 }
        r1 = new com.tinder.data.message.ActivityFeedItemDataStore$queryActivityFeedArtists$2$1;	 Catch:{ Throwable -> 0x0090 }
        r2 = com.tinder.data.message.activityfeed.model.C8689m.m37072b();	 Catch:{ Throwable -> 0x0090 }
        r1.<init>(r2);	 Catch:{ Throwable -> 0x0090 }
        r1 = (kotlin.jvm.functions.Function1) r1;	 Catch:{ Throwable -> 0x0090 }
        r0 = kotlin.sequences.C19285g.e(r0, r1);	 Catch:{ Throwable -> 0x0090 }
        r0 = kotlin.sequences.C19285g.f(r0);	 Catch:{ Throwable -> 0x0090 }
        kotlin.io.C15818b.a(r6, r7);
        r0 = (java.lang.Iterable) r0;
        r6 = new java.util.ArrayList;
        r7 = 10;
        r7 = kotlin.collections.C19301m.a(r0, r7);
        r6.<init>(r7);
        r6 = (java.util.Collection) r6;
        r7 = r0.iterator();
    L_0x0053:
        r0 = r7.hasNext();
        if (r0 == 0) goto L_0x0085;
    L_0x0059:
        r0 = r7.next();
        r0 = (com.tinder.data.model.activityfeed.ActivityFeedArtistModel.Select_activity_feed_artistModel) r0;
        r1 = new com.tinder.domain.feed.ActivityFeedArtist;
        r2 = r0.id();
        r3 = "model.id()";
        kotlin.jvm.internal.C2668g.a(r2, r3);
        r3 = r0.name();
        r4 = "model.name()";
        kotlin.jvm.internal.C2668g.a(r3, r4);
        r0 = r0.images();
        if (r0 == 0) goto L_0x007a;
    L_0x0079:
        goto L_0x007e;
    L_0x007a:
        r0 = kotlin.collections.C19301m.a();
    L_0x007e:
        r1.<init>(r2, r3, r0);
        r6.add(r1);
        goto L_0x0053;
    L_0x0085:
        r6 = (java.util.List) r6;
        r6 = (java.lang.Iterable) r6;
        r6 = kotlin.collections.C19301m.l(r6);
        return r6;
    L_0x008e:
        r0 = move-exception;
        goto L_0x0092;
    L_0x0090:
        r7 = move-exception;
        throw r7;	 Catch:{ all -> 0x008e }
    L_0x0092:
        kotlin.io.C15818b.a(r6, r7);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.message.a.b(java.lang.String, java.lang.String):java.util.List<com.tinder.domain.feed.ActivityFeedArtist>");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: n */
    private final java.util.List<com.tinder.domain.feed.ActivityFeedComment> m37020n(java.lang.String r5) {
        /*
        r4 = this;
        r0 = com.tinder.data.message.activityfeed.model.C8690r.m37073a();
        r5 = r0.m37205a(r5);
        r0 = r4.f30563a;
        r1 = r5.f22514a;
        r5 = r5.f22515b;
        r2 = r5.length;
        r5 = java.util.Arrays.copyOf(r5, r2);
        r5 = (java.lang.String[]) r5;
        r5 = r0.a(r1, r5);
        if (r5 != 0) goto L_0x001e;
    L_0x001b:
        kotlin.jvm.internal.C2668g.a();
    L_0x001e:
        r5 = (java.io.Closeable) r5;
        r0 = 0;
        r0 = (java.lang.Throwable) r0;
        r1 = r5;
        r1 = (android.database.Cursor) r1;	 Catch:{ Throwable -> 0x004b }
        r1 = com.tinder.data.database.C8642a.m36798a(r1);	 Catch:{ Throwable -> 0x004b }
        r2 = new com.tinder.data.message.ActivityFeedItemDataStore$queryActivityFeedItemComments$2$1;	 Catch:{ Throwable -> 0x004b }
        r3 = com.tinder.data.message.activityfeed.model.C8690r.m37074b();	 Catch:{ Throwable -> 0x004b }
        r2.<init>(r3);	 Catch:{ Throwable -> 0x004b }
        r2 = (kotlin.jvm.functions.Function1) r2;	 Catch:{ Throwable -> 0x004b }
        r1 = kotlin.sequences.C19285g.e(r1, r2);	 Catch:{ Throwable -> 0x004b }
        r2 = com.tinder.data.message.ActivityFeedItemDataStore$queryActivityFeedItemComments$2$2.f43878a;	 Catch:{ Throwable -> 0x004b }
        r2 = (kotlin.jvm.functions.Function1) r2;	 Catch:{ Throwable -> 0x004b }
        r1 = kotlin.sequences.C19285g.e(r1, r2);	 Catch:{ Throwable -> 0x004b }
        r1 = kotlin.sequences.C19285g.f(r1);	 Catch:{ Throwable -> 0x004b }
        kotlin.io.C15818b.a(r5, r0);
        return r1;
    L_0x0049:
        r1 = move-exception;
        goto L_0x004d;
    L_0x004b:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0049 }
    L_0x004d:
        kotlin.io.C15818b.a(r5, r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.message.a.n(java.lang.String):java.util.List<com.tinder.domain.feed.ActivityFeedComment>");
    }
}
