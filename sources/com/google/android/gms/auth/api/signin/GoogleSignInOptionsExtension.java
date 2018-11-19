package com.google.android.gms.auth.api.signin;

import android.os.Bundle;
import android.support.annotation.Nullable;
import com.google.android.gms.common.api.Scope;
import java.util.List;

public interface GoogleSignInOptionsExtension {
    int getExtensionType();

    @Nullable
    List<Scope> getImpliedScopes();

    Bundle toBundle();
}
