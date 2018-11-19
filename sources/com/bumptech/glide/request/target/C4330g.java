package com.bumptech.glide.request.target;

import com.bumptech.glide.p026d.C0987h;

/* renamed from: com.bumptech.glide.request.target.g */
public abstract class C4330g<Z> extends C4117a<Z> {
    private final int height;
    private final int width;

    public C4330g() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public C4330g(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    public final void getSize(SizeReadyCallback sizeReadyCallback) {
        if (C0987h.m3412a(this.width, this.height)) {
            sizeReadyCallback.onSizeReady(this.width, this.height);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ");
        stringBuilder.append(this.width);
        stringBuilder.append(" and height: ");
        stringBuilder.append(this.height);
        stringBuilder.append(", either provide dimensions in the constructor");
        stringBuilder.append(" or call override()");
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}
