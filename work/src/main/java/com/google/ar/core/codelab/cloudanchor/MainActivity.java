

package com.google.ar.core.codelab.cloudanchor;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.ar.core.codelab.cloudanchor.helpers.FullScreenHelper;


public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    FragmentManager fm = getSupportFragmentManager();
    Fragment frag = fm.findFragmentById(R.id.fragment_container);
    if (frag == null) {
      frag = new CloudAnchorFragment();
      fm.beginTransaction().add(R.id.fragment_container, frag).commit();
    }
  }

  @Override
  public void onWindowFocusChanged(boolean hasFocus) {
    super.onWindowFocusChanged(hasFocus);
    FullScreenHelper.setFullScreenOnWindowFocusChanged(this, hasFocus);
  }
}
