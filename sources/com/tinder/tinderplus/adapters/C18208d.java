package com.tinder.tinderplus.adapters;

import android.os.Build.VERSION;
import android.support.annotation.NonNull;
import android.support.v4.view.ViewCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.C0994i;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.tinder.R;
import com.tinder.paywall.p304b.C12265d;
import com.tinder.paywall.viewmodels.C10093o;
import com.tinder.paywall.viewmodels.C12288d;
import com.tinder.paywall.viewmodels.C12290f;
import com.tinder.views.C15443d;
import java.util.List;
import jp.wasabeef.glide.transformations.C17541b;

/* renamed from: com.tinder.tinderplus.adapters.d */
public class C18208d extends C12265d {
    public C18208d(@NonNull List<C10093o> list) {
        super(list);
        this.d = this.a.getColor(R.color.white);
        this.e = this.a.getColor(R.color.white);
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.paywall_perk, viewGroup, false);
        C10093o a = a(i);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.paywall_perk_image);
        TextView textView = (TextView) inflate.findViewById(R.id.paywall_perk_title);
        TextView textView2 = (TextView) inflate.findViewById(R.id.paywall_perk_byline);
        a(inflate, i);
        textView.setText(a.c());
        textView2.setText(a.d());
        textView.setTextColor(this.d);
        textView2.setTextColor(this.e);
        if (a.e() != 0) {
            inflate.setBackground(a.e());
        }
        imageView.setContentDescription(a.d());
        if ((a instanceof C12288d) != 0) {
            imageView.setImageResource(((C12288d) a).b());
        } else if ((a instanceof C12290f) != 0) {
            i = Math.round(this.a.getDimension(R.dimen.space_s));
            imageView.setPadding(i, i, i, i);
            ViewCompat.i(imageView, this.a.getDimension(R.dimen.space_xs));
            if (VERSION.SDK_INT >= 21) {
                imageView.setOutlineProvider(new C15443d());
            }
            C0994i.b(inflate.getContext()).a((String) ((C12290f) a).b().get(0)).l().b().a(new Transformation[]{new C17541b(inflate.getContext())}).a(DiskCacheStrategy.SOURCE).a(imageView);
        }
        a(inflate);
        viewGroup.addView(inflate);
        return inflate;
    }
}
