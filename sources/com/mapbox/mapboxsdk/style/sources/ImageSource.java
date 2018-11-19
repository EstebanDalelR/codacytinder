package com.mapbox.mapboxsdk.style.sources;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.UiThread;
import android.support.v4.content.C0432b;
import com.mapbox.mapboxsdk.Mapbox;
import com.mapbox.mapboxsdk.geometry.LatLngQuad;
import java.net.URL;

@UiThread
public class ImageSource extends Source {
    protected native void finalize() throws Throwable;

    protected native void initialize(String str, LatLngQuad latLngQuad);

    protected native String nativeGetUrl();

    protected native void nativeSetCoordinates(LatLngQuad latLngQuad);

    protected native void nativeSetImage(Bitmap bitmap);

    protected native void nativeSetUrl(String str);

    public ImageSource(long j) {
        super(j);
    }

    public ImageSource(String str, LatLngQuad latLngQuad, URL url) {
        initialize(str, latLngQuad);
        setUrl(url);
    }

    public ImageSource(String str, LatLngQuad latLngQuad, @NonNull Bitmap bitmap) {
        initialize(str, latLngQuad);
        setImage(bitmap);
    }

    public ImageSource(String str, LatLngQuad latLngQuad, @DrawableRes int i) {
        initialize(str, latLngQuad);
        setImage(i);
    }

    public void setUrl(URL url) {
        setUrl(url.toExternalForm());
    }

    public void setUrl(String str) {
        nativeSetUrl(str);
    }

    public void setImage(@NonNull Bitmap bitmap) {
        nativeSetImage(bitmap);
    }

    public void setImage(@DrawableRes int i) throws IllegalArgumentException {
        i = C0432b.a(Mapbox.getApplicationContext(), i);
        if (i instanceof BitmapDrawable) {
            nativeSetImage(((BitmapDrawable) i).getBitmap());
            return;
        }
        throw new IllegalArgumentException("Failed to decode image. The resource provided must be a Bitmap.");
    }

    @Nullable
    public String getUrl() {
        return nativeGetUrl();
    }

    public void setCoordinates(LatLngQuad latLngQuad) {
        nativeSetCoordinates(latLngQuad);
    }
}
