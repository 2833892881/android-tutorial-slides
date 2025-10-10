# 创建 Fragment

- 创建 Fragment 类

```java
public class MyFragment extends Fragment {
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // 膨胀 Fragment 的布局
        return inflater.inflate(R.layout.fragment_my, container, false);
    }
    
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        // 初始化视图组件
        Button button = view.findViewById(R.id.button);
        button.setOnClickListener(v -> {
            // 处理点击事件
        });
    }
}
```
---

- 创建 Fragment 布局文件
  
  res/layout/fragment_my.xml:

```xml
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical">
    
    <Button
        android:id="@+id/button"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Click Me" />
</LinearLayout>
```
