package com.tinder.ads;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\u00020\u0003:\u0001\fJ\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\r\u0010\n\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/tinder/ads/Ad;", "T", "Lcom/tinder/ads/AdSource;", "", "adType", "Lcom/tinder/ads/Ad$AdType;", "id", "", "priority", "Lcom/tinder/ads/SourcePriority;", "source", "()Lcom/tinder/ads/AdSource;", "AdType", "aggregator_release"}, k = 1, mv = {1, 1, 7})
public interface Ad<T extends AdSource> {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tinder/ads/Ad$AdType;", "", "aggregator_release"}, k = 1, mv = {1, 1, 7})
    public interface AdType {
    }

    @NotNull
    AdType adType();

    @NotNull
    String id();

    @NotNull
    SourcePriority priority();

    @NotNull
    T source();
}
