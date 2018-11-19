package com.tinder.addy.cache;

import com.tinder.addy.Ad;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0004H&J\b\u0010\f\u001a\u00020\rH&J\n\u0010\u000e\u001a\u0004\u0018\u00010\u0004H&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/tinder/addy/cache/AdQueue;", "", "all", "", "Lcom/tinder/addy/Ad;", "getAll", "()Ljava/util/List;", "isEmpty", "", "()Z", "add", "ad", "clear", "", "poll", "addy_release"}, k = 1, mv = {1, 1, 10})
public interface AdQueue {
    boolean add(@NotNull Ad ad);

    void clear();

    @NotNull
    List<Ad> getAll();

    boolean isEmpty();

    @Nullable
    Ad poll();
}
