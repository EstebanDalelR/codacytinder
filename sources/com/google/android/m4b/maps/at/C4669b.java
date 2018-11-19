package com.google.android.m4b.maps.at;

import com.tinder.domain.config.model.ProfileEditingConfig;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.m4b.maps.at.b */
public final class C4669b {
    /* renamed from: a */
    private Object[] f17124a;
    /* renamed from: b */
    private HashMap<Integer, Object> f17125b;
    /* renamed from: c */
    private int f17126c;
    /* renamed from: d */
    private int f17127d;
    /* renamed from: e */
    private int f17128e;

    /* renamed from: com.google.android.m4b.maps.at.b$a */
    public class C4668a {
        /* renamed from: a */
        private int f17120a = null;
        /* renamed from: b */
        private int f17121b = Integer.MIN_VALUE;
        /* renamed from: c */
        private Iterator<Integer> f17122c = null;
        /* renamed from: d */
        private /* synthetic */ C4669b f17123d;

        public C4668a(C4669b c4669b) {
            this.f17123d = c4669b;
        }

        /* renamed from: a */
        public final boolean m20867a() {
            if (this.f17121b != Integer.MIN_VALUE) {
                return true;
            }
            if (this.f17120a <= this.f17123d.f17126c) {
                while (this.f17120a <= this.f17123d.f17126c) {
                    if (this.f17123d.f17124a[this.f17120a] != null) {
                        int i = this.f17120a;
                        this.f17120a = i + 1;
                        this.f17121b = i;
                        return true;
                    }
                    this.f17120a++;
                }
            }
            if (this.f17123d.f17125b != null) {
                if (this.f17122c == null) {
                    this.f17122c = this.f17123d.f17125b.keySet().iterator();
                }
                if (this.f17122c.hasNext()) {
                    this.f17121b = ((Integer) this.f17122c.next()).intValue();
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        public final int m20868b() {
            if (m20867a()) {
                int i = this.f17121b;
                this.f17121b = Integer.MIN_VALUE;
                return i;
            }
            throw new NoSuchElementException();
        }
    }

    public C4669b() {
        this(ProfileEditingConfig.DEFAULT_MAX_LENGTH);
    }

    private C4669b(int i) {
        this.f17124a = new Object[(i > 0 ? Math.min(i, ProfileEditingConfig.DEFAULT_MAX_LENGTH) : 1)];
        this.f17128e = 0;
        this.f17127d = Integer.MIN_VALUE;
        this.f17126c = Integer.MIN_VALUE;
    }

    /* renamed from: a */
    public final C4669b m20872a() {
        return new C4669b(this.f17126c <= 0 ? ProfileEditingConfig.DEFAULT_MAX_LENGTH : this.f17126c + 1);
    }

    /* renamed from: b */
    public final C4668a m20875b() {
        return new C4668a(this);
    }

    /* renamed from: c */
    public final int m20877c() {
        return this.f17127d;
    }

    /* renamed from: d */
    public final void m20878d() {
        int i = 1;
        if (this.f17126c > 0) {
            i = 1 + this.f17126c;
        }
        Object obj = new Object[i];
        System.arraycopy(this.f17124a, 0, obj, 0, i);
        Arrays.fill(this.f17124a, null);
        this.f17124a = obj;
    }

    /* renamed from: e */
    public final int m20879e() {
        return this.f17125b == null ? this.f17128e : this.f17128e + this.f17125b.size();
    }

    /* renamed from: f */
    public final void m20880f() {
        for (int i = 0; i < this.f17124a.length; i++) {
            this.f17124a[i] = null;
        }
        if (this.f17125b != null) {
            this.f17125b.clear();
        }
        this.f17127d = Integer.MIN_VALUE;
        this.f17126c = Integer.MIN_VALUE;
        this.f17128e = 0;
    }

    /* renamed from: a */
    public final Object m20873a(int i) {
        if (i <= this.f17126c && i >= 0) {
            return this.f17124a[i];
        }
        if (i <= this.f17127d && this.f17125b != null) {
            return this.f17125b.get(Integer.valueOf(i));
        }
        return null;
    }

    /* renamed from: a */
    public final void m20874a(int i, Object obj) {
        if (obj == null) {
            m20876b(i);
            return;
        }
        if (i > this.f17127d) {
            this.f17127d = i;
        }
        if (i < 0 || i >= ProfileEditingConfig.DEFAULT_MAX_LENGTH) {
            if (this.f17125b == null) {
                this.f17125b = new HashMap();
            }
            this.f17125b.put(Integer.valueOf(i), obj);
        } else if (i >= this.f17124a.length) {
            int length = this.f17124a.length;
            do {
                length <<= 1;
            } while (length <= i);
            Object obj2 = new Object[Math.min(Math.max(length, 16), ProfileEditingConfig.DEFAULT_MAX_LENGTH)];
            obj2[i] = obj;
            this.f17126c = i;
            this.f17128e++;
            System.arraycopy(this.f17124a, 0, obj2, 0, this.f17124a.length);
            Arrays.fill(this.f17124a, null);
            this.f17124a = obj2;
        } else {
            if (i > this.f17126c) {
                this.f17126c = i;
            }
            if (this.f17124a[i] == null) {
                this.f17128e++;
            }
            this.f17124a[i] = obj;
        }
    }

    /* renamed from: b */
    public final Object m20876b(int i) {
        Object obj = null;
        if (i >= 0 && i < this.f17124a.length) {
            Object obj2 = this.f17124a[i];
            if (obj2 != null) {
                this.f17128e--;
            }
            this.f17124a[i] = null;
            obj = obj2;
        } else if (this.f17125b != null) {
            return this.f17125b.remove(Integer.valueOf(i));
        }
        return obj;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f17124a.length; i2++) {
            Object obj = this.f17124a[i2];
            if (obj != null) {
                i = ((i * 31) + obj.hashCode()) + i2;
            }
        }
        return this.f17125b == null ? i : i + this.f17125b.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (obj instanceof C4669b) {
                C4669b c4669b = (C4669b) obj;
                if (m20879e() != c4669b.m20879e()) {
                    return false;
                }
                Object obj2;
                Object[] objArr = this.f17124a;
                Object[] objArr2 = c4669b.f17124a;
                int min = Math.min(objArr.length, objArr2.length);
                int i = 0;
                while (i < min) {
                    if ((objArr[i] == null && objArr2[i] != null) || (objArr[i] != null && !objArr[i].equals(objArr2[i]))) {
                        break;
                    }
                    i++;
                }
                if (objArr.length > objArr2.length) {
                    while (min < objArr.length) {
                        if (objArr[min] != null) {
                            obj2 = null;
                        } else {
                            min++;
                        }
                    }
                } else if (objArr.length < objArr2.length) {
                    while (min < objArr2.length) {
                        if (objArr2[min] != null) {
                            obj2 = null;
                        } else {
                            min++;
                        }
                    }
                }
                obj2 = 1;
                return (obj2 == null || this.f17125b.equals(c4669b.f17125b) == null) ? false : true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("IntMap{lower:");
        for (int i = 0; i < this.f17124a.length; i++) {
            if (this.f17124a[i] != null) {
                stringBuilder.append(i);
                stringBuilder.append("=>");
                stringBuilder.append(this.f17124a[i]);
                stringBuilder.append(", ");
            }
        }
        String valueOf = String.valueOf(this.f17125b);
        StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf).length() + 10);
        stringBuilder2.append(", higher:");
        stringBuilder2.append(valueOf);
        stringBuilder2.append("}");
        stringBuilder.append(stringBuilder2.toString());
        return stringBuilder.toString();
    }
}
