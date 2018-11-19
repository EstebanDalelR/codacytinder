package com.tinder.data.model;

import android.database.sqlite.SQLiteDatabase;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.squareup.sqldelight.C6123b.C7265b;
import com.squareup.sqldelight.ColumnAdapter;
import com.tinder.domain.common.model.Photo;
import java.util.List;
import org.joda.time.DateTime;

public interface SponsoredMatchCreativeValuesModel {

    public interface Creator<T extends SponsoredMatchCreativeValuesModel> {
        T create(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, @NonNull String str5, @NonNull String str6, @NonNull String str7, @NonNull DateTime dateTime, @Nullable List<Photo> list);
    }

    /* renamed from: com.tinder.data.model.SponsoredMatchCreativeValuesModel$a */
    public static final class C8713a<T extends SponsoredMatchCreativeValuesModel> {
        /* renamed from: a */
        public final Creator<T> f30678a;
        /* renamed from: b */
        public final ColumnAdapter<DateTime, Long> f30679b;
        /* renamed from: c */
        public final ColumnAdapter<List<Photo>, byte[]> f30680c;

        public C8713a(Creator<T> creator, ColumnAdapter<DateTime, Long> columnAdapter, ColumnAdapter<List<Photo>, byte[]> columnAdapter2) {
            this.f30678a = creator;
            this.f30679b = columnAdapter;
            this.f30680c = columnAdapter2;
        }
    }

    /* renamed from: com.tinder.data.model.SponsoredMatchCreativeValuesModel$b */
    public static final class C13016b extends C7265b {
        /* renamed from: c */
        private final C8713a<? extends SponsoredMatchCreativeValuesModel> f41577c;

        public C13016b(SQLiteDatabase sQLiteDatabase, C8713a<? extends SponsoredMatchCreativeValuesModel> c8713a) {
            super("sponsored_match_creative_values", sQLiteDatabase.compileStatement("INSERT INTO sponsored_match_creative_values(template_id, match_id, title, logo_url, body, clickthrough_url, clickthrough_text, end_date, photos)\nVALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)"));
            this.f41577c = c8713a;
        }

        /* renamed from: a */
        public void m50768a(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, @NonNull String str5, @NonNull String str6, @NonNull String str7, @NonNull DateTime dateTime, @Nullable List<Photo> list) {
            this.b.bindString(1, str);
            this.b.bindString(2, str2);
            this.b.bindString(3, str3);
            this.b.bindString(4, str4);
            this.b.bindString(5, str5);
            this.b.bindString(6, str6);
            this.b.bindString(7, str7);
            this.b.bindLong(8, ((Long) this.f41577c.f30679b.encode(dateTime)).longValue());
            if (list == null) {
                this.b.bindNull(9);
            } else {
                this.b.bindBlob(9, (byte[]) this.f41577c.f30680c.encode(list));
            }
        }
    }

    @NonNull
    String body();

    @NonNull
    String clickthrough_text();

    @NonNull
    String clickthrough_url();

    @NonNull
    DateTime end_date();

    @NonNull
    String logo_url();

    @NonNull
    String match_id();

    @Nullable
    List<Photo> photos();

    @NonNull
    String template_id();

    @NonNull
    String title();
}
