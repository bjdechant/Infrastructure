package com.infrastructure.utilities;

import android.app.Application;
import android.content.Context;

/**
 * BigBrother - A global way to call the application context.
 * 
 * @author jjnford
 *
 */
public final class BigBrother extends Application {

	private static Context context;
	
	@Override
	public void onCreate() {
		super.onCreate();
		context = this;
	}
	
	/**
	 * getContext
	 * 
	 * @return Context
	 */
	public static Context getContext() { 
		return context;
	}
}
