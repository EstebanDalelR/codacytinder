package com.google.zxing.aztec.p127a;

import com.google.zxing.common.C5664a;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.google.zxing.aztec.a.d */
public final class C5656d {
    /* renamed from: a */
    static final String[] f20947a = new String[]{"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};
    /* renamed from: b */
    static final int[][] f20948b = new int[][]{new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};
    /* renamed from: c */
    static final int[][] f20949c;
    /* renamed from: d */
    private static final int[][] f20950d;
    /* renamed from: e */
    private final byte[] f20951e;

    /* renamed from: com.google.zxing.aztec.a.d$1 */
    class C56551 implements Comparator<C5657f> {
        /* renamed from: a */
        final /* synthetic */ C5656d f20946a;

        C56551(C5656d c5656d) {
            this.f20946a = c5656d;
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return m24703a((C5657f) obj, (C5657f) obj2);
        }

        /* renamed from: a */
        public int m24703a(C5657f c5657f, C5657f c5657f2) {
            return c5657f.m24718c() - c5657f2.m24718c();
        }
    }

    static {
        int i;
        int[][] iArr = (int[][]) Array.newInstance(int.class, new int[]{5, 256});
        f20950d = iArr;
        iArr[0][32] = 1;
        for (i = 65; i <= 90; i++) {
            f20950d[0][i] = (i - 65) + 2;
        }
        f20950d[1][32] = 1;
        for (i = 97; i <= 122; i++) {
            f20950d[1][i] = (i - 97) + 2;
        }
        f20950d[2][32] = 1;
        for (i = 48; i <= 57; i++) {
            f20950d[2][i] = (i - 48) + 2;
        }
        f20950d[2][44] = 12;
        f20950d[2][46] = 13;
        int[] iArr2 = new int[]{0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, 124, 126, 127};
        for (int i2 = 0; i2 < 28; i2++) {
            f20950d[3][iArr2[i2]] = i2;
        }
        int[] iArr3 = new int[]{0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, 123, 125};
        for (int i3 = 0; i3 < 31; i3++) {
            if (iArr3[i3] > 0) {
                f20950d[4][iArr3[i3]] = i3;
            }
        }
        int[][] iArr4 = (int[][]) Array.newInstance(int.class, new int[]{6, 6});
        f20949c = iArr4;
        for (int[] fill : iArr4) {
            Arrays.fill(fill, -1);
        }
        f20949c[0][4] = 0;
        f20949c[1][4] = 0;
        f20949c[1][0] = 28;
        f20949c[3][4] = 0;
        f20949c[2][4] = 0;
        f20949c[2][0] = 15;
    }

    public C5656d(byte[] bArr) {
        this.f20951e = bArr;
    }

    /* renamed from: a */
    public C5664a m24709a() {
        Iterable singletonList = Collections.singletonList(C5657f.f20952a);
        int i = 0;
        while (i < this.f20951e.length) {
            int i2;
            int i3 = i + 1;
            byte b = i3 < this.f20951e.length ? this.f20951e[i3] : (byte) 0;
            byte b2 = this.f20951e[i];
            if (b2 != (byte) 13) {
                if (b2 != (byte) 44) {
                    if (b2 != (byte) 46) {
                        if (b2 == (byte) 58 && b == (byte) 32) {
                            i2 = 5;
                            if (i2 > 0) {
                                singletonList = C5656d.m24706a(singletonList, i, i2);
                                i = i3;
                            } else {
                                singletonList = m24705a(singletonList, i);
                            }
                            i++;
                        }
                    } else if (b == (byte) 32) {
                        i2 = 3;
                        if (i2 > 0) {
                            singletonList = m24705a(singletonList, i);
                        } else {
                            singletonList = C5656d.m24706a(singletonList, i, i2);
                            i = i3;
                        }
                        i++;
                    }
                } else if (b == (byte) 32) {
                    i2 = 4;
                    if (i2 > 0) {
                        singletonList = C5656d.m24706a(singletonList, i, i2);
                        i = i3;
                    } else {
                        singletonList = m24705a(singletonList, i);
                    }
                    i++;
                }
            } else if (b == (byte) 10) {
                i2 = 2;
                if (i2 > 0) {
                    singletonList = m24705a(singletonList, i);
                } else {
                    singletonList = C5656d.m24706a(singletonList, i, i2);
                    i = i3;
                }
                i++;
            }
            i2 = 0;
            if (i2 > 0) {
                singletonList = C5656d.m24706a(singletonList, i, i2);
                i = i3;
            } else {
                singletonList = m24705a(singletonList, i);
            }
            i++;
        }
        return ((C5657f) Collections.min(singletonList, new C56551(this))).m24713a(this.f20951e);
    }

    /* renamed from: a */
    private Collection<C5657f> m24705a(Iterable<C5657f> iterable, int i) {
        Collection linkedList = new LinkedList();
        for (C5657f a : iterable) {
            m24708a(a, i, linkedList);
        }
        return C5656d.m24704a(linkedList);
    }

    /* renamed from: a */
    private void m24708a(C5657f c5657f, int i, Collection<C5657f> collection) {
        char c = (char) (this.f20951e[i] & 255);
        int i2 = 0;
        Object obj = f20950d[c5657f.m24710a()][c] > 0 ? 1 : null;
        C5657f c5657f2 = null;
        while (i2 <= 4) {
            int i3 = f20950d[i2][c];
            if (i3 > 0) {
                if (c5657f2 == null) {
                    c5657f2 = c5657f.m24716b(i);
                }
                if (obj == null || i2 == c5657f.m24710a() || i2 == 2) {
                    collection.add(c5657f2.m24712a(i2, i3));
                }
                if (obj == null && f20949c[c5657f.m24710a()][i2] >= 0) {
                    collection.add(c5657f2.m24717b(i2, i3));
                }
            }
            i2++;
        }
        if (c5657f.m24715b() > 0 || f20950d[c5657f.m24710a()][c] == 0) {
            collection.add(c5657f.m24711a(i));
        }
    }

    /* renamed from: a */
    private static Collection<C5657f> m24706a(Iterable<C5657f> iterable, int i, int i2) {
        Iterable linkedList = new LinkedList();
        for (C5657f a : iterable) {
            C5656d.m24707a(a, i, i2, linkedList);
        }
        return C5656d.m24704a(linkedList);
    }

    /* renamed from: a */
    private static void m24707a(C5657f c5657f, int i, int i2, Collection<C5657f> collection) {
        C5657f b = c5657f.m24716b(i);
        collection.add(b.m24712a(4, i2));
        if (c5657f.m24710a() != 4) {
            collection.add(b.m24717b(4, i2));
        }
        if (i2 == 3 || i2 == 4) {
            collection.add(b.m24712a(2, 16 - i2).m24712a(2, 1));
        }
        if (c5657f.m24715b() > 0) {
            collection.add(c5657f.m24711a(i).m24711a(i + 1));
        }
    }

    /* renamed from: a */
    private static Collection<C5657f> m24704a(Iterable<C5657f> iterable) {
        Collection linkedList = new LinkedList();
        for (C5657f c5657f : iterable) {
            Object obj = 1;
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                C5657f c5657f2 = (C5657f) it.next();
                if (c5657f2.m24714a(c5657f)) {
                    obj = null;
                    break;
                } else if (c5657f.m24714a(c5657f2)) {
                    it.remove();
                }
            }
            if (obj != null) {
                linkedList.add(c5657f);
            }
        }
        return linkedList;
    }
}
