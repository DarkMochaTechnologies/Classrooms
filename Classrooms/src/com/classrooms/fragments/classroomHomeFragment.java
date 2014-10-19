package com.classrooms.fragments;

import android.graphics.Typeface;
import com.classrooms.R;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;

public class classroomHomeFragment extends Fragment{

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view = inflater.inflate(R.layout.classroomhome, container, false);
        Typeface[] typeFace = new Typeface[7];

        typeFace[0] = Typeface.createFromAsset(getActivity().getAssets(), "fonts/quicksand_bold.otf");
        typeFace[1] = Typeface.createFromAsset(getActivity().getAssets(), "fonts/quicksand_book.otf");
        typeFace[2] = Typeface.createFromAsset(getActivity().getAssets(), "fonts/quicksand_bold_oblique.otf");
        typeFace[3] = Typeface.createFromAsset(getActivity().getAssets(), "fonts/quicksand_book_oblique.otf");
        typeFace[4] = Typeface.createFromAsset(getActivity().getAssets(), "fonts/quicksand_dash.otf");
        typeFace[5] = Typeface.createFromAsset(getActivity().getAssets(), "fonts/quicksand_light.otf");
        typeFace[6] = Typeface.createFromAsset(getActivity().getAssets(), "fonts/quicksand_light_oblique.otf");

		Bundle bundle = getArguments();
		
		TextView name = (TextView) view.findViewById(R.id.classroomhome_textView_name);
		TextView description = (TextView) view.findViewById(R.id.classroomhome_textView_description);
        TextView category = (TextView) view.findViewById(R.id.classroomhome_textView_category);
        TextView detail = (TextView) view.findViewById(R.id.classroomhome_textView_description_detail);
        TextView detailContent = (TextView) view.findViewById(R.id.classroomhome_textView_description_detail_content);
        Button joinClassroom = (Button) view.findViewById(R.id.classroomhome_button_joinclassroom);
		ImageView background = (ImageView) view.findViewById(R.id.classroomhome_imageView_background);

        name.setTypeface(typeFace[0]);
        description.setTypeface(typeFace[5]);
        joinClassroom.setTypeface(typeFace[0]);
        category.setTypeface(typeFace[1]);
        detail.setTypeface(typeFace[1]);
        detailContent.setTypeface(typeFace[5]);
        if(bundle != null){
			name.setText(bundle.getString("name"));
            name.setTypeface(typeFace[0]);
			description.setText(bundle.getString("description"));
            description.setTypeface(typeFace[5]);
			background.setImageResource(bundle.getInt("background"));
		}

		return view;
	}

}
