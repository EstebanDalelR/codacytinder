package com.tinder.common.repository;

import com.tinder.model.User;
import rx.Observable;

@Deprecated
public interface MyUserRepository {
    @Deprecated
    Observable<User> loadMyUser();
}
