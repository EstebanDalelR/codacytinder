package com.tinder.profile.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.tinder.R;

public class ProfileItemView extends LinearLayout {
    @BindView(2131363305)
    ImageView mCheckView;
    @BindView(2131363306)
    TextView mTextView;

    public ProfileItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        inflate(context, R.layout.merge_profile_item, this);
        ButterKnife.a(this);
    }

    public void setText(@NonNull CharSequence charSequence) {
        this.mTextView.setText(charSequence);
    }

    public void setCheckVisible(boolean z) {
        this.mCheckView.setVisibility(z ? false : true);
    }
}
