package com.tinder.base.module;

import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import com.tinder.base.p174d.p175a.C10359a;
import com.tinder.base.p174d.p175a.C10360b;
import com.tinder.base.p174d.p175a.C10360b.C8305a;
import com.tinder.base.p174d.p175a.C10361e;
import com.tinder.base.p174d.p175a.C8308d;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoSet;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.collections.ak;
import kotlin.jvm.internal.C2668g;
import okhttp3.Interceptor;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0007H\u0007¨\u0006\u000b"}, d2 = {"Lcom/tinder/base/module/ImageNetworkModule;", "", "()V", "provideImageCacheInterceptor", "Lokhttp3/Interceptor;", "provideImageHostRewriteInterceptor", "provideImagePerformanceCache", "Lcom/tinder/base/network/interceptor/ImagePerformanceCache;", "provideImageProfilingNetworkInterceptor", "imagePerformanceCache", "ImageNetwork", "base_release"}, k = 1, mv = {1, 1, 10})
@Module
public final class ImageNetworkModule {
    @ImageNetworkModule$ImageNetwork
    @IntoSet
    @NotNull
    @Provides
    /* renamed from: a */
    public final Interceptor m35414a() {
        return new C10359a();
    }

    @ImageNetworkModule$ImageNetwork
    @IntoSet
    @NotNull
    @Provides
    /* renamed from: a */
    public final Interceptor m35415a(@NotNull C8308d c8308d) {
        C2668g.b(c8308d, "imagePerformanceCache");
        return new C10361e(c8308d, ak.a(new String[]{"images.gotinder.com", "images-ssl.gotinder.com"}));
    }

    @ImageNetworkModule$ImageNetwork
    @IntoSet
    @NotNull
    @Provides
    /* renamed from: b */
    public final Interceptor m35416b() {
        return new C10360b(new C8305a("images.gotinder.com", "images-ssl.gotinder.com", "https"));
    }

    @Singleton
    @NotNull
    @Provides
    /* renamed from: c */
    public final C8308d m35417c() {
        return new C8308d(Callback.DEFAULT_DRAG_ANIMATION_DURATION);
    }
}
