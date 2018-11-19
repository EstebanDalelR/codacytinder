package com.mapbox.mapboxsdk.annotations;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build.VERSION;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.v4.content.C0432b;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.mapbox.mapboxsdk.C5812R;
import com.mapbox.mapboxsdk.exceptions.TooManyIconsException;
import java.io.InputStream;

public final class IconFactory {
    private static final String ICON_ID_PREFIX = "com.mapbox.icons.icon_";
    public static final Bitmap ICON_MARKERVIEW_BITMAP = Bitmap.createBitmap(1, 1, Config.ALPHA_8);
    public static final String ICON_MARKERVIEW_ID = "com.mapbox.icons.icon_marker_view";
    @SuppressLint({"StaticFieldLeak"})
    private static IconFactory instance;
    private Context context;
    private Icon defaultMarker;
    private Icon defaultMarkerView;
    private int nextId = 0;
    private Options options;

    public static synchronized IconFactory getInstance(@NonNull Context context) {
        synchronized (IconFactory.class) {
            if (instance == null) {
                instance = new IconFactory(context.getApplicationContext());
            }
            context = instance;
        }
        return context;
    }

    private IconFactory(@NonNull Context context) {
        DisplayMetrics displayMetrics;
        this.context = context;
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (VERSION.SDK_INT >= 17) {
            displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        } else {
            displayMetrics = null;
        }
        windowManager.getDefaultDisplay().getMetrics(displayMetrics2);
        this.options = new Options();
        this.options.inScaled = true;
        this.options.inDensity = 160;
        this.options.inTargetDensity = displayMetrics2.densityDpi;
        if (displayMetrics != null) {
            this.options.inScreenDensity = displayMetrics.densityDpi;
        }
    }

    public Icon fromBitmap(@NonNull Bitmap bitmap) {
        if (this.nextId < 0) {
            throw new TooManyIconsException();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(ICON_ID_PREFIX);
        int i = this.nextId + 1;
        this.nextId = i;
        stringBuilder.append(i);
        return new Icon(stringBuilder.toString(), bitmap);
    }

    public Icon fromResource(@DrawableRes int i) {
        i = C0432b.a(this.context, i);
        if (i instanceof BitmapDrawable) {
            return fromBitmap(((BitmapDrawable) i).getBitmap());
        }
        throw new IllegalArgumentException("Failed to decode image. The resource provided must be a Bitmap.");
    }

    public Icon defaultMarker() {
        if (this.defaultMarker == null) {
            this.defaultMarker = fromResource(C5812R.drawable.mapbox_marker_icon_default);
        }
        return this.defaultMarker;
    }

    public Icon defaultMarkerView() {
        if (this.defaultMarkerView == null) {
            this.defaultMarkerView = fromResource(C5812R.drawable.mapbox_markerview_icon_default);
        }
        return this.defaultMarkerView;
    }

    private Icon fromInputStream(@NonNull InputStream inputStream) {
        return fromBitmap(BitmapFactory.decodeStream(inputStream, null, this.options));
    }

    public com.mapbox.mapboxsdk.annotations.Icon fromAsset(@android.support.annotation.NonNull java.lang.String r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = this;
        r0 = r1.context;	 Catch:{ IOException -> 0x000f }
        r0 = r0.getAssets();	 Catch:{ IOException -> 0x000f }
        r2 = r0.open(r2);	 Catch:{ IOException -> 0x000f }
        r2 = r1.fromInputStream(r2);
        return r2;
    L_0x000f:
        r2 = 0;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.mapboxsdk.annotations.IconFactory.fromAsset(java.lang.String):com.mapbox.mapboxsdk.annotations.Icon");
    }

    public Icon fromPath(@NonNull String str) {
        return fromBitmap(BitmapFactory.decodeFile(str, this.options));
    }

    public com.mapbox.mapboxsdk.annotations.Icon fromFile(@android.support.annotation.NonNull java.lang.String r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = this;
        r0 = r1.context;	 Catch:{ FileNotFoundException -> 0x000b }
        r2 = r0.openFileInput(r2);	 Catch:{ FileNotFoundException -> 0x000b }
        r2 = r1.fromInputStream(r2);
        return r2;
    L_0x000b:
        r2 = 0;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.mapboxsdk.annotations.IconFactory.fromFile(java.lang.String):com.mapbox.mapboxsdk.annotations.Icon");
    }

    public static Icon recreate(@NonNull String str, @NonNull Bitmap bitmap) {
        return new Icon(str, bitmap);
    }
}
