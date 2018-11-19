package com.tinder.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.bumptech.glide.C0994i;
import com.bumptech.glide.load.resource.p028a.C1041b;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.C4331i;
import com.tinder.R;
import com.tinder.model.FacebookAlbum;
import com.tinder.views.RoundImageView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tinder.adapters.b */
public class C6173b extends BaseAdapter {
    @NonNull
    /* renamed from: a */
    private final Context f22699a;
    @NonNull
    /* renamed from: b */
    private final LayoutInflater f22700b;
    /* renamed from: c */
    private List<FacebookAlbum> f22701c = new ArrayList();

    /* renamed from: com.tinder.adapters.b$a */
    static class C6172a {
        /* renamed from: a */
        RoundImageView f22696a;
        /* renamed from: b */
        TextView f22697b;
        /* renamed from: c */
        TextView f22698c;

        C6172a() {
        }
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public /* synthetic */ Object getItem(int i) {
        return m26746a(i);
    }

    public C6173b(@NonNull Context context) {
        this.f22699a = context;
        this.f22700b = LayoutInflater.from(context);
    }

    /* renamed from: a */
    public void m26748a(List<FacebookAlbum> list) {
        this.f22701c = list;
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public void m26747a(FacebookAlbum facebookAlbum, int i) {
        this.f22701c.add(i, facebookAlbum);
        notifyDataSetChanged();
    }

    public int getCount() {
        return this.f22701c.size();
    }

    /* renamed from: a */
    public FacebookAlbum m26746a(int i) {
        return (FacebookAlbum) this.f22701c.get(i);
    }

    @Nullable
    public View getView(int i, @Nullable View view, ViewGroup viewGroup) {
        if (view == null) {
            view = new C6172a();
            View inflate = this.f22700b.inflate(R.layout.row_view_album, viewGroup, false);
            view.f22696a = (RoundImageView) inflate.findViewById(R.id.thumbnail_album);
            view.f22697b = (TextView) inflate.findViewById(R.id.text_albumName);
            view.f22698c = (TextView) inflate.findViewById(R.id.subtext_albumCount);
            inflate.setTag(view);
            view = inflate;
        }
        final C6172a c6172a = (C6172a) view.getTag();
        FacebookAlbum facebookAlbum = (FacebookAlbum) this.f22701c.get(i);
        int i2 = facebookAlbum.count;
        CharSequence charSequence = facebookAlbum.name;
        i = facebookAlbum.thumbnailUrl;
        CharSequence quantityString = this.f22699a.getResources().getQuantityString(R.plurals.photo_count_plural, i2, new Object[]{Integer.valueOf(i2)});
        c6172a.f22697b.setText(charSequence);
        c6172a.f22698c.setText(quantityString);
        c6172a.f22696a.setBackgroundResource(R.drawable.photo_placeholder);
        if (!TextUtils.isEmpty(i)) {
            C0994i.b(this.f22699a).a(i).a().b(new C4331i<RoundImageView, C1041b>(this, c6172a.f22696a) {
                /* renamed from: c */
                final /* synthetic */ C6173b f29369c;

                public /* synthetic */ void onResourceReady(Object obj, GlideAnimation glideAnimation) {
                    m35028a((C1041b) obj, glideAnimation);
                }

                /* renamed from: a */
                public void m35028a(C1041b c1041b, GlideAnimation<? super C1041b> glideAnimation) {
                    c6172a.f22696a.setImageDrawable(c1041b);
                    c6172a.f22696a.setBackgroundResource(R.color.transparent);
                }
            });
        }
        return view;
    }
}
