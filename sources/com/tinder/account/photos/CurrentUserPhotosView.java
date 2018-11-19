package com.tinder.account.photos;

import android.content.Context;
import android.support.design.widget.Snackbar;
import android.support.v4.content.C0432b;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import com.tinder.account.C2612a.C2605b;
import com.tinder.account.C2612a.C2608e;
import com.tinder.account.C2612a.C2609f;
import com.tinder.account.C2612a.C2610g;
import com.tinder.account.photos.component.AccountComponentProvider;
import com.tinder.account.photos.photogrid.C2626d;
import com.tinder.account.photos.photogrid.PhotoExternalStoragePermissionListener;
import com.tinder.account.photos.photogrid.PhotoGridView;
import com.tinder.account.photos.photogrid.PhotoGridView.Listener;
import com.tinder.account.photos.photogrid.p075a.C2624a;
import com.tinder.account.photos.photogrid.target.PhotoGridTarget;
import com.tinder.account.photos.smartphotos.view.SmartPhotosRowView;
import com.tinder.base.view.SwitchRowView.CheckStatusListener;
import com.tinder.domain.profile.model.LocalProfilePhoto;
import com.tinder.domain.profile.model.PendingFacebookPhoto;
import java.util.List;
import javax.inject.Inject;
import kotlin.C18451c;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001 \u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%J\u000e\u0010&\u001a\u00020#2\u0006\u0010'\u001a\u00020(J\b\u0010)\u001a\u00020#H\u0014J\b\u0010*\u001a\u00020#H\u0014J\u0006\u0010+\u001a\u00020#J\b\u0010,\u001a\u00020#H\u0016J\b\u0010-\u001a\u00020#H\u0016J\b\u0010.\u001a\u00020#H\u0016J\b\u0010/\u001a\u00020#H\u0016J\u0016\u00100\u001a\u00020#2\f\u00101\u001a\b\u0012\u0004\u0012\u00020302H\u0016J\b\u00104\u001a\u00020#H\u0016J\b\u00105\u001a\u00020#H\u0016J\b\u00106\u001a\u00020#H\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001c\u0010\u001dR\u0010\u0010\u001f\u001a\u00020 X\u0004¢\u0006\u0004\n\u0002\u0010!¨\u00067"}, d2 = {"Lcom/tinder/account/photos/CurrentUserPhotosView;", "Landroid/widget/LinearLayout;", "Lcom/tinder/account/photos/photogrid/target/PhotoGridTarget;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "photoExternalStoragePermissionListener", "Lcom/tinder/account/photos/photogrid/PhotoExternalStoragePermissionListener;", "getPhotoExternalStoragePermissionListener", "()Lcom/tinder/account/photos/photogrid/PhotoExternalStoragePermissionListener;", "setPhotoExternalStoragePermissionListener", "(Lcom/tinder/account/photos/photogrid/PhotoExternalStoragePermissionListener;)V", "photoGridView", "Lcom/tinder/account/photos/photogrid/PhotoGridView;", "getPhotoGridView", "()Lcom/tinder/account/photos/photogrid/PhotoGridView;", "photoGridView$delegate", "Lkotlin/Lazy;", "presenter", "Lcom/tinder/account/photos/photogrid/presenter/PhotoGridPresenter;", "getPresenter", "()Lcom/tinder/account/photos/photogrid/presenter/PhotoGridPresenter;", "setPresenter", "(Lcom/tinder/account/photos/photogrid/presenter/PhotoGridPresenter;)V", "smartPhotosRowView", "Lcom/tinder/account/photos/smartphotos/view/SmartPhotosRowView;", "getSmartPhotosRowView", "()Lcom/tinder/account/photos/smartphotos/view/SmartPhotosRowView;", "smartPhotosRowView$delegate", "smartPhotosToggleListener", "com/tinder/account/photos/CurrentUserPhotosView$smartPhotosToggleListener$1", "Lcom/tinder/account/photos/CurrentUserPhotosView$smartPhotosToggleListener$1;", "addFacebookPhoto", "", "pendingFacebookPhoto", "Lcom/tinder/domain/profile/model/PendingFacebookPhoto;", "addLocalProfilePhoto", "localProfilePhoto", "Lcom/tinder/domain/profile/model/LocalProfilePhoto;", "onAttachedToWindow", "onDetachedFromWindow", "save", "showExternalReadPermissionDenied", "showExternalReadPermissionGranted", "showLoadingPhotosError", "showPhotoUploadError", "showPhotos", "photos", "", "Lcom/tinder/account/photos/photogrid/PhotoGridEntry;", "showSmartPhotoSettingsSaveError", "showSmartPhotosDisabled", "showSmartPhotosEnabled", "account_release"}, k = 1, mv = {1, 1, 10})
public final class CurrentUserPhotosView extends LinearLayout implements PhotoGridTarget {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f12147a = new KProperty[]{C15825i.a(new PropertyReference1Impl(C15825i.a(CurrentUserPhotosView.class), "photoGridView", "getPhotoGridView()Lcom/tinder/account/photos/photogrid/PhotoGridView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(CurrentUserPhotosView.class), "smartPhotosRowView", "getSmartPhotosRowView()Lcom/tinder/account/photos/smartphotos/view/SmartPhotosRowView;"))};
    @Inject
    @NotNull
    /* renamed from: b */
    public C2624a f12148b;
    @Nullable
    /* renamed from: c */
    private PhotoExternalStoragePermissionListener f12149c;
    /* renamed from: d */
    private final Lazy f12150d = C18451c.a(LazyThreadSafetyMode.NONE, new CurrentUserPhotosView$$special$$inlined$bindView$1(this, C2608e.photo_grid_view));
    /* renamed from: e */
    private final Lazy f12151e = C18451c.a(LazyThreadSafetyMode.NONE, new CurrentUserPhotosView$$special$$inlined$bindView$2(this, C2608e.smart_photos_row_view));
    /* renamed from: f */
    private final C3881c f12152f;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.account.photos.CurrentUserPhotosView$a */
    static final class C2614a implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ CurrentUserPhotosView f8152a;

        C2614a(CurrentUserPhotosView currentUserPhotosView) {
            this.f8152a = currentUserPhotosView;
        }

        public final void onClick(View view) {
            this.f8152a.getPresenter().m9839d();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.account.photos.CurrentUserPhotosView$b */
    static final class C2615b implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ CurrentUserPhotosView f8153a;

        C2615b(CurrentUserPhotosView currentUserPhotosView) {
            this.f8153a = currentUserPhotosView;
        }

        public final void onClick(View view) {
            this.f8153a.getPresenter().m9836a(this.f8153a.getSmartPhotosRowView().m9848a());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0006"}, d2 = {"com/tinder/account/photos/CurrentUserPhotosView$smartPhotosToggleListener$1", "Lcom/tinder/base/view/SwitchRowView$CheckStatusListener;", "(Lcom/tinder/account/photos/CurrentUserPhotosView;)V", "onChecked", "", "onUnChecked", "account_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.account.photos.CurrentUserPhotosView$c */
    public static final class C3881c implements CheckStatusListener {
        /* renamed from: a */
        final /* synthetic */ CurrentUserPhotosView f12146a;

        C3881c(CurrentUserPhotosView currentUserPhotosView) {
            this.f12146a = currentUserPhotosView;
        }

        public void onChecked() {
            C0001a.m25b("onChecked", new Object[0]);
            this.f12146a.getPresenter().m9836a(true);
        }

        public void onUnChecked() {
            C0001a.m25b("onUnchecked", new Object[0]);
            this.f12146a.getPresenter().m9836a(false);
        }
    }

    private final PhotoGridView getPhotoGridView() {
        Lazy lazy = this.f12150d;
        KProperty kProperty = f12147a[0];
        return (PhotoGridView) lazy.getValue();
    }

    private final SmartPhotosRowView getSmartPhotosRowView() {
        Lazy lazy = this.f12151e;
        KProperty kProperty = f12147a[1];
        return (SmartPhotosRowView) lazy.getValue();
    }

    public CurrentUserPhotosView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.m10309b(context, "context");
        super(context, attributeSet);
        if (isInEditMode() == null) {
            ((AccountComponentProvider) context).provideAccountComponent().inject(this);
        }
        setOrientation(1);
        LinearLayout.inflate(context, C2609f.view_current_user_photos, this);
        getPhotoGridView().setListener((Listener) new Listener() {
            public void onMove(int i, int i2) {
                this.getPresenter().m9832a(i, i2);
            }

            public void onAdd(int i) {
                this.getPresenter().m9841f();
            }

            public void onDelete(int i) {
                this.getPresenter().m9831a(i);
            }
        });
        this.f12152f = new C3881c(this);
    }

    @Nullable
    public final PhotoExternalStoragePermissionListener getPhotoExternalStoragePermissionListener() {
        return this.f12149c;
    }

    public final void setPhotoExternalStoragePermissionListener(@Nullable PhotoExternalStoragePermissionListener photoExternalStoragePermissionListener) {
        this.f12149c = photoExternalStoragePermissionListener;
    }

    @NotNull
    public final C2624a getPresenter() {
        C2624a c2624a = this.f12148b;
        if (c2624a == null) {
            C2668g.m10310b("presenter");
        }
        return c2624a;
    }

    public final void setPresenter(@NotNull C2624a c2624a) {
        C2668g.m10309b(c2624a, "<set-?>");
        this.f12148b = c2624a;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C2624a c2624a = this.f12148b;
        if (c2624a == null) {
            C2668g.m10310b("presenter");
        }
        c2624a.m9833a((PhotoGridTarget) this);
        c2624a = this.f12148b;
        if (c2624a == null) {
            C2668g.m10310b("presenter");
        }
        c2624a.m9830a();
        getSmartPhotosRowView().setSmartPhotosToggleListener(this.f12152f);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C2624a c2624a = this.f12148b;
        if (c2624a == null) {
            C2668g.m10310b("presenter");
        }
        c2624a.m9837b();
        c2624a = this.f12148b;
        if (c2624a == null) {
            C2668g.m10310b("presenter");
        }
        c2624a.m9838c();
    }

    public void showPhotos(@NotNull List<? extends C2626d> list) {
        C2668g.m10309b(list, "photos");
        getPhotoGridView().m9799a(list);
    }

    public void showLoadingPhotosError() {
        Snackbar.m10756a((View) this, C2610g.error_loading_photos, 0).m10759a(C2610g.action_retry, (OnClickListener) new C2614a(this)).mo254e(C0432b.m1647c(getContext(), C2605b.green)).m646b();
    }

    public void showExternalReadPermissionGranted() {
        PhotoExternalStoragePermissionListener photoExternalStoragePermissionListener = this.f12149c;
        if (photoExternalStoragePermissionListener == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        photoExternalStoragePermissionListener.onPermissionGranted();
    }

    public void showExternalReadPermissionDenied() {
        PhotoExternalStoragePermissionListener photoExternalStoragePermissionListener = this.f12149c;
        if (photoExternalStoragePermissionListener == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        photoExternalStoragePermissionListener.onPermissionDenied();
    }

    public void showPhotoUploadError() {
        Snackbar.m10756a((View) this, C2610g.photo_upload_failed, 0).m646b();
    }

    public void showSmartPhotosEnabled() {
        getSmartPhotosRowView().setSmartPhotosToggleStatus(true);
    }

    public void showSmartPhotosDisabled() {
        getSmartPhotosRowView().setSmartPhotosToggleStatus(false);
    }

    public void showSmartPhotoSettingsSaveError() {
        Snackbar.m10756a((View) this, C2610g.smart_photos_failed_to_save, 0).m10759a(C2610g.action_retry, (OnClickListener) new C2615b(this)).mo254e(C0432b.m1647c(getContext(), C2605b.green)).m646b();
    }

    /* renamed from: a */
    public final void m14624a() {
        C2624a c2624a = this.f12148b;
        if (c2624a == null) {
            C2668g.m10310b("presenter");
        }
        c2624a.m9840e();
    }

    /* renamed from: a */
    public final void m14625a(@NotNull LocalProfilePhoto localProfilePhoto) {
        C2668g.m10309b(localProfilePhoto, "localProfilePhoto");
        C2624a c2624a = this.f12148b;
        if (c2624a == null) {
            C2668g.m10310b("presenter");
        }
        c2624a.m9834a(localProfilePhoto);
    }

    /* renamed from: a */
    public final void m14626a(@NotNull PendingFacebookPhoto pendingFacebookPhoto) {
        C2668g.m10309b(pendingFacebookPhoto, "pendingFacebookPhoto");
        C2624a c2624a = this.f12148b;
        if (c2624a == null) {
            C2668g.m10310b("presenter");
        }
        c2624a.m9835a(pendingFacebookPhoto);
    }
}
