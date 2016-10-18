package testat.hsr.gadgeothek.layout;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import testat.hsr.gadgeothek.R;

public class LoginFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_login, container, false);
        root.findViewById(R.id.register)
                .setOnClickListener((View.OnClickListener)getActivity());
        return root;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (!(context instanceof View.OnClickListener)) {
            throw new
                    AssertionError("Activity must implement View.OnClickListener!");
        }
    }
}
