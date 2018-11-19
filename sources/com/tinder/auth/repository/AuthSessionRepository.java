package com.tinder.auth.repository;

import com.tinder.auth.model.C8289c;

public interface AuthSessionRepository {
    C8289c authSession();

    void saveUserHasPreviouslyLoggedIn();
}
