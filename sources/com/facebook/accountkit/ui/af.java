package com.facebook.accountkit.ui;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

abstract class af extends Fragment {
    /* renamed from: a */
    private static final String f3453a;
    /* renamed from: e */
    public static final String f3454e = "af";
    /* renamed from: f */
    protected static final String f3455f;
    /* renamed from: b */
    private final Bundle f3456b = new Bundle();

    /* renamed from: a */
    protected void mo3277a(View view, Bundle bundle) {
    }

    af() {
    }

    static {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(f3454e);
        stringBuilder.append(".VIEW_STATE_KEY");
        f3453a = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(f3454e);
        stringBuilder.append(".UI_MANAGER_KEY");
        f3455f = stringBuilder.toString();
    }

    @Nullable
    /* renamed from: n */
    protected UIManager m4589n() {
        return (UIManager) this.f3456b.get(f3455f);
    }

    /* renamed from: o */
    protected Bundle m4590o() {
        return this.f3456b;
    }

    public void onCreate(Bundle bundle) {
        if (bundle != null) {
            this.f3456b.putAll(bundle.getBundle(f3453a));
        }
        if (this.f3456b.containsKey(f3455f)) {
            super.onCreate(bundle);
            setRetainInstance(true);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("You must supply a UIManager to ");
        stringBuilder.append(f3454e);
        throw new RuntimeException(stringBuilder.toString());
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        bundle = getView();
        if (bundle != null) {
            mo3277a(bundle, this.f3456b);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBundle(f3453a, this.f3456b);
        super.onSaveInstanceState(bundle);
    }
}
