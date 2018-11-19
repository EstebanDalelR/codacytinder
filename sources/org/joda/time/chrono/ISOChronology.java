package org.joda.time.chrono;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.C19304a;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.AssembledChronology.C19307a;
import org.joda.time.field.C19798c;
import org.joda.time.field.C19801h;

public final class ISOChronology extends AssembledChronology {
    /* renamed from: a */
    private static final ISOChronology f61907a = new ISOChronology(GregorianChronology.m71686Z());
    /* renamed from: b */
    private static final ConcurrentHashMap<DateTimeZone, ISOChronology> f61908b = new ConcurrentHashMap();
    private static final long serialVersionUID = -6212696554273812441L;

    private static final class Stub implements Serializable {
        private static final long serialVersionUID = -6212696554273812441L;
        /* renamed from: a */
        private transient DateTimeZone f60147a;

        Stub(DateTimeZone dateTimeZone) {
            this.f60147a = dateTimeZone;
        }

        private Object readResolve() {
            return ISOChronology.m71190b(this.f60147a);
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeObject(this.f60147a);
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            this.f60147a = (DateTimeZone) objectInputStream.readObject();
        }
    }

    static {
        f61908b.put(DateTimeZone.f8461a, f61907a);
    }

    /* renamed from: N */
    public static ISOChronology m71188N() {
        return f61907a;
    }

    /* renamed from: O */
    public static ISOChronology m71189O() {
        return m71190b(DateTimeZone.a());
    }

    /* renamed from: b */
    public static ISOChronology m71190b(DateTimeZone dateTimeZone) {
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.a();
        }
        ISOChronology iSOChronology = (ISOChronology) f61908b.get(dateTimeZone);
        if (iSOChronology != null) {
            return iSOChronology;
        }
        iSOChronology = new ISOChronology(ZonedChronology.m71234a(f61907a, dateTimeZone));
        ISOChronology iSOChronology2 = (ISOChronology) f61908b.putIfAbsent(dateTimeZone, iSOChronology);
        return iSOChronology2 != null ? iSOChronology2 : iSOChronology;
    }

    private ISOChronology(C19304a c19304a) {
        super(c19304a, null);
    }

    /* renamed from: b */
    public C19304a mo14712b() {
        return f61907a;
    }

    /* renamed from: a */
    public C19304a mo14711a(DateTimeZone dateTimeZone) {
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.a();
        }
        if (dateTimeZone == mo14710a()) {
            return this;
        }
        return m71190b(dateTimeZone);
    }

    public String toString() {
        String str = "ISOChronology";
        DateTimeZone a = mo14710a();
        if (a == null) {
            return str;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append('[');
        stringBuilder.append(a.e());
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    /* renamed from: a */
    protected void mo14802a(C19307a c19307a) {
        if (m70691L().mo14710a() == DateTimeZone.f8461a) {
            c19307a.f60117H = new C19798c(C19797n.f61927a, DateTimeFieldType.m68896v(), 100);
            c19307a.f60129k = c19307a.f60117H.mo14548d();
            c19307a.f60116G = new C19801h((C19798c) c19307a.f60117H, DateTimeFieldType.m68895u());
            c19307a.f60112C = new C19801h((C19798c) c19307a.f60117H, c19307a.f60126h, DateTimeFieldType.m68891q());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ISOChronology)) {
            return null;
        }
        return mo14710a().equals(((ISOChronology) obj).mo14710a());
    }

    public int hashCode() {
        return ("ISO".hashCode() * 11) + mo14710a().hashCode();
    }

    private Object writeReplace() {
        return new Stub(mo14710a());
    }
}
