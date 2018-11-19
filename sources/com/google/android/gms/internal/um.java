package com.google.android.gms.internal;

import com.google.android.gms.internal.xp.C8183b;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class um<P> {
    /* renamed from: a */
    private static final Charset f16577a = Charset.forName("UTF-8");
    /* renamed from: b */
    private ConcurrentMap<String, List<un<P>>> f16578b = new ConcurrentHashMap();
    /* renamed from: c */
    private un<P> f16579c;

    /* renamed from: a */
    public final un<P> m20227a() {
        return this.f16579c;
    }

    /* renamed from: a */
    protected final un<P> m20228a(P p, C8183b c8183b) throws GeneralSecurityException {
        ByteBuffer allocate;
        byte b;
        byte[] bArr;
        switch (uh.f16574a[c8183b.m34844e().ordinal()]) {
            case 1:
            case 2:
                allocate = ByteBuffer.allocate(5);
                b = (byte) 0;
                break;
            case 3:
                allocate = ByteBuffer.allocate(5);
                b = (byte) 1;
                break;
            case 4:
                bArr = ug.f16573a;
                break;
            default:
                throw new GeneralSecurityException("unknown output prefix type");
        }
        bArr = allocate.put(b).putInt(c8183b.m34843d()).array();
        un<P> unVar = new un(p, bArr, c8183b.m34842c(), c8183b.m34844e());
        List arrayList = new ArrayList();
        arrayList.add(unVar);
        String str = new String(unVar.m20231b(), f16577a);
        arrayList = (List) this.f16578b.put(str, Collections.unmodifiableList(arrayList));
        if (arrayList != null) {
            List arrayList2 = new ArrayList();
            arrayList2.addAll(arrayList);
            arrayList2.add(unVar);
            this.f16578b.put(str, Collections.unmodifiableList(arrayList2));
        }
        return unVar;
    }

    /* renamed from: a */
    protected final void m20229a(un<P> unVar) {
        this.f16579c = unVar;
    }
}
