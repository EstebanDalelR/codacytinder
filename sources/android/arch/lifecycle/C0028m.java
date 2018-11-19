package android.arch.lifecycle;

import android.arch.core.util.Function;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/* renamed from: android.arch.lifecycle.m */
public class C0028m {
    @MainThread
    /* renamed from: a */
    public static <X, Y> LiveData<Y> m124a(@NonNull LiveData<X> liveData, @NonNull final Function<X, Y> function) {
        final LiveData c3979g = new C3979g();
        c3979g.m15520a(liveData, new Observer<X>() {
            public void onChanged(@Nullable X x) {
                c3979g.mo40b(function.apply(x));
            }
        });
        return c3979g;
    }

    @MainThread
    /* renamed from: b */
    public static <X, Y> LiveData<Y> m125b(@NonNull LiveData<X> liveData, @NonNull final Function<X, LiveData<Y>> function) {
        final LiveData c3979g = new C3979g();
        c3979g.m15520a(liveData, new Observer<X>() {
            /* renamed from: a */
            LiveData<Y> f8519a;

            /* renamed from: android.arch.lifecycle.m$2$1 */
            class C26911 implements Observer<Y> {
                /* renamed from: a */
                final /* synthetic */ C26922 f8518a;

                C26911(C26922 c26922) {
                    this.f8518a = c26922;
                }

                public void onChanged(@Nullable Y y) {
                    c3979g.mo40b(y);
                }
            }

            public void onChanged(@Nullable X x) {
                LiveData liveData = (LiveData) function.apply(x);
                if (this.f8519a != liveData) {
                    if (this.f8519a != null) {
                        c3979g.m15523d(this.f8519a);
                    }
                    this.f8519a = liveData;
                    if (this.f8519a != null) {
                        c3979g.m15520a(this.f8519a, new C26911(this));
                    }
                }
            }
        });
        return c3979g;
    }
}
