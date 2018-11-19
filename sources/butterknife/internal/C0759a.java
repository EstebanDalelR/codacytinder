package butterknife.internal;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: butterknife.internal.a */
public abstract class C0759a implements OnClickListener {
    private static final Runnable ENABLE_AGAIN = new C07581();
    static boolean enabled = true;

    /* renamed from: butterknife.internal.a$1 */
    static class C07581 implements Runnable {
        C07581() {
        }

        public void run() {
            C0759a.enabled = true;
        }
    }

    public abstract void doClick(View view);

    public final void onClick(View view) {
        if (enabled) {
            enabled = false;
            view.post(ENABLE_AGAIN);
            doClick(view);
        }
    }
}
