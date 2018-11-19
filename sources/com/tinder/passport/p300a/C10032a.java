package com.tinder.passport.p300a;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.C0432b;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tinder.R;
import com.tinder.passport.model.PassportLocation;
import java.util.List;

/* renamed from: com.tinder.passport.a.a */
public class C10032a extends BaseAdapter {
    /* renamed from: a */
    public static int f32919a;
    /* renamed from: b */
    public static int f32920b;
    /* renamed from: c */
    public PassportLocation f32921c;
    /* renamed from: d */
    private List<PassportLocation> f32922d;

    /* renamed from: com.tinder.passport.a.a$a */
    public static class C10031a {
        /* renamed from: a */
        public TextView f32915a;
        /* renamed from: b */
        public TextView f32916b;
        /* renamed from: c */
        public ImageView f32917c;
        /* renamed from: d */
        public ImageView f32918d;
    }

    public long getItemId(int i) {
        return 0;
    }

    public C10032a(Context context, List<PassportLocation> list) {
        this.f32922d = list;
        f32919a = C0432b.c(context, R.color.premium_blue);
        f32920b = C0432b.c(context, R.color.gray_very_light);
    }

    /* renamed from: a */
    public void m41084a(@NonNull List<PassportLocation> list) {
        this.f32922d = list;
    }

    public int getCount() {
        return this.f32922d.size();
    }

    public Object getItem(int i) {
        return this.f32922d.get(i);
    }

    public View getView(int i, @Nullable View view, @NonNull ViewGroup viewGroup) {
        PassportLocation passportLocation;
        Pair labels;
        CharSequence charSequence;
        CharSequence addressShort;
        if (view != null) {
            if (view.getTag() != null) {
                viewGroup = (C10031a) view.getTag();
                passportLocation = (PassportLocation) this.f32922d.get(i);
                labels = passportLocation.getLabels();
                if (labels != null) {
                    charSequence = (String) labels.first;
                    if (!TextUtils.isEmpty((CharSequence) labels.second)) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(charSequence);
                        stringBuilder.append(", ");
                        stringBuilder.append((String) labels.second);
                        charSequence = stringBuilder.toString();
                    }
                    viewGroup.f32915a.setText(charSequence);
                    addressShort = passportLocation.getAddressShort();
                    if (TextUtils.isEmpty(addressShort)) {
                        viewGroup.f32916b.setText(addressShort);
                        viewGroup.f32916b.setVisibility(0);
                    } else {
                        viewGroup.f32916b.setVisibility(8);
                    }
                }
                if (this.f32921c != null || passportLocation.equals(this.f32921c) == 0) {
                    viewGroup.f32918d.setVisibility(4);
                    viewGroup.f32917c.setColorFilter(f32920b);
                } else {
                    viewGroup.f32918d.setVisibility(0);
                    viewGroup.f32917c.setColorFilter(f32919a);
                }
                return view;
            }
        }
        view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cell_recent_passport, viewGroup, false);
        viewGroup = new C10031a();
        viewGroup.f32915a = (TextView) view.findViewById(R.id.purchased_location_name);
        viewGroup.f32916b = (TextView) view.findViewById(R.id.purchased_location_street_address);
        viewGroup.f32917c = (ImageView) view.findViewById(R.id.purchased_location_img);
        viewGroup.f32918d = (ImageView) view.findViewById(R.id.purchased_location_check);
        view.setTag(viewGroup);
        passportLocation = (PassportLocation) this.f32922d.get(i);
        labels = passportLocation.getLabels();
        if (labels != null) {
            charSequence = (String) labels.first;
            if (TextUtils.isEmpty((CharSequence) labels.second)) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(charSequence);
                stringBuilder2.append(", ");
                stringBuilder2.append((String) labels.second);
                charSequence = stringBuilder2.toString();
            }
            viewGroup.f32915a.setText(charSequence);
            addressShort = passportLocation.getAddressShort();
            if (TextUtils.isEmpty(addressShort)) {
                viewGroup.f32916b.setVisibility(8);
            } else {
                viewGroup.f32916b.setText(addressShort);
                viewGroup.f32916b.setVisibility(0);
            }
        }
        if (this.f32921c != null) {
        }
        viewGroup.f32918d.setVisibility(4);
        viewGroup.f32917c.setColorFilter(f32920b);
        return view;
    }

    /* renamed from: a */
    public void m41083a(PassportLocation passportLocation) {
        this.f32921c = passportLocation;
        notifyDataSetChanged();
    }
}
