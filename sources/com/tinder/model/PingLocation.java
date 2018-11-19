package com.tinder.model;

public abstract class PingLocation {
    public abstract double displacementInMeters();

    public abstract double latitude();

    public abstract double longitude();

    public static PingLocation create(double d, double d2, double d3) {
        return new AutoValue_PingLocation(d, d2, d3);
    }
}
