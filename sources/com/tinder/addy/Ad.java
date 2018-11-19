package com.tinder.addy;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0006J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/tinder/addy/Ad;", "", "adType", "Lcom/tinder/addy/Ad$AdType;", "id", "", "AdType", "addy_release"}, k = 1, mv = {1, 1, 10})
public interface Ad {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tinder/addy/Ad$AdType;", "", "addy_release"}, k = 1, mv = {1, 1, 10})
    public interface AdType {
    }

    @NotNull
    AdType adType();

    @NotNull
    String id();
}
