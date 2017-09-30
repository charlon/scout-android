package tabian.com.actionbar.Utils;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.util.Log;
import android.view.MenuItem;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

import tabian.com.actionbar.R;
import tabian.com.actionbar.ActivityFood;
import tabian.com.actionbar.ActivityStudy;
import tabian.com.actionbar.ActivityTech;
import tabian.com.actionbar.MainActivity;


public class BottomNavigationViewHelper {

    private static final String TAG = "BottomNavigationViewHel";

    public static void setupBottomNavigationView(BottomNavigationViewEx bottomNavigationViewEx){
        Log.d(TAG, "setupBottomNavigationView: Setting up BottomNavigationView");
        bottomNavigationViewEx.enableAnimation(false);
        bottomNavigationViewEx.enableItemShiftingMode(false);
        bottomNavigationViewEx.enableShiftingMode(false);
        bottomNavigationViewEx.setTextVisibility(true);
    }

    public static void enableNavigation(final Context context, BottomNavigationViewEx view){
        view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){

                    case R.id.ic_arrow:
                        Intent intent1 = new Intent(context, MainActivity.class);//ACTIVITY_NUM = 0
                        context.startActivity(intent1);
                        break;

                    case R.id.ic_android:
                        Intent intent2  = new Intent(context, ActivityFood.class);//ACTIVITY_NUM = 1
                        context.startActivity(intent2);
                        break;

                    case R.id.ic_books:
                        Intent intent3 = new Intent(context, ActivityStudy.class);//ACTIVITY_NUM = 2
                        context.startActivity(intent3);
                        break;

                    case R.id.ic_center_focus:
                        Intent intent4 = new Intent(context, ActivityTech.class);//ACTIVITY_NUM = 3
                        context.startActivity(intent4);
                        break;
                }


                return false;
            }
        });
    }
}
