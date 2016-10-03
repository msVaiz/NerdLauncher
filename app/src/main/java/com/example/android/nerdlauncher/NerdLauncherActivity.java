package com.example.android.nerdlauncher;

import android.support.v4.app.Fragment;
import android.util.Log;

public class NerdLauncherActivity extends SingleFragmentActivity {

    public static final String TAG = "NL: NLActivity";

    @Override
    protected Fragment createFragment() {
        Log.d(TAG, "createFragment");
        return NerdLauncherFragment.newInstance();
    }
}
