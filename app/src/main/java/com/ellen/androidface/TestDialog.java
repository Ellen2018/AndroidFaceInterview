package com.ellen.androidface;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

public class TestDialog extends BaseDialog implements BaseDialog.ButterKnifeInterface {

    public TestDialog(Context context) {
        super(context);
    }

    @Override
    protected View onCreateView() {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.dialog_test,null);
        return view;
    }

    @Override
    protected void showBefore() {

    }

    @Override
    protected void onResume() {

    }

    @Override
    protected void dissmissBefore() {

    }

    @Override
    protected void destory() {

    }

    @Override
    protected Boolean setCancelable() {
        return null;
    }

    @Override
    protected Boolean setCanceledOnTouchOutside() {
        return null;
    }

    @Override
    public void initButterKnife(View view) {

    }

    @Override
    public void unBindButterKnife() {

    }
}
