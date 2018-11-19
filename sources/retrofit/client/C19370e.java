package retrofit.client;

import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import retrofit.mime.TypedInput;

/* renamed from: retrofit.client.e */
public final class C19370e {
    /* renamed from: a */
    private final String f60496a;
    /* renamed from: b */
    private final int f60497b;
    /* renamed from: c */
    private final String f60498c;
    /* renamed from: d */
    private final List<C19368b> f60499d;
    /* renamed from: e */
    private final TypedInput f60500e;

    public C19370e(String str, int i, String str2, List<C19368b> list, TypedInput typedInput) {
        if (str == null) {
            throw new IllegalArgumentException("url == null");
        } else if (i < Callback.DEFAULT_DRAG_ANIMATION_DURATION) {
            str2 = new StringBuilder();
            str2.append("Invalid status code: ");
            str2.append(i);
            throw new IllegalArgumentException(str2.toString());
        } else if (str2 == null) {
            throw new IllegalArgumentException("reason == null");
        } else if (list == null) {
            throw new IllegalArgumentException("headers == null");
        } else {
            this.f60496a = str;
            this.f60497b = i;
            this.f60498c = str2;
            this.f60499d = Collections.unmodifiableList(new ArrayList(list));
            this.f60500e = typedInput;
        }
    }

    /* renamed from: a */
    public String m69550a() {
        return this.f60496a;
    }

    /* renamed from: b */
    public int m69551b() {
        return this.f60497b;
    }

    /* renamed from: c */
    public String m69552c() {
        return this.f60498c;
    }

    /* renamed from: d */
    public List<C19368b> m69553d() {
        return this.f60499d;
    }

    /* renamed from: e */
    public TypedInput m69554e() {
        return this.f60500e;
    }
}
