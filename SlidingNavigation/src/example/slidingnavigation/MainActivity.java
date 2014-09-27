package example.slidingnavigation;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {
	String[] menuList;
    DrawerLayout dLayout;
    ListView List;
    ArrayAdapter<String> adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		menuList = new String[]{"Home","Profile","Video","Pictures","Logout"};
		dLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
		List = (ListView) findViewById(R.id.slider);
		adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,menuList);
        List.setAdapter(adapter);
        
       List.setOnItemClickListener(new OnItemClickListener() {

		@Override
		public void onItemClick(AdapterView<?> arg0, View arg1, int position,
				long id) {
			// TODO Auto-generated method stub
			
			Bundle args = new Bundle();
	          args.putString("Menu", menuList[position]);
	          Fragment detail = new MenuDetailFragment();
	          detail.setArguments(args);
	            FragmentManager fragmentManager = getFragmentManager();
	          fragmentManager.beginTransaction().replace(R.id.menu_content, detail).commit();

			
			
		}
	});

	
	}


	

}
