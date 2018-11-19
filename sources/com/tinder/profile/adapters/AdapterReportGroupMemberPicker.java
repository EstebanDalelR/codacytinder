package com.tinder.profile.adapters;

import android.content.Context;
import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;
import com.tinder.domain.common.model.Photo;
import com.tinder.profile.model.Profile;
import com.tinder.views.AvatarView;
import java.util.List;

public class AdapterReportGroupMemberPicker extends Adapter<ViewHolder> {
    @NonNull
    /* renamed from: a */
    private final Context f49957a;
    @NonNull
    /* renamed from: b */
    private final List<Profile> f49958b;

    static class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        @BindView(2131362319)
        AvatarView avatarView;
        @BindView(2131362320)
        TextView username;

        ViewHolder(@NonNull View view) {
            super(view);
            ButterKnife.a(this, view);
        }
    }

    public class ViewHolder_ViewBinding implements Unbinder {
        /* renamed from: b */
        private ViewHolder f49956b;

        @UiThread
        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.f49956b = viewHolder;
            viewHolder.avatarView = (AvatarView) C0761c.b(view, R.id.dialog_report_user_picker_avatar, "field 'avatarView'", AvatarView.class);
            viewHolder.username = (TextView) C0761c.b(view, R.id.dialog_report_user_picker_name, "field 'username'", TextView.class);
        }

        @CallSuper
        public void unbind() {
            ViewHolder viewHolder = this.f49956b;
            if (viewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f49956b = null;
            viewHolder.avatarView = null;
            viewHolder.username = null;
        }
    }

    public /* synthetic */ void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewHolder, int i) {
        m60831a((ViewHolder) viewHolder, i);
    }

    public /* synthetic */ android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m60830a(viewGroup, i);
    }

    /* renamed from: a */
    public ViewHolder m60830a(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(this.f49957a).inflate(R.layout.row_report_user_picker, viewGroup, false));
    }

    /* renamed from: a */
    public void m60831a(ViewHolder viewHolder, int i) {
        Profile profile = (Profile) this.f49958b.get(i);
        viewHolder.avatarView.setAvatars(((Photo) profile.mo11656f().get(0)).url());
        viewHolder.username.setText(this.f49957a.getString(R.string.report_name, new Object[]{profile.mo11652b()}));
    }

    public int getItemCount() {
        return this.f49958b.size();
    }
}
