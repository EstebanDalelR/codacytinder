package com.tinder.adapters;

import android.content.Context;
import android.support.annotation.Nullable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.m4b.maps.GoogleMap.InfoWindowAdapter;
import com.google.android.m4b.maps.model.Marker;
import com.tinder.R;
import com.tinder.passport.model.PassportLocation;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tinder.adapters.e */
public class C7291e implements InfoWindowAdapter {
    /* renamed from: a */
    private Context f26388a;
    /* renamed from: b */
    private Map<Marker, PassportLocation> f26389b = new HashMap();

    @Nullable
    public View getInfoContents(Marker marker) {
        return null;
    }

    public C7291e(Context context) {
        this.f26388a = context;
    }

    public View getInfoWindow(Marker marker) {
        View inflate = View.inflate(this.f26388a, R.layout.view_map_info_window, null);
        TextView textView = (TextView) inflate.findViewById(R.id.map_info_window_text_first);
        TextView textView2 = (TextView) inflate.findViewById(R.id.map_info_window_text_second);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.map_info_chevron);
        PassportLocation passportLocation = (PassportLocation) this.f26389b.get(marker);
        if (passportLocation != null) {
            marker = passportLocation.getLabels();
            String str = (String) marker.first;
            String str2 = (String) marker.second;
            if (TextUtils.isEmpty(str)) {
                textView.setText(R.string.no_location_found);
                textView2.setVisibility(8);
                imageView.setVisibility(8);
            } else {
                String string = this.f26388a.getResources().getString(R.string.go_to_location, new Object[]{str});
                CharSequence spannableString = new SpannableString(string);
                spannableString.setSpan(new StyleSpan(1), string.indexOf(str), string.length(), 0);
                textView.setText(spannableString);
                if (TextUtils.isEmpty(str2)) {
                    textView2.setVisibility(8);
                } else {
                    textView2.setText(str2);
                }
                imageView.setVisibility(0);
            }
        } else {
            marker = new SpannableString(this.f26388a.getString(R.string.searching));
            marker.setSpan(new StyleSpan(1), 0, marker.length(), 0);
            textView.setText(marker);
            textView2.setVisibility(8);
            imageView.setVisibility(8);
        }
        return inflate;
    }

    /* renamed from: a */
    public void m31181a(@Nullable Marker marker, PassportLocation passportLocation) {
        if (marker != null) {
            this.f26389b.put(marker, passportLocation);
        }
    }

    /* renamed from: a */
    public PassportLocation m31179a(Marker marker) {
        return (PassportLocation) this.f26389b.get(marker);
    }

    /* renamed from: b */
    public boolean m31182b(Marker marker) {
        return this.f26389b.remove(marker) != null ? true : null;
    }

    /* renamed from: a */
    public void m31180a() {
        this.f26389b.clear();
    }
}
