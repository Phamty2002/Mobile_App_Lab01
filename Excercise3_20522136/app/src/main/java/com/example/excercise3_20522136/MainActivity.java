import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button showTimeButton = findViewById(R.id.buttonShowTime);
        showTimeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayCurrentTime();
            }
        });
    }

    private void displayCurrentTime() {
        // Use SimpleDateFormat to format the current time.
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss", Locale.getDefault());
        String currentTime = sdf.format(new Date());

        // Create and show an AlertDialog with the current time.
        new AlertDialog.Builder(MainActivity.this)
                .setTitle("Current Time")
                .setMessage(currentTime)
                .setPositiveButton("OK", null)
                .show();
    }
}
