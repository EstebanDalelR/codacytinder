package com.google.android.m4b.maps.ct;

import com.google.android.m4b.maps.ct.C5273l.C5271a;
import com.google.android.m4b.maps.ct.C5299z.C5296a;
import com.google.android.m4b.maps.ct.C5299z.C5297b;
import com.google.android.m4b.maps.ct.C5299z.C5298c;
import com.google.android.m4b.maps.ct.C6652n.C5276b;
import com.google.android.m4b.maps.ct.C6656q.C6655a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: com.google.android.m4b.maps.ct.i */
final class C5265i<FieldDescriptorType extends C5264a<FieldDescriptorType>> {
    /* renamed from: d */
    private static final C5265i f19569d = new C5265i((byte) 0);
    /* renamed from: a */
    private final C5289v<FieldDescriptorType, Object> f19570a = C5289v.m23447a(16);
    /* renamed from: b */
    private boolean f19571b;
    /* renamed from: c */
    private boolean f19572c = false;

    /* renamed from: com.google.android.m4b.maps.ct.i$a */
    public interface C5264a<T extends C5264a<T>> extends Comparable<T> {
        /* renamed from: a */
        int mo5370a();

        /* renamed from: a */
        C6655a mo5371a(C6655a c6655a, C6656q c6656q);

        /* renamed from: a */
        C7529s mo5372a(C7529s c7529s, C7529s c7529s2);

        /* renamed from: b */
        C5296a mo5373b();

        /* renamed from: c */
        C5297b mo5374c();

        /* renamed from: d */
        boolean mo5375d();

        /* renamed from: e */
        boolean mo5376e();
    }

    public final /* synthetic */ Object clone() {
        return m23400d();
    }

    private C5265i() {
    }

    private C5265i(byte b) {
        m23397b();
    }

    /* renamed from: a */
    public static <T extends C5264a<T>> C5265i<T> m23382a() {
        return new C5265i();
    }

    /* renamed from: b */
    public final void m23397b() {
        if (!this.f19571b) {
            this.f19570a.mo5388a();
            this.f19571b = true;
        }
    }

    /* renamed from: c */
    public final boolean m23399c() {
        return this.f19571b;
    }

    /* renamed from: e */
    public final Iterator<Entry<FieldDescriptorType, Object>> m23401e() {
        if (this.f19572c) {
            return new C5276b(this.f19570a.entrySet().iterator());
        }
        return this.f19570a.entrySet().iterator();
    }

    /* renamed from: a */
    public final Object m23394a(FieldDescriptorType fieldDescriptorType) {
        fieldDescriptorType = this.f19570a.get(fieldDescriptorType);
        return fieldDescriptorType instanceof C6652n ? ((C6652n) fieldDescriptorType).m29684b() : fieldDescriptorType;
    }

    /* renamed from: a */
    public final void m23395a(FieldDescriptorType fieldDescriptorType, Object obj) {
        if (!fieldDescriptorType.mo5375d()) {
            C5265i.m23388a(fieldDescriptorType.mo5373b(), obj);
        } else if (obj instanceof List) {
            List<Object> arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            for (Object a : arrayList) {
                C5265i.m23388a(fieldDescriptorType.mo5373b(), a);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof C6652n) {
            this.f19572c = true;
        }
        this.f19570a.m23455a((Comparable) fieldDescriptorType, obj);
    }

    /* renamed from: b */
    public final void m23398b(FieldDescriptorType fieldDescriptorType, Object obj) {
        if (fieldDescriptorType.mo5375d()) {
            List arrayList;
            C5265i.m23388a(fieldDescriptorType.mo5373b(), obj);
            Object a = m23394a((C5264a) fieldDescriptorType);
            if (a == null) {
                arrayList = new ArrayList();
                this.f19570a.m23455a((Comparable) fieldDescriptorType, (Object) arrayList);
            } else {
                arrayList = (List) a;
            }
            arrayList.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private static void m23388a(com.google.android.m4b.maps.ct.C5299z.C5296a r2, java.lang.Object r3) {
        /*
        if (r3 != 0) goto L_0x0008;
    L_0x0002:
        r2 = new java.lang.NullPointerException;
        r2.<init>();
        throw r2;
    L_0x0008:
        r0 = com.google.android.m4b.maps.ct.C5265i.C52631.f19567a;
        r2 = r2.m23478a();
        r2 = r2.ordinal();
        r2 = r0[r2];
        r0 = 1;
        r1 = 0;
        switch(r2) {
            case 1: goto L_0x0045;
            case 2: goto L_0x0042;
            case 3: goto L_0x003f;
            case 4: goto L_0x003c;
            case 5: goto L_0x0039;
            case 6: goto L_0x0036;
            case 7: goto L_0x002d;
            case 8: goto L_0x0023;
            case 9: goto L_0x001a;
            default: goto L_0x0019;
        };
    L_0x0019:
        goto L_0x0048;
    L_0x001a:
        r2 = r3 instanceof com.google.android.m4b.maps.ct.C6656q;
        if (r2 != 0) goto L_0x002b;
    L_0x001e:
        r2 = r3 instanceof com.google.android.m4b.maps.ct.C6652n;
        if (r2 == 0) goto L_0x0048;
    L_0x0022:
        goto L_0x002b;
    L_0x0023:
        r2 = r3 instanceof java.lang.Integer;
        if (r2 != 0) goto L_0x002b;
    L_0x0027:
        r2 = r3 instanceof com.google.android.m4b.maps.ct.C5273l.C5271a;
        if (r2 == 0) goto L_0x0048;
    L_0x002b:
        r1 = 1;
        goto L_0x0048;
    L_0x002d:
        r2 = r3 instanceof com.google.android.m4b.maps.ct.C5255d;
        if (r2 != 0) goto L_0x002b;
    L_0x0031:
        r2 = r3 instanceof byte[];
        if (r2 == 0) goto L_0x0048;
    L_0x0035:
        goto L_0x002b;
    L_0x0036:
        r0 = r3 instanceof java.lang.String;
        goto L_0x0047;
    L_0x0039:
        r0 = r3 instanceof java.lang.Boolean;
        goto L_0x0047;
    L_0x003c:
        r0 = r3 instanceof java.lang.Double;
        goto L_0x0047;
    L_0x003f:
        r0 = r3 instanceof java.lang.Float;
        goto L_0x0047;
    L_0x0042:
        r0 = r3 instanceof java.lang.Long;
        goto L_0x0047;
    L_0x0045:
        r0 = r3 instanceof java.lang.Integer;
    L_0x0047:
        r1 = r0;
    L_0x0048:
        if (r1 != 0) goto L_0x0052;
    L_0x004a:
        r2 = new java.lang.IllegalArgumentException;
        r3 = "Wrong object type used with protocol message reflection.";
        r2.<init>(r3);
        throw r2;
    L_0x0052:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.ct.i.a(com.google.android.m4b.maps.ct.z$a, java.lang.Object):void");
    }

    /* renamed from: f */
    public final boolean m23402f() {
        for (int i = 0; i < this.f19570a.m23459c(); i++) {
            if (!C5265i.m23389a(this.f19570a.m23457b(i))) {
                return false;
            }
        }
        for (Entry a : this.f19570a.m23460d()) {
            if (!C5265i.m23389a(a)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m23389a(Entry<FieldDescriptorType, Object> entry) {
        C5264a c5264a = (C5264a) entry.getKey();
        if (c5264a.mo5374c() == C5297b.MESSAGE) {
            if (c5264a.mo5375d()) {
                for (C6656q j : (List) entry.getValue()) {
                    if (!j.mo7578j()) {
                        return false;
                    }
                }
            }
            entry = entry.getValue();
            if (entry instanceof C6656q) {
                if (((C6656q) entry).mo7578j() == null) {
                    return false;
                }
            } else if ((entry instanceof C6652n) != null) {
                return true;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }
        return true;
    }

    /* renamed from: a */
    static int m23381a(C5296a c5296a, boolean z) {
        return z ? 2 : c5296a.m23479b();
    }

    /* renamed from: a */
    public final void m23396a(C5265i<FieldDescriptorType> c5265i) {
        for (int i = 0; i < c5265i.f19570a.m23459c(); i++) {
            m23391b(c5265i.f19570a.m23457b(i));
        }
        for (FieldDescriptorType b : c5265i.f19570a.m23460d()) {
            m23391b(b);
        }
    }

    /* renamed from: a */
    private static Object m23384a(Object obj) {
        if (obj instanceof C7529s) {
            return ((C7529s) obj).mo7572b();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        Object obj2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, obj2, 0, bArr.length);
        return obj2;
    }

    /* renamed from: b */
    private void m23391b(Entry<FieldDescriptorType, Object> entry) {
        Comparable comparable = (C5264a) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C6652n) {
            value = ((C6652n) value).m29684b();
        }
        Object a;
        if (comparable.mo5375d()) {
            a = m23394a((C5264a) comparable);
            if (a == null) {
                a = new ArrayList();
            }
            for (Object a2 : (List) value) {
                ((List) a).add(C5265i.m23384a(a2));
            }
            this.f19570a.m23455a(comparable, a);
            return;
        }
        if (comparable.mo5374c() == C5297b.MESSAGE) {
            a = m23394a((C5264a) comparable);
            if (a == null) {
                this.f19570a.m23455a(comparable, C5265i.m23384a(value));
            } else {
                if (a instanceof C7529s) {
                    value = comparable.mo5372a((C7529s) a, (C7529s) value);
                } else {
                    value = comparable.mo5371a(((C6656q) a).mo7580l(), (C6656q) value).mo7577g();
                }
                this.f19570a.m23455a(comparable, value);
                return;
            }
        }
        this.f19570a.m23455a(comparable, C5265i.m23384a(value));
    }

    /* renamed from: a */
    public static Object m23383a(C5257e c5257e, C5296a c5296a, boolean z) {
        return C5299z.m23484a(c5257e, c5296a, C5298c.LOOSE);
    }

    /* renamed from: a */
    private static void m23385a(C5259f c5259f, C5296a c5296a, int i, Object obj) {
        if (c5296a == C5296a.GROUP) {
            C6656q c6656q = (C6656q) obj;
            if (C5273l.m23408a(c6656q) != null) {
                c5259f.m23360b(i, 3);
                c6656q.mo7636a(c5259f);
                return;
            }
            c5259f.m23360b(i, 3);
            c6656q.mo7636a(c5259f);
            c5259f.m23360b(i, 4);
            return;
        }
        c5259f.m23360b(i, C5265i.m23381a(c5296a, false));
        C5265i.m23386a(c5259f, c5296a, obj);
    }

    /* renamed from: a */
    private static void m23386a(C5259f c5259f, C5296a c5296a, Object obj) {
        switch (c5296a) {
            case DOUBLE:
                c5259f.m23366g(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                return;
            case FLOAT:
                c5259f.m23370m(Float.floatToRawIntBits(((Float) obj).floatValue()));
                return;
            case INT64:
                c5259f.m23365f(((Long) obj).longValue());
                return;
            case UINT64:
                c5259f.m23355a(((Long) obj).longValue());
                return;
            case INT32:
                c5259f.m23351a(((Integer) obj).intValue());
                return;
            case FIXED64:
                c5259f.m23361b(((Long) obj).longValue());
                return;
            case FIXED32:
                c5259f.m23359b(((Integer) obj).intValue());
                return;
            case BOOL:
                c5259f.m23368i(((Boolean) obj).booleanValue());
                return;
            case GROUP:
                ((C6656q) obj).mo7636a(c5259f);
                return;
            case MESSAGE:
                c5259f.m23357a((C6656q) obj);
                return;
            case STRING:
                if ((obj instanceof C5255d) != null) {
                    c5259f.m23356a((C5255d) obj);
                    return;
                } else {
                    c5259f.m23358a((String) obj);
                    return;
                }
            case BYTES:
                if ((obj instanceof C5255d) != null) {
                    c5259f.m23356a((C5255d) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                c5259f.m23369k(bArr.length);
                c5259f.m23363c(bArr);
                return;
            case UINT32:
                c5259f.m23362c(((Integer) obj).intValue());
                return;
            case SFIXED32:
                c5259f.m23370m(((Integer) obj).intValue());
                return;
            case SFIXED64:
                c5259f.m23366g(((Long) obj).longValue());
                return;
            case SINT32:
                c5259f.m23369k(C5259f.m23350n(((Integer) obj).intValue()));
                return;
            case SINT64:
                c5259f.m23365f(C5259f.m23346h(((Long) obj).longValue()));
                return;
            case ENUM:
                if ((obj instanceof C5271a) == null) {
                    c5259f.m23364d(((Integer) obj).intValue());
                    break;
                } else {
                    c5259f.m23364d(((C5271a) obj).m23406a());
                    return;
                }
            default:
                break;
        }
    }

    /* renamed from: a */
    public static void m23387a(C5264a<?> c5264a, Object obj, C5259f c5259f) {
        C5296a b = c5264a.mo5373b();
        int a = c5264a.mo5370a();
        if (c5264a.mo5375d()) {
            List<Object> list = (List) obj;
            if (c5264a.mo5376e() != null) {
                c5259f.m23360b(a, 2);
                c5264a = null;
                for (Object b2 : list) {
                    c5264a += C5265i.m23390b(b, b2);
                }
                c5259f.m23369k(c5264a);
                for (Object obj2 : list) {
                    C5265i.m23386a(c5259f, b, obj2);
                }
            } else {
                for (Object obj22 : list) {
                    C5265i.m23385a(c5259f, b, a, obj22);
                }
            }
        } else if ((obj22 instanceof C6652n) != null) {
            C5265i.m23385a(c5259f, b, a, ((C6652n) obj22).m29684b());
        } else {
            C5265i.m23385a(c5259f, b, a, obj22);
        }
    }

    /* renamed from: g */
    public final int m23403g() {
        int i = 0;
        for (int i2 = 0; i2 < this.f19570a.m23459c(); i2++) {
            Entry b = this.f19570a.m23457b(i2);
            i += C5265i.m23392c((C5264a) b.getKey(), b.getValue());
        }
        for (Entry b2 : this.f19570a.m23460d()) {
            i += C5265i.m23392c((C5264a) b2.getKey(), b2.getValue());
        }
        return i;
    }

    /* renamed from: h */
    public final int m23404h() {
        int i = 0;
        for (int i2 = 0; i2 < this.f19570a.m23459c(); i2++) {
            i += C5265i.m23393c(this.f19570a.m23457b(i2));
        }
        for (Entry c : this.f19570a.m23460d()) {
            i += C5265i.m23393c(c);
        }
        return i;
    }

    /* renamed from: c */
    private static int m23393c(Entry<FieldDescriptorType, Object> entry) {
        C5264a c5264a = (C5264a) entry.getKey();
        Object value = entry.getValue();
        if (c5264a.mo5374c() != C5297b.MESSAGE || c5264a.mo5375d() || c5264a.mo5376e()) {
            return C5265i.m23392c(c5264a, value);
        }
        if (value instanceof C6652n) {
            return C5259f.m23325b(((C5264a) entry.getKey()).mo5370a(), (C6652n) value);
        }
        return C5259f.m23319a(((C5264a) entry.getKey()).mo5370a(), (C6656q) value);
    }

    /* renamed from: a */
    private static int m23380a(C5296a c5296a, int i, Object obj) {
        i = C5259f.m23348j(i);
        if (c5296a == C5296a.GROUP && !C5273l.m23408a((C6656q) obj)) {
            i *= 2;
        }
        return i + C5265i.m23390b(c5296a, obj);
    }

    /* renamed from: b */
    private static int m23390b(C5296a c5296a, Object obj) {
        switch (c5296a) {
            case DOUBLE:
                ((Double) obj).doubleValue();
                return C5259f.m23316a();
            case FLOAT:
                ((Float) obj).floatValue();
                return C5259f.m23322b();
            case INT64:
                return C5259f.m23337d(((Long) obj).longValue());
            case UINT64:
                return C5259f.m23334c(((Long) obj).longValue());
            case INT32:
                return C5259f.m23339e(((Integer) obj).intValue());
            case FIXED64:
                ((Long) obj).longValue();
                return C5259f.m23331c();
            case FIXED32:
                ((Integer) obj).intValue();
                return C5259f.m23336d();
            case BOOL:
                ((Boolean) obj).booleanValue();
                return C5259f.m23338e();
            case GROUP:
                return C5259f.m23328b((C6656q) obj);
            case MESSAGE:
                if ((obj instanceof C6652n) != null) {
                    return C5259f.m23320a((C6652n) obj);
                }
                return C5259f.m23335c((C6656q) obj);
            case STRING:
                if ((obj instanceof C5255d) != null) {
                    return C5259f.m23327b((C5255d) obj);
                }
                return C5259f.m23329b((String) obj);
            case BYTES:
                if ((obj instanceof C5255d) != null) {
                    return C5259f.m23327b((C5255d) obj);
                }
                return C5259f.m23330b((byte[]) obj);
            case UINT32:
                return C5259f.m23342f(((Integer) obj).intValue());
            case SFIXED32:
                ((Integer) obj).intValue();
                return C5259f.m23341f();
            case SFIXED64:
                ((Long) obj).longValue();
                return C5259f.m23343g();
            case SINT32:
                return C5259f.m23345h(((Integer) obj).intValue());
            case SINT64:
                return C5259f.m23340e(((Long) obj).longValue());
            case ENUM:
                if ((obj instanceof C5271a) != null) {
                    return C5259f.m23344g(((C5271a) obj).m23406a());
                }
                return C5259f.m23344g(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: c */
    private static int m23392c(C5264a<?> c5264a, Object obj) {
        C5296a b = c5264a.mo5373b();
        int a = c5264a.mo5370a();
        if (!c5264a.mo5375d()) {
            return C5265i.m23380a(b, a, obj);
        }
        int i = 0;
        if (c5264a.mo5376e() != null) {
            for (Object obj2 : (List) obj2) {
                i += C5265i.m23390b(b, obj2);
            }
            return (C5259f.m23348j(a) + i) + C5259f.m23349l(i);
        }
        for (Object obj22 : (List) obj22) {
            i += C5265i.m23380a(b, a, obj22);
        }
        return i;
    }

    /* renamed from: d */
    public final C5265i<FieldDescriptorType> m23400d() {
        C5265i<FieldDescriptorType> c5265i = new C5265i();
        for (int i = 0; i < this.f19570a.m23459c(); i++) {
            Entry b = this.f19570a.m23457b(i);
            c5265i.m23395a((C5264a) b.getKey(), b.getValue());
        }
        for (Entry b2 : this.f19570a.m23460d()) {
            c5265i.m23395a((C5264a) b2.getKey(), b2.getValue());
        }
        c5265i.f19572c = this.f19572c;
        return c5265i;
    }
}
