package com.fgdsb.visabulletin.app;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class AboutFragment extends Fragment {

    TextView mLink;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View ret = inflater.inflate(R.layout.fragment_about, container, false);

        mLink = (TextView) ret.findViewById(R.id.git_repo);
        if (mLink != null) {
            mLink.setMovementMethod(LinkMovementMethod.getInstance());
            mLink.setText(Html.fromHtml(getResources().getString(R.string.git_repo)));
        }

        return ret;
    }
}