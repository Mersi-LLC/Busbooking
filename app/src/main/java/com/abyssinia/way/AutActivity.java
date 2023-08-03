package com.abyssinia.way;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.*;
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
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.*;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.os.Bundle;
import java.io.InputStream;
import android.content.Intent;
import android.net.Uri;
import java.util.Timer;
import java.util.TimerTask;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.GenericTypeIndicator;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.FirebaseAuth;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import android.view.View;
import android.text.Editable;
import android.text.TextWatcher;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.blogspot.atifsoftwares.animatoolib.*;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class AutActivity extends  AppCompatActivity  { 
	
	private Timer _timer = new Timer();
	private FirebaseDatabase _firebase = FirebaseDatabase.getInstance();
	
	private HashMap<String, Object> bus = new HashMap<>();
	private HashMap<String, Object> info = new HashMap<>();
	private HashMap<String, Object> res = new HashMap<>();
	private double var = 0;
	private double va = 0;
	
	private LinearLayout linear1;
	private LinearLayout a;
	private LinearLayout b;
	private TextView textview22;
	private LinearLayout l1;
	private TextView textview18;
	private LinearLayout linear28;
	private TextInputLayout textinputlayout1;
	private LinearLayout lo;
	private LinearLayout linear30;
	private LinearLayout linear31;
	private Button button5;
	private LinearLayout linear32;
	private LinearLayout linear33;
	private EditText em;
	private TextInputLayout textinputlayout3;
	private Button shl;
	private EditText pw;
	private TextView textview19;
	private TextView textview20;
	private LinearLayout signup;
	private ScrollView vscroll1;
	private LinearLayout oooooooooooo;
	private LinearLayout linear10;
	private LinearLayout l2;
	private TextView textview8;
	private LinearLayout linear12;
	private TextInputLayout textinputlayout4;
	private LinearLayout linear34;
	private TextInputLayout textinputlayout5;
	private LinearLayout linear35;
	private TextInputLayout textinputlayout6;
	private LinearLayout linear36;
	private TextInputLayout textinputlayout7;
	private LinearLayout linear37;
	private LinearLayout sup;
	private LinearLayout linear13;
	private Button button2;
	private LinearLayout linear15;
	private LinearLayout linear16;
	private EditText fna;
	private EditText lna;
	private EditText pho;
	private EditText ema;
	private TextInputLayout textinputlayout8;
	private Button shc;
	private EditText np;
	private TextView textview21;
	private TextView textview11;
	private TextView textview12;
	
	private Intent i = new Intent();
	private TimerTask t;
	private DatabaseReference account = _firebase.getReference("account");
	private ChildEventListener _account_child_listener;
	private FirebaseAuth auth;
	private OnCompleteListener<Void> auth_updateEmailListener;
	private OnCompleteListener<Void> auth_updatePasswordListener;
	private OnCompleteListener<Void> auth_emailVerificationSentListener;
	private OnCompleteListener<Void> auth_deleteUserListener;
	private OnCompleteListener<Void> auth_updateProfileListener;
	private OnCompleteListener<AuthResult> auth_phoneAuthListener;
	private OnCompleteListener<AuthResult> auth_googleSignInListener;
	private OnCompleteListener<AuthResult> _auth_create_user_listener;
	private OnCompleteListener<AuthResult> _auth_sign_in_listener;
	private OnCompleteListener<Void> _auth_reset_password_listener;
	private RequestNetwork cr;
	private RequestNetwork.RequestListener _cr_request_listener;
	private ProgressDialog prog;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.aut);
		initialize(_savedInstanceState);
		com.google.firebase.FirebaseApp.initializeApp(this);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		a = (LinearLayout) findViewById(R.id.a);
		b = (LinearLayout) findViewById(R.id.b);
		textview22 = (TextView) findViewById(R.id.textview22);
		l1 = (LinearLayout) findViewById(R.id.l1);
		textview18 = (TextView) findViewById(R.id.textview18);
		linear28 = (LinearLayout) findViewById(R.id.linear28);
		textinputlayout1 = (TextInputLayout) findViewById(R.id.textinputlayout1);
		lo = (LinearLayout) findViewById(R.id.lo);
		linear30 = (LinearLayout) findViewById(R.id.linear30);
		linear31 = (LinearLayout) findViewById(R.id.linear31);
		button5 = (Button) findViewById(R.id.button5);
		linear32 = (LinearLayout) findViewById(R.id.linear32);
		linear33 = (LinearLayout) findViewById(R.id.linear33);
		em = (EditText) findViewById(R.id.em);
		textinputlayout3 = (TextInputLayout) findViewById(R.id.textinputlayout3);
		shl = (Button) findViewById(R.id.shl);
		pw = (EditText) findViewById(R.id.pw);
		textview19 = (TextView) findViewById(R.id.textview19);
		textview20 = (TextView) findViewById(R.id.textview20);
		signup = (LinearLayout) findViewById(R.id.signup);
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		oooooooooooo = (LinearLayout) findViewById(R.id.oooooooooooo);
		linear10 = (LinearLayout) findViewById(R.id.linear10);
		l2 = (LinearLayout) findViewById(R.id.l2);
		textview8 = (TextView) findViewById(R.id.textview8);
		linear12 = (LinearLayout) findViewById(R.id.linear12);
		textinputlayout4 = (TextInputLayout) findViewById(R.id.textinputlayout4);
		linear34 = (LinearLayout) findViewById(R.id.linear34);
		textinputlayout5 = (TextInputLayout) findViewById(R.id.textinputlayout5);
		linear35 = (LinearLayout) findViewById(R.id.linear35);
		textinputlayout6 = (TextInputLayout) findViewById(R.id.textinputlayout6);
		linear36 = (LinearLayout) findViewById(R.id.linear36);
		textinputlayout7 = (TextInputLayout) findViewById(R.id.textinputlayout7);
		linear37 = (LinearLayout) findViewById(R.id.linear37);
		sup = (LinearLayout) findViewById(R.id.sup);
		linear13 = (LinearLayout) findViewById(R.id.linear13);
		button2 = (Button) findViewById(R.id.button2);
		linear15 = (LinearLayout) findViewById(R.id.linear15);
		linear16 = (LinearLayout) findViewById(R.id.linear16);
		fna = (EditText) findViewById(R.id.fna);
		lna = (EditText) findViewById(R.id.lna);
		pho = (EditText) findViewById(R.id.pho);
		ema = (EditText) findViewById(R.id.ema);
		textinputlayout8 = (TextInputLayout) findViewById(R.id.textinputlayout8);
		shc = (Button) findViewById(R.id.shc);
		np = (EditText) findViewById(R.id.np);
		textview21 = (TextView) findViewById(R.id.textview21);
		textview11 = (TextView) findViewById(R.id.textview11);
		textview12 = (TextView) findViewById(R.id.textview12);
		auth = FirebaseAuth.getInstance();
		cr = new RequestNetwork(this);
		
		button5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (em.getText().toString().equals("") || pw.getText().toString().equals("")) {
					if (em.getText().toString().equals("")) {
						textinputlayout1.setError("Enter valid email");
					}
					if (pw.getText().toString().equals("")) {
						textinputlayout3.setError("Enter correct password");
					}
				}
				else {
					if ((0 < em.getText().toString().length()) && (0 < pw.getText().toString().length())) {
						auth.signInWithEmailAndPassword(em.getText().toString(), pw.getText().toString()).addOnCompleteListener(AutActivity.this, _auth_sign_in_listener);
						_ProgresbarShow("Wait a minute ......");
					}
					else {
						
					}
				}
			}
		});
		
		em.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				textinputlayout1.setErrorEnabled(false);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		shl.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (var == 0) {
					shl.setBackgroundResource(R.drawable.ic_remove_red_eye_black);
					pw.setInputType(InputType.TYPE_CLASS_TEXT |
					InputType.TYPE_TEXT_VARIATION_NORMAL);
					var++;
				}
				else {
					shl.setBackgroundResource(R.drawable.ic_visibility_off_black);
					pw.setInputType(InputType.TYPE_CLASS_TEXT |
					InputType.TYPE_TEXT_VARIATION_PASSWORD);
					var--;
				}
			}
		});
		
		pw.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				textinputlayout3.setErrorEnabled(false);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview20.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				b.setVisibility(View.VISIBLE);
				a.setVisibility(View.GONE);
			}
		});
		
		button2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (fna.getText().toString().equals("") || (lna.getText().toString().equals("") || (pho.getText().toString().equals("") || (ema.getText().toString().equals("") || np.getText().toString().equals(""))))) {
					if (fna.getText().toString().equals("")) {
						textinputlayout4.setError("Enter first name");
					}
					if (lna.getText().toString().equals("")) {
						textinputlayout5.setError("Enter last name");
					}
					if (pho.getText().toString().equals("")) {
						textinputlayout6.setError("Enter phone");
					}
					if (ema.getText().toString().equals("")) {
						textinputlayout7.setError("Enter email");
					}
					if (np.getText().toString().equals("")) {
						textinputlayout8.setError("Enter password");
					}
				}
				else {
					if ((0 < fna.getText().toString().length()) && ((0 < lna.getText().toString().length()) || (0 < ema.getText().toString().length()))) {
						cr.startRequestNetwork(RequestNetworkController.GET, "https://v1.nocodeapi.com/lij_baya/email-verify/rFgIYhfkkvmRNhUW?email=".concat(ema.getText().toString()), "", _cr_request_listener);
						_ProgresbarShow("Creating ......");
					}
					else {
						
					}
				}
			}
		});
		
		fna.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				textinputlayout4.setErrorEnabled(false);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		lna.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				textinputlayout5.setErrorEnabled(false);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		pho.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				textinputlayout6.setErrorEnabled(false);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		ema.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				textinputlayout7.setErrorEnabled(false);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		shc.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (va == 0) {
					shc.setBackgroundResource(R.drawable.ic_remove_red_eye_black);
					np.setInputType(InputType.TYPE_CLASS_TEXT |
					InputType.TYPE_TEXT_VARIATION_NORMAL);
					va++;
				}
				else {
					shc.setBackgroundResource(R.drawable.ic_visibility_off_black);
					np.setInputType(InputType.TYPE_CLASS_TEXT |
					InputType.TYPE_TEXT_VARIATION_PASSWORD);
					va--;
				}
			}
		});
		
		np.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				textinputlayout8.setErrorEnabled(false);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview12.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				a.setVisibility(View.VISIBLE);
				b.setVisibility(View.GONE);
			}
		});
		
		_account_child_listener = new ChildEventListener() {
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
		account.addChildEventListener(_account_child_listener);
		
		_cr_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				res = new Gson().fromJson(_response, new TypeToken<HashMap<String, Object>>(){}.getType());
				if (res.get("is_reachable").toString().equals("invalid")) {
					_first();
				}
				else {
					if (res.get("is_reachable").toString().equals("safe")) {
						auth.createUserWithEmailAndPassword(ema.getText().toString(), np.getText().toString()).addOnCompleteListener(AutActivity.this, _auth_create_user_listener);
					}
					else {
						_validem();
					}
				}
			}
			
			@Override
			public void onErrorResponse(String _param1, String _param2) {
				final String _tag = _param1;
				final String _message = _param2;
				
			}
		};
		
		auth_updateEmailListener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		auth_updatePasswordListener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		auth_emailVerificationSentListener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		auth_deleteUserListener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		auth_phoneAuthListener = new OnCompleteListener<AuthResult>() {
			@Override
			public void onComplete(Task<AuthResult> task){
				final boolean _success = task.isSuccessful();
				final String _errorMessage = task.getException() != null ? task.getException().getMessage() : "";
				
			}
		};
		
		auth_updateProfileListener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		auth_googleSignInListener = new OnCompleteListener<AuthResult>() {
			@Override
			public void onComplete(Task<AuthResult> task){
				final boolean _success = task.isSuccessful();
				final String _errorMessage = task.getException() != null ? task.getException().getMessage() : "";
				
			}
		};
		
		_auth_create_user_listener = new OnCompleteListener<AuthResult>() {
			@Override
			public void onComplete(Task<AuthResult> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				if (_success) {
					bus = new HashMap<>();
					bus.put("fn", fna.getText().toString());
					bus.put("ln", lna.getText().toString());
					bus.put("ph", pho.getText().toString());
					bus.put("em", ema.getText().toString());
					bus.put("pw", np.getText().toString());
					bus.put("incentive", "0");
					account.child(FirebaseAuth.getInstance().getCurrentUser().getUid()).updateChildren(bus);
					_Toast("FF69B4", "0084FF", "Created");
					b.setVisibility(View.GONE);
					a.setVisibility(View.VISIBLE);
					_ProgresbarDimiss();
				}
				else {
					_ProgresbarDimiss();
					_Toast("FF3300", "FFFC00", _errorMessage);
				}
			}
		};
		
		_auth_sign_in_listener = new OnCompleteListener<AuthResult>() {
			@Override
			public void onComplete(Task<AuthResult> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				if (_success) {
					_ProgresbarDimiss();
					i.setClass(getApplicationContext(), LoadActivity.class);
					startActivity(i);
					finish();
				}
				else {
					_ProgresbarDimiss();
					_Toast("FF3300", "FF69B4", _errorMessage);
				}
			}
		};
		
		_auth_reset_password_listener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				
			}
		};
	}
	
	private void initializeLogic() {
		_ui();
		if ((FirebaseAuth.getInstance().getCurrentUser() != null)) {
			i.setClass(getApplicationContext(), LoadActivity.class);
			startActivity(i);
			finish();
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
		_Edittext(l1);
		_Edittext(l2);
		_editstyle(fna);
		_editstyle(lna);
		_editstyle(pho);
		_editstyle(ema);
		_editstyle(sup);
		_editstyle(em);
		_editstyle(lo);
		_GradientDrawable(button5, 20, 0, 0, "#7C4DFF", "#7C4DFF", true, true, 300);
		_GradientDrawable(button2, 20, 0, 0, "#7C4DFF", "#7C4DFF", true, true, 300);
		_edittextui();
		_EditTextLimit(pho, 10, textview21);
		textview21.setVisibility(View.GONE);
	}
	
	
	public void _Shadow (final double _sadw, final double _cru, final String _wc, final View _widgets) {
		android.graphics.drawable.GradientDrawable wd = new android.graphics.drawable.GradientDrawable();
		wd.setColor(Color.parseColor(_wc));
		wd.setCornerRadius((int)_cru);
		_widgets.setElevation((int)_sadw);
		_widgets.setBackground(wd);
	}
	
	
	public void _Edittext (final View _view) {
		android.graphics.drawable.GradientDrawable CRNSO = new android.graphics.drawable.GradientDrawable();
		CRNSO.setColor(Color.parseColor("#ffffff"));
		CRNSO.setCornerRadii(new float[]{ (float) 14,(float) 14,(float) 14,(float) 14,(float) 14,(float) 14,(float) 14,(float) 14 });
		CRNSO.setStroke((int) 2, Color.parseColor("#0014ff"));
		_view.setElevation((float) 10);
		_view.setBackground(CRNSO);
	}
	
	
	public void _editstyle (final View _view) {
		android.graphics.drawable.GradientDrawable CRNSO = new android.graphics.drawable.GradientDrawable();
		CRNSO.setColor(Color.parseColor("#ffffff"));
		CRNSO.setCornerRadii(new float[]{ (float) 14,(float) 14,(float) 14,(float) 14,(float) 14,(float) 14,(float) 14,(float) 14 });
		CRNSO.setStroke((int) 2, Color.parseColor("#9E9E9E"));
		_view.setElevation((float) 10);
		_view.setBackground(CRNSO);
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
	
	
	public void _Toast (final String _bg, final String _st, final String _msg) {
		TextView tvu = new TextView(this);
		
		tvu.setLayoutParams(
		  new ViewGroup.LayoutParams(
		    android.widget.LinearLayout
		    .LayoutParams.WRAP_CONTENT,
		    android.widget.LinearLayout
		    .LayoutParams.WRAP_CONTENT)
		);
		tvu.setTextColor(Color.parseColor("#"+_st));
		tvu.setGravity(Gravity.CENTER);
		tvu.setText(_msg);
		
		
		LinearLayout v = new LinearLayout(this);
		
		android.graphics.drawable.GradientDrawable gd =
		  new android.graphics.drawable.GradientDrawable();
		gd.setColor(Color.parseColor("#"+_bg));
		gd.setStroke((int)getDip(2), Color.parseColor("#"+_st));
		gd.setCornerRadius(6);
		v.setBackground(gd);
		v.setPadding((int)getDip(8),(int)getDip(8),(int)getDip(8),(int)getDip(8));
		
		v.addView(tvu);
		
		
		Toast t = Toast.makeText(getApplicationContext(),"",Toast.LENGTH_SHORT);
		t.setView(v);
		t.show();
	}
	
	
	public void _error_message (final TextView _view, final String _message) {
		_view.setError(_message);
	}
	
	
	public void _edittextui () {
		//email
		textinputlayout1.setBoxBackgroundColor(0xFFFFFFFF);
		textinputlayout1.setBoxStrokeColor(0xFF2196F3);
		textinputlayout1.setBoxBackgroundMode(TextInputLayout.BOX_BACKGROUND_OUTLINE);
		textinputlayout1.setBoxCornerRadii((float)10, (float)10, (float)10, (float)10);
		//password
		textinputlayout3.setBoxBackgroundColor(0xFFFFFFFF);
		textinputlayout3.setBoxStrokeColor(0xFF2196F3);
		textinputlayout3.setBoxBackgroundMode(TextInputLayout.BOX_BACKGROUND_OUTLINE);
		textinputlayout3.setBoxCornerRadii((float)10, (float)10, (float)10, (float)10);
		//reset password
		textinputlayout4.setBoxBackgroundColor(0xFFFFFFFF);
		textinputlayout4.setBoxStrokeColor(0xFF2196F3);
		textinputlayout4.setBoxBackgroundMode(TextInputLayout.BOX_BACKGROUND_OUTLINE);
		textinputlayout4.setBoxCornerRadii((float)10, (float)10, (float)10, (float)10);
		//cemail
		textinputlayout5.setBoxBackgroundColor(0xFFFFFFFF);
		textinputlayout5.setBoxStrokeColor(0xFF2196F3);
		textinputlayout5.setBoxBackgroundMode(TextInputLayout.BOX_BACKGROUND_OUTLINE);
		textinputlayout5.setBoxCornerRadii((float)10, (float)10, (float)10, (float)10);
		//cpassword
		textinputlayout6.setBoxBackgroundColor(0xFFFFFFFF);
		textinputlayout6.setBoxStrokeColor(0xFF2196F3);
		textinputlayout6.setBoxBackgroundMode(TextInputLayout.BOX_BACKGROUND_OUTLINE);
		textinputlayout6.setBoxCornerRadii((float)10, (float)10, (float)10, (float)10);
		//lastname
		textinputlayout7.setBoxBackgroundColor(0xFFFFFFFF);
		textinputlayout7.setBoxStrokeColor(0xFF2196F3);
		textinputlayout7.setBoxBackgroundMode(TextInputLayout.BOX_BACKGROUND_OUTLINE);
		textinputlayout7.setBoxCornerRadii((float)10, (float)10, (float)10, (float)10);
		//firstname
		textinputlayout8.setBoxBackgroundColor(0xFFFFFFFF);
		textinputlayout8.setBoxStrokeColor(0xFF2196F3);
		textinputlayout8.setBoxBackgroundMode(TextInputLayout.BOX_BACKGROUND_OUTLINE);
		textinputlayout8.setBoxCornerRadii((float)10, (float)10, (float)10, (float)10);
	}
	
	
	public void _EditTextLimit (final TextView _edittext, final double _limit, final TextView _output_tv) {
		_output_tv.setText(String.valueOf((long)(_edittext.getText().toString().length())).concat(" / ".concat(String.valueOf((long)(_limit)))));
		_edittext.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String _charSeq = _param1.toString();
				_output_tv.setText(String.valueOf((long)(_edittext.getText().toString().length())).concat(" / ".concat(String.valueOf((long)(_limit)))));
			}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		_edittext.setFilters( new InputFilter[] { new InputFilter.LengthFilter((int)_limit) } );
	}
	
	
	public void _first () {
		final AlertDialog dialog1 = new AlertDialog.Builder(AutActivity.this).create();
		View inflate = getLayoutInflater().inflate(R.layout.authms,null); 
		dialog1.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
		dialog1.setView(inflate);
		
		TextView msg = (TextView) inflate.findViewById(R.id.msg);
		
		TextView b1 = (TextView) inflate.findViewById(R.id.b1);
		
		TextView b2 = (TextView) inflate.findViewById(R.id.b2);
		
		LinearLayout bg = (LinearLayout) inflate.findViewById(R.id.bg);
		b1.setText("Warning");
		b2.setText("Retry");
		msg.setText("This email is invalid please use valid email");
		_rippleRoundStroke(bg, "#FFFFFF", "#000000", 20, 0, "#000000");
		_GradientDrawable(b2, 20, 0, 0, "#7C4DFF", "#7C4DFF", true, true, 300);
		b2.setOnClickListener(new View.OnClickListener(){ public void onClick(View v){
				//action two
				//
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
	
	
	public void _validem () {
		final AlertDialog dialog1 = new AlertDialog.Builder(AutActivity.this).create();
		View inflate = getLayoutInflater().inflate(R.layout.authms,null); 
		dialog1.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
		dialog1.setView(inflate);
		
		TextView msg = (TextView) inflate.findViewById(R.id.msg);
		
		TextView b1 = (TextView) inflate.findViewById(R.id.b1);
		
		TextView b2 = (TextView) inflate.findViewById(R.id.b2);
		
		LinearLayout bg = (LinearLayout) inflate.findViewById(R.id.bg);
		b1.setText("Warning");
		b2.setText("Retry");
		msg.setText("This email is unknown please use valid email");
		_rippleRoundStroke(bg, "#FFFFFF", "#000000", 20, 0, "#000000");
		_GradientDrawable(b2, 20, 0, 0, "#7C4DFF", "#7C4DFF", true, true, 300);
		b2.setOnClickListener(new View.OnClickListener(){ public void onClick(View v){
				//action two
				//
				dialog1.dismiss();
			}
		});
		dialog1.setCancelable(false);
		dialog1.show();
	}
	
	
	public void _ProgresbarShow (final String _title) {
		prog = new ProgressDialog(AutActivity.this);
		prog.setMax(100);
		prog.setMessage(_title);
		prog.setIndeterminate(true);
		prog.setCancelable(false);
		prog.show();
	}
	
	
	public void _ProgresbarDimiss () {
		if(prog != null)
		{
			prog.dismiss();
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