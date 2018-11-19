package com.tinder.model.adapter.domain;

import android.support.annotation.Nullable;
import com.tinder.data.adapter.C2645i;
import com.tinder.domain.common.model.Gender;
import com.tinder.domain.common.model.Gender.Value;
import com.tinder.model.User;
import javax.inject.Inject;

class GenderLegacyUserAdapter extends C2645i<Gender, User> {
    @Inject
    GenderLegacyUserAdapter() {
    }

    @Nullable
    public Gender adapt(User user) {
        return Gender.create(Value.fromId(user.getGender().getBackendId()), user.getCustomGender());
    }
}
