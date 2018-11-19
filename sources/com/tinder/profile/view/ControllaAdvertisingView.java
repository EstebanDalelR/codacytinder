package com.tinder.profile.view;

import android.content.Context;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.tinder.C6250b.C6249b;
import com.tinder.R;

public class ControllaAdvertisingView extends LinearLayout {
    @BindView(2131362224)
    TextView descriptionView;
    @BindView(2131362225)
    TextView titleView;

    public ControllaAdvertisingView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        inflate(context, R.layout.view_controlla_advertising, this);
        ButterKnife.a(this);
        setOrientation(1);
        if (attributeSet != null) {
            context = context.getTheme().obtainStyledAttributes(attributeSet, C6249b.ControllaAdvertisingView, 0, 0);
            try {
                int resourceId = context.getResourceId(1, Integer.MIN_VALUE);
                if (resourceId != Integer.MIN_VALUE) {
                    setIcon(resourceId);
                }
                this.titleView.setText(context.getString(2));
                this.descriptionView.setText(context.getString(0));
            } finally {
                context.recycle();
            }
        }
    }

    public void setIcon(@DrawableRes int i) {
        this.titleView.setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
    }

    public void setTitle(@StringRes int i) {
        this.titleView.setText(i);
    }

    public void setDescription(String str) {
        this.descriptionView.setText(str);
    }
}
