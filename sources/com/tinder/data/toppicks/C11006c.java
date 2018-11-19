package com.tinder.data.toppicks;

import com.tinder.domain.meta.model.TopPicksSettings;
import com.tinder.domain.toppicks.repo.TopPicksSettingRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0004H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/tinder/data/toppicks/InMemoryTopPicksSettingsRepository;", "Lcom/tinder/domain/toppicks/repo/TopPicksSettingRepository;", "()V", "topPicksSettings", "Lcom/tinder/domain/meta/model/TopPicksSettings;", "get", "set", "", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.toppicks.c */
public final class C11006c implements TopPicksSettingRepository {
    /* renamed from: a */
    private TopPicksSettings f35742a;

    public void set(@NotNull TopPicksSettings topPicksSettings) {
        C2668g.b(topPicksSettings, "topPicksSettings");
        this.f35742a = topPicksSettings;
    }

    @Nullable
    public TopPicksSettings get() {
        return this.f35742a;
    }
}
