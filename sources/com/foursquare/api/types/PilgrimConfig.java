package com.foursquare.api.types;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.NonNull;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class PilgrimConfig implements Parcelable, FoursquareType {
    public static final Creator<PilgrimConfig> CREATOR = new C19031();
    private final boolean androidDoWorkInJobService;
    private final boolean androidSchedulePeriodicLocationJob;
    private final boolean collectBatteryLevels;
    private final boolean collectHistory;
    private final boolean collectMotionHistory;
    private final boolean collectSignalHistory;
    private final boolean enableMallMode;
    private final Set<String> experiments;
    private final double minimumBatteryLevel;
    private final NextPing nextPing;
    private final StopDetect stopDetect;
    private final StopDetectionAlgorithm stopDetectionAlgo;
    private final boolean useActivityRecognition;
    private final boolean useElapsedNanos;

    /* renamed from: com.foursquare.api.types.PilgrimConfig$1 */
    class C19031 implements Creator<PilgrimConfig> {
        C19031() {
        }

        public PilgrimConfig createFromParcel(Parcel parcel) {
            return new PilgrimConfig(parcel);
        }

        public PilgrimConfig[] newArray(int i) {
            return new PilgrimConfig[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    private PilgrimConfig(Parcel parcel) {
        this.nextPing = (NextPing) parcel.readParcelable(NextPing.class.getClassLoader());
        this.stopDetect = (StopDetect) parcel.readParcelable(StopDetect.class.getClassLoader());
        this.minimumBatteryLevel = parcel.readDouble();
        boolean z = false;
        this.collectBatteryLevels = parcel.readInt() == 1;
        this.collectHistory = parcel.readInt() == 1;
        this.collectMotionHistory = parcel.readInt() == 1;
        this.collectSignalHistory = parcel.readInt() == 1;
        this.stopDetectionAlgo = (StopDetectionAlgorithm) parcel.readParcelable(StopDetectionAlgorithm.class.getClassLoader());
        this.useElapsedNanos = parcel.readInt() == 1;
        this.androidSchedulePeriodicLocationJob = parcel.readInt() == 1;
        this.androidDoWorkInJobService = parcel.readInt() == 1;
        this.enableMallMode = parcel.readInt() == 1;
        if (parcel.readInt() == 1) {
            z = true;
        }
        this.useActivityRecognition = z;
        this.experiments = new LinkedHashSet(parcel.createStringArrayList());
    }

    public NextPing getNextPing() {
        return this.nextPing;
    }

    public StopDetect getStopDetect() {
        return this.stopDetect;
    }

    public double getMinimumBatteryLevel() {
        return this.minimumBatteryLevel;
    }

    public StopDetectionAlgorithm getStopDetectionAlgo() {
        return this.stopDetectionAlgo;
    }

    public boolean shouldCollectBatteryLevels() {
        return this.collectBatteryLevels;
    }

    public boolean shouldCollectHistory() {
        return this.collectHistory;
    }

    public boolean shouldCollectMotionHistory() {
        return this.collectMotionHistory;
    }

    public boolean shouldCollectSignalHistory() {
        return this.collectSignalHistory;
    }

    public boolean useElapsedNanos() {
        return this.useElapsedNanos;
    }

    public boolean shouldSchedulerPeriodicLocationJob() {
        return this.androidSchedulePeriodicLocationJob;
    }

    public boolean shouldDoWorkInJobScheduler() {
        return this.androidDoWorkInJobService;
    }

    public boolean shouldEnableMallMode() {
        return this.enableMallMode;
    }

    public boolean shouldUseActivityRecognition() {
        return this.useActivityRecognition;
    }

    @NonNull
    public Set<String> getExperiments() {
        return this.experiments != null ? this.experiments : new LinkedHashSet();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.nextPing, i);
        parcel.writeParcelable(this.stopDetect, i);
        parcel.writeDouble(this.minimumBatteryLevel);
        parcel.writeInt(this.collectBatteryLevels);
        parcel.writeInt(this.collectHistory);
        parcel.writeInt(this.collectMotionHistory);
        parcel.writeInt(this.collectSignalHistory);
        parcel.writeParcelable(this.stopDetectionAlgo, i);
        parcel.writeInt(this.useElapsedNanos);
        parcel.writeInt(this.androidSchedulePeriodicLocationJob);
        parcel.writeInt(this.androidDoWorkInJobService);
        parcel.writeInt(this.enableMallMode);
        parcel.writeInt(this.useActivityRecognition);
        parcel.writeStringList(new ArrayList(this.experiments));
    }
}
