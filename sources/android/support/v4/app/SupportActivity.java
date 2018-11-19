package android.support.v4.app;

import android.app.Activity;
import android.arch.lifecycle.C0025k;
import android.arch.lifecycle.C2684e;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.Lifecycle.State;
import android.arch.lifecycle.LifecycleOwner;
import android.os.Bundle;
import android.support.annotation.CallSuper;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.v4.util.C0562m;

@RestrictTo({Scope.LIBRARY_GROUP})
public class SupportActivity extends Activity implements LifecycleOwner {
    private C0562m<Class<? extends C0384a>, C0384a> mExtraDataMap = new C0562m();
    private C2684e mLifecycleRegistry = new C2684e(this);

    @RestrictTo({Scope.LIBRARY_GROUP})
    /* renamed from: android.support.v4.app.SupportActivity$a */
    public static class C0384a {
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public void putExtraData(C0384a c0384a) {
        this.mExtraDataMap.put(c0384a.getClass(), c0384a);
    }

    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        C0025k.m111a((Activity) this);
    }

    @CallSuper
    protected void onSaveInstanceState(Bundle bundle) {
        this.mLifecycleRegistry.m10470a(State.CREATED);
        super.onSaveInstanceState(bundle);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public <T extends C0384a> T getExtraData(Class<T> cls) {
        return (C0384a) this.mExtraDataMap.get(cls);
    }

    public Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }
}
