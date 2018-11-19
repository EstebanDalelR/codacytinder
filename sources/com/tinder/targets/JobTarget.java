package com.tinder.targets;

import com.tinder.profile.p366e.C14413e;
import java.util.List;

public interface JobTarget {
    void exitScreen();

    void showJobs(List<C14413e> list);

    void showSavingJobError();

    void showSavingJobFinished();

    void updateSelectedRow(C14413e c14413e, C14413e c14413e2);
}
