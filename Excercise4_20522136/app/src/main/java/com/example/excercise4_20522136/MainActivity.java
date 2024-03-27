import android.app.AlertDialog;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editTextInput = findViewById(R.id.editTextInput);
        editTextInput.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                    // User has pressed Done button on the keyboard
                    displayAlertDialog(editTextInput.getText().toString());
                    return true;
                }
                return false;
            }
        });
    }

    private void displayAlertDialog(String text) {
        new AlertDialog.Builder(this)
                .setTitle("Text Input")
                .setMessage(text)
                .setPositiveButton("OK", null)
                .show();
    }
}
