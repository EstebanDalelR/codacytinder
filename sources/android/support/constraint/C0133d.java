package android.support.constraint;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.support.constraint.ConstraintLayout.LayoutParams;
import android.view.View;

/* renamed from: android.support.constraint.d */
public class C0133d extends View {
    /* renamed from: a */
    private int f386a;
    /* renamed from: b */
    private View f387b;
    /* renamed from: c */
    private int f388c;

    public void setEmptyVisibility(int i) {
        this.f388c = i;
    }

    public int getEmptyVisibility() {
        return this.f388c;
    }

    public View getContent() {
        return this.f387b;
    }

    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize((float) rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Align.LEFT);
            String str = "?";
            paint.getTextBounds(str, 0, str.length(), rect);
            canvas.drawText(str, ((((float) width) / 2.0f) - (((float) rect.width()) / 2.0f)) - ((float) rect.left), ((((float) height) / 2.0f) + (((float) rect.height()) / 2.0f)) - ((float) rect.bottom), paint);
        }
    }

    /* renamed from: a */
    public void m398a(ConstraintLayout constraintLayout) {
        if (this.f386a == -1 && !isInEditMode()) {
            setVisibility(this.f388c);
        }
        this.f387b = constraintLayout.findViewById(this.f386a);
        if (this.f387b != null) {
            ((LayoutParams) this.f387b.getLayoutParams()).aa = true;
            this.f387b.setVisibility(0);
            setVisibility(0);
        }
    }

    public void setContentId(int i) {
        if (this.f386a != i) {
            if (this.f387b != null) {
                this.f387b.setVisibility(0);
                ((LayoutParams) this.f387b.getLayoutParams()).aa = false;
                this.f387b = null;
            }
            this.f386a = i;
            if (i != -1) {
                i = ((View) getParent()).findViewById(i);
                if (i != 0) {
                    i.setVisibility(8);
                }
            }
        }
    }

    /* renamed from: b */
    public void m399b(ConstraintLayout constraintLayout) {
        if (this.f387b != null) {
            LayoutParams layoutParams = (LayoutParams) getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) this.f387b.getLayoutParams();
            layoutParams2.al.m525e(0);
            layoutParams.al.m532h(layoutParams2.al.m545o());
            layoutParams.al.m534i(layoutParams2.al.m549q());
            layoutParams2.al.m525e(8);
        }
    }
}
