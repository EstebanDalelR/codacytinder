package com.tinder.listeners;

import com.tinder.enums.ReportCause;

public interface ListenerReportUser {
    void onReportUser(ReportCause reportCause, String str, boolean z);
}
