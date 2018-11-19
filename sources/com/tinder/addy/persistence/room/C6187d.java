package com.tinder.addy.persistence.room;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/tinder/addy/persistence/room/RoomTrackingUrl;", "", "adId", "", "url", "key", "eventTypeToken", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAdId", "()Ljava/lang/String;", "setAdId", "(Ljava/lang/String;)V", "getEventTypeToken", "setEventTypeToken", "getKey", "setKey", "getUrl", "setUrl", "addy_release"}, k = 1, mv = {1, 1, 10})
@Entity(primaryKeys = {"adId", "key"}, tableName = "tracking_url")
/* renamed from: com.tinder.addy.persistence.room.d */
public final class C6187d {
    @NotNull
    @ColumnInfo
    /* renamed from: a */
    private String f22737a;
    @NotNull
    @ColumnInfo
    /* renamed from: b */
    private String f22738b;
    @NotNull
    @ColumnInfo
    /* renamed from: c */
    private String f22739c;
    @NotNull
    @ColumnInfo
    /* renamed from: d */
    private String f22740d;

    public C6187d(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        C2668g.b(str, "adId");
        C2668g.b(str2, "url");
        C2668g.b(str3, "key");
        C2668g.b(str4, "eventTypeToken");
        this.f22737a = str;
        this.f22738b = str2;
        this.f22739c = str3;
        this.f22740d = str4;
    }

    @NotNull
    /* renamed from: a */
    public final String m26795a() {
        return this.f22737a;
    }

    @NotNull
    /* renamed from: b */
    public final String m26796b() {
        return this.f22738b;
    }

    @NotNull
    /* renamed from: c */
    public final String m26797c() {
        return this.f22739c;
    }

    @NotNull
    /* renamed from: d */
    public final String m26798d() {
        return this.f22740d;
    }
}
