package com.tinder.interactors.p262a;

import com.tinder.api.model.location.LocationDetails;
import com.tinder.api.model.profile.Travel;
import com.tinder.api.model.profile.Travel.TravelLocationInfo;
import com.tinder.api.model.profile.Travel.TravelPosition;
import com.tinder.p238f.p240b.p241a.p242a.C9367c;
import com.tinder.p238f.p240b.p241a.p242a.C9367c.C9365a;
import com.tinder.p238f.p240b.p241a.p242a.C9367c.C9366b;
import com.tinder.passport.model.LocationName;
import com.tinder.passport.model.PassportLocation;

/* renamed from: com.tinder.interactors.a.e */
public class C9710e {
    /* renamed from: a */
    C9367c m40184a(Travel travel) {
        C9365a d = C9367c.m39217d();
        d.mo10354a(travel.isTraveling().booleanValue());
        TravelPosition travelPos = travel.travelPos();
        if (travel.travelPos() != null) {
            d.mo10352a(C9366b.m39214a(travelPos.lat().doubleValue(), travelPos.lon().doubleValue()));
        }
        if (!(travel.travelLocationInfo() == null || travel.travelLocationInfo().isEmpty())) {
            LocationName locationName;
            TravelLocationInfo travelLocationInfo = (TravelLocationInfo) travel.travelLocationInfo().get(0);
            PassportLocation passportLocation = new PassportLocation();
            passportLocation.setAddress(travelLocationInfo.streetAddress());
            LocationName locationName2 = new LocationName();
            locationName2.mLongName = travelLocationInfo.country().longName();
            locationName2.mShortName = travelLocationInfo.country().shortName();
            passportLocation.setCountry(locationName2);
            if (travelLocationInfo.route() != null) {
                locationName2 = new LocationName();
                locationName2.mLongName = travelLocationInfo.route().longName();
                locationName2.mShortName = travelLocationInfo.country().shortName();
                passportLocation.setRoute(locationName2);
            }
            if (travelLocationInfo.administrativeAreaLevel1() != null) {
                locationName2 = new LocationName();
                locationName2.mLongName = travelLocationInfo.administrativeAreaLevel1().longName();
                locationName2.mShortName = travelLocationInfo.administrativeAreaLevel1().shortName();
                passportLocation.setState(locationName2);
            }
            if (travelLocationInfo.administrativeAreaLevel2() != null) {
                locationName2 = new LocationName();
                locationName2.mLongName = travelLocationInfo.administrativeAreaLevel2().longName();
                locationName2.mShortName = travelLocationInfo.administrativeAreaLevel2().shortName();
                passportLocation.setCounty(locationName2);
            }
            LocationDetails street = travelLocationInfo.street();
            if (street != null) {
                locationName = new LocationName();
                locationName.mLongName = street.longName();
                locationName.mShortName = street.shortName();
                passportLocation.setStreetNumber(locationName);
            }
            street = travelLocationInfo.locality();
            if (street != null) {
                locationName = new LocationName();
                locationName.mLongName = street.longName();
                locationName.mShortName = street.shortName();
                passportLocation.setCity(locationName);
            }
            passportLocation.setLatitude(travelLocationInfo.lat());
            passportLocation.setLongitude(travelLocationInfo.lon());
            d.mo10353a(passportLocation);
        }
        return d.mo10355a();
    }
}
