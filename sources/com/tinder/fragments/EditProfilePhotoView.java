package com.tinder.fragments;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.graphics.drawable.C0452d;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.LinearInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindColor;
import butterknife.BindDimen;
import butterknife.BindDrawable;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bumptech.glide.C0994i;
import com.bumptech.glide.request.target.C4455b;
import com.tinder.R;
import com.tinder.api.ManagerWebServices;
import com.tinder.dialogs.DialogError;
import com.tinder.enums.UserPhotoSize;
import com.tinder.listeners.ListenerPhoto;
import com.tinder.managers.ManagerAnalytics;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.ManagerProfile;
import com.tinder.managers.bt;
import com.tinder.model.ProcessedPhoto;
import com.tinder.model.ProfilePhoto;
import com.tinder.model.SparksEvent;
import com.tinder.model.User;
import com.tinder.photooptimizer.C13558c;
import com.tinder.photooptimizer.PhotoOptimizerTarget;
import com.tinder.profile.p365d.C14398a;
import com.tinder.utils.ad;
import com.tinder.utils.at;
import com.tinder.utils.av;
import com.tinder.views.CustomSwitch;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;

@Deprecated
public class EditProfilePhotoView extends FrameLayout implements OnClickListener, OnCheckedChangeListener, ListenerPhoto, PhotoOptimizerTarget {
    /* renamed from: A */
    private float f38587A;
    /* renamed from: B */
    private int f38588B;
    /* renamed from: C */
    private int f38589C;
    @Nullable
    /* renamed from: D */
    private String f38590D;
    @BindColor(2131100308)
    int RESOURCE_GRAY;
    @BindColor(2131100240)
    int RESOURCE_RED;
    @Inject
    /* renamed from: a */
    bt f38591a;
    @Inject
    /* renamed from: b */
    ManagerProfile f38592b;
    @Inject
    /* renamed from: c */
    ManagerAnalytics f38593c;
    @Inject
    /* renamed from: d */
    C13558c f38594d;
    /* renamed from: e */
    public int f38595e = null;
    /* renamed from: f */
    public ProfilePhoto[] f38596f;
    @Nullable
    /* renamed from: g */
    public MenuItem f38597g;
    @Nullable
    /* renamed from: h */
    public MenuItem f38598h;
    /* renamed from: i */
    public int f38599i;
    /* renamed from: j */
    public FragmentEditProfile f38600j;
    /* renamed from: k */
    private ProcessedPhoto[] f38601k;
    /* renamed from: l */
    private int f38602l;
    /* renamed from: m */
    private List<ImageView> f38603m;
    @BindView(2131361928)
    View mBestPhotoBanner;
    @BindView(2131363294)
    ImageView mCellActionButton1;
    @BindView(2131363295)
    ImageView mCellActionButton2;
    @BindView(2131363296)
    ImageView mCellActionButton3;
    @BindView(2131363297)
    ImageView mCellActionButton4;
    @BindView(2131363298)
    ImageView mCellActionButton5;
    @BindView(2131363299)
    ImageView mCellActionButton6;
    @BindView(2131363164)
    TextView mCellCount1;
    @BindView(2131363165)
    TextView mCellCount2;
    @BindView(2131363166)
    TextView mCellCount3;
    @BindView(2131363167)
    TextView mCellCount4;
    @BindView(2131363168)
    TextView mCellCount5;
    @BindView(2131363169)
    TextView mCellCount6;
    @BindView(2131362202)
    RelativeLayout mContainerMainPhoto;
    @BindView(2131362208)
    RelativeLayout mContainerPhoto2;
    @BindView(2131362207)
    RelativeLayout mContainerPhoto3;
    @BindView(2131362205)
    RelativeLayout mContainerPhoto4;
    @BindView(2131362204)
    RelativeLayout mContainerPhoto5;
    @BindView(2131362206)
    RelativeLayout mContainerPhoto6;
    @BindDrawable(2131231775)
    Drawable mDrawableAddPhoto;
    @BindDrawable(2131231779)
    Drawable mDrawableRemovePhoto;
    @BindView(2131362692)
    ImageView mImageView2;
    @BindView(2131362693)
    ImageView mImageView3;
    @BindView(2131362694)
    ImageView mImageView4;
    @BindView(2131362695)
    ImageView mImageView5;
    @BindView(2131362696)
    ImageView mImageView6;
    @BindView(2131362697)
    ImageView mImageViewMain;
    @BindView(2131362701)
    ImageView mImageViewSelectorOverlay2;
    @BindView(2131362702)
    ImageView mImageViewSelectorOverlay3;
    @BindView(2131362703)
    ImageView mImageViewSelectorOverlay4;
    @BindView(2131362704)
    ImageView mImageViewSelectorOverlay5;
    @BindView(2131362705)
    ImageView mImageViewSelectorOverlay6;
    @BindView(2131362706)
    ImageView mImageViewSelectorOverlayMain;
    @BindView(2131362589)
    RelativeLayout mLayoutIsPhotoProcessing;
    @BindView(2131363080)
    View mOptimizePhotosContainer;
    @BindView(2131363081)
    CustomSwitch mOptimizePhotosSwitch;
    @BindView(2131363079)
    TextView mOptimizeToggleLabel;
    @BindView(2131363082)
    TextView mOptimizedOrderLabel1;
    @BindView(2131363083)
    TextView mOptimizedOrderLabel2;
    @BindView(2131363084)
    TextView mOptimizedOrderLabel3;
    @BindView(2131363085)
    TextView mOptimizedOrderLabel4;
    @BindView(2131363086)
    TextView mOptimizedOrderLabel5;
    @BindView(2131363087)
    TextView mOptimizedOrderLabel6;
    @BindView(2131363088)
    ImageView mOptimizedPhoto1;
    @BindView(2131363089)
    ImageView mOptimizedPhoto2;
    @BindView(2131363090)
    ImageView mOptimizedPhoto3;
    @BindView(2131363091)
    ImageView mOptimizedPhoto4;
    @BindView(2131363092)
    ImageView mOptimizedPhoto5;
    @BindView(2131363093)
    ImageView mOptimizedPhoto6;
    @BindDimen(2131165836)
    float mPhotoCornerRadius;
    @BindDimen(2131165837)
    int mPhotoMargins;
    @BindView(2131363189)
    RelativeLayout mPhotosContainer;
    @BindDimen(2131165838)
    int mPhotosSidePadding;
    @BindView(2131363339)
    ProgressBar mProgressSpinner1;
    @BindView(2131363340)
    ProgressBar mProgressSpinner2;
    @BindView(2131363341)
    ProgressBar mProgressSpinner3;
    @BindView(2131363342)
    ProgressBar mProgressSpinner4;
    @BindView(2131363343)
    ProgressBar mProgressSpinner5;
    @BindView(2131363344)
    ProgressBar mProgressSpinner6;
    /* renamed from: n */
    private int f38604n;
    @NonNull
    /* renamed from: o */
    private boolean[] f38605o = new boolean[6];
    /* renamed from: p */
    private List<ImageView> f38606p;
    /* renamed from: q */
    private int f38607q;
    /* renamed from: r */
    private int f38608r;
    /* renamed from: s */
    private List<ProgressBar> f38609s;
    /* renamed from: t */
    private List<ImageView> f38610t;
    /* renamed from: u */
    private List<ImageView> f38611u;
    /* renamed from: v */
    private List<ViewGroup> f38612v;
    /* renamed from: w */
    private List<TextView> f38613w;
    /* renamed from: x */
    private int f38614x;
    @Nullable
    /* renamed from: y */
    private User f38615y;
    /* renamed from: z */
    private float f38616z;

    static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new C96241();
        int lastTappedActionButtonIndex;
        int photoAddPosition;

        /* renamed from: com.tinder.fragments.EditProfilePhotoView$SavedState$1 */
        static class C96241 implements Creator<SavedState> {
            C96241() {
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m40030a(parcel);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return m40031a(i);
            }

            /* renamed from: a */
            public SavedState m40030a(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: a */
            public SavedState[] m40031a(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.photoAddPosition = parcel.readInt();
            this.lastTappedActionButtonIndex = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.photoAddPosition);
            parcel.writeInt(this.lastTappedActionButtonIndex);
        }
    }

    public void onSetPhotoOrderFailure() {
    }

    public void onSetPhotoOrderSuccess() {
    }

    public EditProfilePhotoView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        View.inflate(context, R.layout.view_edit_profile_photos, this);
        ButterKnife.a(this);
        ManagerApp.e().inject(this);
    }

    /* renamed from: a */
    public void m47769a() {
        m47766l();
        m47767m();
        this.mOptimizePhotosSwitch.setOnCheckedChangeListener(this);
        this.mCellCount1.setText(String.format("%d", new Object[]{Integer.valueOf(1)}));
        this.mCellCount2.setText(String.format("%d", new Object[]{Integer.valueOf(2)}));
        this.mCellCount3.setText(String.format("%d", new Object[]{Integer.valueOf(3)}));
        this.mCellCount4.setText(String.format("%d", new Object[]{Integer.valueOf(4)}));
        this.mCellCount5.setText(String.format("%d", new Object[]{Integer.valueOf(5)}));
        this.mCellCount6.setText(String.format("%d", new Object[]{Integer.valueOf(6)}));
        this.mImageViewMain.setOnClickListener(this);
        this.mImageView2.setOnClickListener(this);
        this.mImageView3.setOnClickListener(this);
        this.mImageView4.setOnClickListener(this);
        this.mImageView5.setOnClickListener(this);
        this.mImageView6.setOnClickListener(this);
        this.mImageViewSelectorOverlayMain.setOnClickListener(this);
        this.mImageViewSelectorOverlay2.setOnClickListener(this);
        this.mImageViewSelectorOverlay3.setOnClickListener(this);
        this.mImageViewSelectorOverlay4.setOnClickListener(this);
        this.mImageViewSelectorOverlay5.setOnClickListener(this);
        this.mImageViewSelectorOverlay6.setOnClickListener(this);
        OnClickListener c9631a = new C9631a(this);
        this.mCellActionButton1.setOnClickListener(c9631a);
        this.mCellActionButton2.setOnClickListener(c9631a);
        this.mCellActionButton3.setOnClickListener(c9631a);
        this.mCellActionButton4.setOnClickListener(c9631a);
        this.mCellActionButton5.setOnClickListener(c9631a);
        this.mCellActionButton6.setOnClickListener(c9631a);
        this.f38603m = new ArrayList(6);
        this.f38603m.add(this.mImageViewMain);
        this.f38603m.add(this.mImageView2);
        this.f38603m.add(this.mImageView3);
        this.f38603m.add(this.mImageView4);
        this.f38603m.add(this.mImageView5);
        this.f38603m.add(this.mImageView6);
        this.f38611u = new ArrayList(6);
        this.f38611u.add(this.mOptimizedPhoto1);
        this.f38611u.add(this.mOptimizedPhoto2);
        this.f38611u.add(this.mOptimizedPhoto3);
        this.f38611u.add(this.mOptimizedPhoto4);
        this.f38611u.add(this.mOptimizedPhoto5);
        this.f38611u.add(this.mOptimizedPhoto6);
        this.f38613w = new ArrayList(6);
        this.f38613w.add(this.mOptimizedOrderLabel1);
        this.f38613w.add(this.mOptimizedOrderLabel2);
        this.f38613w.add(this.mOptimizedOrderLabel3);
        this.f38613w.add(this.mOptimizedOrderLabel4);
        this.f38613w.add(this.mOptimizedOrderLabel5);
        this.f38613w.add(this.mOptimizedOrderLabel6);
        this.f38610t = new ArrayList(6);
        this.f38610t.add(this.mCellActionButton1);
        this.f38610t.add(this.mCellActionButton2);
        this.f38610t.add(this.mCellActionButton3);
        this.f38610t.add(this.mCellActionButton4);
        this.f38610t.add(this.mCellActionButton5);
        this.f38610t.add(this.mCellActionButton6);
        this.f38609s = new ArrayList(6);
        this.f38609s.add(this.mProgressSpinner1);
        this.f38609s.add(this.mProgressSpinner2);
        this.f38609s.add(this.mProgressSpinner3);
        this.f38609s.add(this.mProgressSpinner4);
        this.f38609s.add(this.mProgressSpinner5);
        this.f38609s.add(this.mProgressSpinner6);
        this.f38606p = new ArrayList(6);
        this.f38606p.add(this.mImageViewSelectorOverlayMain);
        this.f38606p.add(this.mImageViewSelectorOverlay2);
        this.f38606p.add(this.mImageViewSelectorOverlay3);
        this.f38606p.add(this.mImageViewSelectorOverlay4);
        this.f38606p.add(this.mImageViewSelectorOverlay5);
        this.f38606p.add(this.mImageViewSelectorOverlay6);
        this.f38612v = new ArrayList();
        this.f38612v.add(this.mContainerMainPhoto);
        this.f38612v.add(this.mContainerPhoto2);
        this.f38612v.add(this.mContainerPhoto3);
        this.f38612v.add(this.mContainerPhoto4);
        this.f38612v.add(this.mContainerPhoto5);
        this.f38612v.add(this.mContainerPhoto6);
        m47777d();
        int dimension = (int) getResources().getDimension(R.dimen.edit_photo_margin);
        int i = dimension * 2;
        int b = av.b() - dimension;
        dimension = (b / 3) - i;
        b = (b - dimension) - (i * 2);
        this.f38616z = (float) (b / dimension);
        this.f38587A = ((float) dimension) / ((float) b);
        this.mPhotosContainer.setVisibility(0);
        this.f38588B = b;
        this.f38589C = dimension;
        this.mPhotosContainer.getViewTreeObserver().addOnPreDrawListener(new C9634b(this));
    }

    /* renamed from: a */
    final /* synthetic */ void m47771a(View view) {
        switch (view.getId()) {
            case R.id.profile_image_action_1:
                m47745a((int) null);
                return;
            case R.id.profile_image_action_2:
                m47745a(1);
                return;
            case R.id.profile_image_action_3:
                m47745a(2);
                return;
            case R.id.profile_image_action_4:
                m47745a(3);
                return;
            case R.id.profile_image_action_5:
                m47745a(4);
                return;
            case R.id.profile_image_action_6:
                m47745a(5);
                return;
            default:
                return;
        }
    }

    /* renamed from: g */
    final /* synthetic */ boolean m47780g() {
        this.mContainerMainPhoto.getLayoutParams().width = this.f38588B;
        this.mContainerMainPhoto.getLayoutParams().height = this.f38588B;
        for (int i = 1; i < this.f38596f.length; i++) {
            ((ViewGroup) this.f38612v.get(i)).getLayoutParams().width = this.f38589C;
            ((ViewGroup) this.f38612v.get(i)).getLayoutParams().height = this.f38589C;
        }
        m47768n();
        return true;
    }

    /* renamed from: a */
    private void m47745a(int i) {
        Object obj;
        this.f38595e = i;
        m47761h();
        if (this.f38596f[i] != null) {
            if (i != 0 || getNumPhotos() != 1) {
                obj = null;
                if (obj == null) {
                    m47762h(i);
                }
                String photoId = this.f38596f[i].getPhotoId();
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(photoId);
                ArrayList arrayList2 = new ArrayList(1);
                arrayList2.add(Integer.valueOf(i));
                this.f38602l++;
                this.f38592b.a(arrayList, arrayList2, this);
                return;
            }
        }
        obj = 1;
        if (obj == null) {
            String photoId2 = this.f38596f[i].getPhotoId();
            ArrayList arrayList3 = new ArrayList(1);
            arrayList3.add(photoId2);
            ArrayList arrayList22 = new ArrayList(1);
            arrayList22.add(Integer.valueOf(i));
            this.f38602l++;
            this.f38592b.a(arrayList3, arrayList22, this);
            return;
        }
        m47762h(i);
    }

    /* renamed from: h */
    private void m47761h() {
        if (this.f38603m != null) {
            for (int i = 0; i < this.f38603m.size(); i++) {
                m47752b(i);
            }
        }
        this.f38604n = 0;
    }

    public int getNumPhotos() {
        int length = this.f38596f.length;
        for (ProfilePhoto profilePhoto : this.f38596f) {
            if (profilePhoto == null) {
                length--;
            }
        }
        return length;
    }

    /* renamed from: b */
    private void m47752b(int i) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("photoIndex=");
        stringBuilder.append(i);
        ad.a(stringBuilder.toString());
        ImageView imageView = (ImageView) this.f38603m.get(i);
        if (this.f38596f[i] != null) {
            ad.a("unselecting ...");
            this.f38605o[i] = false;
            this.f38604n--;
            ((ImageView) this.f38606p.get(i)).setSelected(false);
        } else {
            ad.a("No photo, not unselecting ...");
            this.f38605o[i] = false;
        }
        m47763i();
    }

    /* renamed from: i */
    private void m47763i() {
        if (this.f38597g != null) {
            if (this.f38598h != null) {
                this.f38597g.setVisible(false);
                this.f38598h.setVisible(false);
                if (this.f38604n != 1 || this.f38594d.m52974c()) {
                    if (this.f38604n == 2 && !this.f38594d.m52974c()) {
                        this.f38598h.setVisible(true);
                        this.f38598h.setOnMenuItemClickListener(new C9636d(this));
                    }
                } else if (!this.f38605o[0]) {
                    this.f38597g.setVisible(true);
                    this.f38597g.setOnMenuItemClickListener(new C9635c(this));
                }
            }
        }
    }

    /* renamed from: b */
    final /* synthetic */ boolean m47775b(MenuItem menuItem) {
        m47748a(true);
        return true;
    }

    /* renamed from: a */
    final /* synthetic */ boolean m47773a(MenuItem menuItem) {
        m47748a((boolean) null);
        return true;
    }

    /* renamed from: a */
    private void m47748a(boolean z) {
        ad.a();
        this.f38608r = -1;
        this.f38607q = -1;
        for (int i = 0; i < this.f38605o.length; i++) {
            if (this.f38605o[i]) {
                if (this.f38607q >= 0) {
                    this.f38608r = i;
                    break;
                }
                this.f38607q = i;
            }
        }
        if (z) {
            this.f38608r = 0;
        }
        if (this.f38607q <= true || this.f38608r <= true) {
            ad.c("Two photos not selected");
            m47761h();
            return;
        }
        ((ProgressBar) this.f38609s.get(this.f38607q)).setVisibility(0);
        ((ProgressBar) this.f38609s.get(this.f38608r)).setVisibility(0);
        this.f38592b.a(this.f38607q, this.f38608r, this.f38596f, this);
        if (this.f38608r > this.f38607q) {
            this.f38594d.m52969a(this.f38596f[this.f38608r].getPhotoId(), this.f38608r, this.f38607q);
        } else {
            this.f38594d.m52969a(this.f38596f[this.f38607q].getPhotoId(), this.f38607q, this.f38608r);
        }
    }

    public void onAddPhotoSuccess(int i, @NonNull ProfilePhoto profilePhoto, int i2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("index=");
        stringBuilder.append(i);
        ad.a(stringBuilder.toString());
        stringBuilder = new StringBuilder();
        stringBuilder.append("ADD PHOTO SUCCESS : ");
        stringBuilder.append(profilePhoto.getPhotoId());
        stringBuilder.append(" contents: ");
        stringBuilder.append(profilePhoto);
        ad.a(stringBuilder.toString());
        if (m47764j()) {
            ((ProgressBar) this.f38609s.get(i)).setVisibility(4);
            int numPhotos = getNumPhotos();
            if (i >= numPhotos) {
                i = numPhotos;
            } else if (!(i == 0 || i == this.f38596f.length - 1)) {
                i++;
            }
            ((ImageView) this.f38606p.get(i)).setEnabled(true);
            ((ImageView) this.f38603m.get(i)).setScaleType(ScaleType.CENTER_CROP);
            ProcessedPhoto processedPhoto = profilePhoto.getProcessedPhoto(UserPhotoSize.SMALL);
            if (processedPhoto != null) {
                m47747a(processedPhoto.imageUrl, i);
            }
            ((ImageView) this.f38610t.get(i)).setImageDrawable(this.mDrawableRemovePhoto);
            m47749a(true, i);
            this.f38596f[i] = profilePhoto;
            this.f38594d.m52968a(profilePhoto.getPhotoId(), i2);
            m47763i();
            this.f38592b.a(this.f38596f, this);
            this.f38594d.m52971a(this.f38596f);
        }
    }

    /* renamed from: j */
    private boolean m47764j() {
        return (getActivity() == null || getActivity().isFinishing()) ? false : true;
    }

    public void onAddPhotoFailure(int i, ProfilePhoto profilePhoto) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("index= ");
        stringBuilder.append(i);
        ad.a(stringBuilder.toString());
        if (m47764j()) {
            if (profilePhoto.facebookId == null) {
                new DialogError(getContext(), R.string.photo_upload_failed_title, R.string.photo_upload_failed_details).show();
            } else {
                new DialogError(getContext(), R.string.photo_facebook_error_title, R.string.photo_facebook_error_title).show();
            }
            m47755c(i);
        }
    }

    public void onDeletePhotosSuccess(@NonNull List<Integer> list) {
        Collections.sort(list, C9637e.f32180a);
        for (int i = 0; i < list.size(); i++) {
            onDeletePhotoSuccess(((Integer) list.get(i)).intValue());
        }
    }

    public void onDeletePhotoSuccess(int i) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("index=");
        stringBuilder.append(i);
        ad.a(stringBuilder.toString());
        if (m47764j()) {
            this.f38602l--;
            ProfilePhoto profilePhoto = this.f38596f[i];
            if (profilePhoto != null) {
                this.f38594d.m52967a(profilePhoto.getPhotoId());
            }
            this.f38596f[i] = null;
            m47749a(false, i);
            ((ImageView) this.f38606p.get(i)).setEnabled(false);
            ((ProgressBar) this.f38609s.get(i)).setVisibility(4);
            if (this.f38602l < 1) {
                m47765k();
            }
            m47763i();
            this.f38594d.m52971a(this.f38596f);
        }
    }

    public void onDeletePhotoFailure(int i) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("index=");
        stringBuilder.append(i);
        ad.a(stringBuilder.toString());
        if (m47764j()) {
            at.a(getActivity(), R.string.error_pic_delete);
            ((ProgressBar) this.f38609s.get(i)).setVisibility(4);
            this.f38602l--;
            if (this.f38602l < 1) {
                m47765k();
            }
        }
    }

    public void onSetMainPhotoSuccess(int i, int i2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("oldIndex=");
        stringBuilder.append(i);
        stringBuilder.append(", index=");
        stringBuilder.append(i2);
        ad.a(stringBuilder.toString());
        if (m47764j()) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("mMainPhotoNew=");
            stringBuilder.append(i2);
            ad.a(stringBuilder.toString());
            ((ProgressBar) this.f38609s.get(i2)).setVisibility(4);
            int i3 = 0;
            while (i3 < this.f38596f.length) {
                if (!(i3 == i2 || this.f38596f[i3] == null)) {
                    this.f38596f[i3].isMain = false;
                }
                i3++;
            }
            m47749a(true, i);
            m47749a(true, i2);
            this.f38614x = i2;
            return;
        }
        ad.a("Activity null, returning");
    }

    public void onSetMainPhotoFailure(int i, int i2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("oldIndex=");
        stringBuilder.append(i);
        stringBuilder.append(", index=");
        stringBuilder.append(i2);
        ad.a(stringBuilder.toString());
        if (m47764j() != 0) {
            at.a(getActivity(), R.string.error_pic_main);
            ((ProgressBar) this.f38609s.get(i2)).setVisibility(4);
        }
    }

    public void onSwapPhotosSuccess() {
        ad.a();
        if (m47764j()) {
            m47766l();
            m47761h();
            ((ProgressBar) this.f38609s.get(this.f38607q)).setVisibility(4);
            ((ProgressBar) this.f38609s.get(this.f38608r)).setVisibility(4);
            m47746a(this.f38607q, this.f38608r);
            m47763i();
        }
    }

    public void onSwapPhotosFailure() {
        ad.a();
        if (m47764j()) {
            m47761h();
            at.a(getActivity(), R.string.error_pic_swap);
            ((ProgressBar) this.f38609s.get(this.f38607q)).setVisibility(4);
            ((ProgressBar) this.f38609s.get(this.f38608r)).setVisibility(4);
        }
    }

    /* renamed from: a */
    private void m47747a(String str, final int i) {
        C0994i.b(getContext()).a(str).l().b().b(new C4455b(this, (ImageView) this.f38603m.get(i)) {
            /* renamed from: c */
            final /* synthetic */ EditProfilePhotoView f45376c;

            /* renamed from: a */
            protected void m54492a(Bitmap bitmap) {
                bitmap = C0452d.a(this.f45376c.getResources(), bitmap);
                bitmap.a(this.f45376c.mPhotoCornerRadius);
                ((ImageView) this.f45376c.f38603m.get(i)).setImageDrawable(bitmap);
                ((ImageView) this.f45376c.f38611u.get(i)).setImageDrawable(bitmap);
            }
        });
    }

    /* renamed from: a */
    private void m47749a(boolean z, int i) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("isPhotoAvailable=");
        stringBuilder.append(z);
        stringBuilder.append(", containNumber=");
        stringBuilder.append(i);
        ad.a(stringBuilder.toString());
        ((ImageView) this.f38603m.get(i)).setClickable(true);
        ((ProgressBar) this.f38609s.get(i)).setVisibility(4);
    }

    /* renamed from: c */
    private void m47755c(final int i) {
        ((ImageView) this.f38606p.get(i)).setEnabled(false);
        ((ProgressBar) this.f38609s.get(i)).setVisibility(4);
        ((ImageView) this.f38610t.get(i)).animate().alpha(1.0f).setListener(new AnimatorListenerAdapter(this) {
            /* renamed from: b */
            final /* synthetic */ EditProfilePhotoView f32141b;

            public void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                ((ImageView) this.f32141b.f38610t.get(i)).setVisibility(0);
            }
        });
    }

    /* renamed from: k */
    private void m47765k() {
        int i;
        ProfilePhoto[] profilePhotoArr = new ProfilePhoto[this.f38596f.length];
        int length = this.f38596f.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (this.f38596f[i3] != null) {
                profilePhotoArr[i2] = this.f38596f[i3];
                i2++;
            }
        }
        this.f38596f = profilePhotoArr;
        for (i = 0; i < length; i++) {
            ((ImageView) this.f38606p.get(i)).setEnabled(true);
            ((ImageView) this.f38603m.get(i)).setScaleType(ScaleType.CENTER_CROP);
            if (this.f38596f[i] != null) {
                m47747a(this.f38596f[i].imageUrl, i);
            }
        }
        for (i = 0; i < length; i++) {
            if (this.f38596f[i] == null) {
                ((ImageView) this.f38603m.get(i)).setImageDrawable(null);
                ((ImageView) this.f38611u.get(i)).setImageDrawable(null);
                m47752b(i);
                ((ImageView) this.f38606p.get(i)).setEnabled(false);
                ((ImageView) this.f38610t.get(i)).setImageDrawable(this.mDrawableAddPhoto);
            } else {
                ((ImageView) this.f38610t.get(i)).setImageDrawable(this.mDrawableRemovePhoto);
            }
        }
    }

    /* renamed from: l */
    private void m47766l() {
        ad.a();
        this.f38615y = this.f38592b.c();
        int size = this.f38615y != null ? this.f38615y.getPhotos().size() : 0;
        this.f38596f = new ProfilePhoto[6];
        this.f38601k = new ProcessedPhoto[6];
        for (int i = 0; i < 6; i++) {
            if (i >= size || this.f38615y == null) {
                this.f38596f[i] = null;
            } else {
                this.f38596f[i] = (ProfilePhoto) this.f38615y.getPhotos().get(i);
            }
            ProfilePhoto profilePhoto = this.f38596f[i];
            if (profilePhoto == null) {
                this.f38601k[i] = null;
            } else if (i == 0) {
                this.f38601k[i] = profilePhoto.getProcessedPhoto(UserPhotoSize.LARGE);
            } else {
                this.f38601k[i] = profilePhoto.getProcessedPhoto(UserPhotoSize.LARGE);
            }
        }
        if (size > 0 && this.f38596f[0] != null) {
            this.f38596f[0].isMain = true;
        }
    }

    /* renamed from: a */
    private void m47746a(int i, int i2) {
        int i3 = i;
        int i4 = i2;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("index1=");
        stringBuilder.append(i3);
        stringBuilder.append(", index2=");
        stringBuilder.append(i4);
        ad.a(stringBuilder.toString());
        ViewGroup viewGroup = (ViewGroup) this.f38612v.get(i3);
        ViewGroup viewGroup2 = (ViewGroup) this.f38612v.get(i4);
        ImageView imageView = (ImageView) this.f38603m.get(i3);
        ImageView imageView2 = (ImageView) this.f38603m.get(i4);
        final ImageView imageView3 = (ImageView) this.f38611u.get(i3);
        final ImageView imageView4 = (ImageView) this.f38611u.get(i4);
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        viewGroup.getLocationInWindow(iArr);
        viewGroup2.getLocationInWindow(iArr2);
        float f = (float) (iArr2[0] - iArr[0]);
        float f2 = (float) (iArr2[1] - iArr[1]);
        float f3 = (float) (iArr[0] - iArr2[0]);
        float f4 = (float) (iArr[1] - iArr2[1]);
        Animation translateAnimation = new TranslateAnimation(0.0f, f, 0.0f, f2);
        translateAnimation.setDuration(230);
        translateAnimation.setFillAfter(false);
        Animation translateAnimation2 = new TranslateAnimation(0.0f, f3, 0.0f, f4);
        translateAnimation2.setDuration(230);
        translateAnimation2.setFillAfter(false);
        final ViewGroup viewGroup3 = viewGroup;
        final ViewGroup viewGroup4 = viewGroup2;
        final ImageView imageView5 = imageView;
        C96233 c96233 = r0;
        final ImageView imageView6 = imageView2;
        C96233 c962332 = new AnimationListener(this) {
            /* renamed from: g */
            final /* synthetic */ EditProfilePhotoView f32148g;

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
                ObjectAnimator.ofFloat(viewGroup3, "alpha", new float[]{0.2f}).setDuration(50).start();
                ObjectAnimator.ofFloat(viewGroup4, "alpha", new float[]{0.2f}).setDuration(50).start();
            }

            public void onAnimationEnd(Animation animation) {
                animation = imageView5.getDrawable();
                Drawable drawable = imageView6.getDrawable();
                imageView5.setImageDrawable(drawable);
                imageView6.setImageDrawable(animation);
                imageView3.setImageDrawable(drawable);
                imageView4.setImageDrawable(animation);
                ObjectAnimator.ofFloat(viewGroup3, "alpha", new float[]{1.0f}).setDuration(100);
                ObjectAnimator.ofFloat(viewGroup3, "alpha", new float[]{1.0f}).setDuration(100).start();
                ObjectAnimator.ofFloat(viewGroup4, "alpha", new float[]{1.0f}).setDuration(100).start();
            }
        };
        translateAnimation.setAnimationListener(c96233);
        Animation animationSet = new AnimationSet(true);
        Animation animationSet2 = new AnimationSet(true);
        Animation scaleAnimation = new ScaleAnimation(1.0f, this.f38587A, 1.0f, this.f38587A);
        scaleAnimation.setDuration(230);
        Animation scaleAnimation2 = new ScaleAnimation(1.0f, this.f38616z, 1.0f, this.f38616z);
        scaleAnimation2.setDuration(230);
        if (imageView.equals(this.mImageViewMain)) {
            animationSet.addAnimation(scaleAnimation);
            animationSet2.addAnimation(scaleAnimation2);
        } else if (imageView2.equals(r8.mImageViewMain)) {
            animationSet.addAnimation(scaleAnimation2);
            animationSet2.addAnimation(scaleAnimation);
        }
        animationSet.addAnimation(translateAnimation);
        animationSet2.addAnimation(translateAnimation2);
        animationSet.setZAdjustment(-1);
        animationSet2.setZAdjustment(1);
        animationSet.setInterpolator(new LinearInterpolator());
        animationSet2.setInterpolator(new LinearInterpolator());
        viewGroup.startAnimation(animationSet);
        viewGroup2.startAnimation(animationSet2);
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f38594d.a(this);
        this.f38594d.m52971a(this.f38596f);
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f38599i = savedState.photoAddPosition;
            this.f38595e = savedState.lastTappedActionButtonIndex;
            super.onRestoreInstanceState(savedState.getSuperState());
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Nullable
    protected Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        savedState.photoAddPosition = this.f38599i;
        savedState.lastTappedActionButtonIndex = this.f38595e;
        return savedState;
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f38594d.a();
    }

    /* renamed from: m */
    private void m47767m() {
        this.mCellCount1.setText(String.format("%d", new Object[]{Integer.valueOf(1)}));
        this.mCellCount2.setText(String.format("%d", new Object[]{Integer.valueOf(2)}));
        this.mCellCount3.setText(String.format("%d", new Object[]{Integer.valueOf(3)}));
        this.mCellCount4.setText(String.format("%d", new Object[]{Integer.valueOf(4)}));
        this.mCellCount5.setText(String.format("%d", new Object[]{Integer.valueOf(5)}));
        this.mCellCount6.setText(String.format("%d", new Object[]{Integer.valueOf(6)}));
        if (this.f38615y != null && this.f38615y.isPhotoProcessing()) {
            this.f38593c.m40477a(new SparksEvent("Profile.PhotosProcessing"));
            this.mLayoutIsPhotoProcessing.setVisibility(0);
            m47744a(0.0f);
            m47751b(0.0f);
        }
    }

    /* renamed from: b */
    public void m47774b() {
        m47763i();
    }

    public void showOptimizedPhotos() {
        m47761h();
        m47753b(true);
        m47744a(0.0f);
        int numPhotos = getNumPhotos();
        for (int i = 0; i < numPhotos; i++) {
            ((TextView) this.f38613w.get(i)).setVisibility(8);
        }
        this.mBestPhotoBanner.bringToFront();
        this.mBestPhotoBanner.setVisibility(0);
    }

    public void showOptimizingPhotos() {
        m47761h();
        m47753b(true);
        m47744a(0.0f);
        int numPhotos = getNumPhotos();
        for (int i = 0; i < numPhotos; i++) {
            ((TextView) this.f38613w.get(i)).setVisibility(8);
        }
        this.mBestPhotoBanner.setVisibility(8);
    }

    /* renamed from: n */
    private void m47768n() {
        int i = getResources().getDisplayMetrics().widthPixels;
        int i2 = ((i - (this.mPhotosSidePadding * 2)) - (this.mPhotoMargins * 6)) / 3;
        i = ((i - i2) - (this.mPhotosSidePadding * 2)) - (this.mPhotoMargins * 4);
        this.mOptimizedPhoto1.getLayoutParams().width = i;
        this.mOptimizedPhoto1.getLayoutParams().height = i;
        for (i = 1; i < this.f38596f.length; i++) {
            ((ImageView) this.f38611u.get(i)).getLayoutParams().width = i2;
            ((ImageView) this.f38611u.get(i)).getLayoutParams().height = i2;
        }
    }

    public void showCustomPhotos() {
        m47753b(true);
        m47744a(1.0f);
        int numPhotos = getNumPhotos();
        for (int i = 0; i < numPhotos; i++) {
            ((TextView) this.f38613w.get(i)).setVisibility(0);
        }
        this.mBestPhotoBanner.setVisibility(8);
    }

    /* renamed from: b */
    private void m47753b(boolean z) {
        if (z) {
            m47763i();
            return;
        }
        m47761h();
        if (this.f38598h && this.f38597g) {
            this.f38598h.setVisible(false);
            this.f38597g.setVisible(false);
        }
    }

    /* renamed from: a */
    private void m47744a(float f) {
        this.mCellCount1.animate().alpha(f);
        this.mCellCount2.animate().alpha(f);
        this.mCellCount3.animate().alpha(f);
        this.mCellCount4.animate().alpha(f);
        this.mCellCount5.animate().alpha(f);
        this.mCellCount6.animate().alpha(f);
    }

    /* renamed from: b */
    private void m47751b(float f) {
        this.mCellActionButton1.animate().alpha(f);
        this.mCellActionButton2.animate().alpha(f);
        this.mCellActionButton3.animate().alpha(f);
        this.mCellActionButton4.animate().alpha(f);
        this.mCellActionButton5.animate().alpha(f);
        this.mCellActionButton6.animate().alpha(f);
    }

    public void showPhotoOptimizerUpdateSuccess(boolean z) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("showPhotoOptimizerUpdateSuccess, optimized:");
        stringBuilder.append(z);
        ad.a(stringBuilder.toString());
    }

    public void showPhotoOptimizerUpdateFailure(boolean z) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("showPhotoOptimizerUpdateFailure, optimized:");
        stringBuilder.append(z);
        ad.a(stringBuilder.toString());
    }

    public void enableToggle() {
        this.mOptimizePhotosSwitch.setEnabled(true);
        this.mOptimizeToggleLabel.setTextColor(this.RESOURCE_RED);
    }

    public void disableToggle() {
        this.mOptimizePhotosSwitch.setEnabled(false);
        this.mOptimizeToggleLabel.setTextColor(this.RESOURCE_GRAY);
    }

    public void updatePhotoTogglePosition(boolean z) {
        m47756c(z);
    }

    /* renamed from: c */
    private void m47756c(boolean z) {
        this.mOptimizePhotosSwitch.setChecked(z);
        this.mOptimizePhotosSwitch.setOnCheckedChangeListener(this);
    }

    public void enableFeature() {
        this.mOptimizePhotosContainer.setVisibility(0);
    }

    public void disableFeature() {
        this.mOptimizePhotosContainer.setVisibility(8);
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (compoundButton.getId() == R.id.optimize_photos_switch) {
            this.f38594d.m52970a(z);
        }
    }

    public void onClick(@NonNull View view) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("view=");
        stringBuilder.append(view);
        ad.a(stringBuilder.toString());
        if (!this.f38594d.m52974c()) {
            switch (view.getId()) {
                case R.id.imageView2:
                case R.id.imageView_selector_overlay2:
                    m47757d(1);
                    break;
                case R.id.imageView3:
                case R.id.imageView_selector_overlay3:
                    m47757d(2);
                    break;
                case R.id.imageView4:
                case R.id.imageView_selector_overlay4:
                    m47757d(3);
                    break;
                case R.id.imageView5:
                case R.id.imageView_selector_overlay5:
                    m47757d(4);
                    break;
                case R.id.imageView6:
                case R.id.imageView_selector_overlay6:
                    m47757d(5);
                    break;
                case R.id.imageViewMain:
                case R.id.imageView_selector_overlay_main:
                    m47757d(null);
                    break;
                default:
                    break;
            }
        }
    }

    /* renamed from: d */
    private void m47757d(int i) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("photoIndex=");
        stringBuilder.append(i);
        ad.a(stringBuilder.toString());
        if (this.f38596f[i] == null) {
            return;
        }
        if (this.f38605o[i]) {
            m47752b(i);
        } else if (this.f38604n < 2) {
            m47758e(i);
        }
    }

    /* renamed from: e */
    private void m47758e(int i) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("photoIndex=");
        stringBuilder.append(i);
        ad.a(stringBuilder.toString());
        ImageView imageView = (ImageView) this.f38603m.get(i);
        this.f38605o[i] = true;
        this.f38604n++;
        ((ImageView) this.f38606p.get(i)).setSelected(true);
        m47763i();
    }

    /* renamed from: c */
    public void m47776c() {
        this.f38595e = 5;
        m47762h(this.f38595e);
    }

    public void setPhotoContainer(int i) {
        ad.a();
        if (i >= this.f38601k.length || this.f38601k[i] == null || this.f38601k[i].imageUrl == null) {
            ((ImageView) this.f38606p.get(i)).setEnabled(false);
            ((ImageView) this.f38603m.get(i)).setImageDrawable(null);
            ((ImageView) this.f38610t.get(i)).setImageDrawable(this.mDrawableAddPhoto);
            m47749a(false, i);
            return;
        }
        m47747a(this.f38601k[i].imageUrl, i);
        ((ImageView) this.f38606p.get(i)).setEnabled(true);
        ((ImageView) this.f38610t.get(i)).setImageDrawable(this.mDrawableRemovePhoto);
        m47749a(true, i);
    }

    /* renamed from: d */
    public void m47777d() {
        ad.a();
        for (int i = 0; i < this.f38596f.length; i++) {
            setPhotoContainer(i);
        }
    }

    /* renamed from: f */
    private boolean m47759f(int i) {
        if (i < this.f38596f.length) {
            i = this.f38596f[i];
            if (i == 0) {
                return false;
            }
            this.f38590D = i.getPhotoId();
            return i.isMain;
        }
        this.f38590D = 0;
        return false;
    }

    /* renamed from: g */
    private int m47760g(int i) {
        int numPhotos = getNumPhotos();
        if (i >= numPhotos) {
            return numPhotos;
        }
        return (i == 0 || i == this.f38596f.length - 1) ? i : i + 1;
    }

    /* renamed from: a */
    public void m47772a(String str) {
        ProfilePhoto profilePhoto = new ProfilePhoto(String.format(ManagerWebServices.PARAM_CLIENT_PHOTO_ID_FORMAT, new Object[]{Long.valueOf(System.currentTimeMillis())}));
        boolean f = m47759f(this.f38599i);
        int g = m47760g(this.f38599i);
        this.f38592b.a(str, this.f38614x, g, profilePhoto, this.f38590D, this, f, profilePhoto, 1);
        ((ProgressBar) this.f38609s.get(g)).setVisibility(0);
    }

    /* renamed from: a */
    public void m47770a(Intent intent) {
        CharSequence stringExtra = intent.getStringExtra("photoSource");
        boolean f = m47759f(this.f38599i);
        int g = m47760g(this.f38599i);
        if (TextUtils.equals(stringExtra, "src_camera_roll")) {
            String stringExtra2 = intent.getStringExtra("filePath");
            ProfilePhoto profilePhoto = new ProfilePhoto(String.format(ManagerWebServices.PARAM_CLIENT_PHOTO_ID_FORMAT, new Object[]{Long.valueOf(System.currentTimeMillis())}));
            this.f38592b.a(stringExtra2, this.f38614x, g, profilePhoto, this.f38590D, this, f, profilePhoto, 1);
            ((ProgressBar) this.f38609s.get(g)).setVisibility(0);
            return;
        }
        String stringExtra3 = intent.getStringExtra("source");
        stringExtra2 = intent.getStringExtra("id");
        float floatExtra = intent.getFloatExtra(ManagerWebServices.PARAM_XOFFSET_PERCENT, -1.0f);
        float floatExtra2 = intent.getFloatExtra(ManagerWebServices.PARAM_YOFFSET_PERCENT, -1.0f);
        float floatExtra3 = intent.getFloatExtra(ManagerWebServices.PARAM_XDISTANCE_PERCENT, -1.0f);
        float floatExtra4 = intent.getFloatExtra(ManagerWebServices.PARAM_YDISTANCE_PERCENT, -1.0f);
        intent = new StringBuilder();
        intent.append("cropXOff: ");
        intent.append(floatExtra);
        intent.append(" cropXDist: ");
        intent.append(floatExtra3);
        intent.append(" cropYOff: ");
        intent.append(floatExtra2);
        intent.append(" cropYDist: ");
        intent.append(floatExtra4);
        ad.a(intent.toString());
        if (floatExtra != -1.0f && floatExtra2 != -1.0f && floatExtra3 != -1.0f && floatExtra4 != -1.0f) {
            Intent profilePhoto2 = new ProfilePhoto(stringExtra2, stringExtra3, floatExtra3, floatExtra4, floatExtra, floatExtra2);
            this.f38592b.a(this.f38614x, g, profilePhoto2, this.f38590D, this, f, profilePhoto2, 0);
            ((ProgressBar) this.f38609s.get(g)).setVisibility(0);
        }
    }

    /* renamed from: e */
    public void m47778e() {
        m47755c(this.f38599i);
    }

    /* renamed from: f */
    public void m47779f() {
        this.mLayoutIsPhotoProcessing.setVisibility(8);
        m47763i();
        m47744a(1.0f);
        m47751b(1.0f);
        m47766l();
        m47777d();
    }

    private Activity getActivity() {
        return (Activity) C14398a.a(getContext());
    }

    /* renamed from: h */
    private void m47762h(int i) {
        if (this.f38591a.m40518c()) {
            this.f38600j.m51496a(i);
        } else {
            this.f38600j.f42193i.onExtStorageReadPermissionDenied();
        }
    }
}
