package com.tinder.data.profile.adapter;

import com.tinder.data.adapter.C2646o;
import com.tinder.domain.profile.model.settings.PlacesSettings;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0003H\u0016J\u000e\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002¨\u0006\t"}, d2 = {"Lcom/tinder/data/profile/adapter/PlacesAdapter;", "Lcom/tinder/data/adapter/DomainApiAdapter;", "Lcom/tinder/domain/profile/model/settings/PlacesSettings;", "Lcom/tinder/api/model/profile/PlacesSettings;", "()V", "fromApi", "apiModel", "toApi", "domainModel", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.profile.adapter.y */
public final class C10924y extends C2646o<PlacesSettings, com.tinder.api.model.profile.PlacesSettings> {
    @NotNull
    /* renamed from: a */
    public PlacesSettings m43520a(@NotNull com.tinder.api.model.profile.PlacesSettings placesSettings) {
        C2668g.b(placesSettings, "apiModel");
        placesSettings = placesSettings.getEnabled();
        return new PlacesSettings(placesSettings != null ? placesSettings.booleanValue() : null);
    }

    @NotNull
    /* renamed from: a */
    public final com.tinder.api.model.profile.PlacesSettings m43519a(@NotNull PlacesSettings placesSettings) {
        C2668g.b(placesSettings, "domainModel");
        return new com.tinder.api.model.profile.PlacesSettings(Boolean.valueOf(placesSettings.getEnabled()));
    }
}
