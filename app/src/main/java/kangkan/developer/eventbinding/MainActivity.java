package kangkan.developer.eventbinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import kangkan.developer.eventbinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding=
                DataBindingUtil.setContentView(this,R.layout.activity_main);


        binding.setAStudent(new student("kangkan",22));
        binding.setHandler(new EventHandler());
        binding.setHandler2(new EventHandler2());

    }

    public class EventHandler{
        public void handleClick(View view){
            Toast.makeText(MainActivity.this, "Clicked", Toast.LENGTH_SHORT).show();
        }
    }

    public class EventHandler2{
        public void handleClick2(String name){
            Toast.makeText(MainActivity.this, name, Toast.LENGTH_SHORT).show();
        }
    }

    public class student{
        private String name;
        private int age;


        public student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }
}
