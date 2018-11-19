package io.fabric.sdk.android.services.persistence;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import io.fabric.sdk.android.C15611g;

/* renamed from: io.fabric.sdk.android.services.persistence.b */
public class C17347b implements PreferenceStore {
    /* renamed from: a */
    private final SharedPreferences f53075a;
    /* renamed from: b */
    private final String f53076b;
    /* renamed from: c */
    private final Context f53077c;

    public C17347b(Context context, String str) {
        if (context == null) {
            throw new IllegalStateException("Cannot get directory before context has been set. Call Fabric.with() first");
        }
        this.f53077c = context;
        this.f53076b = str;
        this.f53075a = this.f53077c.getSharedPreferences(this.f53076b, 0);
    }

    @Deprecated
    public C17347b(C15611g c15611g) {
        this(c15611g.getContext(), c15611g.getClass().getName());
    }

    public SharedPreferences get() {
        return this.f53075a;
    }

    public Editor edit() {
        return this.f53075a.edit();
    }

    @TargetApi(9)
    public boolean save(Editor editor) {
        if (VERSION.SDK_INT < 9) {
            return editor.commit();
        }
        editor.apply();
        return true;
    }
}
