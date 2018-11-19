package com.tinder.adapters;

import android.support.annotation.CallSuper;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;
import com.tinder.model.SchoolDisplayType;
import com.tinder.profile.p366e.C14415f;
import com.tinder.profile.view.ProfileItemView;

public class SchoolsAdapter extends C7294i<C14415f, SchoolItemViewHolder> {
    @Nullable
    /* renamed from: a */
    private SchoolRowClickListener f28576a;

    public interface SchoolRowClickListener {
        void onSchoolRowClicked(C14415f c14415f, int i);
    }

    public class SchoolItemViewHolder extends ViewHolder {
        @Nullable
        /* renamed from: b */
        View f26366b;
        /* renamed from: c */
        final /* synthetic */ SchoolsAdapter f26367c;
        @BindView(2131362811)
        ViewStub contentStub;
        @BindString(2131821433)
        String noneText;
        @BindView(2131362810)
        ProfileItemView profileItemView;
        @BindString(2131821805)
        String schoolNotShown;

        SchoolItemViewHolder(SchoolsAdapter schoolsAdapter, ViewGroup viewGroup) {
            this.f26367c = schoolsAdapter;
            super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.view_job_item, viewGroup, false));
            ButterKnife.a(this, this.itemView);
        }

        SchoolItemViewHolder(SchoolsAdapter schoolsAdapter, ViewGroup viewGroup, @LayoutRes int i) {
            this(schoolsAdapter, viewGroup);
            this.contentStub.setLayoutResource(i);
            this.f26366b = this.contentStub.inflate();
        }

        /* renamed from: a */
        void m31171a(C14415f c14415f) {
            this.profileItemView.setText(c14415f.b() == SchoolDisplayType.NONE ? this.noneText : c14415f.c());
            this.profileItemView.setCheckVisible(c14415f.d());
            this.itemView.setOnClickListener(new C6177h(this, c14415f));
        }

        /* renamed from: a */
        final /* synthetic */ void m31172a(C14415f c14415f, View view) {
            if (this.f26367c.f28576a != null) {
                this.f26367c.f28576a.onSchoolRowClicked(c14415f, getAdapterPosition());
            }
        }

        /* renamed from: a */
        public void m31170a() {
            this.profileItemView.setCheckVisible(true);
        }

        /* renamed from: b */
        public void m31173b() {
            this.profileItemView.setCheckVisible(false);
        }
    }

    public class SchoolItemViewHolder_ViewBinding implements Unbinder {
        /* renamed from: b */
        private SchoolItemViewHolder f26368b;

        @UiThread
        public SchoolItemViewHolder_ViewBinding(SchoolItemViewHolder schoolItemViewHolder, View view) {
            this.f26368b = schoolItemViewHolder;
            schoolItemViewHolder.contentStub = (ViewStub) C0761c.b(view, R.id.job_item_stub, "field 'contentStub'", ViewStub.class);
            schoolItemViewHolder.profileItemView = (ProfileItemView) C0761c.b(view, R.id.job_item_profile_item, "field 'profileItemView'", ProfileItemView.class);
            view = view.getContext().getResources();
            schoolItemViewHolder.noneText = view.getString(R.string.none);
            schoolItemViewHolder.schoolNotShown = view.getString(R.string.school_isnt_shown);
        }

        @CallSuper
        public void unbind() {
            SchoolItemViewHolder schoolItemViewHolder = this.f26368b;
            if (schoolItemViewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f26368b = null;
            schoolItemViewHolder.contentStub = null;
            schoolItemViewHolder.profileItemView = null;
        }
    }

    /* renamed from: com.tinder.adapters.SchoolsAdapter$a */
    class C7965a extends SchoolItemViewHolder {
        /* renamed from: a */
        final /* synthetic */ SchoolsAdapter f28575a;

        C7965a(SchoolsAdapter schoolsAdapter, ViewGroup viewGroup, @LayoutRes int i) {
            this.f28575a = schoolsAdapter;
            super(schoolsAdapter, viewGroup, i);
            if (this.b != null) {
                ((TextView) this.b.findViewById(R.id.job_none_text)).setText(Html.fromHtml(this.schoolNotShown));
            }
        }
    }

    public /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i) {
        m33826a((SchoolItemViewHolder) viewHolder, i);
    }

    public /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m33825a(viewGroup, i);
    }

    /* renamed from: a */
    public SchoolItemViewHolder m33825a(ViewGroup viewGroup, int i) {
        switch (i) {
            case 1:
                return new SchoolItemViewHolder(this, viewGroup, R.layout.view_job_recycler_spacer);
            case 2:
                return new C7965a(this, viewGroup, R.layout.view_job_none_text);
            default:
                return new SchoolItemViewHolder(this, viewGroup);
        }
    }

    /* renamed from: a */
    public void m33826a(SchoolItemViewHolder schoolItemViewHolder, int i) {
        schoolItemViewHolder.m31171a((C14415f) m31187a(i));
    }

    public int getItemCount() {
        return m31188a().size();
    }

    public int getItemViewType(int i) {
        C14415f c14415f = (C14415f) m31187a(i);
        if (i == 0) {
            return 1;
        }
        return c14415f.b() == SchoolDisplayType.NONE ? 2 : 0;
    }

    /* renamed from: a */
    public void m33827a(@NonNull SchoolRowClickListener schoolRowClickListener) {
        this.f28576a = schoolRowClickListener;
    }
}
