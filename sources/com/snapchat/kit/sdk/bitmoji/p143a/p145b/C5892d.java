package com.snapchat.kit.sdk.bitmoji.p143a.p145b;

import com.snapchat.kit.sdk.bitmoji.dagger.scope.FragmentScope;
import dagger.Module;
import dagger.Provides;
import javax.inject.Named;

@Module
/* renamed from: com.snapchat.kit.sdk.bitmoji.a.b.d */
public class C5892d {
    @FragmentScope
    @Provides
    @Named("perceived:first_render")
    /* renamed from: a */
    C5891c m25432a(C5890a c5890a) {
        return new C5891c(c5890a, "perceived:first_render");
    }

    @FragmentScope
    @Provides
    @Named("perceived:first_render_grid")
    /* renamed from: b */
    C5891c m25433b(C5890a c5890a) {
        return new C5891c(c5890a, "perceived:first_render_grid");
    }

    @FragmentScope
    @Provides
    @Named("perceived:open")
    /* renamed from: c */
    C5891c m25434c(C5890a c5890a) {
        return new C5891c(c5890a, "perceived:open");
    }

    @FragmentScope
    @Provides
    @Named("search:indexing")
    /* renamed from: d */
    C5891c m25435d(C5890a c5890a) {
        return new C5891c(c5890a, "search:indexing");
    }
}
