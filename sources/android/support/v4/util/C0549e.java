package android.support.v4.util;

import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.util.Log;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.io.Writer;

@RestrictTo({Scope.LIBRARY_GROUP})
/* renamed from: android.support.v4.util.e */
public class C0549e extends Writer {
    /* renamed from: a */
    private final String f1702a;
    /* renamed from: b */
    private StringBuilder f1703b = new StringBuilder(ProfileEditingConfig.DEFAULT_MAX_LENGTH);

    public C0549e(String str) {
        this.f1702a = str;
    }

    public void close() {
        m2022a();
    }

    public void flush() {
        m2022a();
    }

    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                m2022a();
            } else {
                this.f1703b.append(c);
            }
        }
    }

    /* renamed from: a */
    private void m2022a() {
        if (this.f1703b.length() > 0) {
            Log.d(this.f1702a, this.f1703b.toString());
            this.f1703b.delete(0, this.f1703b.length());
        }
    }
}
