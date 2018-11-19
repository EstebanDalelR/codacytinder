package kotlin.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: kotlin.jvm.internal.k */
public class C15827k {
    /* renamed from: a */
    private final ArrayList<Object> f49032a;

    public C15827k(int i) {
        this.f49032a = new ArrayList(i);
    }

    /* renamed from: a */
    public void m59870a(Object obj) {
        if (obj != null) {
            if (obj instanceof Object[]) {
                Object[] objArr = (Object[]) obj;
                if (objArr.length > 0) {
                    this.f49032a.ensureCapacity(this.f49032a.size() + objArr.length);
                    for (Object add : objArr) {
                        this.f49032a.add(add);
                    }
                }
            } else if (obj instanceof Collection) {
                this.f49032a.addAll((Collection) obj);
            } else if (obj instanceof Iterable) {
                for (Object add2 : (Iterable) obj) {
                    this.f49032a.add(add2);
                }
            } else if (obj instanceof Iterator) {
                Iterator it = (Iterator) obj;
                while (it.hasNext()) {
                    this.f49032a.add(it.next());
                }
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Don't know how to spread ");
                stringBuilder.append(obj.getClass());
                throw new UnsupportedOperationException(stringBuilder.toString());
            }
        }
    }

    /* renamed from: a */
    public int m59869a() {
        return this.f49032a.size();
    }

    /* renamed from: b */
    public void m59872b(Object obj) {
        this.f49032a.add(obj);
    }

    /* renamed from: a */
    public Object[] m59871a(Object[] objArr) {
        return this.f49032a.toArray(objArr);
    }
}
