package com.facebook;

import android.content.Intent;
import com.facebook.internal.CallbackManagerImpl;

public interface CallbackManager {

    /* renamed from: com.facebook.CallbackManager$a */
    public static class C1165a {
        /* renamed from: a */
        public static CallbackManager m3968a() {
            return new CallbackManagerImpl();
        }
    }

    boolean onActivityResult(int i, int i2, Intent intent);
}
