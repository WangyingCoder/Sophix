# Sophix
这是一个阿里热修复Sophix和swipeRefreshLayout下拉刷新的demo
# 个人总结

1.本地调试成功，发布之后为什么热修复失败？

（1）Application类里的版本号要和发布版本一致。

原理：加载时候，根据versionName和后台版本比较，获取差异包。

（2）检查是否调用query方法。

SophixManager.getInstance().queryAndLoadNewPatch();

（3）下载补丁包网络延迟，一般延迟很短。

2.如果程序在下载补丁之后崩溃

下载完补丁，java崩溃一次清除补丁，native三次清除补丁

3.App在补丁发布之前已经崩了，用阿里热修复是不是就无法修复了？

是的，只要到首页不崩溃，提示一下就好了。
