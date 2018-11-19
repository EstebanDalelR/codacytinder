package com.tinder.model.adapter.domain;

import com.tinder.data.adapter.C2645i;
import com.tinder.domain.common.model.Badge;
import com.tinder.domain.common.model.Badge.Type;
import java8.util.Objects;
import javax.inject.Inject;

class BadgeLegacyBadgeAdapter extends C2645i<Badge, com.tinder.model.Badge> {
    @Inject
    BadgeLegacyBadgeAdapter() {
    }

    public Badge adapt(com.tinder.model.Badge badge) {
        return Badge.builder().type(Type.fromKey(badge.type)).description((String) Objects.b(badge.description, "")).color((String) Objects.b(badge.colorString, "")).build();
    }
}
