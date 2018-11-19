package com.tinder.data.match;

import android.support.annotation.NonNull;
import com.tinder.data.adapter.DatabaseModelAdapter;
import com.tinder.data.model.MatchPersonModel;
import com.tinder.domain.common.model.User;
import com.tinder.domain.meta.model.CoreUser;

class al implements DatabaseModelAdapter<MatchPersonModel, User> {
    al() {
    }

    @NonNull
    public /* synthetic */ Object fromModel(@NonNull Object obj) {
        return m43250a((MatchPersonModel) obj);
    }

    @NonNull
    /* renamed from: a */
    public User m43250a(@NonNull MatchPersonModel matchPersonModel) {
        return CoreUser.builder().id(matchPersonModel.id()).badges(matchPersonModel.badges()).bio(matchPersonModel.bio()).birthDate(matchPersonModel.birth_date()).gender(matchPersonModel.gender()).name(matchPersonModel.name()).photos(matchPersonModel.photos()).jobs(matchPersonModel.jobs()).schools(matchPersonModel.schools()).build();
    }
}
