package com.tinder.places.injection;

import com.tinder.recsgrid.C14782d;
import com.tinder.recsgrid.C16487f;
import com.tinder.recsgrid.ScrollStatusNotifier;
import com.tinder.recsgrid.ScrollStatusProvider;
import com.tinder.scope.ActivityScope;
import com.tinder.views.grid.p449a.C15453a;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0002J\r\u0010\u0003\u001a\u00020\u0004H\u0001¢\u0006\u0002\b\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tH\u0007J\b\u0010\f\u001a\u00020\tH\u0007J\r\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0002\b\u000f¨\u0006\u0011"}, d2 = {"Lcom/tinder/places/injection/PlacesRecsModule;", "", "()V", "provideRecPrefetcher", "Lcom/tinder/recsgrid/RecPrefetcher;", "provideRecPrefetcher$Tinder_release", "provideScrollStatusNotifier", "Lcom/tinder/recsgrid/ScrollStatusNotifier;", "scrollStatusProviderAndNotifier", "Lcom/tinder/recsgrid/ScrollStatusProviderAndNotifier;", "provideScrollStatusProvider", "Lcom/tinder/recsgrid/ScrollStatusProvider;", "provideScrollStatusProviderAndNotifier", "provideUserRecPhotoAlbumProvider", "Lcom/tinder/views/grid/provider/UserRecPhotoAlbumProvider;", "provideUserRecPhotoAlbumProvider$Tinder_release", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@Module
/* renamed from: com.tinder.places.injection.g */
public final class C10215g {
    /* renamed from: a */
    public static final C10214a f33282a = new C10214a();

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/tinder/places/injection/PlacesRecsModule$Companion;", "", "()V", "PREFETCH_INTERVAL_SECONDS", "", "PREFETCH_THRESHOLD_NUMBER_OF_ITEMS_UNTIL_END_OF_THE_LIST", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.injection.g$a */
    public static final class C10214a {
        private C10214a() {
        }
    }

    @NotNull
    @ActivityScope
    @Provides
    /* renamed from: a */
    public final C15453a m41537a() {
        return new C15453a();
    }

    @NotNull
    @ActivityScope
    @Provides
    /* renamed from: b */
    public final C14782d m41539b() {
        return new C14782d(1.0f, 10);
    }

    @NotNull
    @ActivityScope
    @Provides
    /* renamed from: a */
    public final ScrollStatusNotifier m41536a(@NotNull C16487f c16487f) {
        C2668g.b(c16487f, "scrollStatusProviderAndNotifier");
        return c16487f;
    }

    @NotNull
    @ActivityScope
    @Provides
    /* renamed from: b */
    public final ScrollStatusProvider m41538b(@NotNull C16487f c16487f) {
        C2668g.b(c16487f, "scrollStatusProviderAndNotifier");
        return c16487f;
    }

    @NotNull
    @ActivityScope
    @Provides
    /* renamed from: c */
    public final C16487f m41540c() {
        return new C16487f();
    }
}
