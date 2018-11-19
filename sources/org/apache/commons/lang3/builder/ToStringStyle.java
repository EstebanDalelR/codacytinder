package org.apache.commons.lang3.builder;

import com.tinder.api.ManagerWebServices;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;
import java.util.WeakHashMap;
import org.apache.commons.lang3.C15989c;
import org.apache.commons.lang3.ClassUtils;
import org.apache.commons.lang3.ObjectUtils;

public abstract class ToStringStyle implements Serializable {
    /* renamed from: a */
    public static final ToStringStyle f49656a = new DefaultToStringStyle();
    /* renamed from: b */
    public static final ToStringStyle f49657b = new MultiLineToStringStyle();
    /* renamed from: c */
    public static final ToStringStyle f49658c = new NoFieldNameToStringStyle();
    /* renamed from: d */
    public static final ToStringStyle f49659d = new ShortPrefixToStringStyle();
    /* renamed from: e */
    public static final ToStringStyle f49660e = new SimpleToStringStyle();
    /* renamed from: f */
    public static final ToStringStyle f49661f = new NoClassNameToStringStyle();
    /* renamed from: g */
    public static final ToStringStyle f49662g = new JsonToStringStyle();
    /* renamed from: h */
    private static final ThreadLocal<WeakHashMap<Object, Object>> f49663h = new ThreadLocal();
    private static final long serialVersionUID = -2587890625525655916L;
    /* renamed from: A */
    private String f49664A = "<";
    /* renamed from: B */
    private String f49665B = ">";
    /* renamed from: i */
    private boolean f49666i = true;
    /* renamed from: j */
    private boolean f49667j = true;
    /* renamed from: k */
    private boolean f49668k = false;
    /* renamed from: l */
    private boolean f49669l = true;
    /* renamed from: m */
    private String f49670m = "[";
    /* renamed from: n */
    private String f49671n = "]";
    /* renamed from: o */
    private String f49672o = "=";
    /* renamed from: p */
    private boolean f49673p = false;
    /* renamed from: q */
    private boolean f49674q = false;
    /* renamed from: r */
    private String f49675r = ",";
    /* renamed from: s */
    private String f49676s = "{";
    /* renamed from: t */
    private String f49677t = ",";
    /* renamed from: u */
    private boolean f49678u = true;
    /* renamed from: v */
    private String f49679v = "}";
    /* renamed from: w */
    private boolean f49680w = true;
    /* renamed from: x */
    private String f49681x = "<null>";
    /* renamed from: y */
    private String f49682y = "<size=";
    /* renamed from: z */
    private String f49683z = ">";

    private static final class DefaultToStringStyle extends ToStringStyle {
        private static final long serialVersionUID = 1;

        DefaultToStringStyle() {
        }

        private Object readResolve() {
            return ToStringStyle.f49656a;
        }
    }

    private static final class JsonToStringStyle extends ToStringStyle {
        private static final long serialVersionUID = 1;
        /* renamed from: h */
        private String f55124h = "\"";

        JsonToStringStyle() {
            m60688a(false);
            m60713c(false);
            m60708c("{");
            m60715d("}");
            m60662a("[");
            m60690b("]");
            m60724f(",");
            m60721e(":");
            m60726g(ManagerWebServices.NULL_STRING_VALUE);
            m60729j("\"<");
            m60730k(">\"");
            m60727h("\"<size=");
            m60728i(">\"");
        }

        /* renamed from: a */
        public void mo13448a(StringBuffer stringBuffer, String str, Object obj, Boolean bool) {
            if (str == null) {
                throw new UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
            } else if (m60689a(bool)) {
                super.mo13448a(stringBuffer, str, obj, bool);
            } else {
                throw new UnsupportedOperationException("FullDetail must be true when using JsonToStringStyle");
            }
        }

        /* renamed from: a */
        protected void mo13447a(StringBuffer stringBuffer, String str, char c) {
            m64478d(stringBuffer, String.valueOf(c));
        }

        /* renamed from: b */
        protected void mo13450b(StringBuffer stringBuffer, String str, Object obj) {
            if (obj == null) {
                m60665a(stringBuffer, str);
                return;
            }
            if (!(obj instanceof String)) {
                if (!(obj instanceof Character)) {
                    if (!(obj instanceof Number)) {
                        if (!(obj instanceof Boolean)) {
                            String obj2 = obj.toString();
                            if (!m64480m(obj2)) {
                                if (!m64479l(obj2)) {
                                    mo13450b(stringBuffer, str, obj2);
                                    return;
                                }
                            }
                            stringBuffer.append(obj);
                            return;
                        }
                    }
                    stringBuffer.append(obj);
                    return;
                }
            }
            m64478d(stringBuffer, obj.toString());
        }

        /* renamed from: l */
        private boolean m64479l(String str) {
            return (!str.startsWith(m60707c()) || str.startsWith(m60714d()) == null) ? null : true;
        }

        /* renamed from: m */
        private boolean m64480m(String str) {
            return (!str.startsWith(m60720e()) || str.endsWith(m60723f()) == null) ? null : true;
        }

        /* renamed from: d */
        private void m64478d(StringBuffer stringBuffer, String str) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("\"");
            stringBuilder.append(str);
            stringBuilder.append("\"");
            stringBuffer.append(stringBuilder.toString());
        }

        /* renamed from: b */
        protected void mo13449b(StringBuffer stringBuffer, String str) {
            if (str == null) {
                throw new UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f55124h);
            stringBuilder.append(str);
            stringBuilder.append(this.f55124h);
            super.mo13449b(stringBuffer, stringBuilder.toString());
        }

        private Object readResolve() {
            return ToStringStyle.f49662g;
        }
    }

    private static final class MultiLineToStringStyle extends ToStringStyle {
        private static final long serialVersionUID = 1;

        MultiLineToStringStyle() {
            m60708c("[");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(C15989c.f49693F);
            stringBuilder.append("  ");
            m60724f(stringBuilder.toString());
            m60722e(true);
            stringBuilder = new StringBuilder();
            stringBuilder.append(C15989c.f49693F);
            stringBuilder.append("]");
            m60715d(stringBuilder.toString());
        }

        private Object readResolve() {
            return ToStringStyle.f49657b;
        }
    }

    private static final class NoClassNameToStringStyle extends ToStringStyle {
        private static final long serialVersionUID = 1;

        NoClassNameToStringStyle() {
            m60688a(false);
            m60713c(false);
        }

        private Object readResolve() {
            return ToStringStyle.f49661f;
        }
    }

    private static final class NoFieldNameToStringStyle extends ToStringStyle {
        private static final long serialVersionUID = 1;

        NoFieldNameToStringStyle() {
            m60719d(false);
        }

        private Object readResolve() {
            return ToStringStyle.f49658c;
        }
    }

    private static final class ShortPrefixToStringStyle extends ToStringStyle {
        private static final long serialVersionUID = 1;

        ShortPrefixToStringStyle() {
            m60705b(true);
            m60713c(false);
        }

        private Object readResolve() {
            return ToStringStyle.f49659d;
        }
    }

    private static final class SimpleToStringStyle extends ToStringStyle {
        private static final long serialVersionUID = 1;

        SimpleToStringStyle() {
            m60688a(false);
            m60713c(false);
            m60719d(false);
            m60708c("");
            m60715d("");
        }

        private Object readResolve() {
            return ToStringStyle.f49660e;
        }
    }

    /* renamed from: a */
    static Map<Object, Object> m60657a() {
        return (Map) f49663h.get();
    }

    /* renamed from: a */
    static boolean m60658a(Object obj) {
        Map a = m60657a();
        return (a == null || a.containsKey(obj) == null) ? null : true;
    }

    /* renamed from: b */
    static void m60659b(Object obj) {
        if (obj != null) {
            if (m60657a() == null) {
                f49663h.set(new WeakHashMap());
            }
            m60657a().put(obj, null);
        }
    }

    /* renamed from: c */
    static void m60660c(Object obj) {
        if (obj != null) {
            Map a = m60657a();
            if (a != null) {
                a.remove(obj);
                if (a.isEmpty() != null) {
                    f49663h.remove();
                }
            }
        }
    }

    protected ToStringStyle() {
    }

    /* renamed from: a */
    public void m60664a(StringBuffer stringBuffer, Object obj) {
        if (obj != null) {
            m60710c(stringBuffer, obj);
            m60717d(stringBuffer, obj);
            m60691b(stringBuffer);
            if (this.f49673p != null) {
                m60716d(stringBuffer);
            }
        }
    }

    /* renamed from: b */
    public void m60692b(StringBuffer stringBuffer, Object obj) {
        if (!this.f49674q) {
            m60663a(stringBuffer);
        }
        m60709c(stringBuffer);
        m60660c(obj);
    }

    /* renamed from: a */
    protected void m60663a(StringBuffer stringBuffer) {
        int length = stringBuffer.length();
        int length2 = this.f49675r.length();
        if (length > 0 && length2 > 0 && length >= length2) {
            Object obj = null;
            for (int i = 0; i < length2; i++) {
                if (stringBuffer.charAt((length - 1) - i) != this.f49675r.charAt((length2 - 1) - i)) {
                    break;
                }
            }
            obj = 1;
            if (obj != null) {
                stringBuffer.setLength(length - length2);
            }
        }
    }

    /* renamed from: a */
    public void mo13448a(StringBuffer stringBuffer, String str, Object obj, Boolean bool) {
        mo13449b(stringBuffer, str);
        if (obj == null) {
            m60665a(stringBuffer, str);
        } else {
            m60674a(stringBuffer, str, obj, m60689a(bool));
        }
        m60711c(stringBuffer, str);
    }

    /* renamed from: a */
    protected void m60674a(StringBuffer stringBuffer, String str, Object obj, boolean z) {
        if (!m60658a(obj) || (obj instanceof Number) || (obj instanceof Boolean) || (obj instanceof Character)) {
            m60659b(obj);
            try {
                if (obj instanceof Collection) {
                    if (z) {
                        m60675a(stringBuffer, str, (Collection) obj);
                    } else {
                        m60694b(stringBuffer, str, ((Collection) obj).size());
                    }
                } else if (obj instanceof Map) {
                    if (z) {
                        m60676a(stringBuffer, str, (Map) obj);
                    } else {
                        m60694b(stringBuffer, str, ((Map) obj).size());
                    }
                } else if (obj instanceof long[]) {
                    if (z) {
                        m60684a(stringBuffer, str, (long[]) obj);
                    } else {
                        m60701b(stringBuffer, str, (long[]) obj);
                    }
                } else if (obj instanceof int[]) {
                    if (z) {
                        m60683a(stringBuffer, str, (int[]) obj);
                    } else {
                        m60700b(stringBuffer, str, (int[]) obj);
                    }
                } else if (obj instanceof short[]) {
                    if (z) {
                        m60686a(stringBuffer, str, (short[]) obj);
                    } else {
                        m60703b(stringBuffer, str, (short[]) obj);
                    }
                } else if (obj instanceof byte[]) {
                    if (z) {
                        m60679a(stringBuffer, str, (byte[]) obj);
                    } else {
                        m60696b(stringBuffer, str, (byte[]) obj);
                    }
                } else if (obj instanceof char[]) {
                    if (z) {
                        m60680a(stringBuffer, str, (char[]) obj);
                    } else {
                        m60697b(stringBuffer, str, (char[]) obj);
                    }
                } else if (obj instanceof double[]) {
                    if (z) {
                        m60681a(stringBuffer, str, (double[]) obj);
                    } else {
                        m60698b(stringBuffer, str, (double[]) obj);
                    }
                } else if (obj instanceof float[]) {
                    if (z) {
                        m60682a(stringBuffer, str, (float[]) obj);
                    } else {
                        m60699b(stringBuffer, str, (float[]) obj);
                    }
                } else if (obj instanceof boolean[]) {
                    if (z) {
                        m60687a(stringBuffer, str, (boolean[]) obj);
                    } else {
                        m60704b(stringBuffer, str, (boolean[]) obj);
                    }
                } else if (obj.getClass().isArray()) {
                    if (z) {
                        m60685a(stringBuffer, str, (Object[]) obj);
                    } else {
                        m60702b(stringBuffer, str, (Object[]) obj);
                    }
                } else if (z) {
                    mo13450b(stringBuffer, str, obj);
                } else {
                    m60712c(stringBuffer, str, obj);
                }
                m60660c(obj);
            } catch (Throwable th) {
                m60660c(obj);
            }
        } else {
            m60672a(stringBuffer, str, obj);
        }
    }

    /* renamed from: a */
    protected void m60672a(StringBuffer stringBuffer, String str, Object obj) {
        ObjectUtils.m60647a(stringBuffer, obj);
    }

    /* renamed from: b */
    protected void mo13450b(StringBuffer stringBuffer, String str, Object obj) {
        stringBuffer.append(obj);
    }

    /* renamed from: a */
    protected void m60675a(StringBuffer stringBuffer, String str, Collection<?> collection) {
        stringBuffer.append(collection);
    }

    /* renamed from: a */
    protected void m60676a(StringBuffer stringBuffer, String str, Map<?, ?> map) {
        stringBuffer.append(map);
    }

    /* renamed from: c */
    protected void m60712c(StringBuffer stringBuffer, String str, Object obj) {
        stringBuffer.append(this.f49664A);
        stringBuffer.append(m60661a(obj.getClass()));
        stringBuffer.append(this.f49665B);
    }

    /* renamed from: a */
    protected void m60671a(StringBuffer stringBuffer, String str, long j) {
        stringBuffer.append(j);
    }

    /* renamed from: a */
    protected void m60670a(StringBuffer stringBuffer, String str, int i) {
        stringBuffer.append(i);
    }

    /* renamed from: a */
    protected void m60677a(StringBuffer stringBuffer, String str, short s) {
        stringBuffer.append(s);
    }

    /* renamed from: a */
    protected void m60666a(StringBuffer stringBuffer, String str, byte b) {
        stringBuffer.append(b);
    }

    /* renamed from: a */
    protected void mo13447a(StringBuffer stringBuffer, String str, char c) {
        stringBuffer.append(c);
    }

    /* renamed from: a */
    protected void m60668a(StringBuffer stringBuffer, String str, double d) {
        stringBuffer.append(d);
    }

    /* renamed from: a */
    protected void m60669a(StringBuffer stringBuffer, String str, float f) {
        stringBuffer.append(f);
    }

    /* renamed from: a */
    protected void m60678a(StringBuffer stringBuffer, String str, boolean z) {
        stringBuffer.append(z);
    }

    /* renamed from: a */
    protected void m60685a(StringBuffer stringBuffer, String str, Object[] objArr) {
        stringBuffer.append(this.f49676s);
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (i > 0) {
                stringBuffer.append(this.f49677t);
            }
            if (obj == null) {
                m60665a(stringBuffer, str);
            } else {
                m60674a(stringBuffer, str, obj, this.f49678u);
            }
        }
        stringBuffer.append(this.f49679v);
    }

    /* renamed from: d */
    protected void m60718d(StringBuffer stringBuffer, String str, Object obj) {
        stringBuffer.append(this.f49676s);
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            Object obj2 = Array.get(obj, i);
            if (i > 0) {
                stringBuffer.append(this.f49677t);
            }
            if (obj2 == null) {
                m60665a(stringBuffer, str);
            } else {
                m60674a(stringBuffer, str, obj2, this.f49678u);
            }
        }
        stringBuffer.append(this.f49679v);
    }

    /* renamed from: b */
    protected void m60702b(StringBuffer stringBuffer, String str, Object[] objArr) {
        m60694b(stringBuffer, str, objArr.length);
    }

    /* renamed from: a */
    protected void m60684a(StringBuffer stringBuffer, String str, long[] jArr) {
        stringBuffer.append(this.f49676s);
        for (int i = 0; i < jArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(this.f49677t);
            }
            m60671a(stringBuffer, str, jArr[i]);
        }
        stringBuffer.append(this.f49679v);
    }

    /* renamed from: b */
    protected void m60701b(StringBuffer stringBuffer, String str, long[] jArr) {
        m60694b(stringBuffer, str, jArr.length);
    }

    /* renamed from: a */
    protected void m60683a(StringBuffer stringBuffer, String str, int[] iArr) {
        stringBuffer.append(this.f49676s);
        for (int i = 0; i < iArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(this.f49677t);
            }
            m60670a(stringBuffer, str, iArr[i]);
        }
        stringBuffer.append(this.f49679v);
    }

    /* renamed from: b */
    protected void m60700b(StringBuffer stringBuffer, String str, int[] iArr) {
        m60694b(stringBuffer, str, iArr.length);
    }

    /* renamed from: a */
    protected void m60686a(StringBuffer stringBuffer, String str, short[] sArr) {
        stringBuffer.append(this.f49676s);
        for (int i = 0; i < sArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(this.f49677t);
            }
            m60677a(stringBuffer, str, sArr[i]);
        }
        stringBuffer.append(this.f49679v);
    }

    /* renamed from: b */
    protected void m60703b(StringBuffer stringBuffer, String str, short[] sArr) {
        m60694b(stringBuffer, str, sArr.length);
    }

    /* renamed from: a */
    protected void m60679a(StringBuffer stringBuffer, String str, byte[] bArr) {
        stringBuffer.append(this.f49676s);
        for (int i = 0; i < bArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(this.f49677t);
            }
            m60666a(stringBuffer, str, bArr[i]);
        }
        stringBuffer.append(this.f49679v);
    }

    /* renamed from: b */
    protected void m60696b(StringBuffer stringBuffer, String str, byte[] bArr) {
        m60694b(stringBuffer, str, bArr.length);
    }

    /* renamed from: a */
    protected void m60680a(StringBuffer stringBuffer, String str, char[] cArr) {
        stringBuffer.append(this.f49676s);
        for (int i = 0; i < cArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(this.f49677t);
            }
            mo13447a(stringBuffer, str, cArr[i]);
        }
        stringBuffer.append(this.f49679v);
    }

    /* renamed from: b */
    protected void m60697b(StringBuffer stringBuffer, String str, char[] cArr) {
        m60694b(stringBuffer, str, cArr.length);
    }

    /* renamed from: a */
    protected void m60681a(StringBuffer stringBuffer, String str, double[] dArr) {
        stringBuffer.append(this.f49676s);
        for (int i = 0; i < dArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(this.f49677t);
            }
            m60668a(stringBuffer, str, dArr[i]);
        }
        stringBuffer.append(this.f49679v);
    }

    /* renamed from: b */
    protected void m60698b(StringBuffer stringBuffer, String str, double[] dArr) {
        m60694b(stringBuffer, str, dArr.length);
    }

    /* renamed from: a */
    protected void m60682a(StringBuffer stringBuffer, String str, float[] fArr) {
        stringBuffer.append(this.f49676s);
        for (int i = 0; i < fArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(this.f49677t);
            }
            m60669a(stringBuffer, str, fArr[i]);
        }
        stringBuffer.append(this.f49679v);
    }

    /* renamed from: b */
    protected void m60699b(StringBuffer stringBuffer, String str, float[] fArr) {
        m60694b(stringBuffer, str, fArr.length);
    }

    /* renamed from: a */
    protected void m60687a(StringBuffer stringBuffer, String str, boolean[] zArr) {
        stringBuffer.append(this.f49676s);
        for (int i = 0; i < zArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(this.f49677t);
            }
            m60678a(stringBuffer, str, zArr[i]);
        }
        stringBuffer.append(this.f49679v);
    }

    /* renamed from: b */
    protected void m60704b(StringBuffer stringBuffer, String str, boolean[] zArr) {
        m60694b(stringBuffer, str, zArr.length);
    }

    /* renamed from: c */
    protected void m60710c(StringBuffer stringBuffer, Object obj) {
        if (this.f49667j && obj != null) {
            m60659b(obj);
            if (this.f49668k) {
                stringBuffer.append(m60661a(obj.getClass()));
            } else {
                stringBuffer.append(obj.getClass().getName());
            }
        }
    }

    /* renamed from: d */
    protected void m60717d(StringBuffer stringBuffer, Object obj) {
        if (m60706b() && obj != null) {
            m60659b(obj);
            stringBuffer.append('@');
            stringBuffer.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    /* renamed from: b */
    protected void m60691b(StringBuffer stringBuffer) {
        stringBuffer.append(this.f49670m);
    }

    /* renamed from: c */
    protected void m60709c(StringBuffer stringBuffer) {
        stringBuffer.append(this.f49671n);
    }

    /* renamed from: a */
    protected void m60665a(StringBuffer stringBuffer, String str) {
        stringBuffer.append(this.f49681x);
    }

    /* renamed from: d */
    protected void m60716d(StringBuffer stringBuffer) {
        stringBuffer.append(this.f49675r);
    }

    /* renamed from: b */
    protected void mo13449b(StringBuffer stringBuffer, String str) {
        if (this.f49666i && str != null) {
            stringBuffer.append(str);
            stringBuffer.append(this.f49672o);
        }
    }

    /* renamed from: c */
    protected void m60711c(StringBuffer stringBuffer, String str) {
        m60716d(stringBuffer);
    }

    /* renamed from: b */
    protected void m60694b(StringBuffer stringBuffer, String str, int i) {
        stringBuffer.append(this.f49682y);
        stringBuffer.append(i);
        stringBuffer.append(this.f49683z);
    }

    /* renamed from: a */
    protected boolean m60689a(Boolean bool) {
        if (bool == null) {
            return this.f49680w;
        }
        return bool.booleanValue();
    }

    /* renamed from: a */
    protected String m60661a(Class<?> cls) {
        return ClassUtils.m60645a((Class) cls);
    }

    /* renamed from: a */
    protected void m60688a(boolean z) {
        this.f49667j = z;
    }

    /* renamed from: b */
    protected void m60705b(boolean z) {
        this.f49668k = z;
    }

    /* renamed from: b */
    protected boolean m60706b() {
        return this.f49669l;
    }

    /* renamed from: c */
    protected void m60713c(boolean z) {
        this.f49669l = z;
    }

    /* renamed from: d */
    protected void m60719d(boolean z) {
        this.f49666i = z;
    }

    /* renamed from: c */
    protected String m60707c() {
        return this.f49676s;
    }

    /* renamed from: a */
    protected void m60662a(String str) {
        if (str == null) {
            str = "";
        }
        this.f49676s = str;
    }

    /* renamed from: d */
    protected String m60714d() {
        return this.f49679v;
    }

    /* renamed from: b */
    protected void m60690b(String str) {
        if (str == null) {
            str = "";
        }
        this.f49679v = str;
    }

    /* renamed from: e */
    protected String m60720e() {
        return this.f49670m;
    }

    /* renamed from: c */
    protected void m60708c(String str) {
        if (str == null) {
            str = "";
        }
        this.f49670m = str;
    }

    /* renamed from: f */
    protected String m60723f() {
        return this.f49671n;
    }

    /* renamed from: d */
    protected void m60715d(String str) {
        if (str == null) {
            str = "";
        }
        this.f49671n = str;
    }

    /* renamed from: e */
    protected void m60721e(String str) {
        if (str == null) {
            str = "";
        }
        this.f49672o = str;
    }

    /* renamed from: f */
    protected void m60724f(String str) {
        if (str == null) {
            str = "";
        }
        this.f49675r = str;
    }

    /* renamed from: e */
    protected void m60722e(boolean z) {
        this.f49673p = z;
    }

    /* renamed from: g */
    protected String m60725g() {
        return this.f49681x;
    }

    /* renamed from: g */
    protected void m60726g(String str) {
        if (str == null) {
            str = "";
        }
        this.f49681x = str;
    }

    /* renamed from: h */
    protected void m60727h(String str) {
        if (str == null) {
            str = "";
        }
        this.f49682y = str;
    }

    /* renamed from: i */
    protected void m60728i(String str) {
        if (str == null) {
            str = "";
        }
        this.f49683z = str;
    }

    /* renamed from: j */
    protected void m60729j(String str) {
        if (str == null) {
            str = "";
        }
        this.f49664A = str;
    }

    /* renamed from: k */
    protected void m60730k(String str) {
        if (str == null) {
            str = "";
        }
        this.f49665B = str;
    }
}
