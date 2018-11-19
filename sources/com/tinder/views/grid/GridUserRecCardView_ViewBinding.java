package com.tinder.views.grid;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;
import com.tinder.view.grid.ParallaxFrameLayout;

public class GridUserRecCardView_ViewBinding implements Unbinder {
    /* renamed from: b */
    private GridUserRecCardView f52913b;

    @UiThread
    public GridUserRecCardView_ViewBinding(GridUserRecCardView gridUserRecCardView, View view) {
        this.f52913b = gridUserRecCardView;
        gridUserRecCardView.bottomGradientView = (ImageView) C0761c.b(view, R.id.recs_card_user_bottom_gradient, "field 'bottomGradientView'", ImageView.class);
        gridUserRecCardView.parallaxFrameLayout = (ParallaxFrameLayout) C0761c.b(view, R.id.recs_card_user_parallax_container, "field 'parallaxFrameLayout'", ParallaxFrameLayout.class);
        gridUserRecCardView.imageView = (ImageView) C0761c.b(view, R.id.recs_card_user_image, "field 'imageView'", ImageView.class);
        gridUserRecCardView.userInfoViewContainer = (ViewGroup) C0761c.b(view, R.id.recs_card_info_container, "field 'userInfoViewContainer'", ViewGroup.class);
    }

    @CallSuper
    public void unbind() {
        GridUserRecCardView gridUserRecCardView = this.f52913b;
        if (gridUserRecCardView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f52913b = null;
        gridUserRecCardView.bottomGradientView = null;
        gridUserRecCardView.parallaxFrameLayout = null;
        gridUserRecCardView.imageView = null;
        gridUserRecCardView.userInfoViewContainer = null;
    }
}
