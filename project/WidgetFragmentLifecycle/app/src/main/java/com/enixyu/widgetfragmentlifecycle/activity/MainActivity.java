package com.enixyu.widgetfragmentlifecycle.activity;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.enixyu.widgetfragmentlifecycle.R;
import com.enixyu.widgetfragmentlifecycle.fragment.HomeFragment;
import com.enixyu.widgetfragmentlifecycle.fragment.MessageFragment;
import com.enixyu.widgetfragmentlifecycle.fragment.ProfileFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {


  BottomNavigationView bottomNav;

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    bottomNav = findViewById(R.id.bottom_navigation);

    // 默认显示 HomeFragment
    switchTo(new HomeFragment());

    bottomNav.setOnItemSelectedListener(item -> {
      int id = item.getItemId();
      if (id == R.id.menu_home) {
        switchTo(new HomeFragment());
      } else if (id == R.id.menu_msg) {
        switchTo(new MessageFragment());
      } else if (id == R.id.menu_me) {
        switchTo(new ProfileFragment());
      }
      return true;
    });
  }

  private void switchTo(Fragment fragment) {
    getSupportFragmentManager()
        .beginTransaction()
        .replace(R.id.fragment_container, fragment)
        .commit();
  }
}
