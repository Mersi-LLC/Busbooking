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
import android.widget.ImageView;
import java.util.Timer;
import java.util.TimerTask;
import android.os.Bundle;
import java.io.InputStream;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.blogspot.atifsoftwares.animatoolib.*;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class HomeActivity extends  AppCompatActivity  { 
	
	private Timer _timer = new Timer();
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	
	private LinearLayout linear1;
	private ScrollView vscroll1;
	private LinearLayout linear2;
	private LinearLayout k;
	private LinearLayout linear4;
	private LinearLayout linear5;
	private LinearLayout linear22;
	private LinearLayout linear73;
	private LinearLayout linear74;
	private LinearLayout linear75;
	private LinearLayout linear76;
	private TextView textview18;
	private LinearLayout a;
	private LinearLayout linear71;
	private LinearLayout b;
	private ImageView imageview1;
	private LinearLayout linear83;
	private TextView textview19;
	private ImageView imageview2;
	private LinearLayout linear84;
	private TextView textview20;
	private LinearLayout c;
	private LinearLayout linear78;
	private LinearLayout d;
	private ImageView imageview3;
	private LinearLayout linear85;
	private TextView textview22;
	private ImageView imageview4;
	private LinearLayout linear86;
	private TextView textview21;
	private LinearLayout linear80;
	private LinearLayout linear81;
	private LinearLayout linear82;
	
	private TimerTask t;
	private TimerTask t2;
	private Intent i = new Intent();
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.home);
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
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		k = (LinearLayout) findViewById(R.id.k);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		linear22 = (LinearLayout) findViewById(R.id.linear22);
		linear73 = (LinearLayout) findViewById(R.id.linear73);
		linear74 = (LinearLayout) findViewById(R.id.linear74);
		linear75 = (LinearLayout) findViewById(R.id.linear75);
		linear76 = (LinearLayout) findViewById(R.id.linear76);
		textview18 = (TextView) findViewById(R.id.textview18);
		a = (LinearLayout) findViewById(R.id.a);
		linear71 = (LinearLayout) findViewById(R.id.linear71);
		b = (LinearLayout) findViewById(R.id.b);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		linear83 = (LinearLayout) findViewById(R.id.linear83);
		textview19 = (TextView) findViewById(R.id.textview19);
		imageview2 = (ImageView) findViewById(R.id.imageview2);
		linear84 = (LinearLayout) findViewById(R.id.linear84);
		textview20 = (TextView) findViewById(R.id.textview20);
		c = (LinearLayout) findViewById(R.id.c);
		linear78 = (LinearLayout) findViewById(R.id.linear78);
		d = (LinearLayout) findViewById(R.id.d);
		imageview3 = (ImageView) findViewById(R.id.imageview3);
		linear85 = (LinearLayout) findViewById(R.id.linear85);
		textview22 = (TextView) findViewById(R.id.textview22);
		imageview4 = (ImageView) findViewById(R.id.imageview4);
		linear86 = (LinearLayout) findViewById(R.id.linear86);
		textview21 = (TextView) findViewById(R.id.textview21);
		linear80 = (LinearLayout) findViewById(R.id.linear80);
		linear81 = (LinearLayout) findViewById(R.id.linear81);
		linear82 = (LinearLayout) findViewById(R.id.linear82);
		
		a.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				startActivity(new Intent(HomeActivity.this, StationActivity.class)); Animatoo.animateSwipeLeft(HomeActivity.this);
				/*
_FadeOut(a, 75);
t2 = new TimerTask() {
@Override
public void run() {
runOnUiThread(new Runnable() {
@Override
public void run() {
i.setClass(getApplicationContext(), StationActivity.class);
startActivity(i);
finish();
}
});
}
};
_timer.schedule(t2, (int)(300));
*/
			}
		});
		
		b.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
				startActivity(i);
			}
		});
		
		c.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), MybookActivity.class);
				startActivity(i);
			}
		});
	}
	
	private void initializeLogic() {
		_env();
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	public void _Shadow (final double _sadw, final double _cru, final String _wc, final View _widgets) {
		android.graphics.drawable.GradientDrawable wd = new android.graphics.drawable.GradientDrawable();
		wd.setColor(Color.parseColor(_wc));
		wd.setCornerRadius((int)_cru);
		_widgets.setElevation((int)_sadw);
		_widgets.setBackground(wd);
	}
	
	
	public void _env () {
		_Edittext(a);
		_Edittext(b);
		_Edittext(c);
		_Edittext(d);
	}
	
	
	public void _Edittext (final View _view) {
		android.graphics.drawable.GradientDrawable CRNSO = new android.graphics.drawable.GradientDrawable();
		CRNSO.setColor(Color.parseColor("#ffffff"));
		CRNSO.setCornerRadii(new float[]{ (float) 14,(float) 14,(float) 14,(float) 14,(float) 14,(float) 14,(float) 14,(float) 14 });
		CRNSO.setStroke((int) 2, Color.parseColor("#0014ff"));
		_view.setElevation((float) 10);
		_view.setBackground(CRNSO);
	}
	
	
	public void _Animator (final View _view, final String _propertyName, final double _value, final double _duration) {
		ObjectAnimator anim = new ObjectAnimator();
		anim.setTarget(_view);
		anim.setPropertyName(_propertyName);
		anim.setFloatValues((float)_value);
		anim.setDuration((long)_duration);
		anim.start();
	}
	
	
	public void _FadeOut (final View _view, final double _duration) {
		_Animator(_view, "scaleX", 0, 200);
		_Animator(_view, "scaleY", 0, 200);
		t = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						_Animator(_view, "scaleX", 1, 200);
						_Animator(_view, "scaleY", 1, 200);
					}
				});
			}
		};
		_timer.schedule(t, (int)(_duration));
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