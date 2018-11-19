package com.tinder.listeners;

import com.tinder.enums.ReportCause;

public interface ListenerReportRec {
    void onReportFailed(String str);

    void onReportSuccess(String str, ReportCause reportCause, String str2);
}
