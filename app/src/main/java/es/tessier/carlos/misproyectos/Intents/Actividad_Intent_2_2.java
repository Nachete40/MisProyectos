package es.tessier.carlos.misproyectos.intents;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import es.tessier.carlos.misproyectos.R;


public class Actividad_Intent_2_2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad__intent_2_2);
    }

    public void onClick(View button){
        // Guardamos el contenido del editText en un String
        EditText editText = (EditText) findViewById(R.id.editText);
        String sEditText = editText.getText().toString();

        // Creamos un intent para devolver los datos
        Intent intent = new Intent();
        intent.putExtra("edittext",sEditText);
        setResult(RESULT_OK,intent);

        finish();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_actividad__intent_2_2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
