package com.tinder.ads;

import com.tinder.ads.AdSource.Type;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u0003H&J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\fH&¨\u0006\r"}, d2 = {"Lcom/tinder/ads/SourceMediator;", "", "addSource", "", "source", "Lcom/tinder/ads/AdSource;", "nextSource", "removeSource", "type", "Lcom/tinder/ads/AdSource$Type;", "reset", "sources", "", "aggregator_release"}, k = 1, mv = {1, 1, 7})
public interface SourceMediator {
    void addSource(@NotNull AdSource adSource);

    @Nullable
    AdSource nextSource();

    void removeSource(@NotNull Type type);

    void reset();

    @NotNull
    Set<AdSource> sources();
}
