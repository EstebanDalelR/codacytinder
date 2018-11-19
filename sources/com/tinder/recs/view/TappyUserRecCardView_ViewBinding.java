package com.tinder.recs.view;

import android.support.annotation.UiThread;
import android.view.View;
import butterknife.internal.C0759a;
import butterknife.internal.C0761c;
import com.tinder.R;
import com.tinder.recs.view.tappablecards.TappyTutorialView;
import com.tinder.recs.view.tappy.TappyCarouselView;

public class TappyUserRecCardView_ViewBinding extends BaseUserRecCardView_ViewBinding {
    private TappyUserRecCardView target;
    private View view2131363412;

    @UiThread
    public TappyUserRecCardView_ViewBinding(TappyUserRecCardView tappyUserRecCardView) {
        this(tappyUserRecCardView, tappyUserRecCardView);
    }

    @UiThread
    public TappyUserRecCardView_ViewBinding(final TappyUserRecCardView tappyUserRecCardView, View view) {
        super(tappyUserRecCardView, view);
        this.target = tappyUserRecCardView;
        tappyUserRecCardView.tappyCarouselView = (TappyCarouselView) C0761c.b(view, R.id.recs_card_tappy_carousel, "field 'tappyCarouselView'", TappyCarouselView.class);
        tappyUserRecCardView.tappyTutorialView = (TappyTutorialView) C0761c.b(view, R.id.tappy_tutorial_view, "field 'tappyTutorialView'", TappyTutorialView.class);
        view = C0761c.a(view, R.id.recs_card_user_content_container, "method 'onUserContentClick'");
        this.view2131363412 = view;
        view.setOnClickListener(new C0759a() {
            public void doClick(View view) {
                tappyUserRecCardView.onUserContentClick();
            }
        });
    }

    public void unbind() {
        TappyUserRecCardView tappyUserRecCardView = this.target;
        if (tappyUserRecCardView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.target = null;
        tappyUserRecCardView.tappyCarouselView = null;
        tappyUserRecCardView.tappyTutorialView = null;
        this.view2131363412.setOnClickListener(null);
        this.view2131363412 = null;
        super.unbind();
    }
}
