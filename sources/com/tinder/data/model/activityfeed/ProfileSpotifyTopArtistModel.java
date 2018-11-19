package com.tinder.data.model.activityfeed;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.annotation.NonNull;
import com.squareup.sqldelight.C6123b.C7265b;
import com.squareup.sqldelight.C6124c;
import com.squareup.sqldelight.RowMapper;
import com.tinder.api.ManagerWebServices;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public interface ProfileSpotifyTopArtistModel {

    public interface Creator<T extends ProfileSpotifyTopArtistModel> {
        T create(long j, @NonNull String str, long j2, long j3);
    }

    public interface Select_profile_spotify_top_artistCreator<T extends Select_profile_spotify_top_artistModel> {
        T create(long j, long j2);
    }

    public interface Select_profile_spotify_top_artistModel {
        long timestamp();

        long user_number();
    }

    /* renamed from: com.tinder.data.model.activityfeed.ProfileSpotifyTopArtistModel$a */
    public static final class C8733a<T extends ProfileSpotifyTopArtistModel> {
        /* renamed from: a */
        public final Creator<T> f30712a;

        public C8733a(Creator<T> creator) {
            this.f30712a = creator;
        }

        /* renamed from: a */
        public C6124c m37231a(@NonNull String str) {
            List arrayList = new ArrayList();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SELECT user_number, timestamp\nFROM profile_spotify_top_artist\nWHERE activity_feed_item_id = ");
            stringBuilder.append(ManagerWebServices.QUERY_QUESTION_MARK);
            stringBuilder.append(1);
            arrayList.add(str);
            return new C6124c(stringBuilder.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]), Collections.singleton("profile_spotify_top_artist"));
        }

        /* renamed from: a */
        public <R extends Select_profile_spotify_top_artistModel> C10883c<R> m37232a(Select_profile_spotify_top_artistCreator<R> select_profile_spotify_top_artistCreator) {
            return new C10883c(select_profile_spotify_top_artistCreator);
        }
    }

    /* renamed from: com.tinder.data.model.activityfeed.ProfileSpotifyTopArtistModel$c */
    public static final class C10883c<T extends Select_profile_spotify_top_artistModel> implements RowMapper<T> {
        /* renamed from: a */
        private final Select_profile_spotify_top_artistCreator<T> f35546a;

        @NonNull
        public /* synthetic */ Object map(@NonNull Cursor cursor) {
            return m43387a(cursor);
        }

        public C10883c(Select_profile_spotify_top_artistCreator<T> select_profile_spotify_top_artistCreator) {
            this.f35546a = select_profile_spotify_top_artistCreator;
        }

        @NonNull
        /* renamed from: a */
        public T m43387a(@NonNull Cursor cursor) {
            return this.f35546a.create(cursor.getLong(0), cursor.getLong(1));
        }
    }

    /* renamed from: com.tinder.data.model.activityfeed.ProfileSpotifyTopArtistModel$b */
    public static final class C13040b extends C7265b {
        public C13040b(SQLiteDatabase sQLiteDatabase) {
            super("profile_spotify_top_artist", sQLiteDatabase.compileStatement("INSERT INTO profile_spotify_top_artist (activity_feed_item_id, user_number, timestamp)\nVALUES (?, ?, ?)"));
        }

        /* renamed from: a */
        public void m50792a(@NonNull String str, long j, long j2) {
            this.b.bindString(1, str);
            this.b.bindLong(2, j);
            this.b.bindLong(3, j2);
        }
    }

    long _id();

    @NonNull
    String activity_feed_item_id();

    long timestamp();

    long user_number();
}
