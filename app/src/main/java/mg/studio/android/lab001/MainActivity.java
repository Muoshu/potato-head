package mg.studio.android.lab001;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView mouth, arms, ears, eyebrows, eyes, glasses, hat, mustache, nose, shoes;
    ImageView mouth1, arms1, ears1, eyebrows1, eyes1, glasses1, hat1, mustache1, nose1, shoes1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mouth = findViewById(R.id.mouth);
        arms = findViewById(R.id.arms);
        ears = findViewById(R.id.ears);
        eyebrows = findViewById(R.id.eyebrows);
        eyes = findViewById(R.id.eyes);
        glasses = findViewById(R.id.glasses);
        hat = findViewById(R.id.hat);
        mustache = findViewById(R.id.mustache);
        nose = findViewById(R.id.nose);
        shoes = findViewById(R.id.shoes);

    }

    public void check(View view,ImageView imageView){
        if(View.VISIBLE==imageView.getVisibility())
            imageView.setVisibility(View.GONE);
        else
            imageView.setVisibility(View.VISIBLE);
    }
    @Override
    public void onConfigurationChanged(@NonNull Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if(this.getResources().getConfiguration().orientation==Configuration.ORIENTATION_LANDSCAPE){
            this.setContentView(R.layout.land);
        }
        else if(this.getResources().getConfiguration().orientation==Configuration.ORIENTATION_PORTRAIT)
            this.setContentView(R.layout.activity_main);
    }
    public void cbHat(View view) {
        check(view,hat);
    }

    public void cbMouth(View view) {
        check(view,mouth);
    }

    public void cbArms(View view) {
        check(view,arms);
    }

    public void cbEars(View view) {
        check(view,ears);
    }

    public void cbEyebrow(View view) {
        check(view,eyebrows);
    }

    public void cbEye(View view) {
        check(view,eyes);
    }

    public void cbGlasses(View view) {
        check(view,glasses);
    }

    public void cbMustache(View view) {
        check(view,mustache);
    }

    public void cbNose(View view) {
        check(view ,nose);
    }

    public void cbShoes(View view) {
        check(view,shoes);
    }

    public void cbShoes1(View view) {
        shoes1 = findViewById(R.id.shoes1);
        check(view,shoes1);
    }

    public void cbNose1(View view) {
        nose1 = findViewById(R.id.nose1);
        check(view,nose1);
    }

    public void cbMustache1(View view) {
        mustache1 = findViewById(R.id.mustache1);
        check(view,mustache1);
    }

    public void cbGlasses1(View view) {
        glasses1 = findViewById(R.id.glasses1);
        check(view,glasses1);
    }

    public void cbEye1(View view) {
        eyes1 = findViewById(R.id.eyes1);
        check(view,eyes1);
    }

    public void cbEyebrow1(View view) {
        eyebrows1 = findViewById(R.id.eyebrows1);
        check(view,eyebrows1);
    }

    public void cbHat1(View view) {
        hat1 = findViewById(R.id.hat1);
        check(view,hat1);
    }

    public void cbEars1(View view) {
        ears1 = findViewById(R.id.ears1);
        check(view,ears1);
    }

    public void cbArms1(View view) {
        arms1 = findViewById(R.id.arms1);
        check(view,arms1);
    }

    public void cbMouth1(View view) {
        mouth1 = findViewById(R.id.mouth1);
        check(view,mouth1);

    }
}
