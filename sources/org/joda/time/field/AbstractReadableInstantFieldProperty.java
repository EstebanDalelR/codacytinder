package org.joda.time.field;

import java.io.Serializable;
import java.util.Locale;
import org.joda.time.C19304a;
import org.joda.time.C19305b;
import org.joda.time.DateTimeFieldType;

public abstract class AbstractReadableInstantFieldProperty implements Serializable {
    private static final long serialVersionUID = 1971226328211649661L;

    /* renamed from: a */
    public abstract C19305b mo14450a();

    /* renamed from: b */
    protected abstract long mo14451b();

    /* renamed from: d */
    public DateTimeFieldType m69080d() {
        return mo14450a().mo14534a();
    }

    /* renamed from: e */
    public String m69081e() {
        return mo14450a().mo14539b();
    }

    /* renamed from: c */
    protected C19304a mo14452c() {
        throw new UnsupportedOperationException("The method getChronology() was added in v1.4 and needs to be implemented by subclasses of AbstractReadableInstantFieldProperty");
    }

    /* renamed from: f */
    public int m69082f() {
        return mo14450a().mo14524a(mo14451b());
    }

    /* renamed from: a */
    public String m69074a(Locale locale) {
        return mo14450a().mo14532a(mo14451b(), locale);
    }

    /* renamed from: b */
    public String m69077b(Locale locale) {
        return mo14450a().mo14541b(mo14451b(), locale);
    }

    /* renamed from: g */
    public int m69083g() {
        return mo14450a().mo14553g();
    }

    /* renamed from: h */
    public int m69084h() {
        return mo14450a().mo14555h();
    }

    /* renamed from: i */
    public int m69085i() {
        return mo14450a().mo14544c(mo14451b());
    }

    /* renamed from: c */
    public int m69078c(Locale locale) {
        return mo14450a().mo14525a(locale);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractReadableInstantFieldProperty)) {
            return false;
        }
        AbstractReadableInstantFieldProperty abstractReadableInstantFieldProperty = (AbstractReadableInstantFieldProperty) obj;
        if (m69082f() != abstractReadableInstantFieldProperty.m69082f() || !m69080d().equals(abstractReadableInstantFieldProperty.m69080d()) || C19314d.m69092a(mo14452c(), abstractReadableInstantFieldProperty.mo14452c()) == null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((m69082f() * 17) + m69080d().hashCode()) + mo14452c().hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Property[");
        stringBuilder.append(m69081e());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
