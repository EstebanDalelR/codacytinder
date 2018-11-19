package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.aa.af.C4540a;
import com.google.android.m4b.maps.aa.ak.C4545a;
import com.google.android.m4b.maps.aa.ak.C4546c;
import com.google.android.m4b.maps.p125y.C5569h;
import com.google.android.m4b.maps.p125y.C5571j;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;

public class am<K, V> extends ak<K, V> implements ay {
    private static final long serialVersionUID = 0;
    /* renamed from: b */
    private final transient al<V> f28837b;

    /* renamed from: com.google.android.m4b.maps.aa.am$a */
    public static final class C6309a<K, V> extends C4545a<K, V> {
        public C6309a() {
            this.a = new C8045b();
        }

        /* renamed from: a */
        public final C6309a<K, V> m27708a(K k, V v) {
            this.a.mo4834a(C5571j.m24292a((Object) k), C5571j.m24292a((Object) v));
            return this;
        }

        /* renamed from: a */
        public final am<K, V> m27709a() {
            return am.m34125a(this.a, null);
        }
    }

    /* renamed from: com.google.android.m4b.maps.aa.am$b */
    static class C8045b<K, V> extends C7418c<K, V> {
        private static final long serialVersionUID = 0;

        C8045b() {
            super(new LinkedHashMap());
        }

        /* renamed from: d */
        final Collection<V> mo7523d() {
            return new LinkedHashSet();
        }
    }

    /* renamed from: a */
    public final /* synthetic */ Collection mo6988a(Object obj) {
        return m34126c(obj);
    }

    /* renamed from: b */
    public final /* synthetic */ aa mo7524b(Object obj) {
        return m34126c(obj);
    }

    /* renamed from: d */
    public static <K, V> am<K, V> m34127d() {
        return C8196n.f29332b;
    }

    /* renamed from: e */
    public static <K, V> C6309a<K, V> m34128e() {
        return new C6309a();
    }

    am(af<K, al<V>> afVar, int i, Comparator<? super V> comparator) {
        super(afVar, i);
        this.f28837b = m34123a((Comparator) comparator);
    }

    /* renamed from: c */
    private al<V> m34126c(K k) {
        return (al) C5569h.m24285b((al) this.a.get(k), this.f28837b);
    }

    /* renamed from: a */
    private static <V> al<V> m34124a(Comparator<? super V> comparator, Collection<? extends V> collection) {
        return comparator == null ? al.m27701a((Collection) collection) : aq.m34145a((Comparator) comparator, (Collection) collection);
    }

    /* renamed from: a */
    private static <V> al<V> m34123a(Comparator<? super V> comparator) {
        return comparator == null ? al.m27704f() : aq.m34143a(comparator);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f28837b instanceof aq ? ((aq) this.f28837b).comparator() : null);
        objectOutputStream.writeInt(mo4836h().size());
        for (Entry entry : mo4836h().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(((Collection) entry.getValue()).size());
            for (Object writeObject : (Collection) entry.getValue()) {
                objectOutputStream.writeObject(writeObject);
            }
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        int readInt = objectInputStream.readInt();
        if (readInt < 0) {
            StringBuilder stringBuilder = new StringBuilder("Invalid key count ");
            stringBuilder.append(readInt);
            throw new InvalidObjectException(stringBuilder.toString());
        }
        C4540a e = af.m20493e();
        int i = 0;
        for (int i2 = 0; i2 < readInt; i2++) {
            Object readObject = objectInputStream.readObject();
            int readInt2 = objectInputStream.readInt();
            if (readInt2 <= 0) {
                stringBuilder = new StringBuilder("Invalid value count ");
                stringBuilder.append(readInt2);
                throw new InvalidObjectException(stringBuilder.toString());
            }
            Object[] objArr = new Object[readInt2];
            for (int i3 = 0; i3 < readInt2; i3++) {
                objArr[i3] = objectInputStream.readObject();
            }
            al a = m34124a(comparator, Arrays.asList(objArr));
            if (a.size() != objArr.length) {
                stringBuilder = new StringBuilder("Duplicate key-value pairs exist for key ");
                stringBuilder.append(readObject);
                throw new InvalidObjectException(stringBuilder.toString());
            }
            e.mo4792a(readObject, a);
            i += readInt2;
        }
        try {
            C4546c.f16867a.m20649a((Object) this, e.mo4795a());
            C4546c.f16868b.m20648a((Object) this, i);
            C4546c.f16869c.m20649a((Object) this, m34123a(comparator));
        } catch (ObjectInputStream objectInputStream2) {
            throw ((InvalidObjectException) new InvalidObjectException(objectInputStream2.getMessage()).initCause(objectInputStream2));
        }
    }

    /* renamed from: a */
    static /* synthetic */ am m34125a(ay ayVar, Comparator comparator) {
        C5571j.m24292a((Object) ayVar);
        if (ayVar.mo4835f() && comparator == null) {
            return C8196n.f29332b;
        }
        if (ayVar instanceof am) {
            am amVar = (am) ayVar;
            if (!amVar.f27148a.mo4780c()) {
                return amVar;
            }
        }
        C4540a e = af.m20493e();
        int i = 0;
        for (Entry entry : ayVar.mo4836h().entrySet()) {
            Object key = entry.getKey();
            al a = m34124a(comparator, (Collection) entry.getValue());
            if (!a.isEmpty()) {
                e.mo4792a(key, a);
                i += a.size();
            }
        }
        return new am(e.mo4795a(), i, comparator);
    }
}
