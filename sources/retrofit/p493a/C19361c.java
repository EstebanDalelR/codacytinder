package retrofit.p493a;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: retrofit.a.c */
public final class C19361c implements Executor {
    /* renamed from: a */
    private final Handler f60481a = new Handler(Looper.getMainLooper());

    public void execute(Runnable runnable) {
        this.f60481a.post(runnable);
    }
}
