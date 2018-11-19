package com.tinder.intro;

import android.content.Context;
import android.support.v4.view.C0600i;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tinder.R;
import com.tinder.views.CustomTextView;

/* renamed from: com.tinder.intro.d */
public class C11874d extends C0600i {
    /* renamed from: a */
    private final LayoutInflater f38715a;

    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    C11874d(Context context) {
        this.f38715a = LayoutInflater.from(context);
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        View inflate = this.f38715a.inflate(R.layout.intro_v2_slide, viewGroup, false);
        m47845a(inflate, IntroSlide.values()[i]);
        viewGroup.addView(inflate);
        return inflate;
    }

    public int getCount() {
        return IntroSlide.values().length;
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    /* renamed from: a */
    private void m47845a(View view, IntroSlide introSlide) {
        ((CustomTextView) view.findViewById(R.id.intro_slide_title)).setText(introSlide.getTitleResId());
        ((ImageView) view.findViewById(R.id.intro_slide_image)).setImageResource(introSlide.getImageResId());
    }
}
