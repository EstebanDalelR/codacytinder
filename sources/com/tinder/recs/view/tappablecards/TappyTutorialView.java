package com.tinder.recs.view.tappablecards;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Rect;
import android.support.annotation.DimenRes;
import android.support.annotation.StringRes;
import android.support.v4.content.res.C0441a;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.tinder.recs.C14694R;
import com.tinder.recs.view.BitmapKt;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u0000 ;2\u00020\u0001:\u0003;<=B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0016J\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0002J\u0010\u0010,\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0002J\u0010\u0010-\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0002J\u0010\u0010.\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0002J\u0010\u0010/\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0002J\u0010\u00100\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0014J(\u00101\u001a\u00020)2\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u0002032\u0006\u00106\u001a\u000203H\u0014J\u0010\u00107\u001a\u00020)2\b\u00108\u001a\u0004\u0018\u00010\fJ\u000e\u00109\u001a\u00020)2\u0006\u0010\u001d\u001a\u000203J\u000e\u0010:\u001a\u00020)2\u0006\u0010\"\u001a\u00020#R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u000e¢\u0006\u0002\n\u0000¨\u0006>"}, d2 = {"Lcom/tinder/recs/view/tappablecards/TappyTutorialView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "backgroundPaint", "Landroid/graphics/Paint;", "bitmapRect", "Landroid/graphics/Rect;", "blurredPhotoBackground", "Landroid/graphics/Bitmap;", "dashLength", "", "dashPath", "Landroid/graphics/Path;", "dashSpacing", "dashedPaint", "lastPhotoLayout", "Landroid/text/StaticLayout;", "lastPhotoText", "", "leftHandBitmap", "marginLarger", "marginSmall", "nextPhotoLayout", "nextPhotoText", "openProfileLayout", "openProfileRegionHeight", "openProfileText", "rightHandBitmap", "textPaint", "Landroid/text/TextPaint;", "viewTapListener", "Lcom/tinder/recs/view/tappablecards/TappyTutorialView$OnViewTapListener;", "dispatchTouchEvent", "", "event", "Landroid/view/MotionEvent;", "drawBackground", "", "canvas", "Landroid/graphics/Canvas;", "drawDashPath", "drawLeftSide", "drawOpenProfileRegion", "drawRightSide", "onDraw", "onSizeChanged", "width", "", "height", "oldWidth", "oldHeight", "setImageBackground", "picture", "setOpenProfileRegionHeight", "setViewTapListener", "Companion", "OnViewTapListener", "TapRegion", "recs-cards_release"}, k = 1, mv = {1, 1, 10})
public final class TappyTutorialView extends View {
    private static final int BLACK_TRANSLUCENT = Color.argb(75, 0, 0, 0);
    public static final Companion Companion = new Companion();
    private HashMap _$_findViewCache;
    private final Paint backgroundPaint;
    private Rect bitmapRect;
    private Bitmap blurredPhotoBackground;
    private final float dashLength = Companion.getDimen(this, C14694R.dimen.tappy_tutorial_dash_length);
    private final Path dashPath;
    private final float dashSpacing = Companion.getDimen(this, C14694R.dimen.tappy_tutorial_dash_spacing);
    private final Paint dashedPaint;
    private StaticLayout lastPhotoLayout;
    private final String lastPhotoText = Companion.getString(this, C14694R.string.last_photo);
    private final Bitmap leftHandBitmap;
    private final float marginLarger = Companion.getDimen(this, C14694R.dimen.tappy_tutorial_bitmap_horizontal_margin);
    private final float marginSmall = Companion.getDimen(this, C14694R.dimen.tappy_tutorial_bitmap_vertical_margin);
    private StaticLayout nextPhotoLayout;
    private final String nextPhotoText = Companion.getString(this, C14694R.string.next_photo);
    private StaticLayout openProfileLayout;
    private float openProfileRegionHeight;
    private final String openProfileText = Companion.getString(this, C14694R.string.open_profile);
    private final Bitmap rightHandBitmap;
    private final TextPaint textPaint;
    private OnViewTapListener viewTapListener;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0006\u001a\u00020\u0007*\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\u0004H\u0002J\u0016\u0010\n\u001a\u00020\u000b*\u00020\b2\b\b\u0001\u0010\f\u001a\u00020\u0004H\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0002X\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002¨\u0006\r"}, d2 = {"Lcom/tinder/recs/view/tappablecards/TappyTutorialView$Companion;", "", "()V", "BLACK_TRANSLUCENT", "", "BLACK_TRANSLUCENT$annotations", "getDimen", "", "Landroid/view/View;", "dimen", "getString", "", "string", "recs-cards_release"}, k = 1, mv = {1, 1, 10})
    public static final class Companion {
        @JvmStatic
        private static /* synthetic */ void BLACK_TRANSLUCENT$annotations() {
        }

        private Companion() {
        }

        private final float getDimen(@NotNull View view, @DimenRes int i) {
            return view.getResources().getDimension(i);
        }

        private final String getString(@NotNull View view, @StringRes int i) {
            view = view.getResources().getString(i);
            C2668g.a(view, "resources.getString(string)");
            return view;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/tinder/recs/view/tappablecards/TappyTutorialView$OnViewTapListener;", "", "onTappyTutorialViewRegionTapped", "", "position", "Lcom/tinder/recs/view/tappablecards/TappyTutorialView$TapRegion;", "recs-cards_release"}, k = 1, mv = {1, 1, 10})
    public interface OnViewTapListener {
        void onTappyTutorialViewRegionTapped(@NotNull TapRegion tapRegion);
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/tinder/recs/view/tappablecards/TappyTutorialView$TapRegion;", "", "(Ljava/lang/String;I)V", "PREVIOUS_PHOTO", "NEXT_PHOTO", "PROFILE", "recs-cards_release"}, k = 1, mv = {1, 1, 10})
    public enum TapRegion {
    }

    public void _$_clearFindViewByIdCache() {
        if (this._$_findViewCache != null) {
            this._$_findViewCache.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), view);
        return view;
    }

    public TappyTutorialView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        attributeSet = new Paint(1);
        attributeSet.setStrokeWidth(Companion.getDimen(this, C14694R.dimen.tappy_tutorial_stroke_width));
        attributeSet.setColor(-1);
        attributeSet.setStyle(Style.STROKE);
        attributeSet.setPathEffect(new DashPathEffect(new float[]{this.dashLength, this.dashSpacing}, 0.0f));
        this.dashedPaint = attributeSet;
        attributeSet = new Paint(1);
        attributeSet.setColor(BLACK_TRANSLUCENT);
        this.backgroundPaint = attributeSet;
        attributeSet = new TextPaint(1);
        attributeSet.setTextSize(Companion.getDimen(this, C14694R.dimen.tappy_tutorial_text_size));
        attributeSet.setColor(-1);
        attributeSet.setTypeface(C0441a.a(context, C14694R.font.proximanova_regular));
        attributeSet.setSubpixelText(true);
        this.textPaint = attributeSet;
        this.dashPath = new Path();
        this.rightHandBitmap = BitmapFactory.decodeResource(getResources(), C14694R.drawable.ic_tap_icon);
        context = this.rightHandBitmap;
        this.leftHandBitmap = context != null ? BitmapKt.flipHorizontally(context) : null;
        this.openProfileRegionHeight = Companion.getDimen(this, C14694R.dimen.tappy_tutorial_min_profile_region_height);
        this.bitmapRect = new Rect();
    }

    public final void setViewTapListener(@NotNull OnViewTapListener onViewTapListener) {
        C2668g.b(onViewTapListener, "viewTapListener");
        this.viewTapListener = onViewTapListener;
    }

    public final void setOpenProfileRegionHeight(int i) {
        this.openProfileRegionHeight = (float) i;
        invalidate();
    }

    public final void setImageBackground(@Nullable Bitmap bitmap) {
        if (bitmap != null) {
            try {
                Context context = getContext();
                C2668g.a(context, "context");
                bitmap = BitmapKt.blur$default(bitmap, context, 0, 2, null);
                if (bitmap != null) {
                    this.blurredPhotoBackground = bitmap;
                    invalidate();
                }
            } catch (Bitmap bitmap2) {
                C0001a.c((Throwable) bitmap2);
            }
        }
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.bitmapRect = new Rect(0, 0, getWidth(), getHeight());
        int i5 = i / 2;
        this.nextPhotoLayout = new StaticLayout(this.nextPhotoText, this.textPaint, i5, Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.lastPhotoLayout = new StaticLayout(this.lastPhotoText, this.textPaint, i5, Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.openProfileLayout = new StaticLayout(this.openProfileText, this.textPaint, i, Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
    }

    protected void onDraw(@NotNull Canvas canvas) {
        C2668g.b(canvas, "canvas");
        super.onDraw(canvas);
        drawBackground(canvas);
        drawDashPath(canvas);
        drawLeftSide(canvas);
        drawRightSide(canvas);
        drawOpenProfileRegion(canvas);
    }

    private final void drawBackground(Canvas canvas) {
        if (this.blurredPhotoBackground != null) {
            canvas.drawBitmap(this.blurredPhotoBackground, null, this.bitmapRect, null);
        }
        canvas.drawRect(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), this.backgroundPaint);
    }

    private final void drawDashPath(Canvas canvas) {
        this.dashPath.reset();
        float height = ((float) canvas.getHeight()) - this.openProfileRegionHeight;
        float width = (float) (canvas.getWidth() / 2);
        this.dashPath.moveTo(width, 0.0f);
        this.dashPath.lineTo(width, height);
        this.dashPath.moveTo(0.0f, height);
        this.dashPath.lineTo((float) canvas.getWidth(), height);
        canvas.drawPath(this.dashPath, this.dashedPaint);
    }

    private final void drawLeftSide(Canvas canvas) {
        int width = canvas.getWidth() / 4;
        float height = (((float) canvas.getHeight()) - this.openProfileRegionHeight) / ((float) 2);
        canvas.save();
        canvas.translate(0.0f, height);
        StaticLayout staticLayout = this.lastPhotoLayout;
        if (staticLayout != null) {
            staticLayout.draw(canvas);
        }
        canvas.restore();
        if (this.leftHandBitmap != null) {
            canvas.drawBitmap(this.leftHandBitmap, (float) (width - (this.leftHandBitmap.getWidth() / 2)), (height - this.marginSmall) - ((float) this.leftHandBitmap.getHeight()), null);
        }
    }

    private final void drawRightSide(Canvas canvas) {
        int width = (int) (((float) getWidth()) * 0.75f);
        float height = (((float) getHeight()) - this.openProfileRegionHeight) / ((float) 2);
        int width2 = getWidth() / 2;
        canvas.save();
        canvas.translate((float) width2, height);
        StaticLayout staticLayout = this.nextPhotoLayout;
        if (staticLayout != null) {
            staticLayout.draw(canvas);
        }
        canvas.restore();
        if (this.rightHandBitmap != null) {
            canvas.drawBitmap(this.rightHandBitmap, (float) (width - (this.rightHandBitmap.getWidth() / 2)), (height - this.marginSmall) - ((float) this.rightHandBitmap.getHeight()), null);
        }
    }

    private final void drawOpenProfileRegion(Canvas canvas) {
        float height = (((float) canvas.getHeight()) - this.openProfileRegionHeight) + (this.openProfileRegionHeight / ((float) 2));
        StaticLayout staticLayout = this.openProfileLayout;
        height -= (float) ((staticLayout != null ? staticLayout.getHeight() : 0) / 2);
        canvas.save();
        canvas.translate(0.0f, height);
        staticLayout = this.openProfileLayout;
        if (staticLayout != null) {
            staticLayout.draw(canvas);
        }
        canvas.restore();
        if (this.rightHandBitmap != null) {
            canvas.drawBitmap(this.rightHandBitmap, (((float) canvas.getWidth()) - ((float) this.rightHandBitmap.getWidth())) - this.marginLarger, height - this.marginSmall, null);
        }
    }

    public boolean dispatchTouchEvent(@NotNull MotionEvent motionEvent) {
        C2668g.b(motionEvent, "event");
        if (this.viewTapListener == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        OnViewTapListener onViewTapListener;
        if (motionEvent.getY() > ((float) getHeight()) - this.openProfileRegionHeight) {
            onViewTapListener = this.viewTapListener;
            if (onViewTapListener != null) {
                onViewTapListener.onTappyTutorialViewRegionTapped(TapRegion.PROFILE);
            }
            return super.dispatchTouchEvent(motionEvent);
        }
        if (motionEvent.getX() > ((float) (getWidth() / 2))) {
            onViewTapListener = this.viewTapListener;
            if (onViewTapListener != null) {
                onViewTapListener.onTappyTutorialViewRegionTapped(TapRegion.NEXT_PHOTO);
            }
        } else {
            onViewTapListener = this.viewTapListener;
            if (onViewTapListener != null) {
                onViewTapListener.onTappyTutorialViewRegionTapped(TapRegion.PREVIOUS_PHOTO);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
