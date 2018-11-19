package com.tinder.recs.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Shader.TileMode;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindColor;
import butterknife.BindDimen;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.tinder.R;
import com.tinder.gamepad.view.GamepadButton;
import com.tinder.utils.C15373v;
import com.tinder.utils.C15373v.C15372a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class BoostButton extends GamepadButton {
    private static final int FADE_DURATON = 300;
    @BindView(2131361948)
    TextView boostCounterTextView;
    @BindView(2131361949)
    ImageView mBoltIcon;
    @BindColor(2131099698)
    int mEmptyColor;
    private final C15373v mGaugeCanvasHelper = new C15372a().m57686a(this.mStrokeThickness).m57689c(this.mSweepStartColor).m57690d(this.mSweepEndColor).m57688b(this.mEmptyColor).m57687a();
    @BindView(2131361950)
    TextView mMultiplierTextView;
    @BindDimen(2131165297)
    int mStrokeThickness;
    @BindColor(2131099694)
    int mSweepEndColor;
    @BindColor(2131099695)
    int mSweepStartColor;
    @BindColor(2131099702)
    int textGradientEnd;
    @BindColor(2131099703)
    int textGradientStart;

    public BoostButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.mGaugeCanvasHelper.m57699a(canvas);
    }

    public View createContent(AttributeSet attributeSet) {
        attributeSet = LayoutInflater.from(getContext()).inflate(R.layout.boost_gamepad_content, this, false);
        attributeSet.getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
            public void onGlobalLayout() {
                if (BoostButton.this.getWidth() > 0) {
                    attributeSet.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    int width = (int) (((float) (BoostButton.this.getWidth() / 2)) + ((float) ((attributeSet.getWidth() / 2) + BoostButton.this.getBackgroundPadding())));
                    BoostButton.this.mGaugeCanvasHelper.m57698a(width, width, false);
                }
            }
        });
        ButterKnife.a(this, attributeSet);
        return attributeSet;
    }

    @Nullable
    protected View iconView() {
        return this.mBoltIcon;
    }

    @Nullable
    protected View counterView() {
        return this.boostCounterTextView;
    }

    protected void setCounterText(@NotNull String str) {
        this.boostCounterTextView.setText(str);
        this.boostCounterTextView.getPaint().setShader(new LinearGradient(0.0f, 0.0f, 0.0f, (float) this.boostCounterTextView.getHeight(), new int[]{this.textGradientStart, this.textGradientEnd}, null, TileMode.CLAMP));
    }

    public void showMultiplierValue(String str) {
        if (this.mBoltIcon.getAlpha() == 1.0f) {
            fadeInMultiplier();
        }
        this.mMultiplierTextView.setText(str);
    }

    public void fadeInMultiplier() {
        this.mBoltIcon.animate().alpha(0.0f).setDuration(300);
        this.mMultiplierTextView.animate().alpha(1.0f).setDuration(300);
    }

    public void fadeOutMultipler() {
        this.mMultiplierTextView.animate().alpha(0.0f).setDuration(300);
        this.mBoltIcon.animate().alpha(1.0f).setDuration(300);
    }

    public void showPercentFilled(float f) {
        this.mGaugeCanvasHelper.m57697a(f);
        invalidate();
    }

    public void showEmptyGauge() {
        this.mGaugeCanvasHelper.m57700b();
        invalidate();
    }

    public void showFullGauge() {
        this.mGaugeCanvasHelper.m57696a();
        invalidate();
    }
}
