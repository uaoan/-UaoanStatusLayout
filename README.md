用于加载过程  加载失败  加载异常  空数据的占位布局


### 集成
 **1.在 project 的 build.gradle 文件中找到 allprojects{} 代码块添加以下代码：** 

```
allprojects {
    repositories {
        mavenCentral()
        maven { url 'https://jitpack.io' }      //增加 jitPack Maven 仓库
    }
}
```
 **在 app 的 build.gradle 文件中找到 dependencies{} 代码块，并在其中加入以下语句：** 

```
implementation 'com.github.uaoan:-UaoanStatusLayout:1.1'
```


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
自定义图像、文本
uaoanStatusLayoutView.showNewCustom(R.mipmap.ic_launcher,"加载失败");

传入自定义布局
View view=uaoanStatusLayoutView.showLayoutView(R.layout.layout,this); 

布局点击重试
uaoanStatusLayoutView.setOnRootClickListener(new UaoanStatusLayoutView.OnRootClickListener() {
            @Override
            public void onRootClick(View view) {
                
            }
        });

```





