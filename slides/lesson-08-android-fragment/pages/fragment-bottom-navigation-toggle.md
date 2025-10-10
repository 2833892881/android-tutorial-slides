# Fragment 底部导航切换

- 效果：

  📱 点击底部按钮，切换不同 Fragment（首页 / 消息）

- 实现思路：

  创建二个 Fragment（Home、Message）

  使用 BottomNavigationView

  监听菜单切换

  activity_main.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:orientation="vertical"
    android:layout_width="match_parent"
    android:layout_height="match_parent">
```

---

```xml
    <FrameLayout
        android:id="@+id/fragment_container"
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="1" />

    <com.google.android.material.bottomnavigation.BottomNavigationView
        android:id="@+id/bottom_navigation"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        app:menu="@menu/bottom_nav_menu" />

</LinearLayout>
```
  res/menu/bottom_nav_menu.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<menu xmlns:android="http://schemas.android.com/apk/res/android">
    <item
        android:id="@+id/menu_home"
        android:title="首页"/>
    <item
        android:id="@+id/menu_msg"
        android:title="消息"/>
</menu>
```
---

  MainActivity.java
```java
package com.example.fragmentdemo;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNav = findViewById(R.id.bottom_navigation);

        // 默认显示 HomeFragment
        switchTo(new HomeFragment());

        bottomNav.setOnItemSelectedListener(item -> {
                if (id == R.id.menu_home) {
                    switchTo(new HomeFragment());
                } else if (id == R.id.menu_msg) {
                    switchTo(new MessageFragment());
                }
            }
            return true;
        });
    }
```
---

```java
    private void switchTo(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .commit();
    }
}
```

  HomeFragment.java
```java
package com.example.fragmentdemo;

public class HomeFragment extends Fragment {

    public HomeFragment() { }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }
}
```
---

  MessageFragment.java
```java
package com.example.fragmentdemo;

public class MessageFragment extends Fragment {

    public MessageFragment() { }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_message, container, false);
    }
}
```

  res/layout/fragment_home.xml
```xml
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:orientation="vertical"
    android:gravity="center"
    android:layout_width="match_parent"
    android:layout_height="match_parent">
```

---

```xml
    <TextView
        android:textSize="24sp"
        android:textColor="#000000"
        android:layout_height="wrap_content"
        android:layout_width="wrap_content"
        android:text="首页 Fragment"/>
</LinearLayout>
```

  res/layout/fragment_message.xml
```xml
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:orientation="vertical"
    android:gravity="center"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <TextView
        android:textSize="24sp"
        android:textColor="#000000"
        android:layout_height="wrap_content"
        android:layout_width="wrap_content"
        android:text="消息 Fragment"/>
</LinearLayout>
```

---

<div v-click style="margin-top: 15px; border-left: 5px solid #3498db; background: #f0f8ff; padding: 10px 15px; border-radius: 4px; display: inline-block;width: 800px;"> 
练习：

1. 创建一个包含两个 Fragment 的 Activity

    (1)FragmentA：显示“你好，我是 A”

    (2)FragmentB：显示“你好，我是 B”
2. 点击按钮切换 Fragment
3. 使用 Toast 显示当前 Fragment 名称
</div>