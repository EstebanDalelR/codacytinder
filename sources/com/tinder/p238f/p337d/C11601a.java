package com.tinder.p238f.p337d;

import android.support.annotation.NonNull;
import com.tinder.api.model.meta.Meta;
import com.tinder.domain.common.usecase.ObservableResultUseCase;
import com.tinder.domain.meta.gateway.MetaGateway;
import com.tinder.domain.meta.model.LegacyMetaContainer;
import com.tinder.interactors.C9717h;
import com.tinder.model.UserMeta;
import javax.inject.Inject;
import rx.Observable;

/* renamed from: com.tinder.f.d.a */
public class C11601a implements ObservableResultUseCase<UserMeta> {
    @NonNull
    /* renamed from: a */
    private final MetaGateway f38001a;
    @NonNull
    /* renamed from: b */
    private final C9717h f38002b;

    @Inject
    public C11601a(@NonNull MetaGateway metaGateway, @NonNull C9717h c9717h) {
        this.f38001a = metaGateway;
        this.f38002b = c9717h;
    }

    @NonNull
    public Observable<UserMeta> execute() {
        return this.f38001a.observeMeta().h(new C13170b(this));
    }

    /* renamed from: a */
    final /* synthetic */ Observable m47328a(LegacyMetaContainer legacyMetaContainer) {
        return this.f38002b.m40214a((Meta) legacyMetaContainer.getMeta());
    }
}
