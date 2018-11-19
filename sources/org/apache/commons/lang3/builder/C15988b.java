package org.apache.commons.lang3.builder;

import java.util.Iterator;
import java.util.List;

/* renamed from: org.apache.commons.lang3.builder.b */
public class C15988b implements Iterable<Diff<?>> {
    /* renamed from: a */
    private final List<Diff<?>> f49684a;
    /* renamed from: b */
    private final Object f49685b;
    /* renamed from: c */
    private final Object f49686c;
    /* renamed from: d */
    private final ToStringStyle f49687d;

    public String toString() {
        return m60731a(this.f49687d);
    }

    /* renamed from: a */
    public String m60731a(ToStringStyle toStringStyle) {
        if (this.f49684a.size() == 0) {
            return "";
        }
        C17717f c17717f = new C17717f(this.f49685b, toStringStyle);
        C17717f c17717f2 = new C17717f(this.f49686c, toStringStyle);
        for (Diff diff : this.f49684a) {
            c17717f.m64552a(diff.m64477a(), diff.m60770b());
            c17717f2.m64552a(diff.m64477a(), diff.m60771c());
        }
        return String.format("%s %s %s", new Object[]{c17717f.m64556h(), "differs from", c17717f2.m64556h()});
    }

    public Iterator<Diff<?>> iterator() {
        return this.f49684a.iterator();
    }
}
