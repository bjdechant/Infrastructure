
package com.infrastructure.activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.infrastructure.utilities.Utilities;
import com.jjnford.android.R;

/**
 * @author jjNford
 *
 */
public class MainActivity extends Activity {
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        
    	// Call super constructor.
    	super.onCreate(savedInstanceState);
    	
    	// Example ----------
    	
    	// Create views.
    	ViewGroup main = new LinearLayout(this);
    	TextView top = new TextView(this);
    	
    	// Set view parameters.
    	main.setLayoutParams( Utilities.Parameters.FILL_PARENT );
    	top.setLayoutParams( Utilities.Parameters.FILL_WIDTH_SET_HEIGHT( Utilities.Convert.dipsToPixels(40) ) );
    	
    	// Set view colors.
    	main.setBackgroundColor( this.getResources().getColor(R.color.black) );
    	top.setBackgroundColor( this.getResources().getColor(R.color.white) );
    	top.setTextColor( this.getResources().getColor(R.color.blue) );
    	
    	// Set text.
    	top.setText("Infrastructure");
    	
    	// Build main.
    	top.setGravity(Gravity.CENTER);
    	main.addView(top);    	    	
        setContentView(main);
        // End Example ----------
    }
}