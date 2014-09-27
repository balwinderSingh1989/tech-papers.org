package example.slidingnavigation;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MenuDetailFragment extends Fragment {
	TextView text;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view = inflater.inflate(R.layout.menudetail_fragment, container, false);
		String menu = getArguments().getString("Menu");
		text = (TextView) view.findViewById(R.id.txtdetail);
		text.setText(menu);
		return view;

	}
}
