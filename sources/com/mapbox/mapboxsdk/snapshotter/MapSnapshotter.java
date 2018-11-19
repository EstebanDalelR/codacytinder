package com.mapbox.mapboxsdk.snapshotter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.UiThread;
import android.support.v4.content.res.C0441a;
import android.text.Html;
import android.util.DisplayMetrics;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.mapbox.mapboxsdk.C5812R;
import com.mapbox.mapboxsdk.attribution.AttributionLayout;
import com.mapbox.mapboxsdk.attribution.AttributionMeasure;
import com.mapbox.mapboxsdk.attribution.AttributionMeasure.Builder;
import com.mapbox.mapboxsdk.camera.CameraPosition;
import com.mapbox.mapboxsdk.constants.Style;
import com.mapbox.mapboxsdk.geometry.LatLngBounds;
import com.mapbox.mapboxsdk.storage.FileSource;
import p000a.p001a.C0001a;

@UiThread
public class MapSnapshotter {
    private static final int LOGO_MARGIN_DP = 4;
    private SnapshotReadyCallback callback;
    private final Context context;
    private ErrorHandler errorHandler;
    private long nativePtr = 0;

    public interface ErrorHandler {
        void onError(String str);
    }

    private class Logo {
        private Bitmap large;
        private float scale;
        private Bitmap small;

        public Logo(Bitmap bitmap, Bitmap bitmap2, float f) {
            this.large = bitmap;
            this.small = bitmap2;
            this.scale = f;
        }

        public Bitmap getLarge() {
            return this.large;
        }

        public Bitmap getSmall() {
            return this.small;
        }

        public float getScale() {
            return this.scale;
        }
    }

    public static class Options {
        private CameraPosition cameraPosition;
        private int height;
        private float pixelRatio = 1.0f;
        private LatLngBounds region;
        private boolean showLogo = true;
        private String styleUrl = Style.MAPBOX_STREETS;
        private int width;

        public Options(int i, int i2) {
            if (i != 0) {
                if (i2 != 0) {
                    this.width = i;
                    this.height = i2;
                    return;
                }
            }
            throw new IllegalArgumentException("Unable to create a snapshot with width or height set to 0");
        }

        public Options withStyle(String str) {
            this.styleUrl = str;
            return this;
        }

        public Options withRegion(LatLngBounds latLngBounds) {
            this.region = latLngBounds;
            return this;
        }

        public Options withPixelRatio(float f) {
            this.pixelRatio = f;
            return this;
        }

        public Options withCameraPosition(CameraPosition cameraPosition) {
            this.cameraPosition = cameraPosition;
            return this;
        }

        public Options withLogo(boolean z) {
            this.showLogo = z;
            return this;
        }

        public int getWidth() {
            return this.width;
        }

        public int getHeight() {
            return this.height;
        }

        public float getPixelRatio() {
            return this.pixelRatio;
        }

        @Nullable
        public LatLngBounds getRegion() {
            return this.region;
        }

        public String getStyleUrl() {
            return this.styleUrl;
        }

        @Nullable
        public CameraPosition getCameraPosition() {
            return this.cameraPosition;
        }
    }

    public interface SnapshotReadyCallback {
        void onSnapshotReady(MapSnapshot mapSnapshot);
    }

    protected native void finalize() throws Throwable;

    protected native void nativeCancel();

    protected native void nativeInitialize(MapSnapshotter mapSnapshotter, FileSource fileSource, float f, int i, int i2, String str, LatLngBounds latLngBounds, CameraPosition cameraPosition, boolean z, String str2);

    protected native void nativeStart();

    public native void setCameraPosition(CameraPosition cameraPosition);

    public native void setRegion(LatLngBounds latLngBounds);

    public native void setSize(int i, int i2);

    public native void setStyleUrl(String str);

    public MapSnapshotter(@NonNull Context context, @NonNull Options options) {
        this.context = context.getApplicationContext();
        nativeInitialize(this, FileSource.getInstance(context), options.pixelRatio, options.width, options.height, options.styleUrl, options.region, options.cameraPosition, options.showLogo, context.getCacheDir().getAbsolutePath());
    }

    public void start(@NonNull SnapshotReadyCallback snapshotReadyCallback) {
        start(snapshotReadyCallback, null);
    }

    public void start(@NonNull SnapshotReadyCallback snapshotReadyCallback, ErrorHandler errorHandler) {
        if (this.callback != null) {
            throw new IllegalStateException("Snapshotter was already started");
        }
        this.callback = snapshotReadyCallback;
        this.errorHandler = errorHandler;
        nativeStart();
    }

    public void cancel() {
        reset();
        nativeCancel();
    }

    protected void addOverlay(MapSnapshot mapSnapshot) {
        Bitmap bitmap = mapSnapshot.getBitmap();
        drawOverlay(mapSnapshot, bitmap, new Canvas(bitmap), ((int) this.context.getResources().getDisplayMetrics().density) * 4);
    }

    private void drawOverlay(MapSnapshot mapSnapshot, Bitmap bitmap, Canvas canvas, int i) {
        bitmap = getAttributionMeasure(mapSnapshot, bitmap, i);
        AttributionLayout measure = bitmap.measure();
        drawLogo(mapSnapshot, canvas, i, measure);
        drawAttribution(mapSnapshot, canvas, bitmap, measure);
    }

    private AttributionMeasure getAttributionMeasure(MapSnapshot mapSnapshot, Bitmap bitmap, int i) {
        Logo createScaledLogo = createScaledLogo(bitmap);
        TextView createTextView = createTextView(mapSnapshot, false, createScaledLogo.getScale());
        return new Builder().setSnapshot(bitmap).setLogo(createScaledLogo.getLarge()).setLogoSmall(createScaledLogo.getSmall()).setTextView(createTextView).setTextViewShort(createTextView(mapSnapshot, true, createScaledLogo.getScale())).setMarginPadding((float) i).build();
    }

    private void drawLogo(MapSnapshot mapSnapshot, Canvas canvas, int i, AttributionLayout attributionLayout) {
        if (mapSnapshot.isShowLogo()) {
            drawLogo(mapSnapshot.getBitmap(), canvas, i, attributionLayout);
        }
    }

    private void drawLogo(Bitmap bitmap, Canvas canvas, int i, AttributionLayout attributionLayout) {
        attributionLayout = attributionLayout.getLogo();
        if (attributionLayout != null) {
            canvas.drawBitmap(attributionLayout, (float) i, (float) ((bitmap.getHeight() - attributionLayout.getHeight()) - i), 0);
        }
    }

    private void drawAttribution(MapSnapshot mapSnapshot, Canvas canvas, AttributionMeasure attributionMeasure, AttributionLayout attributionLayout) {
        attributionLayout = attributionLayout.getAnchorPoint();
        if (attributionLayout != null) {
            drawAttribution(canvas, attributionMeasure, attributionLayout);
            return;
        }
        canvas = mapSnapshot.getBitmap();
        C0001a.e("Could not generate attribution for snapshot size: %s x %s. You are required to provide your own attribution for the used sources: %s", new Object[]{Integer.valueOf(canvas.getWidth()), Integer.valueOf(canvas.getHeight()), mapSnapshot.getAttributions()});
    }

    private void drawAttribution(Canvas canvas, AttributionMeasure attributionMeasure, PointF pointF) {
        canvas.save();
        canvas.translate(pointF.x, pointF.y);
        attributionMeasure.getTextView().draw(canvas);
        canvas.restore();
    }

    private TextView createTextView(MapSnapshot mapSnapshot, boolean z, float f) {
        int b = C0441a.b(this.context.getResources(), C5812R.color.mapbox_gray_dark, this.context.getTheme());
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(0, 0);
        TextView textView = new TextView(this.context);
        textView.setLayoutParams(new LayoutParams(-2, -2));
        textView.setSingleLine(true);
        textView.setTextSize(f * 10.0f);
        textView.setTextColor(b);
        textView.setBackgroundResource(C5812R.drawable.mapbox_rounded_corner);
        textView.setText(Html.fromHtml(createAttributionString(mapSnapshot, z)));
        textView.measure(makeMeasureSpec, makeMeasureSpec2);
        textView.layout(0, 0, textView.getMeasuredWidth(), textView.getMeasuredHeight());
        return textView;
    }

    private String createAttributionString(MapSnapshot mapSnapshot, boolean z) {
        return new com.mapbox.mapboxsdk.attribution.AttributionParser.Options().withAttributionData(mapSnapshot.getAttributions()).withCopyrightSign(false).withImproveMap(false).build().createAttributionString(z);
    }

    private Logo createScaledLogo(@NonNull Bitmap bitmap) {
        Bitmap decodeResource = BitmapFactory.decodeResource(this.context.getResources(), C5812R.drawable.mapbox_logo_icon, null);
        bitmap = calculateLogoScale(bitmap, decodeResource);
        Matrix matrix = new Matrix();
        matrix.postScale(bitmap, bitmap);
        Bitmap decodeResource2 = BitmapFactory.decodeResource(this.context.getResources(), C5812R.drawable.mapbox_logo_helmet, null);
        return new Logo(Bitmap.createBitmap(decodeResource, 0, 0, decodeResource.getWidth(), decodeResource.getHeight(), matrix, true), Bitmap.createBitmap(decodeResource2, 0, 0, decodeResource2.getWidth(), decodeResource2.getHeight(), matrix, true), bitmap);
    }

    private float calculateLogoScale(Bitmap bitmap, Bitmap bitmap2) {
        DisplayMetrics displayMetrics = this.context.getResources().getDisplayMetrics();
        bitmap = Math.min((((float) bitmap2.getWidth()) / ((float) (displayMetrics.widthPixels / bitmap.getWidth()))) / ((float) bitmap2.getWidth()), (((float) bitmap2.getHeight()) / ((float) (displayMetrics.heightPixels / bitmap.getHeight()))) / ((float) bitmap2.getHeight())) * 1073741824;
        if (bitmap > 1065353216) {
            return 1.0f;
        }
        return bitmap < 0.6f ? 0.6f : bitmap;
    }

    protected void onSnapshotReady(final MapSnapshot mapSnapshot) {
        new Handler().post(new Runnable() {
            public void run() {
                if (MapSnapshotter.this.callback != null) {
                    MapSnapshotter.this.addOverlay(mapSnapshot);
                    MapSnapshotter.this.callback.onSnapshotReady(mapSnapshot);
                    MapSnapshotter.this.reset();
                }
            }
        });
    }

    protected void onSnapshotFailed(String str) {
        if (this.errorHandler != null) {
            this.errorHandler.onError(str);
            reset();
        }
    }

    protected void reset() {
        this.callback = null;
        this.errorHandler = null;
    }
}
