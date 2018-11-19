package com.snapchat.kit.sdk.login.networking;

import android.support.annotation.Nullable;
import com.snapchat.kit.sdk.core.models.UserDataResponse;

public interface FetchUserDataCallback extends SnapLoginClientCallback<UserDataResponse> {
    void onFailure(boolean z, int i);

    void onSuccess(@Nullable UserDataResponse userDataResponse);
}
