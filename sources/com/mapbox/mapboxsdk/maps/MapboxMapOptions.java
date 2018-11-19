package com.mapbox.mapboxsdk.maps;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.res.C0441a;
import android.util.AttributeSet;
import com.mapbox.mapboxsdk.C5812R;
import com.mapbox.mapboxsdk.camera.CameraPosition;
import com.mapbox.mapboxsdk.camera.CameraPosition.Builder;
import com.mapbox.mapboxsdk.utils.BitmapUtils;
import java.util.Arrays;

public class MapboxMapOptions implements Parcelable {
    public static final Creator<MapboxMapOptions> CREATOR = new C58421();
    private static final float FOUR_DP = 4.0f;
    private static final float NINETY_TWO_DP = 92.0f;
    private static final int UNDEFINED_COLOR = -1;
    private String apiBaseUrl;
    private boolean attributionEnabled;
    private int attributionGravity;
    private int[] attributionMargins;
    @ColorInt
    private int attributionTintColor;
    private CameraPosition cameraPosition;
    private boolean compassEnabled;
    private int compassGravity;
    private Drawable compassImage;
    private int[] compassMargins;
    private boolean debugActive;
    private boolean doubleTapGesturesEnabled;
    private boolean fadeCompassFacingNorth;
    private String localIdeographFontFamily;
    private boolean logoEnabled;
    private int logoGravity;
    private int[] logoMargins;
    private double maxZoom;
    private double minZoom;
    private boolean prefetchesTiles;
    private boolean rotateGesturesEnabled;
    private boolean scrollGesturesEnabled;
    private String style;
    private boolean textureMode;
    private boolean tiltGesturesEnabled;
    private boolean translucentTextureSurface;
    private boolean zMediaOverlay;
    private boolean zoomControlsEnabled;
    private boolean zoomGesturesEnabled;

    /* renamed from: com.mapbox.mapboxsdk.maps.MapboxMapOptions$1 */
    static class C58421 implements Creator<MapboxMapOptions> {
        C58421() {
        }

        public MapboxMapOptions createFromParcel(Parcel parcel) {
            return new MapboxMapOptions(parcel);
        }

        public MapboxMapOptions[] newArray(int i) {
            return new MapboxMapOptions[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public MapboxMapOptions() {
        this.compassEnabled = true;
        this.fadeCompassFacingNorth = true;
        this.compassGravity = 8388661;
        this.logoEnabled = true;
        this.logoGravity = 8388691;
        this.attributionTintColor = -1;
        this.attributionEnabled = true;
        this.attributionGravity = 8388691;
        this.minZoom = 0.0d;
        this.maxZoom = 25.5d;
        this.rotateGesturesEnabled = true;
        this.scrollGesturesEnabled = true;
        this.tiltGesturesEnabled = true;
        this.zoomGesturesEnabled = true;
        this.zoomControlsEnabled = false;
        this.doubleTapGesturesEnabled = true;
        this.prefetchesTiles = true;
        this.zMediaOverlay = false;
    }

    private MapboxMapOptions(Parcel parcel) {
        boolean z = true;
        this.compassEnabled = true;
        this.fadeCompassFacingNorth = true;
        this.compassGravity = 8388661;
        this.logoEnabled = true;
        this.logoGravity = 8388691;
        this.attributionTintColor = -1;
        this.attributionEnabled = true;
        this.attributionGravity = 8388691;
        this.minZoom = 0.0d;
        this.maxZoom = 25.5d;
        this.rotateGesturesEnabled = true;
        this.scrollGesturesEnabled = true;
        this.tiltGesturesEnabled = true;
        this.zoomGesturesEnabled = true;
        this.zoomControlsEnabled = false;
        this.doubleTapGesturesEnabled = true;
        this.prefetchesTiles = true;
        this.zMediaOverlay = false;
        this.cameraPosition = (CameraPosition) parcel.readParcelable(CameraPosition.class.getClassLoader());
        this.debugActive = parcel.readByte() != (byte) 0;
        this.compassEnabled = parcel.readByte() != (byte) 0;
        this.compassGravity = parcel.readInt();
        this.compassMargins = parcel.createIntArray();
        this.fadeCompassFacingNorth = parcel.readByte() != (byte) 0;
        Bitmap bitmap = (Bitmap) parcel.readParcelable(getClass().getClassLoader());
        if (bitmap != null) {
            this.compassImage = new BitmapDrawable(bitmap);
        }
        this.logoEnabled = parcel.readByte() != (byte) 0;
        this.logoGravity = parcel.readInt();
        this.logoMargins = parcel.createIntArray();
        this.attributionEnabled = parcel.readByte() != (byte) 0;
        this.attributionGravity = parcel.readInt();
        this.attributionMargins = parcel.createIntArray();
        this.attributionTintColor = parcel.readInt();
        this.minZoom = parcel.readDouble();
        this.maxZoom = parcel.readDouble();
        this.rotateGesturesEnabled = parcel.readByte() != (byte) 0;
        this.scrollGesturesEnabled = parcel.readByte() != (byte) 0;
        this.tiltGesturesEnabled = parcel.readByte() != (byte) 0;
        this.zoomControlsEnabled = parcel.readByte() != (byte) 0;
        this.zoomGesturesEnabled = parcel.readByte() != (byte) 0;
        this.doubleTapGesturesEnabled = parcel.readByte() != (byte) 0;
        this.style = parcel.readString();
        this.apiBaseUrl = parcel.readString();
        this.textureMode = parcel.readByte() != (byte) 0;
        this.translucentTextureSurface = parcel.readByte() != (byte) 0;
        this.prefetchesTiles = parcel.readByte() != (byte) 0;
        if (parcel.readByte() == (byte) 0) {
            z = false;
        }
        this.zMediaOverlay = z;
        this.localIdeographFontFamily = parcel.readString();
    }

    public static MapboxMapOptions createFromAttributes(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        MapboxMapOptions mapboxMapOptions = new MapboxMapOptions();
        float f = context.getResources().getDisplayMetrics().density;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5812R.styleable.mapbox_MapView, 0, 0);
        try {
            mapboxMapOptions.camera(new Builder(obtainStyledAttributes).build());
            mapboxMapOptions.styleUrl(obtainStyledAttributes.getString(C5812R.styleable.mapbox_MapView_mapbox_styleUrl));
            mapboxMapOptions.apiBaseUrl(obtainStyledAttributes.getString(C5812R.styleable.mapbox_MapView_mapbox_apiBaseUrl));
            mapboxMapOptions.zoomGesturesEnabled(obtainStyledAttributes.getBoolean(C5812R.styleable.mapbox_MapView_mapbox_uiZoomGestures, true));
            mapboxMapOptions.scrollGesturesEnabled(obtainStyledAttributes.getBoolean(C5812R.styleable.mapbox_MapView_mapbox_uiScrollGestures, true));
            mapboxMapOptions.rotateGesturesEnabled(obtainStyledAttributes.getBoolean(C5812R.styleable.mapbox_MapView_mapbox_uiRotateGestures, true));
            mapboxMapOptions.tiltGesturesEnabled(obtainStyledAttributes.getBoolean(C5812R.styleable.mapbox_MapView_mapbox_uiTiltGestures, true));
            mapboxMapOptions.zoomControlsEnabled(obtainStyledAttributes.getBoolean(C5812R.styleable.mapbox_MapView_mapbox_uiZoomControls, false));
            mapboxMapOptions.doubleTapGesturesEnabled(obtainStyledAttributes.getBoolean(C5812R.styleable.mapbox_MapView_mapbox_uiDoubleTapGestures, true));
            mapboxMapOptions.maxZoomPreference((double) obtainStyledAttributes.getFloat(C5812R.styleable.mapbox_MapView_mapbox_cameraZoomMax, 25.5f));
            mapboxMapOptions.minZoomPreference((double) obtainStyledAttributes.getFloat(C5812R.styleable.mapbox_MapView_mapbox_cameraZoomMin, 0.0f));
            mapboxMapOptions.compassEnabled(obtainStyledAttributes.getBoolean(C5812R.styleable.mapbox_MapView_mapbox_uiCompass, true));
            mapboxMapOptions.compassGravity(obtainStyledAttributes.getInt(C5812R.styleable.mapbox_MapView_mapbox_uiCompassGravity, 8388661));
            r5 = new int[4];
            float f2 = FOUR_DP * f;
            r5[0] = (int) obtainStyledAttributes.getDimension(C5812R.styleable.mapbox_MapView_mapbox_uiCompassMarginLeft, f2);
            r5[1] = (int) obtainStyledAttributes.getDimension(C5812R.styleable.mapbox_MapView_mapbox_uiCompassMarginTop, f2);
            r5[2] = (int) obtainStyledAttributes.getDimension(C5812R.styleable.mapbox_MapView_mapbox_uiCompassMarginRight, f2);
            r5[3] = (int) obtainStyledAttributes.getDimension(C5812R.styleable.mapbox_MapView_mapbox_uiCompassMarginBottom, f2);
            mapboxMapOptions.compassMargins(r5);
            mapboxMapOptions.compassFadesWhenFacingNorth(obtainStyledAttributes.getBoolean(C5812R.styleable.mapbox_MapView_mapbox_uiCompassFadeFacingNorth, true));
            Drawable drawable = obtainStyledAttributes.getDrawable(C5812R.styleable.mapbox_MapView_mapbox_uiCompassDrawable);
            if (drawable == null) {
                drawable = C0441a.a(context.getResources(), C5812R.drawable.mapbox_compass_icon, null);
            }
            mapboxMapOptions.compassImage(drawable);
            mapboxMapOptions.logoEnabled(obtainStyledAttributes.getBoolean(C5812R.styleable.mapbox_MapView_mapbox_uiLogo, true));
            mapboxMapOptions.logoGravity(obtainStyledAttributes.getInt(C5812R.styleable.mapbox_MapView_mapbox_uiLogoGravity, 8388691));
            mapboxMapOptions.logoMargins(new int[]{(int) obtainStyledAttributes.getDimension(C5812R.styleable.mapbox_MapView_mapbox_uiLogoMarginLeft, f2), (int) obtainStyledAttributes.getDimension(C5812R.styleable.mapbox_MapView_mapbox_uiLogoMarginTop, f2), (int) obtainStyledAttributes.getDimension(C5812R.styleable.mapbox_MapView_mapbox_uiLogoMarginRight, f2), (int) obtainStyledAttributes.getDimension(C5812R.styleable.mapbox_MapView_mapbox_uiLogoMarginBottom, f2)});
            mapboxMapOptions.attributionTintColor(obtainStyledAttributes.getColor(C5812R.styleable.mapbox_MapView_mapbox_uiAttributionTintColor, -1));
            mapboxMapOptions.attributionEnabled(obtainStyledAttributes.getBoolean(C5812R.styleable.mapbox_MapView_mapbox_uiAttribution, true));
            mapboxMapOptions.attributionGravity(obtainStyledAttributes.getInt(C5812R.styleable.mapbox_MapView_mapbox_uiAttributionGravity, 8388691));
            mapboxMapOptions.attributionMargins(new int[]{(int) obtainStyledAttributes.getDimension(C5812R.styleable.mapbox_MapView_mapbox_uiAttributionMarginLeft, f * NINETY_TWO_DP), (int) obtainStyledAttributes.getDimension(C5812R.styleable.mapbox_MapView_mapbox_uiAttributionMarginTop, f2), (int) obtainStyledAttributes.getDimension(C5812R.styleable.mapbox_MapView_mapbox_uiAttributionMarginRight, f2), (int) obtainStyledAttributes.getDimension(C5812R.styleable.mapbox_MapView_mapbox_uiAttributionMarginBottom, f2)});
            mapboxMapOptions.textureMode(obtainStyledAttributes.getBoolean(C5812R.styleable.mapbox_MapView_mapbox_renderTextureMode, false));
            mapboxMapOptions.translucentTextureSurface(obtainStyledAttributes.getBoolean(C5812R.styleable.mapbox_MapView_mapbox_renderTextureTranslucentSurface, false));
            mapboxMapOptions.setPrefetchesTiles(obtainStyledAttributes.getBoolean(C5812R.styleable.mapbox_MapView_mapbox_enableTilePrefetch, true));
            mapboxMapOptions.renderSurfaceOnTop(obtainStyledAttributes.getBoolean(C5812R.styleable.mapbox_MapView_mapbox_enableZMediaOverlay, false));
            mapboxMapOptions.localIdeographFontFamily(obtainStyledAttributes.getString(C5812R.styleable.mapbox_MapView_mapbox_localIdeographFontFamily));
            return mapboxMapOptions;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public MapboxMapOptions apiBaseUrl(String str) {
        this.apiBaseUrl = str;
        return this;
    }

    public MapboxMapOptions camera(CameraPosition cameraPosition) {
        this.cameraPosition = cameraPosition;
        return this;
    }

    public MapboxMapOptions styleUrl(String str) {
        this.style = str;
        return this;
    }

    public MapboxMapOptions debugActive(boolean z) {
        this.debugActive = z;
        return this;
    }

    public MapboxMapOptions minZoomPreference(double d) {
        this.minZoom = d;
        return this;
    }

    public MapboxMapOptions maxZoomPreference(double d) {
        this.maxZoom = d;
        return this;
    }

    public MapboxMapOptions compassEnabled(boolean z) {
        this.compassEnabled = z;
        return this;
    }

    public MapboxMapOptions compassGravity(int i) {
        this.compassGravity = i;
        return this;
    }

    public MapboxMapOptions compassMargins(int[] iArr) {
        this.compassMargins = iArr;
        return this;
    }

    public MapboxMapOptions compassFadesWhenFacingNorth(boolean z) {
        this.fadeCompassFacingNorth = z;
        return this;
    }

    public MapboxMapOptions compassImage(Drawable drawable) {
        this.compassImage = drawable;
        return this;
    }

    public MapboxMapOptions logoEnabled(boolean z) {
        this.logoEnabled = z;
        return this;
    }

    public MapboxMapOptions logoGravity(int i) {
        this.logoGravity = i;
        return this;
    }

    public MapboxMapOptions logoMargins(int[] iArr) {
        this.logoMargins = iArr;
        return this;
    }

    public MapboxMapOptions attributionEnabled(boolean z) {
        this.attributionEnabled = z;
        return this;
    }

    public MapboxMapOptions attributionGravity(int i) {
        this.attributionGravity = i;
        return this;
    }

    public MapboxMapOptions attributionMargins(int[] iArr) {
        this.attributionMargins = iArr;
        return this;
    }

    public MapboxMapOptions attributionTintColor(@ColorInt int i) {
        this.attributionTintColor = i;
        return this;
    }

    public MapboxMapOptions rotateGesturesEnabled(boolean z) {
        this.rotateGesturesEnabled = z;
        return this;
    }

    public MapboxMapOptions scrollGesturesEnabled(boolean z) {
        this.scrollGesturesEnabled = z;
        return this;
    }

    public MapboxMapOptions tiltGesturesEnabled(boolean z) {
        this.tiltGesturesEnabled = z;
        return this;
    }

    public MapboxMapOptions zoomControlsEnabled(boolean z) {
        this.zoomControlsEnabled = z;
        return this;
    }

    public MapboxMapOptions zoomGesturesEnabled(boolean z) {
        this.zoomGesturesEnabled = z;
        return this;
    }

    public MapboxMapOptions doubleTapGesturesEnabled(boolean z) {
        this.doubleTapGesturesEnabled = z;
        return this;
    }

    public MapboxMapOptions textureMode(boolean z) {
        this.textureMode = z;
        return this;
    }

    public MapboxMapOptions translucentTextureSurface(boolean z) {
        this.translucentTextureSurface = z;
        return this;
    }

    public MapboxMapOptions setPrefetchesTiles(boolean z) {
        this.prefetchesTiles = z;
        return this;
    }

    public MapboxMapOptions localIdeographFontFamily(String str) {
        this.localIdeographFontFamily = str;
        return this;
    }

    public boolean getPrefetchesTiles() {
        return this.prefetchesTiles;
    }

    public void renderSurfaceOnTop(boolean z) {
        this.zMediaOverlay = z;
    }

    public boolean getRenderSurfaceOnTop() {
        return this.zMediaOverlay;
    }

    public String getApiBaseUrl() {
        return this.apiBaseUrl;
    }

    public CameraPosition getCamera() {
        return this.cameraPosition;
    }

    public double getMinZoomPreference() {
        return this.minZoom;
    }

    public double getMaxZoomPreference() {
        return this.maxZoom;
    }

    public boolean getCompassEnabled() {
        return this.compassEnabled;
    }

    public int getCompassGravity() {
        return this.compassGravity;
    }

    public int[] getCompassMargins() {
        return this.compassMargins;
    }

    public boolean getCompassFadeFacingNorth() {
        return this.fadeCompassFacingNorth;
    }

    public Drawable getCompassImage() {
        return this.compassImage;
    }

    public boolean getLogoEnabled() {
        return this.logoEnabled;
    }

    public int getLogoGravity() {
        return this.logoGravity;
    }

    public int[] getLogoMargins() {
        return this.logoMargins;
    }

    public String getStyle() {
        return this.style;
    }

    public boolean getRotateGesturesEnabled() {
        return this.rotateGesturesEnabled;
    }

    public boolean getScrollGesturesEnabled() {
        return this.scrollGesturesEnabled;
    }

    public boolean getTiltGesturesEnabled() {
        return this.tiltGesturesEnabled;
    }

    public boolean getZoomControlsEnabled() {
        return this.zoomControlsEnabled;
    }

    public boolean getZoomGesturesEnabled() {
        return this.zoomGesturesEnabled;
    }

    public boolean getDoubleTapGesturesEnabled() {
        return this.doubleTapGesturesEnabled;
    }

    public boolean getAttributionEnabled() {
        return this.attributionEnabled;
    }

    public int getAttributionGravity() {
        return this.attributionGravity;
    }

    public int[] getAttributionMargins() {
        return this.attributionMargins;
    }

    @ColorInt
    public int getAttributionTintColor() {
        return this.attributionTintColor;
    }

    public boolean getDebugActive() {
        return this.debugActive;
    }

    public boolean getTextureMode() {
        return this.textureMode;
    }

    public boolean getTranslucentTextureSurface() {
        return this.translucentTextureSurface;
    }

    public String getLocalIdeographFontFamily() {
        return this.localIdeographFontFamily;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.cameraPosition, i);
        parcel.writeByte((byte) this.debugActive);
        parcel.writeByte((byte) this.compassEnabled);
        parcel.writeInt(this.compassGravity);
        parcel.writeIntArray(this.compassMargins);
        parcel.writeByte((byte) this.fadeCompassFacingNorth);
        parcel.writeParcelable(this.compassImage != null ? BitmapUtils.getBitmapFromDrawable(this.compassImage) : null, i);
        parcel.writeByte((byte) this.logoEnabled);
        parcel.writeInt(this.logoGravity);
        parcel.writeIntArray(this.logoMargins);
        parcel.writeByte((byte) this.attributionEnabled);
        parcel.writeInt(this.attributionGravity);
        parcel.writeIntArray(this.attributionMargins);
        parcel.writeInt(this.attributionTintColor);
        parcel.writeDouble(this.minZoom);
        parcel.writeDouble(this.maxZoom);
        parcel.writeByte((byte) this.rotateGesturesEnabled);
        parcel.writeByte((byte) this.scrollGesturesEnabled);
        parcel.writeByte((byte) this.tiltGesturesEnabled);
        parcel.writeByte((byte) this.zoomControlsEnabled);
        parcel.writeByte((byte) this.zoomGesturesEnabled);
        parcel.writeByte((byte) this.doubleTapGesturesEnabled);
        parcel.writeString(this.style);
        parcel.writeString(this.apiBaseUrl);
        parcel.writeByte((byte) this.textureMode);
        parcel.writeByte((byte) this.translucentTextureSurface);
        parcel.writeByte((byte) this.prefetchesTiles);
        parcel.writeByte((byte) this.zMediaOverlay);
        parcel.writeString(this.localIdeographFontFamily);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
        r5 = this;
        if (r5 != r6) goto L_0x0004;
    L_0x0002:
        r6 = 1;
        return r6;
    L_0x0004:
        r0 = 0;
        if (r6 == 0) goto L_0x011b;
    L_0x0007:
        r1 = r5.getClass();
        r2 = r6.getClass();
        if (r1 == r2) goto L_0x0013;
    L_0x0011:
        goto L_0x011b;
    L_0x0013:
        r6 = (com.mapbox.mapboxsdk.maps.MapboxMapOptions) r6;
        r1 = r5.debugActive;
        r2 = r6.debugActive;
        if (r1 == r2) goto L_0x001c;
    L_0x001b:
        return r0;
    L_0x001c:
        r1 = r5.compassEnabled;
        r2 = r6.compassEnabled;
        if (r1 == r2) goto L_0x0023;
    L_0x0022:
        return r0;
    L_0x0023:
        r1 = r5.fadeCompassFacingNorth;
        r2 = r6.fadeCompassFacingNorth;
        if (r1 == r2) goto L_0x002a;
    L_0x0029:
        return r0;
    L_0x002a:
        r1 = r5.compassImage;
        if (r1 == 0) goto L_0x0039;
    L_0x002e:
        r1 = r5.compassImage;
        r2 = r6.compassImage;
        r1 = r1.equals(r2);
        if (r1 != 0) goto L_0x003e;
    L_0x0038:
        goto L_0x003d;
    L_0x0039:
        r1 = r6.compassImage;
        if (r1 == 0) goto L_0x003e;
    L_0x003d:
        return r0;
    L_0x003e:
        r1 = r5.compassGravity;
        r2 = r6.compassGravity;
        if (r1 == r2) goto L_0x0045;
    L_0x0044:
        return r0;
    L_0x0045:
        r1 = r5.logoEnabled;
        r2 = r6.logoEnabled;
        if (r1 == r2) goto L_0x004c;
    L_0x004b:
        return r0;
    L_0x004c:
        r1 = r5.logoGravity;
        r2 = r6.logoGravity;
        if (r1 == r2) goto L_0x0053;
    L_0x0052:
        return r0;
    L_0x0053:
        r1 = r5.attributionTintColor;
        r2 = r6.attributionTintColor;
        if (r1 == r2) goto L_0x005a;
    L_0x0059:
        return r0;
    L_0x005a:
        r1 = r5.attributionEnabled;
        r2 = r6.attributionEnabled;
        if (r1 == r2) goto L_0x0061;
    L_0x0060:
        return r0;
    L_0x0061:
        r1 = r5.attributionGravity;
        r2 = r6.attributionGravity;
        if (r1 == r2) goto L_0x0068;
    L_0x0067:
        return r0;
    L_0x0068:
        r1 = r6.minZoom;
        r3 = r5.minZoom;
        r1 = java.lang.Double.compare(r1, r3);
        if (r1 == 0) goto L_0x0073;
    L_0x0072:
        return r0;
    L_0x0073:
        r1 = r6.maxZoom;
        r3 = r5.maxZoom;
        r1 = java.lang.Double.compare(r1, r3);
        if (r1 == 0) goto L_0x007e;
    L_0x007d:
        return r0;
    L_0x007e:
        r1 = r5.rotateGesturesEnabled;
        r2 = r6.rotateGesturesEnabled;
        if (r1 == r2) goto L_0x0085;
    L_0x0084:
        return r0;
    L_0x0085:
        r1 = r5.scrollGesturesEnabled;
        r2 = r6.scrollGesturesEnabled;
        if (r1 == r2) goto L_0x008c;
    L_0x008b:
        return r0;
    L_0x008c:
        r1 = r5.tiltGesturesEnabled;
        r2 = r6.tiltGesturesEnabled;
        if (r1 == r2) goto L_0x0093;
    L_0x0092:
        return r0;
    L_0x0093:
        r1 = r5.zoomGesturesEnabled;
        r2 = r6.zoomGesturesEnabled;
        if (r1 == r2) goto L_0x009a;
    L_0x0099:
        return r0;
    L_0x009a:
        r1 = r5.zoomControlsEnabled;
        r2 = r6.zoomControlsEnabled;
        if (r1 == r2) goto L_0x00a1;
    L_0x00a0:
        return r0;
    L_0x00a1:
        r1 = r5.doubleTapGesturesEnabled;
        r2 = r6.doubleTapGesturesEnabled;
        if (r1 == r2) goto L_0x00a8;
    L_0x00a7:
        return r0;
    L_0x00a8:
        r1 = r5.cameraPosition;
        if (r1 == 0) goto L_0x00b7;
    L_0x00ac:
        r1 = r5.cameraPosition;
        r2 = r6.cameraPosition;
        r1 = r1.equals(r2);
        if (r1 != 0) goto L_0x00bc;
    L_0x00b6:
        goto L_0x00bb;
    L_0x00b7:
        r1 = r6.cameraPosition;
        if (r1 == 0) goto L_0x00bc;
    L_0x00bb:
        return r0;
    L_0x00bc:
        r1 = r5.compassMargins;
        r2 = r6.compassMargins;
        r1 = java.util.Arrays.equals(r1, r2);
        if (r1 != 0) goto L_0x00c7;
    L_0x00c6:
        return r0;
    L_0x00c7:
        r1 = r5.logoMargins;
        r2 = r6.logoMargins;
        r1 = java.util.Arrays.equals(r1, r2);
        if (r1 != 0) goto L_0x00d2;
    L_0x00d1:
        return r0;
    L_0x00d2:
        r1 = r5.attributionMargins;
        r2 = r6.attributionMargins;
        r1 = java.util.Arrays.equals(r1, r2);
        if (r1 != 0) goto L_0x00dd;
    L_0x00dc:
        return r0;
    L_0x00dd:
        r1 = r5.style;
        if (r1 == 0) goto L_0x00ec;
    L_0x00e1:
        r1 = r5.style;
        r2 = r6.style;
        r1 = r1.equals(r2);
        if (r1 != 0) goto L_0x00f1;
    L_0x00eb:
        goto L_0x00f0;
    L_0x00ec:
        r1 = r6.style;
        if (r1 == 0) goto L_0x00f1;
    L_0x00f0:
        return r0;
    L_0x00f1:
        r1 = r5.apiBaseUrl;
        if (r1 == 0) goto L_0x0100;
    L_0x00f5:
        r1 = r5.apiBaseUrl;
        r2 = r6.apiBaseUrl;
        r1 = r1.equals(r2);
        if (r1 != 0) goto L_0x0105;
    L_0x00ff:
        goto L_0x0104;
    L_0x0100:
        r1 = r6.apiBaseUrl;
        if (r1 == 0) goto L_0x0105;
    L_0x0104:
        return r0;
    L_0x0105:
        r1 = r5.prefetchesTiles;
        r2 = r6.prefetchesTiles;
        if (r1 == r2) goto L_0x010c;
    L_0x010b:
        return r0;
    L_0x010c:
        r1 = r5.zMediaOverlay;
        r2 = r6.zMediaOverlay;
        if (r1 == r2) goto L_0x0113;
    L_0x0112:
        return r0;
    L_0x0113:
        r1 = r5.localIdeographFontFamily;
        r6 = r6.localIdeographFontFamily;
        if (r1 == r6) goto L_0x011a;
    L_0x0119:
        return r0;
    L_0x011a:
        return r0;
    L_0x011b:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.mapboxsdk.maps.MapboxMapOptions.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((((((((((((((((((((this.cameraPosition != null ? this.cameraPosition.hashCode() : 0) * 31) + this.debugActive) * 31) + this.compassEnabled) * 31) + this.fadeCompassFacingNorth) * 31) + this.compassGravity) * 31) + (this.compassImage != null ? this.compassImage.hashCode() : 0)) * 31) + Arrays.hashCode(this.compassMargins)) * 31) + this.logoEnabled) * 31) + this.logoGravity) * 31) + Arrays.hashCode(this.logoMargins)) * 31) + this.attributionTintColor) * 31) + this.attributionEnabled) * 31) + this.attributionGravity) * 31) + Arrays.hashCode(this.attributionMargins);
        long doubleToLongBits = Double.doubleToLongBits(this.minZoom);
        hashCode = (hashCode * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
        doubleToLongBits = Double.doubleToLongBits(this.maxZoom);
        hashCode = ((((((((((((((((((((((((((hashCode * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31) + this.rotateGesturesEnabled) * 31) + this.scrollGesturesEnabled) * 31) + this.tiltGesturesEnabled) * 31) + this.zoomGesturesEnabled) * 31) + this.zoomControlsEnabled) * 31) + this.doubleTapGesturesEnabled) * 31) + (this.apiBaseUrl != null ? this.apiBaseUrl.hashCode() : 0)) * 31) + this.textureMode) * 31) + this.translucentTextureSurface) * 31) + (this.style != null ? this.style.hashCode() : 0)) * 31) + this.prefetchesTiles) * 31) + this.zMediaOverlay) * 31;
        if (this.localIdeographFontFamily != null) {
            i = this.localIdeographFontFamily.hashCode();
        }
        return hashCode + i;
    }
}
