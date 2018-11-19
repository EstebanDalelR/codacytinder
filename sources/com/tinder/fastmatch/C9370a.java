package com.tinder.fastmatch;

import com.tinder.api.TinderApi;
import com.tinder.data.fastmatch.C10768a;
import com.tinder.data.fastmatch.p324a.C10767b;
import com.tinder.data.fastmatch.p325b.C10769a;
import com.tinder.domain.fastmatch.RefreshNotifier;
import com.tinder.domain.fastmatch.newCount.NewCountFetcher;
import com.tinder.domain.fastmatch.provider.FastMatchConfigProvider;
import com.tinder.domain.fastmatch.repository.FastMatchRecsResponseRepository;
import com.tinder.domain.fastmatch.repository.NewCountRepository;
import com.tinder.fastmatch.newcount.C9381b;
import com.tinder.fastmatch.newcount.C9383e;
import com.tinder.fastmatch.p244b.C11621a;
import com.tinder.fastmatch.p244b.C11622b;
import com.tinder.recsgrid.C14782d;
import com.tinder.recsgrid.C16487f;
import com.tinder.recsgrid.ScrollStatusNotifier;
import com.tinder.recsgrid.ScrollStatusProvider;
import com.tinder.scope.ActivityScope;
import com.tinder.views.grid.p449a.C15453a;
import dagger.Module;
import dagger.Provides;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.C2671a;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 *2\u00020\u0001:\u0001*B\u0005¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¢\u0006\u0002\b\u0007J%\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0001¢\u0006\u0002\b\u0010J\r\u0010\u0011\u001a\u00020\u0012H\u0001¢\u0006\u0002\b\u0013J5\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u0012H\u0001¢\u0006\u0002\b\u001aJ\r\u0010\u001b\u001a\u00020\u001cH\u0001¢\u0006\u0002\b\u001dJ\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0007J\u0010\u0010\"\u001a\u00020#2\u0006\u0010 \u001a\u00020!H\u0007J\b\u0010$\u001a\u00020!H\u0007J\r\u0010%\u001a\u00020&H\u0001¢\u0006\u0002\b'J\r\u0010(\u001a\u00020\u0017H\u0001¢\u0006\u0002\b)¨\u0006+"}, d2 = {"Lcom/tinder/fastmatch/FastMatchRecsActivityModule;", "", "()V", "fastMatchRecsResponseRepository", "Lcom/tinder/domain/fastmatch/repository/FastMatchRecsResponseRepository;", "fastMatchRecsApiClient", "Lcom/tinder/fastmatch/data/FastMatchRecsApiClient;", "fastMatchRecsResponseRepository$Tinder_release", "newCountFetcher", "Lcom/tinder/domain/fastmatch/newCount/NewCountFetcher;", "tinderApi", "Lcom/tinder/api/TinderApi;", "fastMatchNewCountAdapter", "Lcom/tinder/data/fastmatch/adapter/FastMatchNewCountAdapter;", "configProvider", "Lcom/tinder/domain/fastmatch/provider/FastMatchConfigProvider;", "newCountFetcher$Tinder_release", "newCountRepository", "Lcom/tinder/domain/fastmatch/repository/NewCountRepository;", "newCountRepository$Tinder_release", "newCountUpdateScheduler", "Lcom/tinder/fastmatch/newcount/NewCountUpdateScheduler;", "refreshNotifier", "Lcom/tinder/domain/fastmatch/RefreshNotifier;", "newCountUpdateIntervalProvider", "Lcom/tinder/fastmatch/newcount/NewCountUpdateIntervalProvider;", "newCountUpdateScheduler$Tinder_release", "provideRecPrefetcher", "Lcom/tinder/recsgrid/RecPrefetcher;", "provideRecPrefetcher$Tinder_release", "provideScrollStatusNotifier", "Lcom/tinder/recsgrid/ScrollStatusNotifier;", "scrollStatusProviderAndNotifier", "Lcom/tinder/recsgrid/ScrollStatusProviderAndNotifier;", "provideScrollStatusProvider", "Lcom/tinder/recsgrid/ScrollStatusProvider;", "provideScrollStatusProviderAndNotifer", "provideUserRecPhotoAlbumProvider", "Lcom/tinder/views/grid/provider/UserRecPhotoAlbumProvider;", "provideUserRecPhotoAlbumProvider$Tinder_release", "pullToRefreshNotifier", "pullToRefreshNotifier$Tinder_release", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@Module
/* renamed from: com.tinder.fastmatch.a */
public final class C9370a {
    /* renamed from: a */
    public static final C9369a f31430a = new C9369a();
    /* renamed from: b */
    private static final float f31431b = 1.0f;
    /* renamed from: c */
    private static final int f31432c = 10;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/tinder/fastmatch/FastMatchRecsActivityModule$Companion;", "", "()V", "PREFETCH_INTERVAL_SECONDS", "", "PREFETCH_THRESHOLD_NUMBER_OF_ITEMS_UNTIL_END_OF_THE_LIST", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.a$a */
    public static final class C9369a {
        private C9369a() {
        }
    }

    @NotNull
    @ActivityScope
    @Provides
    /* renamed from: a */
    public final RefreshNotifier m39223a() {
        return new RefreshNotifier();
    }

    @NotNull
    @ActivityScope
    @Provides
    /* renamed from: b */
    public final NewCountRepository m39228b() {
        return new C10769a();
    }

    @NotNull
    @ActivityScope
    @Provides
    /* renamed from: a */
    public final NewCountFetcher m39224a(@NotNull TinderApi tinderApi, @NotNull C10767b c10767b, @NotNull FastMatchConfigProvider fastMatchConfigProvider) {
        C2668g.b(tinderApi, "tinderApi");
        C2668g.b(c10767b, "fastMatchNewCountAdapter");
        C2668g.b(fastMatchConfigProvider, "configProvider");
        return new C10768a(tinderApi, c10767b, fastMatchConfigProvider);
    }

    @NotNull
    @ActivityScope
    @Provides
    /* renamed from: a */
    public final C9383e m39226a(@NotNull RefreshNotifier refreshNotifier, @NotNull FastMatchRecsResponseRepository fastMatchRecsResponseRepository, @NotNull NewCountFetcher newCountFetcher, @NotNull C9381b c9381b, @NotNull NewCountRepository newCountRepository) {
        C2668g.b(refreshNotifier, "refreshNotifier");
        C2668g.b(fastMatchRecsResponseRepository, "fastMatchRecsResponseRepository");
        C2668g.b(newCountFetcher, "newCountFetcher");
        C2668g.b(c9381b, "newCountUpdateIntervalProvider");
        C2668g.b(newCountRepository, "newCountRepository");
        C2671a io = Schedulers.io();
        C2668g.a(io, "Schedulers.io()");
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        C2671a computation = Schedulers.computation();
        C2668g.a(computation, "Schedulers.computation()");
        return new C9383e(refreshNotifier, fastMatchRecsResponseRepository, newCountFetcher, newCountRepository, c9381b, io, timeUnit, computation);
    }

    @NotNull
    @ActivityScope
    @Provides
    /* renamed from: c */
    public final C14782d m39230c() {
        return new C14782d(f31431b, f31432c);
    }

    @NotNull
    @ActivityScope
    @Provides
    /* renamed from: a */
    public final ScrollStatusNotifier m39227a(@NotNull C16487f c16487f) {
        C2668g.b(c16487f, "scrollStatusProviderAndNotifier");
        return c16487f;
    }

    @NotNull
    @ActivityScope
    @Provides
    /* renamed from: b */
    public final ScrollStatusProvider m39229b(@NotNull C16487f c16487f) {
        C2668g.b(c16487f, "scrollStatusProviderAndNotifier");
        return c16487f;
    }

    @NotNull
    @ActivityScope
    @Provides
    /* renamed from: d */
    public final C16487f m39231d() {
        return new C16487f();
    }

    @NotNull
    @ActivityScope
    @Provides
    /* renamed from: a */
    public final FastMatchRecsResponseRepository m39225a(@NotNull C11621a c11621a) {
        C2668g.b(c11621a, "fastMatchRecsApiClient");
        return new C11622b(c11621a);
    }

    @NotNull
    @ActivityScope
    @Provides
    /* renamed from: e */
    public final C15453a m39232e() {
        return new C15453a();
    }
}
