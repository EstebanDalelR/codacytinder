package com.tinder.domain.boost.model;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\u001a\n\u0010\u0007\u001a\u00020\u0001*\u00020\b\u001a\n\u0010\t\u001a\u00020\n*\u00020\b\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"BOOST_MULT_FORMAT", "", "MAX_BOOST_MULT", "", "MIN_BOOST_MULT", "decimalFormat", "Ljava/text/DecimalFormat;", "multiplierString", "Lcom/tinder/domain/boost/model/BoostStatus;", "multiplierWithFallback", "", "domain_release"}, k = 2, mv = {1, 1, 10})
@JvmName(name = "BoostStatusExt")
public final class BoostStatusExt {
    private static final String BOOST_MULT_FORMAT = "#.0";
    private static final float MAX_BOOST_MULT = 10.0f;
    private static final float MIN_BOOST_MULT = 8.0f;
    private static final DecimalFormat decimalFormat = new DecimalFormat(BOOST_MULT_FORMAT);

    public static final double multiplierWithFallback(@NotNull BoostStatus boostStatus) {
        double d;
        C2668g.b(boostStatus, "$receiver");
        float nextFloat = (new Random().nextFloat() * 2.0f) + MIN_BOOST_MULT;
        if (boostStatus.getMultiplier() <= ((double) 0)) {
            d = (double) nextFloat;
        } else {
            d = boostStatus.getMultiplier();
        }
        return new BigDecimal(d).setScale(1, 4).doubleValue();
    }

    @NotNull
    public static final String multiplierString(@NotNull BoostStatus boostStatus) {
        C2668g.b(boostStatus, "$receiver");
        boostStatus = decimalFormat.format(multiplierWithFallback(boostStatus));
        C2668g.a(boostStatus, "decimalFormat.format(thi…multiplierWithFallback())");
        return boostStatus;
    }
}
