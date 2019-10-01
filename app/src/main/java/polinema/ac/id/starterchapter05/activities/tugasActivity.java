package polinema.ac.id.starterchapter05.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;

import polinema.ac.id.starterchapter05.R;
import polinema.ac.id.starterchapter05.fragments.BlueFragment;
import polinema.ac.id.starterchapter05.fragments.RedFragment;
import polinema.ac.id.starterchapter05.fragments.fitnes;
import polinema.ac.id.starterchapter05.fragments.fitnesdips;
import polinema.ac.id.starterchapter05.fragments.fitnespushups;

public class tugasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tugas);
    }

    public void handlerPushups(View view) {
        Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.frameLayout3);
        if(fragment == null || fragment instanceof fitnesdips || fragment instanceof fitnes) {
            getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout3, new fitnespushups(), "PUSHUPS")
                    .setCustomAnimations(R.anim.enter_from_left,R.anim.exit_from_left,R.anim.enter_from_left,R.anim.exit_from_right)
                    .addToBackStack(null)
                    .commit();
        }
    }

    public void handlerDips(View view) {
        Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.frameLayout3);
        if(fragment == null || fragment instanceof fitnespushups || fragment instanceof fitnes) {
            getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout3, new fitnesdips(), "fitnes_dips")
                    .setCustomAnimations(R.anim.enter_from_left,R.anim.exit_from_left,R.anim.enter_from_left,R.anim.exit_from_right)
                    .addToBackStack(null)
                    .commit();
        }
    }
    public void handlerHandstand(View view) {
        Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.frameLayout3);
        if(fragment == null || fragment instanceof fitnespushups || fragment instanceof fitnesdips) {
            getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout3, new fitnes(), "handstand_fitnes")
                    .setCustomAnimations(R.anim.enter_from_left,R.anim.exit_from_left,R.anim.enter_from_left,R.anim.exit_from_right)
                    .addToBackStack(null)
                    .commit();
        }
    }
}
