package retrofit.p493a;

import com.tinder.model.GlobalConfig;
import retrofit.RestAdapter.Log;

/* renamed from: retrofit.a.b */
public class C19521b implements Log {
    /* renamed from: a */
    private final String f61024a;

    public C19521b(String str) {
        this.f61024a = str;
    }

    public final void log(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int i2 = i + GlobalConfig.DEFAULT_RECS_INTERVAL;
            m70485a(str.substring(i, Math.min(length, i2)));
            i = i2;
        }
    }

    /* renamed from: a */
    public void m70485a(String str) {
        android.util.Log.d(m70484a(), str);
    }

    /* renamed from: a */
    public String m70484a() {
        return this.f61024a;
    }
}
