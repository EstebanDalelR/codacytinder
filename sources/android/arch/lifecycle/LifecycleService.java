package android.arch.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.CallSuper;
import android.support.annotation.Nullable;

public class LifecycleService extends Service implements LifecycleOwner {
    /* renamed from: a */
    private final C0027l f8487a = new C0027l(this);

    @CallSuper
    public void onCreate() {
        this.f8487a.m119a();
        super.onCreate();
    }

    @Nullable
    @CallSuper
    public IBinder onBind(Intent intent) {
        this.f8487a.m120b();
        return null;
    }

    @CallSuper
    public void onStart(Intent intent, int i) {
        this.f8487a.m121c();
        super.onStart(intent, i);
    }

    @CallSuper
    public int onStartCommand(Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }

    @CallSuper
    public void onDestroy() {
        this.f8487a.m122d();
        super.onDestroy();
    }

    public Lifecycle getLifecycle() {
        return this.f8487a.m123e();
    }
}
