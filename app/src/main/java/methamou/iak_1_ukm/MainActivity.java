package methamou.iak_1_ukm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pVisimisi(View view)

    {
        Intent intent = new Intent(MainActivity.this,visiMisi.class);
        startActivity(intent);
    }

    public void pAbout(View view)
    {
        Intent intent = new Intent(MainActivity.this,about.class);
        startActivity(intent);
    }
    public void pContact(View view)
    {
        Intent intent = new Intent(MainActivity.this,contact.class);
        startActivity(intent);
    }
}
