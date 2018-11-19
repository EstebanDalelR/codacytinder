package android.support.transition;

import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.util.Log;
import android.view.ViewGroup;
import java.lang.reflect.Method;

@RequiresApi(18)
class ah extends ag {
    /* renamed from: a */
    private static Method f12753a;
    /* renamed from: b */
    private static boolean f12754b;

    ah() {
    }

    /* renamed from: a */
    public ae mo340a(@NonNull ViewGroup viewGroup) {
        return new ad(viewGroup);
    }

    /* renamed from: a */
    public void mo341a(@NonNull ViewGroup viewGroup, boolean z) {
        m15715a();
        if (f12753a != null) {
            try {
                f12753a.invoke(viewGroup, new Object[]{Boolean.valueOf(z)});
            } catch (ViewGroup viewGroup2) {
                Log.i("ViewUtilsApi18", "Failed to invoke suppressLayout method", viewGroup2);
            } catch (ViewGroup viewGroup22) {
                Log.i("ViewUtilsApi18", "Error invoking suppressLayout method", viewGroup22);
            }
        }
    }

    /* renamed from: a */
    private void m15715a() {
        if (!f12754b) {
            try {
                f12753a = ViewGroup.class.getDeclaredMethod("suppressLayout", new Class[]{Boolean.TYPE});
                f12753a.setAccessible(true);
            } catch (Throwable e) {
                Log.i("ViewUtilsApi18", "Failed to retrieve suppressLayout method", e);
            }
            f12754b = true;
        }
    }
}
