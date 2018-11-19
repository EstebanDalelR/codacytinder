package com.tinder.profile.dialogs;

import android.app.Dialog;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import butterknife.BindView;
import butterknife.OnClick;
import com.tinder.profile.model.Profile;

public class ReportGroupMemberDialog extends Dialog {
    @BindView(2131362318)
    RecyclerView recyclerView;

    public interface ReportGroupMemberListener {
        void onGroupMemberSelectedForReporting(@NonNull Profile profile);
    }

    @OnClick({2131362317})
    void handleCancelClicked() {
        dismiss();
    }
}
