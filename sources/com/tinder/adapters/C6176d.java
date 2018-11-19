package com.tinder.adapters;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.tinder.R;
import com.tinder.passport.model.PassportLocation;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tinder.adapters.d */
public class C6176d extends BaseAdapter {
    /* renamed from: a */
    private List<PassportLocation> f22704a = new ArrayList();

    /* renamed from: com.tinder.adapters.d$a */
    private static class C6175a {
        /* renamed from: a */
        TextView f22702a;
        /* renamed from: b */
        TextView f22703b;

        private C6175a() {
        }
    }

    public long getItemId(int i) {
        return 0;
    }

    /* renamed from: a */
    public void m26750a(List<PassportLocation> list) {
        this.f22704a = list;
    }

    /* renamed from: a */
    public void m26749a() {
        this.f22704a = new ArrayList();
        notifyDataSetChanged();
    }

    public int getCount() {
        return this.f22704a != null ? this.f22704a.size() : 0;
    }

    public Object getItem(int i) {
        return this.f22704a.get(i);
    }

    @Nullable
    public View getView(int i, @Nullable View view, @NonNull ViewGroup viewGroup) {
        int i2 = 0;
        if (view == null || view.getTag() == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cell_location_search_result, viewGroup, false);
            viewGroup = new C6175a();
            viewGroup.f22702a = (TextView) view.findViewById(R.id.search_result_txtView_primary);
            viewGroup.f22703b = (TextView) view.findViewById(R.id.search_result_txtView_secondary);
            view.setTag(viewGroup);
        }
        i = ((PassportLocation) this.f22704a.get(i)).getLabels();
        viewGroup = TextUtils.isEmpty((CharSequence) i.second) ^ 1;
        C6175a c6175a = (C6175a) view.getTag();
        c6175a.f22702a.setText((CharSequence) i.first);
        TextView textView = c6175a.f22703b;
        if (viewGroup == null) {
            i2 = 8;
        }
        textView.setVisibility(i2);
        c6175a.f22703b.setText((CharSequence) i.second);
        return view;
    }
}
