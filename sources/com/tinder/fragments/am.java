package com.tinder.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.C0432b;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tinder.R;
import com.tinder.adapters.C7293g;
import com.tinder.interfaces.PhotoGalleryModel;
import com.tinder.interfaces.PhotoGalleryPresenter;
import com.tinder.interfaces.PhotoGalleryView;
import com.tinder.interfaces.PhotoUploadSelection;
import com.tinder.managers.FacebookManager;
import com.tinder.managers.LegacyBreadCrumbTracker;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.ae;
import com.tinder.model.GalleryItem;
import com.tinder.presenters.gg;
import com.tinder.utils.RecyclerItemClickListener;
import com.tinder.views.C17262e;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

public class am extends Fragment implements PhotoGalleryView {
    @Inject
    /* renamed from: a */
    FacebookManager f42202a;
    @Inject
    /* renamed from: b */
    LegacyBreadCrumbTracker f42203b;
    /* renamed from: c */
    private C7293g f42204c;
    /* renamed from: d */
    private RecyclerView f42205d;
    /* renamed from: e */
    private LinearLayoutManager f42206e;
    /* renamed from: f */
    private List<GalleryItem> f42207f;
    /* renamed from: g */
    private PhotoGalleryPresenter f42208g;
    /* renamed from: h */
    private PhotoGalleryModel f42209h;

    /* renamed from: com.tinder.fragments.am$a */
    private static class C13307a extends LinearLayoutManager {
        C13307a(Context context) {
            super(context);
        }
    }

    public void showDeviceGalleryError() {
    }

    public void showFacebookGalleryError() {
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        ManagerApp.e().inject(this);
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_photo_gallery, viewGroup, false);
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        bundle = new C17262e(getContext(), C0432b.a(getContext(), R.drawable.shape_grey_bar_thin));
        this.f42205d = (RecyclerView) view;
        this.f42206e = new C13307a(getContext());
        this.f42207f = new ArrayList();
        this.f42204c = new C7293g(getContext(), this.f42207f);
        this.f42205d.setLayoutManager(this.f42206e);
        this.f42205d.setAdapter(this.f42204c);
        this.f42205d.addItemDecoration(bundle);
        this.f42205d.addOnItemTouchListener(new RecyclerItemClickListener(getContext(), new an(this)));
        this.f42209h = new ae(getContext(), this.f42202a);
        this.f42208g = new gg(this, this.f42209h);
        this.f42208g.getDeviceGallery();
        this.f42208g.getFacebookGallery();
    }

    /* renamed from: a */
    final /* synthetic */ void m51513a(View view, int i) {
        ((PhotoUploadSelection) getActivity()).showAlbums(this.f42204c.a(i).source);
    }

    public void onResume() {
        super.onResume();
        this.f42203b.m40475a((Fragment) this);
    }

    public void showFacebookGallery(GalleryItem galleryItem) {
        this.f42204c.a(galleryItem);
    }

    public void showDeviceGallery(GalleryItem galleryItem) {
        this.f42204c.a(galleryItem);
    }
}
