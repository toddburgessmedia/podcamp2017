package com.toddburgessmedia.podcamphelloworld;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Todd Burgess (todd@toddburgessmedia.com on 23/02/17.
 */

public class PowerReceiver extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {

        Log.d("PodCampApp", intent.getAction());
        if (intent.getAction().equals("android.intent.action.ACTION_POWER_CONNECTED")) {
            Toast.makeText(context, R.string.power_connect, Toast.LENGTH_SHORT).show();
        }
    }
}
