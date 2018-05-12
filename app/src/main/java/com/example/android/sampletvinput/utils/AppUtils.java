package com.example.android.sampletvinput.utils;

import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Configuration;
import android.support.annotation.NonNull;


public class AppUtils {
    public static boolean isTV(@NonNull Context context) {
        UiModeManager uiModeManager =
                (UiModeManager) context.getSystemService(Context.UI_MODE_SERVICE);
        return uiModeManager.getCurrentModeType() == Configuration.UI_MODE_TYPE_TELEVISION;
    }
}
