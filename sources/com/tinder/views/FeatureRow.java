package com.tinder.views;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build.VERSION;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.SwitchCompat;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindColor;
import butterknife.BindDimen;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.tinder.R;

public class FeatureRow extends RelativeLayout {
    /* renamed from: a */
    private String f47747a;
    /* renamed from: b */
    private String f47748b;
    /* renamed from: c */
    private String f47749c;
    /* renamed from: d */
    private boolean f47750d;
    @BindDimen(2131165743)
    int mBottomPadding;
    @BindView(2131362487)
    ImageView mFeatureCheck;
    @BindView(2131362488)
    TextView mFeatureDescription;
    @BindView(2131362493)
    SwitchCompat mFeatureSwitch;
    @BindView(2131362495)
    TextView mFeatureTitle;
    @BindDimen(2131165845)
    int mPadding;
    @BindColor(2131100168)
    int mRedColorFilter;
    @BindColor(2131100300)
    int mWhite;

    public interface FeatureInteractionListener {
        void onFeatureRowChecked(FeatureRow featureRow, FeatureRow featureRow2);

        void onFeatureRowClick(View view);

        void onFeatureSwitchChange(FeatureRow featureRow, boolean z);
    }

    public FeatureRow(Context context) {
        super(context);
        m57851a(context);
    }

    public FeatureRow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m57851a(context);
    }

    public FeatureRow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m57851a(context);
    }

    @TargetApi(21)
    public FeatureRow(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m57851a(context);
    }

    /* renamed from: a */
    private void m57851a(Context context) {
        LayoutInflater.from(context).inflate(R.layout.feature_row, this, true);
        ButterKnife.a(this);
        context = new TypedValue();
        getContext().getTheme().resolveAttribute(16843534, context, true);
        if (VERSION.SDK_INT >= 23) {
            setForeground(getContext().getDrawable(context.resourceId));
        }
        setPadding(0, 0, 0, this.mPadding);
        this.mFeatureCheck.setColorFilter(this.mRedColorFilter);
        setBackgroundColor(this.mWhite);
    }

    /* renamed from: a */
    public void m57854a(@NonNull String str, @Nullable String str2, @NonNull boolean z, @NonNull String str3, @NonNull String str4) {
        this.f47747a = str;
        this.f47750d = z;
        this.f47749c = str3;
        this.f47748b = str4;
        if (str != null && str.isEmpty() == null) {
            this.mFeatureTitle.setText(str);
        }
        str = 8;
        if (str2 != null) {
            if (str2.isEmpty() == null) {
                this.mFeatureDescription.setVisibility(0);
                this.mFeatureDescription.setText(str2);
                this.mFeatureCheck.setVisibility(8);
                str2 = this.mFeatureSwitch;
                if (z) {
                    str = null;
                }
                str2.setVisibility(str);
            }
        }
        this.mFeatureDescription.setVisibility(8);
        this.mFeatureTitle.setPadding(this.mPadding, 0, 0, this.mBottomPadding);
        this.mFeatureCheck.setVisibility(8);
        str2 = this.mFeatureSwitch;
        if (z) {
            str = null;
        }
        str2.setVisibility(str);
    }

    /* renamed from: a */
    public void m57852a() {
        if (this.f47750d) {
            this.mFeatureSwitch.setChecked(true);
        } else {
            this.mFeatureCheck.setVisibility(0);
        }
    }

    /* renamed from: b */
    public void m57855b() {
        if (this.f47750d) {
            this.mFeatureSwitch.setChecked(false);
        } else {
            this.mFeatureCheck.setVisibility(8);
        }
    }

    @NonNull
    public String getIncentiveName() {
        return this.f47748b;
    }

    public String getFeatureName() {
        return this.f47749c;
    }

    public SwitchCompat getFeatureSwitch() {
        return this.mFeatureSwitch;
    }

    /* renamed from: c */
    public boolean m57856c() {
        return this.mFeatureCheck.getVisibility() == 0;
    }

    public void setOnCheckChangeListener(@NonNull FeatureInteractionListener featureInteractionListener) {
        SwitchCompat featureSwitch = getFeatureSwitch();
        if (featureSwitch.getVisibility() != 8 && featureInteractionListener != null) {
            featureSwitch.setOnCheckedChangeListener(new C15461h(this, featureInteractionListener));
        }
    }

    /* renamed from: a */
    final /* synthetic */ void m57853a(@NonNull FeatureInteractionListener featureInteractionListener, CompoundButton compoundButton, boolean z) {
        featureInteractionListener.onFeatureSwitchChange(this, z);
    }

    public String getTitle() {
        return this.f47747a;
    }

    public void setItemClickable(boolean z) {
        if (this.f47750d) {
            this.mFeatureSwitch.setClickable(z);
        }
    }
}
