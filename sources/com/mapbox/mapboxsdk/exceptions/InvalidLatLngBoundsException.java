package com.mapbox.mapboxsdk.exceptions;

public class InvalidLatLngBoundsException extends RuntimeException {
    public InvalidLatLngBoundsException(int i) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot create a LatLngBounds from ");
        stringBuilder.append(i);
        stringBuilder.append(" items");
        super(stringBuilder.toString());
    }
}
