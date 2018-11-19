package com.tinder.recs.card;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÂ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\u0006\u0010\u0013\u001a\u00020\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0006\u0010\u0016\u001a\u00020\u0003R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/tinder/recs/card/CardSize;", "", "width", "", "height", "density", "", "(IIF)V", "getHeight", "()I", "getWidth", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "heightInDp", "toString", "", "widthInDp", "recs-cards_release"}, k = 1, mv = {1, 1, 10})
public final class CardSize {
    private final float density;
    private final int height;
    private final int width;

    private final float component3() {
        return this.density;
    }

    @NotNull
    public static /* synthetic */ CardSize copy$default(CardSize cardSize, int i, int i2, float f, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = cardSize.width;
        }
        if ((i3 & 2) != 0) {
            i2 = cardSize.height;
        }
        if ((i3 & 4) != 0) {
            f = cardSize.density;
        }
        return cardSize.copy(i, i2, f);
    }

    public final int component1() {
        return this.width;
    }

    public final int component2() {
        return this.height;
    }

    @NotNull
    public final CardSize copy(int i, int i2, float f) {
        return new CardSize(i, i2, f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CardSize) {
            CardSize cardSize = (CardSize) obj;
            if ((this.width == cardSize.width ? 1 : null) != null) {
                return (this.height == cardSize.height ? 1 : null) != null && Float.compare(this.density, cardSize.density) == 0;
            }
        }
    }

    public int hashCode() {
        return (((this.width * 31) + this.height) * 31) + Float.floatToIntBits(this.density);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CardSize(width=");
        stringBuilder.append(this.width);
        stringBuilder.append(", height=");
        stringBuilder.append(this.height);
        stringBuilder.append(", density=");
        stringBuilder.append(this.density);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public CardSize(int i, int i2, float f) {
        this.width = i;
        this.height = i2;
        this.density = f;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int widthInDp() {
        return (int) (((float) this.width) / this.density);
    }

    public final int heightInDp() {
        return (int) (((float) this.height) / this.density);
    }
}
