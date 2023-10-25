package com.uaoanlao.tools.View;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.uaoanlao.tooll.R;

/**
 * TODO: document your custom view class.
 */
//布局状态
public class UaoanStatusLayoutView extends LinearLayout {
    private RelativeLayout root_view;
    private LinearLayout void_wifi; //无网络
    private LinearLayout void_no;  //加载失败
    private LinearLayout void_null;  //加载异常
    private LinearLayout void_void;  //无数据
    private LinearLayout pressedlinear;  //加载中
    public UaoanStatusLayoutView(Context context) {
        super(context);
        init(context);
    }
    public UaoanStatusLayoutView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public UaoanStatusLayoutView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(context);
    }

    public void init(Context context) {
        final View view= LayoutInflater.from(context).inflate(R.layout.sample_uaoan_status_layout_view,this);
        root_view=view.findViewById(R.id.root_view);
        void_wifi=view.findViewById(R.id.void_wifi);
        void_no=view.findViewById(R.id.void_no);
        void_null=view.findViewById(R.id.void_null);
        void_void=view.findViewById(R.id.void_void);
        pressedlinear=view.findViewById(R.id.pressedlinear);
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
    public void setNoNnetworkWifi() {
            void_wifi.setVisibility(View.VISIBLE);
            void_no.setVisibility(View.GONE);
            void_null.setVisibility(View.GONE);
            void_void.setVisibility(View.GONE);
            pressedlinear.setVisibility(View.GONE);
    }
    //加载失败
    public void setError() {
            void_wifi.setVisibility(View.GONE);
            void_no.setVisibility(View.VISIBLE);
            void_null.setVisibility(View.GONE);
            void_void.setVisibility(View.GONE);
            pressedlinear.setVisibility(View.GONE);
    }
    //加载异常
    public void setNull() {
            void_wifi.setVisibility(View.GONE);
            void_no.setVisibility(View.GONE);
            void_null.setVisibility(View.VISIBLE);
            void_void.setVisibility(View.GONE);
            pressedlinear.setVisibility(View.GONE);
    }
    //无数据
    public void setDataVoid() {
            void_wifi.setVisibility(View.GONE);
            void_no.setVisibility(View.GONE);
            void_null.setVisibility(View.GONE);
            void_void.setVisibility(View.VISIBLE);
            pressedlinear.setVisibility(View.GONE);
    }

    //加载中
    public void setLoading() {
            void_wifi.setVisibility(View.GONE);
            void_no.setVisibility(View.GONE);
            void_null.setVisibility(View.GONE);
            void_void.setVisibility(View.GONE);
            pressedlinear.setVisibility(View.VISIBLE);
    }

    //设置点击接口
    OnRootClickListener onRootClickListener;
    public void setOnRootClickListener(OnRootClickListener onClickListener){
        onRootClickListener=onClickListener;
    }
    public interface OnRootClickListener{
        void onRootClick(View view);
    }

}