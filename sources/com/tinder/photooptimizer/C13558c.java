package com.tinder.photooptimizer;

import com.tinder.api.ManagerWebServices;
import com.tinder.listeners.ListenerUpdateProfileInfo;
import com.tinder.managers.ManagerAnalytics;
import com.tinder.model.ProfilePhoto;
import com.tinder.model.SparksEvent;
import com.tinder.presenters.PresenterBase;
import javax.inject.Inject;

/* renamed from: com.tinder.photooptimizer.c */
public class C13558c extends PresenterBase<PhotoOptimizerTarget> {
    /* renamed from: a */
    private ProfilePhoto[] f43288a;
    /* renamed from: b */
    private final C10110a f43289b;
    /* renamed from: c */
    private final ManagerAnalytics f43290c;

    @Inject
    public C13558c(C10110a c10110a, ManagerAnalytics managerAnalytics) {
        this.f43289b = c10110a;
        this.f43290c = managerAnalytics;
    }

    /* renamed from: a */
    public void m52971a(ProfilePhoto[] profilePhotoArr) {
        this.f43288a = profilePhotoArr;
        ((PhotoOptimizerTarget) H()).enableFeature();
        Object obj = 1;
        if (this.f43288a == null || m52972b() <= 1) {
            obj = null;
        }
        if (obj != null) {
            ((PhotoOptimizerTarget) H()).enableToggle();
            profilePhotoArr = this.f43289b.m41300a();
            ((PhotoOptimizerTarget) H()).updatePhotoTogglePosition(profilePhotoArr);
            if (profilePhotoArr == null) {
                ((PhotoOptimizerTarget) H()).showCustomPhotos();
                return;
            } else if (this.f43289b.m41301b() != null) {
                ((PhotoOptimizerTarget) H()).showOptimizedPhotos();
                m52975d();
                return;
            } else {
                ((PhotoOptimizerTarget) H()).showOptimizingPhotos();
                return;
            }
        }
        ((PhotoOptimizerTarget) H()).disableToggle();
        ((PhotoOptimizerTarget) H()).showCustomPhotos();
    }

    /* renamed from: b */
    public int m52972b() {
        int length = this.f43288a.length;
        for (ProfilePhoto profilePhoto : this.f43288a) {
            if (profilePhoto == null) {
                length--;
            }
        }
        return length;
    }

    /* renamed from: a */
    public void m52970a(final boolean z) {
        if (this.f43289b.m41300a() != z) {
            this.f43289b.m41299a(z, new ListenerUpdateProfileInfo(this) {
                /* renamed from: b */
                final /* synthetic */ C13558c f39809b;

                public void onProfileUpdateSuccess() {
                    this.f39809b.f43289b.m41298a(z);
                    if (this.f39809b.H() != null) {
                        ((PhotoOptimizerTarget) this.f39809b.H()).showPhotoOptimizerUpdateSuccess(z);
                        if (z) {
                            ((PhotoOptimizerTarget) this.f39809b.H()).showOptimizingPhotos();
                        } else {
                            ((PhotoOptimizerTarget) this.f39809b.H()).showCustomPhotos();
                        }
                    }
                    this.f39809b.m52973b(z);
                }

                public void onProfileUpdateFailed() {
                    boolean a = this.f39809b.f43289b.m41300a();
                    if (this.f39809b.H() != null) {
                        ((PhotoOptimizerTarget) this.f39809b.H()).showPhotoOptimizerUpdateFailure(a);
                        if (!a) {
                            ((PhotoOptimizerTarget) this.f39809b.H()).showCustomPhotos();
                        } else if (this.f39809b.f43289b.m41301b()) {
                            ((PhotoOptimizerTarget) this.f39809b.H()).showOptimizedPhotos();
                        } else {
                            ((PhotoOptimizerTarget) this.f39809b.H()).showOptimizingPhotos();
                        }
                    }
                }
            });
        }
    }

    /* renamed from: c */
    public boolean m52974c() {
        return this.f43289b.m41300a();
    }

    /* renamed from: b */
    public void m52973b(boolean z) {
        this.f43290c.m40477a(new SparksEvent("UserInteraction.EditProfile").put("category", "photoOptimizer").put("action", z ? "enable" : "disable"));
    }

    /* renamed from: a */
    public void m52967a(String str) {
        this.f43290c.m40477a(new SparksEvent("Profile.DeletePhoto").put("photoId", str));
    }

    /* renamed from: a */
    public void m52969a(String str, int i, int i2) {
        this.f43290c.m40477a(new SparksEvent("Profile.ChangePhotoOrder").put("photoId", str).put("fromIdx", i).put("toIdx", i2));
    }

    /* renamed from: a */
    public void m52968a(String str, int i) {
        this.f43290c.m40477a(new SparksEvent("Profile.AddPhoto").put("photoId", str).put(ManagerWebServices.PARAM_FROM, i));
    }

    /* renamed from: d */
    public void m52975d() {
        this.f43290c.m40477a(new SparksEvent("UserInteraction.Settings").put("category", 5).put("subcategory", 1));
    }
}
