package android.support.v4.media;

import android.os.Build.VERSION;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.v4.media.C0497a.C0496a;
import android.util.SparseIntArray;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;

public class AudioAttributesCompat {
    /* renamed from: e */
    private static final SparseIntArray f1513e = new SparseIntArray();
    /* renamed from: f */
    private static boolean f1514f;
    /* renamed from: g */
    private static final int[] f1515g = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16};
    /* renamed from: a */
    int f1516a = 0;
    /* renamed from: b */
    int f1517b = 0;
    /* renamed from: c */
    int f1518c = 0;
    /* renamed from: d */
    Integer f1519d;
    /* renamed from: h */
    private C0496a f1520h;

    @RestrictTo({Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface AttributeContentType {
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface AttributeUsage {
    }

    static {
        f1513e.put(5, 1);
        f1513e.put(6, 2);
        f1513e.put(7, 2);
        f1513e.put(8, 1);
        f1513e.put(9, 1);
        f1513e.put(10, 1);
    }

    private AudioAttributesCompat() {
    }

    @Nullable
    /* renamed from: a */
    public Object m1753a() {
        return this.f1520h != null ? this.f1520h.m1853a() : null;
    }

    /* renamed from: b */
    public int m1754b() {
        if (this.f1519d != null) {
            return this.f1519d.intValue();
        }
        if (VERSION.SDK_INT < 21 || f1514f) {
            return m1751a(false, this.f1518c, this.f1516a);
        }
        return C0497a.m1854a(this.f1520h);
    }

    /* renamed from: c */
    public int m1755c() {
        if (VERSION.SDK_INT < 21 || f1514f || this.f1520h == null) {
            return this.f1517b;
        }
        return this.f1520h.m1853a().getContentType();
    }

    /* renamed from: d */
    public int m1756d() {
        if (VERSION.SDK_INT < 21 || f1514f || this.f1520h == null) {
            return this.f1516a;
        }
        return this.f1520h.m1853a().getUsage();
    }

    /* renamed from: e */
    public int m1757e() {
        if (VERSION.SDK_INT >= 21 && !f1514f && this.f1520h != null) {
            return this.f1520h.m1853a().getFlags();
        }
        int i = this.f1518c;
        int b = m1754b();
        if (b == 6) {
            i |= 4;
        } else if (b == 7) {
            i |= 1;
        }
        return i & 273;
    }

    public int hashCode() {
        if (VERSION.SDK_INT >= 21 && !f1514f && this.f1520h != null) {
            return this.f1520h.m1853a().hashCode();
        }
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1517b), Integer.valueOf(this.f1518c), Integer.valueOf(this.f1516a), this.f1519d});
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("AudioAttributesCompat:");
        if (m1753a() != null) {
            stringBuilder.append(" audioattributes=");
            stringBuilder.append(m1753a());
        } else {
            if (this.f1519d != null) {
                stringBuilder.append(" stream=");
                stringBuilder.append(this.f1519d);
                stringBuilder.append(" derived");
            }
            stringBuilder.append(" usage=");
            stringBuilder.append(m1758f());
            stringBuilder.append(" content=");
            stringBuilder.append(this.f1517b);
            stringBuilder.append(" flags=0x");
            stringBuilder.append(Integer.toHexString(this.f1518c).toUpperCase());
        }
        return stringBuilder.toString();
    }

    /* renamed from: f */
    String m1758f() {
        return m1752a(this.f1516a);
    }

    /* renamed from: a */
    static String m1752a(int i) {
        switch (i) {
            case 0:
                return new String("USAGE_UNKNOWN");
            case 1:
                return new String("USAGE_MEDIA");
            case 2:
                return new String("USAGE_VOICE_COMMUNICATION");
            case 3:
                return new String("USAGE_VOICE_COMMUNICATION_SIGNALLING");
            case 4:
                return new String("USAGE_ALARM");
            case 5:
                return new String("USAGE_NOTIFICATION");
            case 6:
                return new String("USAGE_NOTIFICATION_RINGTONE");
            case 7:
                return new String("USAGE_NOTIFICATION_COMMUNICATION_REQUEST");
            case 8:
                return new String("USAGE_NOTIFICATION_COMMUNICATION_INSTANT");
            case 9:
                return new String("USAGE_NOTIFICATION_COMMUNICATION_DELAYED");
            case 10:
                return new String("USAGE_NOTIFICATION_EVENT");
            case 11:
                return new String("USAGE_ASSISTANCE_ACCESSIBILITY");
            case 12:
                return new String("USAGE_ASSISTANCE_NAVIGATION_GUIDANCE");
            case 13:
                return new String("USAGE_ASSISTANCE_SONIFICATION");
            case 14:
                return new String("USAGE_GAME");
            case 16:
                return new String("USAGE_ASSISTANT");
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("unknown usage ");
                stringBuilder.append(i);
                return new String(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    static int m1751a(boolean z, int i, int i2) {
        int i3 = 1;
        if ((i & 1) == 1) {
            if (!z) {
                i3 = 7;
            }
            return i3;
        }
        int i4 = 0;
        if ((i & 4) == 4) {
            if (!z) {
                i4 = 6;
            }
            return i4;
        }
        i = 3;
        switch (i2) {
            case 0:
                if (z) {
                    i = Integer.MIN_VALUE;
                }
                return i;
            case 1:
            case 12:
            case 14:
            case 16:
                return 3;
            case 2:
                return 0;
            case 3:
                if (!z) {
                    i4 = 8;
                }
                return i4;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return true;
            case 6:
                return true;
            case 11:
                return true;
            case 13:
                return 1;
            default:
                if (!z) {
                    return 3;
                }
                i = new StringBuilder();
                i.append("Unknown usage value ");
                i.append(i2);
                i.append(" in audio attributes");
                throw new IllegalArgumentException(i.toString());
        }
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
                if (VERSION.SDK_INT >= 21 && !f1514f && this.f1520h != null) {
                    return this.f1520h.m1853a().equals(audioAttributesCompat.m1753a());
                }
                if (this.f1517b == audioAttributesCompat.m1755c() && this.f1518c == audioAttributesCompat.m1757e() && this.f1516a == audioAttributesCompat.m1756d()) {
                    if (this.f1519d != null) {
                        if (this.f1519d.equals(audioAttributesCompat.f1519d) != null) {
                            return z;
                        }
                    } else if (audioAttributesCompat.f1519d == null) {
                        return z;
                    }
                }
                z = false;
                return z;
            }
        }
        return false;
    }
}
