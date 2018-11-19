package com.tinder.recs.animation;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.recs.animation.DefaultRecProfileAnimationDecorator.PlaceholderPhotoConfig;

/* renamed from: com.tinder.recs.animation.AutoValue_DefaultRecProfileAnimationDecorator_PlaceholderPhotoConfig */
final class C16392xe0232f8c extends PlaceholderPhotoConfig {
    private final int displayedPhotoIndex;
    private final String displayedPhotoUrl;
    private final int photoCount;
    private final int placeholderHeight;
    private final float placeholderParallaxFactor;
    private final String placeholderTagName;
    private final int placeholderWidth;
    private final int placeholderX;
    private final int placeholderY;
    private final boolean showPageIndicator;

    /* renamed from: com.tinder.recs.animation.AutoValue_DefaultRecProfileAnimationDecorator_PlaceholderPhotoConfig$Builder */
    static final class Builder extends com.tinder.recs.animation.DefaultRecProfileAnimationDecorator.PlaceholderPhotoConfig.Builder {
        private Integer displayedPhotoIndex;
        private String displayedPhotoUrl;
        private Integer photoCount;
        private Integer placeholderHeight;
        private Float placeholderParallaxFactor;
        private String placeholderTagName;
        private Integer placeholderWidth;
        private Integer placeholderX;
        private Integer placeholderY;
        private Boolean showPageIndicator;

        Builder() {
        }

        Builder(PlaceholderPhotoConfig placeholderPhotoConfig) {
            this.displayedPhotoUrl = placeholderPhotoConfig.displayedPhotoUrl();
            this.displayedPhotoIndex = Integer.valueOf(placeholderPhotoConfig.displayedPhotoIndex());
            this.photoCount = Integer.valueOf(placeholderPhotoConfig.photoCount());
            this.showPageIndicator = Boolean.valueOf(placeholderPhotoConfig.showPageIndicator());
            this.placeholderX = Integer.valueOf(placeholderPhotoConfig.placeholderX());
            this.placeholderY = Integer.valueOf(placeholderPhotoConfig.placeholderY());
            this.placeholderWidth = Integer.valueOf(placeholderPhotoConfig.placeholderWidth());
            this.placeholderHeight = Integer.valueOf(placeholderPhotoConfig.placeholderHeight());
            this.placeholderParallaxFactor = Float.valueOf(placeholderPhotoConfig.placeholderParallaxFactor());
            this.placeholderTagName = placeholderPhotoConfig.placeholderTagName();
        }

        public com.tinder.recs.animation.DefaultRecProfileAnimationDecorator.PlaceholderPhotoConfig.Builder displayedPhotoUrl(String str) {
            this.displayedPhotoUrl = str;
            return this;
        }

        public com.tinder.recs.animation.DefaultRecProfileAnimationDecorator.PlaceholderPhotoConfig.Builder displayedPhotoIndex(int i) {
            this.displayedPhotoIndex = Integer.valueOf(i);
            return this;
        }

        public com.tinder.recs.animation.DefaultRecProfileAnimationDecorator.PlaceholderPhotoConfig.Builder photoCount(int i) {
            this.photoCount = Integer.valueOf(i);
            return this;
        }

        public com.tinder.recs.animation.DefaultRecProfileAnimationDecorator.PlaceholderPhotoConfig.Builder showPageIndicator(boolean z) {
            this.showPageIndicator = Boolean.valueOf(z);
            return this;
        }

        public com.tinder.recs.animation.DefaultRecProfileAnimationDecorator.PlaceholderPhotoConfig.Builder placeholderX(int i) {
            this.placeholderX = Integer.valueOf(i);
            return this;
        }

        public com.tinder.recs.animation.DefaultRecProfileAnimationDecorator.PlaceholderPhotoConfig.Builder placeholderY(int i) {
            this.placeholderY = Integer.valueOf(i);
            return this;
        }

        public com.tinder.recs.animation.DefaultRecProfileAnimationDecorator.PlaceholderPhotoConfig.Builder placeholderWidth(int i) {
            this.placeholderWidth = Integer.valueOf(i);
            return this;
        }

        public com.tinder.recs.animation.DefaultRecProfileAnimationDecorator.PlaceholderPhotoConfig.Builder placeholderHeight(int i) {
            this.placeholderHeight = Integer.valueOf(i);
            return this;
        }

        public com.tinder.recs.animation.DefaultRecProfileAnimationDecorator.PlaceholderPhotoConfig.Builder placeholderParallaxFactor(float f) {
            this.placeholderParallaxFactor = Float.valueOf(f);
            return this;
        }

        public com.tinder.recs.animation.DefaultRecProfileAnimationDecorator.PlaceholderPhotoConfig.Builder placeholderTagName(@Nullable String str) {
            this.placeholderTagName = str;
            return this;
        }

        public PlaceholderPhotoConfig build() {
            String str = "";
            if (this.displayedPhotoUrl == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" displayedPhotoUrl");
                str = stringBuilder.toString();
            }
            if (this.displayedPhotoIndex == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" displayedPhotoIndex");
                str = stringBuilder.toString();
            }
            if (this.photoCount == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" photoCount");
                str = stringBuilder.toString();
            }
            if (this.showPageIndicator == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" showPageIndicator");
                str = stringBuilder.toString();
            }
            if (this.placeholderX == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" placeholderX");
                str = stringBuilder.toString();
            }
            if (this.placeholderY == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" placeholderY");
                str = stringBuilder.toString();
            }
            if (this.placeholderWidth == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" placeholderWidth");
                str = stringBuilder.toString();
            }
            if (this.placeholderHeight == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" placeholderHeight");
                str = stringBuilder.toString();
            }
            if (this.placeholderParallaxFactor == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" placeholderParallaxFactor");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                return new C16392xe0232f8c(this.displayedPhotoUrl, this.displayedPhotoIndex.intValue(), this.photoCount.intValue(), this.showPageIndicator.booleanValue(), this.placeholderX.intValue(), this.placeholderY.intValue(), this.placeholderWidth.intValue(), this.placeholderHeight.intValue(), this.placeholderParallaxFactor.floatValue(), this.placeholderTagName);
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Missing required properties:");
            stringBuilder2.append(str);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    private C16392xe0232f8c(String str, int i, int i2, boolean z, int i3, int i4, int i5, int i6, float f, @Nullable String str2) {
        this.displayedPhotoUrl = str;
        this.displayedPhotoIndex = i;
        this.photoCount = i2;
        this.showPageIndicator = z;
        this.placeholderX = i3;
        this.placeholderY = i4;
        this.placeholderWidth = i5;
        this.placeholderHeight = i6;
        this.placeholderParallaxFactor = f;
        this.placeholderTagName = str2;
    }

    @NonNull
    public String displayedPhotoUrl() {
        return this.displayedPhotoUrl;
    }

    public int displayedPhotoIndex() {
        return this.displayedPhotoIndex;
    }

    public int photoCount() {
        return this.photoCount;
    }

    public boolean showPageIndicator() {
        return this.showPageIndicator;
    }

    public int placeholderX() {
        return this.placeholderX;
    }

    public int placeholderY() {
        return this.placeholderY;
    }

    public int placeholderWidth() {
        return this.placeholderWidth;
    }

    public int placeholderHeight() {
        return this.placeholderHeight;
    }

    public float placeholderParallaxFactor() {
        return this.placeholderParallaxFactor;
    }

    @Nullable
    public String placeholderTagName() {
        return this.placeholderTagName;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PlaceholderPhotoConfig{displayedPhotoUrl=");
        stringBuilder.append(this.displayedPhotoUrl);
        stringBuilder.append(", displayedPhotoIndex=");
        stringBuilder.append(this.displayedPhotoIndex);
        stringBuilder.append(", photoCount=");
        stringBuilder.append(this.photoCount);
        stringBuilder.append(", showPageIndicator=");
        stringBuilder.append(this.showPageIndicator);
        stringBuilder.append(", placeholderX=");
        stringBuilder.append(this.placeholderX);
        stringBuilder.append(", placeholderY=");
        stringBuilder.append(this.placeholderY);
        stringBuilder.append(", placeholderWidth=");
        stringBuilder.append(this.placeholderWidth);
        stringBuilder.append(", placeholderHeight=");
        stringBuilder.append(this.placeholderHeight);
        stringBuilder.append(", placeholderParallaxFactor=");
        stringBuilder.append(this.placeholderParallaxFactor);
        stringBuilder.append(", placeholderTagName=");
        stringBuilder.append(this.placeholderTagName);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PlaceholderPhotoConfig)) {
            return false;
        }
        PlaceholderPhotoConfig placeholderPhotoConfig = (PlaceholderPhotoConfig) obj;
        if (this.displayedPhotoUrl.equals(placeholderPhotoConfig.displayedPhotoUrl()) && this.displayedPhotoIndex == placeholderPhotoConfig.displayedPhotoIndex() && this.photoCount == placeholderPhotoConfig.photoCount() && this.showPageIndicator == placeholderPhotoConfig.showPageIndicator() && this.placeholderX == placeholderPhotoConfig.placeholderX() && this.placeholderY == placeholderPhotoConfig.placeholderY() && this.placeholderWidth == placeholderPhotoConfig.placeholderWidth() && this.placeholderHeight == placeholderPhotoConfig.placeholderHeight() && Float.floatToIntBits(this.placeholderParallaxFactor) == Float.floatToIntBits(placeholderPhotoConfig.placeholderParallaxFactor())) {
            if (this.placeholderTagName == null) {
                if (placeholderPhotoConfig.placeholderTagName() == null) {
                    return z;
                }
            } else if (this.placeholderTagName.equals(placeholderPhotoConfig.placeholderTagName()) != null) {
                return z;
            }
        }
        z = false;
        return z;
    }

    public int hashCode() {
        return ((((((((((((((((((this.displayedPhotoUrl.hashCode() ^ 1000003) * 1000003) ^ this.displayedPhotoIndex) * 1000003) ^ this.photoCount) * 1000003) ^ (this.showPageIndicator ? 1231 : 1237)) * 1000003) ^ this.placeholderX) * 1000003) ^ this.placeholderY) * 1000003) ^ this.placeholderWidth) * 1000003) ^ this.placeholderHeight) * 1000003) ^ Float.floatToIntBits(this.placeholderParallaxFactor)) * 1000003) ^ (this.placeholderTagName == null ? 0 : this.placeholderTagName.hashCode());
    }
}
