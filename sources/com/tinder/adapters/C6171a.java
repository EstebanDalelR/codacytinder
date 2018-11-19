package com.tinder.adapters;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.bumptech.glide.C0994i;
import com.tinder.R;
import com.tinder.model.FacebookPhoto;
import com.tinder.utils.ad;
import com.tinder.utils.av;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tinder.adapters.a */
public class C6171a extends BaseAdapter {
    @NonNull
    /* renamed from: a */
    private final Activity f22692a;
    @NonNull
    /* renamed from: b */
    private final LayoutInflater f22693b;
    /* renamed from: c */
    private final int f22694c;
    /* renamed from: d */
    private List<FacebookPhoto> f22695d = new ArrayList();

    /* renamed from: com.tinder.adapters.a$a */
    static class C6170a {
        @Nullable
        /* renamed from: a */
        View f22690a;
        /* renamed from: b */
        ImageView f22691b;

        C6170a() {
        }
    }

    public C6171a(@NonNull Activity activity) {
        this.f22692a = activity;
        this.f22693b = LayoutInflater.from(activity);
        this.f22694c = av.a(activity).x / 3;
    }

    /* renamed from: a */
    public void m26744a(@NonNull List<FacebookPhoto> list) {
        this.f22695d.addAll(list);
        notifyDataSetChanged();
    }

    public int getCount() {
        return this.f22695d.size();
    }

    public Object getItem(int i) {
        return this.f22695d.get(i);
    }

    public long getItemId(int i) {
        return (long) ((FacebookPhoto) this.f22695d.get(i)).hashCode();
    }

    @Nullable
    public View getView(int i, @Nullable View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f22693b.inflate(R.layout.griditem_photo, viewGroup, false);
            viewGroup = new C6170a();
            viewGroup.f22690a = view;
            viewGroup.f22691b = (ImageView) view.findViewById(R.id.gridphoto);
            view.setTag(viewGroup);
        }
        C6170a c6170a = (C6170a) view.getTag();
        C0994i.a(this.f22692a).a(((FacebookPhoto) this.f22695d.get(i)).thumbnailUrl).a().a(c6170a.f22691b);
        if (c6170a.f22690a != 0) {
            if (c6170a.f22691b != 0) {
                c6170a.f22690a.setMinimumHeight(this.f22694c);
                c6170a.f22690a.setMinimumWidth(this.f22694c);
                c6170a.f22691b.setMinimumWidth(this.f22694c);
                c6170a.f22691b.setMinimumHeight(this.f22694c);
                c6170a.f22691b.setBackgroundResource(R.color.gray_very_light);
                return view;
            }
        }
        ad.c("Layout or image was null");
        return 0;
    }

    /* renamed from: a */
    public String m26743a(int i) {
        return ((FacebookPhoto) this.f22695d.get(i)).sourceUrl;
    }

    /* renamed from: b */
    public String m26745b(int i) {
        return ((FacebookPhoto) this.f22695d.get(i)).id;
    }
}
