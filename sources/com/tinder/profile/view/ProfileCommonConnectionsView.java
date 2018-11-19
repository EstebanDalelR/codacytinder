package com.tinder.profile.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.tinder.R;
import com.tinder.adapters.C7290c;
import com.tinder.model.CommonConnection;
import com.tinder.views.CustomTextView;
import com.viewpagerindicator.CirclePageIndicator;
import java.util.List;

public class ProfileCommonConnectionsView extends LinearLayout {
    @NonNull
    /* renamed from: a */
    private C7290c f45770a;
    @BindView(2131363288)
    CirclePageIndicator profileConnectionsCirclePageIndicator;
    @BindView(2131363289)
    CustomTextView profileConnectionsTitleText;
    @BindView(2131363290)
    ViewPager profileConnectionsViewpager;

    public ProfileCommonConnectionsView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        inflate(context, R.layout.common_connections_view, this);
        ButterKnife.a(this);
        this.f45770a = new C7290c(context);
        this.f45770a.a(600);
        this.profileConnectionsViewpager.setAdapter(this.f45770a);
        this.profileConnectionsViewpager.setPageMargin(getResources().getDimensionPixelSize(R.dimen.padding_large));
        this.profileConnectionsCirclePageIndicator.setViewPager(this.profileConnectionsViewpager);
    }

    /* renamed from: a */
    public void m55151a(@NonNull List<CommonConnection> list) {
        int size = list.size();
        this.profileConnectionsTitleText.setText(getResources().getQuantityString(R.plurals.common_connections_plural, size, new Object[]{Integer.valueOf(size)}));
        this.f45770a.a(list);
        this.f45770a.notifyDataSetChanged();
        if (this.f45770a.getCount() <= 1) {
            this.profileConnectionsCirclePageIndicator.setVisibility(8);
        } else {
            this.profileConnectionsCirclePageIndicator.setVisibility(0);
        }
        this.profileConnectionsViewpager.setLayoutParams(new LayoutParams(-1, this.f45770a.a()));
    }
}
