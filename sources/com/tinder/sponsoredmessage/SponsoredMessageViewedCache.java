package com.tinder.sponsoredmessage;

import com.tinder.messageads.model.C12131a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\t"}, d2 = {"Lcom/tinder/sponsoredmessage/SponsoredMessageViewedCache;", "", "add", "", "ad", "Lcom/tinder/messageads/model/MessageAd;", "clear", "exists", "", "message-ads_release"}, k = 1, mv = {1, 1, 10})
public interface SponsoredMessageViewedCache {
    void add(@NotNull C12131a c12131a);

    void clear();

    boolean exists(@NotNull C12131a c12131a);
}
