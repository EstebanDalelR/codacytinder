package com.tinder.settings.adapters;

import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;
import com.tinder.settings.listeners.MoreGenderSearchOnClickListener;
import java.util.ArrayList;
import java.util.List;

public class MoreGenderSearchAdapter extends Adapter<SearchMoreGenderViewHolder> {
    /* renamed from: a */
    private List<String> f51451a = new ArrayList();
    /* renamed from: b */
    private MoreGenderSearchOnClickListener f51452b;

    public class SearchMoreGenderViewHolder extends ViewHolder {
        /* renamed from: a */
        final /* synthetic */ MoreGenderSearchAdapter f51449a;
        @BindView(2131362616)
        TextView mGender;

        public SearchMoreGenderViewHolder(final MoreGenderSearchAdapter moreGenderSearchAdapter, View view) {
            this.f51449a = moreGenderSearchAdapter;
            super(view);
            ButterKnife.a(this, view);
            view.setOnClickListener(new OnClickListener(this) {
                /* renamed from: b */
                final /* synthetic */ SearchMoreGenderViewHolder f46492b;

                public void onClick(View view) {
                    if (this.f46492b.f51449a.f51452b != null) {
                        this.f46492b.f51449a.f51452b.onGenderSelected(this.f46492b.mGender.getText().toString());
                    }
                }
            });
        }

        /* renamed from: a */
        public void m62049a(String str) {
            if (str != null) {
                this.mGender.setText(str);
            }
        }
    }

    public class SearchMoreGenderViewHolder_ViewBinding implements Unbinder {
        /* renamed from: b */
        private SearchMoreGenderViewHolder f51450b;

        @UiThread
        public SearchMoreGenderViewHolder_ViewBinding(SearchMoreGenderViewHolder searchMoreGenderViewHolder, View view) {
            this.f51450b = searchMoreGenderViewHolder;
            searchMoreGenderViewHolder.mGender = (TextView) C0761c.b(view, R.id.gender_value, "field 'mGender'", TextView.class);
        }

        @CallSuper
        public void unbind() {
            SearchMoreGenderViewHolder searchMoreGenderViewHolder = this.f51450b;
            if (searchMoreGenderViewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f51450b = null;
            searchMoreGenderViewHolder.mGender = null;
        }
    }

    public /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i) {
        m62053a((SearchMoreGenderViewHolder) viewHolder, i);
    }

    public /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m62051a(viewGroup, i);
    }

    /* renamed from: a */
    public void m62054a(MoreGenderSearchOnClickListener moreGenderSearchOnClickListener) {
        this.f51452b = moreGenderSearchOnClickListener;
    }

    /* renamed from: a */
    public void m62053a(SearchMoreGenderViewHolder searchMoreGenderViewHolder, int i) {
        if (!this.f51451a.isEmpty()) {
            searchMoreGenderViewHolder.m62049a((String) this.f51451a.get(i));
        }
    }

    public int getItemCount() {
        return this.f51451a.size();
    }

    /* renamed from: a */
    public SearchMoreGenderViewHolder m62051a(ViewGroup viewGroup, int i) {
        return new SearchMoreGenderViewHolder(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_search_gender, viewGroup, false));
    }

    /* renamed from: a */
    public void m62055a(@NonNull List<String> list) {
        this.f51451a.clear();
        this.f51451a.addAll(list);
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public void m62052a() {
        this.f51451a.clear();
        notifyDataSetChanged();
    }
}
