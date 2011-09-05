package com.infrastructure.utilities;

import android.view.ViewGroup.LayoutParams;

/**
 * Utilities - classes and functions often used.
 * 
 * @author jj
 */
public final class Utilities {

	/**
	 * Convert - Help make numerical conversions.
	 * 
	 * @author jj
	 *
	 */
	public final static class Convert {

		public static final int dipsToPixels (float dips) { 
			return Math.round( dips * BigBrother.getContext().getResources().getDisplayMetrics().density );
		}
	
		public static final float pixelsToDips (int pixels) {
			return pixels / BigBrother.getContext().getResources().getDisplayMetrics().density;
		}
	}
	
	/**
	 * Parameters - Faster way to create java view parameters.
	 * 
	 * @author jj
	 *
	 */
	public final static class Parameters {
		
		// Parameters
		public static final LayoutParams WRAP_CONTENT = new LayoutParams( LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT );
		public static final LayoutParams FILL_PARENT = new LayoutParams( LayoutParams.FILL_PARENT, LayoutParams.FILL_PARENT );
		public static final LayoutParams WRAP_WIDTH_FILL_HEIGHT = new LayoutParams( LayoutParams.WRAP_CONTENT, LayoutParams.FILL_PARENT );
		public static final LayoutParams FILL_WIDHT_WRAP_HEIGHT = new LayoutParams( LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT );
				
		/**
		 * FILL_WIDTH_SET_HEIGHT
		 * 
		 * @param x (in pixels)
		 * @return LayoutParams
		 */
		public static final LayoutParams FILL_WIDTH_SET_HEIGHT (int x) {
			return new LayoutParams (LayoutParams.FILL_PARENT, x);
		}
		
		/**
		 * SET_WIDTH_FILL_HEIGHT
		 * 
		 * @param x (in pixels)
		 * @return LayoutParams
		 */
		public static final LayoutParams SET_WIDTH_FILL_HEIGHT (int x) {
			return new LayoutParams (x, LayoutParams.FILL_PARENT);
		}
	}
}
