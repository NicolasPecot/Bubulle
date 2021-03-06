package com.bubulle.imie.bubulle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Bubulle extends Activity {

    public static final String EXTRA_MESSAGE = "message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bubulle);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.bubulle, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        return id == R.id.action_settings || super.onOptionsItemSelected(item);
    }

    // Called when the user clicks on "Validate name" button
    public void displayHello(View view) {

        TextView txtname = (TextView) findViewById(R.id.editText);
        Button button = (Button) findViewById(R.id.button_hello);

        Intent helloIntent = new Intent(Bubulle.this, HelloActivity.class); // TODO bon ?
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        helloIntent.putExtra(EXTRA_MESSAGE, message);
        startActivity(helloIntent);
    }
}
