package de.wimafi.incomingcall;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.os.Vibrator;
import com.googlecode.androidannotations.annotations.Background;
import com.googlecode.androidannotations.annotations.Click;
import com.googlecode.androidannotations.annotations.EActivity;
import com.googlecode.androidannotations.annotations.Fullscreen;
import com.googlecode.androidannotations.annotations.NoTitle;

@NoTitle
@Fullscreen
@EActivity(R.layout.activity_fullscreen)
public class FullscreenActivity extends Activity {

	@Override
	protected void onResume() {
		vibrate();
		super.onResume();
	}

	@Background
	@Click(R.id.accept)
	void vibrate() {
		Vibrator vib = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
		byte i = 0;
		while (i++ < 100) {
			vib.vibrate(500L);
			SystemClock.sleep(900L);
		}
	}

	@Click
	public void dismiss() {
		this.finish();
	}
}