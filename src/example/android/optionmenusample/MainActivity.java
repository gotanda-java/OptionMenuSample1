package example.android.optionmenusample;

import java.io.File;
import java.util.List;
import java.util.Stack;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
//		 Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);




//		super.onCreateOptionsMenu(menu);
//		MenuItem item1 = menu.add(0,0,0, "item1");
//		item1.setIcon(android.R.drawable.ic_menu_compass);
//		MenuItem item2 = menu.add(0,1,0, "item2");
//		item2.setIcon(android.R.drawable.ic_menu_compass);
//		MenuItem item3 = menu.add(0,2,0, "item3");
//		item3.setIcon(android.R.drawable.ic_menu_compass);
//		MenuItem item4 = menu.add(0,3,0, "item4");
//		item4.setIcon(android.R.drawable.ic_menu_compass);

		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {

		switch (item.getItemId()) {
//		case 0:
////			showDialog("メニューアイテム１を選択しました。");
//			return true;
//		case 1:
//			tel();
////			showDialog("メニューアイテム電話を選択しました。");
//			return true;
//		case 2:
//			email();
////			showDialog("メニューアイテムEmailを選択しました。");
//			return true;
//		case 3:
//			map();
////			showDialog("メニューアイテムマップを選択しました。");
//			return true;
//			default:
//				return super.onOptionsItemSelected(item);

		case R.id.item1:
//			showDialog("メニューアイテム１を選択しました。");
			return true;
		case R.id.item2:
			tel();
//			showDialog("メニューアイテム電話を選択しました。");
			return true;
		case R.id.item3:
			email();
//			showDialog("メニューアイテムEmailを選択しました。");
			return true;
		case R.id.item4:
			map();
//			showDialog("メニューアイテムマップを選択しました。");
			return true;
			default:
				return super.onOptionsItemSelected(item);

		}

//		return super.onOptionsItemSelected(item);
	}



	private void tel() {
		// TODO 自動生成されたメソッド・スタブ
//		Intent telIntent = new Intent(android.content.Intent.ACTION_DIAL);
//		startActivity(Intent.createChooser(telIntent, null));

		String action = "android.intent.action.DIAL";
		String contentStr = null;
		Intent intent = new Intent(action, Uri.parse(contentStr));
		startActivity(intent);
	}

	private void email() {

		Intent emailIntent = new Intent(android.content.Intent.ACTION_SENDTO);
		emailIntent.setType("plain/text");
//		startActivity(emailIntent);
//		startActivity(Intent.createChooser(emailIntent, "Send your email in:"));
		startActivity(Intent.createChooser(emailIntent, "Send your email in:"));
		    }

	private void map() {
		// TODO 自動生成されたメソッド・スタブ
//		Intent mapIntent = new Intent(android.content.Intent.ACTION_VIEW);
//		startActivity(Intent.createChooser(mapIntent, null));

		String action = "android.intent.action.VIEW";
		String contentStr = null;
		Intent intent = new Intent(action, Uri.parse(contentStr));
		startActivity(intent);
	}

	private void showDialog(String text) {
		// TODO 自動生成されたメソッド・スタブ
		AlertDialog.Builder dialog
		= new AlertDialog.Builder(MainActivity.this);
		dialog.setTitle("メニューアイテム選択結果");
		dialog.setMessage(text);
		dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {

			@Override
			public void onClick(DialogInterface dialog, int whichButton) {
				// TODO 自動生成されたメソッド・スタブ
				MainActivity.this.setResult(Activity.RESULT_OK);
			}
		});
		dialog.create();
		dialog.show();


	}



}
