package com.google.android.exoplayer2.extractor;

import android.support.annotation.Nullable;
import com.google.android.exoplayer2.util.C2289a;

public interface SeekMap {

    /* renamed from: com.google.android.exoplayer2.extractor.SeekMap$a */
    public static final class C2054a {
        /* renamed from: a */
        public final C2076i f5635a;
        /* renamed from: b */
        public final C2076i f5636b;

        public C2054a(C2076i c2076i) {
            this(c2076i, c2076i);
        }

        public C2054a(C2076i c2076i, C2076i c2076i2) {
            this.f5635a = (C2076i) C2289a.m8309a((Object) c2076i);
            this.f5636b = (C2076i) C2289a.m8309a((Object) c2076i2);
        }

        public String toString() {
            String str;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("[");
            stringBuilder.append(this.f5635a);
            if (this.f5635a.equals(this.f5636b)) {
                str = "";
            } else {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(", ");
                stringBuilder2.append(this.f5636b);
                str = stringBuilder2.toString();
            }
            stringBuilder.append(str);
            stringBuilder.append("]");
            return stringBuilder.toString();
        }

        public boolean equals(@Nullable Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    C2054a c2054a = (C2054a) obj;
                    if (!this.f5635a.equals(c2054a.f5635a) || this.f5636b.equals(c2054a.f5636b) == null) {
                        z = false;
                    }
                    return z;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f5635a.hashCode() * 31) + this.f5636b.hashCode();
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.SeekMap$b */
    public static final class C3605b implements SeekMap {
        /* renamed from: a */
        private final long f10885a;
        /* renamed from: b */
        private final C2054a f10886b;

        public boolean isSeekable() {
            return false;
        }

        public C3605b(long j) {
            this(j, 0);
        }

        public C3605b(long j, long j2) {
            this.f10885a = j;
            this.f10886b = new C2054a(j2 == 0 ? C2076i.f5727a : new C2076i(0, j2));
        }

        public long getDurationUs() {
            return this.f10885a;
        }

        public C2054a getSeekPoints(long j) {
            return this.f10886b;
        }
    }

    long getDurationUs();

    C2054a getSeekPoints(long j);

    boolean isSeekable();
}
