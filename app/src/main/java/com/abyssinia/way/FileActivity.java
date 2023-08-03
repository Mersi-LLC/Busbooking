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
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Button;
import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import java.io.InputStream;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.blogspot.atifsoftwares.animatoolib.*;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class FileActivity extends  AppCompatActivity  { 
	
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private double shapeww = 0;
	
	private LinearLayout linear2;
	private ScrollView vscroll1;
	private LinearLayout linear11;
	private LinearLayout uu;
	private LinearLayout main;
	private LinearLayout linear10;
	private LinearLayout linear13;
	private LinearLayout linear15;
	private LinearLayout linear17;
	private LinearLayout linear19;
	private LinearLayout linear21;
	private LinearLayout linear23;
	private LinearLayout linear24;
	private LinearLayout linear20;
	private LinearLayout linear18;
	private LinearLayout s;
	private LinearLayout linear9;
	private TextView f;
	private TextView textview7;
	private TextView t;
	private LinearLayout linear22;
	private TextView a;
	private TextView n;
	private TextView textview22;
	private TextView textview8;
	private TextView d;
	private TextView textview10;
	private TextView p;
	private TextView textview12;
	private TextView f1;
	private TextView textview14;
	private TextView t1;
	private TextView textview16;
	private TextView a1;
	private TextView textview17;
	private TextView start;
	private TextView textview19;
	private TextView end;
	private Button button1;
	
	private SharedPreferences temp;
	private SharedPreferences trans;
	private Intent i = new Intent();
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.file);
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
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		linear11 = (LinearLayout) findViewById(R.id.linear11);
		uu = (LinearLayout) findViewById(R.id.uu);
		main = (LinearLayout) findViewById(R.id.main);
		linear10 = (LinearLayout) findViewById(R.id.linear10);
		linear13 = (LinearLayout) findViewById(R.id.linear13);
		linear15 = (LinearLayout) findViewById(R.id.linear15);
		linear17 = (LinearLayout) findViewById(R.id.linear17);
		linear19 = (LinearLayout) findViewById(R.id.linear19);
		linear21 = (LinearLayout) findViewById(R.id.linear21);
		linear23 = (LinearLayout) findViewById(R.id.linear23);
		linear24 = (LinearLayout) findViewById(R.id.linear24);
		linear20 = (LinearLayout) findViewById(R.id.linear20);
		linear18 = (LinearLayout) findViewById(R.id.linear18);
		s = (LinearLayout) findViewById(R.id.s);
		linear9 = (LinearLayout) findViewById(R.id.linear9);
		f = (TextView) findViewById(R.id.f);
		textview7 = (TextView) findViewById(R.id.textview7);
		t = (TextView) findViewById(R.id.t);
		linear22 = (LinearLayout) findViewById(R.id.linear22);
		a = (TextView) findViewById(R.id.a);
		n = (TextView) findViewById(R.id.n);
		textview22 = (TextView) findViewById(R.id.textview22);
		textview8 = (TextView) findViewById(R.id.textview8);
		d = (TextView) findViewById(R.id.d);
		textview10 = (TextView) findViewById(R.id.textview10);
		p = (TextView) findViewById(R.id.p);
		textview12 = (TextView) findViewById(R.id.textview12);
		f1 = (TextView) findViewById(R.id.f1);
		textview14 = (TextView) findViewById(R.id.textview14);
		t1 = (TextView) findViewById(R.id.t1);
		textview16 = (TextView) findViewById(R.id.textview16);
		a1 = (TextView) findViewById(R.id.a1);
		textview17 = (TextView) findViewById(R.id.textview17);
		start = (TextView) findViewById(R.id.start);
		textview19 = (TextView) findViewById(R.id.textview19);
		end = (TextView) findViewById(R.id.end);
		button1 = (Button) findViewById(R.id.button1);
		temp = getSharedPreferences("temp", Activity.MODE_PRIVATE);
		trans = getSharedPreferences("trans", Activity.MODE_PRIVATE);
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				trans.edit().putString("driver", "").commit();
				trans.edit().putString("platemark", "").commit();
				trans.edit().putString("amount", "").commit();
				trans.edit().putString("to", "").commit();
				trans.edit().putString("from", "").commit();
				trans.edit().putString("driver", temp.getString("driver", "")).commit();
				trans.edit().putString("platemark", temp.getString("platemark", "")).commit();
				trans.edit().putString("amount", temp.getString("amount", "")).commit();
				trans.edit().putString("to", temp.getString("to", "")).commit();
				trans.edit().putString("from", temp.getString("from", "")).commit();
				i.setClass(getApplicationContext(), SeatActivity.class);
				startActivity(i);
				finish();
			}
		});
	}
	
	private void initializeLogic() {
		_Edittext(main);
		_Shadow(20, 10, "#FFFFFF", s);
		_Shadow(20, 10, "#568ade", button1);
		_border(uu, "#00ac47", "10");
		_Shadow(20, 10, "#FFFFFF", uu);
		_TransitionName(uu, "item");
		f.setText(temp.getString("from", ""));
		t.setText(temp.getString("to", ""));
		a.setText(temp.getString("amount", "").concat("  Birr"));
		d.setText(temp.getString("driver", ""));
		p.setText(temp.getString("platemark", ""));
		f1.setText(temp.getString("from", ""));
		t1.setText(temp.getString("to", ""));
		a1.setText(temp.getString("amount", "").concat("  Birr"));
		start.setText(temp.getString("start", ""));
		end.setText(temp.getString("arrive", ""));
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	@Override
	public void onBackPressed() {
		finish();
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
	
	
	public void _Shadow (final double _sadw, final double _cru, final String _wc, final View _widgets) {
		android.graphics.drawable.GradientDrawable wd = new android.graphics.drawable.GradientDrawable();
		wd.setColor(Color.parseColor(_wc));
		wd.setCornerRadius((int)_cru);
		_widgets.setElevation((int)_sadw);
		_widgets.setBackground(wd);
	}
	
	
	public void _TransitionName (final View _view, final String _propertyName) {
		_view.setTransitionName(_propertyName);
	}
	
	
	public void _Edittext (final View _view) {
		android.graphics.drawable.GradientDrawable CRNSO = new android.graphics.drawable.GradientDrawable();
		CRNSO.setColor(Color.parseColor("#ffffff"));
		CRNSO.setCornerRadii(new float[]{ (float) 14,(float) 14,(float) 14,(float) 14,(float) 14,(float) 14,(float) 14,(float) 14 });
		CRNSO.setStroke((int) 2, Color.parseColor("#0014ff"));
		_view.setElevation((float) 10);
		_view.setBackground(CRNSO);
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