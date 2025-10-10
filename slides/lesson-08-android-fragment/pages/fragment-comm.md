# Fragment 与 Activity 通信

- 接口回调

  在 Fragment 中定义接口：

```java
public interface OnMessageSendListener {
    void onMessageSend(String msg);
}
```

  在 Activity 中实现接口：

```java
public class MainActivity extends AppCompatActivity implements OnMessageSendListener {

    @Override
    public void onMessageSend(String msg) {
        Toast.makeText(this, "收到消息: " + msg, Toast.LENGTH_SHORT).show();
    }
}
```
---

  在 Fragment 中使用回调：
```java
OnMessageSendListener listener;

@Override
public void onAttach(@NonNull Context context) {
    super.onAttach(context);
    listener = (OnMessageSendListener) context;
}

@Override
public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.fragment_send, container, false);
    Button btn = view.findViewById(R.id.btn_send);
    btn.setOnClickListener(v -> listener.onMessageSend("你好，Activity！"));
    return view;
}
```
