用于加载过程  加载失败  加载异常  空数据的占位布局

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
        android:id="@+id/uaoanStatusLayoutView"/>
```



 **代码** 

```
显示没有网络
uaoanStatusLayoutView.setNoNnetworkWifi();

显示加载失败
uaoanStatusLayoutView.setError();

显示加载异常
uaoanStatusLayoutView.setNull();

显示无数据
uaoanStatusLayoutView.setDataVoid();

显示加载中
uaoanStatusLayoutView.setLoading();

布局点击重试
uaoanStatusLayoutView.setOnRootClickListener(new UaoanStatusLayoutView.OnRootClickListener() {
            @Override
            public void onRootClick(View view) {
                
            }
        });

```


| setNoNnetworkWifi | 显示没有网络 |
|-------------------|------|
| setError          | 显示加载失败 |
| setNull           | 显示加载异常 |
| setDataVoid       | 显示无数据  |
| setLoading        | 显示加载中  |


[AAR包下载](https://github.com/uaoan/-UaoanStatusLayout/blob/f345782ee38637c456e0304d834218208197aa9e/UaoanToolsLibrary-debug.aar)