package com.tinder.data.ads;

import com.squareup.sqlbrite.BriteDatabase;
import com.tinder.data.database.DBv2;
import com.tinder.data.match.am;
import com.tinder.data.match.an;
import com.tinder.domain.match.repository.TrackingUrlRepository;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0017\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0001¢\u0006\u0002\b\u0007J\u001d\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004H\u0001¢\u0006\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/tinder/data/ads/TrackingUrlModule;", "", "()V", "provideTrackingUrlDataStore", "Lcom/tinder/data/match/TrackingUrlDataStore;", "briteDatabase", "Lcom/squareup/sqlbrite/BriteDatabase;", "provideTrackingUrlDataStore$data_release", "provideTrackingUrlRepository", "Lcom/tinder/domain/match/repository/TrackingUrlRepository;", "trackingUrlNotifier", "Lcom/tinder/data/ads/TrackingUrlNotifier;", "trackingUrlDataStore", "provideTrackingUrlRepository$data_release", "data_release"}, k = 1, mv = {1, 1, 10})
@Module
/* renamed from: com.tinder.data.ads.a */
public final class C8618a {
    @Singleton
    @NotNull
    @Provides
    /* renamed from: a */
    public final an m36764a(@NotNull @DBv2 BriteDatabase briteDatabase) {
        C2668g.b(briteDatabase, "briteDatabase");
        return new an(briteDatabase);
    }

    @Singleton
    @NotNull
    @Provides
    /* renamed from: a */
    public final TrackingUrlRepository m36765a(@NotNull TrackingUrlNotifier trackingUrlNotifier, @NotNull an anVar) {
        C2668g.b(trackingUrlNotifier, "trackingUrlNotifier");
        C2668g.b(anVar, "trackingUrlDataStore");
        return new am(trackingUrlNotifier, anVar);
    }
}
