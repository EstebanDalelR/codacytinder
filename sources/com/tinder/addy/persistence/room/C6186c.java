package com.tinder.addy.persistence.room;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\bR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\n\"\u0004\b\u0015\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/tinder/addy/persistence/room/RoomPing;", "", "adId", "", "url", "pingTimeMs", "", "id", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;)V", "getAdId", "()Ljava/lang/String;", "setAdId", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getPingTimeMs", "()J", "setPingTimeMs", "(J)V", "getUrl", "setUrl", "addy_release"}, k = 1, mv = {1, 1, 10})
@Entity(tableName = "ping")
/* renamed from: com.tinder.addy.persistence.room.c */
public final class C6186c {
    @NotNull
    @ColumnInfo
    /* renamed from: a */
    private String f22733a;
    @NotNull
    @ColumnInfo
    /* renamed from: b */
    private String f22734b;
    @ColumnInfo
    /* renamed from: c */
    private long f22735c;
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "ping_id")
    @Nullable
    /* renamed from: d */
    private final Long f22736d;

    public C6186c(@NotNull String str, @NotNull String str2, long j, @Nullable Long l) {
        C2668g.b(str, "adId");
        C2668g.b(str2, "url");
        this.f22733a = str;
        this.f22734b = str2;
        this.f22735c = j;
        this.f22736d = l;
    }

    @NotNull
    /* renamed from: a */
    public final String m26791a() {
        return this.f22733a;
    }

    @NotNull
    /* renamed from: b */
    public final String m26792b() {
        return this.f22734b;
    }

    /* renamed from: c */
    public final long m26793c() {
        return this.f22735c;
    }

    public /* synthetic */ C6186c(String str, String str2, long j, Long l, int i, C15823e c15823e) {
        if ((i & 8) != 0) {
            l = null;
        }
        this(str, str2, j, l);
    }

    @Nullable
    /* renamed from: d */
    public final Long m26794d() {
        return this.f22736d;
    }
}
