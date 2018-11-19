package com.tinder.data.profile.adapter;

import com.tinder.api.model.profile.DiscoverySettingsRequestBody;
import com.tinder.domain.meta.model.DiscoverySettings.GenderFilter;
import com.tinder.domain.profile.model.DiscoverySettingsUpdateRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/data/profile/adapter/DiscoverySettingsRequestAdapter;", "", "()V", "toApi", "Lcom/tinder/api/model/profile/DiscoverySettingsRequestBody;", "request", "Lcom/tinder/domain/profile/model/DiscoverySettingsUpdateRequest;", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.profile.adapter.g */
public final class C8754g {
    @NotNull
    /* renamed from: a */
    public final DiscoverySettingsRequestBody m37289a(@NotNull DiscoverySettingsUpdateRequest discoverySettingsUpdateRequest) {
        C2668g.b(discoverySettingsUpdateRequest, "request");
        Integer minAge = discoverySettingsUpdateRequest.getMinAge();
        Integer maxAge = discoverySettingsUpdateRequest.getMaxAge();
        GenderFilter genderFilter = discoverySettingsUpdateRequest.getGenderFilter();
        return new DiscoverySettingsRequestBody(minAge, maxAge, genderFilter != null ? Integer.valueOf(genderFilter.getValue()) : null, discoverySettingsUpdateRequest.isDiscoverable(), discoverySettingsUpdateRequest.getDistanceFilter());
    }
}
