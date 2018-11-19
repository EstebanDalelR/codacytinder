package com.tinder.views;

import android.content.Context;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.tinder.R;
import com.tinder.views.FeatureRow.FeatureInteractionListener;

public class FeatureToggleView extends LinearLayout {
    /* renamed from: a */
    private boolean f47751a;
    /* renamed from: b */
    private FeatureInteractionListener f47752b;
    /* renamed from: c */
    private String f47753c;
    @BindView(2131362488)
    TextView mFeatureDescription;
    @BindView(2131362491)
    ImageView mFeatureIcon;
    @BindView(2131362495)
    TextView mFeatureTitle;
    @BindView(2131362573)
    FeatureRow mFirstFeature;
    @BindView(2131362490)
    View mHeaderContainer;
    @BindView(2131363530)
    FeatureRow mSecondFeature;

    public FeatureToggleView(Context context) {
        super(context);
        m57857a(context);
    }

    /* renamed from: a */
    private void m57857a(Context context) {
        LayoutInflater.from(context).inflate(R.layout.feature_toggle_view, this, true);
        ButterKnife.a(this);
        setOrientation(1);
    }

    /* renamed from: a */
    public void m57859a(@NonNull String str, @NonNull String str2, @DrawableRes int i, boolean z, @NonNull FeatureInteractionListener featureInteractionListener, @NonNull String str3) {
        this.f47752b = featureInteractionListener;
        this.f47751a = z;
        this.f47753c = str3;
        this.mFeatureTitle.setText(str);
        this.mFeatureDescription.setText(str2);
        this.mFeatureIcon.setImageResource(i);
        this.mFirstFeature.setVisibility(8);
        this.mSecondFeature.setVisibility(8);
    }

    /* renamed from: a */
    public void m57861a(@NonNull String str, @NonNull boolean z, @NonNull String str2, @NonNull boolean z2) {
        m57860a(str, null, z, str2, z2);
    }

    /* renamed from: a */
    public void m57860a(@NonNull String str, @Nullable String str2, @NonNull boolean z, @NonNull String str3, @NonNull boolean z2) {
        this.mFirstFeature.setVisibility(0);
        this.mFirstFeature.m57854a(str, str2, true, str3, this.f47753c);
        this.mFirstFeature.getFeatureSwitch().setOnCheckedChangeListener(null);
        if (this.f47751a == null) {
            this.mFirstFeature.setItemClickable(false);
            this.mFirstFeature.setOnClickListener(new C15462i(this));
            return;
        }
        if (z) {
            this.mFirstFeature.m57852a();
        } else {
            this.mFirstFeature.m57855b();
        }
        this.mFirstFeature.setItemClickable(z2);
        this.mFirstFeature.setOnCheckChangeListener(this.f47752b);
        this.mFirstFeature.setOnClickListener(new C15463j(this, z2));
    }

    /* renamed from: b */
    final /* synthetic */ void m57863b(View view) {
        if (this.f47752b != null) {
            this.f47752b.onFeatureRowClick(this.mFirstFeature);
        }
    }

    /* renamed from: b */
    final /* synthetic */ void m57865b(@NonNull boolean z, View view) {
        if (z) {
            this.mFirstFeature.getFeatureSwitch().toggle();
        }
    }

    /* renamed from: b */
    public void m57864b(@NonNull String str, @Nullable String str2, @NonNull boolean z, @NonNull String str3, @NonNull boolean z2) {
        this.mSecondFeature.setVisibility(0);
        this.mSecondFeature.m57854a(str, str2, true, str3, this.f47753c);
        this.mSecondFeature.getFeatureSwitch().setOnCheckedChangeListener(null);
        if (this.f47751a == null) {
            this.mSecondFeature.setItemClickable(false);
            this.mSecondFeature.setOnClickListener(new C15464k(this));
            return;
        }
        if (z) {
            this.mSecondFeature.m57852a();
        } else {
            this.mSecondFeature.m57855b();
        }
        this.mSecondFeature.setItemClickable(z2);
        this.mSecondFeature.setOnCheckChangeListener(this.f47752b);
        this.mSecondFeature.setOnClickListener(new C15465l(this, z2));
    }

    /* renamed from: a */
    final /* synthetic */ void m57858a(View view) {
        if (this.f47752b != null) {
            this.f47752b.onFeatureRowClick(this.mSecondFeature);
        }
    }

    /* renamed from: a */
    final /* synthetic */ void m57862a(@NonNull boolean z, View view) {
        if (z) {
            this.mSecondFeature.getFeatureSwitch().toggle();
        }
    }

    public FeatureInteractionListener getInteractionListener() {
        return this.f47752b;
    }
}
