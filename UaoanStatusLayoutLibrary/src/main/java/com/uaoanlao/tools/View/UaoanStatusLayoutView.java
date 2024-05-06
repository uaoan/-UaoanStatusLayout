package com.uaoanlao.tools.View;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.uaoanlao.tooll.R;

/**
 * TODO: document your custom view class.
 */
//布局状态
public class UaoanStatusLayoutView extends LinearLayout {
    private LinearLayout root_view;
    private LinearLayout void_wifi; //无网络
    private LinearLayout void_no;  //加载失败
    private LinearLayout void_null;  //加载异常
    private LinearLayout void_void;  //无数据
    private LinearLayout pressedlinear;  //加载中
    private TextView void_content; //空数据文本
    private ImageView void_image; //空数据图像
    private TextView new_content; //自定义数据文本
    private ImageView new_image; //自定义数据图像
    private TextView new_start;
    private Context mContext;
    public UaoanStatusLayoutView(Context context) {
        super(context);
        init(context);
        mContext=context;
    }
    public UaoanStatusLayoutView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
        mContext=context;
    }

    public UaoanStatusLayoutView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(context);
        mContext=context;
    }

    public void init(Context context) {
        final View view= LayoutInflater.from(context).inflate(R.layout.sample_uaoan_status_layout_view,this);
        root_view=view.findViewById(R.id.root_view);
        void_wifi=view.findViewById(R.id.void_wifi);
        void_no=view.findViewById(R.id.void_no);
        void_null=view.findViewById(R.id.void_null);
        void_void=view.findViewById(R.id.void_void);
        pressedlinear=view.findViewById(R.id.pressedlinear);
        void_content=view.findViewById(R.id.void_content);
        new_image=view.findViewById(R.id.new_image);
        new_content=view.findViewById(R.id.new_content);
        void_image=view.findViewById(R.id.void_image);
        root_view.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (void_void.getVisibility()!=View.VISIBLE && pressedlinear.getVisibility()!=View.VISIBLE ){
                onRootClickListener.onRootClick(v);
                }
            }
        });
    }



    //没有网络
    public void showNnetworkWifi() {
            void_wifi.setVisibility(View.VISIBLE);
            void_no.setVisibility(View.GONE);
            void_null.setVisibility(View.GONE);
            void_void.setVisibility(View.GONE);
            pressedlinear.setVisibility(View.GONE);
        setParamsLayouts2();
    }
    //加载失败
    public void showError() {
            void_wifi.setVisibility(View.GONE);
            void_no.setVisibility(View.VISIBLE);
            void_null.setVisibility(View.GONE);
            void_void.setVisibility(View.GONE);
            pressedlinear.setVisibility(View.GONE);
        setParamsLayouts2();
    }
    //加载异常
    public void showNull() {
            void_wifi.setVisibility(View.GONE);
            void_no.setVisibility(View.GONE);
            void_null.setVisibility(View.VISIBLE);
            void_void.setVisibility(View.GONE);
            pressedlinear.setVisibility(View.GONE);
        setParamsLayouts2();
    }
    //无数据
    public void showDataVoid() {
            void_wifi.setVisibility(View.GONE);
            void_no.setVisibility(View.GONE);
            void_null.setVisibility(View.GONE);
            void_void.setVisibility(View.VISIBLE);
            pressedlinear.setVisibility(View.GONE);
        setParamsLayouts2();
    }

    //加载中
    public void showLoading() {
            void_wifi.setVisibility(View.GONE);
            void_no.setVisibility(View.GONE);
            void_null.setVisibility(View.GONE);
            void_void.setVisibility(View.GONE);
            pressedlinear.setVisibility(View.VISIBLE);
            setParamsLayouts2();
    }
    //显示完成
    public void showNone() {
        void_wifi.setVisibility(View.GONE);
        void_no.setVisibility(View.GONE);
        void_null.setVisibility(View.GONE);
        void_void.setVisibility(View.GONE);
        pressedlinear.setVisibility(View.GONE);
        setParamsLayouts1();
    }


    //自定义数据
    public void showNewCustom(int image, String content) {
        new_image.setImageResource(image);
        new_content.setText(content);
        void_wifi.setVisibility(VISIBLE);
        void_no.setVisibility(GONE);
        void_null.setVisibility(GONE);
        void_void.setVisibility(GONE);
        pressedlinear.setVisibility(GONE);
        setParamsLayouts2();
    }

    //自定义传入布局

    public View showLayoutView(int layout, Activity activity) {
        void_content.setVisibility(GONE);
        void_image.setVisibility(GONE);
        void_wifi.setVisibility(GONE);
        void_no.setVisibility(GONE);
        void_null.setVisibility(GONE);
        void_void.setVisibility(VISIBLE);
        pressedlinear.setVisibility(GONE);
        setParamsLayouts2();
        View void_view = activity.getLayoutInflater().inflate(layout, (ViewGroup) null);
        void_void.addView(void_view);
        return void_view;
    }


    //设置点击接口
    OnRootClickListener onRootClickListener;
    public void setOnRootClickListener(OnRootClickListener onClickListener){
        onRootClickListener=onClickListener;
    }
    public interface OnRootClickListener{
        void onRootClick(View view);
    }
    private void setParamsLayouts1(){
        setParamsLayout(void_wifi,0);
        setParamsLayout(void_no,0);
        setParamsLayout(void_null,0);
        setParamsLayout(void_void,0);
        setParamsLayout(pressedlinear,0);
        setParamsLayout(root_view,0);
    }

    private void setParamsLayouts2(){
        setParamsLayout(void_wifi,LinearLayout.LayoutParams.MATCH_PARENT);
        setParamsLayout(void_no,LinearLayout.LayoutParams.MATCH_PARENT);
        setParamsLayout(void_null,LinearLayout.LayoutParams.MATCH_PARENT);
        setParamsLayout(void_void,LinearLayout.LayoutParams.MATCH_PARENT);
        setParamsLayout(pressedlinear,LinearLayout.LayoutParams.MATCH_PARENT);
        setParamsLayout(root_view,LinearLayout.LayoutParams.MATCH_PARENT);
    }
    private void setParamsLayout(View linearLayout,int point){
        ViewGroup.LayoutParams layoutParams1 = linearLayout.getLayoutParams();
        layoutParams1.width = point;
        layoutParams1.height=point;
        linearLayout.setLayoutParams(layoutParams1);
    }

}