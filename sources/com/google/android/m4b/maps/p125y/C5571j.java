package com.google.android.m4b.maps.p125y;

/* renamed from: com.google.android.m4b.maps.y.j */
public final class C5571j {
    /* renamed from: a */
    public static void m24297a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    public static void m24298a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: a */
    public static void m24299a(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(C5571j.m24295a(str, objArr));
        }
    }

    /* renamed from: b */
    public static void m24301b(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: b */
    public static void m24302b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* renamed from: b */
    public static void m24303b(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalStateException(C5571j.m24295a(str, objArr));
        }
    }

    /* renamed from: a */
    public static <T> T m24292a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public static <T> T m24293a(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: a */
    private static String m24294a(int i, int i2, String str) {
        if (i < 0) {
            return C5571j.m24295a("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 < 0) {
            str = new StringBuilder("negative size: ");
            str.append(i2);
            throw new IllegalArgumentException(str.toString());
        } else {
            return C5571j.m24295a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    /* renamed from: a */
    public static void m24296a(int i, int i2, int i3) {
        if (i >= 0 && i2 >= i) {
            if (i2 <= i3) {
                return;
            }
        }
        if (i >= 0) {
            if (i <= i3) {
                if (i2 >= 0) {
                    if (i2 <= i3) {
                        i = C5571j.m24295a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
                        throw new IndexOutOfBoundsException(i);
                    }
                }
                i = C5571j.m24294a(i2, i3, "end index");
                throw new IndexOutOfBoundsException(i);
            }
        }
        i = C5571j.m24294a(i, i3, "start index");
        throw new IndexOutOfBoundsException(i);
    }

    /* renamed from: a */
    private static String m24295a(String str, Object... objArr) {
        str = String.valueOf(str);
        StringBuilder stringBuilder = new StringBuilder(str.length() + (objArr.length * 16));
        int i = 0;
        int i2 = 0;
        while (i < objArr.length) {
            int indexOf = str.indexOf("%s", i2);
            if (indexOf == -1) {
                break;
            }
            stringBuilder.append(str.substring(i2, indexOf));
            i2 = i + 1;
            stringBuilder.append(objArr[i]);
            int i3 = i2;
            i2 = indexOf + 2;
            i = i3;
        }
        stringBuilder.append(str.substring(i2));
        if (i < objArr.length) {
            stringBuilder.append(" [");
            str = i + 1;
            stringBuilder.append(objArr[i]);
            while (str < objArr.length) {
                stringBuilder.append(", ");
                i = str + 1;
                stringBuilder.append(objArr[str]);
                str = i;
            }
            stringBuilder.append(']');
        }
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public static int m24291a(int i, int i2) {
        String str = "index";
        if (i >= 0) {
            if (i < i2) {
                return i;
            }
        }
        if (i < 0) {
            i = C5571j.m24295a("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 < 0) {
            StringBuilder stringBuilder = new StringBuilder("negative size: ");
            stringBuilder.append(i2);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else {
            i = C5571j.m24295a("%s (%s) must be less than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IndexOutOfBoundsException(i);
    }

    /* renamed from: b */
    public static int m24300b(int i, int i2) {
        String str = "index";
        if (i >= 0) {
            if (i <= i2) {
                return i;
            }
        }
        throw new IndexOutOfBoundsException(C5571j.m24294a(i, i2, str));
    }
}
