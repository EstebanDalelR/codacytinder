package com.tinder.places.carousel.view;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/tinder/places/carousel/view/CarouselItemTransformation;", "", "scaleX", "", "scaleY", "translationX", "translationY", "(FFFF)V", "getScaleX", "()F", "getScaleY", "getTranslationX", "getTranslationY", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.carousel.view.b */
public final class C10200b {
    /* renamed from: a */
    private final float f33261a;
    /* renamed from: b */
    private final float f33262b;
    /* renamed from: c */
    private final float f33263c;
    /* renamed from: d */
    private final float f33264d;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C10200b) {
                C10200b c10200b = (C10200b) obj;
                if (Float.compare(this.f33261a, c10200b.f33261a) == 0 && Float.compare(this.f33262b, c10200b.f33262b) == 0 && Float.compare(this.f33263c, c10200b.f33263c) == 0 && Float.compare(this.f33264d, c10200b.f33264d) == 0) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((Float.floatToIntBits(this.f33261a) * 31) + Float.floatToIntBits(this.f33262b)) * 31) + Float.floatToIntBits(this.f33263c)) * 31) + Float.floatToIntBits(this.f33264d);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CarouselItemTransformation(scaleX=");
        stringBuilder.append(this.f33261a);
        stringBuilder.append(", scaleY=");
        stringBuilder.append(this.f33262b);
        stringBuilder.append(", translationX=");
        stringBuilder.append(this.f33263c);
        stringBuilder.append(", translationY=");
        stringBuilder.append(this.f33264d);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C10200b(float f, float f2, float f3, float f4) {
        this.f33261a = f;
        this.f33262b = f2;
        this.f33263c = f3;
        this.f33264d = f4;
    }

    /* renamed from: a */
    public final float m41508a() {
        return this.f33261a;
    }

    /* renamed from: b */
    public final float m41509b() {
        return this.f33262b;
    }

    /* renamed from: c */
    public final float m41510c() {
        return this.f33263c;
    }

    /* renamed from: d */
    public final float m41511d() {
        return this.f33264d;
    }
}
