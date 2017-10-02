package charlon.com.scout.Utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.util.Log;
import android.view.MenuItem;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

import charlon.com.scout.R;
import charlon.com.scout.ActivityFood;
import charlon.com.scout.ActivityStudy;
import charlon.com.scout.ActivityTech;
import charlon.com.scout.MainActivity;


public class BottomNavigationViewHelper {

    private static final String TAG = "BottomNavigationViewHel";

    public static void setupBottomNavigationView(BottomNavigationViewEx bottomNavigationViewEx){
        Log.d(TAG, "setupBottomNavigationView: Setting up BottomNavigationView");
        bottomNavigationViewEx.enableAnimation(false);
        bottomNavigationViewEx.enableItemShiftingMode(false);
        bottomNavigationViewEx.enableShiftingMode(false);
        bottomNavigationViewEx.setTextVisibility(true);
    }

    public static void enableNavigation(final Context context, final Activity callingActivity, BottomNavigationViewEx view){
        view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){

                    case R.id.ic_arrow:
                        Intent intent1 = new Intent(context, MainActivity.class);//ACTIVITY_NUM = 0
                        intent1.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                        context.startActivity(intent1);
                        callingActivity.overridePendingTransition(0,0);
                        break;

                    case R.id.ic_android:
                        Intent intent2  = new Intent(context, ActivityFood.class);//ACTIVITY_NUM = 1
                        intent2.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                        context.startActivity(intent2);
                        callingActivity.overridePendingTransition(0,0);
                        break;

                    case R.id.ic_books:
                        Intent intent3 = new Intent(context, ActivityStudy.class);//ACTIVITY_NUM = 2
                        intent3.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                        context.startActivity(intent3);
                        callingActivity.overridePendingTransition(0,0);
                        break;

                    case R.id.ic_center_focus:
                        Intent intent4 = new Intent(context, ActivityTech.class);//ACTIVITY_NUM = 3
                        intent4.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                        context.startActivity(intent4);
                        callingActivity.overridePendingTransition(0,0);
                        break;
                }


                return false;
            }
        });
    }
}
