package com.tinder.account.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.C0600i;
import android.view.View;
import android.view.ViewGroup;
import java.util.LinkedList;
import java.util.List;
import java8.util.Optional;

/* renamed from: com.tinder.account.view.e */
class C7274e extends C0600i {
    /* renamed from: a */
    private final List<UpdateAccountPage> f26187a = new LinkedList();

    /* renamed from: com.tinder.account.view.e$a */
    interface C6153a {
        View instantiate(@NonNull Context context);
    }

    C7274e() {
        this.f26187a.add(UpdateAccountPage.PASSWORD);
        this.f26187a.add(UpdateAccountPage.EMAIL);
    }

    /* renamed from: a */
    UpdateAccountPage m31097a(int i) {
        return (UpdateAccountPage) this.f26187a.get(i);
    }

    /* renamed from: a */
    Optional<Integer> m31098a(@NonNull UpdateAccountPage updateAccountPage) {
        updateAccountPage = this.f26187a.indexOf(updateAccountPage);
        return updateAccountPage >= null ? Optional.a(Integer.valueOf(updateAccountPage)) : Optional.a();
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        UpdateAccountPage updateAccountPage = (UpdateAccountPage) this.f26187a.get(i);
        View instantiate = updateAccountPage.instantiate(viewGroup.getContext());
        viewGroup.addView(instantiate);
        instantiate.setTag(updateAccountPage);
        return instantiate;
    }

    public int getCount() {
        return this.f26187a.size();
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    public boolean isViewFromObject(View view, Object obj) {
        if (view != obj) {
            if (((ViewGroup) obj).indexOfChild(view) < null) {
                return null;
            }
        }
        return true;
    }
}
