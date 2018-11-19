package com.foursquare.internal.network;

public enum FoursquareError {
    NETWORK_UNAVAILABLE,
    SSL_EXCEPTION,
    IO_EXCEPTION,
    FORCED_FAIL,
    SOCKET_TIMEOUT,
    SOCKET_ERROR,
    LOCATION_SERVICES_DISABLED,
    NO_LOCATION,
    CLIENT_UNKNOWN,
    BAD_REQUEST,
    NOT_AUTHORIZED,
    FORBIDDEN,
    SERVER_ISSUE,
    CONFLICT,
    UPLOAD_FAILED,
    NO_RESPONSE,
    SERVER_UNKNOWN,
    NO_ERROR,
    NOT_FOUND;

    public static boolean isClientError(FoursquareError foursquareError) {
        if (!(foursquareError == NETWORK_UNAVAILABLE || foursquareError == SSL_EXCEPTION || foursquareError == IO_EXCEPTION || foursquareError == FORCED_FAIL || foursquareError == SOCKET_TIMEOUT || foursquareError == SOCKET_ERROR || foursquareError == LOCATION_SERVICES_DISABLED || foursquareError == NO_LOCATION)) {
            if (foursquareError != CLIENT_UNKNOWN) {
                return null;
            }
        }
        return true;
    }

    public static boolean canRetryOnError(FoursquareError foursquareError) {
        return (foursquareError == BAD_REQUEST || foursquareError == NOT_AUTHORIZED || foursquareError == FORBIDDEN || foursquareError == NOT_FOUND) ? null : true;
    }
}
