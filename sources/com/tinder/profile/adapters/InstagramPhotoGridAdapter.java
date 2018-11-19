package com.tinder.profile.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.util.C0562m;
import android.support.v4.view.C0600i;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.GridLayout;
import com.tinder.R;
import com.tinder.base.view.ProgressImageView;
import com.tinder.domain.common.model.Instagram.Photo;
import com.tinder.utils.ad;
import com.tinder.utils.av;
import java.util.ArrayList;
import java.util.List;

public class InstagramPhotoGridAdapter extends C0600i {
    /* renamed from: a */
    private int f49959a = 2;
    /* renamed from: b */
    private int f49960b = 3;
    /* renamed from: c */
    private int f49961c = 29;
    /* renamed from: d */
    private int f49962d;
    /* renamed from: e */
    private int f49963e;
    /* renamed from: f */
    private int f49964f;
    @Nullable
    /* renamed from: g */
    private List<Photo> f49965g;
    /* renamed from: h */
    private Context f49966h;
    /* renamed from: i */
    private int f49967i;
    /* renamed from: j */
    private int f49968j;
    /* renamed from: k */
    private int f49969k;
    /* renamed from: l */
    private int f49970l;
    /* renamed from: m */
    private int f49971m;
    /* renamed from: n */
    private int f49972n;
    /* renamed from: o */
    private int f49973o;
    /* renamed from: p */
    private int f49974p;
    /* renamed from: q */
    private int f49975q;
    /* renamed from: r */
    private int f49976r;
    /* renamed from: s */
    private boolean f49977s = true;
    /* renamed from: t */
    private boolean f49978t;
    /* renamed from: u */
    private ListenerPhotoClick f49979u;
    /* renamed from: v */
    private C0562m<Integer, Integer> f49980v;

    public interface ListenerPhotoClick {
        void onPhotoClick(int i, View view, int i2);

        void onViewMoreClick();
    }

    public int getItemPosition(Object obj) {
        return 0;
    }

    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public InstagramPhotoGridAdapter(Context context, ListenerPhotoClick listenerPhotoClick) {
        this.f49966h = context;
        this.f49979u = listenerPhotoClick;
        m60834e();
    }

    /* renamed from: a */
    public void m60839a(@Nullable List<Photo> list) {
        this.f49965g = list;
        if (list != null && list.size() > null) {
            list = this.f49965g.size();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("LTSMOOTH total# of photos we're working with: ");
            stringBuilder.append(list);
            ad.a(stringBuilder.toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append("LTSMOOTH photos per page determined by rows * columns: ");
            stringBuilder.append(this.f49963e);
            ad.a(stringBuilder.toString());
            if (list > this.f49961c) {
                list = this.f49961c;
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("LTSMOOTH number of photos to allow after comparing the total# of photos to the max# photos set ");
            stringBuilder.append(list);
            ad.a(stringBuilder.toString());
            int i = list / this.f49963e;
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("LTSMOOTH number of pages by dividing number of photos by photos per page ");
            stringBuilder2.append(i);
            ad.a(stringBuilder2.toString());
            if (list % this.f49963e == 0) {
                ad.a(String.format("LTSMOOTH modulus operation for %s mod %s came out to 0", new Object[]{Integer.valueOf(list), Integer.valueOf(this.f49963e)}));
                if (this.f49977s) {
                    ad.a("LTSMOOTH checked mAddAViewMoreButton true, adding 1");
                    i++;
                }
            } else {
                ad.a("LTSMOOTH modulus operation did not equal 0, add 1 page for the remaining photos");
                i++;
            }
            this.f49962d = i;
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append("LTSMOOTH after all that, we wind up with [");
            stringBuilder2.append(i);
            stringBuilder2.append("] pages");
            ad.a(stringBuilder2.toString());
            i = this.f49976r + (this.f49967i * 2);
            if (list <= this.f49963e) {
                this.f49974p = (((list / this.f49959a) + (list % this.f49959a)) * i) + this.f49970l;
            } else {
                this.f49974p = (this.f49959a * i) + this.f49970l;
            }
        }
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public int m60835a() {
        return this.f49974p;
    }

    /* renamed from: e */
    private void m60834e() {
        this.f49967i = (int) av.a(5.0f, this.f49966h);
        this.f49969k = (int) this.f49966h.getResources().getDimension(R.dimen.ig_padding_photo_placeholder);
        this.f49971m = (int) this.f49966h.getResources().getDimension(R.dimen.ig_grid_top_padding);
        this.f49972n = (int) this.f49966h.getResources().getDimension(R.dimen.ig_grid_bottom_padding);
        this.f49970l = this.f49971m + this.f49972n;
        this.f49973o = this.f49967i * 2;
        this.f49968j = (((this.f49960b - 1) * this.f49973o) + (this.f49969k * 2)) + (this.f49967i * 2);
        this.f49965g = new ArrayList();
        this.f49975q = (av.b() - this.f49968j) / this.f49960b;
        this.f49976r = this.f49975q;
        this.f49963e = this.f49959a * this.f49960b;
        this.f49980v = new C0562m();
    }

    /* renamed from: b */
    public int m60840b() {
        return this.f49959a;
    }

    /* renamed from: c */
    public int m60841c() {
        return this.f49960b;
    }

    public int getCount() {
        return this.f49962d;
    }

    public Object instantiateItem(@NonNull ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(this.f49966h).inflate(R.layout.grid_photos, viewGroup, false);
        GridLayout gridLayout = (GridLayout) inflate.findViewById(R.id.grid_instagram);
        gridLayout.setUseDefaultMargins(true);
        gridLayout.setColumnCount(this.f49960b);
        gridLayout.setRowCount(this.f49959a);
        gridLayout.setRowOrderPreserved(true);
        m60833a(gridLayout, i, this.f49962d);
        viewGroup.addView(inflate, 0);
        return inflate;
    }

    public void destroyItem(@NonNull ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((GridLayout) obj);
    }

    /* renamed from: a */
    public int m60836a(int i) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("getPageIndexByPhotoIndex pos: ");
        stringBuilder.append(i);
        ad.a(stringBuilder.toString());
        String str = "mMapPositionPage != null? [%s] ";
        Object[] objArr = new Object[1];
        objArr[0] = Boolean.valueOf(this.f49980v != null);
        ad.a(String.format(str, objArr));
        if (this.f49980v != null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("!mMapPositionPage.isEmpty():");
            stringBuilder.append(true ^ this.f49980v.isEmpty());
            ad.a(stringBuilder.toString());
            if (!this.f49980v.isEmpty()) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("mapposition page size:");
                stringBuilder.append(this.f49980v.size());
                ad.a(stringBuilder.toString());
            }
        }
        if (this.f49980v == null || this.f49980v.isEmpty()) {
            return 0;
        }
        return ((Integer) this.f49980v.get(Integer.valueOf(i))).intValue();
    }

    /* renamed from: a */
    private void m60833a(@NonNull GridLayout gridLayout, int i, int i2) {
        if (this.f49965g == null) {
            ad.c("mPhotos was null");
            return;
        }
        this.f49978t = false;
        this.f49964f = this.f49965g.size() > this.f49961c ? this.f49961c : this.f49965g.size();
        if (this.f49964f > 0) {
            int i3 = this.f49963e * i;
            int i4 = this.f49963e + i3;
            if (i + 1 == i2) {
                ad.a("projectZ on last page");
                this.f49978t = true;
                i4 = i3 + (this.f49964f % this.f49963e);
                if (this.f49977s != 0) {
                    i4++;
                }
            }
            while (i3 < i4) {
                i2 = new StringBuilder();
                i2.append("i:");
                i2.append(i3);
                ad.a(i2.toString());
                this.f49980v.put(Integer.valueOf(i3), Integer.valueOf(i));
                if (this.f49978t != 0 && i3 + 1 == i4 && this.f49977s != 0) {
                    ad.a("projectZ on last photo, adding button");
                    m60832a(gridLayout);
                    break;
                }
                i2 = LayoutInflater.from(this.f49966h).inflate(R.layout.instagram_photo_item_view, gridLayout, false);
                ProgressImageView progressImageView = (ProgressImageView) i2.findViewById(R.id.instagram_image_thumbnail);
                progressImageView.setOnClickListener(new C14361b(this, i3));
                LayoutParams layoutParams = new GridLayout.LayoutParams();
                layoutParams.height = this.f49976r;
                layoutParams.width = this.f49975q;
                layoutParams.setMargins(this.f49967i, this.f49967i, this.f49967i, this.f49967i);
                i2.setLayoutParams(layoutParams);
                gridLayout.addView(i2);
                gridLayout.setPadding(this.f49969k, this.f49971m, this.f49969k, this.f49972n);
                i2 = new StringBuilder();
                i2.append("LTSMOOTH getting url from object=");
                i2.append(i3);
                ad.a(i2.toString());
                i2 = ((Photo) this.f49965g.get(i3)).thumbnail();
                if (!TextUtils.isEmpty(i2)) {
                    progressImageView.a(i2, this.f49966h.getResources().getDrawable(R.drawable.instagram_failed_to_load_image));
                }
                i3++;
            }
        }
    }

    /* renamed from: a */
    final /* synthetic */ void m60837a(int i, View view) {
        if (this.f49965g == null) {
            ad.c("mPhotos was null");
            return;
        }
        int size = this.f49965g.size();
        if (size > this.f49961c) {
            size = this.f49961c;
        }
        this.f49979u.onPhotoClick(i, view, size);
    }

    /* renamed from: a */
    private void m60832a(@NonNull GridLayout gridLayout) {
        View inflate = LayoutInflater.from(this.f49966h).inflate(R.layout.instagram_view_more, gridLayout, false);
        LayoutParams layoutParams = new GridLayout.LayoutParams();
        layoutParams.width = this.f49975q;
        layoutParams.height = this.f49976r;
        inflate.setLayoutParams(layoutParams);
        inflate.setOnClickListener(new C14362c(this));
        gridLayout.addView(inflate);
    }

    /* renamed from: a */
    final /* synthetic */ void m60838a(View view) {
        this.f49979u.onViewMoreClick();
    }

    /* renamed from: d */
    public int m60842d() {
        return this.f49967i;
    }
}
