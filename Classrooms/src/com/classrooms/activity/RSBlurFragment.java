package com.classrooms.activity;

import android.R;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Bundle;
import android.renderscript.Allocation;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;

public class RSBlurFragment extends Fragment{
	    private ImageView image;
	    private View view;

	    
	//    @Override
	//    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
	//        View view = inflater.inflate(R.layout.fragment_layout, container, false);
	//        image = (ImageView) view.findViewById(R.id.picture);
	//        text = (TextView) view.findViewById(R.id.text);
	//        statusText = addStatusText((ViewGroup) view.findViewById(R.id.controls));
	 //       applyBlur();
	//        return view;
	//    }

	    public void applyBlur(Bitmap bmp, View view) {
	    	this.view = view;
	    	blur(bmp);

	    }

	    @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
	    private void blur(Bitmap bkg) {
	        float radius = 20;

	        Bitmap overlay = Bitmap.createBitmap((int) (view.getMeasuredWidth()),
	                (int) (view.getMeasuredHeight()), Bitmap.Config.ARGB_8888);

	        Canvas canvas = new Canvas(overlay);

	        canvas.translate(-view.getLeft(), -view.getTop());
	        canvas.drawBitmap(bkg, 0, 0, null);

	        RenderScript rs = RenderScript.create(getActivity());

	        Allocation overlayAlloc = Allocation.createFromBitmap(
	                rs, overlay);

	        ScriptIntrinsicBlur blur = ScriptIntrinsicBlur.create(
	                rs, overlayAlloc.getElement());

	        blur.setInput(overlayAlloc);

	        blur.setRadius(radius);

	        blur.forEach(overlayAlloc);

	        overlayAlloc.copyTo(overlay);


	        rs.destroy();
	    }

	    @Override
	    public String toString() {
	        return "RenderScript";
	    }


}
