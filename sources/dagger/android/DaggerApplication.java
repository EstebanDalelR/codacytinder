package dagger.android;

import android.app.Application;
import com.google.errorprone.annotations.ForOverride;

public abstract class DaggerApplication extends Application implements HasActivityInjector, HasBroadcastReceiverInjector, HasContentProviderInjector, HasFragmentInjector, HasServiceInjector {
    /* renamed from: a */
    private volatile boolean f12565a = true;

    @ForOverride
    /* renamed from: a */
    protected abstract AndroidInjector<? extends DaggerApplication> m15184a();

    public void onCreate() {
        super.onCreate();
        m15183b();
    }

    /* renamed from: b */
    private void m15183b() {
        if (this.f12565a) {
            synchronized (this) {
                if (this.f12565a) {
                    m15184a().inject(this);
                    if (this.f12565a) {
                        throw new IllegalStateException("The AndroidInjector returned from applicationInjector() did not inject the DaggerApplication");
                    }
                }
            }
        }
    }
}
