package kimxeang.sample.pathmazing.com.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

import jenny.sample.pathmazing.com.checkbox.R;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    //private CheckBox ch1, ch2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int checkboxIds[] = {R.id.chk1, R.id.chk2, R.id.chk3, R.id.chk4, R.id.chk5};
        for (int i = 0; i < checkboxIds.length; i++) {
            CheckBox checkBox = (CheckBox) findViewById(checkboxIds[i]);
            checkBox.setOnCheckedChangeListener(this);
        }

    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (isChecked)
            Toast.makeText(getApplicationContext(), buttonView.getText().toString(), Toast.LENGTH_SHORT).show();
    }
}
