package com.tinder.auth.repository;

import android.support.annotation.NonNull;
import com.tinder.model.auth.network.AuthRequest;
import com.tinder.model.auth.network.AuthResponse2;
import rx.Observable;

public interface AuthRepository {
    Observable<AuthResponse2> authenticate(@NonNull AuthRequest authRequest);
}
