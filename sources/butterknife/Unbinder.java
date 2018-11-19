package butterknife;

import android.support.annotation.UiThread;

public interface Unbinder {
    /* renamed from: a */
    public static final Unbinder f2068a = new C29621();

    /* renamed from: butterknife.Unbinder$1 */
    static class C29621 implements Unbinder {
        public void unbind() {
        }

        C29621() {
        }
    }

    @UiThread
    void unbind();
}
