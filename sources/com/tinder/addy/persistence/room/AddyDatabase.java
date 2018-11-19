package com.tinder.addy.persistence.room;

import android.arch.persistence.room.C0091e;
import android.arch.persistence.room.Database;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/tinder/addy/persistence/room/AddyDatabase;", "Landroid/arch/persistence/room/RoomDatabase;", "()V", "pingDao", "Lcom/tinder/addy/persistence/room/PingDao;", "trackingUrlDao", "Lcom/tinder/addy/persistence/room/TrackingUrlDao;", "addy_release"}, k = 1, mv = {1, 1, 10})
@Database(entities = {C6187d.class, C6186c.class}, exportSchema = false, version = 3)
public abstract class AddyDatabase extends C0091e {
    @NotNull
    /* renamed from: j */
    public abstract PingDao mo7415j();

    @NotNull
    /* renamed from: k */
    public abstract TrackingUrlDao mo7416k();
}
