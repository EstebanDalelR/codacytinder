package com.foursquare.api.types;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class StopDetect implements Parcelable, FoursquareType {
    public static final Creator<StopDetect> CREATOR = new C19061();
    private int accelCeil;
    private int accelLag;
    private double accelSigma;
    private int accelW;
    private int backgroundTimer;
    private int fastestInterval;
    private double highThres;
    private int locLag;
    private double lowThres;
    private double posSigma;
    private long sampleRate;
    private int speedLag;
    private int speedW;
    private double velSigma;

    /* renamed from: com.foursquare.api.types.StopDetect$1 */
    class C19061 implements Creator<StopDetect> {
        C19061() {
        }

        public StopDetect createFromParcel(Parcel parcel) {
            return new StopDetect(parcel);
        }

        public StopDetect[] newArray(int i) {
            return new StopDetect[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public StopDetect(Parcel parcel) {
        this.locLag = parcel.readInt();
        this.speedLag = parcel.readInt();
        this.accelLag = parcel.readInt();
        this.accelCeil = parcel.readInt();
        this.accelW = parcel.readInt();
        this.speedW = parcel.readInt();
        this.fastestInterval = parcel.readInt();
        this.lowThres = parcel.readDouble();
        this.highThres = parcel.readDouble();
        this.sampleRate = parcel.readLong();
        this.backgroundTimer = parcel.readInt();
        this.posSigma = parcel.readDouble();
        this.velSigma = parcel.readDouble();
        this.accelSigma = parcel.readDouble();
    }

    public double getPosSigma() {
        return this.posSigma;
    }

    public void setPosSigma(double d) {
        this.posSigma = d;
    }

    public double getVelSigma() {
        return this.velSigma;
    }

    public void setVelSigma(double d) {
        this.velSigma = d;
    }

    public double getAccelSigma() {
        return this.accelSigma;
    }

    public void setAccelSigma(double d) {
        this.accelSigma = d;
    }

    public void setLocLag(int i) {
        this.locLag = i;
    }

    public int getLocLag() {
        return this.locLag;
    }

    public void setSpeedLag(int i) {
        this.speedLag = i;
    }

    public int getSpeedLag() {
        return this.speedLag;
    }

    public void setFastestIntervalInSeconds(int i) {
        this.fastestInterval = i;
    }

    public int getFastestIntervalInSeconds() {
        return this.fastestInterval;
    }

    public void setLowThres(double d) {
        this.lowThres = d;
    }

    public double getLowThres() {
        return this.lowThres;
    }

    public void setHighThres(double d) {
        this.highThres = d;
    }

    public double getHighThres() {
        return this.highThres;
    }

    public long getSampleRateInSeconds() {
        return this.sampleRate;
    }

    public void setSampleRateInSeconds(long j) {
        this.sampleRate = j;
    }

    public int getBackgroundTimerInSeconds() {
        return this.backgroundTimer;
    }

    public void setBackgroundTimerInSeconds(int i) {
        this.backgroundTimer = i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.locLag);
        parcel.writeInt(this.speedLag);
        parcel.writeInt(this.accelLag);
        parcel.writeInt(this.accelCeil);
        parcel.writeInt(this.accelW);
        parcel.writeInt(this.speedW);
        parcel.writeInt(this.fastestInterval);
        parcel.writeDouble(this.lowThres);
        parcel.writeDouble(this.highThres);
        parcel.writeLong(this.sampleRate);
        parcel.writeInt(this.backgroundTimer);
        parcel.writeDouble(this.posSigma);
        parcel.writeDouble(this.velSigma);
        parcel.writeDouble(this.accelSigma);
    }
}
