package com.google.android.exoplayer2.source;

public interface ShuffleOrder {

    /* renamed from: com.google.android.exoplayer2.source.ShuffleOrder$a */
    public static final class C3671a implements ShuffleOrder {
        /* renamed from: a */
        private final int f11356a;

        public int getPreviousIndex(int i) {
            i--;
            return i >= 0 ? i : -1;
        }

        public C3671a(int i) {
            this.f11356a = i;
        }

        public int getLength() {
            return this.f11356a;
        }

        public int getNextIndex(int i) {
            i++;
            return i < this.f11356a ? i : -1;
        }

        public int getLastIndex() {
            return this.f11356a > 0 ? this.f11356a - 1 : -1;
        }

        public int getFirstIndex() {
            return this.f11356a > 0 ? 0 : -1;
        }

        public ShuffleOrder cloneAndInsert(int i, int i2) {
            return new C3671a(this.f11356a + i2);
        }

        public ShuffleOrder cloneAndRemove(int i) {
            return new C3671a(this.f11356a - 1);
        }

        public ShuffleOrder cloneAndClear() {
            return new C3671a(0);
        }
    }

    ShuffleOrder cloneAndClear();

    ShuffleOrder cloneAndInsert(int i, int i2);

    ShuffleOrder cloneAndRemove(int i);

    int getFirstIndex();

    int getLastIndex();

    int getLength();

    int getNextIndex(int i);

    int getPreviousIndex(int i);
}
