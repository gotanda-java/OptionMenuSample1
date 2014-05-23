package example.android.optionmenusample;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {

		switch (item.getItemId()) {
		case R.id.item1:
			showDialog("メニューアイテム１を選択しました。");
			return true;
		case R.id.item2:
			showDialog("メニューアイテム２を選択しました。");
			return true;
		case R.id.item3:
			showDialog("メニューアイテム３を選択しました。");
			return true;
			default:
				return super.onOptionsItemSelected(item);

		}

//		return super.onOptionsItemSelected(item);
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
