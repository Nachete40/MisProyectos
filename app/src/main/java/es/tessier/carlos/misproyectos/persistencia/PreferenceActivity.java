package es.tessier.carlos.misproyectos.persistencia;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import es.tessier.carlos.misproyectos.R;

public class PreferenceActivity extends Activity {

    SharedPreferences appPrefs;
    EditText editText;
    final static String PREFERENCIA = "editTextPref";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preference);
        appPrefs = PreferenceManager.getDefaultSharedPreferences(this);
        editText = (EditText) findViewById(R.id.editText);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_preference, menu);
        return true;
    }

    public void onClickGuardar(View v){
        appPrefs.edit()
                .clear()
                .putString(PREFERENCIA,editText.getText().toString())
                .commit();
        editText.getText().clear();
    }

    public void onClickCargar(View v){
        String pref = appPrefs.getString(PREFERENCIA,"");
        editText.setText(pref);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent i = new Intent(this,es.tessier.carlos.misproyectos.persistencia.ActividadPreferencias.class);
            startActivity(i);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
