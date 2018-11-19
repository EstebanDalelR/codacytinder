package com.tinder.profile.adapters;

import android.content.Context;
import android.support.v4.view.C0600i;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bumptech.glide.C0994i;
import com.tinder.R;
import com.tinder.domain.common.model.Instagram.Photo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u000fH\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0011H\u0016J\u0018\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u001aH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/tinder/profile/adapters/InstagramPhotoAdapter;", "Landroid/support/v4/view/PagerAdapter;", "context", "Landroid/content/Context;", "photos", "", "Lcom/tinder/domain/common/model/Instagram$Photo;", "listenerPhoto", "Landroid/view/View$OnClickListener;", "(Landroid/content/Context;Ljava/util/List;Landroid/view/View$OnClickListener;)V", "destroyItem", "", "container", "Landroid/view/ViewGroup;", "position", "", "view", "", "getCount", "instantiateItem", "Landroid/view/View;", "isViewFromObject", "", "object", "loadPhoto", "photo", "Landroid/widget/ImageView;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.profile.adapters.a */
public final class C16072a extends C0600i {
    /* renamed from: a */
    private final Context f49981a;
    /* renamed from: b */
    private final List<Photo> f49982b;
    /* renamed from: c */
    private final OnClickListener f49983c;

    public boolean isViewFromObject(@NotNull View view, @NotNull Object obj) {
        C2668g.b(view, "view");
        C2668g.b(obj, "object");
        return view == obj;
    }

    public /* synthetic */ Object instantiateItem(ViewGroup viewGroup, int i) {
        return m60844a(viewGroup, i);
    }

    public C16072a(@NotNull Context context, @NotNull List<? extends Photo> list, @NotNull OnClickListener onClickListener) {
        C2668g.b(context, "context");
        C2668g.b(list, "photos");
        C2668g.b(onClickListener, "listenerPhoto");
        this.f49981a = context;
        this.f49982b = list;
        this.f49983c = onClickListener;
    }

    public int getCount() {
        return this.f49982b.size();
    }

    @NotNull
    /* renamed from: a */
    public View m60844a(@NotNull ViewGroup viewGroup, int i) {
        C2668g.b(viewGroup, "container");
        ImageView imageView = new ImageView(this.f49981a);
        m60843a((Photo) this.f49982b.get(i), imageView);
        imageView.setOnClickListener(this.f49983c);
        View view = imageView;
        viewGroup.addView(view, 0);
        return view;
    }

    public void destroyItem(@NotNull ViewGroup viewGroup, int i, @NotNull Object obj) {
        C2668g.b(viewGroup, "container");
        C2668g.b(obj, "view");
        viewGroup.removeView((View) obj);
    }

    /* renamed from: a */
    private final void m60843a(Photo photo, ImageView imageView) {
        String image = photo.image();
        if (image == null) {
            image = photo.thumbnail();
        }
        if (image != null) {
            C0994i.b(this.f49981a).a(image).l().b(R.drawable.instagram_failed_to_load_image).b().a(imageView);
        }
    }
}
