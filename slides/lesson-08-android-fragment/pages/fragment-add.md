# 添加 Fragment 到 Activity

- 方式1: 静态添加（XML布局）

```xml
<!-- activity_main.xml -->
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent">
    <fragment
        android:id="@+id/myFragment"
        android:name="com.example.MyFragment"
        android:layout_width="match_parent"
        android:layout_height="match_parent" />
</LinearLayout>

```


- 方式2: 动态添加（代码）

```java
public class MainActivity extends AppCompatActivity { // FragmentTransaction 允许对 Fragment 执行添加、移除、替换(replace)等操作
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction(); 
        transaction.add(R.id.fragment_container, new MyFragment());
        transaction.commit();
    }
}

```
