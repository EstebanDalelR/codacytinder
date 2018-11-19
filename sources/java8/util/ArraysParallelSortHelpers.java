package java8.util;

import java.util.Comparator;
import java8.util.concurrent.CountedCompleter;

class ArraysParallelSortHelpers {

    static final class FJByte {

        static final class Merger extends CountedCompleter<Void> {
            static final long serialVersionUID = 2446542900576103244L;
            /* renamed from: a */
            final byte[] f57504a;
            /* renamed from: b */
            final byte[] f57505b;
            /* renamed from: c */
            final int f57506c;
            /* renamed from: d */
            final int f57507d;
            /* renamed from: e */
            final int f57508e;
            /* renamed from: f */
            final int f57509f;
            /* renamed from: g */
            final int f57510g;
            /* renamed from: h */
            final int f57511h;

            Merger(CountedCompleter<?> countedCompleter, byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4, int i5, int i6) {
                super(countedCompleter);
                this.f57504a = bArr;
                this.f57505b = bArr2;
                this.f57506c = i;
                this.f57507d = i2;
                this.f57508e = i3;
                this.f57509f = i4;
                this.f57510g = i5;
                this.f57511h = i6;
            }

            /* renamed from: a */
            public final void mo13596a() {
                byte[] bArr = this.f57504a;
                byte[] bArr2 = this.f57505b;
                int i = this.f57506c;
                int i2 = this.f57507d;
                int i3 = this.f57508e;
                int i4 = this.f57509f;
                int i5 = this.f57510g;
                int i6 = this.f57511h;
                if (bArr != null && bArr2 != null && i >= 0 && i3 >= 0) {
                    if (i5 >= 0) {
                        int i7;
                        while (true) {
                            int i8 = 0;
                            byte b;
                            int i9;
                            int i10;
                            int i11;
                            int i12;
                            byte[] bArr3;
                            byte[] bArr4;
                            byte[] bArr5;
                            Merger merger;
                            Merger merger2;
                            byte[] bArr6;
                            int i13;
                            if (i2 >= i4) {
                                if (i2 <= i6) {
                                    break;
                                }
                                i7 = i2 >>> 1;
                                b = bArr[i7 + i];
                                i9 = i4;
                                while (i8 < i9) {
                                    i10 = (i8 + i9) >>> 1;
                                    if (b <= bArr[i10 + i3]) {
                                        i9 = i10;
                                    } else {
                                        i8 = i10 + 1;
                                    }
                                }
                                i11 = i7;
                                i12 = i9;
                                bArr3 = bArr;
                                bArr4 = bArr2;
                                bArr5 = bArr;
                                merger = merger2;
                                bArr6 = bArr2;
                                i13 = i6;
                                merger2 = new Merger(r10, bArr3, bArr4, i + i11, i2 - i11, i3 + i12, i4 - i12, (i5 + i11) + i12, i6);
                                mo12939b(1);
                                merger.m59284j();
                                i2 = i11;
                                i4 = i12;
                                bArr = bArr5;
                                bArr2 = bArr6;
                            } else if (i4 <= i6) {
                                break;
                            } else {
                                i7 = i4 >>> 1;
                                b = bArr[i7 + i3];
                                i9 = i2;
                                while (i8 < i9) {
                                    i10 = (i8 + i9) >>> 1;
                                    if (b <= bArr[i10 + i]) {
                                        i9 = i10;
                                    } else {
                                        i8 = i10 + 1;
                                    }
                                }
                                i12 = i7;
                                i11 = i9;
                                bArr3 = bArr;
                                bArr4 = bArr2;
                                bArr5 = bArr;
                                merger = merger2;
                                bArr6 = bArr2;
                                i13 = i6;
                                merger2 = new Merger(r10, bArr3, bArr4, i + i11, i2 - i11, i3 + i12, i4 - i12, (i5 + i11) + i12, i6);
                                mo12939b(1);
                                merger.m59284j();
                                i2 = i11;
                                i4 = i12;
                                bArr = bArr5;
                                bArr2 = bArr6;
                            }
                        }
                        i2 += i;
                        i4 += i3;
                        while (i < i2 && i3 < i4) {
                            byte b2 = bArr[i];
                            byte b3 = bArr[i3];
                            if (b2 <= b3) {
                                i++;
                            } else {
                                i3++;
                                b2 = b3;
                            }
                            i7 = i5 + 1;
                            bArr2[i5] = b2;
                            i5 = i7;
                        }
                        if (i3 < i4) {
                            System.arraycopy(bArr, i3, bArr2, i5, i4 - i3);
                        } else if (i < i2) {
                            System.arraycopy(bArr, i, bArr2, i5, i2 - i);
                        }
                        mo12941d();
                        return;
                    }
                }
                throw new IllegalStateException();
            }
        }

        static final class Sorter extends CountedCompleter<Void> {
            static final long serialVersionUID = 2446542900576103244L;
            /* renamed from: a */
            final byte[] f57512a;
            /* renamed from: b */
            final byte[] f57513b;
            /* renamed from: c */
            final int f57514c;
            /* renamed from: d */
            final int f57515d;
            /* renamed from: e */
            final int f57516e;
            /* renamed from: f */
            final int f57517f;

            Sorter(CountedCompleter<?> countedCompleter, byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4) {
                super(countedCompleter);
                this.f57512a = bArr;
                this.f57513b = bArr2;
                this.f57514c = i;
                this.f57515d = i2;
                this.f57516e = i3;
                this.f57517f = i4;
            }

            /* renamed from: a */
            public final void mo13596a() {
                byte[] bArr = this.f57512a;
                byte[] bArr2 = this.f57513b;
                int i = this.f57514c;
                int i2 = this.f57515d;
                int i3 = this.f57516e;
                int i4 = this.f57517f;
                CountedCompleter countedCompleter = this;
                int i5 = i2;
                while (i5 > i4) {
                    int i6 = i5 >>> 1;
                    int i7 = i6 >>> 1;
                    int i8 = i6 + i7;
                    int i9 = i3 + i6;
                    CountedCompleter countedCompleter2 = r1;
                    int i10 = i3;
                    int i11 = i5;
                    CountedCompleter merger = new Merger(countedCompleter, bArr2, bArr, i3, i6, i9, i5 - i6, i, i4);
                    CountedCompleter relay = new Relay(countedCompleter2);
                    int i12 = i + i6;
                    int i13 = i + i8;
                    i11 -= i8;
                    byte[] bArr3 = bArr;
                    byte[] bArr4 = bArr2;
                    CountedCompleter countedCompleter3 = relay;
                    relay = merger;
                    i5 = i4;
                    merger = new Merger(relay, bArr3, bArr4, i12, i7, i13, i11, i9, i5);
                    countedCompleter = new Relay(relay);
                    int i14 = i4;
                    new Sorter(countedCompleter, bArr3, bArr4, i13, i11, i10 + i8, i14).m59284j();
                    int i15 = i7;
                    new Sorter(countedCompleter, bArr3, bArr4, i12, i15, i9, i14).m59284j();
                    i8 = i + i7;
                    i6 -= i7;
                    countedCompleter2 = new Relay(new Merger(countedCompleter3, bArr3, bArr4, i, i15, i8, i6, i10, i5));
                    new Sorter(countedCompleter2, bArr3, bArr4, i8, i6, i10 + i7, i4).m59284j();
                    countedCompleter = new EmptyCompleter(countedCompleter2);
                    i5 = i7;
                    i3 = i10;
                    Sorter sorter = this;
                }
                DualPivotQuicksort.m59046a(bArr, i, (i + i5) - 1);
                countedCompleter.mo12941d();
            }
        }

        FJByte() {
        }
    }

    static final class FJChar {

        static final class Merger extends CountedCompleter<Void> {
            static final long serialVersionUID = 2446542900576103244L;
            /* renamed from: a */
            final char[] f57518a;
            /* renamed from: b */
            final char[] f57519b;
            /* renamed from: c */
            final int f57520c;
            /* renamed from: d */
            final int f57521d;
            /* renamed from: e */
            final int f57522e;
            /* renamed from: f */
            final int f57523f;
            /* renamed from: g */
            final int f57524g;
            /* renamed from: h */
            final int f57525h;

            Merger(CountedCompleter<?> countedCompleter, char[] cArr, char[] cArr2, int i, int i2, int i3, int i4, int i5, int i6) {
                super(countedCompleter);
                this.f57518a = cArr;
                this.f57519b = cArr2;
                this.f57520c = i;
                this.f57521d = i2;
                this.f57522e = i3;
                this.f57523f = i4;
                this.f57524g = i5;
                this.f57525h = i6;
            }

            /* renamed from: a */
            public final void mo13596a() {
                char[] cArr = this.f57518a;
                char[] cArr2 = this.f57519b;
                int i = this.f57520c;
                int i2 = this.f57521d;
                int i3 = this.f57522e;
                int i4 = this.f57523f;
                int i5 = this.f57524g;
                int i6 = this.f57525h;
                if (cArr != null && cArr2 != null && i >= 0 && i3 >= 0) {
                    if (i5 >= 0) {
                        int i7;
                        while (true) {
                            int i8 = 0;
                            char c;
                            int i9;
                            int i10;
                            int i11;
                            int i12;
                            char[] cArr3;
                            char[] cArr4;
                            char[] cArr5;
                            Merger merger;
                            Merger merger2;
                            char[] cArr6;
                            int i13;
                            if (i2 >= i4) {
                                if (i2 <= i6) {
                                    break;
                                }
                                i7 = i2 >>> 1;
                                c = cArr[i7 + i];
                                i9 = i4;
                                while (i8 < i9) {
                                    i10 = (i8 + i9) >>> 1;
                                    if (c <= cArr[i10 + i3]) {
                                        i9 = i10;
                                    } else {
                                        i8 = i10 + 1;
                                    }
                                }
                                i11 = i7;
                                i12 = i9;
                                cArr3 = cArr;
                                cArr4 = cArr2;
                                cArr5 = cArr;
                                merger = merger2;
                                cArr6 = cArr2;
                                i13 = i6;
                                merger2 = new Merger(r10, cArr3, cArr4, i + i11, i2 - i11, i3 + i12, i4 - i12, (i5 + i11) + i12, i6);
                                mo12939b(1);
                                merger.m59284j();
                                i2 = i11;
                                i4 = i12;
                                cArr = cArr5;
                                cArr2 = cArr6;
                            } else if (i4 <= i6) {
                                break;
                            } else {
                                i7 = i4 >>> 1;
                                c = cArr[i7 + i3];
                                i9 = i2;
                                while (i8 < i9) {
                                    i10 = (i8 + i9) >>> 1;
                                    if (c <= cArr[i10 + i]) {
                                        i9 = i10;
                                    } else {
                                        i8 = i10 + 1;
                                    }
                                }
                                i12 = i7;
                                i11 = i9;
                                cArr3 = cArr;
                                cArr4 = cArr2;
                                cArr5 = cArr;
                                merger = merger2;
                                cArr6 = cArr2;
                                i13 = i6;
                                merger2 = new Merger(r10, cArr3, cArr4, i + i11, i2 - i11, i3 + i12, i4 - i12, (i5 + i11) + i12, i6);
                                mo12939b(1);
                                merger.m59284j();
                                i2 = i11;
                                i4 = i12;
                                cArr = cArr5;
                                cArr2 = cArr6;
                            }
                        }
                        i2 += i;
                        i4 += i3;
                        while (i < i2 && i3 < i4) {
                            char c2 = cArr[i];
                            char c3 = cArr[i3];
                            if (c2 <= c3) {
                                i++;
                            } else {
                                i3++;
                                c2 = c3;
                            }
                            i7 = i5 + 1;
                            cArr2[i5] = c2;
                            i5 = i7;
                        }
                        if (i3 < i4) {
                            System.arraycopy(cArr, i3, cArr2, i5, i4 - i3);
                        } else if (i < i2) {
                            System.arraycopy(cArr, i, cArr2, i5, i2 - i);
                        }
                        mo12941d();
                        return;
                    }
                }
                throw new IllegalStateException();
            }
        }

        static final class Sorter extends CountedCompleter<Void> {
            static final long serialVersionUID = 2446542900576103244L;
            /* renamed from: a */
            final char[] f57526a;
            /* renamed from: b */
            final char[] f57527b;
            /* renamed from: c */
            final int f57528c;
            /* renamed from: d */
            final int f57529d;
            /* renamed from: e */
            final int f57530e;
            /* renamed from: f */
            final int f57531f;

            Sorter(CountedCompleter<?> countedCompleter, char[] cArr, char[] cArr2, int i, int i2, int i3, int i4) {
                super(countedCompleter);
                this.f57526a = cArr;
                this.f57527b = cArr2;
                this.f57528c = i;
                this.f57529d = i2;
                this.f57530e = i3;
                this.f57531f = i4;
            }

            /* renamed from: a */
            public final void mo13596a() {
                int i;
                char[] cArr = this.f57526a;
                char[] cArr2 = this.f57527b;
                int i2 = this.f57528c;
                int i3 = this.f57529d;
                int i4 = this.f57530e;
                int i5 = this.f57531f;
                CountedCompleter countedCompleter = this;
                int i6 = i3;
                while (i6 > i5) {
                    int i7 = i6 >>> 1;
                    int i8 = i7 >>> 1;
                    int i9 = i7 + i8;
                    int i10 = i4 + i7;
                    CountedCompleter countedCompleter2 = r1;
                    int i11 = i4;
                    i = i6;
                    CountedCompleter merger = new Merger(countedCompleter, cArr2, cArr, i4, i7, i10, i6 - i7, i2, i5);
                    CountedCompleter relay = new Relay(countedCompleter2);
                    int i12 = i2 + i7;
                    int i13 = i2 + i9;
                    i -= i9;
                    char[] cArr3 = cArr;
                    char[] cArr4 = cArr2;
                    CountedCompleter countedCompleter3 = relay;
                    relay = merger;
                    i6 = i5;
                    merger = new Merger(relay, cArr3, cArr4, i12, i8, i13, i, i10, i6);
                    CountedCompleter relay2 = new Relay(relay);
                    int i14 = i5;
                    new Sorter(relay2, cArr3, cArr4, i13, i, i11 + i9, i14).m59284j();
                    int i15 = i8;
                    new Sorter(relay2, cArr3, cArr4, i12, i15, i10, i14).m59284j();
                    i9 = i2 + i8;
                    i7 -= i8;
                    countedCompleter2 = new Relay(new Merger(countedCompleter3, cArr3, cArr4, i2, i15, i9, i7, i11, i6));
                    new Sorter(countedCompleter2, cArr3, cArr4, i9, i7, i11 + i8, i5).m59284j();
                    countedCompleter = new EmptyCompleter(countedCompleter2);
                    i6 = i8;
                    i4 = i11;
                    Sorter sorter = this;
                }
                i = i6;
                DualPivotQuicksort.m59048a(cArr, i2, (i2 + i) - 1, cArr2, i4, i);
                countedCompleter.mo12941d();
            }
        }

        FJChar() {
        }
    }

    static final class FJDouble {

        static final class Merger extends CountedCompleter<Void> {
            static final long serialVersionUID = 2446542900576103244L;
            /* renamed from: a */
            final double[] f57532a;
            /* renamed from: b */
            final double[] f57533b;
            /* renamed from: c */
            final int f57534c;
            /* renamed from: d */
            final int f57535d;
            /* renamed from: e */
            final int f57536e;
            /* renamed from: f */
            final int f57537f;
            /* renamed from: g */
            final int f57538g;
            /* renamed from: h */
            final int f57539h;

            Merger(CountedCompleter<?> countedCompleter, double[] dArr, double[] dArr2, int i, int i2, int i3, int i4, int i5, int i6) {
                super(countedCompleter);
                this.f57532a = dArr;
                this.f57533b = dArr2;
                this.f57534c = i;
                this.f57535d = i2;
                this.f57536e = i3;
                this.f57537f = i4;
                this.f57538g = i5;
                this.f57539h = i6;
            }

            /* renamed from: a */
            public final void mo13596a() {
                double[] dArr = this.f57532a;
                double[] dArr2 = this.f57533b;
                int i = this.f57534c;
                int i2 = this.f57535d;
                int i3 = this.f57536e;
                int i4 = this.f57537f;
                int i5 = this.f57538g;
                int i6 = this.f57539h;
                if (dArr != null && dArr2 != null && i >= 0 && i3 >= 0) {
                    if (i5 >= 0) {
                        double d;
                        while (true) {
                            int i7 = 0;
                            int i8;
                            int i9;
                            int i10;
                            int i11;
                            int i12;
                            double[] dArr3;
                            double[] dArr4;
                            double[] dArr5;
                            Merger merger;
                            Merger merger2;
                            double[] dArr6;
                            int i13;
                            if (i2 >= i4) {
                                if (i2 <= i6) {
                                    break;
                                }
                                i8 = i2 >>> 1;
                                d = dArr[i8 + i];
                                i9 = i4;
                                while (i7 < i9) {
                                    i10 = (i7 + i9) >>> 1;
                                    if (d <= dArr[i10 + i3]) {
                                        i9 = i10;
                                    } else {
                                        i7 = i10 + 1;
                                    }
                                }
                                i11 = i8;
                                i12 = i9;
                                dArr3 = dArr;
                                dArr4 = dArr2;
                                dArr5 = dArr;
                                merger = merger2;
                                dArr6 = dArr2;
                                i13 = i6;
                                merger2 = new Merger(r10, dArr3, dArr4, i + i11, i2 - i11, i3 + i12, i4 - i12, (i5 + i11) + i12, i6);
                                mo12939b(1);
                                merger.m59284j();
                                i2 = i11;
                                i4 = i12;
                                dArr = dArr5;
                                dArr2 = dArr6;
                            } else if (i4 <= i6) {
                                break;
                            } else {
                                i8 = i4 >>> 1;
                                d = dArr[i8 + i3];
                                i9 = i2;
                                while (i7 < i9) {
                                    i10 = (i7 + i9) >>> 1;
                                    if (d <= dArr[i10 + i]) {
                                        i9 = i10;
                                    } else {
                                        i7 = i10 + 1;
                                    }
                                }
                                i12 = i8;
                                i11 = i9;
                                dArr3 = dArr;
                                dArr4 = dArr2;
                                dArr5 = dArr;
                                merger = merger2;
                                dArr6 = dArr2;
                                i13 = i6;
                                merger2 = new Merger(r10, dArr3, dArr4, i + i11, i2 - i11, i3 + i12, i4 - i12, (i5 + i11) + i12, i6);
                                mo12939b(1);
                                merger.m59284j();
                                i2 = i11;
                                i4 = i12;
                                dArr = dArr5;
                                dArr2 = dArr6;
                            }
                        }
                        i2 += i;
                        i4 += i3;
                        while (i < i2 && i3 < i4) {
                            double d2 = dArr[i];
                            d = dArr[i3];
                            if (d2 <= d) {
                                i++;
                            } else {
                                i3++;
                                d2 = d;
                            }
                            int i14 = i5 + 1;
                            dArr2[i5] = d2;
                            i5 = i14;
                        }
                        if (i3 < i4) {
                            System.arraycopy(dArr, i3, dArr2, i5, i4 - i3);
                        } else if (i < i2) {
                            System.arraycopy(dArr, i, dArr2, i5, i2 - i);
                        }
                        mo12941d();
                        return;
                    }
                }
                throw new IllegalStateException();
            }
        }

        static final class Sorter extends CountedCompleter<Void> {
            static final long serialVersionUID = 2446542900576103244L;
            /* renamed from: a */
            final double[] f57540a;
            /* renamed from: b */
            final double[] f57541b;
            /* renamed from: c */
            final int f57542c;
            /* renamed from: d */
            final int f57543d;
            /* renamed from: e */
            final int f57544e;
            /* renamed from: f */
            final int f57545f;

            Sorter(CountedCompleter<?> countedCompleter, double[] dArr, double[] dArr2, int i, int i2, int i3, int i4) {
                super(countedCompleter);
                this.f57540a = dArr;
                this.f57541b = dArr2;
                this.f57542c = i;
                this.f57543d = i2;
                this.f57544e = i3;
                this.f57545f = i4;
            }

            /* renamed from: a */
            public final void mo13596a() {
                int i;
                double[] dArr = this.f57540a;
                double[] dArr2 = this.f57541b;
                int i2 = this.f57542c;
                int i3 = this.f57543d;
                int i4 = this.f57544e;
                int i5 = this.f57545f;
                CountedCompleter countedCompleter = this;
                int i6 = i3;
                while (i6 > i5) {
                    int i7 = i6 >>> 1;
                    int i8 = i7 >>> 1;
                    int i9 = i7 + i8;
                    int i10 = i4 + i7;
                    CountedCompleter countedCompleter2 = r1;
                    int i11 = i4;
                    i = i6;
                    CountedCompleter merger = new Merger(countedCompleter, dArr2, dArr, i4, i7, i10, i6 - i7, i2, i5);
                    CountedCompleter relay = new Relay(countedCompleter2);
                    int i12 = i2 + i7;
                    int i13 = i2 + i9;
                    i -= i9;
                    double[] dArr3 = dArr;
                    double[] dArr4 = dArr2;
                    CountedCompleter countedCompleter3 = relay;
                    relay = merger;
                    i6 = i5;
                    merger = new Merger(relay, dArr3, dArr4, i12, i8, i13, i, i10, i6);
                    CountedCompleter relay2 = new Relay(relay);
                    int i14 = i5;
                    new Sorter(relay2, dArr3, dArr4, i13, i, i11 + i9, i14).m59284j();
                    int i15 = i8;
                    new Sorter(relay2, dArr3, dArr4, i12, i15, i10, i14).m59284j();
                    i9 = i2 + i8;
                    i7 -= i8;
                    countedCompleter2 = new Relay(new Merger(countedCompleter3, dArr3, dArr4, i2, i15, i9, i7, i11, i6));
                    new Sorter(countedCompleter2, dArr3, dArr4, i9, i7, i11 + i8, i5).m59284j();
                    countedCompleter = new EmptyCompleter(countedCompleter2);
                    i6 = i8;
                    i4 = i11;
                    Sorter sorter = this;
                }
                i = i6;
                DualPivotQuicksort.m59050a(dArr, i2, (i2 + i) - 1, dArr2, i4, i);
                countedCompleter.mo12941d();
            }
        }

        FJDouble() {
        }
    }

    static final class FJFloat {

        static final class Merger extends CountedCompleter<Void> {
            static final long serialVersionUID = 2446542900576103244L;
            /* renamed from: a */
            final float[] f57546a;
            /* renamed from: b */
            final float[] f57547b;
            /* renamed from: c */
            final int f57548c;
            /* renamed from: d */
            final int f57549d;
            /* renamed from: e */
            final int f57550e;
            /* renamed from: f */
            final int f57551f;
            /* renamed from: g */
            final int f57552g;
            /* renamed from: h */
            final int f57553h;

            Merger(CountedCompleter<?> countedCompleter, float[] fArr, float[] fArr2, int i, int i2, int i3, int i4, int i5, int i6) {
                super(countedCompleter);
                this.f57546a = fArr;
                this.f57547b = fArr2;
                this.f57548c = i;
                this.f57549d = i2;
                this.f57550e = i3;
                this.f57551f = i4;
                this.f57552g = i5;
                this.f57553h = i6;
            }

            /* renamed from: a */
            public final void mo13596a() {
                float[] fArr = this.f57546a;
                float[] fArr2 = this.f57547b;
                int i = this.f57548c;
                int i2 = this.f57549d;
                int i3 = this.f57550e;
                int i4 = this.f57551f;
                int i5 = this.f57552g;
                int i6 = this.f57553h;
                if (fArr != null && fArr2 != null && i >= 0 && i3 >= 0) {
                    if (i5 >= 0) {
                        int i7;
                        while (true) {
                            int i8 = 0;
                            float f;
                            int i9;
                            int i10;
                            int i11;
                            int i12;
                            float[] fArr3;
                            float[] fArr4;
                            float[] fArr5;
                            Merger merger;
                            Merger merger2;
                            float[] fArr6;
                            int i13;
                            if (i2 >= i4) {
                                if (i2 <= i6) {
                                    break;
                                }
                                i7 = i2 >>> 1;
                                f = fArr[i7 + i];
                                i9 = i4;
                                while (i8 < i9) {
                                    i10 = (i8 + i9) >>> 1;
                                    if (f <= fArr[i10 + i3]) {
                                        i9 = i10;
                                    } else {
                                        i8 = i10 + 1;
                                    }
                                }
                                i11 = i7;
                                i12 = i9;
                                fArr3 = fArr;
                                fArr4 = fArr2;
                                fArr5 = fArr;
                                merger = merger2;
                                fArr6 = fArr2;
                                i13 = i6;
                                merger2 = new Merger(r10, fArr3, fArr4, i + i11, i2 - i11, i3 + i12, i4 - i12, (i5 + i11) + i12, i6);
                                mo12939b(1);
                                merger.m59284j();
                                i2 = i11;
                                i4 = i12;
                                fArr = fArr5;
                                fArr2 = fArr6;
                            } else if (i4 <= i6) {
                                break;
                            } else {
                                i7 = i4 >>> 1;
                                f = fArr[i7 + i3];
                                i9 = i2;
                                while (i8 < i9) {
                                    i10 = (i8 + i9) >>> 1;
                                    if (f <= fArr[i10 + i]) {
                                        i9 = i10;
                                    } else {
                                        i8 = i10 + 1;
                                    }
                                }
                                i12 = i7;
                                i11 = i9;
                                fArr3 = fArr;
                                fArr4 = fArr2;
                                fArr5 = fArr;
                                merger = merger2;
                                fArr6 = fArr2;
                                i13 = i6;
                                merger2 = new Merger(r10, fArr3, fArr4, i + i11, i2 - i11, i3 + i12, i4 - i12, (i5 + i11) + i12, i6);
                                mo12939b(1);
                                merger.m59284j();
                                i2 = i11;
                                i4 = i12;
                                fArr = fArr5;
                                fArr2 = fArr6;
                            }
                        }
                        i2 += i;
                        i4 += i3;
                        while (i < i2 && i3 < i4) {
                            float f2 = fArr[i];
                            float f3 = fArr[i3];
                            if (f2 <= f3) {
                                i++;
                            } else {
                                i3++;
                                f2 = f3;
                            }
                            i7 = i5 + 1;
                            fArr2[i5] = f2;
                            i5 = i7;
                        }
                        if (i3 < i4) {
                            System.arraycopy(fArr, i3, fArr2, i5, i4 - i3);
                        } else if (i < i2) {
                            System.arraycopy(fArr, i, fArr2, i5, i2 - i);
                        }
                        mo12941d();
                        return;
                    }
                }
                throw new IllegalStateException();
            }
        }

        static final class Sorter extends CountedCompleter<Void> {
            static final long serialVersionUID = 2446542900576103244L;
            /* renamed from: a */
            final float[] f57554a;
            /* renamed from: b */
            final float[] f57555b;
            /* renamed from: c */
            final int f57556c;
            /* renamed from: d */
            final int f57557d;
            /* renamed from: e */
            final int f57558e;
            /* renamed from: f */
            final int f57559f;

            Sorter(CountedCompleter<?> countedCompleter, float[] fArr, float[] fArr2, int i, int i2, int i3, int i4) {
                super(countedCompleter);
                this.f57554a = fArr;
                this.f57555b = fArr2;
                this.f57556c = i;
                this.f57557d = i2;
                this.f57558e = i3;
                this.f57559f = i4;
            }

            /* renamed from: a */
            public final void mo13596a() {
                int i;
                float[] fArr = this.f57554a;
                float[] fArr2 = this.f57555b;
                int i2 = this.f57556c;
                int i3 = this.f57557d;
                int i4 = this.f57558e;
                int i5 = this.f57559f;
                CountedCompleter countedCompleter = this;
                int i6 = i3;
                while (i6 > i5) {
                    int i7 = i6 >>> 1;
                    int i8 = i7 >>> 1;
                    int i9 = i7 + i8;
                    int i10 = i4 + i7;
                    CountedCompleter countedCompleter2 = r1;
                    int i11 = i4;
                    i = i6;
                    CountedCompleter merger = new Merger(countedCompleter, fArr2, fArr, i4, i7, i10, i6 - i7, i2, i5);
                    CountedCompleter relay = new Relay(countedCompleter2);
                    int i12 = i2 + i7;
                    int i13 = i2 + i9;
                    i -= i9;
                    float[] fArr3 = fArr;
                    float[] fArr4 = fArr2;
                    CountedCompleter countedCompleter3 = relay;
                    relay = merger;
                    i6 = i5;
                    merger = new Merger(relay, fArr3, fArr4, i12, i8, i13, i, i10, i6);
                    CountedCompleter relay2 = new Relay(relay);
                    int i14 = i5;
                    new Sorter(relay2, fArr3, fArr4, i13, i, i11 + i9, i14).m59284j();
                    int i15 = i8;
                    new Sorter(relay2, fArr3, fArr4, i12, i15, i10, i14).m59284j();
                    i9 = i2 + i8;
                    i7 -= i8;
                    countedCompleter2 = new Relay(new Merger(countedCompleter3, fArr3, fArr4, i2, i15, i9, i7, i11, i6));
                    new Sorter(countedCompleter2, fArr3, fArr4, i9, i7, i11 + i8, i5).m59284j();
                    countedCompleter = new EmptyCompleter(countedCompleter2);
                    i6 = i8;
                    i4 = i11;
                    Sorter sorter = this;
                }
                i = i6;
                DualPivotQuicksort.m59052a(fArr, i2, (i2 + i) - 1, fArr2, i4, i);
                countedCompleter.mo12941d();
            }
        }

        FJFloat() {
        }
    }

    static final class FJInt {

        static final class Merger extends CountedCompleter<Void> {
            static final long serialVersionUID = 2446542900576103244L;
            /* renamed from: a */
            final int[] f57560a;
            /* renamed from: b */
            final int[] f57561b;
            /* renamed from: c */
            final int f57562c;
            /* renamed from: d */
            final int f57563d;
            /* renamed from: e */
            final int f57564e;
            /* renamed from: f */
            final int f57565f;
            /* renamed from: g */
            final int f57566g;
            /* renamed from: h */
            final int f57567h;

            Merger(CountedCompleter<?> countedCompleter, int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6) {
                super(countedCompleter);
                this.f57560a = iArr;
                this.f57561b = iArr2;
                this.f57562c = i;
                this.f57563d = i2;
                this.f57564e = i3;
                this.f57565f = i4;
                this.f57566g = i5;
                this.f57567h = i6;
            }

            /* renamed from: a */
            public final void mo13596a() {
                int[] iArr = this.f57560a;
                int[] iArr2 = this.f57561b;
                int i = this.f57562c;
                int i2 = this.f57563d;
                int i3 = this.f57564e;
                int i4 = this.f57565f;
                int i5 = this.f57566g;
                int i6 = this.f57567h;
                if (iArr != null && iArr2 != null && i >= 0 && i3 >= 0) {
                    if (i5 >= 0) {
                        int i7;
                        int i8;
                        while (true) {
                            i7 = 0;
                            int i9;
                            int i10;
                            int i11;
                            int i12;
                            int i13;
                            int[] iArr3;
                            int[] iArr4;
                            int[] iArr5;
                            Merger merger;
                            Merger merger2;
                            int[] iArr6;
                            int i14;
                            if (i2 >= i4) {
                                if (i2 <= i6) {
                                    break;
                                }
                                i8 = i2 >>> 1;
                                i9 = iArr[i8 + i];
                                i10 = i4;
                                while (i7 < i10) {
                                    i11 = (i7 + i10) >>> 1;
                                    if (i9 <= iArr[i11 + i3]) {
                                        i10 = i11;
                                    } else {
                                        i7 = i11 + 1;
                                    }
                                }
                                i12 = i8;
                                i13 = i10;
                                iArr3 = iArr;
                                iArr4 = iArr2;
                                iArr5 = iArr;
                                merger = merger2;
                                iArr6 = iArr2;
                                i14 = i6;
                                merger2 = new Merger(r10, iArr3, iArr4, i + i12, i2 - i12, i3 + i13, i4 - i13, (i5 + i12) + i13, i6);
                                mo12939b(1);
                                merger.m59284j();
                                i2 = i12;
                                i4 = i13;
                                iArr = iArr5;
                                iArr2 = iArr6;
                            } else if (i4 <= i6) {
                                break;
                            } else {
                                i8 = i4 >>> 1;
                                i9 = iArr[i8 + i3];
                                i10 = i2;
                                while (i7 < i10) {
                                    i11 = (i7 + i10) >>> 1;
                                    if (i9 <= iArr[i11 + i]) {
                                        i10 = i11;
                                    } else {
                                        i7 = i11 + 1;
                                    }
                                }
                                i13 = i8;
                                i12 = i10;
                                iArr3 = iArr;
                                iArr4 = iArr2;
                                iArr5 = iArr;
                                merger = merger2;
                                iArr6 = iArr2;
                                i14 = i6;
                                merger2 = new Merger(r10, iArr3, iArr4, i + i12, i2 - i12, i3 + i13, i4 - i13, (i5 + i12) + i13, i6);
                                mo12939b(1);
                                merger.m59284j();
                                i2 = i12;
                                i4 = i13;
                                iArr = iArr5;
                                iArr2 = iArr6;
                            }
                        }
                        i2 += i;
                        i4 += i3;
                        while (i < i2 && i3 < i4) {
                            i7 = iArr[i];
                            i8 = iArr[i3];
                            if (i7 <= i8) {
                                i++;
                            } else {
                                i3++;
                                i7 = i8;
                            }
                            i8 = i5 + 1;
                            iArr2[i5] = i7;
                            i5 = i8;
                        }
                        if (i3 < i4) {
                            System.arraycopy(iArr, i3, iArr2, i5, i4 - i3);
                        } else if (i < i2) {
                            System.arraycopy(iArr, i, iArr2, i5, i2 - i);
                        }
                        mo12941d();
                        return;
                    }
                }
                throw new IllegalStateException();
            }
        }

        static final class Sorter extends CountedCompleter<Void> {
            static final long serialVersionUID = 2446542900576103244L;
            /* renamed from: a */
            final int[] f57568a;
            /* renamed from: b */
            final int[] f57569b;
            /* renamed from: c */
            final int f57570c;
            /* renamed from: d */
            final int f57571d;
            /* renamed from: e */
            final int f57572e;
            /* renamed from: f */
            final int f57573f;

            Sorter(CountedCompleter<?> countedCompleter, int[] iArr, int[] iArr2, int i, int i2, int i3, int i4) {
                super(countedCompleter);
                this.f57568a = iArr;
                this.f57569b = iArr2;
                this.f57570c = i;
                this.f57571d = i2;
                this.f57572e = i3;
                this.f57573f = i4;
            }

            /* renamed from: a */
            public final void mo13596a() {
                int i;
                int[] iArr = this.f57568a;
                int[] iArr2 = this.f57569b;
                int i2 = this.f57570c;
                int i3 = this.f57571d;
                int i4 = this.f57572e;
                int i5 = this.f57573f;
                CountedCompleter countedCompleter = this;
                int i6 = i3;
                while (i6 > i5) {
                    int i7 = i6 >>> 1;
                    int i8 = i7 >>> 1;
                    int i9 = i7 + i8;
                    int i10 = i4 + i7;
                    CountedCompleter countedCompleter2 = r1;
                    int i11 = i4;
                    i = i6;
                    CountedCompleter merger = new Merger(countedCompleter, iArr2, iArr, i4, i7, i10, i6 - i7, i2, i5);
                    CountedCompleter relay = new Relay(countedCompleter2);
                    int i12 = i2 + i7;
                    int i13 = i2 + i9;
                    i -= i9;
                    int[] iArr3 = iArr;
                    int[] iArr4 = iArr2;
                    CountedCompleter countedCompleter3 = relay;
                    relay = merger;
                    i6 = i5;
                    merger = new Merger(relay, iArr3, iArr4, i12, i8, i13, i, i10, i6);
                    CountedCompleter relay2 = new Relay(relay);
                    int i14 = i5;
                    new Sorter(relay2, iArr3, iArr4, i13, i, i11 + i9, i14).m59284j();
                    int i15 = i8;
                    new Sorter(relay2, iArr3, iArr4, i12, i15, i10, i14).m59284j();
                    i9 = i2 + i8;
                    i7 -= i8;
                    countedCompleter2 = new Relay(new Merger(countedCompleter3, iArr3, iArr4, i2, i15, i9, i7, i11, i6));
                    new Sorter(countedCompleter2, iArr3, iArr4, i9, i7, i11 + i8, i5).m59284j();
                    countedCompleter = new EmptyCompleter(countedCompleter2);
                    i6 = i8;
                    i4 = i11;
                    Sorter sorter = this;
                }
                i = i6;
                DualPivotQuicksort.m59054a(iArr, i2, (i2 + i) - 1, iArr2, i4, i);
                countedCompleter.mo12941d();
            }
        }

        FJInt() {
        }
    }

    static final class FJLong {

        static final class Merger extends CountedCompleter<Void> {
            static final long serialVersionUID = 2446542900576103244L;
            /* renamed from: a */
            final long[] f57574a;
            /* renamed from: b */
            final long[] f57575b;
            /* renamed from: c */
            final int f57576c;
            /* renamed from: d */
            final int f57577d;
            /* renamed from: e */
            final int f57578e;
            /* renamed from: f */
            final int f57579f;
            /* renamed from: g */
            final int f57580g;
            /* renamed from: h */
            final int f57581h;

            Merger(CountedCompleter<?> countedCompleter, long[] jArr, long[] jArr2, int i, int i2, int i3, int i4, int i5, int i6) {
                super(countedCompleter);
                this.f57574a = jArr;
                this.f57575b = jArr2;
                this.f57576c = i;
                this.f57577d = i2;
                this.f57578e = i3;
                this.f57579f = i4;
                this.f57580g = i5;
                this.f57581h = i6;
            }

            /* renamed from: a */
            public final void mo13596a() {
                long[] jArr = this.f57574a;
                long[] jArr2 = this.f57575b;
                int i = this.f57576c;
                int i2 = this.f57577d;
                int i3 = this.f57578e;
                int i4 = this.f57579f;
                int i5 = this.f57580g;
                int i6 = this.f57581h;
                if (jArr != null && jArr2 != null && i >= 0 && i3 >= 0) {
                    if (i5 >= 0) {
                        long j;
                        while (true) {
                            int i7 = 0;
                            int i8;
                            int i9;
                            int i10;
                            int i11;
                            int i12;
                            long[] jArr3;
                            long[] jArr4;
                            long[] jArr5;
                            Merger merger;
                            Merger merger2;
                            long[] jArr6;
                            int i13;
                            if (i2 >= i4) {
                                if (i2 <= i6) {
                                    break;
                                }
                                i8 = i2 >>> 1;
                                j = jArr[i8 + i];
                                i9 = i4;
                                while (i7 < i9) {
                                    i10 = (i7 + i9) >>> 1;
                                    if (j <= jArr[i10 + i3]) {
                                        i9 = i10;
                                    } else {
                                        i7 = i10 + 1;
                                    }
                                }
                                i11 = i8;
                                i12 = i9;
                                jArr3 = jArr;
                                jArr4 = jArr2;
                                jArr5 = jArr;
                                merger = merger2;
                                jArr6 = jArr2;
                                i13 = i6;
                                merger2 = new Merger(r10, jArr3, jArr4, i + i11, i2 - i11, i3 + i12, i4 - i12, (i5 + i11) + i12, i6);
                                mo12939b(1);
                                merger.m59284j();
                                i2 = i11;
                                i4 = i12;
                                jArr = jArr5;
                                jArr2 = jArr6;
                            } else if (i4 <= i6) {
                                break;
                            } else {
                                i8 = i4 >>> 1;
                                j = jArr[i8 + i3];
                                i9 = i2;
                                while (i7 < i9) {
                                    i10 = (i7 + i9) >>> 1;
                                    if (j <= jArr[i10 + i]) {
                                        i9 = i10;
                                    } else {
                                        i7 = i10 + 1;
                                    }
                                }
                                i12 = i8;
                                i11 = i9;
                                jArr3 = jArr;
                                jArr4 = jArr2;
                                jArr5 = jArr;
                                merger = merger2;
                                jArr6 = jArr2;
                                i13 = i6;
                                merger2 = new Merger(r10, jArr3, jArr4, i + i11, i2 - i11, i3 + i12, i4 - i12, (i5 + i11) + i12, i6);
                                mo12939b(1);
                                merger.m59284j();
                                i2 = i11;
                                i4 = i12;
                                jArr = jArr5;
                                jArr2 = jArr6;
                            }
                        }
                        i2 += i;
                        i4 += i3;
                        while (i < i2 && i3 < i4) {
                            long j2 = jArr[i];
                            j = jArr[i3];
                            if (j2 <= j) {
                                i++;
                            } else {
                                i3++;
                                j2 = j;
                            }
                            int i14 = i5 + 1;
                            jArr2[i5] = j2;
                            i5 = i14;
                        }
                        if (i3 < i4) {
                            System.arraycopy(jArr, i3, jArr2, i5, i4 - i3);
                        } else if (i < i2) {
                            System.arraycopy(jArr, i, jArr2, i5, i2 - i);
                        }
                        mo12941d();
                        return;
                    }
                }
                throw new IllegalStateException();
            }
        }

        static final class Sorter extends CountedCompleter<Void> {
            static final long serialVersionUID = 2446542900576103244L;
            /* renamed from: a */
            final long[] f57582a;
            /* renamed from: b */
            final long[] f57583b;
            /* renamed from: c */
            final int f57584c;
            /* renamed from: d */
            final int f57585d;
            /* renamed from: e */
            final int f57586e;
            /* renamed from: f */
            final int f57587f;

            Sorter(CountedCompleter<?> countedCompleter, long[] jArr, long[] jArr2, int i, int i2, int i3, int i4) {
                super(countedCompleter);
                this.f57582a = jArr;
                this.f57583b = jArr2;
                this.f57584c = i;
                this.f57585d = i2;
                this.f57586e = i3;
                this.f57587f = i4;
            }

            /* renamed from: a */
            public final void mo13596a() {
                int i;
                long[] jArr = this.f57582a;
                long[] jArr2 = this.f57583b;
                int i2 = this.f57584c;
                int i3 = this.f57585d;
                int i4 = this.f57586e;
                int i5 = this.f57587f;
                CountedCompleter countedCompleter = this;
                int i6 = i3;
                while (i6 > i5) {
                    int i7 = i6 >>> 1;
                    int i8 = i7 >>> 1;
                    int i9 = i7 + i8;
                    int i10 = i4 + i7;
                    CountedCompleter countedCompleter2 = r1;
                    int i11 = i4;
                    i = i6;
                    CountedCompleter merger = new Merger(countedCompleter, jArr2, jArr, i4, i7, i10, i6 - i7, i2, i5);
                    CountedCompleter relay = new Relay(countedCompleter2);
                    int i12 = i2 + i7;
                    int i13 = i2 + i9;
                    i -= i9;
                    long[] jArr3 = jArr;
                    long[] jArr4 = jArr2;
                    CountedCompleter countedCompleter3 = relay;
                    relay = merger;
                    i6 = i5;
                    merger = new Merger(relay, jArr3, jArr4, i12, i8, i13, i, i10, i6);
                    CountedCompleter relay2 = new Relay(relay);
                    int i14 = i5;
                    new Sorter(relay2, jArr3, jArr4, i13, i, i11 + i9, i14).m59284j();
                    int i15 = i8;
                    new Sorter(relay2, jArr3, jArr4, i12, i15, i10, i14).m59284j();
                    i9 = i2 + i8;
                    i7 -= i8;
                    countedCompleter2 = new Relay(new Merger(countedCompleter3, jArr3, jArr4, i2, i15, i9, i7, i11, i6));
                    new Sorter(countedCompleter2, jArr3, jArr4, i9, i7, i11 + i8, i5).m59284j();
                    countedCompleter = new EmptyCompleter(countedCompleter2);
                    i6 = i8;
                    i4 = i11;
                    Sorter sorter = this;
                }
                i = i6;
                DualPivotQuicksort.m59056a(jArr, i2, (i2 + i) - 1, jArr2, i4, i);
                countedCompleter.mo12941d();
            }
        }

        FJLong() {
        }
    }

    static final class FJObject {

        static final class Merger<T> extends CountedCompleter<Void> {
            static final long serialVersionUID = 2446542900576103244L;
            /* renamed from: a */
            final T[] f57588a;
            /* renamed from: b */
            final T[] f57589b;
            /* renamed from: c */
            final int f57590c;
            /* renamed from: d */
            final int f57591d;
            /* renamed from: e */
            final int f57592e;
            /* renamed from: f */
            final int f57593f;
            /* renamed from: g */
            final int f57594g;
            /* renamed from: h */
            final int f57595h;
            /* renamed from: i */
            Comparator<? super T> f57596i;

            Merger(CountedCompleter<?> countedCompleter, T[] tArr, T[] tArr2, int i, int i2, int i3, int i4, int i5, int i6, Comparator<? super T> comparator) {
                super(countedCompleter);
                this.f57588a = tArr;
                this.f57589b = tArr2;
                this.f57590c = i;
                this.f57591d = i2;
                this.f57592e = i3;
                this.f57593f = i4;
                this.f57594g = i5;
                this.f57595h = i6;
                this.f57596i = comparator;
            }

            /* renamed from: a */
            public final void mo13596a() {
                Comparator comparator = this.f57596i;
                Object[] objArr = this.f57588a;
                Object[] objArr2 = this.f57589b;
                int i = this.f57590c;
                int i2 = this.f57591d;
                int i3 = this.f57592e;
                int i4 = this.f57593f;
                int i5 = this.f57594g;
                int i6 = this.f57595h;
                if (objArr != null && objArr2 != null && i >= 0 && i3 >= 0 && i5 >= 0) {
                    if (comparator != null) {
                        int i7;
                        while (true) {
                            int i8 = 0;
                            int i9 = 1;
                            Object obj;
                            int i10;
                            int i11;
                            int i12;
                            int i13;
                            Object[] objArr3;
                            Object[] objArr4;
                            Object[] objArr5;
                            Object[] objArr6;
                            Merger merger;
                            Merger merger2;
                            int i14;
                            int i15;
                            int i16;
                            if (i2 >= i4) {
                                if (i2 <= i6) {
                                    break;
                                }
                                i7 = i2 >>> 1;
                                obj = objArr[i7 + i];
                                i10 = i4;
                                while (i8 < i10) {
                                    i11 = (i8 + i10) >>> i9;
                                    if (comparator.compare(obj, objArr[i11 + i3]) <= 0) {
                                        i10 = i11;
                                    } else {
                                        i8 = i11 + 1;
                                    }
                                    i9 = 1;
                                }
                                i12 = i7;
                                i13 = i10;
                                objArr3 = objArr;
                                objArr4 = objArr2;
                                objArr5 = objArr;
                                objArr6 = objArr2;
                                merger = merger2;
                                i14 = i6;
                                i15 = i5;
                                i16 = i3;
                                merger2 = new Merger(r11, objArr3, objArr4, i + i12, i2 - i12, i3 + i13, i4 - i13, (i5 + i12) + i13, i14, comparator);
                                mo12939b(1);
                                merger.m59284j();
                                i2 = i12;
                                i4 = i13;
                                i6 = i14;
                                i5 = i15;
                                i3 = i16;
                                objArr = objArr5;
                                objArr2 = objArr6;
                            } else if (i4 <= i6) {
                                break;
                            } else {
                                i7 = i4 >>> 1;
                                obj = objArr[i7 + i3];
                                i10 = i2;
                                while (i8 < i10) {
                                    i11 = (i8 + i10) >>> 1;
                                    if (comparator.compare(obj, objArr[i11 + i]) <= 0) {
                                        i10 = i11;
                                    } else {
                                        i8 = i11 + 1;
                                    }
                                }
                                i13 = i7;
                                i12 = i10;
                                objArr3 = objArr;
                                objArr4 = objArr2;
                                objArr5 = objArr;
                                objArr6 = objArr2;
                                merger = merger2;
                                i14 = i6;
                                i15 = i5;
                                i16 = i3;
                                merger2 = new Merger(r11, objArr3, objArr4, i + i12, i2 - i12, i3 + i13, i4 - i13, (i5 + i12) + i13, i14, comparator);
                                mo12939b(1);
                                merger.m59284j();
                                i2 = i12;
                                i4 = i13;
                                i6 = i14;
                                i5 = i15;
                                i3 = i16;
                                objArr = objArr5;
                                objArr2 = objArr6;
                            }
                        }
                        i2 += i;
                        i4 += i3;
                        while (i < i2 && i3 < i4) {
                            Object obj2 = objArr[i];
                            Object obj3 = objArr[i3];
                            if (comparator.compare(obj2, obj3) <= 0) {
                                i++;
                            } else {
                                i3++;
                                obj2 = obj3;
                            }
                            i7 = i5 + 1;
                            objArr2[i5] = obj2;
                            i5 = i7;
                        }
                        if (i3 < i4) {
                            System.arraycopy(objArr, i3, objArr2, i5, i4 - i3);
                        } else if (i < i2) {
                            System.arraycopy(objArr, i, objArr2, i5, i2 - i);
                        }
                        mo12941d();
                        return;
                    }
                }
                throw new IllegalStateException();
            }
        }

        static final class Sorter<T> extends CountedCompleter<Void> {
            static final long serialVersionUID = 2446542900576103244L;
            /* renamed from: a */
            final T[] f57597a;
            /* renamed from: b */
            final T[] f57598b;
            /* renamed from: c */
            final int f57599c;
            /* renamed from: d */
            final int f57600d;
            /* renamed from: e */
            final int f57601e;
            /* renamed from: f */
            final int f57602f;
            /* renamed from: g */
            Comparator<? super T> f57603g;

            Sorter(CountedCompleter<?> countedCompleter, T[] tArr, T[] tArr2, int i, int i2, int i3, int i4, Comparator<? super T> comparator) {
                super(countedCompleter);
                this.f57597a = tArr;
                this.f57598b = tArr2;
                this.f57599c = i;
                this.f57600d = i2;
                this.f57601e = i3;
                this.f57602f = i4;
                this.f57603g = comparator;
            }

            /* renamed from: a */
            public final void mo13596a() {
                int i;
                Comparator comparator = this.f57603g;
                Object[] objArr = this.f57597a;
                Object[] objArr2 = this.f57598b;
                int i2 = this.f57599c;
                int i3 = this.f57600d;
                int i4 = this.f57601e;
                int i5 = this.f57602f;
                CountedCompleter countedCompleter = this;
                int i6 = i3;
                while (i6 > i5) {
                    int i7 = i6 >>> 1;
                    int i8 = i7 >>> 1;
                    int i9 = i7 + i8;
                    int i10 = i4 + i7;
                    Object[] objArr3 = objArr2;
                    CountedCompleter countedCompleter2 = r1;
                    i = i6;
                    int i11 = i5;
                    int i12 = i4;
                    CountedCompleter merger = new Merger(countedCompleter, objArr2, objArr, i4, i7, i10, i6 - i7, i2, i5, comparator);
                    CountedCompleter relay = new Relay(countedCompleter2);
                    int i13 = i2 + i7;
                    int i14 = i2 + i9;
                    i -= i9;
                    Object[] objArr4 = objArr;
                    Object[] objArr5 = objArr3;
                    CountedCompleter countedCompleter3 = relay;
                    relay = merger;
                    Comparator comparator2 = comparator;
                    merger = new Merger(relay, objArr4, objArr5, i13, i8, i14, i, i10, i5, comparator2);
                    CountedCompleter relay2 = new Relay(relay);
                    int i15 = i11;
                    Comparator comparator3 = comparator;
                    new Sorter(relay2, objArr4, objArr5, i14, i, i12 + i9, i15, comparator3).m59284j();
                    int i16 = i8;
                    new Sorter(relay2, objArr4, objArr5, i13, i16, i10, i15, comparator3).m59284j();
                    i9 = i2 + i8;
                    i7 -= i8;
                    relay = new Relay(new Merger(countedCompleter3, objArr4, objArr5, i2, i16, i9, i7, i12, i5, comparator2));
                    new Sorter(relay, objArr4, objArr5, i9, i7, i12 + i8, i11, comparator).m59284j();
                    countedCompleter = new EmptyCompleter(relay);
                    i6 = i8;
                    objArr2 = objArr3;
                    i5 = i11;
                    i4 = i12;
                    Sorter sorter = this;
                }
                i = i6;
                TimSort.m59207a(objArr, i2, i2 + i, comparator, objArr2, i4, i);
                countedCompleter.mo12941d();
            }
        }

        FJObject() {
        }
    }

    static final class FJShort {

        static final class Merger extends CountedCompleter<Void> {
            static final long serialVersionUID = 2446542900576103244L;
            /* renamed from: a */
            final short[] f57604a;
            /* renamed from: b */
            final short[] f57605b;
            /* renamed from: c */
            final int f57606c;
            /* renamed from: d */
            final int f57607d;
            /* renamed from: e */
            final int f57608e;
            /* renamed from: f */
            final int f57609f;
            /* renamed from: g */
            final int f57610g;
            /* renamed from: h */
            final int f57611h;

            Merger(CountedCompleter<?> countedCompleter, short[] sArr, short[] sArr2, int i, int i2, int i3, int i4, int i5, int i6) {
                super(countedCompleter);
                this.f57604a = sArr;
                this.f57605b = sArr2;
                this.f57606c = i;
                this.f57607d = i2;
                this.f57608e = i3;
                this.f57609f = i4;
                this.f57610g = i5;
                this.f57611h = i6;
            }

            /* renamed from: a */
            public final void mo13596a() {
                short[] sArr = this.f57604a;
                short[] sArr2 = this.f57605b;
                int i = this.f57606c;
                int i2 = this.f57607d;
                int i3 = this.f57608e;
                int i4 = this.f57609f;
                int i5 = this.f57610g;
                int i6 = this.f57611h;
                if (sArr != null && sArr2 != null && i >= 0 && i3 >= 0) {
                    if (i5 >= 0) {
                        int i7;
                        while (true) {
                            int i8 = 0;
                            short s;
                            int i9;
                            int i10;
                            int i11;
                            int i12;
                            short[] sArr3;
                            short[] sArr4;
                            short[] sArr5;
                            Merger merger;
                            Merger merger2;
                            short[] sArr6;
                            int i13;
                            if (i2 >= i4) {
                                if (i2 <= i6) {
                                    break;
                                }
                                i7 = i2 >>> 1;
                                s = sArr[i7 + i];
                                i9 = i4;
                                while (i8 < i9) {
                                    i10 = (i8 + i9) >>> 1;
                                    if (s <= sArr[i10 + i3]) {
                                        i9 = i10;
                                    } else {
                                        i8 = i10 + 1;
                                    }
                                }
                                i11 = i7;
                                i12 = i9;
                                sArr3 = sArr;
                                sArr4 = sArr2;
                                sArr5 = sArr;
                                merger = merger2;
                                sArr6 = sArr2;
                                i13 = i6;
                                merger2 = new Merger(r10, sArr3, sArr4, i + i11, i2 - i11, i3 + i12, i4 - i12, (i5 + i11) + i12, i6);
                                mo12939b(1);
                                merger.m59284j();
                                i2 = i11;
                                i4 = i12;
                                sArr = sArr5;
                                sArr2 = sArr6;
                            } else if (i4 <= i6) {
                                break;
                            } else {
                                i7 = i4 >>> 1;
                                s = sArr[i7 + i3];
                                i9 = i2;
                                while (i8 < i9) {
                                    i10 = (i8 + i9) >>> 1;
                                    if (s <= sArr[i10 + i]) {
                                        i9 = i10;
                                    } else {
                                        i8 = i10 + 1;
                                    }
                                }
                                i12 = i7;
                                i11 = i9;
                                sArr3 = sArr;
                                sArr4 = sArr2;
                                sArr5 = sArr;
                                merger = merger2;
                                sArr6 = sArr2;
                                i13 = i6;
                                merger2 = new Merger(r10, sArr3, sArr4, i + i11, i2 - i11, i3 + i12, i4 - i12, (i5 + i11) + i12, i6);
                                mo12939b(1);
                                merger.m59284j();
                                i2 = i11;
                                i4 = i12;
                                sArr = sArr5;
                                sArr2 = sArr6;
                            }
                        }
                        i2 += i;
                        i4 += i3;
                        while (i < i2 && i3 < i4) {
                            short s2 = sArr[i];
                            short s3 = sArr[i3];
                            if (s2 <= s3) {
                                i++;
                            } else {
                                i3++;
                                s2 = s3;
                            }
                            i7 = i5 + 1;
                            sArr2[i5] = s2;
                            i5 = i7;
                        }
                        if (i3 < i4) {
                            System.arraycopy(sArr, i3, sArr2, i5, i4 - i3);
                        } else if (i < i2) {
                            System.arraycopy(sArr, i, sArr2, i5, i2 - i);
                        }
                        mo12941d();
                        return;
                    }
                }
                throw new IllegalStateException();
            }
        }

        static final class Sorter extends CountedCompleter<Void> {
            static final long serialVersionUID = 2446542900576103244L;
            /* renamed from: a */
            final short[] f57612a;
            /* renamed from: b */
            final short[] f57613b;
            /* renamed from: c */
            final int f57614c;
            /* renamed from: d */
            final int f57615d;
            /* renamed from: e */
            final int f57616e;
            /* renamed from: f */
            final int f57617f;

            Sorter(CountedCompleter<?> countedCompleter, short[] sArr, short[] sArr2, int i, int i2, int i3, int i4) {
                super(countedCompleter);
                this.f57612a = sArr;
                this.f57613b = sArr2;
                this.f57614c = i;
                this.f57615d = i2;
                this.f57616e = i3;
                this.f57617f = i4;
            }

            /* renamed from: a */
            public final void mo13596a() {
                int i;
                short[] sArr = this.f57612a;
                short[] sArr2 = this.f57613b;
                int i2 = this.f57614c;
                int i3 = this.f57615d;
                int i4 = this.f57616e;
                int i5 = this.f57617f;
                CountedCompleter countedCompleter = this;
                int i6 = i3;
                while (i6 > i5) {
                    int i7 = i6 >>> 1;
                    int i8 = i7 >>> 1;
                    int i9 = i7 + i8;
                    int i10 = i4 + i7;
                    CountedCompleter countedCompleter2 = r1;
                    int i11 = i4;
                    i = i6;
                    CountedCompleter merger = new Merger(countedCompleter, sArr2, sArr, i4, i7, i10, i6 - i7, i2, i5);
                    CountedCompleter relay = new Relay(countedCompleter2);
                    int i12 = i2 + i7;
                    int i13 = i2 + i9;
                    i -= i9;
                    short[] sArr3 = sArr;
                    short[] sArr4 = sArr2;
                    CountedCompleter countedCompleter3 = relay;
                    relay = merger;
                    i6 = i5;
                    merger = new Merger(relay, sArr3, sArr4, i12, i8, i13, i, i10, i6);
                    CountedCompleter relay2 = new Relay(relay);
                    int i14 = i5;
                    new Sorter(relay2, sArr3, sArr4, i13, i, i11 + i9, i14).m59284j();
                    int i15 = i8;
                    new Sorter(relay2, sArr3, sArr4, i12, i15, i10, i14).m59284j();
                    i9 = i2 + i8;
                    i7 -= i8;
                    countedCompleter2 = new Relay(new Merger(countedCompleter3, sArr3, sArr4, i2, i15, i9, i7, i11, i6));
                    new Sorter(countedCompleter2, sArr3, sArr4, i9, i7, i11 + i8, i5).m59284j();
                    countedCompleter = new EmptyCompleter(countedCompleter2);
                    i6 = i8;
                    i4 = i11;
                    Sorter sorter = this;
                }
                i = i6;
                DualPivotQuicksort.m59058a(sArr, i2, (i2 + i) - 1, sArr2, i4, i);
                countedCompleter.mo12941d();
            }
        }

        FJShort() {
        }
    }

    static final class EmptyCompleter extends CountedCompleter<Void> {
        static final long serialVersionUID = 2446542900576103244L;

        /* renamed from: a */
        public final void mo13596a() {
        }

        EmptyCompleter(CountedCompleter<?> countedCompleter) {
            super(countedCompleter);
        }
    }

    static final class Relay extends CountedCompleter<Void> {
        static final long serialVersionUID = 2446542900576103244L;
        /* renamed from: a */
        final CountedCompleter<?> f57618a;

        /* renamed from: a */
        public final void mo13596a() {
        }

        Relay(CountedCompleter<?> countedCompleter) {
            super(null, 1);
            this.f57618a = countedCompleter;
        }

        /* renamed from: a */
        public final void mo13597a(CountedCompleter<?> countedCompleter) {
            this.f57618a.mo13596a();
        }
    }

    ArraysParallelSortHelpers() {
    }
}
