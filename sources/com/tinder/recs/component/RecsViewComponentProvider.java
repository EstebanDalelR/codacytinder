package com.tinder.recs.component;

import android.support.annotation.NonNull;

public interface RecsViewComponentProvider {
    @NonNull
    RecsViewComponent getRecsViewComponent();

    void setRecsViewComponent(@NonNull RecsViewComponent recsViewComponent);
}
