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
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;
import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import java.io.InputStream;
import android.content.Intent;
import android.net.Uri;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.GenericTypeIndicator;
import com.google.firebase.database.ChildEventListener;
import java.util.HashMap;
import android.view.View;
import com.blogspot.atifsoftwares.animatoolib.*;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class SeatActivity extends  AppCompatActivity  { 
	
	private FirebaseDatabase _firebase = FirebaseDatabase.getInstance();
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private double var = 0;
	private double var2 = 0;
	private double var3 = 0;
	private double var4 = 0;
	private double var5 = 0;
	private double var6 = 0;
	private double var7 = 0;
	private double var8 = 0;
	private double var9 = 0;
	private double var10 = 0;
	private double var11 = 0;
	private double var12 = 0;
	private double var13 = 0;
	private double var14 = 0;
	private double var15 = 0;
	private double var16 = 0;
	private double var17 = 0;
	private double var18 = 0;
	private double var19 = 0;
	private double var20 = 0;
	private double var21 = 0;
	private double var22 = 0;
	private double var23 = 0;
	private double var24 = 0;
	private double var25 = 0;
	private double var26 = 0;
	private double var27 = 0;
	private double var28 = 0;
	private double var29 = 0;
	private double var30 = 0;
	
	private LinearLayout linear1;
	private ScrollView vscroll1;
	private LinearLayout linear2;
	private LinearLayout linear3;
	private LinearLayout legendb;
	private LinearLayout linear18;
	private LinearLayout chai;
	private LinearLayout linear51;
	private Button button1;
	private LinearLayout linear17;
	private LinearLayout linear5;
	private LinearLayout linear6;
	private LinearLayout linear7;
	private LinearLayout linear8;
	private LinearLayout linear9;
	private LinearLayout linear10;
	private LinearLayout em;
	private LinearLayout linear12;
	private TextView textviemhhgw1;
	private LinearLayout se;
	private LinearLayout linear14;
	private TextView textvbmiew2;
	private LinearLayout bo;
	private LinearLayout linear16;
	private TextView textvivvhjew3;
	private LinearLayout linear20;
	private LinearLayout linear21;
	private LinearLayout linear22;
	private LinearLayout linear23;
	private LinearLayout linear24;
	private LinearLayout linear25;
	private LinearLayout linear26;
	private LinearLayout linear27;
	private LinearLayout linear28;
	private LinearLayout linear29;
	private LinearLayout linear30;
	private LinearLayout linear31;
	private LinearLayout linear32;
	private ImageView imageview1;
	private TextView textview1;
	private LinearLayout linear33;
	private TextView textview2;
	private TextView textview;
	private TextView textview3;
	private LinearLayout linear35;
	private TextView textview4;
	private LinearLayout linear34;
	private TextView textview5;
	private TextView textview6;
	private LinearLayout linear36;
	private TextView textview7;
	private TextView textview12h;
	private TextView textview8;
	private LinearLayout linear41;
	private TextView textview9;
	private LinearLayout linear42;
	private TextView textview10;
	private TextView textview11;
	private LinearLayout linear37;
	private TextView textview12;
	private TextView textview18h;
	private TextView textview13;
	private LinearLayout linear49;
	private TextView textview14;
	private LinearLayout linear50;
	private TextView textview15;
	private TextView textview16;
	private LinearLayout linear38;
	private TextView textview17;
	private TextView textview24y;
	private TextView textview18;
	private LinearLayout linear48;
	private TextView textview19;
	private LinearLayout linear47;
	private TextView textview20;
	private TextView textview21;
	private LinearLayout linear39;
	private TextView textview22;
	private TextView textview30o;
	private TextView textview23;
	private LinearLayout linear45;
	private TextView textview24;
	private LinearLayout linear46;
	private TextView textview25;
	private TextView textview26;
	private LinearLayout linear40;
	private TextView textview27;
	private TextView textview36;
	private TextView textview28;
	private LinearLayout linear44;
	private TextView textview29;
	private LinearLayout linear43;
	private TextView textview30;
	
	private SharedPreferences schair;
	private SharedPreferences kchair;
	private SharedPreferences wenber;
	private SharedPreferences trans;
	private Intent i = new Intent();
	private DatabaseReference wenberoch = _firebase.getReference("chair");
	private ChildEventListener _wenberoch_child_listener;
	private SharedPreferences temp;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.seat);
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
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		legendb = (LinearLayout) findViewById(R.id.legendb);
		linear18 = (LinearLayout) findViewById(R.id.linear18);
		chai = (LinearLayout) findViewById(R.id.chai);
		linear51 = (LinearLayout) findViewById(R.id.linear51);
		button1 = (Button) findViewById(R.id.button1);
		linear17 = (LinearLayout) findViewById(R.id.linear17);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		linear8 = (LinearLayout) findViewById(R.id.linear8);
		linear9 = (LinearLayout) findViewById(R.id.linear9);
		linear10 = (LinearLayout) findViewById(R.id.linear10);
		em = (LinearLayout) findViewById(R.id.em);
		linear12 = (LinearLayout) findViewById(R.id.linear12);
		textviemhhgw1 = (TextView) findViewById(R.id.textviemhhgw1);
		se = (LinearLayout) findViewById(R.id.se);
		linear14 = (LinearLayout) findViewById(R.id.linear14);
		textvbmiew2 = (TextView) findViewById(R.id.textvbmiew2);
		bo = (LinearLayout) findViewById(R.id.bo);
		linear16 = (LinearLayout) findViewById(R.id.linear16);
		textvivvhjew3 = (TextView) findViewById(R.id.textvivvhjew3);
		linear20 = (LinearLayout) findViewById(R.id.linear20);
		linear21 = (LinearLayout) findViewById(R.id.linear21);
		linear22 = (LinearLayout) findViewById(R.id.linear22);
		linear23 = (LinearLayout) findViewById(R.id.linear23);
		linear24 = (LinearLayout) findViewById(R.id.linear24);
		linear25 = (LinearLayout) findViewById(R.id.linear25);
		linear26 = (LinearLayout) findViewById(R.id.linear26);
		linear27 = (LinearLayout) findViewById(R.id.linear27);
		linear28 = (LinearLayout) findViewById(R.id.linear28);
		linear29 = (LinearLayout) findViewById(R.id.linear29);
		linear30 = (LinearLayout) findViewById(R.id.linear30);
		linear31 = (LinearLayout) findViewById(R.id.linear31);
		linear32 = (LinearLayout) findViewById(R.id.linear32);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		textview1 = (TextView) findViewById(R.id.textview1);
		linear33 = (LinearLayout) findViewById(R.id.linear33);
		textview2 = (TextView) findViewById(R.id.textview2);
		textview = (TextView) findViewById(R.id.textview);
		textview3 = (TextView) findViewById(R.id.textview3);
		linear35 = (LinearLayout) findViewById(R.id.linear35);
		textview4 = (TextView) findViewById(R.id.textview4);
		linear34 = (LinearLayout) findViewById(R.id.linear34);
		textview5 = (TextView) findViewById(R.id.textview5);
		textview6 = (TextView) findViewById(R.id.textview6);
		linear36 = (LinearLayout) findViewById(R.id.linear36);
		textview7 = (TextView) findViewById(R.id.textview7);
		textview12h = (TextView) findViewById(R.id.textview12h);
		textview8 = (TextView) findViewById(R.id.textview8);
		linear41 = (LinearLayout) findViewById(R.id.linear41);
		textview9 = (TextView) findViewById(R.id.textview9);
		linear42 = (LinearLayout) findViewById(R.id.linear42);
		textview10 = (TextView) findViewById(R.id.textview10);
		textview11 = (TextView) findViewById(R.id.textview11);
		linear37 = (LinearLayout) findViewById(R.id.linear37);
		textview12 = (TextView) findViewById(R.id.textview12);
		textview18h = (TextView) findViewById(R.id.textview18h);
		textview13 = (TextView) findViewById(R.id.textview13);
		linear49 = (LinearLayout) findViewById(R.id.linear49);
		textview14 = (TextView) findViewById(R.id.textview14);
		linear50 = (LinearLayout) findViewById(R.id.linear50);
		textview15 = (TextView) findViewById(R.id.textview15);
		textview16 = (TextView) findViewById(R.id.textview16);
		linear38 = (LinearLayout) findViewById(R.id.linear38);
		textview17 = (TextView) findViewById(R.id.textview17);
		textview24y = (TextView) findViewById(R.id.textview24y);
		textview18 = (TextView) findViewById(R.id.textview18);
		linear48 = (LinearLayout) findViewById(R.id.linear48);
		textview19 = (TextView) findViewById(R.id.textview19);
		linear47 = (LinearLayout) findViewById(R.id.linear47);
		textview20 = (TextView) findViewById(R.id.textview20);
		textview21 = (TextView) findViewById(R.id.textview21);
		linear39 = (LinearLayout) findViewById(R.id.linear39);
		textview22 = (TextView) findViewById(R.id.textview22);
		textview30o = (TextView) findViewById(R.id.textview30o);
		textview23 = (TextView) findViewById(R.id.textview23);
		linear45 = (LinearLayout) findViewById(R.id.linear45);
		textview24 = (TextView) findViewById(R.id.textview24);
		linear46 = (LinearLayout) findViewById(R.id.linear46);
		textview25 = (TextView) findViewById(R.id.textview25);
		textview26 = (TextView) findViewById(R.id.textview26);
		linear40 = (LinearLayout) findViewById(R.id.linear40);
		textview27 = (TextView) findViewById(R.id.textview27);
		textview36 = (TextView) findViewById(R.id.textview36);
		textview28 = (TextView) findViewById(R.id.textview28);
		linear44 = (LinearLayout) findViewById(R.id.linear44);
		textview29 = (TextView) findViewById(R.id.textview29);
		linear43 = (LinearLayout) findViewById(R.id.linear43);
		textview30 = (TextView) findViewById(R.id.textview30);
		schair = getSharedPreferences("schair", Activity.MODE_PRIVATE);
		kchair = getSharedPreferences("kchair", Activity.MODE_PRIVATE);
		wenber = getSharedPreferences("wenber", Activity.MODE_PRIVATE);
		trans = getSharedPreferences("trans", Activity.MODE_PRIVATE);
		temp = getSharedPreferences("temp", Activity.MODE_PRIVATE);
		
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
				//
				trans.edit().putString("pass", trans.getString("book1", "")).commit();
				_first();
			}
		});
		
		textview1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (var == 0) {
					button1.setVisibility(View.VISIBLE);
					_Shadow(0, 20, "#FFCC33", textview1);
					var++;
					trans.edit().putString("book1", "").commit();
					trans.edit().putString("book1", "1").commit();
					_Shadow(0, 20, "#E0E0E0", textview2);
					_Shadow(0, 20, "#E0E0E0", textview3);
					_Shadow(0, 20, "#E0E0E0", textview4);
					_Shadow(0, 20, "#E0E0E0", textview5);
					_Shadow(0, 20, "#E0E0E0", textview6);
					_Shadow(0, 20, "#E0E0E0", textview7);
					_Shadow(0, 20, "#E0E0E0", textview8);
					_Shadow(0, 20, "#E0E0E0", textview9);
					_Shadow(0, 20, "#E0E0E0", textview10);
					_Shadow(0, 20, "#E0E0E0", textview11);
					_Shadow(0, 20, "#E0E0E0", textview12);
					_Shadow(0, 20, "#E0E0E0", textview13);
					_Shadow(0, 20, "#E0E0E0", textview14);
					_Shadow(0, 20, "#E0E0E0", textview15);
					_Shadow(0, 20, "#E0E0E0", textview16);
					_Shadow(0, 20, "#E0E0E0", textview17);
					_Shadow(0, 20, "#E0E0E0", textview18);
					_Shadow(0, 20, "#E0E0E0", textview19);
					_Shadow(0, 20, "#E0E0E0", textview20);
					_Shadow(0, 20, "#E0E0E0", textview21);
					_Shadow(0, 20, "#E0E0E0", textview22);
					_Shadow(0, 20, "#E0E0E0", textview23);
					_Shadow(0, 20, "#E0E0E0", textview24);
					_Shadow(0, 20, "#E0E0E0", textview25);
					_Shadow(0, 20, "#E0E0E0", textview26);
					_Shadow(0, 20, "#E0E0E0", textview27);
					_Shadow(0, 20, "#E0E0E0", textview28);
					_Shadow(0, 20, "#E0E0E0", textview29);
					_Shadow(0, 20, "#E0E0E0", textview30);
				}
				else {
					button1.setVisibility(View.GONE);
					var--;
					_Shadow(0, 20, "#E0E0E0", textview1);
					trans.edit().putString("book1", "").commit();
					trans.edit().putString("book1", "free").commit();
				}
			}
		});
		
		textview2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (kchair.getString("sn1", "").contains("1")) {
					if (var2 == 0) {
						button1.setVisibility(View.VISIBLE);
						_Shadow(0, 20, "#FFCC33", textview2);
						var2++;
						trans.edit().putString("book1", "").commit();
						trans.edit().putString("book1", "2").commit();
						_Shadow(0, 20, "#E0E0E0", textview3);
						_Shadow(0, 20, "#E0E0E0", textview4);
						_Shadow(0, 20, "#E0E0E0", textview5);
						_Shadow(0, 20, "#E0E0E0", textview6);
						_Shadow(0, 20, "#E0E0E0", textview7);
						_Shadow(0, 20, "#E0E0E0", textview8);
						_Shadow(0, 20, "#E0E0E0", textview9);
						_Shadow(0, 20, "#E0E0E0", textview10);
						_Shadow(0, 20, "#E0E0E0", textview11);
						_Shadow(0, 20, "#E0E0E0", textview12);
						_Shadow(0, 20, "#E0E0E0", textview13);
						_Shadow(0, 20, "#E0E0E0", textview14);
						_Shadow(0, 20, "#E0E0E0", textview15);
						_Shadow(0, 20, "#E0E0E0", textview16);
						_Shadow(0, 20, "#E0E0E0", textview17);
						_Shadow(0, 20, "#E0E0E0", textview18);
						_Shadow(0, 20, "#E0E0E0", textview19);
						_Shadow(0, 20, "#E0E0E0", textview20);
						_Shadow(0, 20, "#E0E0E0", textview21);
						_Shadow(0, 20, "#E0E0E0", textview22);
						_Shadow(0, 20, "#E0E0E0", textview23);
						_Shadow(0, 20, "#E0E0E0", textview24);
						_Shadow(0, 20, "#E0E0E0", textview25);
						_Shadow(0, 20, "#E0E0E0", textview26);
						_Shadow(0, 20, "#E0E0E0", textview27);
						_Shadow(0, 20, "#E0E0E0", textview28);
						_Shadow(0, 20, "#E0E0E0", textview29);
						_Shadow(0, 20, "#E0E0E0", textview30);
					}
					else {
						button1.setVisibility(View.GONE);
						_Shadow(0, 20, "#E0E0E0", textview2);
						var2--;
						trans.edit().putString("book1", "").commit();
						trans.edit().putString("book1", "false").commit();
					}
				}
				else {
					if (kchair.getString("sn3", "").equals("3")) {
						if (var2 == 0) {
							button1.setVisibility(View.VISIBLE);
							_Shadow(0, 20, "#FFCC33", textview2);
							var2++;
							trans.edit().putString("book1", "").commit();
							trans.edit().putString("book1", "2").commit();
							_Shadow(0, 20, "#E0E0E0", textview1);
							_Shadow(0, 20, "#E0E0E0", textview4);
							_Shadow(0, 20, "#E0E0E0", textview5);
							_Shadow(0, 20, "#E0E0E0", textview6);
							_Shadow(0, 20, "#E0E0E0", textview7);
							_Shadow(0, 20, "#E0E0E0", textview8);
							_Shadow(0, 20, "#E0E0E0", textview9);
							_Shadow(0, 20, "#E0E0E0", textview10);
							_Shadow(0, 20, "#E0E0E0", textview11);
							_Shadow(0, 20, "#E0E0E0", textview12);
							_Shadow(0, 20, "#E0E0E0", textview13);
							_Shadow(0, 20, "#E0E0E0", textview14);
							_Shadow(0, 20, "#E0E0E0", textview15);
							_Shadow(0, 20, "#E0E0E0", textview16);
							_Shadow(0, 20, "#E0E0E0", textview17);
							_Shadow(0, 20, "#E0E0E0", textview18);
							_Shadow(0, 20, "#E0E0E0", textview19);
							_Shadow(0, 20, "#E0E0E0", textview20);
							_Shadow(0, 20, "#E0E0E0", textview21);
							_Shadow(0, 20, "#E0E0E0", textview22);
							_Shadow(0, 20, "#E0E0E0", textview23);
							_Shadow(0, 20, "#E0E0E0", textview24);
							_Shadow(0, 20, "#E0E0E0", textview25);
							_Shadow(0, 20, "#E0E0E0", textview26);
							_Shadow(0, 20, "#E0E0E0", textview27);
							_Shadow(0, 20, "#E0E0E0", textview28);
							_Shadow(0, 20, "#E0E0E0", textview29);
							_Shadow(0, 20, "#E0E0E0", textview30);
						}
						else {
							button1.setVisibility(View.GONE);
							_Shadow(0, 20, "#E0E0E0", textview2);
							var2--;
							trans.edit().putString("book1", "").commit();
							trans.edit().putString("book1", "false").commit();
						}
					}
					else {
						if (kchair.getString("sn4", "").equals("4")) {
							
						}
						else {
							
						}
					}
				}
			}
		});
		
		textview3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (var3 == 0) {
					button1.setVisibility(View.VISIBLE);
					_Shadow(0, 20, "#FFCC33", textview3);
					var3++;
					trans.edit().putString("book1", "").commit();
					trans.edit().putString("book1", "3").commit();
					_Shadow(0, 20, "#E0E0E0", textview1);
					_Shadow(0, 20, "#E0E0E0", textview2);
					_Shadow(0, 20, "#E0E0E0", textview4);
					_Shadow(0, 20, "#E0E0E0", textview5);
					_Shadow(0, 20, "#E0E0E0", textview6);
					_Shadow(0, 20, "#E0E0E0", textview7);
					_Shadow(0, 20, "#E0E0E0", textview8);
					_Shadow(0, 20, "#E0E0E0", textview9);
					_Shadow(0, 20, "#E0E0E0", textview10);
					_Shadow(0, 20, "#E0E0E0", textview11);
					_Shadow(0, 20, "#E0E0E0", textview12);
					_Shadow(0, 20, "#E0E0E0", textview13);
					_Shadow(0, 20, "#E0E0E0", textview14);
					_Shadow(0, 20, "#E0E0E0", textview15);
					_Shadow(0, 20, "#E0E0E0", textview16);
					_Shadow(0, 20, "#E0E0E0", textview17);
					_Shadow(0, 20, "#E0E0E0", textview18);
					_Shadow(0, 20, "#E0E0E0", textview19);
					_Shadow(0, 20, "#E0E0E0", textview20);
					_Shadow(0, 20, "#E0E0E0", textview21);
					_Shadow(0, 20, "#E0E0E0", textview22);
					_Shadow(0, 20, "#E0E0E0", textview23);
					_Shadow(0, 20, "#E0E0E0", textview24);
					_Shadow(0, 20, "#E0E0E0", textview25);
					_Shadow(0, 20, "#E0E0E0", textview26);
					_Shadow(0, 20, "#E0E0E0", textview27);
					_Shadow(0, 20, "#E0E0E0", textview28);
					_Shadow(0, 20, "#E0E0E0", textview29);
					_Shadow(0, 20, "#E0E0E0", textview30);
				}
				else {
					button1.setVisibility(View.INVISIBLE);
					_Shadow(0, 20, "#E0E0E0", textview3);
					var3--;
					trans.edit().putString("book1", "").commit();
					trans.edit().putString("book1", "false").commit();
				}
			}
		});
		
		textview4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (var4 == 0) {
					button1.setVisibility(View.VISIBLE);
					_Shadow(0, 20, "#FFCC33", textview4);
					var4++;
					trans.edit().putString("book1", "").commit();
					trans.edit().putString("book1", "4").commit();
					_Shadow(0, 20, "#E0E0E0", textview1);
					_Shadow(0, 20, "#E0E0E0", textview2);
					_Shadow(0, 20, "#E0E0E0", textview3);
					_Shadow(0, 20, "#E0E0E0", textview5);
					_Shadow(0, 20, "#E0E0E0", textview6);
					_Shadow(0, 20, "#E0E0E0", textview7);
					_Shadow(0, 20, "#E0E0E0", textview8);
					_Shadow(0, 20, "#E0E0E0", textview9);
					_Shadow(0, 20, "#E0E0E0", textview10);
					_Shadow(0, 20, "#E0E0E0", textview11);
					_Shadow(0, 20, "#E0E0E0", textview12);
					_Shadow(0, 20, "#E0E0E0", textview13);
					_Shadow(0, 20, "#E0E0E0", textview14);
					_Shadow(0, 20, "#E0E0E0", textview15);
					_Shadow(0, 20, "#E0E0E0", textview16);
					_Shadow(0, 20, "#E0E0E0", textview17);
					_Shadow(0, 20, "#E0E0E0", textview18);
					_Shadow(0, 20, "#E0E0E0", textview19);
					_Shadow(0, 20, "#E0E0E0", textview20);
					_Shadow(0, 20, "#E0E0E0", textview21);
					_Shadow(0, 20, "#E0E0E0", textview22);
					_Shadow(0, 20, "#E0E0E0", textview23);
					_Shadow(0, 20, "#E0E0E0", textview24);
					_Shadow(0, 20, "#E0E0E0", textview25);
					_Shadow(0, 20, "#E0E0E0", textview26);
					_Shadow(0, 20, "#E0E0E0", textview27);
					_Shadow(0, 20, "#E0E0E0", textview28);
					_Shadow(0, 20, "#E0E0E0", textview29);
					_Shadow(0, 20, "#E0E0E0", textview30);
				}
				else {
					_Shadow(0, 20, "#E0E0E0", textview4);
					var4--;
					trans.edit().putString("book1", "").commit();
					trans.edit().putString("book1", "false").commit();
					button1.setVisibility(View.INVISIBLE);
				}
			}
		});
		
		textview5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (var5 == 0) {
					button1.setVisibility(View.VISIBLE);
					_Shadow(0, 20, "#FFCC33", textview5);
					var5++;
					trans.edit().putString("book1", "").commit();
					trans.edit().putString("book1", "5").commit();
					_Shadow(0, 20, "#E0E0E0", textview1);
					_Shadow(0, 20, "#E0E0E0", textview2);
					_Shadow(0, 20, "#E0E0E0", textview3);
					_Shadow(0, 20, "#E0E0E0", textview4);
					_Shadow(0, 20, "#E0E0E0", textview6);
					_Shadow(0, 20, "#E0E0E0", textview7);
					_Shadow(0, 20, "#E0E0E0", textview8);
					_Shadow(0, 20, "#E0E0E0", textview9);
					_Shadow(0, 20, "#E0E0E0", textview10);
					_Shadow(0, 20, "#E0E0E0", textview11);
					_Shadow(0, 20, "#E0E0E0", textview12);
					_Shadow(0, 20, "#E0E0E0", textview13);
					_Shadow(0, 20, "#E0E0E0", textview14);
					_Shadow(0, 20, "#E0E0E0", textview15);
					_Shadow(0, 20, "#E0E0E0", textview16);
					_Shadow(0, 20, "#E0E0E0", textview17);
					_Shadow(0, 20, "#E0E0E0", textview18);
					_Shadow(0, 20, "#E0E0E0", textview19);
					_Shadow(0, 20, "#E0E0E0", textview20);
					_Shadow(0, 20, "#E0E0E0", textview21);
					_Shadow(0, 20, "#E0E0E0", textview22);
					_Shadow(0, 20, "#E0E0E0", textview23);
					_Shadow(0, 20, "#E0E0E0", textview24);
					_Shadow(0, 20, "#E0E0E0", textview25);
					_Shadow(0, 20, "#E0E0E0", textview26);
					_Shadow(0, 20, "#E0E0E0", textview27);
					_Shadow(0, 20, "#E0E0E0", textview28);
					_Shadow(0, 20, "#E0E0E0", textview29);
					_Shadow(0, 20, "#E0E0E0", textview30);
				}
				else {
					_Shadow(0, 20, "#E0E0E0", textview5);
					var5--;
					trans.edit().putString("book1", "").commit();
					trans.edit().putString("book1", "false").commit();
					button1.setVisibility(View.INVISIBLE);
				}
			}
		});
		
		textview6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (var6 == 0) {
					button1.setVisibility(View.VISIBLE);
					_Shadow(0, 20, "#FFCC33", textview6);
					var6++;
					trans.edit().putString("book1", "").commit();
					trans.edit().putString("book1", "true").commit();
					_Shadow(0, 20, "#E0E0E0", textview1);
					_Shadow(0, 20, "#E0E0E0", textview2);
					_Shadow(0, 20, "#E0E0E0", textview3);
					_Shadow(0, 20, "#E0E0E0", textview4);
					_Shadow(0, 20, "#E0E0E0", textview5);
					_Shadow(0, 20, "#E0E0E0", textview7);
					_Shadow(0, 20, "#E0E0E0", textview8);
					_Shadow(0, 20, "#E0E0E0", textview9);
					_Shadow(0, 20, "#E0E0E0", textview10);
					_Shadow(0, 20, "#E0E0E0", textview11);
					_Shadow(0, 20, "#E0E0E0", textview12);
					_Shadow(0, 20, "#E0E0E0", textview13);
					_Shadow(0, 20, "#E0E0E0", textview14);
					_Shadow(0, 20, "#E0E0E0", textview15);
					_Shadow(0, 20, "#E0E0E0", textview16);
					_Shadow(0, 20, "#E0E0E0", textview17);
					_Shadow(0, 20, "#E0E0E0", textview18);
					_Shadow(0, 20, "#E0E0E0", textview19);
					_Shadow(0, 20, "#E0E0E0", textview20);
					_Shadow(0, 20, "#E0E0E0", textview21);
					_Shadow(0, 20, "#E0E0E0", textview22);
					_Shadow(0, 20, "#E0E0E0", textview23);
					_Shadow(0, 20, "#E0E0E0", textview24);
					_Shadow(0, 20, "#E0E0E0", textview25);
					_Shadow(0, 20, "#E0E0E0", textview26);
					_Shadow(0, 20, "#E0E0E0", textview27);
					_Shadow(0, 20, "#E0E0E0", textview28);
					_Shadow(0, 20, "#E0E0E0", textview29);
					_Shadow(0, 20, "#E0E0E0", textview30);
				}
				else {
					_Shadow(0, 20, "#E0E0E0", textview6);
					var6--;
					trans.edit().putString("book1", "").commit();
					trans.edit().putString("book1", "false").commit();
					button1.setVisibility(View.INVISIBLE);
				}
			}
		});
		
		textview7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (var7 == 0) {
					_Shadow(0, 20, "#FFCC33", textview7);
					var7++;
					wenber.edit().putString("book7", "").commit();
					wenber.edit().putString("book7", "true").commit();
					_Shadow(0, 20, "#E0E0E0", textview1);
					_Shadow(0, 20, "#E0E0E0", textview2);
					_Shadow(0, 20, "#E0E0E0", textview3);
					_Shadow(0, 20, "#E0E0E0", textview4);
					_Shadow(0, 20, "#E0E0E0", textview5);
					_Shadow(0, 20, "#E0E0E0", textview6);
					_Shadow(0, 20, "#E0E0E0", textview8);
					_Shadow(0, 20, "#E0E0E0", textview9);
					_Shadow(0, 20, "#E0E0E0", textview10);
					_Shadow(0, 20, "#E0E0E0", textview11);
					_Shadow(0, 20, "#E0E0E0", textview12);
					_Shadow(0, 20, "#E0E0E0", textview13);
					_Shadow(0, 20, "#E0E0E0", textview14);
					_Shadow(0, 20, "#E0E0E0", textview15);
					_Shadow(0, 20, "#E0E0E0", textview16);
					_Shadow(0, 20, "#E0E0E0", textview17);
					_Shadow(0, 20, "#E0E0E0", textview18);
					_Shadow(0, 20, "#E0E0E0", textview19);
					_Shadow(0, 20, "#E0E0E0", textview20);
					_Shadow(0, 20, "#E0E0E0", textview21);
					_Shadow(0, 20, "#E0E0E0", textview22);
					_Shadow(0, 20, "#E0E0E0", textview23);
					_Shadow(0, 20, "#E0E0E0", textview24);
					_Shadow(0, 20, "#E0E0E0", textview25);
					_Shadow(0, 20, "#E0E0E0", textview26);
					_Shadow(0, 20, "#E0E0E0", textview27);
					_Shadow(0, 20, "#E0E0E0", textview28);
					_Shadow(0, 20, "#E0E0E0", textview29);
					_Shadow(0, 20, "#E0E0E0", textview30);
				}
				else {
					_Shadow(0, 20, "#E0E0E0", textview7);
					var7--;
					wenber.edit().putString("book7", "").commit();
					wenber.edit().putString("book7", "false").commit();
				}
			}
		});
		
		textview8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (var8 == 0) {
					_Shadow(0, 20, "#FFCC33", textview8);
					var8++;
					wenber.edit().putString("book8", "").commit();
					wenber.edit().putString("book8", "true").commit();
					_Shadow(0, 20, "#E0E0E0", textview1);
					_Shadow(0, 20, "#E0E0E0", textview2);
					_Shadow(0, 20, "#E0E0E0", textview3);
					_Shadow(0, 20, "#E0E0E0", textview4);
					_Shadow(0, 20, "#E0E0E0", textview5);
					_Shadow(0, 20, "#E0E0E0", textview6);
					_Shadow(0, 20, "#E0E0E0", textview7);
					_Shadow(0, 20, "#E0E0E0", textview9);
					_Shadow(0, 20, "#E0E0E0", textview10);
					_Shadow(0, 20, "#E0E0E0", textview11);
					_Shadow(0, 20, "#E0E0E0", textview12);
					_Shadow(0, 20, "#E0E0E0", textview13);
					_Shadow(0, 20, "#E0E0E0", textview14);
					_Shadow(0, 20, "#E0E0E0", textview15);
					_Shadow(0, 20, "#E0E0E0", textview16);
					_Shadow(0, 20, "#E0E0E0", textview17);
					_Shadow(0, 20, "#E0E0E0", textview18);
					_Shadow(0, 20, "#E0E0E0", textview19);
					_Shadow(0, 20, "#E0E0E0", textview20);
					_Shadow(0, 20, "#E0E0E0", textview21);
					_Shadow(0, 20, "#E0E0E0", textview22);
					_Shadow(0, 20, "#E0E0E0", textview23);
					_Shadow(0, 20, "#E0E0E0", textview24);
					_Shadow(0, 20, "#E0E0E0", textview25);
					_Shadow(0, 20, "#E0E0E0", textview26);
					_Shadow(0, 20, "#E0E0E0", textview27);
					_Shadow(0, 20, "#E0E0E0", textview28);
					_Shadow(0, 20, "#E0E0E0", textview29);
					_Shadow(0, 20, "#E0E0E0", textview30);
				}
				else {
					_Shadow(0, 20, "#E0E0E0", textview8);
					var8--;
					wenber.edit().putString("book8", "").commit();
					wenber.edit().putString("book8", "false").commit();
				}
			}
		});
		
		textview9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (var9 == 0) {
					_Shadow(0, 20, "#FFCC33", textview9);
					var9++;
					wenber.edit().putString("book9", "").commit();
					wenber.edit().putString("book9", "true").commit();
					_Shadow(0, 20, "#E0E0E0", textview1);
					_Shadow(0, 20, "#E0E0E0", textview2);
					_Shadow(0, 20, "#E0E0E0", textview3);
					_Shadow(0, 20, "#E0E0E0", textview4);
					_Shadow(0, 20, "#E0E0E0", textview5);
					_Shadow(0, 20, "#E0E0E0", textview6);
					_Shadow(0, 20, "#E0E0E0", textview7);
					_Shadow(0, 20, "#E0E0E0", textview8);
					_Shadow(0, 20, "#E0E0E0", textview10);
					_Shadow(0, 20, "#E0E0E0", textview11);
					_Shadow(0, 20, "#E0E0E0", textview12);
					_Shadow(0, 20, "#E0E0E0", textview13);
					_Shadow(0, 20, "#E0E0E0", textview14);
					_Shadow(0, 20, "#E0E0E0", textview15);
					_Shadow(0, 20, "#E0E0E0", textview16);
					_Shadow(0, 20, "#E0E0E0", textview17);
					_Shadow(0, 20, "#E0E0E0", textview18);
					_Shadow(0, 20, "#E0E0E0", textview19);
					_Shadow(0, 20, "#E0E0E0", textview20);
					_Shadow(0, 20, "#E0E0E0", textview21);
					_Shadow(0, 20, "#E0E0E0", textview22);
					_Shadow(0, 20, "#E0E0E0", textview23);
					_Shadow(0, 20, "#E0E0E0", textview24);
					_Shadow(0, 20, "#E0E0E0", textview25);
					_Shadow(0, 20, "#E0E0E0", textview26);
					_Shadow(0, 20, "#E0E0E0", textview27);
					_Shadow(0, 20, "#E0E0E0", textview28);
					_Shadow(0, 20, "#E0E0E0", textview29);
					_Shadow(0, 20, "#E0E0E0", textview30);
				}
				else {
					_Shadow(0, 20, "#E0E0E0", textview9);
					var9--;
					wenber.edit().putString("book9", "").commit();
					wenber.edit().putString("book9", "true").commit();
				}
			}
		});
		
		textview10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (var10 == 0) {
					_Shadow(0, 20, "#FFCC33", textview10);
					var10++;
					wenber.edit().putString("book10", "").commit();
					wenber.edit().putString("book10", "true").commit();
					_Shadow(0, 20, "#E0E0E0", textview1);
					_Shadow(0, 20, "#E0E0E0", textview2);
					_Shadow(0, 20, "#E0E0E0", textview3);
					_Shadow(0, 20, "#E0E0E0", textview4);
					_Shadow(0, 20, "#E0E0E0", textview5);
					_Shadow(0, 20, "#E0E0E0", textview6);
					_Shadow(0, 20, "#E0E0E0", textview7);
					_Shadow(0, 20, "#E0E0E0", textview8);
					_Shadow(0, 20, "#E0E0E0", textview9);
					_Shadow(0, 20, "#E0E0E0", textview11);
					_Shadow(0, 20, "#E0E0E0", textview12);
					_Shadow(0, 20, "#E0E0E0", textview13);
					_Shadow(0, 20, "#E0E0E0", textview14);
					_Shadow(0, 20, "#E0E0E0", textview15);
					_Shadow(0, 20, "#E0E0E0", textview16);
					_Shadow(0, 20, "#E0E0E0", textview17);
					_Shadow(0, 20, "#E0E0E0", textview18);
					_Shadow(0, 20, "#E0E0E0", textview19);
					_Shadow(0, 20, "#E0E0E0", textview20);
					_Shadow(0, 20, "#E0E0E0", textview21);
					_Shadow(0, 20, "#E0E0E0", textview22);
					_Shadow(0, 20, "#E0E0E0", textview23);
					_Shadow(0, 20, "#E0E0E0", textview24);
					_Shadow(0, 20, "#E0E0E0", textview25);
					_Shadow(0, 20, "#E0E0E0", textview26);
					_Shadow(0, 20, "#E0E0E0", textview27);
					_Shadow(0, 20, "#E0E0E0", textview28);
					_Shadow(0, 20, "#E0E0E0", textview29);
					_Shadow(0, 20, "#E0E0E0", textview30);
				}
				else {
					_Shadow(0, 20, "#E0E0E0", textview10);
					var10--;
					wenber.edit().putString("book10", "").commit();
					wenber.edit().putString("book10", "false").commit();
				}
			}
		});
		
		textview11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (var11 == 0) {
					_Shadow(0, 20, "#FFCC33", textview11);
					var11++;
					wenber.edit().putString("book11", "").commit();
					wenber.edit().putString("book11", "true").commit();
					_Shadow(0, 20, "#E0E0E0", textview1);
					_Shadow(0, 20, "#E0E0E0", textview2);
					_Shadow(0, 20, "#E0E0E0", textview3);
					_Shadow(0, 20, "#E0E0E0", textview4);
					_Shadow(0, 20, "#E0E0E0", textview5);
					_Shadow(0, 20, "#E0E0E0", textview6);
					_Shadow(0, 20, "#E0E0E0", textview7);
					_Shadow(0, 20, "#E0E0E0", textview8);
					_Shadow(0, 20, "#E0E0E0", textview9);
					_Shadow(0, 20, "#E0E0E0", textview10);
					_Shadow(0, 20, "#E0E0E0", textview12);
					_Shadow(0, 20, "#E0E0E0", textview13);
					_Shadow(0, 20, "#E0E0E0", textview14);
					_Shadow(0, 20, "#E0E0E0", textview15);
					_Shadow(0, 20, "#E0E0E0", textview16);
					_Shadow(0, 20, "#E0E0E0", textview17);
					_Shadow(0, 20, "#E0E0E0", textview18);
					_Shadow(0, 20, "#E0E0E0", textview19);
					_Shadow(0, 20, "#E0E0E0", textview20);
					_Shadow(0, 20, "#E0E0E0", textview21);
					_Shadow(0, 20, "#E0E0E0", textview22);
					_Shadow(0, 20, "#E0E0E0", textview23);
					_Shadow(0, 20, "#E0E0E0", textview24);
					_Shadow(0, 20, "#E0E0E0", textview25);
					_Shadow(0, 20, "#E0E0E0", textview26);
					_Shadow(0, 20, "#E0E0E0", textview27);
					_Shadow(0, 20, "#E0E0E0", textview28);
					_Shadow(0, 20, "#E0E0E0", textview29);
					_Shadow(0, 20, "#E0E0E0", textview30);
				}
				else {
					_Shadow(0, 20, "#E0E0E0", textview11);
					var11--;
					wenber.edit().putString("book11", "").commit();
					wenber.edit().putString("book11", "false").commit();
				}
			}
		});
		
		textview12.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (var12 == 0) {
					_Shadow(0, 20, "#FFCC33", textview12);
					var12++;
					wenber.edit().putString("book12", "").commit();
					wenber.edit().putString("book12", "true").commit();
					_Shadow(0, 20, "#E0E0E0", textview1);
					_Shadow(0, 20, "#E0E0E0", textview2);
					_Shadow(0, 20, "#E0E0E0", textview3);
					_Shadow(0, 20, "#E0E0E0", textview4);
					_Shadow(0, 20, "#E0E0E0", textview5);
					_Shadow(0, 20, "#E0E0E0", textview6);
					_Shadow(0, 20, "#E0E0E0", textview7);
					_Shadow(0, 20, "#E0E0E0", textview8);
					_Shadow(0, 20, "#E0E0E0", textview9);
					_Shadow(0, 20, "#E0E0E0", textview10);
					_Shadow(0, 20, "#E0E0E0", textview11);
					_Shadow(0, 20, "#E0E0E0", textview13);
					_Shadow(0, 20, "#E0E0E0", textview14);
					_Shadow(0, 20, "#E0E0E0", textview15);
					_Shadow(0, 20, "#E0E0E0", textview16);
					_Shadow(0, 20, "#E0E0E0", textview17);
					_Shadow(0, 20, "#E0E0E0", textview18);
					_Shadow(0, 20, "#E0E0E0", textview19);
					_Shadow(0, 20, "#E0E0E0", textview20);
					_Shadow(0, 20, "#E0E0E0", textview21);
					_Shadow(0, 20, "#E0E0E0", textview22);
					_Shadow(0, 20, "#E0E0E0", textview23);
					_Shadow(0, 20, "#E0E0E0", textview24);
					_Shadow(0, 20, "#E0E0E0", textview25);
					_Shadow(0, 20, "#E0E0E0", textview26);
					_Shadow(0, 20, "#E0E0E0", textview27);
					_Shadow(0, 20, "#E0E0E0", textview28);
					_Shadow(0, 20, "#E0E0E0", textview29);
					_Shadow(0, 20, "#E0E0E0", textview30);
				}
				else {
					_Shadow(0, 20, "#E0E0E0", textview12);
					var12--;
					wenber.edit().putString("book12", "").commit();
					wenber.edit().putString("book12", "true").commit();
				}
			}
		});
		
		textview13.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (var13 == 0) {
					_Shadow(0, 20, "#FFCC33", textview13);
					var13++;
					wenber.edit().putString("book13", "").commit();
					wenber.edit().putString("book13", "true").commit();
					_Shadow(0, 20, "#E0E0E0", textview1);
					_Shadow(0, 20, "#E0E0E0", textview2);
					_Shadow(0, 20, "#E0E0E0", textview3);
					_Shadow(0, 20, "#E0E0E0", textview4);
					_Shadow(0, 20, "#E0E0E0", textview5);
					_Shadow(0, 20, "#E0E0E0", textview6);
					_Shadow(0, 20, "#E0E0E0", textview7);
					_Shadow(0, 20, "#E0E0E0", textview8);
					_Shadow(0, 20, "#E0E0E0", textview9);
					_Shadow(0, 20, "#E0E0E0", textview10);
					_Shadow(0, 20, "#E0E0E0", textview11);
					_Shadow(0, 20, "#E0E0E0", textview12);
					_Shadow(0, 20, "#E0E0E0", textview14);
					_Shadow(0, 20, "#E0E0E0", textview15);
					_Shadow(0, 20, "#E0E0E0", textview16);
					_Shadow(0, 20, "#E0E0E0", textview17);
					_Shadow(0, 20, "#E0E0E0", textview18);
					_Shadow(0, 20, "#E0E0E0", textview19);
					_Shadow(0, 20, "#E0E0E0", textview20);
					_Shadow(0, 20, "#E0E0E0", textview21);
					_Shadow(0, 20, "#E0E0E0", textview22);
					_Shadow(0, 20, "#E0E0E0", textview23);
					_Shadow(0, 20, "#E0E0E0", textview24);
					_Shadow(0, 20, "#E0E0E0", textview25);
					_Shadow(0, 20, "#E0E0E0", textview26);
					_Shadow(0, 20, "#E0E0E0", textview27);
					_Shadow(0, 20, "#E0E0E0", textview28);
					_Shadow(0, 20, "#E0E0E0", textview29);
					_Shadow(0, 20, "#E0E0E0", textview30);
					_Shadow(0, 20, "#E0E0E0", textview13);
				}
				else {
					_Shadow(0, 20, "#E0E0E0", textview13);
					var13--;
					wenber.edit().putString("book13", "").commit();
					wenber.edit().putString("book13", "false").commit();
				}
			}
		});
		
		textview14.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (var14 == 0) {
					_Shadow(0, 20, "#FFCC33", textview14);
					var14++;
					wenber.edit().putString("book14", "").commit();
					wenber.edit().putString("book14", "true").commit();
					_Shadow(0, 20, "#E0E0E0", textview1);
					_Shadow(0, 20, "#E0E0E0", textview2);
					_Shadow(0, 20, "#E0E0E0", textview3);
					_Shadow(0, 20, "#E0E0E0", textview4);
					_Shadow(0, 20, "#E0E0E0", textview5);
					_Shadow(0, 20, "#E0E0E0", textview6);
					_Shadow(0, 20, "#E0E0E0", textview7);
					_Shadow(0, 20, "#E0E0E0", textview8);
					_Shadow(0, 20, "#E0E0E0", textview9);
					_Shadow(0, 20, "#E0E0E0", textview10);
					_Shadow(0, 20, "#E0E0E0", textview11);
					_Shadow(0, 20, "#E0E0E0", textview12);
					_Shadow(0, 20, "#E0E0E0", textview13);
					_Shadow(0, 20, "#E0E0E0", textview15);
					_Shadow(0, 20, "#E0E0E0", textview16);
					_Shadow(0, 20, "#E0E0E0", textview17);
					_Shadow(0, 20, "#E0E0E0", textview18);
					_Shadow(0, 20, "#E0E0E0", textview19);
					_Shadow(0, 20, "#E0E0E0", textview20);
					_Shadow(0, 20, "#E0E0E0", textview21);
					_Shadow(0, 20, "#E0E0E0", textview22);
					_Shadow(0, 20, "#E0E0E0", textview23);
					_Shadow(0, 20, "#E0E0E0", textview24);
					_Shadow(0, 20, "#E0E0E0", textview25);
					_Shadow(0, 20, "#E0E0E0", textview26);
					_Shadow(0, 20, "#E0E0E0", textview27);
					_Shadow(0, 20, "#E0E0E0", textview28);
					_Shadow(0, 20, "#E0E0E0", textview29);
					_Shadow(0, 20, "#E0E0E0", textview30);
				}
				else {
					_Shadow(0, 20, "#E0E0E0", textview14);
					var14--;
					wenber.edit().putString("book14", "").commit();
					wenber.edit().putString("book14", "false").commit();
				}
			}
		});
		
		textview15.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (var15 == 0) {
					_Shadow(0, 20, "#FFCC33", textview15);
					var15++;
					wenber.edit().putString("book15", "").commit();
					wenber.edit().putString("book15", "true").commit();
				}
				else {
					_Shadow(0, 20, "#E0E0E0", textview15);
					var15--;
					wenber.edit().putString("book15", "").commit();
					wenber.edit().putString("book15", "false").commit();
				}
			}
		});
		
		textview16.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (var16 == 0) {
					_Shadow(0, 20, "#FFCC33", textview16);
					var16++;
					wenber.edit().putString("book16", "").commit();
					wenber.edit().putString("book16", "true").commit();
					_Shadow(0, 20, "#E0E0E0", textview1);
					_Shadow(0, 20, "#E0E0E0", textview2);
					_Shadow(0, 20, "#E0E0E0", textview3);
					_Shadow(0, 20, "#E0E0E0", textview4);
					_Shadow(0, 20, "#E0E0E0", textview5);
					_Shadow(0, 20, "#E0E0E0", textview6);
					_Shadow(0, 20, "#E0E0E0", textview7);
					_Shadow(0, 20, "#E0E0E0", textview8);
					_Shadow(0, 20, "#E0E0E0", textview9);
					_Shadow(0, 20, "#E0E0E0", textview10);
					_Shadow(0, 20, "#E0E0E0", textview11);
					_Shadow(0, 20, "#E0E0E0", textview12);
					_Shadow(0, 20, "#E0E0E0", textview13);
					_Shadow(0, 20, "#E0E0E0", textview14);
					_Shadow(0, 20, "#E0E0E0", textview15);
					_Shadow(0, 20, "#E0E0E0", textview17);
					_Shadow(0, 20, "#E0E0E0", textview18);
					_Shadow(0, 20, "#E0E0E0", textview19);
					_Shadow(0, 20, "#E0E0E0", textview20);
					_Shadow(0, 20, "#E0E0E0", textview21);
					_Shadow(0, 20, "#E0E0E0", textview22);
					_Shadow(0, 20, "#E0E0E0", textview23);
					_Shadow(0, 20, "#E0E0E0", textview24);
					_Shadow(0, 20, "#E0E0E0", textview25);
					_Shadow(0, 20, "#E0E0E0", textview26);
					_Shadow(0, 20, "#E0E0E0", textview27);
					_Shadow(0, 20, "#E0E0E0", textview28);
					_Shadow(0, 20, "#E0E0E0", textview29);
					_Shadow(0, 20, "#E0E0E0", textview30);
				}
				else {
					_Shadow(0, 20, "#E0E0E0", textview16);
					var16--;
					wenber.edit().putString("book16", "").commit();
					wenber.edit().putString("book16", "false").commit();
				}
			}
		});
		
		textview17.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (var17 == 0) {
					_Shadow(0, 20, "#FFCC33", textview17);
					var17++;
					wenber.edit().putString("book17", "").commit();
					wenber.edit().putString("book17", "true").commit();
					_Shadow(0, 20, "#E0E0E0", textview1);
					_Shadow(0, 20, "#E0E0E0", textview2);
					_Shadow(0, 20, "#E0E0E0", textview3);
					_Shadow(0, 20, "#E0E0E0", textview4);
					_Shadow(0, 20, "#E0E0E0", textview5);
					_Shadow(0, 20, "#E0E0E0", textview6);
					_Shadow(0, 20, "#E0E0E0", textview7);
					_Shadow(0, 20, "#E0E0E0", textview8);
					_Shadow(0, 20, "#E0E0E0", textview9);
					_Shadow(0, 20, "#E0E0E0", textview10);
					_Shadow(0, 20, "#E0E0E0", textview11);
					_Shadow(0, 20, "#E0E0E0", textview12);
					_Shadow(0, 20, "#E0E0E0", textview13);
					_Shadow(0, 20, "#E0E0E0", textview14);
					_Shadow(0, 20, "#E0E0E0", textview15);
					_Shadow(0, 20, "#E0E0E0", textview16);
					_Shadow(0, 20, "#E0E0E0", textview18);
					_Shadow(0, 20, "#E0E0E0", textview19);
					_Shadow(0, 20, "#E0E0E0", textview20);
					_Shadow(0, 20, "#E0E0E0", textview21);
					_Shadow(0, 20, "#E0E0E0", textview22);
					_Shadow(0, 20, "#E0E0E0", textview23);
					_Shadow(0, 20, "#E0E0E0", textview24);
					_Shadow(0, 20, "#E0E0E0", textview25);
					_Shadow(0, 20, "#E0E0E0", textview26);
					_Shadow(0, 20, "#E0E0E0", textview27);
					_Shadow(0, 20, "#E0E0E0", textview28);
					_Shadow(0, 20, "#E0E0E0", textview29);
					_Shadow(0, 20, "#E0E0E0", textview30);
				}
				else {
					_Shadow(0, 20, "#E0E0E0", textview17);
					var17--;
					wenber.edit().putString("book17", "").commit();
					wenber.edit().putString("book17", "false").commit();
				}
			}
		});
		
		textview18.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (var18 == 0) {
					_Shadow(0, 20, "#FFCC33", textview18);
					var18++;
					wenber.edit().putString("book18", "").commit();
					wenber.edit().putString("book18", "true").commit();
					_Shadow(0, 20, "#E0E0E0", textview1);
					_Shadow(0, 20, "#E0E0E0", textview2);
					_Shadow(0, 20, "#E0E0E0", textview3);
					_Shadow(0, 20, "#E0E0E0", textview4);
					_Shadow(0, 20, "#E0E0E0", textview5);
					_Shadow(0, 20, "#E0E0E0", textview6);
					_Shadow(0, 20, "#E0E0E0", textview7);
					_Shadow(0, 20, "#E0E0E0", textview8);
					_Shadow(0, 20, "#E0E0E0", textview9);
					_Shadow(0, 20, "#E0E0E0", textview10);
					_Shadow(0, 20, "#E0E0E0", textview11);
					_Shadow(0, 20, "#E0E0E0", textview12);
					_Shadow(0, 20, "#E0E0E0", textview13);
					_Shadow(0, 20, "#E0E0E0", textview14);
					_Shadow(0, 20, "#E0E0E0", textview15);
					_Shadow(0, 20, "#E0E0E0", textview16);
					_Shadow(0, 20, "#E0E0E0", textview17);
					_Shadow(0, 20, "#E0E0E0", textview19);
					_Shadow(0, 20, "#E0E0E0", textview20);
					_Shadow(0, 20, "#E0E0E0", textview21);
					_Shadow(0, 20, "#E0E0E0", textview22);
					_Shadow(0, 20, "#E0E0E0", textview23);
					_Shadow(0, 20, "#E0E0E0", textview24);
					_Shadow(0, 20, "#E0E0E0", textview25);
					_Shadow(0, 20, "#E0E0E0", textview26);
					_Shadow(0, 20, "#E0E0E0", textview27);
					_Shadow(0, 20, "#E0E0E0", textview28);
					_Shadow(0, 20, "#E0E0E0", textview29);
					_Shadow(0, 20, "#E0E0E0", textview30);
				}
				else {
					_Shadow(0, 20, "#E0E0E0", textview18);
					var18--;
					wenber.edit().putString("book18", "").commit();
					wenber.edit().putString("book18", "false").commit();
				}
			}
		});
		
		textview19.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (var19 == 0) {
					_Shadow(0, 20, "#FFCC33", textview19);
					var19++;
					wenber.edit().putString("book19", "").commit();
					wenber.edit().putString("book19", "true").commit();
					_Shadow(0, 20, "#E0E0E0", textview1);
					_Shadow(0, 20, "#E0E0E0", textview2);
					_Shadow(0, 20, "#E0E0E0", textview3);
					_Shadow(0, 20, "#E0E0E0", textview4);
					_Shadow(0, 20, "#E0E0E0", textview5);
					_Shadow(0, 20, "#E0E0E0", textview6);
					_Shadow(0, 20, "#E0E0E0", textview7);
					_Shadow(0, 20, "#E0E0E0", textview8);
					_Shadow(0, 20, "#E0E0E0", textview9);
					_Shadow(0, 20, "#E0E0E0", textview10);
					_Shadow(0, 20, "#E0E0E0", textview11);
					_Shadow(0, 20, "#E0E0E0", textview12);
					_Shadow(0, 20, "#E0E0E0", textview13);
					_Shadow(0, 20, "#E0E0E0", textview14);
					_Shadow(0, 20, "#E0E0E0", textview15);
					_Shadow(0, 20, "#E0E0E0", textview16);
					_Shadow(0, 20, "#E0E0E0", textview17);
					_Shadow(0, 20, "#E0E0E0", textview18);
					_Shadow(0, 20, "#E0E0E0", textview20);
					_Shadow(0, 20, "#E0E0E0", textview21);
					_Shadow(0, 20, "#E0E0E0", textview22);
					_Shadow(0, 20, "#E0E0E0", textview23);
					_Shadow(0, 20, "#E0E0E0", textview24);
					_Shadow(0, 20, "#E0E0E0", textview25);
					_Shadow(0, 20, "#E0E0E0", textview26);
					_Shadow(0, 20, "#E0E0E0", textview27);
					_Shadow(0, 20, "#E0E0E0", textview28);
					_Shadow(0, 20, "#E0E0E0", textview29);
					_Shadow(0, 20, "#E0E0E0", textview30);
				}
				else {
					_Shadow(0, 20, "#E0E0E0", textview19);
					var19--;
					wenber.edit().putString("book19", "").commit();
					wenber.edit().putString("book19", "false").commit();
				}
			}
		});
		
		textview20.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (var20 == 0) {
					_Shadow(0, 20, "#FFCC33", textview20);
					var20++;
					wenber.edit().putString("book20", "").commit();
					wenber.edit().putString("book20", "true").commit();
					_Shadow(0, 20, "#E0E0E0", textview1);
					_Shadow(0, 20, "#E0E0E0", textview2);
					_Shadow(0, 20, "#E0E0E0", textview3);
					_Shadow(0, 20, "#E0E0E0", textview4);
					_Shadow(0, 20, "#E0E0E0", textview5);
					_Shadow(0, 20, "#E0E0E0", textview6);
					_Shadow(0, 20, "#E0E0E0", textview7);
					_Shadow(0, 20, "#E0E0E0", textview8);
					_Shadow(0, 20, "#E0E0E0", textview9);
					_Shadow(0, 20, "#E0E0E0", textview10);
					_Shadow(0, 20, "#E0E0E0", textview11);
					_Shadow(0, 20, "#E0E0E0", textview12);
					_Shadow(0, 20, "#E0E0E0", textview13);
					_Shadow(0, 20, "#E0E0E0", textview14);
					_Shadow(0, 20, "#E0E0E0", textview15);
					_Shadow(0, 20, "#E0E0E0", textview16);
					_Shadow(0, 20, "#E0E0E0", textview17);
					_Shadow(0, 20, "#E0E0E0", textview18);
					_Shadow(0, 20, "#E0E0E0", textview19);
					_Shadow(0, 20, "#E0E0E0", textview21);
					_Shadow(0, 20, "#E0E0E0", textview22);
					_Shadow(0, 20, "#E0E0E0", textview23);
					_Shadow(0, 20, "#E0E0E0", textview24);
					_Shadow(0, 20, "#E0E0E0", textview25);
					_Shadow(0, 20, "#E0E0E0", textview26);
					_Shadow(0, 20, "#E0E0E0", textview27);
					_Shadow(0, 20, "#E0E0E0", textview28);
					_Shadow(0, 20, "#E0E0E0", textview29);
					_Shadow(0, 20, "#E0E0E0", textview30);
				}
				else {
					_Shadow(0, 20, "#E0E0E0", textview20);
					var20--;
					wenber.edit().putString("book20", "").commit();
					wenber.edit().putString("book20", "false").commit();
				}
			}
		});
		
		textview21.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (var21 == 0) {
					_Shadow(0, 20, "#FFCC33", textview21);
					var21++;
					wenber.edit().putString("book21", "").commit();
					wenber.edit().putString("book21", "true").commit();
					_Shadow(0, 20, "#E0E0E0", textview1);
					_Shadow(0, 20, "#E0E0E0", textview2);
					_Shadow(0, 20, "#E0E0E0", textview3);
					_Shadow(0, 20, "#E0E0E0", textview4);
					_Shadow(0, 20, "#E0E0E0", textview5);
					_Shadow(0, 20, "#E0E0E0", textview6);
					_Shadow(0, 20, "#E0E0E0", textview7);
					_Shadow(0, 20, "#E0E0E0", textview8);
					_Shadow(0, 20, "#E0E0E0", textview9);
					_Shadow(0, 20, "#E0E0E0", textview10);
					_Shadow(0, 20, "#E0E0E0", textview11);
					_Shadow(0, 20, "#E0E0E0", textview12);
					_Shadow(0, 20, "#E0E0E0", textview13);
					_Shadow(0, 20, "#E0E0E0", textview14);
					_Shadow(0, 20, "#E0E0E0", textview15);
					_Shadow(0, 20, "#E0E0E0", textview16);
					_Shadow(0, 20, "#E0E0E0", textview17);
					_Shadow(0, 20, "#E0E0E0", textview18);
					_Shadow(0, 20, "#E0E0E0", textview19);
					_Shadow(0, 20, "#E0E0E0", textview20);
					_Shadow(0, 20, "#E0E0E0", textview22);
					_Shadow(0, 20, "#E0E0E0", textview23);
					_Shadow(0, 20, "#E0E0E0", textview24);
					_Shadow(0, 20, "#E0E0E0", textview25);
					_Shadow(0, 20, "#E0E0E0", textview26);
					_Shadow(0, 20, "#E0E0E0", textview27);
					_Shadow(0, 20, "#E0E0E0", textview28);
					_Shadow(0, 20, "#E0E0E0", textview29);
					_Shadow(0, 20, "#E0E0E0", textview30);
				}
				else {
					_Shadow(0, 20, "#E0E0E0", textview21);
					var21--;
					wenber.edit().putString("book21", "").commit();
					wenber.edit().putString("book21", "false").commit();
				}
			}
		});
		
		textview22.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (var22 == 0) {
					_Shadow(0, 20, "#FFCC33", textview22);
					var22++;
					wenber.edit().putString("book22", "").commit();
					wenber.edit().putString("book22", "true").commit();
					_Shadow(0, 20, "#E0E0E0", textview1);
					_Shadow(0, 20, "#E0E0E0", textview2);
					_Shadow(0, 20, "#E0E0E0", textview3);
					_Shadow(0, 20, "#E0E0E0", textview4);
					_Shadow(0, 20, "#E0E0E0", textview5);
					_Shadow(0, 20, "#E0E0E0", textview6);
					_Shadow(0, 20, "#E0E0E0", textview7);
					_Shadow(0, 20, "#E0E0E0", textview8);
					_Shadow(0, 20, "#E0E0E0", textview9);
					_Shadow(0, 20, "#E0E0E0", textview10);
					_Shadow(0, 20, "#E0E0E0", textview11);
					_Shadow(0, 20, "#E0E0E0", textview12);
					_Shadow(0, 20, "#E0E0E0", textview13);
					_Shadow(0, 20, "#E0E0E0", textview14);
					_Shadow(0, 20, "#E0E0E0", textview15);
					_Shadow(0, 20, "#E0E0E0", textview16);
					_Shadow(0, 20, "#E0E0E0", textview17);
					_Shadow(0, 20, "#E0E0E0", textview18);
					_Shadow(0, 20, "#E0E0E0", textview19);
					_Shadow(0, 20, "#E0E0E0", textview20);
					_Shadow(0, 20, "#E0E0E0", textview21);
					_Shadow(0, 20, "#E0E0E0", textview23);
					_Shadow(0, 20, "#E0E0E0", textview24);
					_Shadow(0, 20, "#E0E0E0", textview25);
					_Shadow(0, 20, "#E0E0E0", textview26);
					_Shadow(0, 20, "#E0E0E0", textview27);
					_Shadow(0, 20, "#E0E0E0", textview28);
					_Shadow(0, 20, "#E0E0E0", textview29);
					_Shadow(0, 20, "#E0E0E0", textview30);
				}
				else {
					_Shadow(0, 20, "#E0E0E0", textview22);
					var22--;
					wenber.edit().putString("book22", "").commit();
					wenber.edit().putString("book22", "false").commit();
				}
			}
		});
		
		textview23.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (var23 == 0) {
					_Shadow(0, 20, "#FFCC33", textview23);
					var23++;
					wenber.edit().putString("book23", "").commit();
					wenber.edit().putString("book23", "true").commit();
					_Shadow(0, 20, "#E0E0E0", textview1);
					_Shadow(0, 20, "#E0E0E0", textview2);
					_Shadow(0, 20, "#E0E0E0", textview3);
					_Shadow(0, 20, "#E0E0E0", textview4);
					_Shadow(0, 20, "#E0E0E0", textview5);
					_Shadow(0, 20, "#E0E0E0", textview6);
					_Shadow(0, 20, "#E0E0E0", textview7);
					_Shadow(0, 20, "#E0E0E0", textview8);
					_Shadow(0, 20, "#E0E0E0", textview9);
					_Shadow(0, 20, "#E0E0E0", textview10);
					_Shadow(0, 20, "#E0E0E0", textview11);
					_Shadow(0, 20, "#E0E0E0", textview12);
					_Shadow(0, 20, "#E0E0E0", textview13);
					_Shadow(0, 20, "#E0E0E0", textview14);
					_Shadow(0, 20, "#E0E0E0", textview15);
					_Shadow(0, 20, "#E0E0E0", textview16);
					_Shadow(0, 20, "#E0E0E0", textview17);
					_Shadow(0, 20, "#E0E0E0", textview18);
					_Shadow(0, 20, "#E0E0E0", textview19);
					_Shadow(0, 20, "#E0E0E0", textview20);
					_Shadow(0, 20, "#E0E0E0", textview21);
					_Shadow(0, 20, "#E0E0E0", textview22);
					_Shadow(0, 20, "#E0E0E0", textview24);
					_Shadow(0, 20, "#E0E0E0", textview25);
					_Shadow(0, 20, "#E0E0E0", textview26);
					_Shadow(0, 20, "#E0E0E0", textview27);
					_Shadow(0, 20, "#E0E0E0", textview28);
					_Shadow(0, 20, "#E0E0E0", textview29);
					_Shadow(0, 20, "#E0E0E0", textview30);
				}
				else {
					_Shadow(0, 20, "#E0E0E0", textview23);
					var23--;
					wenber.edit().putString("book23", "").commit();
					wenber.edit().putString("book23", "false").commit();
				}
			}
		});
		
		textview24.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (var24 == 0) {
					_Shadow(0, 20, "#FFCC33", textview24);
					var24++;
					wenber.edit().putString("book24", "").commit();
					wenber.edit().putString("book24", "true").commit();
					_Shadow(0, 20, "#E0E0E0", textview1);
					_Shadow(0, 20, "#E0E0E0", textview2);
					_Shadow(0, 20, "#E0E0E0", textview3);
					_Shadow(0, 20, "#E0E0E0", textview4);
					_Shadow(0, 20, "#E0E0E0", textview5);
					_Shadow(0, 20, "#E0E0E0", textview6);
					_Shadow(0, 20, "#E0E0E0", textview7);
					_Shadow(0, 20, "#E0E0E0", textview8);
					_Shadow(0, 20, "#E0E0E0", textview9);
					_Shadow(0, 20, "#E0E0E0", textview10);
					_Shadow(0, 20, "#E0E0E0", textview11);
					_Shadow(0, 20, "#E0E0E0", textview12);
					_Shadow(0, 20, "#E0E0E0", textview13);
					_Shadow(0, 20, "#E0E0E0", textview14);
					_Shadow(0, 20, "#E0E0E0", textview15);
					_Shadow(0, 20, "#E0E0E0", textview16);
					_Shadow(0, 20, "#E0E0E0", textview17);
					_Shadow(0, 20, "#E0E0E0", textview18);
					_Shadow(0, 20, "#E0E0E0", textview19);
					_Shadow(0, 20, "#E0E0E0", textview20);
					_Shadow(0, 20, "#E0E0E0", textview21);
					_Shadow(0, 20, "#E0E0E0", textview22);
					_Shadow(0, 20, "#E0E0E0", textview23);
					_Shadow(0, 20, "#E0E0E0", textview25);
					_Shadow(0, 20, "#E0E0E0", textview26);
					_Shadow(0, 20, "#E0E0E0", textview27);
					_Shadow(0, 20, "#E0E0E0", textview28);
					_Shadow(0, 20, "#E0E0E0", textview29);
					_Shadow(0, 20, "#E0E0E0", textview30);
				}
				else {
					_Shadow(0, 20, "#E0E0E0", textview24);
					var24--;
					wenber.edit().putString("book24", "").commit();
					wenber.edit().putString("book24", "false").commit();
				}
			}
		});
		
		textview25.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (var25 == 0) {
					_Shadow(0, 20, "#FFCC33", textview25);
					var25++;
					wenber.edit().putString("book25", "").commit();
					wenber.edit().putString("book25", "true").commit();
					_Shadow(0, 20, "#E0E0E0", textview1);
					_Shadow(0, 20, "#E0E0E0", textview2);
					_Shadow(0, 20, "#E0E0E0", textview3);
					_Shadow(0, 20, "#E0E0E0", textview4);
					_Shadow(0, 20, "#E0E0E0", textview5);
					_Shadow(0, 20, "#E0E0E0", textview6);
					_Shadow(0, 20, "#E0E0E0", textview7);
					_Shadow(0, 20, "#E0E0E0", textview8);
					_Shadow(0, 20, "#E0E0E0", textview9);
					_Shadow(0, 20, "#E0E0E0", textview10);
					_Shadow(0, 20, "#E0E0E0", textview11);
					_Shadow(0, 20, "#E0E0E0", textview12);
					_Shadow(0, 20, "#E0E0E0", textview13);
					_Shadow(0, 20, "#E0E0E0", textview14);
					_Shadow(0, 20, "#E0E0E0", textview15);
					_Shadow(0, 20, "#E0E0E0", textview16);
					_Shadow(0, 20, "#E0E0E0", textview17);
					_Shadow(0, 20, "#E0E0E0", textview18);
					_Shadow(0, 20, "#E0E0E0", textview19);
					_Shadow(0, 20, "#E0E0E0", textview20);
					_Shadow(0, 20, "#E0E0E0", textview21);
					_Shadow(0, 20, "#E0E0E0", textview22);
					_Shadow(0, 20, "#E0E0E0", textview23);
					_Shadow(0, 20, "#E0E0E0", textview24);
					_Shadow(0, 20, "#E0E0E0", textview26);
					_Shadow(0, 20, "#E0E0E0", textview27);
					_Shadow(0, 20, "#E0E0E0", textview28);
					_Shadow(0, 20, "#E0E0E0", textview29);
					_Shadow(0, 20, "#E0E0E0", textview30);
				}
				else {
					_Shadow(0, 20, "#E0E0E0", textview25);
					var25--;
					wenber.edit().putString("book25", "").commit();
					wenber.edit().putString("book25", "false").commit();
				}
			}
		});
		
		textview26.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (var26 == 0) {
					_Shadow(0, 20, "#FFCC33", textview26);
					var26++;
					wenber.edit().putString("book26", "").commit();
					wenber.edit().putString("book26", "true").commit();
					_Shadow(0, 20, "#E0E0E0", textview1);
					_Shadow(0, 20, "#E0E0E0", textview2);
					_Shadow(0, 20, "#E0E0E0", textview3);
					_Shadow(0, 20, "#E0E0E0", textview4);
					_Shadow(0, 20, "#E0E0E0", textview5);
					_Shadow(0, 20, "#E0E0E0", textview6);
					_Shadow(0, 20, "#E0E0E0", textview7);
					_Shadow(0, 20, "#E0E0E0", textview8);
					_Shadow(0, 20, "#E0E0E0", textview9);
					_Shadow(0, 20, "#E0E0E0", textview10);
					_Shadow(0, 20, "#E0E0E0", textview11);
					_Shadow(0, 20, "#E0E0E0", textview12);
					_Shadow(0, 20, "#E0E0E0", textview13);
					_Shadow(0, 20, "#E0E0E0", textview14);
					_Shadow(0, 20, "#E0E0E0", textview15);
					_Shadow(0, 20, "#E0E0E0", textview16);
					_Shadow(0, 20, "#E0E0E0", textview17);
					_Shadow(0, 20, "#E0E0E0", textview18);
					_Shadow(0, 20, "#E0E0E0", textview19);
					_Shadow(0, 20, "#E0E0E0", textview20);
					_Shadow(0, 20, "#E0E0E0", textview21);
					_Shadow(0, 20, "#E0E0E0", textview22);
					_Shadow(0, 20, "#E0E0E0", textview23);
					_Shadow(0, 20, "#E0E0E0", textview24);
					_Shadow(0, 20, "#E0E0E0", textview25);
					_Shadow(0, 20, "#E0E0E0", textview27);
					_Shadow(0, 20, "#E0E0E0", textview28);
					_Shadow(0, 20, "#E0E0E0", textview29);
					_Shadow(0, 20, "#E0E0E0", textview30);
				}
				else {
					_Shadow(0, 20, "#E0E0E0", textview26);
					var26--;
					wenber.edit().putString("book26", "").commit();
					wenber.edit().putString("book26", "false").commit();
				}
			}
		});
		
		textview27.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (var27 == 0) {
					_Shadow(0, 20, "#FFCC33", textview27);
					var27++;
					wenber.edit().putString("book27", "").commit();
					wenber.edit().putString("book27", "true").commit();
					_Shadow(0, 20, "#E0E0E0", textview1);
					_Shadow(0, 20, "#E0E0E0", textview2);
					_Shadow(0, 20, "#E0E0E0", textview3);
					_Shadow(0, 20, "#E0E0E0", textview4);
					_Shadow(0, 20, "#E0E0E0", textview5);
					_Shadow(0, 20, "#E0E0E0", textview6);
					_Shadow(0, 20, "#E0E0E0", textview7);
					_Shadow(0, 20, "#E0E0E0", textview8);
					_Shadow(0, 20, "#E0E0E0", textview9);
					_Shadow(0, 20, "#E0E0E0", textview10);
					_Shadow(0, 20, "#E0E0E0", textview11);
					_Shadow(0, 20, "#E0E0E0", textview12);
					_Shadow(0, 20, "#E0E0E0", textview13);
					_Shadow(0, 20, "#E0E0E0", textview14);
					_Shadow(0, 20, "#E0E0E0", textview15);
					_Shadow(0, 20, "#E0E0E0", textview16);
					_Shadow(0, 20, "#E0E0E0", textview17);
					_Shadow(0, 20, "#E0E0E0", textview18);
					_Shadow(0, 20, "#E0E0E0", textview19);
					_Shadow(0, 20, "#E0E0E0", textview20);
					_Shadow(0, 20, "#E0E0E0", textview21);
					_Shadow(0, 20, "#E0E0E0", textview22);
					_Shadow(0, 20, "#E0E0E0", textview23);
					_Shadow(0, 20, "#E0E0E0", textview24);
					_Shadow(0, 20, "#E0E0E0", textview25);
					_Shadow(0, 20, "#E0E0E0", textview26);
					_Shadow(0, 20, "#E0E0E0", textview28);
					_Shadow(0, 20, "#E0E0E0", textview29);
					_Shadow(0, 20, "#E0E0E0", textview30);
				}
				else {
					_Shadow(0, 20, "#E0E0E0", textview27);
					var27--;
					wenber.edit().putString("book27", "").commit();
					wenber.edit().putString("book27", "false").commit();
				}
			}
		});
		
		textview28.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (var28 == 0) {
					_Shadow(0, 20, "#FFCC33", textview28);
					var28++;
					wenber.edit().putString("book28", "").commit();
					wenber.edit().putString("book28", "true").commit();
					_Shadow(0, 20, "#E0E0E0", textview1);
					_Shadow(0, 20, "#E0E0E0", textview2);
					_Shadow(0, 20, "#E0E0E0", textview3);
					_Shadow(0, 20, "#E0E0E0", textview4);
					_Shadow(0, 20, "#E0E0E0", textview5);
					_Shadow(0, 20, "#E0E0E0", textview6);
					_Shadow(0, 20, "#E0E0E0", textview7);
					_Shadow(0, 20, "#E0E0E0", textview8);
					_Shadow(0, 20, "#E0E0E0", textview9);
					_Shadow(0, 20, "#E0E0E0", textview10);
					_Shadow(0, 20, "#E0E0E0", textview11);
					_Shadow(0, 20, "#E0E0E0", textview12);
					_Shadow(0, 20, "#E0E0E0", textview13);
					_Shadow(0, 20, "#E0E0E0", textview14);
					_Shadow(0, 20, "#E0E0E0", textview15);
					_Shadow(0, 20, "#E0E0E0", textview16);
					_Shadow(0, 20, "#E0E0E0", textview17);
					_Shadow(0, 20, "#E0E0E0", textview18);
					_Shadow(0, 20, "#E0E0E0", textview19);
					_Shadow(0, 20, "#E0E0E0", textview20);
					_Shadow(0, 20, "#E0E0E0", textview21);
					_Shadow(0, 20, "#E0E0E0", textview22);
					_Shadow(0, 20, "#E0E0E0", textview23);
					_Shadow(0, 20, "#E0E0E0", textview24);
					_Shadow(0, 20, "#E0E0E0", textview25);
					_Shadow(0, 20, "#E0E0E0", textview26);
					_Shadow(0, 20, "#E0E0E0", textview27);
					_Shadow(0, 20, "#E0E0E0", textview29);
					_Shadow(0, 20, "#E0E0E0", textview30);
				}
				else {
					_Shadow(0, 20, "#E0E0E0", textview28);
					var28--;
					wenber.edit().putString("book28", "").commit();
					wenber.edit().putString("book28", "false").commit();
				}
			}
		});
		
		textview29.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (var29 == 0) {
					_Shadow(0, 20, "#FFCC33", textview29);
					var29++;
					wenber.edit().putString("book29", "").commit();
					wenber.edit().putString("book29", "true").commit();
					_Shadow(0, 20, "#E0E0E0", textview1);
					_Shadow(0, 20, "#E0E0E0", textview2);
					_Shadow(0, 20, "#E0E0E0", textview3);
					_Shadow(0, 20, "#E0E0E0", textview4);
					_Shadow(0, 20, "#E0E0E0", textview5);
					_Shadow(0, 20, "#E0E0E0", textview6);
					_Shadow(0, 20, "#E0E0E0", textview7);
					_Shadow(0, 20, "#E0E0E0", textview8);
					_Shadow(0, 20, "#E0E0E0", textview9);
					_Shadow(0, 20, "#E0E0E0", textview10);
					_Shadow(0, 20, "#E0E0E0", textview11);
					_Shadow(0, 20, "#E0E0E0", textview12);
					_Shadow(0, 20, "#E0E0E0", textview13);
					_Shadow(0, 20, "#E0E0E0", textview14);
					_Shadow(0, 20, "#E0E0E0", textview15);
					_Shadow(0, 20, "#E0E0E0", textview16);
					_Shadow(0, 20, "#E0E0E0", textview17);
					_Shadow(0, 20, "#E0E0E0", textview18);
					_Shadow(0, 20, "#E0E0E0", textview19);
					_Shadow(0, 20, "#E0E0E0", textview20);
					_Shadow(0, 20, "#E0E0E0", textview21);
					_Shadow(0, 20, "#E0E0E0", textview22);
					_Shadow(0, 20, "#E0E0E0", textview23);
					_Shadow(0, 20, "#E0E0E0", textview24);
					_Shadow(0, 20, "#E0E0E0", textview25);
					_Shadow(0, 20, "#E0E0E0", textview26);
					_Shadow(0, 20, "#E0E0E0", textview27);
					_Shadow(0, 20, "#E0E0E0", textview28);
					_Shadow(0, 20, "#E0E0E0", textview30);
				}
				else {
					_Shadow(0, 20, "#E0E0E0", textview29);
					var29--;
					wenber.edit().putString("book29", "").commit();
					wenber.edit().putString("book29", "false").commit();
				}
			}
		});
		
		textview30.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (var30 == 0) {
					_Shadow(0, 20, "#FFCC33", textview30);
					var30++;
					wenber.edit().putString("book30", "").commit();
					wenber.edit().putString("book30", "true").commit();
				}
				else {
					_Shadow(0, 20, "#E0E0E0", textview30);
					var30--;
					wenber.edit().putString("book30", "").commit();
					wenber.edit().putString("book30", "false").commit();
				}
			}
		});
		
		_wenberoch_child_listener = new ChildEventListener() {
			@Override
			public void onChildAdded(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onChildChanged(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onChildMoved(DataSnapshot _param1, String _param2) {
				
			}
			
			@Override
			public void onChildRemoved(DataSnapshot _param1) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onCancelled(DatabaseError _param1) {
				final int _errorCode = _param1.getCode();
				final String _errorMessage = _param1.getMessage();
				
			}
		};
		wenberoch.addChildEventListener(_wenberoch_child_listener);
	}
	
	private void initializeLogic() {
		_ui();
		_mchair();
		button1.setVisibility(View.INVISIBLE);
		_GradientDrawable(button1, 20, 0, 0, "#7C4DFF", "#7C4DFF", true, true, 300);
		if (kchair.getString("sn1", "").equals("1")) {
			textview1.setEnabled(false);
			_Shadow(0, 20, "#04a9f4", textview1);
		}
		if (kchair.getString("sn2", "").equals("2")) {
			textview2.setEnabled(false);
			_Shadow(0, 20, "#04a9f4", textview2);
		}
		if (kchair.getString("sn3", "").equals("3")) {
			textview3.setEnabled(false);
			_Shadow(0, 20, "#04a9f4", textview3);
		}
		if (kchair.getString("sn4", "").equals("4")) {
			textview4.setEnabled(false);
			_Shadow(0, 20, "#04a9f4", textview4);
		}
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	public void _ui () {
		_Shadow(0, 30, "#FFFFFF", legendb);
		_Shadow(0, 30, "#FFFFFF", chai);
		_Shadow(0, 20, "#E0E0E0", em);
		_Shadow(0, 20, "#FFCC33", se);
		_Shadow(0, 20, "#04a9f4", bo);
		
		_Shadow(0, 20, "#E0E0E0", textview1);
		_Shadow(0, 20, "#E0E0E0", textview2);
		_Shadow(0, 20, "#E0E0E0", textview3);
		_Shadow(0, 20, "#E0E0E0", textview4);
		_Shadow(0, 20, "#E0E0E0", textview5);
		_Shadow(0, 20, "#E0E0E0", textview6);
		_Shadow(0, 20, "#E0E0E0", textview7);
		_Shadow(0, 20, "#E0E0E0", textview8);
		_Shadow(0, 20, "#E0E0E0", textview9);
		_Shadow(0, 20, "#E0E0E0", textview10);
		_Shadow(0, 20, "#E0E0E0", textview11);
		_Shadow(0, 20, "#E0E0E0", textview12);
		_Shadow(0, 20, "#E0E0E0", textview13);
		_Shadow(0, 20, "#E0E0E0", textview14);
		_Shadow(0, 20, "#E0E0E0", textview15);
		_Shadow(0, 20, "#E0E0E0", textview16);
		_Shadow(0, 20, "#E0E0E0", textview17);
		_Shadow(0, 20, "#E0E0E0", textview18);
		_Shadow(0, 20, "#E0E0E0", textview19);
		_Shadow(0, 20, "#E0E0E0", textview20);
		_Shadow(0, 20, "#E0E0E0", textview21);
		_Shadow(0, 20, "#E0E0E0", textview22);
		_Shadow(0, 20, "#E0E0E0", textview23);
		_Shadow(0, 20, "#E0E0E0", textview24);
		_Shadow(0, 20, "#E0E0E0", textview25);
		_Shadow(0, 20, "#E0E0E0", textview26);
		_Shadow(0, 20, "#E0E0E0", textview27);
		_Shadow(0, 20, "#E0E0E0", textview28);
		_Shadow(0, 20, "#E0E0E0", textview29);
		_Shadow(0, 20, "#E0E0E0", textview30);
	}
	
	
	public void _Shadow (final double _sadw, final double _cru, final String _wc, final View _widgets) {
		android.graphics.drawable.GradientDrawable wd = new android.graphics.drawable.GradientDrawable();
		wd.setColor(Color.parseColor(_wc));
		wd.setCornerRadius((int)_cru);
		_widgets.setElevation((int)_sadw);
		_widgets.setBackground(wd);
	}
	
	
	public void _mchair () {
		if (kchair.getString("mbook", "").equals("true")) {
			textview1.setEnabled(false);
			_Shadow(0, 20, "#04a9f4", textview1);
		}
	}
	
	
	public void _GradientDrawable (final View _view, final double _radius, final double _stroke, final double _shadow, final String _color, final String _borderColor, final boolean _ripple, final boolean _clickAnim, final double _animDuration) {
		if (_ripple) {
			android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
			gd.setColor(Color.parseColor(_color));
			gd.setCornerRadius((int)_radius);
			gd.setStroke((int)_stroke,Color.parseColor(_borderColor));
			if (Build.VERSION.SDK_INT >= 21){
				_view.setElevation((int)_shadow);}
			android.content.res.ColorStateList clrb = new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{Color.parseColor("#9e9e9e")});
			android.graphics.drawable.RippleDrawable ripdrb = new android.graphics.drawable.RippleDrawable(clrb , gd, null);
			_view.setClickable(true);
			_view.setBackground(ripdrb);
		}
		else {
			android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
			gd.setColor(Color.parseColor(_color));
			gd.setCornerRadius((int)_radius);
			gd.setStroke((int)_stroke,Color.parseColor(_borderColor));
			_view.setBackground(gd);
			if (Build.VERSION.SDK_INT >= 21){
				_view.setElevation((int)_shadow);}
		}
		if (_clickAnim) {
			_view.setOnTouchListener(new View.OnTouchListener() {
				@Override
				public boolean onTouch(View v, MotionEvent event) {
					switch (event.getAction()){
						case MotionEvent.ACTION_DOWN:{
							ObjectAnimator scaleX = new ObjectAnimator();
							scaleX.setTarget(_view);
							scaleX.setPropertyName("scaleX");
							scaleX.setFloatValues(0.9f);
							scaleX.setDuration((int)_animDuration);
							scaleX.start();
							
							ObjectAnimator scaleY = new ObjectAnimator();
							scaleY.setTarget(_view);
							scaleY.setPropertyName("scaleY");
							scaleY.setFloatValues(0.9f);
							scaleY.setDuration((int)_animDuration);
							scaleY.start();
							break;
						}
						case MotionEvent.ACTION_UP:{
							
							ObjectAnimator scaleX = new ObjectAnimator();
							scaleX.setTarget(_view);
							scaleX.setPropertyName("scaleX");
							scaleX.setFloatValues((float)1);
							scaleX.setDuration((int)_animDuration);
							scaleX.start();
							
							ObjectAnimator scaleY = new ObjectAnimator();
							scaleY.setTarget(_view);
							scaleY.setPropertyName("scaleY");
							scaleY.setFloatValues((float)1);
							scaleY.setDuration((int)_animDuration);
							scaleY.start();
							
							break;
						}
					}
					return false;
				}
			});
		}
	}
	
	
	public void _first () {
		final AlertDialog dialog1 = new AlertDialog.Builder(SeatActivity.this).create();
		View inflate = getLayoutInflater().inflate(R.layout.pay,null); 
		dialog1.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
		dialog1.setView(inflate);
		
		TextView b1 = (TextView) inflate.findViewById(R.id.b1);
		
		TextView b2 = (TextView) inflate.findViewById(R.id.b2);
		
		LinearLayout bg = (LinearLayout) inflate.findViewById(R.id.bg);
		_rippleRoundStroke(bg, "#FFFFFF", "#E57373", 20, 0, "#000000");
		b1.setOnClickListener(new View.OnClickListener(){ public void onClick(View v){
				//action one
				i.setClass(getApplicationContext(), CheckoutActivity.class);
				startActivity(i);
				finish();
				dialog1.dismiss();
				dialog1.dismiss();
			}
		});
		b2.setOnClickListener(new View.OnClickListener(){ public void onClick(View v){
				//action two
				SketchwareUtil.showMessage(getApplicationContext(), "Coming soon.....");
				dialog1.dismiss();
			}
		});
		dialog1.setCancelable(false);
		dialog1.show();
	}
	
	
	public void _rippleRoundStroke (final View _view, final String _focus, final String _pressed, final double _round, final double _stroke, final String _strokeclr) {
		android.graphics.drawable.GradientDrawable GG = new android.graphics.drawable.GradientDrawable();
		GG.setColor(Color.parseColor(_focus));
		GG.setCornerRadius((float)_round);
		GG.setStroke((int) _stroke,
		Color.parseColor("#" + _strokeclr.replace("#", "")));
		android.graphics.drawable.RippleDrawable RE = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{ Color.parseColor(_pressed)}), GG, null);
		_view.setBackground(RE);
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