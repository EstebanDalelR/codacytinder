package com.tinder.managers;

import android.content.Context;
import android.support.annotation.NonNull;
import com.tinder.R;
import com.tinder.interfaces.PhotoGalleryModel;
import com.tinder.interfaces.PhotoGalleryModel.ListenerFacebookPhotos;
import com.tinder.interfaces.PhotoGalleryModel.ListenerGallery;
import com.tinder.model.FacebookAlbum;
import com.tinder.model.GalleryItem;
import com.tinder.model.GalleryItem.Source;
import com.tinder.utils.C15370u;
import java.util.List;

public class ae implements PhotoGalleryModel {
    /* renamed from: a */
    private FacebookManager f38996a;
    /* renamed from: b */
    private Context f38997b;

    public ae(Context context, FacebookManager facebookManager) {
        this.f38997b = context;
        this.f38996a = facebookManager;
    }

    public void getFacebookGallery(@NonNull final ListenerGallery listenerGallery) {
        this.f38996a.m40471a(new ListenerFacebookPhotos(this) {
            /* renamed from: b */
            final /* synthetic */ ae f38995b;

            public void onSuccess(List<FacebookAlbum> list, FacebookAlbum facebookAlbum) {
                GalleryItem galleryItem = new GalleryItem();
                galleryItem.name = this.f38995b.f38997b.getString(R.string.facebook);
                int i = 0;
                for (FacebookAlbum facebookAlbum2 : list) {
                    i += facebookAlbum2.count;
                }
                if (!list.isEmpty()) {
                    galleryItem.url = ((FacebookAlbum) list.get(0)).thumbnailUrl;
                }
                galleryItem.count = i + facebookAlbum.count;
                galleryItem.source = Source.Facebook;
                listenerGallery.onSuccess(galleryItem);
            }

            public void onFailure() {
                listenerGallery.onFailure();
            }
        });
    }

    public void getDeviceGallery(ListenerGallery listenerGallery) {
        GalleryItem a = C15370u.a(this.f38997b);
        if (a != null) {
            listenerGallery.onSuccess(a);
        }
    }
}
