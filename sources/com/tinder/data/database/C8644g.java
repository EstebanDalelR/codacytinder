package com.tinder.data.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b%\n\u0002\u0010 \n\u0002\bG\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010s\u001a\u00020t2\u0006\u0010u\u001a\u00020vH\u0002J\u0010\u0010w\u001a\u00020t2\u0006\u0010u\u001a\u00020vH\u0002J\u0010\u0010x\u001a\u00020t2\u0006\u0010u\u001a\u00020vH\u0002J\u0010\u0010y\u001a\u00020t2\u0006\u0010u\u001a\u00020vH\u0002J\u0010\u0010z\u001a\u00020t2\u0006\u0010u\u001a\u00020vH\u0002J\u0010\u0010{\u001a\u00020t2\u0006\u0010u\u001a\u00020vH\u0002J\u0010\u0010|\u001a\u00020t2\u0006\u0010u\u001a\u00020vH\u0002J\u0010\u0010}\u001a\u00020t2\u0006\u0010u\u001a\u00020vH\u0002J\u0010\u0010~\u001a\u00020t2\u0006\u0010u\u001a\u00020vH\u0002J\u0010\u0010\u001a\u00020t2\u0006\u0010u\u001a\u00020vH\u0002J\u0011\u0010\u0001\u001a\u00020t2\u0006\u0010u\u001a\u00020vH\u0002J\u0011\u0010\u0001\u001a\u00020t2\u0006\u0010u\u001a\u00020vH\u0002J\u0011\u0010\u0001\u001a\u00020t2\u0006\u0010u\u001a\u00020vH\u0002J\u0011\u0010\u0001\u001a\u00020t2\u0006\u0010u\u001a\u00020vH\u0002J\u0011\u0010\u0001\u001a\u00020t2\u0006\u0010u\u001a\u00020vH\u0002J\u0011\u0010\u0001\u001a\u00020t2\u0006\u0010u\u001a\u00020vH\u0002J\u0011\u0010\u0001\u001a\u00020t2\u0006\u0010u\u001a\u00020vH\u0002J\u0011\u0010\u0001\u001a\u00020t2\u0006\u0010u\u001a\u00020vH\u0002J\u0011\u0010\u0001\u001a\u00020t2\u0006\u0010u\u001a\u00020vH\u0002J\u0011\u0010\u0001\u001a\u00020t2\u0006\u0010u\u001a\u00020vH\u0002J\u0010\u0010\u0001\u001a\u00030\u0001H\u0001¢\u0006\u0003\b\u0001J\u0011\u0010\u0001\u001a\u00020t2\u0006\u0010u\u001a\u00020vH\u0016J\u0011\u0010\u0001\u001a\u00020t2\u0006\u0010u\u001a\u00020vH\u0016J%\u0010\u0001\u001a\u00020t2\u0006\u0010u\u001a\u00020v2\b\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0016J\u000f\u0010\u0001\u001a\u00020\u0006H\u0001¢\u0006\u0003\b\u0001R\u0014\u0010\u0005\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\bR\u0014\u0010\r\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\bR\u0014\u0010\u000f\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\bR\u0014\u0010\u0011\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\bR\u0014\u0010\u0013\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\bR\u0014\u0010\u0015\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\bR\u0014\u0010\u0017\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\bR\u0014\u0010\u0019\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\bR\u0014\u0010\u001b\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\bR\u0014\u0010\u001d\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\bR\u0014\u0010\u001f\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b \u0010\bR\u0014\u0010!\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\bR\u0014\u0010#\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\bR\u0014\u0010%\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\bR\u0014\u0010'\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\bR\u0014\u0010)\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\bR\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00060,8BX\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b0\u0010\bR\u0014\u00101\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\bR\u0014\u00103\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b4\u0010\bR\u0014\u00105\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b6\u0010\bR\u0014\u00107\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b8\u0010\bR\u0014\u00109\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b:\u0010\bR\u0014\u0010;\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b<\u0010\bR\u0014\u0010=\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b>\u0010\bR\u0014\u0010?\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b@\u0010\bR\u0014\u0010A\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\bB\u0010\bR\u0014\u0010C\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\bD\u0010\bR\u0014\u0010E\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\bF\u0010\bR\u0014\u0010G\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\bH\u0010\bR\u0014\u0010I\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010\bR\u0014\u0010K\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\bL\u0010\bR\u0014\u0010M\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\bN\u0010\bR\u0014\u0010O\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\bP\u0010\bR\u0014\u0010Q\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\bR\u0010\bR\u0014\u0010S\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\bT\u0010\bR\u0014\u0010U\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\bV\u0010\bR\u0014\u0010W\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\bX\u0010\bR\u0014\u0010Y\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010\bR\u0014\u0010[\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010\bR\u0014\u0010]\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b^\u0010\bR\u0014\u0010_\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b`\u0010\bR\u0014\u0010a\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\bb\u0010\bR\u001a\u0010c\u001a\b\u0012\u0004\u0012\u00020\u00060,8BX\u0004¢\u0006\u0006\u001a\u0004\bd\u0010.R\u0014\u0010e\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\bf\u0010\bR\u0014\u0010g\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\bh\u0010\bR\u0014\u0010i\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\bj\u0010\bR\u0014\u0010k\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\bl\u0010\bR\u001a\u0010m\u001a\b\u0012\u0004\u0012\u00020\u00060,8BX\u0004¢\u0006\u0006\u001a\u0004\bn\u0010.R\u001a\u0010o\u001a\b\u0012\u0004\u0012\u00020\u00060,8BX\u0004¢\u0006\u0006\u001a\u0004\bp\u0010.R\u0014\u0010q\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\br\u0010\b¨\u0006\u0001"}, d2 = {"Lcom/tinder/data/database/DelightOpenHelper;", "Landroid/database/sqlite/SQLiteOpenHelper;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "createActivityEventNewMatchTableVersion13", "", "getCreateActivityEventNewMatchTableVersion13", "()Ljava/lang/String;", "createActivityEventNewMatchTableVersion18", "getCreateActivityEventNewMatchTableVersion18", "createActivityFeedAlbumTableVersion18", "getCreateActivityFeedAlbumTableVersion18", "createActivityFeedAlbumVersion16", "getCreateActivityFeedAlbumVersion16", "createActivityFeedArtistTableVersion18", "getCreateActivityFeedArtistTableVersion18", "createActivityFeedArtistVersion16", "getCreateActivityFeedArtistVersion16", "createActivityFeedCommentTableVersion12", "getCreateActivityFeedCommentTableVersion12", "createActivityFeedCommentVersionTable18", "getCreateActivityFeedCommentVersionTable18", "createActivityFeedItemTableVersion12", "getCreateActivityFeedItemTableVersion12", "createActivityFeedItemTableVersion18", "getCreateActivityFeedItemTableVersion18", "createActivityFeedItemUserInfoTableVersion12", "getCreateActivityFeedItemUserInfoTableVersion12", "createActivityFeedItemUserInfoTableVersion18", "getCreateActivityFeedItemUserInfoTableVersion18", "createActivityFeedSongTableVersion18", "getCreateActivityFeedSongTableVersion18", "createActivityFeedSongVersion16", "getCreateActivityFeedSongVersion16", "createGifTableVersion10", "getCreateGifTableVersion10", "createGifTableVersion9", "getCreateGifTableVersion9", "createIndexMatchIdSentDate10", "getCreateIndexMatchIdSentDate10", "createIndexMatchIdSentDate9", "getCreateIndexMatchIdSentDate9", "createIndexStatements", "", "getCreateIndexStatements", "()Ljava/util/List;", "createInstagramConnectTableVersion14", "getCreateInstagramConnectTableVersion14", "createInstagramConnectTableVersion18", "getCreateInstagramConnectTableVersion18", "createInstagramNewMediaTableVersion12", "getCreateInstagramNewMediaTableVersion12", "createInstagramNewMediaTableVersion18", "getCreateInstagramNewMediaTableVersion18", "createMatchPlaceTableVersion24", "getCreateMatchPlaceTableVersion24", "createMessageActivityFeedItemTableVersion18", "getCreateMessageActivityFeedItemTableVersion18", "createMessageImageTableVersion29", "getCreateMessageImageTableVersion29", "createMessageTableVersion10", "getCreateMessageTableVersion10", "createMessageTableVersion9", "getCreateMessageTableVersion9", "createMessageViewVersion7", "getCreateMessageViewVersion7", "createPlaceTableVersion24", "getCreatePlaceTableVersion24", "createProfileAddLoopTableVersion22", "getCreateProfileAddLoopTableVersion22", "createProfileAddPhotoTableVersion15", "getCreateProfileAddPhotoTableVersion15", "createProfileAddPhotoTableVersion18", "getCreateProfileAddPhotoTableVersion18", "createProfileChangeAnthemTableVersion17", "getCreateProfileChangeAnthemTableVersion17", "createProfileChangeAnthemTableVersion18", "getCreateProfileChangeAnthemTableVersion18", "createProfileChangeBioTableVersion26", "getCreateProfileChangeBioTableVersion26", "createProfileChangeSchoolTableVersion28", "getCreateProfileChangeSchoolTableVersion28", "createProfileChangeWorkTableVersion27", "getCreateProfileChangeWorkTableVersion27", "createProfileSpotifyTopArtistTableVersion16", "getCreateProfileSpotifyTopArtistTableVersion16", "createProfileSpotifyTopArtistTableVersion18", "getCreateProfileSpotifyTopArtistTableVersion18", "createReactionTableVersion10", "getCreateReactionTableVersion10", "createReactionTableVersion9", "getCreateReactionTableVersion9", "createReactionValuesTableVersion6", "getCreateReactionValuesTableVersion6", "createSponsoredMatchValuesTableVersion3", "getCreateSponsoredMatchValuesTableVersion3", "createStrikeReactionValuesTableVersion5", "getCreateStrikeReactionValuesTableVersion5", "createTableStatements", "getCreateTableStatements", "createTopPickTeaserTableVersion30", "getCreateTopPickTeaserTableVersion30", "createTopPickTeasersTableVersion19", "getCreateTopPickTeasersTableVersion19", "createTrackingUrlTableForVersion3", "getCreateTrackingUrlTableForVersion3", "createTrackingUrlTableForVersion4", "getCreateTrackingUrlTableForVersion4", "createTriggerStatements", "getCreateTriggerStatements", "createViewStatements", "getCreateViewStatements", "deleteMatchWithEmptyIdVersion25", "getDeleteMatchWithEmptyIdVersion25", "copyActivityEventNewMatchOldV17ToActivityEventNewMatchV18", "", "db", "Landroid/database/sqlite/SQLiteDatabase;", "copyActivityFeedAlbumOldV17ToActivityFeedAlbumV18", "copyActivityFeedArtistOldV17ToActivityFeedArtistV18", "copyActivityFeedCommentOldV17ToActivityFeedCommentV18", "copyActivityFeedItemOldV17ToActivityFeedItemV18", "copyActivityFeedItemUserInfoOldV17ToActivityFeedItemUserInfoV18", "copyActivityFeedSongOldV17ToActivityFeedSongV18", "copyGifOldV8ToGifV9", "copyGifOldV9ToGifV10", "copyInstagramConnectOldV17ToInstagramConnectV18", "copyInstagramNewMediaOldV17ToInstagramNewMediaV18", "copyMessageIdAndActivityFeedItemIdFromActivityFeedItemOldV17ToMessageActivityFeedItemV18", "copyMessageOldV8ToMessageV9", "copyMessageOldV9ToMessageV10", "copyProfileAddPhotoOldV17ToProfileAddPhotoV18", "copyProfileChangeAnthemOldV17ToProfileChangeAnthemV18", "copyProfileSpotifyTopArtistOldV17ToProfileSpotifyTopArtistV18", "copyReactionOldV8ToReactionV9", "copyReactionOldV9ToReactionV10", "dropTopPickTeaserTable", "getVersion", "", "getVersion$data_release", "onConfigure", "onCreate", "onUpgrade", "oldVersion", "newVersion", "testDbName", "testDbName$data_release", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.database.g */
public final class C8644g extends SQLiteOpenHelper {
    /* renamed from: A */
    private final String m36803A() {
        return "CREATE TABLE activity_feed_song(\n  id TEXT NOT NULL,\n  activity_feed_item_id TEXT NOT NULL,\n  name TEXT NOT NULL,\n  url TEXT NOT NULL,\n  PRIMARY KEY (id, activity_feed_item_id),\n  FOREIGN KEY (activity_feed_item_id) REFERENCES activity_feed_item(id) ON DELETE CASCADE\n)";
    }

    /* renamed from: B */
    private final String m36804B() {
        return "CREATE TABLE activity_feed_album(\n  activity_feed_item_id TEXT NOT NULL,\n  activity_feed_song_id TEXT NOT NULL,\n  name TEXT NOT NULL,\n  images BLOB,\n  PRIMARY KEY (activity_feed_item_id, activity_feed_song_id),\n  FOREIGN KEY (activity_feed_item_id, activity_feed_song_id)\n    REFERENCES activity_feed_song(activity_feed_item_id, id) ON DELETE CASCADE\n)";
    }

    /* renamed from: C */
    private final String m36805C() {
        return "CREATE TABLE activity_feed_artist(\n  id TEXT NOT NULL,\n  activity_feed_item_id TEXT NOT NULL,\n  activity_feed_song_id TEXT NOT NULL,\n  name TEXT NOT NULL,\n  images BLOB,\n  PRIMARY KEY (activity_feed_item_id, activity_feed_song_id, id),\n  FOREIGN KEY (activity_feed_item_id, activity_feed_song_id)\n    REFERENCES activity_feed_song(activity_feed_item_id, id) ON DELETE CASCADE\n)";
    }

    /* renamed from: D */
    private final String m36806D() {
        return "CREATE TABLE profile_change_anthem(\n  _id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n  activity_feed_item_id TEXT NOT NULL,\n  user_number INTEGER NOT NULL,\n  timestamp INTEGER NOT NULL,\n  FOREIGN KEY (activity_feed_item_id) REFERENCES activity_feed_item(id) ON DELETE CASCADE\n)";
    }

    /* renamed from: E */
    private final String m36807E() {
        return "CREATE TABLE profile_add_loop(\n  _id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n  activity_feed_item_id TEXT NOT NULL,\n  user_number INTEGER NOT NULL,\n  timestamp INTEGER NOT NULL,\n  loops BLOB,\n  FOREIGN KEY (activity_feed_item_id) REFERENCES activity_feed_item(id) ON DELETE CASCADE\n)";
    }

    /* renamed from: F */
    private final String m36808F() {
        return "CREATE TABLE place(\n id TEXT NOT NULL PRIMARY KEY,\n name TEXT NOT NULL\n)";
    }

    /* renamed from: G */
    private final String m36809G() {
        return "CREATE TABLE match_place(\n match_id TEXT NOT NULL,\n place_id TEXT NOT NULL,\n PRIMARY KEY (match_id, place_id),\n FOREIGN KEY (match_id) REFERENCES `match`(id) ON DELETE CASCADE ON UPDATE CASCADE,\n FOREIGN KEY (place_id) REFERENCES place(id) ON UPDATE CASCADE\n)";
    }

    /* renamed from: H */
    private final String m36810H() {
        return "DELETE FROM `match` WHERE id = \"\"";
    }

    /* renamed from: I */
    private final String m36811I() {
        return "CREATE TABLE profile_change_bio(\n  _id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n  activity_feed_item_id TEXT NOT NULL,\n  user_number INTEGER NOT NULL,\n  timestamp INTEGER NOT NULL,\n  bio TEXT NOT NULL,\n  old_bio TEXT NOT NULL,\n  FOREIGN KEY (activity_feed_item_id) REFERENCES activity_feed_item(id) ON DELETE CASCADE\n)";
    }

    /* renamed from: J */
    private final String m36812J() {
        return "CREATE TABLE profile_change_work(\n  _id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n  activity_feed_item_id TEXT NOT NULL,\n  user_number INTEGER NOT NULL,\n  timestamp INTEGER NOT NULL,\n  works BLOB,\n  FOREIGN KEY (activity_feed_item_id) REFERENCES activity_feed_item(id) ON DELETE CASCADE\n)";
    }

    /* renamed from: K */
    private final String m36813K() {
        return "CREATE TABLE profile_change_school(\n  _id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n  activity_feed_item_id TEXT NOT NULL,\n  user_number INTEGER NOT NULL,\n  timestamp INTEGER NOT NULL,\n  schools BLOB,\n  FOREIGN KEY (activity_feed_item_id) REFERENCES activity_feed_item(id) ON DELETE CASCADE\n)";
    }

    /* renamed from: L */
    private final String m36814L() {
        return "CREATE TABLE message_image (\n  message_id TEXT PRIMARY KEY NOT NULL,\n  source TEXT NOT NULL,\n  url TEXT NOT NULL,\n  width INTEGER NOT NULL,\n  height INTEGER NOT NULL,\n  FOREIGN KEY (message_id) REFERENCES message(id) ON DELETE CASCADE ON UPDATE CASCADE\n)";
    }

    /* renamed from: M */
    private final String m36815M() {
        return "CREATE TABLE activity_feed_item(\n  id TEXT PRIMARY KEY NOT NULL,\n  match_id TEXT NOT NULL,\n  activity_event_type TEXT NOT NULL,\n  FOREIGN KEY(match_id) REFERENCES `match`(id) ON DELETE CASCADE\n)";
    }

    /* renamed from: N */
    private final String m36816N() {
        return "CREATE TABLE activity_feed_item_user_info(\n  _id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n  activity_feed_item_id TEXT NOT NULL,\n  user_id TEXT NOT NULL,\n  FOREIGN KEY(activity_feed_item_id) REFERENCES activity_feed_item(id) ON DELETE CASCADE\n)";
    }

    /* renamed from: O */
    private final String m36817O() {
        return "CREATE TABLE activity_feed_comment(\n  _id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n  activity_feed_item_id TEXT NOT NULL,\n  created_at INTEGER NOT NULL,\n  message TEXT NOT NULL,\n  metadata_carousel_item_id TEXT NOT NULL,\n  FOREIGN KEY(activity_feed_item_id) REFERENCES activity_feed_item(id) ON DELETE CASCADE\n)";
    }

    /* renamed from: P */
    private final String m36818P() {
        return "CREATE TABLE instagram_new_media(\n  _id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n  activity_feed_item_id TEXT NOT NULL,\n  instagram_media_id TEXT NOT NULL,\n  instagram_user_name TEXT NOT NULL,\n  user_number INTEGER NOT NULL,\n  instagram_user_id INTEGER NOT NULL,\n  timestamp INTEGER NOT NULL,\n  caption TEXT NOT NULL,\n  media BLOB,\n  FOREIGN KEY (activity_feed_item_id) REFERENCES activity_feed_item(id) ON DELETE CASCADE\n)";
    }

    /* renamed from: Q */
    private final String m36819Q() {
        return "CREATE TABLE instagram_connect(\n  _id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n  activity_feed_item_id TEXT NOT NULL,\n  user_number INTEGER NOT NULL,\n  timestamp INTEGER NOT NULL,\n  instagram_user_name TEXT NOT NULL,\n  photos BLOB,\n  FOREIGN KEY (activity_feed_item_id) REFERENCES activity_feed_item(id) ON DELETE CASCADE\n)";
    }

    /* renamed from: R */
    private final String m36820R() {
        return "CREATE TABLE activity_event_new_match(\n  _id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n  activity_feed_item_id TEXT NOT NULL,\n  user_number INTEGER NOT NULL,\n  other_user_number INTEGER NOT NULL,\n  timestamp INTEGER NOT NULL,\n  FOREIGN KEY (activity_feed_item_id) REFERENCES activity_feed_item(id) ON DELETE CASCADE\n)";
    }

    /* renamed from: S */
    private final String m36821S() {
        return "CREATE TABLE profile_add_photo(\n  _id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n  activity_feed_item_id TEXT NOT NULL,\n  user_number INTEGER NOT NULL,\n  timestamp INTEGER NOT NULL,\n  photos BLOB,\n  FOREIGN KEY (activity_feed_item_id) REFERENCES activity_feed_item(id) ON DELETE CASCADE\n)";
    }

    /* renamed from: T */
    private final String m36822T() {
        return "CREATE TABLE profile_change_anthem(\n  _id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n  activity_feed_item_id TEXT NOT NULL,\n  user_number INTEGER NOT NULL,\n  timestamp INTEGER NOT NULL,\n  FOREIGN KEY (activity_feed_item_id) REFERENCES activity_feed_item(id) ON DELETE CASCADE\n)";
    }

    /* renamed from: U */
    private final String m36823U() {
        return "CREATE TABLE profile_spotify_top_artist(\n  _id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n  activity_feed_item_id TEXT NOT NULL,\n  user_number INTEGER NOT NULL,\n  timestamp INTEGER NOT NULL,\n  FOREIGN KEY (activity_feed_item_id) REFERENCES activity_feed_item(id) ON DELETE CASCADE\n)";
    }

    /* renamed from: V */
    private final String m36824V() {
        return "CREATE TABLE activity_feed_song(\n  id TEXT NOT NULL,\n  activity_feed_item_id TEXT NOT NULL,\n  name TEXT NOT NULL,\n  url TEXT NOT NULL,\n  PRIMARY KEY (id, activity_feed_item_id),\n  FOREIGN KEY (activity_feed_item_id) REFERENCES activity_feed_item(id) ON DELETE CASCADE\n)";
    }

    /* renamed from: W */
    private final String m36825W() {
        return "CREATE TABLE activity_feed_album(\n  activity_feed_item_id TEXT NOT NULL,\n  activity_feed_song_id TEXT NOT NULL,\n  name TEXT NOT NULL,\n  images BLOB,\n  PRIMARY KEY (activity_feed_item_id, activity_feed_song_id),\n  FOREIGN KEY (activity_feed_item_id, activity_feed_song_id)\n    REFERENCES activity_feed_song(activity_feed_item_id, id) ON DELETE CASCADE\n)";
    }

    /* renamed from: X */
    private final String m36826X() {
        return "CREATE TABLE activity_feed_artist(\n  id TEXT NOT NULL,\n  activity_feed_item_id TEXT NOT NULL,\n  activity_feed_song_id TEXT NOT NULL,\n  name TEXT NOT NULL,\n  images BLOB,\n  PRIMARY KEY (activity_feed_item_id, activity_feed_song_id, id),\n  FOREIGN KEY (activity_feed_item_id, activity_feed_song_id)\n    REFERENCES activity_feed_song(activity_feed_item_id, id) ON DELETE CASCADE\n)";
    }

    /* renamed from: Y */
    private final String m36827Y() {
        return "CREATE TABLE message_activity_feed_item(\n  message_id TEXT NOT NULL,\n  activity_feed_item_id TEXT NOT NULL,\n  PRIMARY KEY(message_id, activity_feed_item_id),\n  FOREIGN KEY(message_id) REFERENCES message(id) ON DELETE CASCADE,\n  FOREIGN KEY(activity_feed_item_id) REFERENCES activity_feed_item(id) ON DELETE CASCADE\n)";
    }

    /* renamed from: Z */
    private final String m36828Z() {
        return "CREATE TABLE top_pick_teaser(\n  id TEXT NOT NULL PRIMARY KEY,\n  expiration_time INTEGER NOT NULL,\n  photo_url TEXT NOT NULL\n)";
    }

    private final String aa() {
        return "CREATE TABLE top_pick_teaser(\n  id TEXT NOT NULL PRIMARY KEY,\n  expiration_time INTEGER NOT NULL,\n  photo_url TEXT NOT NULL,\n  tags BLOB\n)";
    }

    /* renamed from: e */
    private final String m36837e() {
        return "CREATE TABLE tracking_url (\n  template_id TEXT NOT NULL PRIMARY KEY,\n  url TEXT NOT NULL,\n  event TEXT NOT NULL,\n  is_unique INTEGER NOT NULL,\n  ping_time INTEGER,\n  FOREIGN KEY (template_id) REFERENCES sponsored_match_creative_values(template_id)  ON DELETE CASCADE\n)";
    }

    /* renamed from: f */
    private final String m36839f() {
        return "CREATE TABLE tracking_url (\n  template_id TEXT NOT NULL,\n  url TEXT NOT NULL,\n  event TEXT NOT NULL,\n  is_unique INTEGER NOT NULL,\n  ping_time INTEGER,\n  FOREIGN KEY (template_id) REFERENCES sponsored_match_creative_values(template_id)  ON DELETE CASCADE\n)";
    }

    /* renamed from: g */
    private final String m36841g() {
        return "CREATE TABLE sponsored_match_creative_values (\n  template_id TEXT NOT NULL PRIMARY KEY,\n  match_id TEXT NOT NULL,\n  title TEXT NOT NULL,\n  logo_url TEXT NOT NULL,\n  body TEXT NOT NULL,\n  clickthrough_url TEXT NOT NULL,\n  clickthrough_text TEXT NOT NULL,\n  end_date INTEGER NOT NULL,\n  FOREIGN KEY (match_id) REFERENCES `match`(id) ON DELETE CASCADE\n)";
    }

    /* renamed from: h */
    private final String m36843h() {
        return "CREATE TABLE strike_reaction (\n  match_id TEXT NOT NULL PRIMARY KEY,\n  strike_id TEXT NOT NULL,\n  FOREIGN KEY (match_id) REFERENCES `match`(id) ON DELETE CASCADE\n);";
    }

    /* renamed from: i */
    private final String m36845i() {
        return "CREATE TABLE reaction (\n  _id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n  reaction_id TEXT NOT NULL,\n  message_id TEXT NOT NULL,\n  FOREIGN KEY (message_id) REFERENCES message(id) ON DELETE CASCADE ON UPDATE CASCADE\n);";
    }

    /* renamed from: j */
    private final String m36847j() {
        return "CREATE VIEW message_view AS\nSELECT message.*, gif.*, reaction.*\nFROM message\nLEFT JOIN gif ON message.id = gif.message_id\nLEFT JOIN reaction ON message.id = reaction.message_id;";
    }

    /* renamed from: k */
    private final String m36849k() {
        return "CREATE TABLE message (\n    id TEXT NOT NULL PRIMARY KEY,\n    match_id TEXT NOT NULL,\n    to_id TEXT NOT NULL,\n    from_id TEXT NOT NULL,\n    text TEXT NOT NULL,\n    sent_date INTEGER NOT NULL,\n    is_liked INTEGER NOT NULL DEFAULT 0,\n    type TEXT NOT NULL,\n    delivery_status TEXT NOT NULL,\n    is_seen INTEGER NOT NULL DEFAULT 0,\n    FOREIGN KEY (match_id) REFERENCES `match`(id) ON DELETE CASCADE\n)";
    }

    /* renamed from: l */
    private final String m36851l() {
        return "CREATE TABLE gif (\n  _id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n  gif_id TEXT NOT NULL,\n  message_id TEXT NOT NULL,\n  url TEXT NOT NULL,\n  width INTEGER NOT NULL,\n  height INTEGER NOT NULL,\n  fixed_height_url TEXT NOT NULL,\n  fixed_height_width INTEGER NOT NULL,\n  fixed_height_height INTEGER NOT NULL,\n  FOREIGN KEY (message_id) REFERENCES message(id) ON DELETE CASCADE ON UPDATE CASCADE\n);";
    }

    /* renamed from: m */
    private final String m36853m() {
        return "CREATE TABLE reaction (\n    _id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    reaction_id TEXT NOT NULL,\n    message_id TEXT NOT NULL,\n    FOREIGN KEY (message_id) REFERENCES message(id) ON DELETE CASCADE ON UPDATE CASCADE\n);";
    }

    /* renamed from: n */
    private final String m36855n() {
        return "CREATE INDEX idx_match_id_sent_date\nON message (match_id, sent_date)";
    }

    /* renamed from: o */
    private final String m36857o() {
        return "CREATE TABLE message (\n    client_sequential_id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    id TEXT NOT NULL UNIQUE,\n    match_id TEXT NOT NULL,\n    to_id TEXT NOT NULL,\n    from_id TEXT NOT NULL,\n    text TEXT NOT NULL,\n    sent_date INTEGER NOT NULL,\n    is_liked INTEGER NOT NULL DEFAULT 0,\n    type TEXT NOT NULL,\n    delivery_status TEXT NOT NULL,\n    is_seen INTEGER NOT NULL DEFAULT 0,\n    FOREIGN KEY (match_id) REFERENCES `match`(id) ON DELETE CASCADE\n)";
    }

    /* renamed from: p */
    private final String m36859p() {
        return "CREATE TABLE gif (\n  _id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n  gif_id TEXT NOT NULL,\n  message_id TEXT NOT NULL,\n  url TEXT NOT NULL,\n  width INTEGER NOT NULL,\n  height INTEGER NOT NULL,\n  fixed_height_url TEXT NOT NULL,\n  fixed_height_width INTEGER NOT NULL,\n  fixed_height_height INTEGER NOT NULL,\n  FOREIGN KEY (message_id) REFERENCES message(id) ON DELETE CASCADE ON UPDATE CASCADE\n)";
    }

    /* renamed from: q */
    private final String m36861q() {
        return "CREATE TABLE reaction (\n    _id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    reaction_id TEXT NOT NULL,\n    message_id TEXT NOT NULL,\n    FOREIGN KEY (message_id) REFERENCES message(id) ON DELETE CASCADE ON UPDATE CASCADE\n)";
    }

    /* renamed from: r */
    private final String m36863r() {
        return "CREATE INDEX idx_match_id_sent_date\nON message (match_id, sent_date)";
    }

    /* renamed from: s */
    private final String m36865s() {
        return "CREATE TABLE activity_feed_item(\n  id TEXT PRIMARY KEY NOT NULL,\n  match_id TEXT NOT NULL,\n  activity_event_type TEXT NOT NULL,\n  message_id TEXT NOT NULL,\n  FOREIGN KEY (message_id) REFERENCES message(id) ON DELETE CASCADE ON UPDATE CASCADE\n)";
    }

    /* renamed from: t */
    private final String m36867t() {
        return "CREATE TABLE activity_feed_item_user_info(\n  _id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n  activity_feed_item_id TEXT NOT NULL,\n  user_id TEXT NOT NULL,\n  FOREIGN KEY(activity_feed_item_id) REFERENCES activity_feed_item(id) ON DELETE CASCADE\n)";
    }

    /* renamed from: u */
    private final String m36869u() {
        return "CREATE TABLE activity_feed_comment(\n  _id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n  activity_feed_item_id TEXT NOT NULL,\n  created_at INTEGER NOT NULL,\n  message TEXT NOT NULL,\n  metadata_carousel_item_id TEXT NOT NULL,\n  FOREIGN KEY(activity_feed_item_id) REFERENCES activity_feed_item(id) ON DELETE CASCADE\n)";
    }

    /* renamed from: v */
    private final String m36870v() {
        return "CREATE TABLE instagram_new_media(\n  _id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n  activity_feed_item_id TEXT NOT NULL,\n  instagram_media_id TEXT NOT NULL,\n  instagram_user_name TEXT NOT NULL,\n  user_number INTEGER NOT NULL,\n  instagram_user_id INTEGER NOT NULL,\n  timestamp INTEGER NOT NULL,\n  caption TEXT NOT NULL,\n  media BLOB,\n  FOREIGN KEY (activity_feed_item_id) REFERENCES activity_feed_item(id) ON DELETE CASCADE\n)";
    }

    /* renamed from: w */
    private final String m36871w() {
        return "CREATE TABLE activity_event_new_match(\n  _id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n  activity_feed_item_id TEXT NOT NULL,\n  user_number INTEGER NOT NULL,\n  other_user_number INTEGER NOT NULL,\n  timestamp INTEGER NOT NULL,\n  FOREIGN KEY (activity_feed_item_id) REFERENCES activity_feed_item(id) ON DELETE CASCADE\n)";
    }

    /* renamed from: x */
    private final String m36872x() {
        return "CREATE TABLE instagram_connect(\n  _id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n  activity_feed_item_id TEXT NOT NULL,\n  user_number INTEGER NOT NULL,\n  timestamp INTEGER NOT NULL,\n  instagram_user_name TEXT NOT NULL,\n  photos BLOB,\n  FOREIGN KEY (activity_feed_item_id) REFERENCES activity_feed_item(id) ON DELETE CASCADE\n)";
    }

    /* renamed from: y */
    private final String m36873y() {
        return "CREATE TABLE profile_add_photo(\n  _id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n  activity_feed_item_id TEXT NOT NULL,\n  user_number INTEGER NOT NULL,\n  timestamp INTEGER NOT NULL,\n  photos BLOB,\n  FOREIGN KEY (activity_feed_item_id) REFERENCES activity_feed_item(id) ON DELETE CASCADE\n)";
    }

    /* renamed from: z */
    private final String m36874z() {
        return "CREATE TABLE profile_spotify_top_artist(\n  _id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n  activity_feed_item_id TEXT NOT NULL,\n  user_number INTEGER NOT NULL,\n  timestamp INTEGER NOT NULL,\n  FOREIGN KEY (activity_feed_item_id) REFERENCES activity_feed_item(id) ON DELETE CASCADE\n)";
    }

    public C8644g(@NotNull Context context) {
        C2668g.b(context, "context");
        super(context, "tinder-3.db", null, 30);
    }

    public void onConfigure(@NotNull SQLiteDatabase sQLiteDatabase) {
        C2668g.b(sQLiteDatabase, "db");
        super.onConfigure(sQLiteDatabase);
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    public void onCreate(@NotNull SQLiteDatabase sQLiteDatabase) {
        C2668g.b(sQLiteDatabase, "db");
        for (String execSQL : m36829a()) {
            sQLiteDatabase.execSQL(execSQL);
        }
        for (String execSQL2 : m36831b()) {
            sQLiteDatabase.execSQL(execSQL2);
        }
        for (String execSQL22 : m36833c()) {
            sQLiteDatabase.execSQL(execSQL22);
        }
        for (String execSQL222 : m36835d()) {
            sQLiteDatabase.execSQL(execSQL222);
        }
    }

    public void onUpgrade(@NotNull SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C2668g.b(sQLiteDatabase, "db");
        if (i < 2) {
            sQLiteDatabase.execSQL("DROP TRIGGER delete_orphans");
        }
        if (i < 3) {
            sQLiteDatabase.execSQL("DELETE FROM `match`\n    WHERE id IN (\n        SELECT id\n        FROM `match` M\n        INNER JOIN sponsored_match_creative_values CV ON M.id = CV.match_id\n    )");
            sQLiteDatabase.execSQL("DROP TABLE sponsored_match_creative_values");
            sQLiteDatabase.execSQL(m36841g());
            sQLiteDatabase.execSQL(m36837e());
        }
        if (i < 4) {
            sQLiteDatabase.execSQL("DROP TABLE tracking_url");
            sQLiteDatabase.execSQL(m36839f());
        }
        if (i < 5) {
            sQLiteDatabase.execSQL(m36843h());
        }
        if (i < 6) {
            sQLiteDatabase.execSQL(m36845i());
        }
        if (i < 7) {
            sQLiteDatabase.execSQL("DROP VIEW IF EXISTS message_view");
            sQLiteDatabase.execSQL(m36847j());
        }
        if (i < 8) {
            sQLiteDatabase.execSQL("ALTER TABLE message ADD COLUMN is_seen INTEGER DEFAULT 0");
        }
        if (i < 9) {
            sQLiteDatabase.execSQL("ALTER TABLE message RENAME TO message_old");
            sQLiteDatabase.execSQL("ALTER TABLE gif RENAME TO gif_old");
            sQLiteDatabase.execSQL("ALTER TABLE reaction RENAME TO reaction_old");
            sQLiteDatabase.execSQL(m36849k());
            sQLiteDatabase.execSQL(m36851l());
            sQLiteDatabase.execSQL(m36853m());
            m36830a(sQLiteDatabase);
            m36832b(sQLiteDatabase);
            m36834c(sQLiteDatabase);
            sQLiteDatabase.execSQL("DROP TABLE message_old");
            sQLiteDatabase.execSQL("DROP TABLE gif_old");
            sQLiteDatabase.execSQL("DROP TABLE reaction_old");
            sQLiteDatabase.execSQL(m36855n());
        }
        if (i < 10) {
            sQLiteDatabase.execSQL("ALTER TABLE message RENAME TO message_old");
            sQLiteDatabase.execSQL("ALTER TABLE gif RENAME TO gif_old");
            sQLiteDatabase.execSQL("ALTER TABLE reaction RENAME TO reaction_old");
            sQLiteDatabase.execSQL(m36857o());
            sQLiteDatabase.execSQL(m36859p());
            sQLiteDatabase.execSQL(m36861q());
            m36836d(sQLiteDatabase);
            m36838e(sQLiteDatabase);
            m36840f(sQLiteDatabase);
            sQLiteDatabase.execSQL("DROP TABLE message_old");
            sQLiteDatabase.execSQL("DROP TABLE gif_old");
            sQLiteDatabase.execSQL("DROP TABLE reaction_old");
            sQLiteDatabase.execSQL(m36863r());
        }
        if (i < 11) {
            sQLiteDatabase.execSQL("ALTER TABLE tracking_url ADD COLUMN line_item_id TEXT");
        }
        if (i < 12) {
            sQLiteDatabase.execSQL(m36865s());
            sQLiteDatabase.execSQL(m36867t());
            sQLiteDatabase.execSQL(m36869u());
            sQLiteDatabase.execSQL(m36870v());
        }
        if (i < 13) {
            sQLiteDatabase.execSQL(m36871w());
        }
        if (i < 14) {
            sQLiteDatabase.execSQL(m36872x());
        }
        if (i < 15) {
            sQLiteDatabase.execSQL(m36873y());
        }
        if (i < 16) {
            sQLiteDatabase.execSQL(m36874z());
            sQLiteDatabase.execSQL(m36803A());
            sQLiteDatabase.execSQL(m36804B());
            sQLiteDatabase.execSQL(m36805C());
        }
        if (i < 17) {
            sQLiteDatabase.execSQL(m36806D());
        }
        if (i < 18) {
            sQLiteDatabase.execSQL("ALTER TABLE activity_feed_item RENAME TO activity_feed_item_old");
            sQLiteDatabase.execSQL("ALTER TABLE activity_feed_item_user_info RENAME TO activity_feed_item_user_info_old");
            sQLiteDatabase.execSQL("ALTER TABLE activity_feed_comment RENAME TO activity_feed_comment_old");
            sQLiteDatabase.execSQL("ALTER TABLE instagram_new_media RENAME TO instagram_new_media_old");
            sQLiteDatabase.execSQL("ALTER TABLE instagram_connect RENAME TO instagram_connect_old");
            sQLiteDatabase.execSQL("ALTER TABLE activity_event_new_match RENAME TO activity_event_new_match_old");
            sQLiteDatabase.execSQL("ALTER TABLE profile_add_photo RENAME TO profile_add_photo_old");
            sQLiteDatabase.execSQL("ALTER TABLE profile_change_anthem RENAME TO profile_change_anthem_old");
            sQLiteDatabase.execSQL("ALTER TABLE profile_spotify_top_artist RENAME TO profile_spotify_top_artist_old");
            sQLiteDatabase.execSQL("ALTER TABLE activity_feed_song RENAME TO activity_feed_song_old");
            sQLiteDatabase.execSQL("ALTER TABLE activity_feed_artist RENAME TO activity_feed_artist_old");
            sQLiteDatabase.execSQL("ALTER TABLE activity_feed_album RENAME TO activity_feed_album_old");
            sQLiteDatabase.execSQL(m36815M());
            sQLiteDatabase.execSQL(m36816N());
            sQLiteDatabase.execSQL(m36817O());
            sQLiteDatabase.execSQL(m36818P());
            sQLiteDatabase.execSQL(m36819Q());
            sQLiteDatabase.execSQL(m36820R());
            sQLiteDatabase.execSQL(m36821S());
            sQLiteDatabase.execSQL(m36822T());
            sQLiteDatabase.execSQL(m36823U());
            sQLiteDatabase.execSQL(m36824V());
            sQLiteDatabase.execSQL(m36825W());
            sQLiteDatabase.execSQL(m36826X());
            sQLiteDatabase.execSQL(m36827Y());
            m36842g(sQLiteDatabase);
            m36844h(sQLiteDatabase);
            m36846i(sQLiteDatabase);
            m36848j(sQLiteDatabase);
            m36850k(sQLiteDatabase);
            m36852l(sQLiteDatabase);
            m36854m(sQLiteDatabase);
            m36856n(sQLiteDatabase);
            m36858o(sQLiteDatabase);
            m36860p(sQLiteDatabase);
            m36862q(sQLiteDatabase);
            m36864r(sQLiteDatabase);
            m36868t(sQLiteDatabase);
            sQLiteDatabase.execSQL("DROP TABLE activity_feed_album_old");
            sQLiteDatabase.execSQL("DROP TABLE activity_feed_artist_old");
            sQLiteDatabase.execSQL("DROP TABLE activity_feed_song_old");
            sQLiteDatabase.execSQL("DROP TABLE instagram_new_media_old");
            sQLiteDatabase.execSQL("DROP TABLE instagram_connect_old");
            sQLiteDatabase.execSQL("DROP TABLE activity_event_new_match_old");
            sQLiteDatabase.execSQL("DROP TABLE profile_add_photo_old");
            sQLiteDatabase.execSQL("DROP TABLE profile_change_anthem_old");
            sQLiteDatabase.execSQL("DROP TABLE profile_spotify_top_artist_old");
            sQLiteDatabase.execSQL("DROP TABLE activity_feed_comment_old");
            sQLiteDatabase.execSQL("DROP TABLE activity_feed_item_user_info_old");
            sQLiteDatabase.execSQL("DROP TABLE activity_feed_item_old");
        }
        if (i < 19) {
            sQLiteDatabase.execSQL(m36828Z());
        }
        if (i < 20) {
            sQLiteDatabase.execSQL("ALTER TABLE activity_feed_item ADD COLUMN activity_id TEXT");
        }
        if (i < 21) {
            sQLiteDatabase.execSQL("ALTER TABLE sponsored_match_creative_values ADD COLUMN photos BLOB");
        }
        if (i < 22) {
            sQLiteDatabase.execSQL(m36807E());
        }
        if (i < 23) {
            sQLiteDatabase.execSQL("ALTER TABLE `match` ADD COLUMN type TEXT NOT NULL DEFAULT 'CORE'");
            sQLiteDatabase.execSQL("UPDATE `match` SET type='SPONSORED_AD' WHERE id IN (SELECT m_id FROM match_view WHERE template_id IS NOT NULL)");
        }
        if (i < 24) {
            sQLiteDatabase.execSQL(m36808F());
            sQLiteDatabase.execSQL(m36809G());
        }
        if (i < 25) {
            sQLiteDatabase.execSQL(m36810H());
        }
        if (i < 26) {
            sQLiteDatabase.execSQL(m36811I());
        }
        if (i < 27) {
            sQLiteDatabase.execSQL(m36812J());
        }
        if (i < 28) {
            sQLiteDatabase.execSQL(m36813K());
        }
        if (i < 29) {
            sQLiteDatabase.execSQL(m36814L());
        }
        if (i < 30) {
            m36866s(sQLiteDatabase);
            sQLiteDatabase.execSQL(aa());
        }
    }

    /* renamed from: a */
    private final List<String> m36829a() {
        return C19301m.b(new String[]{"CREATE TABLE `match` (\n    id TEXT NOT NULL PRIMARY KEY,\n    creation_date INTEGER NOT NULL,\n    last_activity_date INTEGER NOT NULL,\n    attribution TEXT NOT NULL,\n    is_muted INTEGER NOT NULL,\n    is_touched INTEGER NOT NULL DEFAULT 0,\n    person_id TEXT,\n    my_group_id TEXT,\n    their_group_id TEXT,\n    is_blocked INTEGER NOT NULL DEFAULT 0,\n    type TEXT NOT NULL DEFAULT 'CORE',\n    FOREIGN KEY (person_id) REFERENCES match_person(id),\n    FOREIGN KEY (my_group_id) REFERENCES match_group(id),\n    FOREIGN KEY (their_group_id) REFERENCES match_group(id)\n)", "CREATE TABLE match_group (\n    id TEXT NOT NULL PRIMARY KEY\n)", "CREATE TABLE match_group_member (\n    group_id TEXT NOT NULL,\n    person_id TEXT NOT NULL,\n    is_owner INTEGER NOT NULL DEFAULT 0,\n    sort_order INTEGER NOT NULL,\n    PRIMARY KEY(group_id, person_id),\n    FOREIGN KEY(group_id) REFERENCES match_group(id) ON DELETE CASCADE,\n    FOREIGN KEY (person_id) REFERENCES match_person(id) ON DELETE CASCADE\n)", "CREATE TABLE match_person (\n    id TEXT NOT NULL PRIMARY KEY,\n    name TEXT NOT NULL,\n    bio TEXT,\n    birth_date INTEGER,\n    gender BLOB NOT NULL,\n    photos BLOB NOT NULL,\n    badges BLOB NOT NULL,\n    jobs BLOB NOT NULL,\n    schools BLOB NOT NULL\n)", "CREATE TABLE message (\n    client_sequential_id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    id TEXT NOT NULL UNIQUE,\n    match_id TEXT NOT NULL,\n    to_id TEXT NOT NULL,\n    from_id TEXT NOT NULL,\n    text TEXT NOT NULL,\n    sent_date INTEGER NOT NULL,\n    is_liked INTEGER NOT NULL DEFAULT 0,\n    type TEXT NOT NULL,\n    delivery_status TEXT NOT NULL,\n    is_seen INTEGER NOT NULL DEFAULT 0,\n    FOREIGN KEY (match_id) REFERENCES `match`(id) ON DELETE CASCADE\n)", "CREATE TABLE gif (\n  _id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n  gif_id TEXT NOT NULL,\n  message_id TEXT NOT NULL,\n  url TEXT NOT NULL,\n  width INTEGER NOT NULL,\n  height INTEGER NOT NULL,\n  fixed_height_url TEXT NOT NULL,\n  fixed_height_width INTEGER NOT NULL,\n  fixed_height_height INTEGER NOT NULL,\n  FOREIGN KEY (message_id) REFERENCES message(id) ON DELETE CASCADE ON UPDATE CASCADE\n)", "CREATE TABLE sponsored_match_creative_values (\n  template_id TEXT NOT NULL PRIMARY KEY,\n  match_id TEXT NOT NULL,\n  title TEXT NOT NULL,\n  logo_url TEXT NOT NULL,\n  body TEXT NOT NULL,\n  clickthrough_url TEXT NOT NULL,\n  clickthrough_text TEXT NOT NULL,\n  end_date INTEGER NOT NULL,\n  photos BLOB,\n  FOREIGN KEY (match_id) REFERENCES `match`(id) ON DELETE CASCADE\n)", "CREATE TABLE tracking_url (\n  template_id TEXT NOT NULL,\n  url TEXT NOT NULL,\n  event TEXT NOT NULL,\n  is_unique INTEGER NOT NULL,\n  ping_time INTEGER,\n  line_item_id TEXT,\n  FOREIGN KEY (template_id) REFERENCES sponsored_match_creative_values(template_id) ON DELETE CASCADE\n)", "CREATE TABLE reaction (\n    _id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    reaction_id TEXT NOT NULL,\n    message_id TEXT NOT NULL,\n    FOREIGN KEY (message_id) REFERENCES message(id) ON DELETE CASCADE ON UPDATE CASCADE\n)", "CREATE TABLE strike_reaction (\n  match_id TEXT NOT NULL PRIMARY KEY,\n  strike_id TEXT NOT NULL,\n  FOREIGN KEY (match_id) REFERENCES `match`(id) ON DELETE CASCADE\n)", "CREATE TABLE activity_feed_item(\n  id TEXT PRIMARY KEY NOT NULL,\n  match_id TEXT NOT NULL,\n  activity_event_type TEXT NOT NULL,\n  activity_id TEXT,\n  FOREIGN KEY(match_id) REFERENCES `match`(id) ON DELETE CASCADE\n)", "CREATE TABLE activity_feed_item_user_info(\n  _id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n  activity_feed_item_id TEXT NOT NULL,\n  user_id TEXT NOT NULL,\n  FOREIGN KEY(activity_feed_item_id) REFERENCES activity_feed_item(id) ON DELETE CASCADE\n)", "CREATE TABLE activity_feed_comment(\n  _id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n  activity_feed_item_id TEXT NOT NULL,\n  created_at INTEGER NOT NULL,\n  message TEXT NOT NULL,\n  metadata_carousel_item_id TEXT NOT NULL,\n  FOREIGN KEY(activity_feed_item_id) REFERENCES activity_feed_item(id) ON DELETE CASCADE\n)", "CREATE TABLE instagram_new_media(\n  _id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n  activity_feed_item_id TEXT NOT NULL,\n  instagram_media_id TEXT NOT NULL,\n  instagram_user_name TEXT NOT NULL,\n  user_number INTEGER NOT NULL,\n  instagram_user_id INTEGER NOT NULL,\n  timestamp INTEGER NOT NULL,\n  caption TEXT NOT NULL,\n  media BLOB,\n  FOREIGN KEY (activity_feed_item_id) REFERENCES activity_feed_item(id) ON DELETE CASCADE\n)", "CREATE TABLE activity_event_new_match(\n  _id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n  activity_feed_item_id TEXT NOT NULL,\n  user_number INTEGER NOT NULL,\n  other_user_number INTEGER NOT NULL,\n  timestamp INTEGER NOT NULL,\n  FOREIGN KEY (activity_feed_item_id) REFERENCES activity_feed_item(id) ON DELETE CASCADE\n)", "CREATE TABLE instagram_connect(\n  _id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n  activity_feed_item_id TEXT NOT NULL,\n  user_number INTEGER NOT NULL,\n  timestamp INTEGER NOT NULL,\n  instagram_user_name TEXT NOT NULL,\n  photos BLOB,\n  FOREIGN KEY (activity_feed_item_id) REFERENCES activity_feed_item(id) ON DELETE CASCADE\n)", "CREATE TABLE profile_add_photo(\n  _id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n  activity_feed_item_id TEXT NOT NULL,\n  user_number INTEGER NOT NULL,\n  timestamp INTEGER NOT NULL,\n  photos BLOB,\n  FOREIGN KEY (activity_feed_item_id) REFERENCES activity_feed_item(id) ON DELETE CASCADE\n)", "CREATE TABLE profile_spotify_top_artist(\n  _id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n  activity_feed_item_id TEXT NOT NULL,\n  user_number INTEGER NOT NULL,\n  timestamp INTEGER NOT NULL,\n  FOREIGN KEY (activity_feed_item_id) REFERENCES activity_feed_item(id) ON DELETE CASCADE\n)", "CREATE TABLE activity_feed_song(\n  id TEXT NOT NULL,\n  activity_feed_item_id TEXT NOT NULL,\n  name TEXT NOT NULL,\n  url TEXT NOT NULL,\n  PRIMARY KEY (id, activity_feed_item_id),\n  FOREIGN KEY (activity_feed_item_id) REFERENCES activity_feed_item(id) ON DELETE CASCADE\n)", "CREATE TABLE activity_feed_album(\n  activity_feed_item_id TEXT NOT NULL,\n  activity_feed_song_id TEXT NOT NULL,\n  name TEXT NOT NULL,\n  images BLOB,\n  PRIMARY KEY (activity_feed_item_id, activity_feed_song_id),\n  FOREIGN KEY (activity_feed_item_id, activity_feed_song_id)\n    REFERENCES activity_feed_song(activity_feed_item_id, id) ON DELETE CASCADE\n)", "CREATE TABLE activity_feed_artist(\n  id TEXT NOT NULL,\n  activity_feed_item_id TEXT NOT NULL,\n  activity_feed_song_id TEXT NOT NULL,\n  name TEXT NOT NULL,\n  images BLOB,\n  PRIMARY KEY (activity_feed_item_id, activity_feed_song_id, id),\n  FOREIGN KEY (activity_feed_item_id, activity_feed_song_id)\n    REFERENCES activity_feed_song(activity_feed_item_id, id) ON DELETE CASCADE\n)", "CREATE TABLE profile_change_anthem(\n  _id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n  activity_feed_item_id TEXT NOT NULL,\n  user_number INTEGER NOT NULL,\n  timestamp INTEGER NOT NULL,\n  FOREIGN KEY (activity_feed_item_id) REFERENCES activity_feed_item(id) ON DELETE CASCADE\n)", "CREATE TABLE message_activity_feed_item(\n  message_id TEXT NOT NULL,\n  activity_feed_item_id TEXT NOT NULL,\n  PRIMARY KEY(message_id, activity_feed_item_id),\n  FOREIGN KEY(message_id) REFERENCES message(id) ON DELETE CASCADE,\n  FOREIGN KEY(activity_feed_item_id) REFERENCES activity_feed_item(id) ON DELETE CASCADE\n)", "CREATE TABLE top_pick_teaser(\n  id TEXT NOT NULL PRIMARY KEY,\n  expiration_time INTEGER NOT NULL,\n  photo_url TEXT NOT NULL,\n  tags BLOB\n)", "CREATE TABLE profile_add_loop(\n  _id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n  activity_feed_item_id TEXT NOT NULL,\n  user_number INTEGER NOT NULL,\n  timestamp INTEGER NOT NULL,\n  loops BLOB,\n  FOREIGN KEY (activity_feed_item_id) REFERENCES activity_feed_item(id) ON DELETE CASCADE\n)", "CREATE TABLE match_place(\n    match_id TEXT NOT NULL,\n    place_id TEXT NOT NULL,\n    PRIMARY KEY (match_id, place_id),\n    FOREIGN KEY (match_id) REFERENCES `match`(id) ON DELETE CASCADE ON UPDATE CASCADE,\n    FOREIGN KEY (place_id) REFERENCES place(id) ON UPDATE CASCADE\n)", "CREATE TABLE place(\n    id TEXT NOT NULL PRIMARY KEY,\n    name TEXT NOT NULL\n)", "CREATE TABLE profile_change_bio(\n  _id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n  activity_feed_item_id TEXT NOT NULL,\n  user_number INTEGER NOT NULL,\n  timestamp INTEGER NOT NULL,\n  bio TEXT NOT NULL,\n  old_bio TEXT NOT NULL,\n  FOREIGN KEY (activity_feed_item_id) REFERENCES activity_feed_item(id) ON DELETE CASCADE\n)", "CREATE TABLE profile_change_work(\n  _id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n  activity_feed_item_id TEXT NOT NULL,\n  user_number INTEGER NOT NULL,\n  timestamp INTEGER NOT NULL,\n  works BLOB,\n  FOREIGN KEY (activity_feed_item_id) REFERENCES activity_feed_item(id) ON DELETE CASCADE\n)", "CREATE TABLE profile_change_school(\n  _id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n  activity_feed_item_id TEXT NOT NULL,\n  user_number INTEGER NOT NULL,\n  timestamp INTEGER NOT NULL,\n  schools BLOB,\n  FOREIGN KEY (activity_feed_item_id) REFERENCES activity_feed_item(id) ON DELETE CASCADE\n)", "CREATE TABLE message_image (\n  message_id TEXT PRIMARY KEY NOT NULL,\n  source TEXT NOT NULL,\n  url TEXT NOT NULL,\n  width INTEGER NOT NULL,\n  height INTEGER NOT NULL,\n  FOREIGN KEY (message_id) REFERENCES message(id) ON DELETE CASCADE ON UPDATE CASCADE\n)"});
    }

    /* renamed from: b */
    private final List<String> m36831b() {
        return C19301m.b(new String[]{"CREATE INDEX IF NOT EXISTS idx_last_activity_date\nON `match`(last_activity_date)", "CREATE INDEX idx_match_id_sent_date\nON message (match_id, sent_date)"});
    }

    /* renamed from: c */
    private final List<String> m36833c() {
        return C19301m.b(new String[]{"CREATE VIEW group_view AS\nSELECT match_group.id AS g_id, * FROM match_group\nJOIN match_group_member GM ON match_group.id = GM.group_id\nJOIN match_person ON GM.person_id = match_person.id\nORDER BY GM.sort_order ASC", "CREATE VIEW match_view AS\nSELECT M.id as m_id, M.*, P.*, CV.*\nFROM `match` M\nLEFT JOIN match_person P ON M.person_id = P.id\nLEFT JOIN sponsored_match_creative_values CV ON M.id = CV.match_id", "CREATE VIEW message_view AS\nSELECT message.*, gif.*, reaction.*\nFROM message\nLEFT JOIN gif ON message.id = gif.message_id\nLEFT JOIN reaction ON message.id = reaction.message_id"});
    }

    /* renamed from: d */
    private final List<String> m36835d() {
        return C19301m.a();
    }

    /* renamed from: a */
    private final void m36830a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("INSERT INTO message (id, match_id, to_id, from_id, text, sent_date, is_liked, type, delivery_status) SELECT id, match_id, to_id, from_id, text, sent_date, is_liked, type, delivery_status FROM message_old");
    }

    /* renamed from: b */
    private final void m36832b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("INSERT INTO gif (_id, gif_id, message_id, url, width, height, fixed_height_url, fixed_height_width, fixed_height_height) SELECT _id, gif_id, message_id, url, width, height, fixed_height_url, fixed_height_width, fixed_height_height FROM gif_old");
    }

    /* renamed from: c */
    private final void m36834c(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("INSERT INTO reaction (_id, reaction_id, message_id) SELECT _id, reaction_id, message_id FROM reaction_old");
    }

    /* renamed from: d */
    private final void m36836d(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("INSERT INTO message (id, match_id, to_id, from_id, text, sent_date, is_liked, type, delivery_status, is_seen) SELECT id, match_id, to_id, from_id, text, sent_date, is_liked, type, delivery_status, is_seen FROM message_old");
    }

    /* renamed from: e */
    private final void m36838e(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("INSERT INTO gif (_id, gif_id, message_id, url, width, height, fixed_height_url, fixed_height_width, fixed_height_height) SELECT _id, gif_id, message_id, url, width, height, fixed_height_url, fixed_height_width, fixed_height_height FROM gif_old");
    }

    /* renamed from: f */
    private final void m36840f(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("INSERT INTO reaction (_id, reaction_id, message_id) SELECT _id, reaction_id, message_id FROM reaction_old");
    }

    /* renamed from: g */
    private final void m36842g(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("INSERT INTO activity_feed_item (id, match_id, activity_event_type) SELECT id, match_id, activity_event_type FROM activity_feed_item_old");
    }

    /* renamed from: h */
    private final void m36844h(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("INSERT INTO activity_feed_item_user_info (_id, activity_feed_item_id, user_id) SELECT _id, activity_feed_item_id, user_id FROM activity_feed_item_user_info_old");
    }

    /* renamed from: i */
    private final void m36846i(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("INSERT INTO activity_feed_comment (_id, activity_feed_item_id, created_at, message, metadata_carousel_item_id) SELECT _id, activity_feed_item_id, created_at, message, metadata_carousel_item_id FROM activity_feed_comment_old");
    }

    /* renamed from: j */
    private final void m36848j(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("INSERT INTO instagram_new_media (_id, activity_feed_item_id, instagram_media_id, instagram_user_name, user_number, instagram_user_id, timestamp, caption, media) SELECT _id, activity_feed_item_id, instagram_media_id, instagram_user_name, user_number, instagram_user_id, timestamp, caption, media FROM instagram_new_media_old");
    }

    /* renamed from: k */
    private final void m36850k(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("INSERT INTO instagram_connect (_id, activity_feed_item_id, user_number, timestamp, instagram_user_name, photos) SELECT _id, activity_feed_item_id, user_number, timestamp, instagram_user_name, photos FROM instagram_connect_old");
    }

    /* renamed from: l */
    private final void m36852l(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("INSERT INTO activity_event_new_match (_id, activity_feed_item_id, user_number, other_user_number, timestamp) SELECT _id, activity_feed_item_id, user_number, other_user_number, timestamp FROM activity_event_new_match_old");
    }

    /* renamed from: m */
    private final void m36854m(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("INSERT INTO profile_add_photo (_id, activity_feed_item_id, user_number, timestamp, photos) SELECT _id, activity_feed_item_id, user_number, timestamp, photos FROM profile_add_photo_old");
    }

    /* renamed from: n */
    private final void m36856n(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("INSERT INTO profile_change_anthem (_id, activity_feed_item_id, user_number, timestamp) SELECT _id, activity_feed_item_id, user_number, timestamp FROM profile_change_anthem_old");
    }

    /* renamed from: o */
    private final void m36858o(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("INSERT INTO profile_spotify_top_artist (_id, activity_feed_item_id, user_number, timestamp) SELECT _id, activity_feed_item_id, user_number, timestamp FROM profile_spotify_top_artist_old");
    }

    /* renamed from: p */
    private final void m36860p(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("INSERT INTO activity_feed_song (id, activity_feed_item_id, name, url) SELECT id, activity_feed_item_id, name, url FROM activity_feed_song_old");
    }

    /* renamed from: q */
    private final void m36862q(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("INSERT INTO activity_feed_artist (id, activity_feed_item_id, activity_feed_song_id, name, images) SELECT id, activity_feed_item_id, activity_feed_song_id, name, images FROM activity_feed_artist_old");
    }

    /* renamed from: r */
    private final void m36864r(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("INSERT INTO activity_feed_album (activity_feed_item_id, activity_feed_song_id, name, images) SELECT activity_feed_item_id, activity_feed_song_id, name, images FROM activity_feed_album_old");
    }

    /* renamed from: s */
    private final void m36866s(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE top_pick_teaser;");
    }

    /* renamed from: t */
    private final void m36868t(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("INSERT INTO message_activity_feed_item (message_id, activity_feed_item_id) SELECT message_id, id FROM activity_feed_item_old");
    }
}
