package com.tinder.data.model;

import android.database.sqlite.SQLiteDatabase;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.squareup.sqldelight.C6123b.C7265b;
import com.squareup.sqldelight.C6123b.C7266c;
import com.squareup.sqldelight.ColumnAdapter;
import com.tinder.domain.common.model.Badge;
import com.tinder.domain.common.model.Gender;
import com.tinder.domain.common.model.Job;
import com.tinder.domain.common.model.Photo;
import com.tinder.domain.common.model.School;
import java.util.List;
import org.joda.time.DateTime;

public interface MatchPersonModel {

    public interface Creator<T extends MatchPersonModel> {
        T create(@NonNull String str, @NonNull String str2, @Nullable String str3, @Nullable DateTime dateTime, @NonNull Gender gender, @NonNull List<Photo> list, @NonNull List<Badge> list2, @NonNull List<Job> list3, @NonNull List<School> list4);
    }

    /* renamed from: com.tinder.data.model.MatchPersonModel$a */
    public static final class C8707a<T extends MatchPersonModel> {
        /* renamed from: a */
        public final Creator<T> f30663a;
        /* renamed from: b */
        public final ColumnAdapter<DateTime, Long> f30664b;
        /* renamed from: c */
        public final ColumnAdapter<Gender, byte[]> f30665c;
        /* renamed from: d */
        public final ColumnAdapter<List<Photo>, byte[]> f30666d;
        /* renamed from: e */
        public final ColumnAdapter<List<Badge>, byte[]> f30667e;
        /* renamed from: f */
        public final ColumnAdapter<List<Job>, byte[]> f30668f;
        /* renamed from: g */
        public final ColumnAdapter<List<School>, byte[]> f30669g;

        public C8707a(Creator<T> creator, ColumnAdapter<DateTime, Long> columnAdapter, ColumnAdapter<Gender, byte[]> columnAdapter2, ColumnAdapter<List<Photo>, byte[]> columnAdapter3, ColumnAdapter<List<Badge>, byte[]> columnAdapter4, ColumnAdapter<List<Job>, byte[]> columnAdapter5, ColumnAdapter<List<School>, byte[]> columnAdapter6) {
            this.f30663a = creator;
            this.f30664b = columnAdapter;
            this.f30665c = columnAdapter2;
            this.f30666d = columnAdapter3;
            this.f30667e = columnAdapter4;
            this.f30668f = columnAdapter5;
            this.f30669g = columnAdapter6;
        }
    }

    /* renamed from: com.tinder.data.model.MatchPersonModel$b */
    public static final class C12998b extends C7265b {
        /* renamed from: c */
        private final C8707a<? extends MatchPersonModel> f41572c;

        public C12998b(SQLiteDatabase sQLiteDatabase, C8707a<? extends MatchPersonModel> c8707a) {
            super("match_person", sQLiteDatabase.compileStatement("INSERT INTO match_person (id, name, bio, birth_date, gender, photos, badges,\njobs, schools)\nVALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)"));
            this.f41572c = c8707a;
        }

        /* renamed from: a */
        public void m50751a(@NonNull String str, @NonNull String str2, @Nullable String str3, @Nullable DateTime dateTime, @NonNull Gender gender, @NonNull List<Photo> list, @NonNull List<Badge> list2, @NonNull List<Job> list3, @NonNull List<School> list4) {
            this.b.bindString(1, str);
            this.b.bindString(2, str2);
            if (str3 == null) {
                this.b.bindNull(3);
            } else {
                this.b.bindString(3, str3);
            }
            if (dateTime == null) {
                this.b.bindNull(4);
            } else {
                this.b.bindLong(4, ((Long) this.f41572c.f30664b.encode(dateTime)).longValue());
            }
            this.b.bindBlob(5, (byte[]) this.f41572c.f30665c.encode(gender));
            this.b.bindBlob(6, (byte[]) this.f41572c.f30666d.encode(list));
            this.b.bindBlob(7, (byte[]) this.f41572c.f30667e.encode(list2));
            this.b.bindBlob(8, (byte[]) this.f41572c.f30668f.encode(list3));
            this.b.bindBlob(9, (byte[]) this.f41572c.f30669g.encode(list4));
        }
    }

    /* renamed from: com.tinder.data.model.MatchPersonModel$c */
    public static final class C12999c extends C7266c {
        /* renamed from: c */
        private final C8707a<? extends MatchPersonModel> f41573c;

        public C12999c(SQLiteDatabase sQLiteDatabase, C8707a<? extends MatchPersonModel> c8707a) {
            super("match_person", sQLiteDatabase.compileStatement("UPDATE match_person SET name = ?, bio = ?, birth_date = ?, gender = ?, photos = ?,\nbadges = ?, jobs = ?, schools = ? WHERE id = ?"));
            this.f41573c = c8707a;
        }

        /* renamed from: a */
        public void m50752a(@NonNull String str, @Nullable String str2, @Nullable DateTime dateTime, @NonNull Gender gender, @NonNull List<Photo> list, @NonNull List<Badge> list2, @NonNull List<Job> list3, @NonNull List<School> list4, @NonNull String str3) {
            this.b.bindString(1, str);
            if (str2 == null) {
                this.b.bindNull(2);
            } else {
                this.b.bindString(2, str2);
            }
            if (dateTime == null) {
                this.b.bindNull(3);
            } else {
                this.b.bindLong(3, ((Long) this.f41573c.f30664b.encode(dateTime)).longValue());
            }
            this.b.bindBlob(4, (byte[]) this.f41573c.f30665c.encode(gender));
            this.b.bindBlob(5, (byte[]) this.f41573c.f30666d.encode(list));
            this.b.bindBlob(6, (byte[]) this.f41573c.f30667e.encode(list2));
            this.b.bindBlob(7, (byte[]) this.f41573c.f30668f.encode(list3));
            this.b.bindBlob(8, (byte[]) this.f41573c.f30669g.encode(list4));
            this.b.bindString(9, str3);
        }
    }

    @NonNull
    List<Badge> badges();

    @Nullable
    String bio();

    @Nullable
    DateTime birth_date();

    @NonNull
    Gender gender();

    @NonNull
    String id();

    @NonNull
    List<Job> jobs();

    @NonNull
    String name();

    @NonNull
    List<Photo> photos();

    @NonNull
    List<School> schools();
}
