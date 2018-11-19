package com.tinder.onboarding.presenter;

import com.tinder.onboarding.target.PhotoSourceSelectorTarget;
import com.tinder.presenters.PresenterBase;

public class gl extends PresenterBase<PhotoSourceSelectorTarget> {
    /* renamed from: b */
    public void m52836b() {
        PhotoSourceSelectorTarget photoSourceSelectorTarget = (PhotoSourceSelectorTarget) H();
        if (photoSourceSelectorTarget != null) {
            photoSourceSelectorTarget.showCameraClicked();
        }
    }

    /* renamed from: c */
    public void m52837c() {
        PhotoSourceSelectorTarget photoSourceSelectorTarget = (PhotoSourceSelectorTarget) H();
        if (photoSourceSelectorTarget != null) {
            photoSourceSelectorTarget.showGalleryClicked();
        }
    }
}
