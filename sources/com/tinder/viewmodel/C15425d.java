package com.tinder.viewmodel;

import android.graphics.drawable.Drawable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0006HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/tinder/viewmodel/PlaceRecTeasersViewModel;", "", "photoUrls", "", "", "backgroundDrawable", "Landroid/graphics/drawable/Drawable;", "(Ljava/util/List;Landroid/graphics/drawable/Drawable;)V", "getBackgroundDrawable", "()Landroid/graphics/drawable/Drawable;", "getPhotoUrls", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "places_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.viewmodel.d */
public final class C15425d {
    @Nullable
    /* renamed from: a */
    private final List<String> f47716a;
    @Nullable
    /* renamed from: b */
    private final Drawable f47717b;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C15425d) {
                C15425d c15425d = (C15425d) obj;
                if (C2668g.a(this.f47716a, c15425d.f47716a) && C2668g.a(this.f47717b, c15425d.f47717b)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        List list = this.f47716a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        Drawable drawable = this.f47717b;
        if (drawable != null) {
            i = drawable.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PlaceRecTeasersViewModel(photoUrls=");
        stringBuilder.append(this.f47716a);
        stringBuilder.append(", backgroundDrawable=");
        stringBuilder.append(this.f47717b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C15425d(@Nullable List<String> list, @Nullable Drawable drawable) {
        this.f47716a = list;
        this.f47717b = drawable;
    }

    @Nullable
    /* renamed from: a */
    public final List<String> m57828a() {
        return this.f47716a;
    }
}
