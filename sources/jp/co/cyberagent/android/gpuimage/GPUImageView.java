package jp.co.cyberagent.android.gpuimage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.opengl.GLSurfaceView;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import java.io.File;
import jp.co.cyberagent.android.gpuimage.GPUImage.ScaleType;

public class GPUImageView extends FrameLayout {
    /* renamed from: a */
    private GLSurfaceView f48937a;
    /* renamed from: b */
    private GPUImage f48938b;
    /* renamed from: c */
    private C15785a f48939c;
    /* renamed from: d */
    private float f48940d;

    public interface OnPictureSavedListener {
        void onPictureSaved(Uri uri);
    }

    protected void onMeasure(int i, int i2) {
        if (this.f48940d != 0.0f) {
            i = MeasureSpec.getSize(i);
            i2 = MeasureSpec.getSize(i2);
            float f = (float) i;
            float f2 = (float) i2;
            if (f / this.f48940d < f2) {
                i2 = Math.round(f / this.f48940d);
            } else {
                i = Math.round(f2 * this.f48940d);
            }
            super.onMeasure(MeasureSpec.makeMeasureSpec(i, 1073741824), MeasureSpec.makeMeasureSpec(i2, 1073741824));
            return;
        }
        super.onMeasure(i, i2);
    }

    public GPUImage getGPUImage() {
        return this.f48938b;
    }

    public void setRatio(float f) {
        this.f48940d = f;
        this.f48937a.requestLayout();
        this.f48938b.m59749b();
    }

    public void setScaleType(ScaleType scaleType) {
        this.f48938b.m59745a(scaleType);
    }

    public void setRotation(Rotation rotation) {
        this.f48938b.m59746a(rotation);
        m59751a();
    }

    public void setFilter(C15785a c15785a) {
        this.f48939c = c15785a;
        this.f48938b.m59747a(c15785a);
        m59751a();
    }

    public C15785a getFilter() {
        return this.f48939c;
    }

    public void setImage(Bitmap bitmap) {
        this.f48938b.m59742a(bitmap);
    }

    public void setImage(Uri uri) {
        this.f48938b.m59743a(uri);
    }

    public void setImage(File file) {
        this.f48938b.m59744a(file);
    }

    /* renamed from: a */
    public void m59751a() {
        this.f48937a.requestRender();
    }
}
