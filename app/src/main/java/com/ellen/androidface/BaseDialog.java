package com.ellen.androidface;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.view.View;

import java.lang.ref.WeakReference;

public abstract class BaseDialog {

    private AlertDialog dialog;
    private WeakReference<Context> contextWeakReference;
    private WeakReference<Activity> activityWeakReference;
    private OnDismissListener onDismissListener;

    public BaseDialog(Context context){
        contextWeakReference = new WeakReference<>(context);
        init();
    }

    public BaseDialog(Context context, Activity activity){
        contextWeakReference = new WeakReference<>(context);
        activityWeakReference = new WeakReference<>(activity);
        init();
    }

    private void init(){
        dialog = new AlertDialog.Builder(contextWeakReference.get()).create();
        View view = onCreateView();
        //设置布局
        dialog.setView(view);
        if(this instanceof ButterKnifeInterface){
            ButterKnifeInterface butterKnifeInterface = (ButterKnifeInterface) this;
            butterKnifeInterface.initButterKnife(view);
        }
        if(setCancelable() != null){
            dialog.setCancelable(setCancelable());
        }
        if(setCanceledOnTouchOutside() != null) {
            dialog.setCanceledOnTouchOutside(setCanceledOnTouchOutside());
        }

    }

    public void show(){
        showBefore();
        dialog.show();
        onResume();
    }

    public void dismiss(){
        dissmissBefore();
        if(this instanceof ButterKnifeInterface){
            ButterKnifeInterface butterKnifeInterface = (ButterKnifeInterface) this;
            butterKnifeInterface.unBindButterKnife();
        }
        dialog.dismiss();
        if(onDismissListener != null){
            onDismissListener.dismiss();
        }
        destory();
    }

    public Activity getActivity(){
        return activityWeakReference.get();
    }

    public Context getContext(){
        return contextWeakReference.get();
    }

    public OnDismissListener getOnDismissListener() {
        return onDismissListener;
    }

    public void setOnDismissListener(OnDismissListener onDismissListener) {
        this.onDismissListener = onDismissListener;
    }

    protected abstract View onCreateView();
    protected abstract void showBefore();
    protected abstract void onResume();
    protected abstract void dissmissBefore();
    protected abstract void destory();
    protected abstract Boolean setCancelable();
    protected abstract Boolean setCanceledOnTouchOutside();

    public interface ButterKnifeInterface{
        void initButterKnife(View view);
        void unBindButterKnife();
    }

    public interface OnDismissListener{
        void dismiss();
    }
}
