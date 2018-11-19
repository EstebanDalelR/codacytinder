package com.tinder.domain.places.model;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001:\u0001 BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u000fJJ\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000b¨\u0006!"}, d2 = {"Lcom/tinder/domain/places/model/PlacesConfigExpansion;", "", "initialSize", "Lcom/tinder/domain/places/model/PlacesConfigExpansion$Size;", "titleSize", "introSize", "teaserSize", "titleFontSize", "", "(Lcom/tinder/domain/places/model/PlacesConfigExpansion$Size;Lcom/tinder/domain/places/model/PlacesConfigExpansion$Size;Lcom/tinder/domain/places/model/PlacesConfigExpansion$Size;Lcom/tinder/domain/places/model/PlacesConfigExpansion$Size;Ljava/lang/Float;)V", "getInitialSize", "()Lcom/tinder/domain/places/model/PlacesConfigExpansion$Size;", "getIntroSize", "getTeaserSize", "getTitleFontSize", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getTitleSize", "component1", "component2", "component3", "component4", "component5", "copy", "(Lcom/tinder/domain/places/model/PlacesConfigExpansion$Size;Lcom/tinder/domain/places/model/PlacesConfigExpansion$Size;Lcom/tinder/domain/places/model/PlacesConfigExpansion$Size;Lcom/tinder/domain/places/model/PlacesConfigExpansion$Size;Ljava/lang/Float;)Lcom/tinder/domain/places/model/PlacesConfigExpansion;", "equals", "", "other", "hashCode", "", "toString", "", "Size", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class PlacesConfigExpansion {
    @Nullable
    private final Size initialSize;
    @Nullable
    private final Size introSize;
    @Nullable
    private final Size teaserSize;
    @Nullable
    private final Float titleFontSize;
    @Nullable
    private final Size titleSize;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/tinder/domain/places/model/PlacesConfigExpansion$Size;", "", "x", "", "y", "width", "height", "(IIII)V", "getHeight", "()I", "getWidth", "getX", "getY", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "Companion", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class Size {
        public static final Companion Companion = new Companion();
        @NotNull
        private static final int[] location = new int[2];
        private final int height;
        private final int width;
        /* renamed from: x */
        private final int f31204x;
        /* renamed from: y */
        private final int f31205y;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/tinder/domain/places/model/PlacesConfigExpansion$Size$Companion;", "", "()V", "location", "", "getLocation", "()[I", "getAbsoluteSize", "Lcom/tinder/domain/places/model/PlacesConfigExpansion$Size;", "view", "Landroid/view/View;", "domain_release"}, k = 1, mv = {1, 1, 10})
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final int[] getLocation() {
                return Size.location;
            }

            @NotNull
            public final Size getAbsoluteSize(@NotNull View view) {
                C2668g.b(view, "view");
                Companion companion = this;
                view.getLocationInWindow(getLocation());
                return new Size(getLocation()[0], getLocation()[1], view.getMeasuredWidth(), view.getMeasuredHeight());
            }
        }

        @NotNull
        public static /* synthetic */ Size copy$default(Size size, int i, int i2, int i3, int i4, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                i = size.f31204x;
            }
            if ((i5 & 2) != 0) {
                i2 = size.f31205y;
            }
            if ((i5 & 4) != 0) {
                i3 = size.width;
            }
            if ((i5 & 8) != 0) {
                i4 = size.height;
            }
            return size.copy(i, i2, i3, i4);
        }

        public final int component1() {
            return this.f31204x;
        }

        public final int component2() {
            return this.f31205y;
        }

        public final int component3() {
            return this.width;
        }

        public final int component4() {
            return this.height;
        }

        @NotNull
        public final Size copy(int i, int i2, int i3, int i4) {
            return new Size(i, i2, i3, i4);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Size) {
                Size size = (Size) obj;
                if ((this.f31204x == size.f31204x ? 1 : null) != null) {
                    if ((this.f31205y == size.f31205y ? 1 : null) != null) {
                        if ((this.width == size.width ? 1 : null) != null) {
                            if ((this.height == size.height ? 1 : null) != null) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f31204x * 31) + this.f31205y) * 31) + this.width) * 31) + this.height;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Size(x=");
            stringBuilder.append(this.f31204x);
            stringBuilder.append(", y=");
            stringBuilder.append(this.f31205y);
            stringBuilder.append(", width=");
            stringBuilder.append(this.width);
            stringBuilder.append(", height=");
            stringBuilder.append(this.height);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public Size(int i, int i2, int i3, int i4) {
            this.f31204x = i;
            this.f31205y = i2;
            this.width = i3;
            this.height = i4;
        }

        public final int getHeight() {
            return this.height;
        }

        public final int getWidth() {
            return this.width;
        }

        public final int getX() {
            return this.f31204x;
        }

        public final int getY() {
            return this.f31205y;
        }
    }

    public PlacesConfigExpansion() {
        this(null, null, null, null, null, 31, null);
    }

    @NotNull
    public static /* synthetic */ PlacesConfigExpansion copy$default(PlacesConfigExpansion placesConfigExpansion, Size size, Size size2, Size size3, Size size4, Float f, int i, Object obj) {
        if ((i & 1) != 0) {
            size = placesConfigExpansion.initialSize;
        }
        if ((i & 2) != 0) {
            size2 = placesConfigExpansion.titleSize;
        }
        Size size5 = size2;
        if ((i & 4) != 0) {
            size3 = placesConfigExpansion.introSize;
        }
        Size size6 = size3;
        if ((i & 8) != 0) {
            size4 = placesConfigExpansion.teaserSize;
        }
        Size size7 = size4;
        if ((i & 16) != 0) {
            f = placesConfigExpansion.titleFontSize;
        }
        return placesConfigExpansion.copy(size, size5, size6, size7, f);
    }

    @Nullable
    public final Size component1() {
        return this.initialSize;
    }

    @Nullable
    public final Size component2() {
        return this.titleSize;
    }

    @Nullable
    public final Size component3() {
        return this.introSize;
    }

    @Nullable
    public final Size component4() {
        return this.teaserSize;
    }

    @Nullable
    public final Float component5() {
        return this.titleFontSize;
    }

    @NotNull
    public final PlacesConfigExpansion copy(@Nullable Size size, @Nullable Size size2, @Nullable Size size3, @Nullable Size size4, @Nullable Float f) {
        return new PlacesConfigExpansion(size, size2, size3, size4, f);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PlacesConfigExpansion) {
                PlacesConfigExpansion placesConfigExpansion = (PlacesConfigExpansion) obj;
                if (C2668g.a(this.initialSize, placesConfigExpansion.initialSize) && C2668g.a(this.titleSize, placesConfigExpansion.titleSize) && C2668g.a(this.introSize, placesConfigExpansion.introSize) && C2668g.a(this.teaserSize, placesConfigExpansion.teaserSize) && C2668g.a(this.titleFontSize, placesConfigExpansion.titleFontSize)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Size size = this.initialSize;
        int i = 0;
        int hashCode = (size != null ? size.hashCode() : 0) * 31;
        Size size2 = this.titleSize;
        hashCode = (hashCode + (size2 != null ? size2.hashCode() : 0)) * 31;
        size2 = this.introSize;
        hashCode = (hashCode + (size2 != null ? size2.hashCode() : 0)) * 31;
        size2 = this.teaserSize;
        hashCode = (hashCode + (size2 != null ? size2.hashCode() : 0)) * 31;
        Float f = this.titleFontSize;
        if (f != null) {
            i = f.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PlacesConfigExpansion(initialSize=");
        stringBuilder.append(this.initialSize);
        stringBuilder.append(", titleSize=");
        stringBuilder.append(this.titleSize);
        stringBuilder.append(", introSize=");
        stringBuilder.append(this.introSize);
        stringBuilder.append(", teaserSize=");
        stringBuilder.append(this.teaserSize);
        stringBuilder.append(", titleFontSize=");
        stringBuilder.append(this.titleFontSize);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public PlacesConfigExpansion(@Nullable Size size, @Nullable Size size2, @Nullable Size size3, @Nullable Size size4, @Nullable Float f) {
        this.initialSize = size;
        this.titleSize = size2;
        this.introSize = size3;
        this.teaserSize = size4;
        this.titleFontSize = f;
    }

    public /* synthetic */ PlacesConfigExpansion(Size size, Size size2, Size size3, Size size4, Float f, int i, C15823e c15823e) {
        if ((i & 1) != null) {
            size = null;
        }
        if ((i & 2) != null) {
            size2 = null;
        }
        Size size5 = size2;
        if ((i & 4) != null) {
            size3 = null;
        }
        Size size6 = size3;
        if ((i & 8) != null) {
            size4 = null;
        }
        Size size7 = size4;
        if ((i & 16) != null) {
            f = null;
        }
        this(size, size5, size6, size7, f);
    }

    @Nullable
    public final Size getInitialSize() {
        return this.initialSize;
    }

    @Nullable
    public final Size getTitleSize() {
        return this.titleSize;
    }

    @Nullable
    public final Size getIntroSize() {
        return this.introSize;
    }

    @Nullable
    public final Size getTeaserSize() {
        return this.teaserSize;
    }

    @Nullable
    public final Float getTitleFontSize() {
        return this.titleFontSize;
    }
}
