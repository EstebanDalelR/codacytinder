package com.tinder.targets;

import com.tinder.profile.p366e.C14415f;
import java.util.List;

public interface SchoolTarget {
    void exitScreen();

    void showSavingSchoolError();

    void showSavingSchoolFinished();

    void showSchools(List<C14415f> list);

    void updateSelectedRow();
}
