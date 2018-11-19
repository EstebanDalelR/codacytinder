package android.support.v4.app;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import java.util.List;
import java.util.Map;

public abstract class SharedElementCallback {
    /* renamed from: b */
    private static int f1311b = 1048576;
    /* renamed from: a */
    private Matrix f1312a;

    public interface OnSharedElementsReadyListener {
        void onSharedElementsReady();
    }

    /* renamed from: a */
    public void m1435a(List<View> list) {
    }

    /* renamed from: a */
    public void m1437a(List<String> list, List<View> list2, List<View> list3) {
    }

    /* renamed from: a */
    public void m1438a(List<String> list, Map<String, View> map) {
    }

    /* renamed from: b */
    public void m1439b(List<String> list, List<View> list2, List<View> list3) {
    }

    /* renamed from: a */
    public Parcelable m1433a(View view, Matrix matrix, RectF rectF) {
        if (view instanceof ImageView) {
            ImageView imageView = (ImageView) view;
            Drawable drawable = imageView.getDrawable();
            Drawable background = imageView.getBackground();
            if (drawable != null && background == null) {
                Parcelable a = m1432a(drawable);
                if (a != null) {
                    view = new Bundle();
                    view.putParcelable("sharedElement:snapshot:bitmap", a);
                    view.putString("sharedElement:snapshot:imageScaleType", imageView.getScaleType().toString());
                    if (imageView.getScaleType() == ScaleType.MATRIX) {
                        rectF = new float[9];
                        imageView.getImageMatrix().getValues(rectF);
                        view.putFloatArray("sharedElement:snapshot:imageMatrix", rectF);
                    }
                    return view;
                }
            }
        }
        int round = Math.round(rectF.width());
        int round2 = Math.round(rectF.height());
        Parcelable parcelable = null;
        if (round > 0 && round2 > 0) {
            float min = Math.min(1.0f, ((float) f1311b) / ((float) (round * round2)));
            round = (int) (((float) round) * min);
            round2 = (int) (((float) round2) * min);
            if (this.f1312a == null) {
                this.f1312a = new Matrix();
            }
            this.f1312a.set(matrix);
            this.f1312a.postTranslate(-rectF.left, -rectF.top);
            this.f1312a.postScale(min, min);
            parcelable = Bitmap.createBitmap(round, round2, Config.ARGB_8888);
            matrix = new Canvas(parcelable);
            matrix.concat(this.f1312a);
            view.draw(matrix);
        }
        return parcelable;
    }

    /* renamed from: a */
    private static Bitmap m1432a(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth > 0) {
            if (intrinsicHeight > 0) {
                float min = Math.min(1.0f, ((float) f1311b) / ((float) (intrinsicWidth * intrinsicHeight)));
                if ((drawable instanceof BitmapDrawable) && min == 1.0f) {
                    return ((BitmapDrawable) drawable).getBitmap();
                }
                intrinsicWidth = (int) (((float) intrinsicWidth) * min);
                intrinsicHeight = (int) (((float) intrinsicHeight) * min);
                Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Rect bounds = drawable.getBounds();
                int i = bounds.left;
                int i2 = bounds.top;
                int i3 = bounds.right;
                int i4 = bounds.bottom;
                drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                drawable.draw(canvas);
                drawable.setBounds(i, i2, i3, i4);
                return createBitmap;
            }
        }
        return null;
    }

    /* renamed from: a */
    public View m1434a(Context context, Parcelable parcelable) {
        View view = null;
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            Bitmap bitmap = (Bitmap) bundle.getParcelable("sharedElement:snapshot:bitmap");
            if (bitmap == null) {
                return null;
            }
            view = new ImageView(context);
            view.setImageBitmap(bitmap);
            view.setScaleType(ScaleType.valueOf(bundle.getString("sharedElement:snapshot:imageScaleType")));
            if (view.getScaleType() == ScaleType.MATRIX) {
                context = bundle.getFloatArray("sharedElement:snapshot:imageMatrix");
                parcelable = new Matrix();
                parcelable.setValues(context);
                view.setImageMatrix(parcelable);
            }
        } else if (parcelable instanceof Bitmap) {
            Bitmap bitmap2 = (Bitmap) parcelable;
            view = new ImageView(context);
            view.setImageBitmap(bitmap2);
        }
        return view;
    }

    /* renamed from: a */
    public void m1436a(List<String> list, List<View> list2, OnSharedElementsReadyListener onSharedElementsReadyListener) {
        onSharedElementsReadyListener.onSharedElementsReady();
    }
}
