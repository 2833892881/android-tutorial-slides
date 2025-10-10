# Fragment 概述

- Fragment：是Android3.0开始新增的概念，意为碎片。Fragment是依赖于Activity的，不能独立存在的。

- Activity界面中的一部分，可理解为模块化的Activity
  
  Fragment不能独立存在，必须嵌入到Activity中
  Fragment具有自己的生命周期，接收它自己的事件，并可以在Activity运行时被添加或删除
  Fragment的生命周期直接受所在的Activity的影响。如：当Activity暂停时，它拥有的所有Fragment们都暂停

- 为什么要有Fragment?
  
  Android运行在各种各样的设备中，有小屏幕的手机，还有大屏幕的平板，电视等。同样的界面在手机上显示可能很好看，在大屏幕的平板上就未必了，手机的界面放在平板上可能会有过分被拉长、控件间距过大等情况。针对屏幕尺寸的差距，Fragment的出现能做到一个App可以同时适应手机和平板。这就是为什么要有Fragment的原因。
  
---

- 在手机效果：
<div class="flex flex-col items-center justify-center">
    <img src="/fragement-overview-1.png" width="350" />
</div>

- 没用碎片在平板效果：
<div class="flex flex-col items-center justify-center">
    <img src="/fragement-overview-2.png" width="350" />
</div>

---

- 用碎片在平板效果：
<div class="flex flex-col items-center justify-center">
    <img src="/fragement-overview-3.png" width="350" />
</div>
