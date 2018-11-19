package com.mapbox.mapboxsdk.annotations;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import java.nio.Buffer;
import java.nio.ByteBuffer;

public class Icon {
    private Bitmap mBitmap;
    private String mId;

    Icon(String str, Bitmap bitmap) {
        this.mId = str;
        this.mBitmap = bitmap;
    }

    public String getId() {
        return this.mId;
    }

    public Bitmap getBitmap() {
        if (!(this.mBitmap == null || this.mBitmap.getConfig() == Config.ARGB_8888)) {
            this.mBitmap = this.mBitmap.copy(Config.ARGB_8888, false);
        }
        return this.mBitmap;
    }

    public float getScale() {
        if (this.mBitmap == null) {
            throw new IllegalStateException("Required to set a Icon before calling getScale");
        }
        float density = (float) this.mBitmap.getDensity();
        if (density == 0.0f) {
            density = 160.0f;
        }
        return density / 160.0f;
    }

    public byte[] toBytes() {
        if (this.mBitmap == null) {
            throw new IllegalStateException("Required to set a Icon before calling toBytes");
        }
        Buffer allocate = ByteBuffer.allocate(this.mBitmap.getRowBytes() * this.mBitmap.getHeight());
        this.mBitmap.copyPixelsToBuffer(allocate);
        return allocate.array();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                Icon icon = (Icon) obj;
                if (!this.mBitmap.equals(icon.mBitmap) || this.mId.equals(icon.mId) == null) {
                    z = false;
                }
                return z;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.mBitmap != null ? this.mBitmap.hashCode() : 0;
        return this.mId != null ? (hashCode * 31) + this.mId.hashCode() : hashCode;
    }
}
