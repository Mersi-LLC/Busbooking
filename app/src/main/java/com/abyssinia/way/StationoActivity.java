package com.abyssinia.way;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.*;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.util.*;
import java.util.regex.*;
import java.text.*;
import org.json.*;
import java.util.HashMap;
import java.util.ArrayList;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import java.io.InputStream;
import android.content.Intent;
import android.net.Uri;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.blogspot.atifsoftwares.animatoolib.*;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class StationoActivity extends  AppCompatActivity  { 
	
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private double shapeww = 0;
	private HashMap<String, Object> reso = new HashMap<>();
	
	private ArrayList<HashMap<String, Object>> busolm = new ArrayList<>();
	
	private LinearLayout linear1;
	private ListView listview1;
	
	private RequestNetwork neto;
	private RequestNetwork.RequestListener _neto_request_listener;
	private SharedPreferences dot;
	private Intent i = new Intent();
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.stationo);
		initialize(_savedInstanceState);
		com.google.firebase.FirebaseApp.initializeApp(this);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		_app_bar = (AppBarLayout) findViewById(R.id._app_bar);
		_coordinator = (CoordinatorLayout) findViewById(R.id._coordinator);
		_toolbar = (Toolbar) findViewById(R.id._toolbar);
		setSupportActionBar(_toolbar);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setHomeButtonEnabled(true);
		_toolbar.setNavigationOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) {
				onBackPressed();
			}
		});
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		listview1 = (ListView) findViewById(R.id.listview1);
		neto = new RequestNetwork(this);
		dot = getSharedPreferences("dot", Activity.MODE_PRIVATE);
		
		_neto_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				busolm = new Gson().fromJson(_response, new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
				listview1.setAdapter(new Listview1Adapter(busolm));
				((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
			}
			
			@Override
			public void onErrorResponse(String _param1, String _param2) {
				final String _tag = _param1;
				final String _message = _param2;
				
			}
		};
	}
	
	private void initializeLogic() {
		setTitle("Welcome to Abyssiniya bus station");
		neto.startRequestNetwork(RequestNetworkController.GET, "https://sheetdb.io/api/v1/0magrkorbl86j", "", _neto_request_listener);
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	public void _border (final View _v, final String _color, final String _strokew) {
		shapeww = Double.parseDouble(_strokew);
		float shapew = (float) shapeww;
		
		android.graphics.drawable.ShapeDrawable shape = new android.graphics.drawable.ShapeDrawable(new android.graphics.drawable.shapes.RectShape());
		shape.getPaint().setColor(Color.parseColor(_color));
		shape.getPaint().setStyle(Paint.Style.STROKE);
		shape.getPaint().setStrokeWidth(shapew);
		_v.setBackground(shape);
	}
	
	
	public void _TransitionManager (final View _view, final String _propertyName, final Intent _intent) {
		_view.setTransitionName(_propertyName);
		
		android.app.ActivityOptions optionsCompat = android.app.ActivityOptions.makeSceneTransitionAnimation(StationoActivity.this, _view, _propertyName);
		        startActivity(_intent, optionsCompat.toBundle());
	}
	
	
	public class Listview1Adapter extends BaseAdapter {
		ArrayList<HashMap<String, Object>> _data;
		public Listview1Adapter(ArrayList<HashMap<String, Object>> _arr) {
			_data = _arr;
		}
		
		@Override
		public int getCount() {
			return _data.size();
		}
		
		@Override
		public HashMap<String, Object> getItem(int _index) {
			return _data.get(_index);
		}
		
		@Override
		public long getItemId(int _index) {
			return _index;
		}
		@Override
		public View getView(final int _position, View _v, ViewGroup _container) {
			LayoutInflater _inflater = (LayoutInflater)getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			View _view = _v;
			if (_view == null) {
				_view = _inflater.inflate(R.layout.my_station, null);
			}
			
			final LinearLayout main = (LinearLayout) _view.findViewById(R.id.main);
			final LinearLayout s = (LinearLayout) _view.findViewById(R.id.s);
			final LinearLayout linear9 = (LinearLayout) _view.findViewById(R.id.linear9);
			final TextView f = (TextView) _view.findViewById(R.id.f);
			final TextView textview7 = (TextView) _view.findViewById(R.id.textview7);
			final TextView t = (TextView) _view.findViewById(R.id.t);
			final LinearLayout linear10 = (LinearLayout) _view.findViewById(R.id.linear10);
			final TextView a = (TextView) _view.findViewById(R.id.a);
			final TextView n = (TextView) _view.findViewById(R.id.n);
			final TextView textview9 = (TextView) _view.findViewById(R.id.textview9);
			
			_border(main, "#568ade", "10");
			if (busolm.get((int)_position).containsKey("from")) {
				f.setText(busolm.get((int)_position).get("from").toString());
			}
			else {
				
			}
			if (busolm.get((int)_position).containsKey("to")) {
				t.setText(busolm.get((int)_position).get("to").toString());
			}
			else {
				
			}
			if (busolm.get((int)_position).containsKey("amount")) {
				a.setText(busolm.get((int)_position).get("amount").toString());
			}
			else {
				
			}
			main.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View _view) {
					dot.edit().putString("driver", "").commit();
					dot.edit().putString("platemark", "").commit();
					dot.edit().putString("amount", "").commit();
					dot.edit().putString("to", "").commit();
					dot.edit().putString("from", "").commit();
					dot.edit().putString("driver", busolm.get((int)_position).get("driver").toString()).commit();
					dot.edit().putString("platemark", busolm.get((int)_position).get("platemark").toString()).commit();
					dot.edit().putString("amount", busolm.get((int)_position).get("amount").toString()).commit();
					dot.edit().putString("to", busolm.get((int)_position).get("to").toString()).commit();
					dot.edit().putString("from", busolm.get((int)_position).get("from").toString()).commit();
					i.setClass(getApplicationContext(), PayoActivity.class);
					_TransitionManager(main, "item", i);
				}
			});
			
			return _view;
		}
	}
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input){
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels(){
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels(){
		return getResources().getDisplayMetrics().heightPixels;
	}
	
}