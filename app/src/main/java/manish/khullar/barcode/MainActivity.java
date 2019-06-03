package manish.khullar.barcode;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //private static final String TAG= "Certificate Scanner";
    TextView barcodeResult;
    public String bhai_value;

    //Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        barcodeResult = findViewById(R.id.barcode_Content);
        isCameraPermissonGranted();
    }

    private void isCameraPermissonGranted() {

    }

    public void scanBarcode(View view) {
    }
}
