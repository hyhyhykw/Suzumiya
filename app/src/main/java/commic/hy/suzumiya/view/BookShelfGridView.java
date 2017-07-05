//package commic.hy.suzumiya.view;
//
//import android.R.integer;
//import android.content.Context;
//import android.graphics.Bitmap;
//import android.graphics.BitmapFactory;
//import android.graphics.Canvas;
//import android.util.AttributeSet;
//import android.widget.GridView;
//
//import commic.hy.suzumiya.R;
//import commic.hy.suzumiya.utils.ImageUtil;
//
//
//public class BookShelfGridView extends GridView {
//	private Bitmap background;
//
//	public BookShelfGridView(Context context, AttributeSet attrs) {
//		super(context, attrs);
//	}
//
//	@Override
//	protected void dispatchDraw(Canvas canvas) {
//
//		int count = getChildCount();// 一个屏幕看到多少个item
//
//		int height = MyBook.itemBackground.getHeight();
//		background = ImageUtil.getBitmap(getContext(), R.drawable.bookshelf_layer_center, MyBook.width / 3, height + height / 4);
//
//		int top = count > 0 ? getChildAt(0).getTop() : 0;
//		int backgroundWidth = background.getWidth();
//		int backgroundHeight = background.getHeight();
//
//		// System.out.println("count:" + count);
//		// System.out.println("top:" + top);
//		// System.out.println("backgroundWidth:" + backgroundWidth);
//		// System.out.println("backgroundHeight:" + backgroundHeight);
//		// System.out.println("width:" + MyBook.width);
//		// System.out.println("height:" + MyBook.height);
//
//		for (int y = top; y < MyBook.height; y += backgroundHeight) {
//			for (int x = 0; x < MyBook.width; x += backgroundWidth) {
//				// System.out.println(x + "--------------------" + y);
//				canvas.drawBitmap(background, x, y, null);
//			}
//		}
//		super.dispatchDraw(canvas);
//	}
//}
