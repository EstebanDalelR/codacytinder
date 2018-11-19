package retrofit.client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import retrofit.mime.TypedOutput;

/* renamed from: retrofit.client.d */
public final class C19369d {
    /* renamed from: a */
    private final String f60492a;
    /* renamed from: b */
    private final String f60493b;
    /* renamed from: c */
    private final List<C19368b> f60494c;
    /* renamed from: d */
    private final TypedOutput f60495d;

    public C19369d(String str, String str2, List<C19368b> list, TypedOutput typedOutput) {
        if (str == null) {
            throw new NullPointerException("Method must not be null.");
        } else if (str2 == null) {
            throw new NullPointerException("URL must not be null.");
        } else {
            this.f60492a = str;
            this.f60493b = str2;
            if (list == null) {
                this.f60494c = Collections.emptyList();
            } else {
                this.f60494c = Collections.unmodifiableList(new ArrayList(list));
            }
            this.f60495d = typedOutput;
        }
    }

    /* renamed from: a */
    public String m69546a() {
        return this.f60492a;
    }

    /* renamed from: b */
    public String m69547b() {
        return this.f60493b;
    }

    /* renamed from: c */
    public List<C19368b> m69548c() {
        return this.f60494c;
    }

    /* renamed from: d */
    public TypedOutput m69549d() {
        return this.f60495d;
    }
}
