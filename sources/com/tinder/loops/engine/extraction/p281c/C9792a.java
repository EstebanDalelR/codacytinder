package com.tinder.loops.engine.extraction.p281c;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/tinder/loops/engine/extraction/model/DecodedFrameInfo;", "", "decodedFramePresentationTimeUS", "", "(J)V", "getDecodedFramePresentationTimeUS", "()J", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "loopsengine_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.loops.engine.extraction.c.a */
public final class C9792a {
    /* renamed from: a */
    private final long f32452a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9792a) {
            if ((this.f32452a == ((C9792a) obj).f32452a ? 1 : null) != null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.f32452a;
        return (int) (j ^ (j >>> 32));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DecodedFrameInfo(decodedFramePresentationTimeUS=");
        stringBuilder.append(this.f32452a);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C9792a(long j) {
        this.f32452a = j;
    }

    /* renamed from: a */
    public final long m40377a() {
        return this.f32452a;
    }
}
