package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.p125y.C5571j;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

final class bu {

    /* renamed from: com.google.android.m4b.maps.aa.bu$a */
    public enum C4575a {
        NEXT_LOWER {
            /* renamed from: a */
            final int mo4829a(int i) {
                return i - 1;
            }
        },
        NEXT_HIGHER {
            /* renamed from: a */
            public final int mo4829a(int i) {
                return i;
            }
        },
        INVERTED_INSERTION_INDEX {
            /* renamed from: a */
            public final int mo4829a(int i) {
                return i ^ -1;
            }
        };

        /* renamed from: a */
        abstract int mo4829a(int i);
    }

    /* renamed from: com.google.android.m4b.maps.aa.bu$b */
    public enum C4576b {
        ANY_PRESENT {
            /* renamed from: a */
            final <E> int mo4830a(Comparator<? super E> comparator, E e, List<? extends E> list, int i) {
                return i;
            }
        },
        LAST_PRESENT {
            /* renamed from: a */
            final <E> int mo4830a(Comparator<? super E> comparator, E e, List<? extends E> list, int i) {
                int size = list.size() - 1;
                while (i < size) {
                    int i2 = ((i + size) + 1) >>> 1;
                    if (comparator.compare(list.get(i2), e) > 0) {
                        size = i2 - 1;
                    } else {
                        i = i2;
                    }
                }
                return i;
            }
        },
        FIRST_PRESENT {
            /* renamed from: a */
            final <E> int mo4830a(Comparator<? super E> comparator, E e, List<? extends E> list, int i) {
                int i2 = 0;
                while (i2 < i) {
                    int i3 = (i2 + i) >>> 1;
                    if (comparator.compare(list.get(i3), e) < 0) {
                        i2 = i3 + 1;
                    } else {
                        i = i3;
                    }
                }
                return i2;
            }
        },
        FIRST_AFTER {
            /* renamed from: a */
            public final <E> int mo4830a(Comparator<? super E> comparator, E e, List<? extends E> list, int i) {
                return b.mo4830a(comparator, e, list, i) + 1;
            }
        },
        LAST_BEFORE {
            /* renamed from: a */
            public final <E> int mo4830a(Comparator<? super E> comparator, E e, List<? extends E> list, int i) {
                return c.mo4830a(comparator, e, list, i) - 1;
            }
        };

        /* renamed from: a */
        abstract <E> int mo4830a(Comparator<? super E> comparator, E e, List<? extends E> list, int i);
    }

    /* renamed from: a */
    public static <E> int m20662a(List<? extends E> list, E e, Comparator<? super E> comparator, C4576b c4576b, C4575a c4575a) {
        C5571j.m24292a((Object) comparator);
        C5571j.m24292a((Object) list);
        C5571j.m24292a((Object) c4576b);
        C5571j.m24292a((Object) c4575a);
        if (!(list instanceof RandomAccess)) {
            list = au.m20525a((Iterable) list);
        }
        int i = 0;
        int size = list.size() - 1;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            int compare = comparator.compare(e, list.get(i2));
            if (compare < 0) {
                size = i2 - 1;
            } else if (compare <= 0) {
                return i + c4576b.mo4830a(comparator, e, list.subList(i, size + 1), i2 - i);
            } else {
                i = i2 + 1;
            }
        }
        return c4575a.mo4829a(i);
    }
}
