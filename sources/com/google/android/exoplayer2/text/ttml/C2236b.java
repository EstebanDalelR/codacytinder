package com.google.android.exoplayer2.text.ttml;

import android.text.SpannableStringBuilder;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.util.C2289a;
import com.leanplum.BuildConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;

/* renamed from: com.google.android.exoplayer2.text.ttml.b */
final class C2236b {
    /* renamed from: a */
    public final String f6588a;
    /* renamed from: b */
    public final String f6589b;
    /* renamed from: c */
    public final boolean f6590c;
    /* renamed from: d */
    public final long f6591d;
    /* renamed from: e */
    public final long f6592e;
    /* renamed from: f */
    public final TtmlStyle f6593f;
    /* renamed from: g */
    public final String f6594g;
    /* renamed from: h */
    private final String[] f6595h;
    /* renamed from: i */
    private final HashMap<String, Integer> f6596i;
    /* renamed from: j */
    private final HashMap<String, Integer> f6597j;
    /* renamed from: k */
    private List<C2236b> f6598k;

    /* renamed from: a */
    public static C2236b m8014a(String str) {
        return new C2236b(null, C2238d.m8027a(str), -9223372036854775807L, -9223372036854775807L, null, null, "");
    }

    /* renamed from: a */
    public static C2236b m8015a(String str, long j, long j2, TtmlStyle ttmlStyle, String[] strArr, String str2) {
        return new C2236b(str, null, j, j2, ttmlStyle, strArr, str2);
    }

    private C2236b(String str, String str2, long j, long j2, TtmlStyle ttmlStyle, String[] strArr, String str3) {
        this.f6588a = str;
        this.f6589b = str2;
        this.f6593f = ttmlStyle;
        this.f6595h = strArr;
        this.f6590c = str2 != null ? true : null;
        this.f6591d = j;
        this.f6592e = j2;
        this.f6594g = (String) C2289a.m8309a((Object) str3);
        this.f6596i = new HashMap();
        this.f6597j = new HashMap();
    }

    /* renamed from: a */
    public boolean m8024a(long j) {
        return (!(this.f6591d == -9223372036854775807L && this.f6592e == -9223372036854775807L) && ((this.f6591d > j || this.f6592e != -9223372036854775807L) && ((this.f6591d != -9223372036854775807L || j >= this.f6592e) && (this.f6591d > j || j >= this.f6592e)))) ? 0 : 1;
    }

    /* renamed from: a */
    public void m8023a(C2236b c2236b) {
        if (this.f6598k == null) {
            this.f6598k = new ArrayList();
        }
        this.f6598k.add(c2236b);
    }

    /* renamed from: a */
    public C2236b m8021a(int i) {
        if (this.f6598k != null) {
            return (C2236b) this.f6598k.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: a */
    public int m8020a() {
        return this.f6598k == null ? 0 : this.f6598k.size();
    }

    /* renamed from: b */
    public long[] m8025b() {
        TreeSet treeSet = new TreeSet();
        int i = 0;
        m8018a(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            int i2 = i + 1;
            jArr[i] = ((Long) it.next()).longValue();
            i = i2;
        }
        return jArr;
    }

    /* renamed from: a */
    private void m8018a(TreeSet<Long> treeSet, boolean z) {
        boolean equals = BuildConfig.LEANPLUM_PACKAGE_IDENTIFIER.equals(this.f6588a);
        if (z || equals) {
            if (this.f6591d != -9223372036854775807L) {
                treeSet.add(Long.valueOf(this.f6591d));
            }
            if (this.f6592e != -9223372036854775807L) {
                treeSet.add(Long.valueOf(this.f6592e));
            }
        }
        if (this.f6598k != null) {
            for (int i = 0; i < this.f6598k.size(); i++) {
                boolean z2;
                C2236b c2236b = (C2236b) this.f6598k.get(i);
                if (!z) {
                    if (!equals) {
                        z2 = false;
                        c2236b.m8018a((TreeSet) treeSet, z2);
                    }
                }
                z2 = true;
                c2236b.m8018a((TreeSet) treeSet, z2);
            }
        }
    }

    /* renamed from: a */
    public List<Cue> m8022a(long j, Map<String, TtmlStyle> map, Map<String, C2237c> map2) {
        Map treeMap = new TreeMap();
        m8016a(j, false, this.f6594g, treeMap);
        m8019b(j, map, treeMap);
        List<Cue> arrayList = new ArrayList();
        for (Entry entry : treeMap.entrySet()) {
            C2237c c2237c = (C2237c) map2.get(entry.getKey());
            arrayList.add(new Cue(m8012a((SpannableStringBuilder) entry.getValue()), null, c2237c.f6601c, c2237c.f6602d, c2237c.f6603e, c2237c.f6600b, Integer.MIN_VALUE, c2237c.f6604f, c2237c.f6605g, c2237c.f6606h));
        }
        return arrayList;
    }

    /* renamed from: a */
    private void m8016a(long j, boolean z, String str, Map<String, SpannableStringBuilder> map) {
        this.f6596i.clear();
        this.f6597j.clear();
        if (!"metadata".equals(this.f6588a)) {
            if (!"".equals(this.f6594g)) {
                str = this.f6594g;
            }
            if (this.f6590c && z) {
                C2236b.m8013a(str, (Map) map).append(this.f6589b);
            } else if ("br".equals(this.f6588a) && z) {
                C2236b.m8013a(str, (Map) map).append('\n');
            } else if (m8024a(j)) {
                for (Entry entry : map.entrySet()) {
                    this.f6596i.put(entry.getKey(), Integer.valueOf(((SpannableStringBuilder) entry.getValue()).length()));
                }
                boolean equals = BuildConfig.LEANPLUM_PACKAGE_IDENTIFIER.equals(this.f6588a);
                for (int i = 0; i < m8020a(); i++) {
                    boolean z2;
                    C2236b a = m8021a(i);
                    if (!z) {
                        if (!equals) {
                            z2 = false;
                            a.m8016a(j, z2, str, (Map) map);
                        }
                    }
                    z2 = true;
                    a.m8016a(j, z2, str, (Map) map);
                }
                if (equals) {
                    C2238d.m8028a(C2236b.m8013a(str, (Map) map));
                }
                for (Entry entry2 : map.entrySet()) {
                    this.f6597j.put(entry2.getKey(), Integer.valueOf(((SpannableStringBuilder) entry2.getValue()).length()));
                }
            }
        }
    }

    /* renamed from: a */
    private static SpannableStringBuilder m8013a(String str, Map<String, SpannableStringBuilder> map) {
        if (!map.containsKey(str)) {
            map.put(str, new SpannableStringBuilder());
        }
        return (SpannableStringBuilder) map.get(str);
    }

    /* renamed from: b */
    private void m8019b(long j, Map<String, TtmlStyle> map, Map<String, SpannableStringBuilder> map2) {
        if (m8024a(j)) {
            int i;
            Iterator it = this.f6597j.entrySet().iterator();
            while (true) {
                i = 0;
                if (!it.hasNext()) {
                    break;
                }
                Entry entry = (Entry) it.next();
                String str = (String) entry.getKey();
                if (this.f6596i.containsKey(str)) {
                    i = ((Integer) this.f6596i.get(str)).intValue();
                }
                int intValue = ((Integer) entry.getValue()).intValue();
                if (i != intValue) {
                    m8017a((Map) map, (SpannableStringBuilder) map2.get(str), i, intValue);
                }
            }
            while (i < m8020a()) {
                m8021a(i).m8019b(j, map, map2);
                i++;
            }
        }
    }

    /* renamed from: a */
    private void m8017a(Map<String, TtmlStyle> map, SpannableStringBuilder spannableStringBuilder, int i, int i2) {
        map = C2238d.m8026a(this.f6593f, this.f6595h, map);
        if (map != null) {
            C2238d.m8029a(spannableStringBuilder, i, i2, map);
        }
    }

    /* renamed from: a */
    private SpannableStringBuilder m8012a(SpannableStringBuilder spannableStringBuilder) {
        int i;
        int i2 = 0;
        int length = spannableStringBuilder.length();
        for (i = 0; i < length; i++) {
            if (spannableStringBuilder.charAt(i) == ' ') {
                int i3 = i + 1;
                int i4 = i3;
                while (i4 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i4) == ' ') {
                    i4++;
                }
                i4 -= i3;
                if (i4 > 0) {
                    spannableStringBuilder.delete(i, i + i4);
                    length -= i4;
                }
            }
        }
        if (length > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
            length--;
        }
        i = 0;
        while (true) {
            i3 = length - 1;
            if (i >= i3) {
                break;
            }
            if (spannableStringBuilder.charAt(i) == '\n') {
                i3 = i + 1;
                if (spannableStringBuilder.charAt(i3) == ' ') {
                    spannableStringBuilder.delete(i3, i + 2);
                    length--;
                }
            }
            i++;
        }
        if (length > 0 && spannableStringBuilder.charAt(i3) == ' ') {
            spannableStringBuilder.delete(i3, length);
            length--;
        }
        while (true) {
            i = length - 1;
            if (i2 >= i) {
                break;
            }
            if (spannableStringBuilder.charAt(i2) == ' ') {
                i = i2 + 1;
                if (spannableStringBuilder.charAt(i) == '\n') {
                    spannableStringBuilder.delete(i2, i);
                    length--;
                }
            }
            i2++;
        }
        if (length > 0 && spannableStringBuilder.charAt(i) == '\n') {
            spannableStringBuilder.delete(i, length);
        }
        return spannableStringBuilder;
    }
}
