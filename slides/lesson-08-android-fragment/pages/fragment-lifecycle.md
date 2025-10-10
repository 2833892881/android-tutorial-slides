# Fragment 生命周期流程图

<div class="flex flex-col items-center justify-center">
    <img src="/fragment-lifecycle-flowchart.png" width="360" />
</div>

---

- onAttach() - Fragment 与 Activity 关联时调用
- onCreate() - Fragment 创建时调用
- onCreateView() - 创建 Fragment 的视图层次结构
- onActivityCreated() - Activity 的 onCreate() 完成后调用
- onStart() - Fragment 可见时调用
- onResume() - Fragment 可交互时调用
- onPause() - Fragment 不再可交互时调用
- onStop() - Fragment 不可见时调用
- onDestroyView() - 移除与 Fragment 关联的视图层次结构
- onDestroy() - Fragment 状态最终清理时调用
- onDetach() - Fragment 与 Activity 解除关联时调用