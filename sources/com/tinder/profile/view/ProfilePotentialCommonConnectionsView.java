package com.tinder.profile.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.tinder.R;
import com.tinder.views.CustomTextView;

public class ProfilePotentialCommonConnectionsView extends LinearLayout {
    @BindView(2131363289)
    CustomTextView numConnectionsTitle;

    public ProfilePotentialCommonConnectionsView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        inflate(context, R.layout.potential_common_connections_view, this);
        ButterKnife.a(this);
    }

    /* renamed from: a */
    public void m55181a(int i) {
        this.numConnectionsTitle.setText(getResources().getQuantityString(R.plurals.friends_for_common_connections_plural, i, new Object[]{Integer.valueOf(i)}));
    }
}
