package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

/* renamed from: android.support.transition.y */
class C0357y {
    /* renamed from: a */
    static View m1307a(ViewGroup viewGroup, View view, View view2) {
        Matrix matrix = new Matrix();
        matrix.setTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        am.m1252a(view, matrix);
        am.m1254b(viewGroup, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        matrix.mapRect(rectF);
        view2 = Math.round(rectF.left);
        int round = Math.round(rectF.top);
        int round2 = Math.round(rectF.right);
        int round3 = Math.round(rectF.bottom);
        View imageView = new ImageView(view.getContext());
        imageView.setScaleType(ScaleType.CENTER_CROP);
        viewGroup = C0357y.m1306a(view, matrix, rectF);
        if (viewGroup != null) {
            imageView.setImageBitmap(viewGroup);
        }
        imageView.measure(MeasureSpec.makeMeasureSpec(round2 - view2, 1073741824), MeasureSpec.makeMeasureSpec(round3 - round, 1073741824));
        imageView.layout(view2, round, round2, round3);
        return imageView;
    }

    /* renamed from: a */
    private static Bitmap m1306a(View view, Matrix matrix, RectF rectF) {
        int round = Math.round(rectF.width());
        int round2 = Math.round(rectF.height());
        if (round <= 0 || round2 <= 0) {
            return null;
        }
        float min = Math.min(1.0f, 1048576.0f / ((float) (round * round2)));
        round = (int) (((float) round) * min);
        round2 = (int) (((float) round2) * min);
        matrix.postTranslate(-rectF.left, -rectF.top);
        matrix.postScale(min, min);
        rectF = Bitmap.createBitmap(round, round2, Config.ARGB_8888);
        Canvas canvas = new Canvas(rectF);
        canvas.concat(matrix);
        view.draw(canvas);
        return rectF;
    }

    /* renamed from: a */
    static Animator m1305a(Animator animator, Animator animator2) {
        if (animator == null) {
            return animator2;
        }
        if (animator2 == null) {
            return animator;
        }
        Animator animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{animator, animator2});
        return animatorSet;
    }
}
