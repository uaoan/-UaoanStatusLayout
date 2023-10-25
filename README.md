用于加载过程  加载失败  加载异常  空数据的占位布局


[AAR包下载](https://gitee.com/yuxyu47/UaoanStatusLayout/raw/master/UaoanStatusLayoutLibrary.aar)


### 无网络
![无网络](https://foruda.gitee.com/images/1698236726878310557/e9eb0a7a_4828217.jpeg "nowifi.jpg")
### 加载异常
![加载异常](https://foruda.gitee.com/images/1698236772195747866/63853cf0_4828217.jpeg "yc.jpg")
### 加载失败
![加载失败](https://foruda.gitee.com/images/1698236809751356685/2cbec36e_4828217.jpeg "sb.jpg")
### 无数据
![无数据](https://foruda.gitee.com/images/1698236874269040536/545deed7_4828217.jpeg "void.jpg")
### 加载中
![加载中](https://foruda.gitee.com/images/1698236887145073492/b8ca74c7_4828217.jpeg "loading.jpg")


### 使用方法
 **添加控件**
 
```
  <com.uaoanlao.tools.View.UaoanStatusLayoutView
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:id="@+id/uaoanStatusLayoutView">
        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:orientation="vertical">

        </LinearLayout>
    </com.uaoanlao.tools.View.UaoanStatusLayoutView>
```



 **代码** 

```
显示没有网络
uaoanStatusLayoutView.showNnetworkWifi();

关闭所有
uaoanStatusLayoutView.showNone();

显示加载失败
uaoanStatusLayoutView.showError();

显示加载异常
uaoanStatusLayoutView.showNull();

显示无数据
uaoanStatusLayoutView.showDataVoid();

显示加载中
uaoanStatusLayoutView.showLoading();

布局点击重试
uaoanStatusLayoutView.setOnRootClickListener(new UaoanStatusLayoutView.OnRootClickListener() {
            @Override
            public void onRootClick(View view) {
                
            }
        });

```




[AAR包下载](https://gitee.com/yuxyu47/UaoanStatusLayout/raw/master/UaoanStatusLayoutLibrary.aar)