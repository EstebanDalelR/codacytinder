package android.support.v4.app;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.view.View;

/* renamed from: android.support.v4.app.h */
public abstract class C0391h {
    @Nullable
    /* renamed from: a */
    public abstract View mo380a(@IdRes int i);

    /* renamed from: a */
    public abstract boolean mo381a();

    /* renamed from: a */
    public Fragment mo379a(Context context, String str, Bundle bundle) {
        return Fragment.instantiate(context, str, bundle);
    }
}
