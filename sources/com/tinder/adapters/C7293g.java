package com.tinder.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.C0994i;
import com.bumptech.glide.load.resource.p028a.C1041b;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.C4331i;
import com.tinder.R;
import com.tinder.model.GalleryItem;
import com.tinder.views.RoundImageView;
import java.io.File;
import java.util.List;

/* renamed from: com.tinder.adapters.g */
public class C7293g extends Adapter<C7292a> {
    /* renamed from: a */
    private List<GalleryItem> f26393a;
    /* renamed from: b */
    private Context f26394b;

    /* renamed from: com.tinder.adapters.g$a */
    static class C7292a extends ViewHolder {
        /* renamed from: a */
        RoundImageView f26390a;
        /* renamed from: b */
        TextView f26391b;
        /* renamed from: c */
        TextView f26392c;

        C7292a(View view) {
            super(view);
            this.f26390a = (RoundImageView) view.findViewById(R.id.thumbnail_album);
            this.f26391b = (TextView) view.findViewById(R.id.text_albumName);
            this.f26392c = (TextView) view.findViewById(R.id.subtext_albumCount);
        }
    }

    public /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i) {
        m31185a((C7292a) viewHolder, i);
    }

    public /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m31183a(viewGroup, i);
    }

    public C7293g(Context context, List<GalleryItem> list) {
        this.f26394b = context;
        this.f26393a = list;
    }

    /* renamed from: a */
    public void m31186a(GalleryItem galleryItem) {
        this.f26393a.add(galleryItem);
        notifyItemInserted(this.f26393a.indexOf(galleryItem));
    }

    /* renamed from: a */
    public GalleryItem m31184a(int i) {
        return (GalleryItem) this.f26393a.get(i);
    }

    /* renamed from: a */
    public C7292a m31183a(ViewGroup viewGroup, int i) {
        return new C7292a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_view_album, viewGroup, false));
    }

    /* renamed from: a */
    public void m31185a(final C7292a c7292a, int i) {
        GalleryItem galleryItem = (GalleryItem) this.f26393a.get(i);
        int i2 = galleryItem.count;
        CharSequence charSequence = galleryItem.name;
        Object obj = galleryItem.url;
        CharSequence quantityString = this.f26394b.getResources().getQuantityString(R.plurals.photo_count_plural, i2, new Object[]{Integer.valueOf(i2)});
        c7292a.f26391b.setText(charSequence);
        c7292a.f26392c.setText(quantityString);
        c7292a.f26390a.setBackgroundResource(R.drawable.photo_placeholder);
        if (!TextUtils.isEmpty(obj)) {
            C0994i.b(this.f26394b).a(obj).a().b(new C4331i<ImageView, C1041b>(this, c7292a.f26390a) {
                /* renamed from: c */
                final /* synthetic */ C7293g f29371c;

                public /* synthetic */ void onResourceReady(Object obj, GlideAnimation glideAnimation) {
                    m35029a((C1041b) obj, glideAnimation);
                }

                /* renamed from: a */
                public void m35029a(C1041b c1041b, GlideAnimation<? super C1041b> glideAnimation) {
                    c7292a.f26390a.setImageDrawable(c1041b);
                    c7292a.f26390a.setBackgroundResource(R.color.transparent);
                }
            });
        } else if (galleryItem.filePath != null && new File(galleryItem.filePath).exists()) {
            C0994i.b(this.f26394b).a(new File(galleryItem.filePath)).a().b(new C4331i<ImageView, C1041b>(this, c7292a.f26390a) {
                /* renamed from: c */
                final /* synthetic */ C7293g f29373c;

                public /* synthetic */ void onResourceReady(Object obj, GlideAnimation glideAnimation) {
                    m35030a((C1041b) obj, glideAnimation);
                }

                /* renamed from: a */
                public void m35030a(C1041b c1041b, GlideAnimation<? super C1041b> glideAnimation) {
                    c7292a.f26390a.setImageDrawable(c1041b);
                    c7292a.f26390a.setBackgroundResource(R.color.transparent);
                }
            });
        }
    }

    public int getItemCount() {
        return this.f26393a.size();
    }
}
