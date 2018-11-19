package com.tinder.profile.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.C0600i;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.C2887d;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bumptech.glide.load.resource.bitmap.C3082c;
import com.tinder.R;
import com.tinder.base.view.ProgressImageView;
import com.tinder.base.view.listener.OnPhotoPageChangeListener;
import com.tinder.profile.view.BasicInfoView.OnExitClickListener;
import com.tinder.profile.view.BasicInfoView.OnScrollStateChangeListener;
import com.tinder.recs.view.PagedPhotoViewer;
import com.tinder.recs.view.PagedPhotoViewer.PagedPhotoViewerModel;
import com.tinder.recs.view.PagedPhotoViewer.PhotoDecorator;
import com.viewpagerindicator.PageIndicator;
import java.util.Collections;
import java.util.List;

public abstract class ProfilePhotosView extends FrameLayout implements PagedPhotoViewer {
    @Nullable
    /* renamed from: a */
    private OnExitClickListener f50275a;
    @Nullable
    /* renamed from: b */
    private OnPhotoPageChangeListener f50276b;
    @Nullable
    /* renamed from: c */
    private OnScrollStateChangeListener f50277c;
    /* renamed from: d */
    private final C16152a f50278d;
    /* renamed from: e */
    private final OnPageChangeListener f50279e;
    /* renamed from: f */
    private final C14447a f50280f;

    /* renamed from: com.tinder.profile.view.ProfilePhotosView$2 */
    class C161512 implements C14447a {
        /* renamed from: a */
        final /* synthetic */ ProfilePhotosView f50271a;

        C161512(ProfilePhotosView profilePhotosView) {
            this.f50271a = profilePhotosView;
        }

        /* renamed from: a */
        public void mo11760a(C0600i c0600i, View view, int i) {
            if (this.f50271a.f50275a != null) {
                this.f50271a.f50275a.onExitViewClick();
            }
        }
    }

    /* renamed from: com.tinder.profile.view.ProfilePhotosView$a */
    private static class C16152a extends C0600i {
        /* renamed from: a */
        private List<String> f50272a;
        /* renamed from: b */
        private C14447a f50273b;
        /* renamed from: c */
        private C3082c f50274c;

        /* renamed from: com.tinder.profile.view.ProfilePhotosView$a$a */
        interface C14447a {
            /* renamed from: a */
            void mo11760a(C0600i c0600i, View view, int i);
        }

        public int getItemPosition(@Nullable Object obj) {
            return -1;
        }

        public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
            return view == obj;
        }

        private C16152a() {
            this.f50272a = Collections.emptyList();
        }

        public int getCount() {
            return this.f50272a.size();
        }

        public Object instantiateItem(@NonNull ViewGroup viewGroup, int i) {
            String str = (String) this.f50272a.get(i);
            ProgressImageView progressImageView = (ProgressImageView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.view_user_profile_page, viewGroup, false);
            viewGroup.addView(progressImageView);
            if (this.f50274c != null) {
                progressImageView.a(str, this.f50274c);
            } else {
                progressImageView.setImage(str);
            }
            if (this.f50273b != null) {
                progressImageView.setOnClickListener(new C14454r(this, progressImageView, i));
                progressImageView.setClickable(true);
            }
            return progressImageView;
        }

        /* renamed from: a */
        final /* synthetic */ void m61024a(ProgressImageView progressImageView, int i, View view) {
            this.f50273b.mo11760a(this, progressImageView, i);
        }

        public void destroyItem(@NonNull ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
            ProgressImageView progressImageView = (ProgressImageView) ((ViewGroup) obj).findViewById(R.id.profile_page_image);
            if (progressImageView != null) {
                progressImageView.setOnClickListener(0);
                progressImageView.c();
            }
        }

        /* renamed from: a */
        void m61025a(C14447a c14447a) {
            this.f50273b = c14447a;
        }

        @Nullable
        /* renamed from: a */
        String m61022a(int i) {
            return (i < 0 || i >= this.f50272a.size()) ? 0 : (String) this.f50272a.get(i);
        }

        /* renamed from: a */
        void m61026a(List<String> list) {
            this.f50272a = list;
            notifyDataSetChanged();
        }

        /* renamed from: a */
        void m61023a(C3082c c3082c) {
            this.f50274c = c3082c;
        }
    }

    /* renamed from: com.tinder.profile.view.ProfilePhotosView$1 */
    class C177721 extends C2887d {
        /* renamed from: a */
        final /* synthetic */ ProfilePhotosView f55454a;

        C177721(ProfilePhotosView profilePhotosView) {
            this.f55454a = profilePhotosView;
        }

        public void onPageSelected(int i) {
            this.f55454a.getChildAt(i);
            if (this.f55454a.f50276b != null) {
                this.f55454a.f50276b.onPhotoPageChange(this.f55454a.f50278d.m61022a(i), i, this.f55454a.f50278d.getCount());
            }
        }

        public void onPageScrollStateChanged(int i) {
            if (i == 0 && this.f55454a.f50277c != null) {
                this.f55454a.f50277c.onScrollStateChanged(false);
            }
            if (i == 1 && this.f55454a.f50277c != 0) {
                this.f55454a.f50277c.onScrollStateChanged(true);
            }
        }
    }

    /* renamed from: a */
    protected abstract boolean mo13484a();

    /* renamed from: b */
    protected abstract boolean mo13485b();

    protected abstract PageIndicator getPageIndicator();

    protected abstract ViewPager getViewPager();

    public ProfilePhotosView(@NonNull Context context) {
        this(context, null);
    }

    public ProfilePhotosView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f50278d = new C16152a();
        this.f50279e = new C177721(this);
        this.f50280f = new C161512(this);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        getViewPager().setOffscreenPageLimit(5);
        getViewPager().setAdapter(this.f50278d);
        if (!mo13484a()) {
            this.f50278d.m61025a(this.f50280f);
        }
    }

    protected void onMeasure(int i, int i2) {
        i = MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(i), 1073741824);
        super.onMeasure(i, i);
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewPager().addOnPageChangeListener(this.f50279e);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewPager().removeOnPageChangeListener(this.f50279e);
    }

    public void bind(PagedPhotoViewerModel pagedPhotoViewerModel) {
        PhotoDecorator photoDecorator = pagedPhotoViewerModel.getPhotoDecorator();
        if (photoDecorator != null) {
            this.f50278d.m61023a(photoDecorator.transformer(getContext()));
        }
        this.f50278d.m61026a(pagedPhotoViewerModel.getPhotoUrls());
        PageIndicator pageIndicator = getPageIndicator();
        if (m61028a(pagedPhotoViewerModel.getPhotoUrls().size())) {
            pageIndicator.setViewPager(getViewPager(), pagedPhotoViewerModel.getCurrentIndex());
            ((View) pageIndicator).setVisibility(null);
            return;
        }
        ((View) pageIndicator).setVisibility(8);
    }

    public void showPhotoAtIndex(int i) {
        getViewPager().setCurrentItem(i);
    }

    /* renamed from: a */
    private boolean m61028a(int i) {
        boolean z = true;
        if (i == 1) {
            return mo13485b();
        }
        if (i <= 1) {
            z = false;
        }
        return z;
    }

    public void setOnExitClickListener(OnExitClickListener onExitClickListener) {
        this.f50275a = onExitClickListener;
    }

    public void setOnPhotoPageChangeListener(OnPhotoPageChangeListener onPhotoPageChangeListener) {
        this.f50276b = onPhotoPageChangeListener;
    }

    public void setOnScrollStateChangeListener(OnScrollStateChangeListener onScrollStateChangeListener) {
        this.f50277c = onScrollStateChangeListener;
    }
}
