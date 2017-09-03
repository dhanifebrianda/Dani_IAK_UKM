package methamou.iak_1_ukm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class contact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
    }

    public void pBack(View view)
    {
        Intent intent = new Intent(contact.this,MainActivity.class);
        startActivity(intent);
    }
}
