package mukhtar.exapple.com.task1_secondsemester;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;



public class Fragment1 extends Fragment {

    Button b;
    EditText editText ;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_listview1, container, false);
        editText = (EditText) v.findViewById(R.id.editText);
        b = (Button) v.findViewById(R.id.add);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.sharedPreferences.edit().putString("text",editText.getText().toString()).commit();
            }
        });


        return v;
    }


}
