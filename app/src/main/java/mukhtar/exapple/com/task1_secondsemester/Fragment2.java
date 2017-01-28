package mukhtar.exapple.com.task1_secondsemester;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class Fragment2 extends Fragment {
    TextView tv ;
    Button b;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_list_view2, container, false);
        tv = (TextView) v.findViewById(R.id.t1);
        b = (Button) v.findViewById(R.id.change);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(MainActivity.sharedPreferences.getString("text","Nothing").toString());
            }
        });
        return v;
    }

}
