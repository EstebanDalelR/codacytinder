package com.tinder.addy.persistence.room;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Dao
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H'J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH'¨\u0006\u000b"}, d2 = {"Lcom/tinder/addy/persistence/room/TrackingUrlDao;", "", "insertAll", "", "trackingUrls", "", "Lcom/tinder/addy/persistence/room/RoomTrackingUrl;", "loadTrackingUrlsByAdAndEvent", "adId", "", "eventTypeToken", "addy_release"}, k = 1, mv = {1, 1, 10})
public interface TrackingUrlDao {
    @Insert(onConflict = 1)
    void insertAll(@NotNull List<C6187d> list);

    @Query("SELECT * FROM tracking_url WHERE adId = :adId AND eventTypeToken = :eventTypeToken")
    @NotNull
    List<C6187d> loadTrackingUrlsByAdAndEvent(@NotNull String str, @NotNull String str2);
}
