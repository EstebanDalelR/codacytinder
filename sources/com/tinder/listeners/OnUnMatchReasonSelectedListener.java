package com.tinder.listeners;

import com.tinder.enums.ReportCause;
import javax.annotation.Nullable;

public interface OnUnMatchReasonSelectedListener {
    void onUnMatchReasonSelected(@Nullable ReportCause reportCause, String str);
}
