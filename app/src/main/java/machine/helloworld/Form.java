package machine.helloworld;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;



/**
 * Created by Administrator on 2016/12/24.
 */

public class Form extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent GoToMainActivity = new Intent (Form.this,MainActivity.class);
                startActivity(GoToMainActivity);
            }
        });
        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent baidu = new Intent (Intent.ACTION_VIEW);
                baidu.setData(Uri.parse("tel:10086"));
                startActivity(baidu);
            }
        });
    }
}
