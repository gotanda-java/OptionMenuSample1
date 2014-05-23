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
			showDialog("���j���[�A�C�e���P��I�����܂����B");
			return true;
		case R.id.item2:
			showDialog("���j���[�A�C�e���Q��I�����܂����B");
			return true;
		case R.id.item3:
			showDialog("���j���[�A�C�e���R��I�����܂����B");
			return true;
			default:
				return super.onOptionsItemSelected(item);

		}

//		return super.onOptionsItemSelected(item);
	}

	private void showDialog(String text) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		AlertDialog.Builder dialog
		= new AlertDialog.Builder(MainActivity.this);
		dialog.setTitle("���j���[�A�C�e���I������");
		dialog.setMessage(text);
		dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {

			@Override
			public void onClick(DialogInterface dialog, int whichButton) {
				// TODO �����������ꂽ���\�b�h�E�X�^�u
				MainActivity.this.setResult(Activity.RESULT_OK);

			}
		});
		dialog.create();
		dialog.show();


	}



}
