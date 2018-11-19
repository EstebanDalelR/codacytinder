package com.tinder.addy.persistence.room;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Dao
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J/\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH'¢\u0006\u0002\u0010\fJ\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH'¨\u0006\u0010"}, d2 = {"Lcom/tinder/addy/persistence/room/PingDao;", "", "insert", "", "roomPing", "Lcom/tinder/addy/persistence/room/RoomPing;", "loadLastPingForTrackingUrls", "", "adIds", "", "", "urls", "([Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;", "loadPingsForTrackingUrl", "adId", "url", "addy_release"}, k = 1, mv = {1, 1, 10})
public interface PingDao {
    @Insert
    void insert(@NotNull C6186c c6186c);

    @Query("SELECT DISTINCT * FROM ping WHERE adId IN(:adIds) AND url IN(:urls)")
    @NotNull
    List<C6186c> loadLastPingForTrackingUrls(@NotNull String[] strArr, @NotNull String[] strArr2);

    @Query("SELECT * FROM ping WHERE adId = :adId AND url = :url")
    @NotNull
    List<C6186c> loadPingsForTrackingUrl(@NotNull String str, @NotNull String str2);
}
