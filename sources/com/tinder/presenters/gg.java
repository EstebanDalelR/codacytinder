package com.tinder.presenters;

import com.tinder.interfaces.PhotoGalleryModel;
import com.tinder.interfaces.PhotoGalleryModel.ListenerGallery;
import com.tinder.interfaces.PhotoGalleryPresenter;
import com.tinder.interfaces.PhotoGalleryView;
import com.tinder.model.GalleryItem;

public class gg implements PhotoGalleryPresenter {
    /* renamed from: a */
    private PhotoGalleryView f49915a;
    /* renamed from: b */
    private PhotoGalleryModel f49916b;

    /* renamed from: com.tinder.presenters.gg$1 */
    class C160511 implements ListenerGallery {
        /* renamed from: a */
        final /* synthetic */ gg f49913a;

        C160511(gg ggVar) {
            this.f49913a = ggVar;
        }

        public void onSuccess(GalleryItem galleryItem) {
            this.f49913a.f49915a.showFacebookGallery(galleryItem);
        }

        public void onFailure() {
            this.f49913a.f49915a.showFacebookGalleryError();
        }
    }

    /* renamed from: com.tinder.presenters.gg$2 */
    class C160522 implements ListenerGallery {
        /* renamed from: a */
        final /* synthetic */ gg f49914a;

        C160522(gg ggVar) {
            this.f49914a = ggVar;
        }

        public void onSuccess(GalleryItem galleryItem) {
            this.f49914a.f49915a.showDeviceGallery(galleryItem);
        }

        public void onFailure() {
            this.f49914a.f49915a.showDeviceGalleryError();
        }
    }

    public gg(PhotoGalleryView photoGalleryView, PhotoGalleryModel photoGalleryModel) {
        this.f49915a = photoGalleryView;
        this.f49916b = photoGalleryModel;
    }

    public void getFacebookGallery() {
        this.f49916b.getFacebookGallery(new C160511(this));
    }

    public void getDeviceGallery() {
        this.f49916b.getDeviceGallery(new C160522(this));
    }
}
