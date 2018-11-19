package com.google.android.gms.internal;

import android.content.Context;
import android.support.annotation.NonNull;
import com.google.android.gms.auth.api.phone.C3780b;
import com.google.android.gms.tasks.C4500a;

public final class nm extends C3780b {
    public nm(@NonNull Context context) {
        super(context);
    }

    public final C4500a<Void> startSmsRetriever() {
        return b(new nn(this));
    }
}
