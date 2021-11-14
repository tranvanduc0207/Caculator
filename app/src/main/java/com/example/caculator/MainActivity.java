package com.example.caculator;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText numA,numB;
    private Button cong,tru,nhan,chia;

    private void initUI(){
        numA = findViewById(R.id.numA);
        numB = findViewById(R.id.numB);
        cong = findViewById(R.id.cong);
        tru = findViewById(R.id.tru);
        nhan = findViewById(R.id.nhan);
        chia = findViewById(R.id.chia);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
    }

    public void phepCong(View v) {
        try{
            if(v.getId() == R.id.cong){
                // lấy dữ liệu từ ô input
                int number1 = Integer.parseInt(numA.getText().toString());
                int number2 = Integer.parseInt(numB.getText().toString());
                int cong= number1 + number2;
                // hiển thị bằng toast
                Toast.makeText(this,"Tổng " + number1 + " + "+number2+" = " +cong,Toast.LENGTH_LONG).show();
            }
        }catch(Exception e){
            Toast.makeText(this,"Ô input không được để trống mà?",Toast.LENGTH_SHORT).show();
        }

    }
    public void phepTru(View v){
        try{
            if(v.getId() == R.id.tru){
                int number1 = Integer.parseInt(numA.getText().toString());
                int number2 = Integer.parseInt(numB.getText().toString());
                int tru = number1 - number2;
                Toast.makeText(this,"Hiệu " + number1 + " - "+number2+" = " +tru,Toast.LENGTH_LONG).show();
            }
        }catch(Exception e){
            Toast.makeText(this,"Ô input không được để trống mà?",Toast.LENGTH_SHORT).show();
        }

    }

    public void phepNhan(View v){
        try{
            if(v.getId() == R.id.nhan){
                int number1 = Integer.parseInt(numA.getText().toString());
                int number2 = Integer.parseInt(numB.getText().toString());
                int nhan= number1 * number2;
                Toast.makeText(this,"Tích " + number1 + " * "+number2+" = " +nhan,Toast.LENGTH_LONG).show();
            }
        }catch(Exception e){
            Toast.makeText(this,"Ô input không được để trống mà?",Toast.LENGTH_SHORT).show();
        }
    }

    public void phepChia(View v){
        try{
            if(v.getId() == R.id.chia){
                float number1 = Integer.parseInt(numA.getText().toString());
                float number2 = Integer.parseInt(numB.getText().toString());
//            int chia = number1 / number2;
                if(number2 == 0){
                    Toast.makeText(this,"Số B phải khác 0 !",Toast.LENGTH_SHORT).show();
                } else {
                    float chia = number1 / number2;
                    Toast.makeText(this, "Thương " + Integer.parseInt(numA.getText().toString()) + " / "+Integer.parseInt(numB.getText().toString())+" = " +chia,Toast.LENGTH_LONG).show();
                }
            }
        }catch(Exception e){
            Toast.makeText(this,"Ô input không được để trống mà?",Toast.LENGTH_SHORT).show();
        }
    }
}