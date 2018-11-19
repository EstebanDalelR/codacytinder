package com.tinder.profile.view;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.C2887d;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.tinder.R;
import com.tinder.api.ManagerWebServices;
import com.tinder.domain.common.model.Instagram;
import com.tinder.profile.adapters.InstagramPhotoGridAdapter;
import com.tinder.profile.adapters.InstagramPhotoGridAdapter.ListenerPhotoClick;
import com.tinder.profile.dialogs.InstagramPhotoViewerDialog;
import com.tinder.profile.dialogs.InstagramPhotoViewerDialog.C14400a;
import com.tinder.profile.dialogs.InstagramPhotoViewerDialog.ListenerPhotoViewer;
import com.tinder.profile.model.Profile;
import com.tinder.profile.model.Profile.Source;
import com.tinder.profile.module.ProfileComponentProvider;
import com.tinder.profile.p362a.C14358a;
import com.tinder.profile.p365d.C14398a;
import com.tinder.utils.C15377z;
import com.tinder.utils.at;
import com.tinder.utils.av;
import com.tinder.views.CustomTextView;
import com.viewpagerindicator.CirclePageIndicator;
import javax.inject.Inject;

public class ProfileInstagramView extends LinearLayout {
    @Inject
    /* renamed from: a */
    C14358a f45774a;
    @Inject
    /* renamed from: b */
    C14446a f45775b;
    @NonNull
    /* renamed from: c */
    private InstagramPhotoGridAdapter f45776c;
    @BindView(2131362745)
    CirclePageIndicator circlePageIndicator;
    @NonNull
    /* renamed from: d */
    private Instagram f45777d;
    @NonNull
    /* renamed from: e */
    private Profile f45778e;
    @NonNull
    /* renamed from: f */
    private Source f45779f;
    /* renamed from: g */
    private int f45780g;
    /* renamed from: h */
    private int f45781h;
    /* renamed from: i */
    private InstagramPhotoViewerDialog f45782i;
    @BindView(2131363302)
    CustomTextView instagramPhotoCountView;
    @BindView(2131362751)
    ViewPager instagramViewPager;
    /* renamed from: j */
    private final C2887d f45783j = new C177711(this);
    /* renamed from: k */
    private final ListenerPhotoClick f45784k = new C161492(this);
    /* renamed from: l */
    private final ListenerPhotoViewer f45785l = new C161503(this);

    /* renamed from: com.tinder.profile.view.ProfileInstagramView$a */
    static class C14446a {
        /* renamed from: a */
        private final C15377z f45773a;

        @Inject
        C14446a(C15377z c15377z) {
            this.f45773a = c15377z;
        }

        @Nullable
        /* renamed from: a */
        public Intent m55156a(String str) {
            Intent b = m55154b(str);
            return this.f45773a.m57711a(b) ? b : m55155c(str);
        }

        /* renamed from: b */
        private Intent m55154b(String str) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(ManagerWebServices.IG_INTENT_URL);
            stringBuilder.append(str);
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(stringBuilder.toString()));
            intent.setFlags(268435456);
            intent.setPackage("com.instagram.android");
            return intent;
        }

        /* renamed from: c */
        private Intent m55155c(String str) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(ManagerWebServices.IG_WEB_URL);
            stringBuilder.append(str);
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(stringBuilder.toString()));
            intent.setFlags(268435456);
            return intent;
        }
    }

    /* renamed from: com.tinder.profile.view.ProfileInstagramView$2 */
    class C161492 implements ListenerPhotoClick {
        /* renamed from: a */
        final /* synthetic */ ProfileInstagramView f50266a;

        C161492(ProfileInstagramView profileInstagramView) {
            this.f50266a = profileInstagramView;
        }

        public void onPhotoClick(int i, View view, int i2) {
            this.f50266a.f45774a.m54711a(this.f50266a.f45778e, Integer.valueOf(i));
            this.f50266a.f45782i = new InstagramPhotoViewerDialog(this.f50266a.getContext(), Integer.valueOf(i), Integer.valueOf(i2), this.f50266a.m55159a(view), this.f50266a.f45778e, this.f50266a.f45785l);
            this.f50266a.f45782i.show();
        }

        public void onViewMoreClick() {
            this.f50266a.f45774a.m54709a(this.f50266a.f45778e, 1);
            Intent a = this.f50266a.f45775b.m55156a(this.f50266a.f45777d.username());
            if (a == null) {
                at.m57641a(this.f50266a, (int) R.string.instagram_app_and_browser_unavailable_snackbar_message);
            } else {
                this.f50266a.m55164a(a);
            }
        }
    }

    /* renamed from: com.tinder.profile.view.ProfileInstagramView$3 */
    class C161503 implements ListenerPhotoViewer {
        /* renamed from: a */
        final /* synthetic */ ProfileInstagramView f50267a;

        C161503(ProfileInstagramView profileInstagramView) {
            this.f50267a = profileInstagramView;
        }

        public void onPhotoIndex(int i) {
            this.f50267a.f45780g = i;
            this.f50267a.setInstagramPageByListIndex(this.f50267a.f45780g);
        }

        public void onUserClick() {
            this.f50267a.f45774a.m54709a(this.f50267a.f45778e, 2);
            Intent a = this.f50267a.f45775b.m55156a(this.f50267a.f45777d.username());
            if (a == null) {
                this.f50267a.f45782i.m60917a();
            } else {
                this.f50267a.m55164a(a);
            }
        }
    }

    /* renamed from: com.tinder.profile.view.ProfileInstagramView$1 */
    class C177711 extends C2887d {
        /* renamed from: a */
        final /* synthetic */ ProfileInstagramView f55453a;

        C177711(ProfileInstagramView profileInstagramView) {
            this.f55453a = profileInstagramView;
        }

        public void onPageSelected(int i) {
            if (this.f55453a.f45781h != i) {
                this.f55453a.f45781h = this.f55453a.instagramViewPager.getCurrentItem();
                boolean z = true;
                int i2 = this.f55453a.f45781h > i ? 2 : 1;
                if (i + 1 != this.f55453a.f45776c.getCount()) {
                    z = false;
                }
                this.f55453a.f45774a.m54710a(this.f55453a.f45778e, i2, i, z);
            }
        }
    }

    public ProfileInstagramView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        inflate(context, R.layout.instagram_view, this);
        ButterKnife.a(this);
        if (isInEditMode() == null) {
            ((ProfileComponentProvider) C14398a.m54830a(context)).provideComponent().inject(this);
        }
        this.f45776c = new InstagramPhotoGridAdapter(getContext(), this.f45784k);
        this.instagramViewPager.setAdapter(this.f45776c);
        this.circlePageIndicator.setViewPager(this.instagramViewPager);
        this.circlePageIndicator.setOnPageChangeListener(this.f45783j);
    }

    /* renamed from: a */
    public void m55174a(@NonNull Profile profile) {
        this.f45778e = profile;
        this.f45777d = profile.mo11673w();
        this.f45779f = profile.mo11660j();
        this.f45776c.m60839a(this.f45777d.photos());
        m55163a(this.f45777d.mediaCount());
        m55162a();
        if (this.f45776c.getCount() <= 1) {
            this.circlePageIndicator.setVisibility(8);
        } else {
            this.circlePageIndicator.setVisibility(0);
        }
    }

    /* renamed from: a */
    private void m55163a(int i) {
        this.instagramPhotoCountView.setText(String.format(getResources().getQuantityString(R.plurals.instagram_photos_plural, i), new Object[]{Integer.valueOf(i)}));
    }

    /* renamed from: a */
    private void m55162a() {
        int a = this.f45776c.m60835a();
        if (a != 0) {
            LayoutParams layoutParams = this.instagramViewPager.getLayoutParams();
            layoutParams.height = a;
            this.instagramViewPager.setLayoutParams(layoutParams);
        }
    }

    @NonNull
    /* renamed from: a */
    private C14400a m55159a(@NonNull View view) {
        C14400a c14400a = new C14400a();
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        Integer valueOf = Integer.valueOf(rect.left);
        int b = this.f45778e.mo11660j() == Source.REC ? rect.top + av.b(getContext()) : rect.top;
        Integer valueOf2 = Integer.valueOf(this.f45776c.m60840b());
        Integer valueOf3 = Integer.valueOf(this.f45776c.m60841c());
        Integer valueOf4 = Integer.valueOf(this.f45776c.m60842d());
        c14400a.m54835a((float) view.getWidth());
        c14400a.m54838b((float) view.getHeight());
        c14400a.m54841c((float) valueOf.intValue());
        c14400a.m54843d((float) b);
        c14400a.m54845e((float) av.b(getContext()));
        c14400a.m54836a(valueOf2.intValue());
        c14400a.m54839b(valueOf3.intValue());
        c14400a.m54847f((float) valueOf4.intValue());
        return c14400a;
    }

    private void setInstagramPageByListIndex(int i) {
        if (this.f45777d.photos() != null && !this.f45777d.photos().isEmpty()) {
            this.instagramViewPager.setCurrentItem(this.f45776c.m60836a(i));
        }
    }

    /* renamed from: a */
    private void m55164a(Intent intent) {
        getContext().startActivity(intent);
    }
}
