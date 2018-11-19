package com.tinder.views;

import android.content.Context;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.tinder.R;
import com.tinder.views.FeatureRow.FeatureInteractionListener;
import java.util.ArrayList;
import java.util.List;

public class FeatureCheckedView extends LinearLayout {
    /* renamed from: a */
    private List<FeatureRow> f47743a;
    /* renamed from: b */
    private boolean f47744b;
    /* renamed from: c */
    private FeatureInteractionListener f47745c;
    /* renamed from: d */
    private String f47746d;
    @BindView(2131362488)
    TextView mFeatureDescription;
    @BindView(2131362491)
    ImageView mFeatureIcon;
    @BindView(2131362495)
    TextView mFeatureTitle;
    @BindView(2131362496)
    ViewGroup mFeaturesContainer;
    @BindView(2131362573)
    FeatureRow mFirstFeature;
    @BindView(2131363530)
    FeatureRow mSecondFeature;
    @BindView(2131363780)
    FeatureRow mThirdFeature;

    /* renamed from: com.tinder.views.FeatureCheckedView$a */
    private class C15430a implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ FeatureCheckedView f47742a;

        private C15430a(FeatureCheckedView featureCheckedView) {
            this.f47742a = featureCheckedView;
        }

        public void onClick(View view) {
            if (this.f47742a.mFeaturesContainer != null) {
                FeatureRow featureRow = (FeatureRow) view;
                FeatureRow featureRow2 = null;
                if (!featureRow.m57856c()) {
                    for (int i = 0; i < this.f47742a.mFeaturesContainer.getChildCount(); i++) {
                        FeatureRow featureRow3 = (FeatureRow) this.f47742a.mFeaturesContainer.getChildAt(i);
                        if (featureRow3.m57856c()) {
                            featureRow2 = featureRow3;
                        }
                        featureRow3.m57855b();
                    }
                    featureRow.m57852a();
                    if (this.f47742a.f47745c != null) {
                        this.f47742a.f47745c.onFeatureRowChecked(featureRow, featureRow2);
                    }
                }
            }
        }
    }

    public FeatureCheckedView(Context context) {
        super(context);
        m57845a(context);
    }

    /* renamed from: a */
    private void m57845a(Context context) {
        LayoutInflater.from(context).inflate(R.layout.feature_checked_view, this, true);
        ButterKnife.a(this);
        setOrientation(1);
        this.f47743a = new ArrayList();
    }

    /* renamed from: a */
    public void m57847a(@NonNull String str, @NonNull String str2, @DrawableRes int i, boolean z, @NonNull FeatureInteractionListener featureInteractionListener, @NonNull String str3) {
        this.f47744b = z;
        this.f47745c = featureInteractionListener;
        this.f47746d = str3;
        this.mFeatureTitle.setText(str);
        this.mFeatureDescription.setText(str2);
        this.mFeatureIcon.setImageResource(i);
        this.mFirstFeature.setVisibility(8);
        this.mSecondFeature.setVisibility(8);
        this.mThirdFeature.setVisibility(8);
    }

    /* renamed from: a */
    public void m57848a(@NonNull String str, @Nullable String str2, @NonNull String str3) {
        this.mFirstFeature.setVisibility(0);
        this.mFirstFeature.m57854a(str, str2, false, str3, this.f47746d);
        this.f47743a.add(this.mFirstFeature);
        if (this.f47744b == null) {
            this.mFirstFeature.setOnClickListener(new C15444f(this));
        } else {
            this.mFirstFeature.setOnClickListener(new C15430a());
        }
        this.mFirstFeature.m57852a();
    }

    /* renamed from: b */
    final /* synthetic */ void m57849b(View view) {
        if (this.f47745c != null) {
            this.f47745c.onFeatureRowClick((FeatureRow) view);
        }
    }

    /* renamed from: b */
    public void m57850b(@NonNull String str, @Nullable String str2, @NonNull String str3) {
        this.mSecondFeature.setVisibility(0);
        this.mSecondFeature.m57854a(str, str2, false, str3, this.f47746d);
        this.f47743a.add(this.mSecondFeature);
        if (this.f47744b == null) {
            this.mSecondFeature.setOnClickListener(new C15445g(this));
        } else {
            this.mSecondFeature.setOnClickListener(new C15430a());
        }
    }

    /* renamed from: a */
    final /* synthetic */ void m57846a(View view) {
        if (this.f47745c != null) {
            this.f47745c.onFeatureRowClick((FeatureRow) view);
        }
    }

    public void setFeatureChecked(String str) {
        for (FeatureRow featureRow : this.f47743a) {
            if (featureRow.getFeatureName().equals(str)) {
                featureRow.m57852a();
            } else {
                featureRow.m57855b();
            }
        }
    }
}
